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

options { k=6;}
@lexer::header  {
	package com.yahoo.sql4d.converter;
}
@header {
	package com.yahoo.sql4d.converter;

	import org.antlr.runtime.*;
	import java.util.ArrayList;
	import java.util.Arrays;
	import com.yahoo.sql4d.*;
	import com.yahoo.sql4d.beans.*;
	import com.yahoo.sql4d.insert.*;
	import com.yahoo.sql4d.delete.*;
	import com.yahoo.sql4d.drop.*;
	import com.yahoo.sql4d.insert.nodes.*;
	import com.yahoo.sql4d.query.*;
	import com.yahoo.sql4d.query.nodes.*;
	import com.yahoo.sql4d.query.groupby.*;
	import com.yahoo.sql4d.query.timeseries.*;
	import com.yahoo.sql4d.query.select.*;
	import com.yahoo.sql4d.query.search.*;
	import com.yahoo.sql4d.query.topn.*;
	import com.yahoo.sql4d.query.timeboundary.*;
	import com.yahoo.sql4d.query.*;
	import static com.yahoo.sql4d.utils.Utils.*;
	import static com.yahoo.sql4d.utils.DruidUtils.*;
}


program	returns [Program program]
@init { program = null; }
	: (s1=grandQuery) { program = s1; } 
	| (s2=grandInsert) { program = s2; } 
	| (s3=grandDelete) { program = s3; } 
	| (s4=grandDrop) { program = s4; } 
	;

grandDelete  returns [DeleteProgram program]
@init { program = null; }
	: (s1=deleteStmnt) { program = new DeleteProgram();program.addStmnt(s1); } 
	  WS? (OPT_SEMI_COLON? | (OPT_AMPERSAND {program.waitForCompletion = false;})?) {}
	;
	
grandDrop  returns [DropProgram program]
@init { program = null; }
	: (s1=dropStmnt) { program = new DropProgram();program.addStmnt(s1); } 
	  WS? (OPT_SEMI_COLON? | (OPT_AMPERSAND {program.waitForCompletion = false;})?) {}
	;

grandInsert  returns [InsertProgram program]
@init { program = null; }
	: (s1=insertStmnt) { program = InsertProgram.getInsertInstance();program.addStmnt(s1); } 
	| (s2=insertHStmnt) { program = InsertProgram.getInsertHadoopInstance();program.addStmnt(s2); } 
	| (s3=insertRTStmnt) { program = InsertProgram.getInsertRTInstance();program.addStmnt(s3); } 
	  WS? (OPT_SEMI_COLON? | (OPT_AMPERSAND {program.waitForCompletion = false;})?) {}
	;

deleteStmnt returns [DeleteMeta dMeta]
@init { dMeta = new DeleteMeta();      }
	:DELETE WS FROM WS (id=ID {dMeta.dataSource = $id.text; } WS)
	 WHERE WS i=intervalClause	  
	{ // We set this later after granularitySpec object is fully formed.
	  if (i!= null && !i.isEmpty()) {
	     dMeta.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
	  }
	}  
	;
	
dropStmnt returns [DropMeta dMeta]
@init { dMeta = new DropMeta();      }
	:DROP WS TABLE WS (id=ID {dMeta.dataSource = $id.text; })   
	;
	
insertStmnt returns [BasicInsertMeta iMeta]
@init { iMeta = new BasicInsertMeta();      }
	:(INSERT WS INTO WS (id=ID {iMeta.dataSource = $id.text; }) WS? LPARAN WS? selectItems[iMeta] (WS? ',' WS? selectItems[iMeta])* WS? RPARAN WS?)
	 (
	   (VALUES WS? LPARAN WS? (a=anyValue {iMeta.values.add(a);} ) (WS? ',' WS? a=anyValue {iMeta.values.add(a);})* WS? RPARAN WS?)
	     |
	   (FROM WS (paths=SINGLE_QUOTE_STRING {iMeta.dataPath = unquote($paths.text);}) WS)
	 )
	 (WHERE WS i=intervalClause WS)?
	  (BREAK WS BY WS gran=SINGLE_QUOTE_STRING { iMeta.granularitySpec = new GranularitySpec(unquote($gran.text));})? // Default granularity is all 
	{ // We set this later after granularitySpec object is fully formed.
	  if (i!= null && !i.isEmpty()) {
	     iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
	  }
	}  
	(DELIMITER WS? LPARAN WS? delim=SINGLE_QUOTE_STRING{iMeta.delimiter=unicode(unquote($delim.text));} (WS? ',' WS? listDelim=SINGLE_QUOTE_STRING {iMeta.listDelimiter=unicode(unquote($listDelim.text));})? WS? RPARAN WS?)? 
	;

