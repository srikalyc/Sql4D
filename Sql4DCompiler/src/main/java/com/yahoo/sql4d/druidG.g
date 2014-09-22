/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 
 * Unless required by applicable law or agreed to in writing, software distributed
 * under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR 
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the 
 * specific language governing permissions and limitations under the License. 
 * See accompanying LICENSE file.
 */
grammar druidG;

options { k=6; }

@header {
	package com.yahoo.sql4d.converter;

	import org.antlr.runtime.*;
	import java.util.ArrayList;
	import java.util.Arrays;

	import com.yahoo.sql4d.*;
	import com.yahoo.sql4d.beans.*;
	import com.yahoo.sql4d.query.*;
	import com.yahoo.sql4d.query.nodes.*;
	import com.yahoo.sql4d.query.groupby.*;
	import com.yahoo.sql4d.query.timeseries.*;
	import com.yahoo.sql4d.query.select.*;
	import com.yahoo.sql4d.query.search.*;
	import com.yahoo.sql4d.query.topn.*;
	import com.yahoo.sql4d.query.*;
}


program	returns [Program program]
@init { program = new Program(); }
	: (s1=statement) { program.listOfQueries.add(s1); } 
	  (WS j=(JOIN|LEFT_JOIN|RIGHT_JOIN) {program.joinTypes.add($j.text.toUpperCase());} WS? LPARAN WS? (s2=statement) {program.listOfQueries.add(s2);} WS? RPARAN WS? ON WS? LPARAN WS? (a=ID{ program.primaryJoinableHooks.add($a.text); }) (WS? ',' WS? a=ID{ program.primaryJoinableHooks.add($a.text); })*  WS? RPARAN WS? ) OPT_SEMI_COLON? {}
	;
	


