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
// $ANTLR 3.5 /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2014-07-26 18:25:12

	package com.yahoo.sql4d.converter;

	import org.antlr.runtime.*;
	import java.util.Arrays;

	import com.yahoo.sql4d.beans.*;
	import com.yahoo.sql4d.query.*;
	import com.yahoo.sql4d.query.nodes.*;
	import com.yahoo.sql4d.query.groupby.*;
	import com.yahoo.sql4d.query.select.*;
	import com.yahoo.sql4d.query.search.*;
	import com.yahoo.sql4d.query.topn.*;


import java.util.ArrayList;

@SuppressWarnings("all")
public class druidGParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARITH_OPER", "AS", "BETWEEN", 
		"BREAK", "BY", "COMPARE_OPER", "CONTAINS", "COUNT", "DATE", "DATE_HOUR", 
		"DATE_HOUR_MIN", "DATE_HOUR_MIN_SEC", "DATE_HOUR_MIN_SEC_SUB", "DATE_HOUR_MIN_SEC_SUB_TZ", 
		"DATE_HOUR_MIN_SEC_SUB_UTC_TZ", "DOUBLE_SUM", "DURATION", "EQUALS", "ESC_SEQ", 
		"FIELD_ACCESS", "FLOAT", "FROM", "GROUP", "HAVING", "HEX_DIGIT", "HINT", 
		"ID", "INCLUDE", "JAVASCRIPT", "JOIN", "LCURLY", "LEFT_JOIN", "LIKE", 
		"LIMIT", "LONG", "LONG_SUM", "LPARAN", "LSQUARE", "MAX", "MIN", "NEWLINE", 
		"NOT", "NUM", "OCTAL_ESC", "ON", "OPT_SEMI_COLON", "OR", "ORDER", "PERIOD", 
		"RCURLY", "RIGHT_JOIN", "RPARAN", "RSQUARE", "SELECT", "SINGLE_QUOTE_STRING", 
		"SORT", "STRING", "THEN", "UNICODE_ESC", "UNIQUE", "WHERE", "WHICH", "WS", 
		"'(*)'", "'*'", "','", "'interval'"
	};
	public static final int EOF=-1;
	public static final int T__68=68;
	public static final int T__69=69;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int AND=4;
	public static final int ARITH_OPER=5;
	public static final int AS=6;
	public static final int BETWEEN=7;
	public static final int BREAK=8;
	public static final int BY=9;
	public static final int COMPARE_OPER=10;
	public static final int CONTAINS=11;
	public static final int COUNT=12;
	public static final int DATE=13;
	public static final int DATE_HOUR=14;
	public static final int DATE_HOUR_MIN=15;
	public static final int DATE_HOUR_MIN_SEC=16;
	public static final int DATE_HOUR_MIN_SEC_SUB=17;
	public static final int DATE_HOUR_MIN_SEC_SUB_TZ=18;
	public static final int DATE_HOUR_MIN_SEC_SUB_UTC_TZ=19;
	public static final int DOUBLE_SUM=20;
	public static final int DURATION=21;
	public static final int EQUALS=22;
	public static final int ESC_SEQ=23;
	public static final int FIELD_ACCESS=24;
	public static final int FLOAT=25;
	public static final int FROM=26;
	public static final int GROUP=27;
	public static final int HAVING=28;
	public static final int HEX_DIGIT=29;
	public static final int HINT=30;
	public static final int ID=31;
	public static final int INCLUDE=32;
	public static final int JAVASCRIPT=33;
	public static final int JOIN=34;
	public static final int LCURLY=35;
	public static final int LEFT_JOIN=36;
	public static final int LIKE=37;
	public static final int LIMIT=38;
	public static final int LONG=39;
	public static final int LONG_SUM=40;
	public static final int LPARAN=41;
	public static final int LSQUARE=42;
	public static final int MAX=43;
	public static final int MIN=44;
	public static final int NEWLINE=45;
	public static final int NOT=46;
	public static final int NUM=47;
	public static final int OCTAL_ESC=48;
	public static final int ON=49;
	public static final int OPT_SEMI_COLON=50;
	public static final int OR=51;
	public static final int ORDER=52;
	public static final int PERIOD=53;
	public static final int RCURLY=54;
	public static final int RIGHT_JOIN=55;
	public static final int RPARAN=56;
	public static final int RSQUARE=57;
	public static final int SELECT=58;
	public static final int SINGLE_QUOTE_STRING=59;
	public static final int SORT=60;
	public static final int STRING=61;
	public static final int THEN=62;
	public static final int UNICODE_ESC=63;
	public static final int UNIQUE=64;
	public static final int WHERE=65;
	public static final int WHICH=66;
	public static final int WS=67;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public druidGParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public druidGParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return druidGParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g"; }



	// $ANTLR start "program"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:34:1: program returns [Program program] : (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? ) ( OPT_SEMI_COLON )? ;
	public final Program program() throws RecognitionException {
		Program program = null;


		Token j=null;
		Token a=null;
		QueryMeta s1 =null;
		QueryMeta s2 =null;

		 program = new Program(); 
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:36:2: ( (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? ) ( OPT_SEMI_COLON )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:36:4: (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? ) ( OPT_SEMI_COLON )?
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:36:4: (s1= statement )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:36:5: s1= statement
			{
			pushFollow(FOLLOW_statement_in_program42);
			s1=statement();
			state._fsp--;

			}

			 program.listOfQueries.add(s1); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:4: ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:5: WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )?
			{
			match(input,WS,FOLLOW_WS_in_program52); 
			j=input.LT(1);
			if ( input.LA(1)==JOIN||input.LA(1)==LEFT_JOIN||input.LA(1)==RIGHT_JOIN ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			program.joinTypes.add((j!=null?j.getText():null).toUpperCase());
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:86: ( WS )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==WS) ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:86: WS
					{
					match(input,WS,FOLLOW_WS_in_program66); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_program69); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:97: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:97: WS
					{
					match(input,WS,FOLLOW_WS_in_program71); 
					}
					break;

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:101: (s2= statement )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:102: s2= statement
			{
			pushFollow(FOLLOW_statement_in_program77);
			s2=statement();
			state._fsp--;

			}

			program.listOfQueries.add(s2);
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:149: ( WS )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==WS) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:149: WS
					{
					match(input,WS,FOLLOW_WS_in_program82); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_program85); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:160: ( WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==WS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:160: WS
					{
					match(input,WS,FOLLOW_WS_in_program87); 
					}
					break;

			}

			match(input,ON,FOLLOW_ON_in_program90); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:167: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==WS) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:167: WS
					{
					match(input,WS,FOLLOW_WS_in_program92); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_program95); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:178: ( WS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==WS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:178: WS
					{
					match(input,WS,FOLLOW_WS_in_program97); 
					}
					break;

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:182: (a= ID )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:183: a= ID
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_program103); 
			 program.primaryJoinableHooks.add((a!=null?a.getText():null)); 
			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:235: ( ( WS )? ',' ( WS )? a= ID )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==WS) ) {
					int LA9_1 = input.LA(2);
					if ( (LA9_1==70) ) {
						alt9=1;
					}

				}
				else if ( (LA9_0==70) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:236: ( WS )? ',' ( WS )? a= ID
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:236: ( WS )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==WS) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:236: WS
							{
							match(input,WS,FOLLOW_WS_in_program108); 
							}
							break;

					}

					match(input,70,FOLLOW_70_in_program111); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:244: ( WS )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==WS) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:244: WS
							{
							match(input,WS,FOLLOW_WS_in_program113); 
							}
							break;

					}

					a=(Token)match(input,ID,FOLLOW_ID_in_program118); 
					 program.primaryJoinableHooks.add((a!=null?a.getText():null)); 
					}
					break;

				default :
					break loop9;
				}
			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:302: ( WS )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==WS) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:302: WS
					{
					match(input,WS,FOLLOW_WS_in_program124); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_program127); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:313: ( WS )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==WS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:313: WS
					{
					match(input,WS,FOLLOW_WS_in_program129); 
					}
					break;

			}

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:319: ( OPT_SEMI_COLON )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==OPT_SEMI_COLON) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:319: OPT_SEMI_COLON
					{
					match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_program134); 
					}
					break;

			}


			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return program;
	}
	// $ANTLR end "program"



	// $ANTLR start "statement"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:1: statement returns [QueryMeta qMeta] : SELECT WS ( ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( '*' ) ) WS FROM WS id= ID WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? ;
	public final QueryMeta statement() throws RecognitionException {
		QueryMeta qMeta = null;


		Token id=null;
		Token l=null;
		Token s1=null;
		Token s2=null;
		Token s=null;
		Having h =null;
		PostAggItem p =null;

		 qMeta = GroupByQueryMeta.promote(new QueryMeta());
			((BaseAggQueryMeta)qMeta).aggregations = new ArrayList<>();
			qMeta.intervals = new ArrayList<>();
		      
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:47:2: ( SELECT WS ( ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( '*' ) ) WS FROM WS id= ID WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:47:4: SELECT WS ( ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( '*' ) ) WS FROM WS id= ID WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_statement160); 
			match(input,WS,FOLLOW_WS_in_statement162); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:7: ( ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( '*' ) )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==COUNT||LA16_0==DOUBLE_SUM||LA16_0==ID||LA16_0==JAVASCRIPT||LA16_0==LONG_SUM||(LA16_0 >= MAX && LA16_0 <= MIN)||LA16_0==UNIQUE) ) {
				alt16=1;
			}
			else if ( (LA16_0==69) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:8: ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:8: ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:9: selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					{
					pushFollow(FOLLOW_selectItems_in_statement189);
					selectItems(qMeta);
					state._fsp--;

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:28: ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					loop15:
					while (true) {
						int alt15=2;
						int LA15_0 = input.LA(1);
						if ( (LA15_0==WS) ) {
							int LA15_1 = input.LA(2);
							if ( (LA15_1==70) ) {
								alt15=1;
							}

						}
						else if ( (LA15_0==70) ) {
							alt15=1;
						}

						switch (alt15) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:29: ( WS )? ',' ( WS )? selectItems[qMeta]
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:29: ( WS )?
							int alt13=2;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==WS) ) {
								alt13=1;
							}
							switch (alt13) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:29: WS
									{
									match(input,WS,FOLLOW_WS_in_statement193); 
									}
									break;

							}

							match(input,70,FOLLOW_70_in_statement196); 
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:37: ( WS )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==WS) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:37: WS
									{
									match(input,WS,FOLLOW_WS_in_statement198); 
									}
									break;

							}

							pushFollow(FOLLOW_selectItems_in_statement201);
							selectItems(qMeta);
							state._fsp--;

							}
							break;

						default :
							break loop15;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:53:8: ( '*' )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:53:8: ( '*' )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:53:9: '*'
					{
					match(input,69,FOLLOW_69_in_statement232); 
					}

					}
					break;

			}

			match(input,WS,FOLLOW_WS_in_statement250); 
			match(input,FROM,FOLLOW_FROM_in_statement252); 
			match(input,WS,FOLLOW_WS_in_statement254); 
			id=(Token)match(input,ID,FOLLOW_ID_in_statement258); 
			 
				  	qMeta.dataSource = (id!=null?id.getText():null); 
			  	  	if (((BaseAggQueryMeta)qMeta).aggregations.isEmpty()) {
				  		qMeta = SelectQueryMeta.promote(qMeta);
				  	}
				    
			match(input,WS,FOLLOW_WS_in_statement275); 
			match(input,WHERE,FOLLOW_WHERE_in_statement277); 
			match(input,WS,FOLLOW_WS_in_statement279); 
			pushFollow(FOLLOW_whereClause_in_statement281);
			whereClause(qMeta);
			state._fsp--;

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:4: ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:5: ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )?
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:5: ( WS BREAK WS BY WS granularityClause[qMeta] )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==WS) ) {
				int LA17_1 = input.LA(2);
				if ( (LA17_1==BREAK) ) {
					alt17=1;
				}
			}
			switch (alt17) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:6: WS BREAK WS BY WS granularityClause[qMeta]
					{
					match(input,WS,FOLLOW_WS_in_statement298); 
					match(input,BREAK,FOLLOW_BREAK_in_statement300); 
					match(input,WS,FOLLOW_WS_in_statement302); 
					match(input,BY,FOLLOW_BY_in_statement304); 
					match(input,WS,FOLLOW_WS_in_statement306); 
					pushFollow(FOLLOW_granularityClause_in_statement308);
					granularityClause(qMeta);
					state._fsp--;

					}
					break;

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:66:5: ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )?
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==WS) ) {
				int LA22_1 = input.LA(2);
				if ( (LA22_1==GROUP) ) {
					alt22=1;
				}
			}
			switch (alt22) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:66:6: WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )?
					{
					match(input,WS,FOLLOW_WS_in_statement319); 
					match(input,GROUP,FOLLOW_GROUP_in_statement321); 
					match(input,WS,FOLLOW_WS_in_statement323); 
					match(input,BY,FOLLOW_BY_in_statement325); 
					match(input,WS,FOLLOW_WS_in_statement327); 

							       qMeta = GroupByQueryMeta.promote(qMeta);
							       if (((GroupByQueryMeta)qMeta).fetchDimensions == null) {
							          System.err.println("No dimensions !! ");
							       }
							      
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:10: (id= ID ( ( WS )? ',' ( WS )? id= ID )* )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:11: id= ID ( ( WS )? ',' ( WS )? id= ID )*
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_statement353); 

							              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
							                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
							              }   
							           
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:79:14: ( ( WS )? ',' ( WS )? id= ID )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==WS) ) {
							int LA20_1 = input.LA(2);
							if ( (LA20_1==70) ) {
								alt20=1;
							}

						}
						else if ( (LA20_0==70) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:79:15: ( WS )? ',' ( WS )? id= ID
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:79:15: ( WS )?
							int alt18=2;
							int LA18_0 = input.LA(1);
							if ( (LA18_0==WS) ) {
								alt18=1;
							}
							switch (alt18) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:79:15: WS
									{
									match(input,WS,FOLLOW_WS_in_statement385); 
									}
									break;

							}

							match(input,70,FOLLOW_70_in_statement388); 
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:79:23: ( WS )?
							int alt19=2;
							int LA19_0 = input.LA(1);
							if ( (LA19_0==WS) ) {
								alt19=1;
							}
							switch (alt19) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:79:23: WS
									{
									match(input,WS,FOLLOW_WS_in_statement390); 
									}
									break;

							}

							id=(Token)match(input,ID,FOLLOW_ID_in_statement395); 

										              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
										                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
										              }   
									           	
							}
							break;

						default :
							break loop20;
						}
					}

					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:10: ( WS HAVING WS h= havingClause )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==WS) ) {
						int LA21_1 = input.LA(2);
						if ( (LA21_1==HAVING) ) {
							alt21=1;
						}
					}
					switch (alt21) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:11: WS HAVING WS h= havingClause
							{
							match(input,WS,FOLLOW_WS_in_statement452); 
							match(input,HAVING,FOLLOW_HAVING_in_statement454); 
							match(input,WS,FOLLOW_WS_in_statement456); 
							pushFollow(FOLLOW_havingClause_in_statement460);
							h=havingClause();
							state._fsp--;

							((GroupByQueryMeta)qMeta).having = h;
							}
							break;

					}

					}
					break;

			}

			qMeta = QueryUtils.checkAndPromoteToTimeSeries(qMeta);
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:5: ( WS ORDER WS BY WS (id= ID ) )?
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0==WS) ) {
				int LA23_1 = input.LA(2);
				if ( (LA23_1==ORDER) ) {
					alt23=1;
				}
			}
			switch (alt23) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:6: WS ORDER WS BY WS (id= ID )
					{
					match(input,WS,FOLLOW_WS_in_statement504); 
					match(input,ORDER,FOLLOW_ORDER_in_statement506); 
					match(input,WS,FOLLOW_WS_in_statement508); 
					match(input,BY,FOLLOW_BY_in_statement510); 
					match(input,WS,FOLLOW_WS_in_statement512); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:24: (id= ID )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:25: id= ID
					{
					id=(Token)match(input,ID,FOLLOW_ID_in_statement517); 
					}

						qMeta = TopNQueryMeta.promote(qMeta);
							      	((TopNQueryMeta)qMeta).metric = (id!=null?id.getText():null);
							      
					}
					break;

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:96:5: ( WS LIMIT WS (l= LONG ) )?
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==WS) ) {
				int LA24_1 = input.LA(2);
				if ( (LA24_1==LIMIT) ) {
					alt24=1;
				}
			}
			switch (alt24) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:96:6: WS LIMIT WS (l= LONG )
					{
					match(input,WS,FOLLOW_WS_in_statement544); 
					match(input,LIMIT,FOLLOW_LIMIT_in_statement546); 
					match(input,WS,FOLLOW_WS_in_statement548); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:96:18: (l= LONG )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:96:19: l= LONG
					{
					l=(Token)match(input,LONG,FOLLOW_LONG_in_statement553); 
					}

						
							      	if (qMeta instanceof TopNQueryMeta) {
							      		((TopNQueryMeta)qMeta).threshold = Integer.valueOf((l!=null?l.getText():null));
							      	} else if (qMeta instanceof SelectQueryMeta) {
									((SelectQueryMeta)qMeta).pagingSpec.threshold = Integer.valueOf((l!=null?l.getText():null));	      	
							      	}
							      
					}
					break;

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:7: ( WS THEN WS p= postAggItem )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==WS) ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1==THEN) ) {
					alt25=1;
				}
			}
			switch (alt25) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:107:8: WS THEN WS p= postAggItem
					{
					match(input,WS,FOLLOW_WS_in_statement593); 
					match(input,THEN,FOLLOW_THEN_in_statement595); 
					match(input,WS,FOLLOW_WS_in_statement597); 
					pushFollow(FOLLOW_postAggItem_in_statement601);
					p=postAggItem();
					state._fsp--;

					QueryUtils.setPostAggregation(qMeta, p);
					}
					break;

			}

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:4: ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==WS) ) {
				int LA35_1 = input.LA(2);
				if ( (LA35_1==WHICH) ) {
					alt35=1;
				}
			}
			switch (alt35) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:5: WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN
					{
					match(input,WS,FOLLOW_WS_in_statement616); 
					match(input,WHICH,FOLLOW_WHICH_in_statement618); 
					match(input,WS,FOLLOW_WS_in_statement620); 
					match(input,CONTAINS,FOLLOW_CONTAINS_in_statement622); 
					qMeta = SearchQueryMeta.promote(qMeta);
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:68: ( WS )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==WS) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:68: WS
							{
							match(input,WS,FOLLOW_WS_in_statement626); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_statement629); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:79: ( WS )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==WS) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:79: WS
							{
							match(input,WS,FOLLOW_WS_in_statement631); 
							}
							break;

					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:83: (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:84: s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
					{
					s1=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_statement637); 
					((SearchQueryMeta)qMeta).type = "insensitive_contains";((SearchQueryMeta)qMeta).addValue((s1!=null?s1.getText():null));
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:208: ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==WS) ) {
							int LA30_1 = input.LA(2);
							if ( (LA30_1==70) ) {
								alt30=1;
							}

						}
						else if ( (LA30_0==70) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:209: ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:209: ( WS )?
							int alt28=2;
							int LA28_0 = input.LA(1);
							if ( (LA28_0==WS) ) {
								alt28=1;
							}
							switch (alt28) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:209: WS
									{
									match(input,WS,FOLLOW_WS_in_statement641); 
									}
									break;

							}

							match(input,70,FOLLOW_70_in_statement644); 
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:217: ( WS )?
							int alt29=2;
							int LA29_0 = input.LA(1);
							if ( (LA29_0==WS) ) {
								alt29=1;
							}
							switch (alt29) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:217: WS
									{
									match(input,WS,FOLLOW_WS_in_statement646); 
									}
									break;

							}

							s2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_statement651); 
							((SearchQueryMeta)qMeta).type = "fragment";((SearchQueryMeta)qMeta).addValue((s2!=null?s2.getText():null));
							}
							break;

						default :
							break loop30;
						}
					}

					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:337: ( WS )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==WS) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:337: WS
							{
							match(input,WS,FOLLOW_WS_in_statement658); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_statement661); 
					match(input,WS,FOLLOW_WS_in_statement667); 
					match(input,SORT,FOLLOW_SORT_in_statement669); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:13: ( WS )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==WS) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:13: WS
							{
							match(input,WS,FOLLOW_WS_in_statement671); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_statement674); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:24: ( WS )?
					int alt33=2;
					int LA33_0 = input.LA(1);
					if ( (LA33_0==WS) ) {
						alt33=1;
					}
					switch (alt33) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:24: WS
							{
							match(input,WS,FOLLOW_WS_in_statement676); 
							}
							break;

					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:28: (s= SINGLE_QUOTE_STRING )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:29: s= SINGLE_QUOTE_STRING
					{
					s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_statement682); 
					}

					((SearchQueryMeta)qMeta).setSort((s!=null?s.getText():null));
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:97: ( WS )?
					int alt34=2;
					int LA34_0 = input.LA(1);
					if ( (LA34_0==WS) ) {
						alt34=1;
					}
					switch (alt34) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:97: WS
							{
							match(input,WS,FOLLOW_WS_in_statement687); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_statement690); 
					}
					break;

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:112:4: ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==WS) ) {
				int LA39_1 = input.LA(2);
				if ( (LA39_1==HINT) ) {
					alt39=1;
				}
			}
			switch (alt39) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:112:5: WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN
					{
					match(input,WS,FOLLOW_WS_in_statement702); 
					match(input,HINT,FOLLOW_HINT_in_statement704); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:112:13: ( WS )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==WS) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:112:13: WS
							{
							match(input,WS,FOLLOW_WS_in_statement706); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_statement709); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:112:24: ( WS )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==WS) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:112:24: WS
							{
							match(input,WS,FOLLOW_WS_in_statement711); 
							}
							break;

					}

					s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_statement716); 
					qMeta = HintProcessor.process(qMeta, (s!=null?s.getText():null));
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:112:99: ( WS )?
					int alt38=2;
					int LA38_0 = input.LA(1);
					if ( (LA38_0==WS) ) {
						alt38=1;
					}
					switch (alt38) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:112:99: WS
							{
							match(input,WS,FOLLOW_WS_in_statement720); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_statement723); 
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return qMeta;
	}
	// $ANTLR end "statement"



	// $ANTLR start "selectItems"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:115:1: selectItems[QueryMeta qMeta] : (sI1= aggItemInSelect | simpleDim[qMeta] );
	public final void selectItems(QueryMeta qMeta) throws RecognitionException {
		AggItem sI1 =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:2: (sI1= aggItemInSelect | simpleDim[qMeta] )
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==COUNT||LA40_0==DOUBLE_SUM||LA40_0==JAVASCRIPT||LA40_0==LONG_SUM||(LA40_0 >= MAX && LA40_0 <= MIN)||LA40_0==UNIQUE) ) {
				alt40=1;
			}
			else if ( (LA40_0==ID) ) {
				alt40=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:116:5: sI1= aggItemInSelect
					{
					pushFollow(FOLLOW_aggItemInSelect_in_selectItems742);
					sI1=aggItemInSelect();
					state._fsp--;

					 ((BaseAggQueryMeta)qMeta).aggregations.add(sI1); 
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:5: simpleDim[qMeta]
					{
					pushFollow(FOLLOW_simpleDim_in_selectItems750);
					simpleDim(qMeta);
					state._fsp--;

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "selectItems"



	// $ANTLR start "simpleDim"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:120:1: simpleDim[QueryMeta qMeta] : (a= ID ( WS AS WS b= ID )? ) ;
	public final void simpleDim(QueryMeta qMeta) throws RecognitionException {
		Token a=null;
		Token b=null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:121:2: ( (a= ID ( WS AS WS b= ID )? ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:121:4: (a= ID ( WS AS WS b= ID )? )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:121:4: (a= ID ( WS AS WS b= ID )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:121:5: a= ID ( WS AS WS b= ID )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_simpleDim766); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:121:10: ( WS AS WS b= ID )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==WS) ) {
				int LA41_1 = input.LA(2);
				if ( (LA41_1==AS) ) {
					alt41=1;
				}
			}
			switch (alt41) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:121:11: WS AS WS b= ID
					{
					match(input,WS,FOLLOW_WS_in_simpleDim769); 
					match(input,AS,FOLLOW_AS_in_simpleDim771); 
					match(input,WS,FOLLOW_WS_in_simpleDim773); 
					b=(Token)match(input,ID,FOLLOW_ID_in_simpleDim777); 
					}
					break;

			}


				    if (b != null) {
			   	      ((PlainDimQueryMeta)qMeta).fetchDimensions.put((a!=null?a.getText():null), (b!=null?b.getText():null));
			   	    } else {
			   	      ((PlainDimQueryMeta)qMeta).fetchDimensions.put((a!=null?a.getText():null), null);
			   	    }
				   
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "simpleDim"



	// $ANTLR start "whereClause"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:132:1: whereClause[QueryMeta qMeta] : intervalClause[qMeta] ( WS AND WS f= grandFilter )? ;
	public final void whereClause(QueryMeta qMeta) throws RecognitionException {
		Filter f =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:133:2: ( intervalClause[qMeta] ( WS AND WS f= grandFilter )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:133:3: intervalClause[qMeta] ( WS AND WS f= grandFilter )?
			{
			pushFollow(FOLLOW_intervalClause_in_whereClause798);
			intervalClause(qMeta);
			state._fsp--;

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:133:25: ( WS AND WS f= grandFilter )?
			int alt42=2;
			int LA42_0 = input.LA(1);
			if ( (LA42_0==WS) ) {
				int LA42_1 = input.LA(2);
				if ( (LA42_1==AND) ) {
					alt42=1;
				}
			}
			switch (alt42) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:133:26: WS AND WS f= grandFilter
					{
					match(input,WS,FOLLOW_WS_in_whereClause802); 
					match(input,AND,FOLLOW_AND_in_whereClause804); 
					match(input,WS,FOLLOW_WS_in_whereClause806); 
					pushFollow(FOLLOW_grandFilter_in_whereClause810);
					f=grandFilter();
					state._fsp--;

					qMeta.filter = f;
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "whereClause"



	// $ANTLR start "intervalClause"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:137:1: intervalClause[QueryMeta qMeta] : 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) ;
	public final void intervalClause(QueryMeta qMeta) throws RecognitionException {
		Token st2=null;
		Token et2=null;
		ParserRuleReturnScope st =null;
		ParserRuleReturnScope et =null;
		Pair<String> p1 =null;
		Pair<String> p2 =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:138:2: ( 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:138:4: 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			{
			match(input,71,FOLLOW_71_in_intervalClause829); 
			match(input,WS,FOLLOW_WS_in_intervalClause831); 
			match(input,BETWEEN,FOLLOW_BETWEEN_in_intervalClause833); 
			match(input,WS,FOLLOW_WS_in_intervalClause835); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:2: ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( ((LA50_0 >= DATE_HOUR && LA50_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ)||LA50_0==SINGLE_QUOTE_STRING) ) {
				alt50=1;
			}
			else if ( (LA50_0==LPARAN) ) {
				alt50=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 50, 0, input);
				throw nvae;
			}

			switch (alt50) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:7: (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:7: (st= isoTime |st2= SINGLE_QUOTE_STRING )
					int alt43=2;
					int LA43_0 = input.LA(1);
					if ( ((LA43_0 >= DATE_HOUR && LA43_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ)) ) {
						alt43=1;
					}
					else if ( (LA43_0==SINGLE_QUOTE_STRING) ) {
						alt43=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 43, 0, input);
						throw nvae;
					}

					switch (alt43) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:8: st= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause855);
							st=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:22: st2= SINGLE_QUOTE_STRING
							{
							st2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause862); 
							}
							break;

					}

					match(input,WS,FOLLOW_WS_in_intervalClause866); 
					match(input,AND,FOLLOW_AND_in_intervalClause868); 
					match(input,WS,FOLLOW_WS_in_intervalClause870); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:58: (et= isoTime |et2= SINGLE_QUOTE_STRING )
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( ((LA44_0 >= DATE_HOUR && LA44_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ)) ) {
						alt44=1;
					}
					else if ( (LA44_0==SINGLE_QUOTE_STRING) ) {
						alt44=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 44, 0, input);
						throw nvae;
					}

					switch (alt44) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:59: et= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause875);
							et=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:73: et2= SINGLE_QUOTE_STRING
							{
							et2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause882); 
							}
							break;

					}

					}

					  if (st2 != null) {
								if (et2 != null) {
									qMeta.intervals.add(new Interval((st2!=null?st2.getText():null), (et2!=null?et2.getText():null)));
								} else {
									qMeta.intervals.add(new Interval((st2!=null?st2.getText():null), (et!=null?input.toString(et.start,et.stop):null)));
								}
							   } else {
								if (et2 != null) {
									qMeta.intervals.add(new Interval((st!=null?input.toString(st.start,st.stop):null), (et2!=null?et2.getText():null)));
								} else {
									qMeta.intervals.add(new Interval((st!=null?input.toString(st.start,st.stop):null), (et!=null?input.toString(et.start,et.stop):null)));
								}
							   }
							
					}

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:5: LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_intervalClause907); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:12: ( WS )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==WS) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:12: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause909); 
							}
							break;

					}

					pushFollow(FOLLOW_pairString_in_intervalClause914);
					p1=pairString();
					state._fsp--;

					qMeta.intervals.add(new Interval(p1.a, p1.b));
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:7: ( ( WS )? ',' ( WS )? p2= pairString )*
					loop48:
					while (true) {
						int alt48=2;
						int LA48_0 = input.LA(1);
						if ( (LA48_0==WS) ) {
							int LA48_1 = input.LA(2);
							if ( (LA48_1==70) ) {
								alt48=1;
							}

						}
						else if ( (LA48_0==70) ) {
							alt48=1;
						}

						switch (alt48) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:8: ( WS )? ',' ( WS )? p2= pairString
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:8: ( WS )?
							int alt46=2;
							int LA46_0 = input.LA(1);
							if ( (LA46_0==WS) ) {
								alt46=1;
							}
							switch (alt46) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:8: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause926); 
									}
									break;

							}

							match(input,70,FOLLOW_70_in_intervalClause929); 
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:16: ( WS )?
							int alt47=2;
							int LA47_0 = input.LA(1);
							if ( (LA47_0==WS) ) {
								alt47=1;
							}
							switch (alt47) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:16: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause931); 
									}
									break;

							}

							pushFollow(FOLLOW_pairString_in_intervalClause936);
							p2=pairString();
							state._fsp--;

							qMeta.intervals.add(new Interval(p2.a, p2.b));
							}
							break;

						default :
							break loop48;
						}
					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:85: ( WS )?
					int alt49=2;
					int LA49_0 = input.LA(1);
					if ( (LA49_0==WS) ) {
						alt49=1;
					}
					switch (alt49) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:85: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause942); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_intervalClause945); 
					}

					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "intervalClause"



	// $ANTLR start "getEquals"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:164:1: getEquals returns [EqualsToHolder holder] : (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) ;
	public final EqualsToHolder getEquals() throws RecognitionException {
		EqualsToHolder holder = null;


		Token a=null;
		Token b=null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:165:2: ( (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:165:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:165:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:165:5: a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_getEquals968); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:165:10: ( WS )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==WS) ) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:165:10: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals970); 
					}
					break;

			}

			match(input,EQUALS,FOLLOW_EQUALS_in_getEquals973); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:165:21: ( WS )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==WS) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:165:21: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals975); 
					}
					break;

			}

			b=input.LT(1);
			if ( input.LA(1)==FLOAT||input.LA(1)==LONG||input.LA(1)==SINGLE_QUOTE_STRING ) {
				input.consume();
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			holder = new EqualsToHolder((a!=null?a.getText():null), (b!=null?b.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return holder;
	}
	// $ANTLR end "getEquals"



	// $ANTLR start "granularityClause"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:170:1: granularityClause[QueryMeta qMeta] : ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) ) );
	public final void granularityClause(QueryMeta qMeta) throws RecognitionException {
		Token s=null;
		Token dur=null;
		Token orig=null;
		Token per=null;
		Token tz=null;

		qMeta.granularity = new Granularity();
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:172:2: ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) ) )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==SINGLE_QUOTE_STRING) ) {
				alt75=1;
			}
			else if ( (LA75_0==DURATION||LA75_0==PERIOD) ) {
				alt75=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:172:3: ( (s= SINGLE_QUOTE_STRING ) )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:172:3: ( (s= SINGLE_QUOTE_STRING ) )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:172:4: (s= SINGLE_QUOTE_STRING )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:172:4: (s= SINGLE_QUOTE_STRING )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:172:5: s= SINGLE_QUOTE_STRING
					{
					s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1019); 
					}

					qMeta.granularity = new Granularity((s!=null?s.getText():null));
					}

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:174:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:174:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) )
					int alt74=2;
					int LA74_0 = input.LA(1);
					if ( (LA74_0==DURATION) ) {
						alt74=1;
					}
					else if ( (LA74_0==PERIOD) ) {
						alt74=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 74, 0, input);
						throw nvae;
					}

					switch (alt74) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:7: DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN
							{
							match(input,DURATION,FOLLOW_DURATION_in_granularityClause1043); 
							qMeta.granularity.type = "duration";
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:55: ( WS )?
							int alt53=2;
							int LA53_0 = input.LA(1);
							if ( (LA53_0==WS) ) {
								alt53=1;
							}
							switch (alt53) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:55: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1047); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause1050); 
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:66: ( WS )?
							int alt54=2;
							int LA54_0 = input.LA(1);
							if ( (LA54_0==WS) ) {
								alt54=1;
							}
							switch (alt54) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:66: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1052); 
									}
									break;

							}

							dur=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1057); 
							qMeta.granularity.setDuration((dur!=null?dur.getText():null));
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:138: ( WS )?
							int alt55=2;
							int LA55_0 = input.LA(1);
							if ( (LA55_0==WS) ) {
								alt55=1;
							}
							switch (alt55) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:138: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1061); 
									}
									break;

							}

							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:142: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt57=2;
							int LA57_0 = input.LA(1);
							if ( (LA57_0==70) ) {
								int LA57_1 = input.LA(2);
								if ( (LA57_1==WS) ) {
									int LA57_4 = input.LA(3);
									if ( (LA57_4==SINGLE_QUOTE_STRING) ) {
										alt57=1;
									}
								}
								else if ( (LA57_1==SINGLE_QUOTE_STRING) ) {
									alt57=1;
								}
							}
							switch (alt57) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:143: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,70,FOLLOW_70_in_granularityClause1065); 
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:147: ( WS )?
									int alt56=2;
									int LA56_0 = input.LA(1);
									if ( (LA56_0==WS) ) {
										alt56=1;
									}
									switch (alt56) {
										case 1 :
											// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:147: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1067); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1072); 
									qMeta.granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:221: ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )?
							int alt61=2;
							int LA61_0 = input.LA(1);
							if ( (LA61_0==WS||LA61_0==70) ) {
								alt61=1;
							}
							switch (alt61) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:222: ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )?
									{
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:222: ( WS )?
									int alt58=2;
									int LA58_0 = input.LA(1);
									if ( (LA58_0==WS) ) {
										alt58=1;
									}
									switch (alt58) {
										case 1 :
											// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:222: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1079); 
											}
											break;

									}

									match(input,70,FOLLOW_70_in_granularityClause1082); 
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:230: ( WS )?
									int alt59=2;
									int LA59_0 = input.LA(1);
									if ( (LA59_0==WS) ) {
										int LA59_1 = input.LA(2);
										if ( (LA59_1==WS) ) {
											alt59=1;
										}
									}
									switch (alt59) {
										case 1 :
											// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:230: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1084); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause1087);
									granularityInclude(qMeta);
									state._fsp--;

									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:260: ( WS )?
									int alt60=2;
									int LA60_0 = input.LA(1);
									if ( (LA60_0==WS) ) {
										alt60=1;
									}
									switch (alt60) {
										case 1 :
											// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:260: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1090); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause1095); 
							}

							}
							break;
						case 2 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:7: PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN
							{
							match(input,PERIOD,FOLLOW_PERIOD_in_granularityClause1114); 
							qMeta.granularity.type = "period";
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:51: ( WS )?
							int alt62=2;
							int LA62_0 = input.LA(1);
							if ( (LA62_0==WS) ) {
								alt62=1;
							}
							switch (alt62) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:51: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1118); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause1121); 
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:62: ( WS )?
							int alt63=2;
							int LA63_0 = input.LA(1);
							if ( (LA63_0==WS) ) {
								alt63=1;
							}
							switch (alt63) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:62: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1123); 
									}
									break;

							}

							per=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1128); 
							qMeta.granularity.setPeriod((per!=null?per.getText():null));
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:132: ( WS )?
							int alt64=2;
							int LA64_0 = input.LA(1);
							if ( (LA64_0==WS) ) {
								alt64=1;
							}
							switch (alt64) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:132: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1132); 
									}
									break;

							}

							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:136: ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )?
							int alt66=2;
							int LA66_0 = input.LA(1);
							if ( (LA66_0==70) ) {
								int LA66_1 = input.LA(2);
								if ( (LA66_1==WS) ) {
									int LA66_4 = input.LA(3);
									if ( (LA66_4==SINGLE_QUOTE_STRING) ) {
										alt66=1;
									}
								}
								else if ( (LA66_1==SINGLE_QUOTE_STRING) ) {
									alt66=1;
								}
							}
							switch (alt66) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:137: ',' ( WS )? tz= SINGLE_QUOTE_STRING
									{
									match(input,70,FOLLOW_70_in_granularityClause1136); 
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:141: ( WS )?
									int alt65=2;
									int LA65_0 = input.LA(1);
									if ( (LA65_0==WS) ) {
										alt65=1;
									}
									switch (alt65) {
										case 1 :
											// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:141: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1138); 
											}
											break;

									}

									tz=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1143); 
									qMeta.granularity.setTimeZone((tz!=null?tz.getText():null));
									}
									break;

							}

							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:213: ( WS )?
							int alt67=2;
							int LA67_0 = input.LA(1);
							if ( (LA67_0==WS) ) {
								alt67=1;
							}
							switch (alt67) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:213: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1149); 
									}
									break;

							}

							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:217: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt69=2;
							int LA69_0 = input.LA(1);
							if ( (LA69_0==70) ) {
								int LA69_1 = input.LA(2);
								if ( (LA69_1==WS) ) {
									int LA69_4 = input.LA(3);
									if ( (LA69_4==SINGLE_QUOTE_STRING) ) {
										alt69=1;
									}
								}
								else if ( (LA69_1==SINGLE_QUOTE_STRING) ) {
									alt69=1;
								}
							}
							switch (alt69) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:218: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,70,FOLLOW_70_in_granularityClause1153); 
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:222: ( WS )?
									int alt68=2;
									int LA68_0 = input.LA(1);
									if ( (LA68_0==WS) ) {
										alt68=1;
									}
									switch (alt68) {
										case 1 :
											// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:222: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1155); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1160); 
									qMeta.granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:296: ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )?
							int alt73=2;
							int LA73_0 = input.LA(1);
							if ( (LA73_0==WS||LA73_0==70) ) {
								alt73=1;
							}
							switch (alt73) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:297: ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )?
									{
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:297: ( WS )?
									int alt70=2;
									int LA70_0 = input.LA(1);
									if ( (LA70_0==WS) ) {
										alt70=1;
									}
									switch (alt70) {
										case 1 :
											// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:297: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1167); 
											}
											break;

									}

									match(input,70,FOLLOW_70_in_granularityClause1170); 
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:305: ( WS )?
									int alt71=2;
									int LA71_0 = input.LA(1);
									if ( (LA71_0==WS) ) {
										int LA71_1 = input.LA(2);
										if ( (LA71_1==WS) ) {
											alt71=1;
										}
									}
									switch (alt71) {
										case 1 :
											// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:305: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1172); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause1175);
									granularityInclude(qMeta);
									state._fsp--;

									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:335: ( WS )?
									int alt72=2;
									int LA72_0 = input.LA(1);
									if ( (LA72_0==WS) ) {
										alt72=1;
									}
									switch (alt72) {
										case 1 :
											// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:335: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1178); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause1183); 
							}

							}
							break;

					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "granularityClause"



	// $ANTLR start "granularityInclude"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:1: granularityInclude[QueryMeta qMeta] : ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) ;
	public final void granularityInclude(QueryMeta qMeta) throws RecognitionException {
		Pair<Integer> p1 =null;
		Pair<Integer> p2 =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:182:2: ( ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:4: WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN
			{
			match(input,WS,FOLLOW_WS_in_granularityInclude1205); 
			match(input,INCLUDE,FOLLOW_INCLUDE_in_granularityInclude1207); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:15: ( WS )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==WS) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:15: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude1209); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_granularityInclude1212); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:26: ( WS )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==WS) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:26: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude1214); 
					}
					break;

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:30: (p1= pairNums ( ',' p2= pairNums )* )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:31: p1= pairNums ( ',' p2= pairNums )*
			{
			pushFollow(FOLLOW_pairNums_in_granularityInclude1220);
			p1=pairNums();
			state._fsp--;

			qMeta.microIntervals.add(p1);
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:75: ( ',' p2= pairNums )*
			loop78:
			while (true) {
				int alt78=2;
				int LA78_0 = input.LA(1);
				if ( (LA78_0==70) ) {
					alt78=1;
				}

				switch (alt78) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:76: ',' p2= pairNums
					{
					match(input,70,FOLLOW_70_in_granularityInclude1225); 
					pushFollow(FOLLOW_pairNums_in_granularityInclude1229);
					p2=pairNums();
					state._fsp--;

					qMeta.microIntervals.add(p2);
					}
					break;

				default :
					break loop78;
				}
			}

			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:127: ( WS )?
			int alt79=2;
			int LA79_0 = input.LA(1);
			if ( (LA79_0==WS) ) {
				alt79=1;
			}
			switch (alt79) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:127: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude1236); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_granularityInclude1239); 
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "granularityInclude"



	// $ANTLR start "pairNums"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:186:1: pairNums returns [Pair<Integer> pair] : ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) ;
	public final Pair<Integer> pairNums() throws RecognitionException {
		Pair<Integer> pair = null;


		Token i=null;
		Token j=null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:2: ( ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:5: LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairNums1258); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:13: ( WS )?
			int alt80=2;
			int LA80_0 = input.LA(1);
			if ( (LA80_0==WS) ) {
				alt80=1;
			}
			switch (alt80) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums1260); 
					}
					break;

			}

			i=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums1265); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:25: ( WS )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==WS) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:25: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums1268); 
					}
					break;

			}

			match(input,70,FOLLOW_70_in_pairNums1271); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:33: ( WS )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==WS) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:33: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums1273); 
					}
					break;

			}

			j=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums1278); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:44: ( WS )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==WS) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:187:44: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums1280); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairNums1283); 
			}

			 pair = new Pair<>(Integer.parseInt((i!=null?i.getText():null)), Integer.parseInt((j!=null?j.getText():null)));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pair;
	}
	// $ANTLR end "pairNums"



	// $ANTLR start "pairString"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:190:1: pairString returns [Pair<String> pair] : ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) ;
	public final Pair<String> pairString() throws RecognitionException {
		Pair<String> pair = null;


		Token i=null;
		Token j=null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:2: ( ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:5: LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairString1303); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:13: ( WS )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==WS) ) {
				alt84=1;
			}
			switch (alt84) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString1305); 
					}
					break;

			}

			i=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString1310); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:40: ( WS )?
			int alt85=2;
			int LA85_0 = input.LA(1);
			if ( (LA85_0==WS) ) {
				alt85=1;
			}
			switch (alt85) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:40: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString1313); 
					}
					break;

			}

			match(input,70,FOLLOW_70_in_pairString1316); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:48: ( WS )?
			int alt86=2;
			int LA86_0 = input.LA(1);
			if ( (LA86_0==WS) ) {
				alt86=1;
			}
			switch (alt86) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:48: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString1318); 
					}
					break;

			}

			j=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString1323); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:74: ( WS )?
			int alt87=2;
			int LA87_0 = input.LA(1);
			if ( (LA87_0==WS) ) {
				alt87=1;
			}
			switch (alt87) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:191:74: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString1325); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairString1328); 
			}

			 pair = new Pair<>(((i!=null?i.getText():null)).replaceAll("'", ""), ((j!=null?j.getText():null)).replaceAll("'", ""));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return pair;
	}
	// $ANTLR end "pairString"



	// $ANTLR start "havingClause"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:198:1: havingClause returns [Having having] : h= complexHaving ;
	public final Having havingClause() throws RecognitionException {
		Having having = null;


		Having h =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:199:2: (h= complexHaving )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:199:4: h= complexHaving
			{
			pushFollow(FOLLOW_complexHaving_in_havingClause1353);
			h=complexHaving();
			state._fsp--;

			having = h;
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return having;
	}
	// $ANTLR end "havingClause"



	// $ANTLR start "simpleHaving"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:1: simpleHaving returns [Having having] : ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) );
	public final Having simpleHaving() throws RecognitionException {
		Having having = null;


		Token a=null;
		Token t=null;
		Token v=null;
		Token n=null;
		EqualsToHolder e =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:2: ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) )
			int alt92=3;
			int LA92_0 = input.LA(1);
			if ( (LA92_0==ID) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA92_3 = input.LA(3);
					if ( (LA92_3==COMPARE_OPER) ) {
						alt92=1;
					}
					else if ( (LA92_3==EQUALS) ) {
						alt92=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 92, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case COMPARE_OPER:
					{
					alt92=1;
					}
					break;
				case EQUALS:
					{
					alt92=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 92, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA92_0==NOT) ) {
				alt92=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 92, 0, input);
				throw nvae;
			}

			switch (alt92) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:5: a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving1374); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:10: ( WS )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==WS) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:10: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving1376); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving1381); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:29: ( WS )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==WS) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:203:29: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving1383); 
							}
							break;

					}

					v=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					having = new Having((t!=null?t.getText():null), (a!=null?a.getText():null), (v!=null?v.getText():null));
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:204:4: (e= getEquals )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:204:4: (e= getEquals )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:204:5: e= getEquals
					{
					pushFollow(FOLLOW_getEquals_in_simpleHaving1405);
					e=getEquals();
					state._fsp--;

					}

					having = new Having("=", e.name, e.value);
					}
					break;
				case 3 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:5: n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_simpleHaving1416); 
					match(input,WS,FOLLOW_WS_in_simpleHaving1418); 
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving1422); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:19: ( WS )?
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==WS) ) {
						alt90=1;
					}
					switch (alt90) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:19: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving1424); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving1429); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:38: ( WS )?
					int alt91=2;
					int LA91_0 = input.LA(1);
					if ( (LA91_0==WS) ) {
						alt91=1;
					}
					switch (alt91) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:38: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving1431); 
							}
							break;

					}

					v=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}

					having = new Having((n!=null?n.getText():null).toLowerCase()); having.havingSpecs = Arrays.asList(new Having((t!=null?t.getText():null), (a!=null?a.getText():null), (v!=null?v.getText():null)));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return having;
	}
	// $ANTLR end "simpleHaving"



	// $ANTLR start "complexHaving"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:208:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );
	public final Having complexHaving() throws RecognitionException {
		Having having = null;


		Token o=null;
		Having s =null;
		Having a =null;
		Having b =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:2: ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) )
			int alt93=2;
			alt93 = dfa93.predict(input);
			switch (alt93) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:4: (s= simpleHaving )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:4: (s= simpleHaving )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:5: s= simpleHaving
					{
					pushFollow(FOLLOW_simpleHaving_in_complexHaving1464);
					s=simpleHaving();
					state._fsp--;

					}

					having = s;
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:210:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:210:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:210:5: a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving
					{
					pushFollow(FOLLOW_simpleHaving_in_complexHaving1475);
					a=simpleHaving();
					state._fsp--;

					match(input,WS,FOLLOW_WS_in_complexHaving1477); 
					o=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,WS,FOLLOW_WS_in_complexHaving1487); 
					pushFollow(FOLLOW_complexHaving_in_complexHaving1491);
					b=complexHaving();
					state._fsp--;

					}

					having = new Having((o!=null?o.getText():null).toLowerCase()); having.havingSpecs = Arrays.asList(a,b);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return having;
	}
	// $ANTLR end "complexHaving"



	// $ANTLR start "selectorFilter"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:218:1: selectorFilter returns [Filter filter] : e= getEquals ;
	public final Filter selectorFilter() throws RecognitionException {
		Filter filter = null;


		EqualsToHolder e =null;

		filter = new Filter("selector");
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:2: (e= getEquals )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:4: e= getEquals
			{
			pushFollow(FOLLOW_getEquals_in_selectorFilter1528);
			e=getEquals();
			state._fsp--;

			filter.dimension = e.name;
					 filter.value = e.value;
					 if (filter.value.startsWith("'") && filter.value.endsWith("'")) {
					 	filter.value = filter.value.substring(1, filter.value.length() - 1);
					 }
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "selectorFilter"



	// $ANTLR start "regexFilter"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:1: regexFilter returns [Filter filter] : (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) ;
	public final Filter regexFilter() throws RecognitionException {
		Filter filter = null;


		Token a=null;
		Token b=null;

		filter = new Filter("regex");
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:231:2: ( (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:231:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:231:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:231:5: a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_regexFilter1557); 
			match(input,WS,FOLLOW_WS_in_regexFilter1559); 
			match(input,LIKE,FOLLOW_LIKE_in_regexFilter1561); 
			match(input,WS,FOLLOW_WS_in_regexFilter1563); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:231:24: ( SINGLE_QUOTE_STRING )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:231:25: SINGLE_QUOTE_STRING
			{
			b=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1569); 
			}

			}

			filter.dimension = (a!=null?a.getText():null);
					 filter.pattern = (b!=null?b.getText():null);
					 if (filter.pattern.startsWith("'") && filter.pattern.endsWith("'")) {
					 	filter.pattern = filter.pattern.substring(1, filter.pattern.length() - 1);
					 }
					
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "regexFilter"



	// $ANTLR start "simpleFilter"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:1: simpleFilter returns [Filter filter] : ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) );
	public final Filter simpleFilter() throws RecognitionException {
		Filter filter = null;


		Filter a =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:2: ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==ID) ) {
				alt98=1;
			}
			else if ( (LA98_0==LPARAN) ) {
				alt98=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:4: (a= selectorFilter |a= regexFilter )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:4: (a= selectorFilter |a= regexFilter )
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==ID) ) {
						int LA94_1 = input.LA(2);
						if ( (LA94_1==WS) ) {
							int LA94_2 = input.LA(3);
							if ( (LA94_2==LIKE) ) {
								alt94=2;
							}
							else if ( (LA94_2==EQUALS) ) {
								alt94=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 94, 2, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA94_1==EQUALS) ) {
							alt94=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 94, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 94, 0, input);
						throw nvae;
					}

					switch (alt94) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:5: a= selectorFilter
							{
							pushFollow(FOLLOW_selectorFilter_in_simpleFilter1594);
							a=selectorFilter();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:24: a= regexFilter
							{
							pushFollow(FOLLOW_regexFilter_in_simpleFilter1600);
							a=regexFilter();
							state._fsp--;

							}
							break;

					}

					filter = a;
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:6: LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_simpleFilter1610); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:13: ( WS )?
					int alt95=2;
					int LA95_0 = input.LA(1);
					if ( (LA95_0==WS) ) {
						alt95=1;
					}
					switch (alt95) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:13: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleFilter1612); 
							}
							break;

					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:17: (a= selectorFilter |a= regexFilter )
					int alt96=2;
					int LA96_0 = input.LA(1);
					if ( (LA96_0==ID) ) {
						int LA96_1 = input.LA(2);
						if ( (LA96_1==WS) ) {
							int LA96_2 = input.LA(3);
							if ( (LA96_2==LIKE) ) {
								alt96=2;
							}
							else if ( (LA96_2==EQUALS) ) {
								alt96=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 96, 2, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA96_1==EQUALS) ) {
							alt96=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 96, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 96, 0, input);
						throw nvae;
					}

					switch (alt96) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:18: a= selectorFilter
							{
							pushFollow(FOLLOW_selectorFilter_in_simpleFilter1618);
							a=selectorFilter();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:37: a= regexFilter
							{
							pushFollow(FOLLOW_regexFilter_in_simpleFilter1624);
							a=regexFilter();
							state._fsp--;

							}
							break;

					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:52: ( WS )?
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==WS) ) {
						alt97=1;
					}
					switch (alt97) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:52: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleFilter1627); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_simpleFilter1630); 
					}

					filter = a;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "simpleFilter"



	// $ANTLR start "simpleLogicalFilter"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:1: simpleLogicalFilter returns [Filter filter] : ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) );
	public final Filter simpleLogicalFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;
		Filter s =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:2: ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==ID||LA102_0==NOT) ) {
				alt102=1;
			}
			else if ( (LA102_0==LPARAN) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA102_4 = input.LA(3);
					if ( (LA102_4==ID) ) {
						int LA102_8 = input.LA(4);
						if ( (LA102_8==WS) ) {
							int LA102_13 = input.LA(5);
							if ( (LA102_13==LIKE) ) {
								int LA102_19 = input.LA(6);
								if ( (LA102_19==WS) ) {
									alt102=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 102, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA102_13==EQUALS) ) {
								int LA102_20 = input.LA(6);
								if ( (LA102_20==WS) ) {
									alt102=1;
								}
								else if ( (LA102_20==FLOAT||LA102_20==LONG||LA102_20==SINGLE_QUOTE_STRING) ) {
									alt102=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 102, 20, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 102, 13, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA102_8==EQUALS) ) {
							int LA102_14 = input.LA(5);
							if ( (LA102_14==WS) ) {
								int LA102_21 = input.LA(6);
								if ( (LA102_21==FLOAT||LA102_21==LONG||LA102_21==SINGLE_QUOTE_STRING) ) {
									alt102=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 102, 21, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA102_14==FLOAT||LA102_14==LONG||LA102_14==SINGLE_QUOTE_STRING) ) {
								int LA102_22 = input.LA(6);
								if ( (LA102_22==WS) ) {
									alt102=1;
								}
								else if ( (LA102_22==RPARAN) ) {
									alt102=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 102, 22, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 102, 14, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 102, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA102_4==LPARAN||LA102_4==NOT) ) {
						alt102=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 102, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ID:
					{
					int LA102_5 = input.LA(3);
					if ( (LA102_5==WS) ) {
						int LA102_11 = input.LA(4);
						if ( (LA102_11==LIKE) ) {
							int LA102_15 = input.LA(5);
							if ( (LA102_15==WS) ) {
								int LA102_23 = input.LA(6);
								if ( (LA102_23==SINGLE_QUOTE_STRING) ) {
									alt102=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 102, 23, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 102, 15, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA102_11==EQUALS) ) {
							int LA102_16 = input.LA(5);
							if ( (LA102_16==WS) ) {
								int LA102_24 = input.LA(6);
								if ( (LA102_24==FLOAT||LA102_24==LONG||LA102_24==SINGLE_QUOTE_STRING) ) {
									alt102=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 102, 24, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA102_16==FLOAT||LA102_16==LONG||LA102_16==SINGLE_QUOTE_STRING) ) {
								int LA102_25 = input.LA(6);
								if ( (LA102_25==WS) ) {
									alt102=1;
								}
								else if ( (LA102_25==RPARAN) ) {
									alt102=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 102, 25, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 102, 16, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 102, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA102_5==EQUALS) ) {
						int LA102_12 = input.LA(4);
						if ( (LA102_12==WS) ) {
							int LA102_17 = input.LA(5);
							if ( (LA102_17==FLOAT||LA102_17==LONG||LA102_17==SINGLE_QUOTE_STRING) ) {
								int LA102_26 = input.LA(6);
								if ( (LA102_26==WS) ) {
									alt102=1;
								}
								else if ( (LA102_26==RPARAN) ) {
									alt102=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 102, 26, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 102, 17, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA102_12==FLOAT||LA102_12==LONG||LA102_12==SINGLE_QUOTE_STRING) ) {
							int LA102_18 = input.LA(5);
							if ( (LA102_18==WS) ) {
								int LA102_27 = input.LA(6);
								if ( (LA102_27==AND||LA102_27==OR) ) {
									alt102=2;
								}
								else if ( (LA102_27==RPARAN) ) {
									alt102=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 102, 27, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA102_18==RPARAN) ) {
								alt102=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 102, 18, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 102, 12, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 102, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case LPARAN:
				case NOT:
					{
					alt102=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 102, 0, input);
				throw nvae;
			}

			switch (alt102) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					int alt99=2;
					int LA99_0 = input.LA(1);
					if ( (LA99_0==ID||LA99_0==LPARAN) ) {
						alt99=1;
					}
					else if ( (LA99_0==NOT) ) {
						alt99=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 99, 0, input);
						throw nvae;
					}

					switch (alt99) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:5: a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter
							{
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1651);
							a=simpleFilter();
							state._fsp--;

							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter1653); 
							o=input.LT(1);
							if ( input.LA(1)==AND||input.LA(1)==OR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter1663); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1667);
							b=simpleFilter();
							state._fsp--;

							}

							}
							break;
						case 2 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:55: (o= NOT WS b= simpleFilter )
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:55: (o= NOT WS b= simpleFilter )
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:56: o= NOT WS b= simpleFilter
							{
							o=(Token)match(input,NOT,FOLLOW_NOT_in_simpleLogicalFilter1675); 
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter1677); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1681);
							b=simpleFilter();
							state._fsp--;

							}

							}
							break;

					}

					filter = new Filter((o!=null?o.getText():null).toLowerCase());
							 filter.fields = new ArrayList<>();
							 if (a != null) {
							    filter.fields.add(a);
							 }
							 filter.fields.add(b);
							
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:5: LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_simpleLogicalFilter1694); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:12: ( WS )?
					int alt100=2;
					int LA100_0 = input.LA(1);
					if ( (LA100_0==WS) ) {
						alt100=1;
					}
					switch (alt100) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:12: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter1696); 
							}
							break;

					}

					pushFollow(FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter1701);
					s=simpleLogicalFilter();
					state._fsp--;

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:38: ( WS )?
					int alt101=2;
					int LA101_0 = input.LA(1);
					if ( (LA101_0==WS) ) {
						alt101=1;
					}
					switch (alt101) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:254:38: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter1703); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_simpleLogicalFilter1706); 
					}

					filter = s;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "simpleLogicalFilter"



	// $ANTLR start "grandFilter"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:1: grandFilter returns [Filter filter] : (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? ;
	public final Filter grandFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:260:2: ( (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:260:4: (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )?
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:260:4: (a= simpleFilter |a= simpleLogicalFilter )
			int alt103=2;
			alt103 = dfa103.predict(input);
			switch (alt103) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:260:5: a= simpleFilter
					{
					pushFollow(FOLLOW_simpleFilter_in_grandFilter1730);
					a=simpleFilter();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:260:22: a= simpleLogicalFilter
					{
					pushFollow(FOLLOW_simpleLogicalFilter_in_grandFilter1736);
					a=simpleLogicalFilter();
					state._fsp--;

					}
					break;

			}

			filter = a;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:260:60: ( WS o= ( AND | OR ) WS b= grandFilter )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==WS) ) {
				int LA104_1 = input.LA(2);
				if ( (LA104_1==AND||LA104_1==OR) ) {
					alt104=1;
				}
			}
			switch (alt104) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:260:61: WS o= ( AND | OR ) WS b= grandFilter
					{
					match(input,WS,FOLLOW_WS_in_grandFilter1743); 
					o=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,WS,FOLLOW_WS_in_grandFilter1753); 
					pushFollow(FOLLOW_grandFilter_in_grandFilter1757);
					b=grandFilter();
					state._fsp--;

					filter = new Filter((o!=null?o.getText():null).toLowerCase());
							 filter.fields = new ArrayList<>();
							 filter.fields.add(a);
							 filter.fields.add(b);
							
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return filter;
	}
	// $ANTLR end "grandFilter"



	// $ANTLR start "aggItemInSelect"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:271:1: aggItemInSelect returns [AggItem aggItem] : aggCallSite[aggItem] ( WS AS WS x= ID )? ;
	public final AggItem aggItemInSelect() throws RecognitionException {
		AggItem aggItem = null;


		Token x=null;

		  aggItem = new AggItem(); 
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:2: ( aggCallSite[aggItem] ( WS AS WS x= ID )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:4: aggCallSite[aggItem] ( WS AS WS x= ID )?
			{
			pushFollow(FOLLOW_aggCallSite_in_aggItemInSelect1794);
			aggCallSite(aggItem);
			state._fsp--;

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:25: ( WS AS WS x= ID )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==WS) ) {
				int LA105_1 = input.LA(2);
				if ( (LA105_1==AS) ) {
					alt105=1;
				}
			}
			switch (alt105) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:26: WS AS WS x= ID
					{
					match(input,WS,FOLLOW_WS_in_aggItemInSelect1798); 
					match(input,AS,FOLLOW_AS_in_aggItemInSelect1800); 
					match(input,WS,FOLLOW_WS_in_aggItemInSelect1802); 
					x=(Token)match(input,ID,FOLLOW_ID_in_aggItemInSelect1806); 
					aggItem.setAsName((x!=null?x.getText():null));
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return aggItem;
	}
	// $ANTLR end "aggItemInSelect"



	// $ANTLR start "aggCallSite"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:1: aggCallSite[AggItem aggItem] : (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN ) | COUNT ( '(*)' ) );
	public final void aggCallSite(AggItem aggItem) throws RecognitionException {
		Token x=null;
		String p =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:2: (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN ) | COUNT ( '(*)' ) )
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==DOUBLE_SUM||LA109_0==JAVASCRIPT||LA109_0==LONG_SUM||(LA109_0 >= MAX && LA109_0 <= MIN)||LA109_0==UNIQUE) ) {
				alt109=1;
			}
			else if ( (LA109_0==COUNT) ) {
				alt109=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 109, 0, input);
				throw nvae;
			}

			switch (alt109) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:4: p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN )
					{
					pushFollow(FOLLOW_aggFunc_in_aggCallSite1825);
					p=aggFunc();
					state._fsp--;

					aggItem.setAggType(p);
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:39: ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:40: ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:40: ( WS )?
					int alt106=2;
					int LA106_0 = input.LA(1);
					if ( (LA106_0==WS) ) {
						alt106=1;
					}
					switch (alt106) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:40: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite1830); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_aggCallSite1833); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:51: ( WS )?
					int alt107=2;
					int LA107_0 = input.LA(1);
					if ( (LA107_0==WS) ) {
						alt107=1;
					}
					switch (alt107) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:51: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite1835); 
							}
							break;

					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:55: (x= ID )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:57: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_aggCallSite1842); 
					aggItem.setFieldName((x!=null?x.getText():null));
					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:96: ( WS )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==WS) ) {
						alt108=1;
					}
					switch (alt108) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:96: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite1847); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_aggCallSite1850); 
					}

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:277:4: COUNT ( '(*)' )
					{
					match(input,COUNT,FOLLOW_COUNT_in_aggCallSite1857); 
					aggItem.setAggType("count");
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:277:41: ( '(*)' )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:277:42: '(*)'
					{
					match(input,68,FOLLOW_68_in_aggCallSite1862); 
					}

					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "aggCallSite"



	// $ANTLR start "aggFunc"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:280:1: aggFunc returns [String name] : ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT );
	public final String aggFunc() throws RecognitionException {
		String name = null;


		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:281:2: ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT )
			int alt110=6;
			switch ( input.LA(1) ) {
			case LONG_SUM:
				{
				alt110=1;
				}
				break;
			case DOUBLE_SUM:
				{
				alt110=2;
				}
				break;
			case UNIQUE:
				{
				alt110=3;
				}
				break;
			case MIN:
				{
				alt110=4;
				}
				break;
			case MAX:
				{
				alt110=5;
				}
				break;
			case JAVASCRIPT:
				{
				alt110=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 110, 0, input);
				throw nvae;
			}
			switch (alt110) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:281:4: LONG_SUM
					{
					match(input,LONG_SUM,FOLLOW_LONG_SUM_in_aggFunc1880); 
					name = "longSum";
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:282:4: DOUBLE_SUM
					{
					match(input,DOUBLE_SUM,FOLLOW_DOUBLE_SUM_in_aggFunc1887); 
					name = "doubleSum";
					}
					break;
				case 3 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:4: UNIQUE
					{
					match(input,UNIQUE,FOLLOW_UNIQUE_in_aggFunc1894); 
					name = "hyperUnique";
					}
					break;
				case 4 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:4: MIN
					{
					match(input,MIN,FOLLOW_MIN_in_aggFunc1901); 
					name = "min";
					}
					break;
				case 5 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:285:4: MAX
					{
					match(input,MAX,FOLLOW_MAX_in_aggFunc1908); 
					name = "max";
					}
					break;
				case 6 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:286:4: JAVASCRIPT
					{
					match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_aggFunc1915); 
					name = "javascript";
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return name;
	}
	// $ANTLR end "aggFunc"



	// $ANTLR start "postAggItem"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:292:1: postAggItem returns [PostAggItem postAggItem] : ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) );
	public final PostAggItem postAggItem() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:2: ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) )
			int alt120=2;
			int LA120_0 = input.LA(1);
			if ( (LA120_0==FLOAT||LA120_0==ID||LA120_0==JAVASCRIPT||LA120_0==LONG||LA120_0==UNIQUE) ) {
				alt120=1;
			}
			else if ( (LA120_0==LPARAN) ) {
				alt120=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 120, 0, input);
				throw nvae;
			}

			switch (alt120) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:5: a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					pushFollow(FOLLOW_simpleArith_in_postAggItem1943);
					a=simpleArith();
					state._fsp--;

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:20: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==WS) ) {
						int LA113_1 = input.LA(2);
						if ( (LA113_1==ARITH_OPER) ) {
							alt113=1;
						}
					}
					else if ( (LA113_0==ARITH_OPER) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:21: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:21: ( WS )?
							int alt111=2;
							int LA111_0 = input.LA(1);
							if ( (LA111_0==WS) ) {
								alt111=1;
							}
							switch (alt111) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:21: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem1947); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem1950);
							postAggArithOper(postAggItem);
							state._fsp--;

							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:55: ( WS )?
							int alt112=2;
							int LA112_0 = input.LA(1);
							if ( (LA112_0==WS) ) {
								alt112=1;
							}
							switch (alt112) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:55: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem1953); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem1958);
							b=postAggItem();
							state._fsp--;

							}
							break;

					}

					}

					 if (b == null) {
						       postAggItem = a;
					             } else {
					             	postAggItem.fields = Arrays.asList(a, b);
					             }
					           
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN )
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:6: LPARAN ( WS )? a= postAggItem ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_postAggItem1976); 
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:13: ( WS )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==WS) ) {
						alt114=1;
					}
					switch (alt114) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:13: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem1978); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggItem_in_postAggItem1983);
					a=postAggItem();
					state._fsp--;

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:31: ( WS )?
					int alt115=2;
					int LA115_0 = input.LA(1);
					if ( (LA115_0==WS) ) {
						alt115=1;
					}
					switch (alt115) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:31: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem1985); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_postAggItem1988); 
					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:43: ( postAggLabel[postAggItem] )?
					int alt116=2;
					int LA116_0 = input.LA(1);
					if ( (LA116_0==AS) ) {
						alt116=1;
					}
					switch (alt116) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:44: postAggLabel[postAggItem]
							{
							pushFollow(FOLLOW_postAggLabel_in_postAggItem1992);
							postAggLabel(postAggItem);
							state._fsp--;

							}
							break;

					}

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:72: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt119=2;
					int LA119_0 = input.LA(1);
					if ( (LA119_0==WS) ) {
						int LA119_1 = input.LA(2);
						if ( (LA119_1==ARITH_OPER) ) {
							alt119=1;
						}
					}
					else if ( (LA119_0==ARITH_OPER) ) {
						alt119=1;
					}
					switch (alt119) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:73: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:73: ( WS )?
							int alt117=2;
							int LA117_0 = input.LA(1);
							if ( (LA117_0==WS) ) {
								alt117=1;
							}
							switch (alt117) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:73: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem1998); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem2001);
							postAggArithOper(postAggItem);
							state._fsp--;

							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:107: ( WS )?
							int alt118=2;
							int LA118_0 = input.LA(1);
							if ( (LA118_0==WS) ) {
								alt118=1;
							}
							switch (alt118) {
								case 1 :
									// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:107: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem2004); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem2009);
							b=postAggItem();
							state._fsp--;

							}
							break;

					}

					}

					 if (b == null) {
						       postAggItem = a;
					             } else {
					             	postAggItem.fields = Arrays.asList(a, b);
					             }
					           
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "postAggItem"



	// $ANTLR start "simpleArith"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:312:1: simpleArith returns [PostAggItem postAggItem] : (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? ;
	public final PostAggItem simpleArith() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:2: ( (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:4: (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:4: (a= simplePostAggAccess )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:5: a= simplePostAggAccess
			{
			pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2045);
			a=simplePostAggAccess();
			state._fsp--;

			postAggItem=a;
			}

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			int alt123=2;
			alt123 = dfa123.predict(input);
			switch (alt123) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:46: ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess
					{
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:46: ( WS )?
					int alt121=2;
					int LA121_0 = input.LA(1);
					if ( (LA121_0==WS) ) {
						alt121=1;
					}
					switch (alt121) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:46: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith2051); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggArithOper_in_simpleArith2054);
					postAggArithOper(postAggItem);
					state._fsp--;

					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:80: ( WS )?
					int alt122=2;
					int LA122_0 = input.LA(1);
					if ( (LA122_0==WS) ) {
						alt122=1;
					}
					switch (alt122) {
						case 1 :
							// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:80: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith2057); 
							}
							break;

					}

					pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2062);
					b=simplePostAggAccess();
					state._fsp--;


						    postAggItem = new PostAggItem("arithmetic"); 
						    if (postAggItem.fields == null) {
						       postAggItem.fields = new ArrayList<>();
						    }
					            postAggItem.fields.add(a);
						    postAggItem.fields.add(b);
						   
					}
					break;

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "simpleArith"



	// $ANTLR start "simplePostAggAccess"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:1: simplePostAggAccess returns [PostAggItem postAggItem] : (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef );
	public final PostAggItem simplePostAggAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem c =null;
		PostAggItem f =null;
		PostAggItem h =null;
		PostAggItem js =null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:327:2: (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef )
			int alt124=4;
			switch ( input.LA(1) ) {
			case FLOAT:
			case LONG:
				{
				alt124=1;
				}
				break;
			case ID:
				{
				alt124=2;
				}
				break;
			case UNIQUE:
				{
				alt124=3;
				}
				break;
			case JAVASCRIPT:
				{
				alt124=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 124, 0, input);
				throw nvae;
			}
			switch (alt124) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:327:4: c= constantAccess
					{
					pushFollow(FOLLOW_constantAccess_in_simplePostAggAccess2091);
					c=constantAccess();
					state._fsp--;

					postAggItem = c;
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:4: f= fieldAccess
					{
					pushFollow(FOLLOW_fieldAccess_in_simplePostAggAccess2108);
					f=fieldAccess();
					state._fsp--;

					postAggItem = f;
					}
					break;
				case 3 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:329:4: h= hyperUniqueCardinality
					{
					pushFollow(FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2121);
					h=hyperUniqueCardinality();
					state._fsp--;

					postAggItem = h;
					}
					break;
				case 4 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:330:4: js= postAggJavascriptDef
					{
					pushFollow(FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2130);
					js=postAggJavascriptDef();
					state._fsp--;

					postAggItem = js;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "simplePostAggAccess"



	// $ANTLR start "constantAccess"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:335:1: constantAccess returns [PostAggItem postAggItem] : ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem constantAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("constant"); 
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:2: ( ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:5: (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )?
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:5: (a= FLOAT |a= LONG )
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==FLOAT) ) {
				alt125=1;
			}
			else if ( (LA125_0==LONG) ) {
				alt125=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}

			switch (alt125) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:6: a= FLOAT
					{
					a=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constantAccess2160); 
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:337:16: a= LONG
					{
					a=(Token)match(input,LONG,FOLLOW_LONG_in_constantAccess2166); 
					}
					break;

			}

			postAggItem.constantValue = Double.valueOf((a!=null?a.getText():null));
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:339:5: ( WS postAggLabel[postAggItem] )?
			int alt126=2;
			int LA126_0 = input.LA(1);
			if ( (LA126_0==WS) ) {
				int LA126_1 = input.LA(2);
				if ( (LA126_1==AS) ) {
					alt126=1;
				}
			}
			switch (alt126) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:339:6: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_constantAccess2179); 
					pushFollow(FOLLOW_postAggLabel_in_constantAccess2181);
					postAggLabel(postAggItem);
					state._fsp--;

					}
					break;

			}

			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "constantAccess"



	// $ANTLR start "fieldAccess"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:342:1: fieldAccess returns [PostAggItem postAggItem] : (a= ID ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem fieldAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("fieldAccess"); 
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:2: ( (a= ID ( WS postAggLabel[postAggItem] )? ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:5: a= ID ( WS postAggLabel[postAggItem] )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_fieldAccess2209); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:10: ( WS postAggLabel[postAggItem] )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==WS) ) {
				int LA127_1 = input.LA(2);
				if ( (LA127_1==AS) ) {
					alt127=1;
				}
			}
			switch (alt127) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:11: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_fieldAccess2212); 
					pushFollow(FOLLOW_postAggLabel_in_fieldAccess2214);
					postAggLabel(postAggItem);
					state._fsp--;

					}
					break;

			}

			}

			postAggItem.fieldName = (a!=null?a.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "fieldAccess"



	// $ANTLR start "hyperUniqueCardinality"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:347:1: hyperUniqueCardinality returns [PostAggItem postAggItem] : ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) ;
	public final PostAggItem hyperUniqueCardinality() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("hyperUniqueCardinality"); 
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:2: ( ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:5: UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN
			{
			match(input,UNIQUE,FOLLOW_UNIQUE_in_hyperUniqueCardinality2243); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:12: ( WS )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==WS) ) {
				alt128=1;
			}
			switch (alt128) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:12: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality2245); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_hyperUniqueCardinality2248); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:23: ( WS )?
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==WS) ) {
				alt129=1;
			}
			switch (alt129) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:23: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality2250); 
					}
					break;

			}

			a=(Token)match(input,ID,FOLLOW_ID_in_hyperUniqueCardinality2255); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:32: ( WS )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==WS) ) {
				alt130=1;
			}
			switch (alt130) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:32: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality2257); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_hyperUniqueCardinality2260); 
			postAggItem.fieldName = (a!=null?a.getText():null);
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "hyperUniqueCardinality"



	// $ANTLR start "postAggJavascriptDef"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:354:1: postAggJavascriptDef returns [PostAggItem postAggItem] : JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING ;
	public final PostAggItem postAggJavascriptDef() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token str=null;

		  postAggItem = new PostAggItem("javascript"); 
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:2: ( JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:4: JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING
			{
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2286); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:15: ( WS )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==WS) ) {
				alt131=1;
			}
			switch (alt131) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:15: WS
					{
					match(input,WS,FOLLOW_WS_in_postAggJavascriptDef2288); 
					}
					break;

			}

			str=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2293); 
			postAggItem.parseToJs((str!=null?str.getText():null));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return postAggItem;
	}
	// $ANTLR end "postAggJavascriptDef"



	// $ANTLR start "postAggLabel"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:359:1: postAggLabel[PostAggItem postAggItem] : ( AS WS id= ID ) ;
	public final void postAggLabel(PostAggItem postAggItem) throws RecognitionException {
		Token id=null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:2: ( ( AS WS id= ID ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:4: ( AS WS id= ID )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:4: ( AS WS id= ID )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:5: AS WS id= ID
			{
			match(input,AS,FOLLOW_AS_in_postAggLabel2309); 
			match(input,WS,FOLLOW_WS_in_postAggLabel2311); 
			id=(Token)match(input,ID,FOLLOW_ID_in_postAggLabel2315); 
			}

			postAggItem.name = (id!=null?id.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "postAggLabel"



	// $ANTLR start "postAggArithOper"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:363:1: postAggArithOper[PostAggItem postAggItem] : arith= ARITH_OPER ;
	public final void postAggArithOper(PostAggItem postAggItem) throws RecognitionException {
		Token arith=null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:2: (arith= ARITH_OPER )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:3: arith= ARITH_OPER
			{
			arith=(Token)match(input,ARITH_OPER,FOLLOW_ARITH_OPER_in_postAggArithOper2331); 
			postAggItem.fn = (arith!=null?arith.getText():null);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "postAggArithOper"


	public static class isoTime_return extends ParserRuleReturnScope {
		public String date;
	};


	// $ANTLR start "isoTime"
	// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:369:1: isoTime returns [String date] : (d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ );
	public final druidGParser.isoTime_return isoTime() throws RecognitionException {
		druidGParser.isoTime_return retval = new druidGParser.isoTime_return();
		retval.start = input.LT(1);

		Token d=null;

		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:370:2: (d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ )
			int alt132=6;
			switch ( input.LA(1) ) {
			case DATE_HOUR:
				{
				alt132=1;
				}
				break;
			case DATE_HOUR_MIN:
				{
				alt132=2;
				}
				break;
			case DATE_HOUR_MIN_SEC:
				{
				alt132=3;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB:
				{
				alt132=4;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_TZ:
				{
				alt132=5;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_UTC_TZ:
				{
				alt132=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 132, 0, input);
				throw nvae;
			}
			switch (alt132) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:370:3: d= DATE_HOUR
					{
					d=(Token)match(input,DATE_HOUR,FOLLOW_DATE_HOUR_in_isoTime2350); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:371:3: d= DATE_HOUR_MIN
					{
					d=(Token)match(input,DATE_HOUR_MIN,FOLLOW_DATE_HOUR_MIN_in_isoTime2358); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 3 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:372:3: d= DATE_HOUR_MIN_SEC
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC,FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2366); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 4 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:373:3: d= DATE_HOUR_MIN_SEC_SUB
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB,FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2374); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 5 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:3: d= DATE_HOUR_MIN_SEC_SUB_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2382); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 6 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:375:3: d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_UTC_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2390); 
					retval.date = (d!=null?d.getText():null);
					}
					break;

			}
			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "isoTime"

	// Delegated rules


	protected DFA93 dfa93 = new DFA93(this);
	protected DFA103 dfa103 = new DFA103(this);
	protected DFA123 dfa123 = new DFA123(this);
	static final String DFA93_eotS =
		"\140\uffff";
	static final String DFA93_eofS =
		"\140\uffff";
	static final String DFA93_minS =
		"\1\37\1\12\1\103\1\12\2\31\1\37\3\31\1\70\1\31\1\70\1\12\1\31\1\70\1\31"+
		"\2\70\1\4\1\uffff\1\70\1\4\1\uffff\1\12\1\31\1\70\1\4\1\uffff\1\70\1\4"+
		"\1\uffff\1\4\11\uffff\1\4\11\uffff\2\31\1\70\51\uffff";
	static final String DFA93_maxS =
		"\1\56\2\103\1\26\2\103\1\37\2\103\1\47\1\103\1\73\2\103\1\47\1\103\1\73"+
		"\2\103\1\102\1\uffff\1\103\1\102\1\uffff\1\12\2\103\1\102\1\uffff\1\103"+
		"\1\102\1\uffff\1\102\11\uffff\1\102\11\uffff\1\103\1\47\1\103\51\uffff";
	static final String DFA93_acceptS =
		"\24\uffff\1\1\23\uffff\1\2\16\uffff\1\1\11\uffff\1\1\31\uffff\4\1\1\uffff";
	static final String DFA93_specialS =
		"\140\uffff}>";
	static final String[] DFA93_transitionS = {
			"\1\1\16\uffff\1\2",
			"\1\4\13\uffff\1\5\54\uffff\1\3",
			"\1\6",
			"\1\7\13\uffff\1\10",
			"\1\12\15\uffff\1\12\33\uffff\1\11",
			"\1\14\15\uffff\1\14\23\uffff\1\14\7\uffff\1\13",
			"\1\15",
			"\1\17\15\uffff\1\17\33\uffff\1\16",
			"\1\21\15\uffff\1\21\23\uffff\1\21\7\uffff\1\20",
			"\1\22\15\uffff\1\22",
			"\1\24\12\uffff\1\23",
			"\1\25\15\uffff\1\25\23\uffff\1\25",
			"\1\24\12\uffff\1\26",
			"\1\31\70\uffff\1\30",
			"\1\32\15\uffff\1\32",
			"\1\24\12\uffff\1\33",
			"\1\35\15\uffff\1\35\23\uffff\1\35",
			"\1\24\12\uffff\1\36",
			"\1\24\12\uffff\1\40",
			"\1\50\31\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
			"",
			"\1\24\12\uffff\1\52",
			"\1\50\31\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
			"",
			"\1\64",
			"\1\66\15\uffff\1\66\33\uffff\1\65",
			"\1\24\12\uffff\1\67",
			"\1\50\31\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
			"",
			"\1\24\12\uffff\1\101",
			"\1\50\31\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
			"",
			"\1\50\31\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\50\31\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\134\15\uffff\1\134\33\uffff\1\133",
			"\1\135\15\uffff\1\135",
			"\1\24\12\uffff\1\136",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA93_eot = DFA.unpackEncodedString(DFA93_eotS);
	static final short[] DFA93_eof = DFA.unpackEncodedString(DFA93_eofS);
	static final char[] DFA93_min = DFA.unpackEncodedStringToUnsignedChars(DFA93_minS);
	static final char[] DFA93_max = DFA.unpackEncodedStringToUnsignedChars(DFA93_maxS);
	static final short[] DFA93_accept = DFA.unpackEncodedString(DFA93_acceptS);
	static final short[] DFA93_special = DFA.unpackEncodedString(DFA93_specialS);
	static final short[][] DFA93_transition;

	static {
		int numStates = DFA93_transitionS.length;
		DFA93_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA93_transition[i] = DFA.unpackEncodedString(DFA93_transitionS[i]);
		}
	}

	protected class DFA93 extends DFA {

		public DFA93(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 93;
			this.eot = DFA93_eot;
			this.eof = DFA93_eof;
			this.min = DFA93_min;
			this.max = DFA93_max;
			this.accept = DFA93_accept;
			this.special = DFA93_special;
			this.transition = DFA93_transition;
		}
		@Override
		public String getDescription() {
			return "208:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );";
		}
	}

	static final String DFA103_eotS =
		"\142\uffff";
	static final String DFA103_eofS =
		"\142\uffff";
	static final String DFA103_minS =
		"\1\37\1\26\1\37\1\uffff\1\26\1\31\1\37\1\26\2\uffff\1\103\2\31\1\70\1"+
		"\26\2\uffff\1\26\1\31\1\73\1\31\2\70\1\4\1\uffff\1\26\1\31\1\103\2\31"+
		"\3\70\1\4\1\uffff\1\4\1\uffff\1\103\11\uffff\1\103\2\31\1\70\1\73\1\31"+
		"\2\70\1\4\1\70\51\uffff";
	static final String DFA103_maxS =
		"\1\56\2\103\1\uffff\1\45\1\103\1\56\1\103\2\uffff\2\103\1\73\2\103\2\uffff"+
		"\1\45\1\103\2\73\2\103\1\102\1\uffff\1\45\3\103\1\73\3\103\1\102\1\uffff"+
		"\1\102\1\uffff\1\103\11\uffff\2\103\1\73\1\103\2\73\2\103\1\70\1\103\51"+
		"\uffff";
	static final String DFA103_acceptS =
		"\3\uffff\1\2\24\uffff\1\1\40\uffff\1\1\1\uffff\1\1\1\uffff\1\1\11\uffff"+
		"\1\1\11\uffff\15\1\1\uffff\2\1\1\uffff";
	static final String DFA103_specialS =
		"\142\uffff}>";
	static final String[] DFA103_transitionS = {
			"\1\1\11\uffff\1\2\4\uffff\1\3",
			"\1\5\54\uffff\1\4",
			"\1\7\11\uffff\1\3\4\uffff\1\3\24\uffff\1\6",
			"",
			"\1\13\16\uffff\1\12",
			"\1\15\15\uffff\1\15\23\uffff\1\15\7\uffff\1\14",
			"\1\16\11\uffff\1\3\4\uffff\1\3",
			"\1\22\54\uffff\1\21",
			"",
			"",
			"\1\23",
			"\1\25\15\uffff\1\25\23\uffff\1\25\7\uffff\1\24",
			"\1\26\15\uffff\1\26\23\uffff\1\26",
			"\1\30\12\uffff\1\27",
			"\1\32\54\uffff\1\31",
			"",
			"",
			"\1\34\16\uffff\1\33",
			"\1\36\15\uffff\1\36\23\uffff\1\36\7\uffff\1\35",
			"\1\37",
			"\1\40\15\uffff\1\40\23\uffff\1\40",
			"\1\30\12\uffff\1\41",
			"\1\30\12\uffff\1\43",
			"\1\45\3\uffff\1\30\22\uffff\1\30\2\uffff\1\30\3\uffff\1\30\1\uffff\1"+
			"\30\1\uffff\1\30\14\uffff\1\45\1\30\2\uffff\2\30\5\uffff\1\30\3\uffff"+
			"\1\30",
			"",
			"\1\60\16\uffff\1\57",
			"\1\62\15\uffff\1\62\23\uffff\1\62\7\uffff\1\61",
			"\1\63",
			"\1\65\15\uffff\1\65\23\uffff\1\65\7\uffff\1\64",
			"\1\66\15\uffff\1\66\23\uffff\1\66",
			"\1\70\12\uffff\1\67",
			"\1\30\12\uffff\1\71",
			"\1\30\12\uffff\1\73",
			"\1\75\3\uffff\1\30\22\uffff\1\30\2\uffff\1\30\3\uffff\1\30\1\uffff\1"+
			"\30\1\uffff\1\30\14\uffff\1\75\1\30\2\uffff\2\30\5\uffff\1\30\3\uffff"+
			"\1\30",
			"",
			"\1\107\3\uffff\1\30\22\uffff\1\30\2\uffff\1\30\3\uffff\1\30\1\uffff"+
			"\1\30\1\uffff\1\30\14\uffff\1\107\1\30\2\uffff\2\30\5\uffff\1\30\3\uffff"+
			"\1\30",
			"",
			"\1\121",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\122",
			"\1\124\15\uffff\1\124\23\uffff\1\124\7\uffff\1\123",
			"\1\125\15\uffff\1\125\23\uffff\1\125",
			"\1\127\12\uffff\1\126",
			"\1\130",
			"\1\131\15\uffff\1\131\23\uffff\1\131",
			"\1\133\12\uffff\1\132",
			"\1\135\12\uffff\1\134",
			"\1\3\56\uffff\1\3\4\uffff\1\137",
			"\1\30\12\uffff\1\140",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA103_eot = DFA.unpackEncodedString(DFA103_eotS);
	static final short[] DFA103_eof = DFA.unpackEncodedString(DFA103_eofS);
	static final char[] DFA103_min = DFA.unpackEncodedStringToUnsignedChars(DFA103_minS);
	static final char[] DFA103_max = DFA.unpackEncodedStringToUnsignedChars(DFA103_maxS);
	static final short[] DFA103_accept = DFA.unpackEncodedString(DFA103_acceptS);
	static final short[] DFA103_special = DFA.unpackEncodedString(DFA103_specialS);
	static final short[][] DFA103_transition;

	static {
		int numStates = DFA103_transitionS.length;
		DFA103_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA103_transition[i] = DFA.unpackEncodedString(DFA103_transitionS[i]);
		}
	}

	protected class DFA103 extends DFA {

		public DFA103(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 103;
			this.eot = DFA103_eot;
			this.eof = DFA103_eof;
			this.min = DFA103_min;
			this.max = DFA103_max;
			this.accept = DFA103_accept;
			this.special = DFA103_special;
			this.transition = DFA103_transition;
		}
		@Override
		public String getDescription() {
			return "260:4: (a= simpleFilter |a= simpleLogicalFilter )";
		}
	}

	static final String DFA123_eotS =
		"\130\uffff";
	static final String DFA123_eofS =
		"\130\uffff";
	static final String DFA123_minS =
		"\2\5\1\31\4\uffff\1\31\1\uffff\1\31\3\uffff\1\51\1\73\1\uffff\1\31\3\uffff"+
		"\1\51\1\73\4\uffff\1\51\1\73\1\uffff\1\51\1\37\1\73\4\uffff\1\51\1\73"+
		"\1\uffff\1\51\1\37\1\73\1\uffff\1\51\1\37\1\73\1\uffff\2\37\1\70\1\uffff"+
		"\1\51\1\37\1\73\1\uffff\2\37\1\70\1\uffff\2\37\1\70\1\uffff\1\37\3\70"+
		"\25\uffff";
	static final String DFA123_maxS =
		"\1\103\1\102\1\103\4\uffff\1\103\1\uffff\1\100\3\uffff\2\103\1\uffff\1"+
		"\100\3\uffff\2\103\4\uffff\2\103\1\uffff\1\51\1\103\1\73\4\uffff\2\103"+
		"\1\uffff\1\51\1\103\1\73\1\uffff\1\51\1\103\1\73\1\uffff\1\103\1\37\1"+
		"\103\1\uffff\1\51\1\103\1\73\1\uffff\1\103\1\37\1\103\1\uffff\1\103\1"+
		"\37\1\103\1\uffff\1\37\2\103\1\70\25\uffff";
	static final String DFA123_acceptS =
		"\3\uffff\1\2\6\uffff\3\1\4\uffff\3\1\3\uffff\3\1\6\uffff\4\1\6\uffff\1"+
		"\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\4\uffff"+
		"\25\1";
	static final String DFA123_specialS =
		"\130\uffff}>";
	static final String[] DFA123_transitionS = {
			"\1\2\62\uffff\1\3\12\uffff\1\1",
			"\1\7\30\uffff\1\3\3\uffff\1\3\1\uffff\1\3\22\uffff\2\3\11\uffff\1\3",
			"\1\12\5\uffff\1\14\1\uffff\1\16\5\uffff\1\13\1\uffff\1\3\26\uffff\1"+
			"\15\2\uffff\1\11",
			"",
			"",
			"",
			"",
			"\1\21\5\uffff\1\23\1\uffff\1\25\5\uffff\1\22\1\uffff\1\3\26\uffff\1"+
			"\24\2\uffff\1\20",
			"",
			"\1\27\5\uffff\1\31\1\uffff\1\33\5\uffff\1\30\1\uffff\1\3\26\uffff\1"+
			"\32",
			"",
			"",
			"",
			"\1\36\31\uffff\1\35",
			"\1\40\7\uffff\1\37",
			"",
			"\1\41\5\uffff\1\43\1\uffff\1\45\5\uffff\1\42\1\uffff\1\3\26\uffff\1"+
			"\44",
			"",
			"",
			"",
			"\1\50\31\uffff\1\47",
			"\1\52\7\uffff\1\51",
			"",
			"",
			"",
			"",
			"\1\54\31\uffff\1\53",
			"\1\56\7\uffff\1\55",
			"",
			"\1\57",
			"\1\61\43\uffff\1\60",
			"\1\62",
			"",
			"",
			"",
			"",
			"\1\64\31\uffff\1\63",
			"\1\66\7\uffff\1\65",
			"",
			"\1\67",
			"\1\71\43\uffff\1\70",
			"\1\72",
			"",
			"\1\73",
			"\1\75\43\uffff\1\74",
			"\1\76",
			"",
			"\1\100\43\uffff\1\77",
			"\1\101",
			"\1\103\12\uffff\1\102",
			"",
			"\1\104",
			"\1\106\43\uffff\1\105",
			"\1\107",
			"",
			"\1\111\43\uffff\1\110",
			"\1\112",
			"\1\114\12\uffff\1\113",
			"",
			"\1\116\43\uffff\1\115",
			"\1\117",
			"\1\121\12\uffff\1\120",
			"",
			"\1\122",
			"\1\124\12\uffff\1\123",
			"\1\126\12\uffff\1\125",
			"\1\127",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA123_eot = DFA.unpackEncodedString(DFA123_eotS);
	static final short[] DFA123_eof = DFA.unpackEncodedString(DFA123_eofS);
	static final char[] DFA123_min = DFA.unpackEncodedStringToUnsignedChars(DFA123_minS);
	static final char[] DFA123_max = DFA.unpackEncodedStringToUnsignedChars(DFA123_maxS);
	static final short[] DFA123_accept = DFA.unpackEncodedString(DFA123_acceptS);
	static final short[] DFA123_special = DFA.unpackEncodedString(DFA123_specialS);
	static final short[][] DFA123_transition;

	static {
		int numStates = DFA123_transitionS.length;
		DFA123_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA123_transition[i] = DFA.unpackEncodedString(DFA123_transitionS[i]);
		}
	}

	protected class DFA123 extends DFA {

		public DFA123(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 123;
			this.eot = DFA123_eot;
			this.eof = DFA123_eof;
			this.min = DFA123_min;
			this.max = DFA123_max;
			this.accept = DFA123_accept;
			this.special = DFA123_special;
			this.transition = DFA123_transition;
		}
		@Override
		public String getDescription() {
			return "314:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?";
		}
	}

	public static final BitSet FOLLOW_statement_in_program42 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_program52 = new BitSet(new long[]{0x0080001400000000L});
	public static final BitSet FOLLOW_set_in_program56 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_program66 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_program69 = new BitSet(new long[]{0x0400000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_program71 = new BitSet(new long[]{0x0400000000000000L});
	public static final BitSet FOLLOW_statement_in_program77 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_program82 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_program85 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_program87 = new BitSet(new long[]{0x0002000000000000L});
	public static final BitSet FOLLOW_ON_in_program90 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_program92 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_program95 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_program97 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_program103 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_program108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_program111 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_program113 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_program118 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_program124 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_program127 = new BitSet(new long[]{0x0004000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_program129 = new BitSet(new long[]{0x0004000000000002L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_program134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_statement160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement162 = new BitSet(new long[]{0x0000190280101000L,0x0000000000000021L});
	public static final BitSet FOLLOW_selectItems_in_statement189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_statement193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_statement196 = new BitSet(new long[]{0x0000190280101000L,0x0000000000000009L});
	public static final BitSet FOLLOW_WS_in_statement198 = new BitSet(new long[]{0x0000190280101000L,0x0000000000000001L});
	public static final BitSet FOLLOW_selectItems_in_statement201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_69_in_statement232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement250 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_FROM_in_statement252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement254 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_statement258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_statement277 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement279 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_whereClause_in_statement281 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement298 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_BREAK_in_statement300 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement302 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BY_in_statement304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement306 = new BitSet(new long[]{0x0820000000200000L});
	public static final BitSet FOLLOW_granularityClause_in_statement308 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement319 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_GROUP_in_statement321 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement323 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BY_in_statement325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement327 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_statement353 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_statement385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_statement388 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement390 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_statement395 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_statement452 = new BitSet(new long[]{0x0000000010000000L});
	public static final BitSet FOLLOW_HAVING_in_statement454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement456 = new BitSet(new long[]{0x0000400080000000L});
	public static final BitSet FOLLOW_havingClause_in_statement460 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement504 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_ORDER_in_statement506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement508 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BY_in_statement510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement512 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_statement517 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement544 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_LIMIT_in_statement546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement548 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LONG_in_statement553 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement593 = new BitSet(new long[]{0x4000000000000000L});
	public static final BitSet FOLLOW_THEN_in_statement595 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement597 = new BitSet(new long[]{0x0000028282000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_postAggItem_in_statement601 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement616 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_WHICH_in_statement618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement620 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CONTAINS_in_statement622 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement626 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_statement629 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement631 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement637 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_statement641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_statement644 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement646 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement651 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_statement658 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_statement661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement667 = new BitSet(new long[]{0x1000000000000000L});
	public static final BitSet FOLLOW_SORT_in_statement669 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement671 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_statement674 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement676 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement682 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement687 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_statement690 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement702 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_HINT_in_statement704 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement706 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_statement709 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement711 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement716 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_statement720 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_statement723 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggItemInSelect_in_selectItems742 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDim_in_selectItems750 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleDim766 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleDim769 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_simpleDim771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleDim773 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_simpleDim777 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intervalClause_in_whereClause798 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_whereClause802 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_whereClause804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_whereClause806 = new BitSet(new long[]{0x0000420080000000L});
	public static final BitSet FOLLOW_grandFilter_in_whereClause810 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_71_in_intervalClause829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_intervalClause831 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_BETWEEN_in_intervalClause833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_intervalClause835 = new BitSet(new long[]{0x08000200000FC000L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause855 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_intervalClause866 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_intervalClause868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_intervalClause870 = new BitSet(new long[]{0x08000000000FC000L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause882 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_intervalClause907 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_intervalClause909 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause914 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_intervalClause926 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_intervalClause929 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_intervalClause931 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause936 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_intervalClause942 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_intervalClause945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_getEquals968 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_getEquals970 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_EQUALS_in_getEquals973 = new BitSet(new long[]{0x0800008002000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_getEquals975 = new BitSet(new long[]{0x0800008002000000L});
	public static final BitSet FOLLOW_set_in_getEquals981 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1019 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_granularityClause1043 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1047 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause1050 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1052 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1057 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_granularityClause1061 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_70_in_granularityClause1065 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1067 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1072 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_granularityClause1079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_granularityClause1082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1084 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause1087 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1090 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_granularityClause1114 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1118 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause1121 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1123 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1128 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_granularityClause1132 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_70_in_granularityClause1136 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1138 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1143 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_granularityClause1149 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_70_in_granularityClause1153 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1155 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1160 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_granularityClause1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_granularityClause1170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause1175 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityClause1178 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause1183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_granularityInclude1205 = new BitSet(new long[]{0x0000000100000000L});
	public static final BitSet FOLLOW_INCLUDE_in_granularityInclude1207 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityInclude1209 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityInclude1212 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_granularityInclude1214 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude1220 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_70_in_granularityInclude1225 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude1229 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_granularityInclude1236 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_granularityInclude1239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairNums1258 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_pairNums1260 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums1265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_pairNums1268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_pairNums1271 = new BitSet(new long[]{0x0000008000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_pairNums1273 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums1278 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_pairNums1280 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RSQUARE_in_pairNums1283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairString1303 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_pairString1305 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000048L});
	public static final BitSet FOLLOW_WS_in_pairString1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_70_in_pairString1316 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_pairString1318 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1323 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_pairString1325 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_RSQUARE_in_pairString1328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexHaving_in_havingClause1353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleHaving1374 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1376 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1381 = new BitSet(new long[]{0x0000008002000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1383 = new BitSet(new long[]{0x0000008002000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving1388 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_simpleHaving1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleHaving1416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1418 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_simpleHaving1422 = new BitSet(new long[]{0x0000000000000400L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1424 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1429 = new BitSet(new long[]{0x0000008002000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1431 = new BitSet(new long[]{0x0000008002000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleHaving_in_complexHaving1464 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleHaving_in_complexHaving1475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_complexHaving1477 = new BitSet(new long[]{0x0008000000000010L});
	public static final BitSet FOLLOW_set_in_complexHaving1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_complexHaving1487 = new BitSet(new long[]{0x0000400080000000L});
	public static final BitSet FOLLOW_complexHaving_in_complexHaving1491 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_selectorFilter1528 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_regexFilter1557 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_regexFilter1559 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_LIKE_in_regexFilter1561 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_regexFilter1563 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1569 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectorFilter_in_simpleFilter1594 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_regexFilter_in_simpleFilter1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_simpleFilter1610 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleFilter1612 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_selectorFilter_in_simpleFilter1618 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_regexFilter_in_simpleFilter1624 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleFilter1627 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_simpleFilter1630 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1653 = new BitSet(new long[]{0x0008000000000010L});
	public static final BitSet FOLLOW_set_in_simpleLogicalFilter1657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1663 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleLogicalFilter1675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1677 = new BitSet(new long[]{0x0000020080000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_simpleLogicalFilter1694 = new BitSet(new long[]{0x0000420080000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1696 = new BitSet(new long[]{0x0000420080000000L});
	public static final BitSet FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter1701 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1703 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_simpleLogicalFilter1706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_grandFilter1730 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_simpleLogicalFilter_in_grandFilter1736 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_grandFilter1743 = new BitSet(new long[]{0x0008000000000010L});
	public static final BitSet FOLLOW_set_in_grandFilter1747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_grandFilter1753 = new BitSet(new long[]{0x0000420080000000L});
	public static final BitSet FOLLOW_grandFilter_in_grandFilter1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggCallSite_in_aggItemInSelect1794 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_aggItemInSelect1798 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_aggItemInSelect1800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_aggItemInSelect1802 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_aggItemInSelect1806 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggFunc_in_aggCallSite1825 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_aggCallSite1830 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_aggCallSite1833 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_aggCallSite1835 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_aggCallSite1842 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_aggCallSite1847 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_aggCallSite1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_aggCallSite1857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
	public static final BitSet FOLLOW_68_in_aggCallSite1862 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_SUM_in_aggFunc1880 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_SUM_in_aggFunc1887 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_aggFunc1894 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_aggFunc1901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAX_in_aggFunc1908 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_aggFunc1915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleArith_in_postAggItem1943 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_postAggItem1947 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem1950 = new BitSet(new long[]{0x0000028282000000L,0x0000000000000009L});
	public static final BitSet FOLLOW_WS_in_postAggItem1953 = new BitSet(new long[]{0x0000028282000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem1958 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_postAggItem1976 = new BitSet(new long[]{0x0000028282000000L,0x0000000000000009L});
	public static final BitSet FOLLOW_WS_in_postAggItem1978 = new BitSet(new long[]{0x0000028282000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem1983 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_postAggItem1985 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_postAggItem1988 = new BitSet(new long[]{0x0000000000000062L,0x0000000000000008L});
	public static final BitSet FOLLOW_postAggLabel_in_postAggItem1992 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_postAggItem1998 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem2001 = new BitSet(new long[]{0x0000028282000000L,0x0000000000000009L});
	public static final BitSet FOLLOW_WS_in_postAggItem2004 = new BitSet(new long[]{0x0000028282000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem2009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2045 = new BitSet(new long[]{0x0000000000000022L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_simpleArith2051 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_simpleArith2054 = new BitSet(new long[]{0x0000008282000000L,0x0000000000000009L});
	public static final BitSet FOLLOW_WS_in_simpleArith2057 = new BitSet(new long[]{0x0000008282000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2062 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAccess_in_simplePostAggAccess2091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldAccess_in_simplePostAggAccess2108 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constantAccess2160 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_LONG_in_constantAccess2166 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_constantAccess2179 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_constantAccess2181 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldAccess2209 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_fieldAccess2212 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_fieldAccess2214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_hyperUniqueCardinality2243 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2245 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_LPARAN_in_hyperUniqueCardinality2248 = new BitSet(new long[]{0x0000000080000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2250 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_hyperUniqueCardinality2255 = new BitSet(new long[]{0x0100000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2257 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_RPARAN_in_hyperUniqueCardinality2260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2286 = new BitSet(new long[]{0x0800000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_postAggJavascriptDef2288 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_postAggLabel2309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_WS_in_postAggLabel2311 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_ID_in_postAggLabel2315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARITH_OPER_in_postAggArithOper2331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_in_isoTime2350 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_in_isoTime2358 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2382 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2390 = new BitSet(new long[]{0x0000000000000002L});
}