insertHStmnt returns [BatchInsertMeta bMeta]
@init { bMeta = new BatchInsertMeta();      }
	:(INSERT_HADOOP WS INTO WS (id=ID {bMeta.dataSource = $id.text; }) WS? LPARAN WS? selectItems[bMeta] (WS? ',' WS? selectItems[bMeta])* WS? RPARAN WS?) 
	{
	  bMeta.rollupSpec.aggs=bMeta.aggregations;
	  List<String> dims = getDimensions(bMeta.fetchDimensions);
	  bMeta.dataSpec.dimensions=dims.subList(1, dims.size());
	  bMeta.dataSpec.columns=getColumns(bMeta.fetchDimensions, bMeta.aggregations);
	}
	 FROM WS (paths=SINGLE_QUOTE_STRING {bMeta.pathSpec.setPath(unquote($paths.text));bMeta.dataSpec.inferFormat(unquote($paths.text));}) WS
	 (WHERE WS i=intervalClause WS)?
	  (BREAK WS BY WS gran=SINGLE_QUOTE_STRING { bMeta.granularitySpec = new GranularitySpec(unquote($gran.text));})? // Default granularity is all 
	{ // We set this later after granularitySpec object is fully formed.
	  if (i!= null && !i.isEmpty()) {
	     bMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
	  }
	}  
	 (DELIMITER WS? LPARAN WS? delim=SINGLE_QUOTE_STRING{bMeta.dataSpec.delimiter=unicode(unquote($delim.text));} (WS? ',' WS? listDelim=SINGLE_QUOTE_STRING {bMeta.dataSpec.listDelimiter=unicode(unquote($listDelim.text));})? WS? RPARAN WS?)? 
	 (PARTITION WS? LPARAN WS? type=SINGLE_QUOTE_STRING WS? ',' WS? size=LONG {bMeta.partitionsSpec.type=unquote($type.text);bMeta.partitionsSpec.targetPartitionSize=Long.valueOf($size.text); } WS? RPARAN WS?)?
	 (ROLLUP WS? LPARAN WS? gran=SINGLE_QUOTE_STRING WS? ',' WS? boundary=LONG {bMeta.rollupSpec.rollupGranularity=unquote($gran.text);bMeta.rollupSpec.rowFlushBoundary=Long.valueOf($boundary.text); } WS? RPARAN WS?)?
	;

insertRTStmnt returns [RTInsertMeta iMeta]
@init { iMeta = new RTInsertMeta();      }
	:(INSERT_REALTIME WS INTO WS (id=ID {iMeta.dataSource = $id.text; }) WS? LPARAN WS? selectItems[iMeta] (WS? ',' WS? selectItems[iMeta])* WS? RPARAN WS?)
	 VALUES WS? LPARAN WS? (a=anyValue {iMeta.values.add(a);} ) (WS? ',' WS? a=anyValue {iMeta.values.add(a);})* WS? RPARAN WS?
	 (WHERE WS i=intervalClause)?
	  (WS BREAK WS BY WS gran=SINGLE_QUOTE_STRING { iMeta.granularitySpec = new GranularitySpec(unquote($gran.text));})? // Default granularity is all 
	{ // We set this later after granularitySpec object is fully formed.
	  if (i!= null && !i.isEmpty()) {
	     iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
	  }
	}  
	;
	