statement returns [QueryMeta qMeta]
@init { qMeta = GroupByQueryMeta.promote(new QueryMeta());
	((BaseAggQueryMeta)qMeta).aggregations = new ArrayList<>();
	qMeta.intervals = new ArrayList<>();
      }
	: SELECT WS
	     (
	      (// For GroupBy , Timeseries, TopN, Select.
	       selectItems[qMeta] (WS? ',' WS? selectItems[qMeta])*
	      )
	      |
	      ('*')
	     )    
	  WS FROM WS id=ID  { 
	  	qMeta.dataSource = $id.text; 
  	  	if (((BaseAggQueryMeta)qMeta).aggregations.isEmpty()) {
	  		qMeta = SelectQueryMeta.promote(qMeta);
	  	}
	    } 
	  
	  
	  WS WHERE WS whereClause[qMeta]
	  (		  
		  (WS BREAK WS BY WS granularityClause[qMeta])? // Default granularity is all
		  (WS GROUP WS BY WS 
		      {
		       qMeta = GroupByQueryMeta.promote(qMeta);
		       if (((GroupByQueryMeta)qMeta).fetchDimensions == null) {
		          System.err.println("No dimensions !! ");
		       }
		      } 
		       (id=ID 
		           {
		              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias($id.text)) {
		                 System.err.println("Dimension/Alias " + $id.text + " not valid..");
		              }   
		           }
		           (WS? ',' WS? id=ID 
		           	{
			              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias($id.text)) {
			                 System.err.println("Dimension/Alias " + $id.text + " not valid..");
			              }   
		           	}
		            )*
		       )
		       (WS HAVING WS h=havingClause
		       	   {((GroupByQueryMeta)qMeta).having = h;}
		       )?
		   )? {qMeta = QueryUtils.checkAndPromoteToTimeSeries(qMeta);}
		  (WS ORDER WS BY WS (id=ID) 
		      {	
		  	if (((PlainDimQueryMeta)qMeta).fetchDimensions.size() != 1) {
			   ((GroupByQueryMeta)qMeta).limitSpec = new LimitSpec();
			   
		  	} else {// If fetchDimensions = 1 then TopN is more optimal.
		           qMeta = TopNQueryMeta.promote(qMeta);
	        	   ((TopNQueryMeta)qMeta).metric = $id.text;
		      	}
		      }
		       
		      (WS dir=(ASC|DESC) 
		      { 
		        if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta)qMeta).limitSpec != null) {
			    if ($dir != null && $dir.text != null) {
			        ((GroupByQueryMeta)qMeta).limitSpec.addColumn($id.text, $dir.text);
			    } else {
			    	((GroupByQueryMeta)qMeta).limitSpec.addColumn($id.text, "ASC");
			    }
		      	}
		      })?
			{
			    // At this point if the qMeta is not TopN and is still GroupBy then do the following(default is ascending sort).
			    if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta)qMeta).limitSpec != null) {
			       if (!((GroupByQueryMeta)qMeta).limitSpec.columns.containsKey($id.text)) {
			       	   ((GroupByQueryMeta)qMeta).limitSpec.addColumn($id.text, "ASC");
			       }
			       
			    }

			}		      
		  )?
		  (
		   WS LIMIT WS (l=LONG)
		      {	
		  	if (((PlainDimQueryMeta)qMeta).fetchDimensions.size() != 1) {
		      	    ((GroupByQueryMeta)qMeta).limitSpec.limit = Long.valueOf($l.text);
		      	} else if (qMeta instanceof TopNQueryMeta) {
		      	    ((TopNQueryMeta)qMeta).threshold = Integer.valueOf($l.text);
		      	} else if (qMeta instanceof SelectQueryMeta) {
			    ((SelectQueryMeta)qMeta).pagingSpec.threshold = Integer.valueOf($l.text);	      	
		      	}
		      }    
		  )?
		    
	  	  (WS THEN WS p=postAggItem {QueryUtils.setPostAggregation(qMeta, p);})?
	  )
	  (WS WHICH WS CONTAINS {qMeta = SearchQueryMeta.promote(qMeta);} WS? LPARAN WS? (s1=SINGLE_QUOTE_STRING {((SearchQueryMeta)qMeta).type = "insensitive_contains";((SearchQueryMeta)qMeta).addValue($s1.text);}(WS? ',' WS? s2=SINGLE_QUOTE_STRING {((SearchQueryMeta)qMeta).type = "fragment";((SearchQueryMeta)qMeta).addValue($s2.text);})*) WS? RPARAN
	   WS SORT WS? LPARAN WS? (s=SINGLE_QUOTE_STRING) {((SearchQueryMeta)qMeta).setSort($s.text);} WS? RPARAN
	  )?
	  (WS HINT WS? LPARAN WS? s=SINGLE_QUOTE_STRING {qMeta = HintProcessor.process(qMeta, $s.text);} WS? RPARAN)?
	  ;

selectItems[QueryMeta qMeta]
	:  sI1=aggItemInSelect { ((BaseAggQueryMeta)qMeta).aggregations.add(sI1); }
	|  simpleDim[qMeta]
	;

simpleDim[QueryMeta qMeta]
	: (a=ID (WS AS WS b=ID)? {
	    if (b != null) {
   	      ((PlainDimQueryMeta)qMeta).fetchDimensions.put($a.text, $b.text);
   	    } else {
   	      ((PlainDimQueryMeta)qMeta).fetchDimensions.put($a.text, null);
   	    }
	   }
	  )
	;

// After interval any filter followed must be associated through AND.
whereClause[QueryMeta qMeta]
	:intervalClause[qMeta] (WS AND WS f=grandFilter {qMeta.filter = f;} )?
	;
	