grandQuery returns [QueryProgram program]
@init { program = null; }
	: (s1=queryStmnt) { program = new QueryProgram();program.addStmnt(s1); } 
	  (WS j=(JOIN|LEFT_JOIN|RIGHT_JOIN) 
	     {program.addJoinType($j.text.toUpperCase());}
	   WS? LPARAN WS? (s2=queryStmnt) {program.addStmnt(s2);} WS? RPARAN WS? ON 
	   WS? LPARAN WS? (a=ID{ program.addJoinHook($a.text); }) (WS? ',' WS? a=ID{ program.addJoinHook($a.text); })*  WS? RPARAN 
          )?
	  WS? OPT_SEMI_COLON? {}
	;

queryStmnt returns [QueryMeta qMeta]
@init { qMeta = GroupByQueryMeta.promote(new QueryMeta());
	((BaseAggQueryMeta)qMeta).aggregations = new ArrayList<>();
	qMeta.intervals = new ArrayList<>();
      }
	: SELECT 
	     (
	      (// For GroupBy , Timeseries, TopN, Select.
	       WS selectItems[qMeta] (WS? ',' WS? selectItems[qMeta])*
	      )
	      |
	      (WS '*')
	     )?
	  WS FROM 
	  (// Can either select from a table
  	         (WS id=ID  { qMeta.dataSource = $id.text; })
   	             | // Or select from another query.
	         (WS LPARAN (fromQuery=queryStmnt) RPARAN {qMeta.queryDataSource = fromQuery;}) 
	  ) {
             if (((BaseAggQueryMeta)qMeta).aggregations.isEmpty()) {
	  		     qMeta = SelectQueryMeta.promote(qMeta);
	  	     }
	     }
	(
	  WS WHERE WS whereClause[qMeta] 
	  (		  
		  (WS BREAK WS BY WS gran=granularityClause {
		      qMeta.granularity = gran.a;
		      if (gran.b != null) {
		        qMeta.microIntervals.addAll(gran.b);
		      }
		    }
		  )? // Default granularity is all
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
		  	if (qMeta instanceof SelectQueryMeta) {
			    ((SelectQueryMeta)qMeta).pagingSpec.threshold = Integer.valueOf($l.text);	      	
		      	} else if (qMeta instanceof TopNQueryMeta) {
		      	    ((TopNQueryMeta)qMeta).threshold = Integer.valueOf($l.text);
		      	} else if (((PlainDimQueryMeta)qMeta).fetchDimensions.size() != 1) {
		      	    if (((GroupByQueryMeta)qMeta).limitSpec != null) {
		      	        ((GroupByQueryMeta)qMeta).limitSpec.limit = Long.valueOf($l.text);
		      	    }
		      	}
		      }    
		  )?
		    
	  	  (WS THEN WS p=postAggItem {QueryUtils.setPostAggregation(qMeta, p);})?
	  )
	  (WS WHICH WS CONTAINS {qMeta = SearchQueryMeta.promote(qMeta);} WS? LPARAN WS? (s1=SINGLE_QUOTE_STRING {((SearchQueryMeta)qMeta).type = "insensitive_contains";((SearchQueryMeta)qMeta).addValue($s1.text);}(WS? ',' WS? s2=SINGLE_QUOTE_STRING {((SearchQueryMeta)qMeta).type = "fragment";((SearchQueryMeta)qMeta).addValue($s2.text);})*) WS? RPARAN
	   WS SORT WS? LPARAN WS? (s=SINGLE_QUOTE_STRING) {((SearchQueryMeta)qMeta).setSort($s.text);} WS? RPARAN
	  )?
	  (WS HINT WS? LPARAN WS? s=SINGLE_QUOTE_STRING {qMeta = HintProcessor.process(qMeta, $s.text);} WS? RPARAN)?
	  )? 
	  {
	  	if (qMeta.intervals == null || qMeta.intervals.isEmpty()) {
	  		qMeta = TimeBoundaryQueryMeta.promote(qMeta);
	  	}
	  }
	  ;


anyValue returns [Object obj] 
	:a=SINGLE_QUOTE_STRING {obj = unquote($a.text);} | b=(LONG | FLOAT){obj = $b.text;}
	;
	