// interval defined in the WHERE clause is not part of the filter(thats how druid is)
intervalClause[QueryMeta qMeta]
	: 'interval' WS BETWEEN WS 
	(
	  (
	    ((st=isoTime |  st2=SINGLE_QUOTE_STRING ) WS AND WS (et=isoTime |  et2=SINGLE_QUOTE_STRING ) ) 
		{  if (st2 != null) {
			if (et2 != null) {
				qMeta.intervals.add(new Interval($st2.text, $et2.text));
			} else {
				qMeta.intervals.add(new Interval($st2.text, $et.text));
			}
		   } else {
			if (et2 != null) {
				qMeta.intervals.add(new Interval($st.text, $et2.text));
			} else {
				qMeta.intervals.add(new Interval($st.text, $et.text));
			}
		   }
		}
	  )
	  |
	  (LPARAN WS? p1=pairString {qMeta.intervals.add(new Interval(p1.a, p1.b));} 
	     (WS? ',' WS? p2=pairString {qMeta.intervals.add(new Interval(p2.a, p2.b));})* WS? RPARAN)
	)
	;

// Assignment (OR) equals to comparator.
getEquals returns [EqualsToHolder holder]
	:	(a=ID WS? EQUALS WS?  b=(SINGLE_QUOTE_STRING | FLOAT | LONG)) {holder = new EqualsToHolder($a.text, $b.text);} 
	;
	
///////////////// granularity //////////////

granularityClause [QueryMeta qMeta]
@init {qMeta.granularity = new Granularity();}
	:((s=SINGLE_QUOTE_STRING){qMeta.granularity = new Granularity($s.text);})
	      |
	 (
	   ( DURATION {qMeta.granularity.type = "duration";} WS? LPARAN WS? dur=SINGLE_QUOTE_STRING {qMeta.granularity.setDuration($dur.text);} WS? (',' WS? orig=SINGLE_QUOTE_STRING {qMeta.granularity.setOrigin($orig.text);})? (WS? ',' WS? granularityInclude[qMeta] WS?)? RPARAN) 
	      |
	   ( PERIOD {qMeta.granularity.type = "period";} WS? LPARAN WS? per=SINGLE_QUOTE_STRING {qMeta.granularity.setPeriod($per.text);} WS? (',' WS? tz=SINGLE_QUOTE_STRING {qMeta.granularity.setTimeZone($tz.text);})? WS? (',' WS? orig=SINGLE_QUOTE_STRING {qMeta.granularity.setOrigin($orig.text);})? (WS? ',' WS? granularityInclude[qMeta] WS?)? RPARAN) 
	 )
	;

granularityInclude [QueryMeta qMeta]
	:
	( WS INCLUDE WS? LPARAN WS? (p1=pairNums {qMeta.microIntervals.add(p1);} (',' p2=pairNums{qMeta.microIntervals.add(p2);})*)  WS? RPARAN )
	;
	
pairNums returns [Pair<Integer> pair]
	: (LSQUARE WS? i=LONG  WS? ',' WS? j=LONG WS? RSQUARE) { pair = new Pair<>(Integer.parseInt($i.text), Integer.parseInt($j.text));}
	;
	
pairString returns [Pair<String> pair]
	: (LSQUARE WS? i=SINGLE_QUOTE_STRING  WS? ',' WS? j=SINGLE_QUOTE_STRING WS? RSQUARE) { pair = new Pair<>(($i.text).replaceAll("'", ""), ($j.text).replaceAll("'", ""));}
	;
	
/////////////////////////////////////////////////////////	  
/////////////////// Having         //////////////////	
/////////////////////////////////////////////////////////	

havingClause returns [Having having]
	: h=complexHaving {having = h;}
	;

simpleHaving  returns [Having having]
	: (a=ID WS? t=COMPARE_OPER WS? v=(LONG | FLOAT)) {having = new Having($t.text, $a.text, $v.text);}
	| (e=getEquals) {having = new Having("=", e.name, e.value);}
	| (n=NOT WS a=ID WS? t=COMPARE_OPER WS? v=(LONG | FLOAT)) {having = new Having($n.text.toLowerCase()); having.havingSpecs = Arrays.asList(new Having($t.text, $a.text, $v.text));}
	;