selectItems[BaseStatementMeta meta]
	:  ai=aggItem { 
	      if (meta instanceof QueryMeta) {
	        ((BaseAggQueryMeta)meta).aggregations.add(ai);
	      } else if (meta instanceof InsertMeta) {
 	        ((InsertMeta)meta).aggregations.add(ai);
	      }
	   }
	|  sd=simpleDim { 
	      if (meta instanceof QueryMeta) {
	         ((PlainDimQueryMeta)meta).fetchDimensions.put(sd.a, sd.b);
	      } else if (meta instanceof InsertMeta) {
 	         ((InsertMeta)meta).fetchDimensions.put(sd.a, sd.b);
	      }
	   }
	;
	
simpleDim returns [Pair<String, String> dims]
	: (a=ID (WS AS WS b=ID)? {
	     dims = (b != null)? new Pair<String, String>($a.text, $b.text): new Pair<String, String>($a.text, null);
	   }
	  )
	;

// After interval any filter followed must be associated through AND.
whereClause[QueryMeta qMeta]
	:intls=intervalClause {qMeta.intervals.addAll(intls);} (WS AND WS f=grandFilter {qMeta.filter = f;} )?
	;
	
// interval defined in the WHERE clause is not part of the filter(thats how druid is)
intervalClause returns [List<Interval> intervals]
@init{ intervals = new ArrayList<>();}
	: 'interval' WS BETWEEN WS 
	(
	  (
	    ((st=isoTime |  st2=SINGLE_QUOTE_STRING ) WS AND WS (et=isoTime |  et2=SINGLE_QUOTE_STRING ) ) 
		{  if (st2 != null) {
			if (et2 != null) {
				intervals.add(new Interval($st2.text, $et2.text));
			} else {
				intervals.add(new Interval($st2.text, $et.text));
			}
		   } else {
			if (et2 != null) {
				intervals.add(new Interval($st.text, $et2.text));
			} else {
				intervals.add(new Interval($st.text, $et.text));
			}
		   }
		}
	  ) 
	  |
	  (LPARAN WS? p1=pairString {intervals.add(new Interval(p1.a, p1.b));} 
	     (WS? ',' WS? p2=pairString {intervals.add(new Interval(p2.a, p2.b));})* WS? RPARAN)
	)
	;

// Assignment (OR) equals to comparator.
getEquals returns [EqualsToHolder holder]
	:	(a=ID WS? EQUALS WS?  b=(SINGLE_QUOTE_STRING | FLOAT | LONG)) {holder = new EqualsToHolder($a.text, $b.text);} 
	;
	
///////////////// granularity //////////////
// TODO: Cleanup the following rule.
granularityClause returns [Pair<Granularity, List<Pair<Integer, Integer>>> clause]
@init{Granularity granularity = new Granularity("all");clause = new Pair<>(granularity, null);}
	:((s=SINGLE_QUOTE_STRING){granularity = new Granularity($s.text);clause = new Pair<>(granularity, null);})
	      |
	 (
	   ( DURATION WS? LPARAN WS? dur=SINGLE_QUOTE_STRING {granularity.setDuration($dur.text);} WS? (',' WS? orig=SINGLE_QUOTE_STRING {granularity.setOrigin($orig.text);})? {clause = new Pair<>(granularity, null);}(WS? ',' WS? inc=granularityInclude {clause = new Pair<>(granularity, inc);} WS?)? RPARAN) 
	      |
	   ( PERIOD WS? LPARAN WS? per=SINGLE_QUOTE_STRING {granularity.setPeriod($per.text);} WS? (',' WS? tz=SINGLE_QUOTE_STRING {granularity.setTimeZone($tz.text);})? WS? (',' WS? orig=SINGLE_QUOTE_STRING {granularity.setOrigin($orig.text);})? {clause = new Pair<>(granularity, null);} (WS? ',' WS? inc=granularityInclude {clause = new Pair<>(granularity, inc);} WS?)? RPARAN) 
	 )
	;

granularityInclude returns [List<Pair<Integer, Integer>> microIntervals]
@init{microIntervals = new ArrayList<>();}
	:
	( WS INCLUDE WS? LPARAN WS? (p1=pairNums {microIntervals.add(p1);} (',' p2=pairNums{microIntervals.add(p2);})*)  WS? RPARAN )
	;
	