complexHaving  returns [Having having]
	: (s=simpleHaving ){having = s;}
	| (a=simpleHaving WS o=(AND|OR) WS b=complexHaving) 
	    {having = new Having($o.text.toLowerCase()); having.havingSpecs = Arrays.asList(a,b);}
	;
	
/////////////////////////////////////////////////////////	  
/////////////////// Logical Filters        //////////////////	
/////////////////////////////////////////////////////////	
	
selectorFilter returns [Filter filter]
@init {filter = new Filter("selector");}
	:	e=getEquals  
		{filter.dimension = e.name;
		 filter.value = e.value;
		 if (filter.value.startsWith("'") && filter.value.endsWith("'")) {
		 	filter.value = filter.value.substring(1, filter.value.length() - 1);
		 }
		}
	;

regexFilter returns [Filter filter]
@init {filter = new Filter("regex");}
	:	(a=ID WS LIKE WS  b=(SINGLE_QUOTE_STRING)) 
		{filter.dimension = $a.text;
		 filter.pattern = $b.text;
		 if (filter.pattern.startsWith("'") && filter.pattern.endsWith("'")) {
		 	filter.pattern = filter.pattern.substring(1, filter.pattern.length() - 1);
		 }
		}
	;

simpleFilter returns [Filter filter]
	:	(a=selectorFilter | a=regexFilter) {filter = a;}
	|  (LPARAN WS? (a=selectorFilter | a=regexFilter) WS? RPARAN) {filter = a;}
	;

simpleLogicalFilter returns [Filter filter]
	:((a=simpleFilter WS o=(AND|OR) WS b=simpleFilter) | (o=NOT WS b=simpleFilter) )
		{filter = new Filter($o.text.toLowerCase());
		 filter.fields = new ArrayList<>();
		 if (a != null) {
		    filter.fields.add(a);
		 }
		 filter.fields.add(b);
		}
	| (LPARAN WS? s=simpleLogicalFilter WS? RPARAN) {filter = s;}
	
	;


grandFilter returns [Filter filter]
	: (a=simpleFilter | a=simpleLogicalFilter ) {filter = a;} (WS o=(AND|OR) WS b=grandFilter 
	        {filter = new Filter($o.text.toLowerCase());
		 filter.fields = new ArrayList<>();
		 filter.fields.add(a);
		 filter.fields.add(b);
		})?
	;

/////////////////////////////////////////////////////////	  
///////////////////  Aggregation rules  //////////////////	
/////////////////////////////////////////////////////////
aggItemInSelect returns [AggItem aggItem]
@init {  aggItem = new AggItem(); }
	: aggCallSite[aggItem] (WS AS WS x=ID {aggItem.setAsName($x.text);})? ; 

aggCallSite [AggItem aggItem]
	: p=aggFunc {aggItem.setAggType(p);} (WS? LPARAN WS? ( x=ID {aggItem.setFieldName($x.text);}) WS? RPARAN) 
	| COUNT {aggItem.setAggType("count");} ('(*)') // TODO: Remove hardcode (*) (make to match multiple White spaces)
	;
	
aggFunc returns [String name]
	: LONG_SUM {$name = "longSum";}
	| DOUBLE_SUM {$name = "doubleSum";}
	| UNIQUE {$name = "hyperUnique";}
	| MIN {$name = "min";}
	| MAX {$name = "max";}
	| JAVASCRIPT {$name = "javascript";}
	;
/////////////////////////////////////////////////////////
/////////////////// Post aggregation rules  //////////////////	
/////////////////////////////////////////////////////////

postAggItem returns [PostAggItem postAggItem]
@init {  postAggItem = new PostAggItem("arithmetic"); }
	: (a=simpleArith  (WS? postAggArithOper[postAggItem] WS? b=postAggItem )? )
	   { if (b == null) {
	       postAggItem = a;
             } else {
             	postAggItem.fields = Arrays.asList(a, b);
             }
           }
	| ((LPARAN WS? a=postAggItem WS? RPARAN) (postAggLabel[postAggItem])? (WS? postAggArithOper[postAggItem] WS? b=postAggItem)?)
	  { if (b == null) {
	       postAggItem = a;
             } else {
             	postAggItem.fields = Arrays.asList(a, b);
             }
           }
	; 
		


simpleArith returns [PostAggItem postAggItem]
@init {  postAggItem = new PostAggItem("arithmetic"); }
	: (a=simplePostAggAccess {postAggItem=a;}) (WS? postAggArithOper[postAggItem] WS? b=simplePostAggAccess 
	    {
	    postAggItem = new PostAggItem("arithmetic"); 
	    if (postAggItem.fields == null) {
	       postAggItem.fields = new ArrayList<>();
	    }
            postAggItem.fields.add(a);
	    postAggItem.fields.add(b);
	   })?
	;

	
simplePostAggAccess returns [PostAggItem postAggItem]
	: c=constantAccess         {postAggItem = c;}
	| f=fieldAccess		   {postAggItem = f;}
	| h=hyperUniqueCardinality {postAggItem = h;}
	| js=postAggJavascriptDef  {postAggItem = js;}
	;
	


constantAccess returns [PostAggItem postAggItem]
@init {  postAggItem = new PostAggItem("constant"); }
	: ((a=FLOAT | a=LONG)
		{postAggItem.constantValue = Double.valueOf($a.text);} 
	   (WS postAggLabel[postAggItem])?)
	;
	
fieldAccess returns [PostAggItem postAggItem]
@init {  postAggItem = new PostAggItem("fieldAccess"); }
	: (a=ID (WS postAggLabel[postAggItem])? ) {postAggItem.fieldName = $a.text;}
	;
	
hyperUniqueCardinality returns [PostAggItem postAggItem]
@init {  postAggItem = new PostAggItem("hyperUniqueCardinality"); }
	: (UNIQUE WS? LPARAN WS? a=ID WS? RPARAN {postAggItem.fieldName = $a.text;})
	;
	


postAggJavascriptDef returns [PostAggItem postAggItem]
@init {  postAggItem = new PostAggItem("javascript"); }
	: JAVASCRIPT WS? str=SINGLE_QUOTE_STRING {postAggItem.parseToJs($str.text);}
	;
	
postAggLabel[PostAggItem postAggItem]
	:	(AS WS id=ID) {postAggItem.name = $id.text;}
	;

postAggArithOper[PostAggItem postAggItem]
	:arith=ARITH_OPER{postAggItem.fn = $arith.text;}
	;
////////////////////////////////////////////////////////
////////////// Miscellaneous rules ////////////////
////////////////////////////////////////////////////////
isoTime returns [String date]
	:d=DATE {$date = $d.text;}
	|d=DATE_HOUR {$date = $d.text;}
	|d=DATE_HOUR_MIN {$date = $d.text;}
	|d=DATE_HOUR_MIN_SEC {$date = $d.text;}
	|d=DATE_HOUR_MIN_SEC_SUB {$date = $d.text;}
	|d=DATE_HOUR_MIN_SEC_SUB_TZ {$date = $d.text;}
	|d=DATE_HOUR_MIN_SEC_SUB_UTC_TZ {$date = $d.text;}
	;
	
	
///////////// Keywords 
LPARAN	:	 '(';
RPARAN	:	 ')';
LCURLY	:	 '{';
RCURLY	:	 '}';
LSQUARE	:	 '[';
RSQUARE	:	 ']';


SELECT 	:	('SELECT'|'select');

COUNT 	:	('COUNT');
LONG_SUM :	('LONG_SUM');
DOUBLE_SUM :	('DOUBLE_SUM');
UNIQUE  :	('UNIQUE');
MIN 	:	('MIN');
MAX	:	('MAX');