pairNums returns [Pair<Integer, Integer> pair]
	: (LSQUARE WS? i=LONG  WS? ',' WS? j=LONG WS? RSQUARE) { pair = new Pair<>(Integer.parseInt($i.text), Integer.parseInt($j.text));}
	;
	
pairString returns [Pair<String, String> pair]
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
		 filter.value = unquote(e.value);
		}
	;

regexFilter returns [Filter filter]
@init {filter = new Filter("regex");}
	:	(a=ID WS LIKE WS  b=(SINGLE_QUOTE_STRING)) 
		{filter.dimension = $a.text;
		 filter.pattern = unquote($b.text);
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
aggItem returns [AggItem aggItem]
@init {  aggItem = new AggItem(); }
	: aggCallSite[aggItem] (WS AS WS x=ID {aggItem.setAsName($x.text);})? ; 

aggCallSite [AggItem aggItem]
	: p=aggFunc {aggItem.setAggType(p);} (WS? LPARAN WS? ( x=ID {aggItem.setFieldName($x.text);}) (WS? ',' WS? y=ID {
	    if (aggItem.fieldNames == null || aggItem.fieldNames.isEmpty()) {
	       aggItem.fieldNames = new ArrayList<>();
	       aggItem.fieldNames.add(aggItem.fieldName);
	       aggItem.fieldName = null;
	    }
	    aggItem.fieldNames.add($y.text);
	})* WS? RPARAN) 
	| COUNT {aggItem.setAggType("count");} ('(*)') // TODO: Remove hardcode (*) (make to match multiple White spaces)
	;
	
aggFunc returns [String name]
	: LONG_SUM {$name = "longSum";}
	| DOUBLE_SUM {$name = "doubleSum";}
	| UNIQUE {$name = "unique";}
	| HYPER_UNIQUE {$name = "hyperUnique";}
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
	:d=DATE_YEAR_ONLY {$date = $d.text;}
	|d=DATE_YEAR_MONTH_ONLY {$date = $d.text;}
	|d=DATE {$date = $d.text;}
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

///////////// CRUD tokens
INSERT   	:('INSERT'|'insert');
INSERT_HADOOP	:('INSERT_HADOOP'|'insert_hadoop');
INSERT_REALTIME :('INSERT_REALTIME'|'insert_realtime');
INTO 	        :('INTO'|'into');
VALUES          :('VALUES'|'values');


MAX_WINDOW      :('MAX_WINDOW'|'max_window');

DELIMITER       :('DELIMITER'|'delimiter');
PARTITION       :('PARTITION'|'partition');
ROLLUP          :('ROLLUP'   |'rollup');

DROP            :('DROP'|'drop');
TABLE           :('TABLE'|'table');
DELETE          :('DELETE'|'delete');
KAFKA           :('KAFKA'|'kafka');


///////////// CRUD Data types
STRING		:('STRING');
ISO		:('ISO');
AUTO_ISO	:('AUTO_ISO');

///////////// Query tokens
SELECT 	:	('SELECT'|'select');

COUNT 	:	('COUNT');
LONG_SUM :	('LONG_SUM');
DOUBLE_SUM :	('DOUBLE_SUM');
UNIQUE  :	('UNIQUE');
HYPER_UNIQUE  :	('HYPER_UNIQUE');
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

OPT_AMPERSAND
	: '&';

WS 
	: (' ' | '\t' | NEWLINE)+
	;

// IF the following is not made a fragment then, any 4 digit number would become a DATE_YEAR_ONLY token(even when you want to consider as token LONG)
fragment DATE_YEAR_ONLY	
	: NUM NUM NUM NUM; 	
	
DATE_YEAR_MONTH_ONLY	
	: DATE_YEAR_ONLY '-' NUM NUM; 	

DATE 	
	: DATE_YEAR_MONTH_ONLY '-' NUM NUM; 	
	
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


fragment NEWLINE   :  ( '\r\n' // DOS
               | '\r'   // MAC
               | '\n'   // Unix
             )
          ;
    

SINGLE_QUOTE_STRING
    :  '\'' (ESC_SEQ | ~('\\'|'\'') )* '\'' 
    ;

LONG : NUM+;
FLOAT    :    NUM* '.' NUM+;

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