DURATION:	('DURATION');
PERIOD	:	('PERIOD');
INCLUDE	:	('INCLUDE');

WHICH	:	('WHICH');
CONTAINS:	('CONTAINS');
SORT	:	('SORT');

HINT	:	('HINT');

AS 	:	('AS'|'as');
FIELD_ACCESS :	('FIELD_ACCESS'|'field_access');
FROM 	:	('FROM'|'from');
WHERE 	:	('WHERE'|'where');
BETWEEN :	('BETWEEN'|'between');
AND 	:	('AND'|'and');
OR 	:	('OR'|'or');
NOT 	:	('NOT'|'not');
GROUP	:	('GROUP' | 'group');
ASC	:	('ASC' | 'asc');
DESC	:	('DESC' | 'desc');
ORDER	:	('ORDER' | 'order');// Metric for TopN
HAVING	:	('HAVING' | 'having');// Metric for groupBy
BREAK	:	('BREAK' | 'break');// Granularity
BY	:	('BY' | 'by');

LIMIT	:	('LIMIT' | 'limit');// Threshold for TopN (OR) just row limit for every query type.
LIKE	:	('LIKE' | 'like');
THEN	:	('THEN' | 'then');// Used for post aggregations.

JAVASCRIPT 
	:	 ('JAVASCRIPT:' |'javascript:');
	
JOIN 	:	('JOIN' | 'join')
	;
	
LEFT_JOIN 	:	('LEFT_JOIN' | 'left_join')
	;

RIGHT_JOIN 	:	('RIGHT_JOIN' | 'right_join')
	;

ON 	:	('ON')
	;

/////////////  Tokens   ///////////////
OPT_SEMI_COLON
	: ';';

WS 
	: (' ' | '\t')+
	;

	
DATE 	
	: NUM NUM NUM NUM '-' NUM NUM '-' NUM NUM; 	
	
DATE_HOUR
	: DATE 'T' NUM NUM; 	
	
DATE_HOUR_MIN
	:	 DATE_HOUR ':' NUM NUM; 	
	
DATE_HOUR_MIN_SEC
	:	 DATE_HOUR_MIN ':' NUM NUM; 	
	
DATE_HOUR_MIN_SEC_SUB
	:	 DATE_HOUR_MIN_SEC '.' NUM NUM NUM; 	

DATE_HOUR_MIN_SEC_SUB_TZ
	:	 DATE_HOUR_MIN_SEC_SUB ('+'|'-') NUM NUM ':' NUM NUM; 	

DATE_HOUR_MIN_SEC_SUB_UTC_TZ
	:	 DATE_HOUR_MIN 'Z'
	| 	 DATE_HOUR_MIN_SEC 'Z'
	| 	 DATE_HOUR_MIN_SEC_SUB 'Z'
	;	

ARITH_OPER  :	('*' | '+' | '/' | '-')
    ;

EQUALS 	:	'=';

COMPARE_OPER  :	('<' | '>')
    ;


ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;


NEWLINE   :  ( '\r\n' // DOS
               | '\r'   // MAC
               | '\n'   // Unix
             )
             { 
                $channel = HIDDEN;
             }
          ;
STRING
    :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"'
    ;
    

SINGLE_QUOTE_STRING
    :  '\'' (ESC_SEQ | ~('\\'|'\'') )* '\'' 
    ;

LONG : NUM+;
FLOAT    :    LONG ('.' LONG)?;

fragment NUM : ('0'..'9') ;

fragment HEX_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F') ;

fragment ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    |   UNICODE_ESC
    |   OCTAL_ESC
    ;

fragment OCTAL_ESC
    :   '\\' ('0'..'3') ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7') ('0'..'7')
    |   '\\' ('0'..'7')
    ;

fragment UNICODE_ESC
    :   '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;



