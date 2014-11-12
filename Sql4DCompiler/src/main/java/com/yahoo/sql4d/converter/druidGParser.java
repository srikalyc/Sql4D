// $ANTLR 3.5 /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2014-11-11 19:30:18

	package com.yahoo.sql4d.converter;

import com.yahoo.sql4d.insert.nodes.GranularitySpec;
	import org.antlr.runtime.*;
	import java.util.ArrayList;
	import java.util.Arrays;

	import com.yahoo.sql4d.*;
	import static com.yahoo.sql4d.Utils.*;
	import com.yahoo.sql4d.beans.*;
	import com.yahoo.sql4d.insert.*;
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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
@SuppressWarnings("all")
public class druidGParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARITH_OPER", "AS", "ASC", 
		"AUTO_ISO", "BETWEEN", "BREAK", "BY", "COMPARE_OPER", "CONTAINS", "COUNT", 
		"DATE", "DATE_HOUR", "DATE_HOUR_MIN", "DATE_HOUR_MIN_SEC", "DATE_HOUR_MIN_SEC_SUB", 
		"DATE_HOUR_MIN_SEC_SUB_TZ", "DATE_HOUR_MIN_SEC_SUB_UTC_TZ", "DATE_YEAR_MONTH_ONLY", 
		"DATE_YEAR_ONLY", "DELETE", "DELIMITED", "DESC", "DOUBLE_SUM", "DROP", 
		"DURATION", "EQUALS", "ESC_SEQ", "FIELD_ACCESS", "FLOAT", "FROM", "GROUP", 
		"HAVING", "HEX_DIGIT", "HINT", "ID", "INCLUDE", "INSERT", "INSERT_HADOOP", 
		"INSERT_REALTIME", "INTO", "ISO", "JAVASCRIPT", "JOIN", "KAFKA", "LCURLY", 
		"LEFT_JOIN", "LIKE", "LIMIT", "LONG", "LONG_SUM", "LPARAN", "LSQUARE", 
		"MAX", "MAX_WINDOW", "MIN", "NEWLINE", "NOT", "NUM", "OCTAL_ESC", "ON", 
		"OPT_SEMI_COLON", "OR", "ORDER", "PARTITION_SIZE", "PERIOD", "RCURLY", 
		"RIGHT_JOIN", "RPARAN", "RSQUARE", "SELECT", "SINGLE_QUOTE_STRING", "SORT", 
		"STRING", "TABLE", "THEN", "UNICODE_ESC", "UNIQUE", "VALUES", "WHERE", 
		"WHICH", "WS", "'(*)'", "'*'", "','", "'interval'"
	};
	public static final int EOF=-1;
	public static final int T__86=86;
	public static final int T__87=87;
	public static final int T__88=88;
	public static final int T__89=89;
	public static final int AND=4;
	public static final int ARITH_OPER=5;
	public static final int AS=6;
	public static final int ASC=7;
	public static final int AUTO_ISO=8;
	public static final int BETWEEN=9;
	public static final int BREAK=10;
	public static final int BY=11;
	public static final int COMPARE_OPER=12;
	public static final int CONTAINS=13;
	public static final int COUNT=14;
	public static final int DATE=15;
	public static final int DATE_HOUR=16;
	public static final int DATE_HOUR_MIN=17;
	public static final int DATE_HOUR_MIN_SEC=18;
	public static final int DATE_HOUR_MIN_SEC_SUB=19;
	public static final int DATE_HOUR_MIN_SEC_SUB_TZ=20;
	public static final int DATE_HOUR_MIN_SEC_SUB_UTC_TZ=21;
	public static final int DATE_YEAR_MONTH_ONLY=22;
	public static final int DATE_YEAR_ONLY=23;
	public static final int DELETE=24;
	public static final int DELIMITED=25;
	public static final int DESC=26;
	public static final int DOUBLE_SUM=27;
	public static final int DROP=28;
	public static final int DURATION=29;
	public static final int EQUALS=30;
	public static final int ESC_SEQ=31;
	public static final int FIELD_ACCESS=32;
	public static final int FLOAT=33;
	public static final int FROM=34;
	public static final int GROUP=35;
	public static final int HAVING=36;
	public static final int HEX_DIGIT=37;
	public static final int HINT=38;
	public static final int ID=39;
	public static final int INCLUDE=40;
	public static final int INSERT=41;
	public static final int INSERT_HADOOP=42;
	public static final int INSERT_REALTIME=43;
	public static final int INTO=44;
	public static final int ISO=45;
	public static final int JAVASCRIPT=46;
	public static final int JOIN=47;
	public static final int KAFKA=48;
	public static final int LCURLY=49;
	public static final int LEFT_JOIN=50;
	public static final int LIKE=51;
	public static final int LIMIT=52;
	public static final int LONG=53;
	public static final int LONG_SUM=54;
	public static final int LPARAN=55;
	public static final int LSQUARE=56;
	public static final int MAX=57;
	public static final int MAX_WINDOW=58;
	public static final int MIN=59;
	public static final int NEWLINE=60;
	public static final int NOT=61;
	public static final int NUM=62;
	public static final int OCTAL_ESC=63;
	public static final int ON=64;
	public static final int OPT_SEMI_COLON=65;
	public static final int OR=66;
	public static final int ORDER=67;
	public static final int PARTITION_SIZE=68;
	public static final int PERIOD=69;
	public static final int RCURLY=70;
	public static final int RIGHT_JOIN=71;
	public static final int RPARAN=72;
	public static final int RSQUARE=73;
	public static final int SELECT=74;
	public static final int SINGLE_QUOTE_STRING=75;
	public static final int SORT=76;
	public static final int STRING=77;
	public static final int TABLE=78;
	public static final int THEN=79;
	public static final int UNICODE_ESC=80;
	public static final int UNIQUE=81;
	public static final int VALUES=82;
	public static final int WHERE=83;
	public static final int WHICH=84;
	public static final int WS=85;

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
	@Override public String getGrammarFileName() { return "/Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g"; }



	// $ANTLR start "program"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:1: program returns [Program program] : ( (s1= grandQuery ) | (s2= grandInsert ) );
	public final Program program()  throws RecognitionException {
		Program program = null;


		QueryProgram s1 =null;
		InsertProgram s2 =null;

		 program = null; 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:2: ( (s1= grandQuery ) | (s2= grandInsert ) )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==SELECT) ) {
				alt1=1;
			}
			else if ( (LA1_0==INSERT) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:4: (s1= grandQuery )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:4: (s1= grandQuery )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:5: s1= grandQuery
					{
					pushFollow(FOLLOW_grandQuery_in_program42);
					s1=grandQuery();
					state._fsp--;

					}

					 program = s1; 
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:4: (s2= grandInsert )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:4: (s2= grandInsert )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:5: s2= grandInsert
					{
					pushFollow(FOLLOW_grandInsert_in_program54);
					s2=grandInsert();
					state._fsp--;

					}

					 program = s2; 
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
		return program;
	}
	// $ANTLR end "program"



	// $ANTLR start "grandInsert"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:46:1: grandInsert returns [InsertProgram program] : (s1= insertStmnt ) ( WS )? ( OPT_SEMI_COLON )? ;
	public final InsertProgram grandInsert()  throws RecognitionException {
		InsertProgram program = null;


		InsertMeta s1 =null;

		 program = null; 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:2: ( (s1= insertStmnt ) ( WS )? ( OPT_SEMI_COLON )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:4: (s1= insertStmnt ) ( WS )? ( OPT_SEMI_COLON )?
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:4: (s1= insertStmnt )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:5: s1= insertStmnt
			{
			pushFollow(FOLLOW_insertStmnt_in_grandInsert84);
			s1=insertStmnt();
			state._fsp--;

			}

			 program = InsertProgram.getInsertInstance();program.addStmnt(s1); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:4: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandInsert93); 
					}
					break;

			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:8: ( OPT_SEMI_COLON )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==OPT_SEMI_COLON) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:8: OPT_SEMI_COLON
					{
					match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandInsert96); 
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
	// $ANTLR end "grandInsert"



	// $ANTLR start "insertStmnt"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:52:1: insertStmnt returns [InsertMeta iMeta] : ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ;
	public final InsertMeta insertStmnt()  throws RecognitionException {
		InsertMeta iMeta = null;


		Token id=null;
		Token gran=null;
		Object a =null;
		List<Interval> i =null;

		 iMeta = new InsertMeta();      
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:2: ( ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:4: INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT,FOLLOW_INSERT_in_insertStmnt120); 
			match(input,WS,FOLLOW_WS_in_insertStmnt122); 
			match(input,INTO,FOLLOW_INTO_in_insertStmnt124); 
			match(input,WS,FOLLOW_WS_in_insertStmnt126); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:22: (id= ID )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:23: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertStmnt131); 
			iMeta.dataSource = (id!=null?id.getText():null); 
			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:62: ( WS )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==WS) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:62: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt136); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt139); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:73: ( WS )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==WS) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:73: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt141); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertStmnt144);
			selectItems(iMeta);
			state._fsp--;

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:96: ( ( WS )? ',' ( WS )? selectItems[iMeta] )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==WS) ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1==88) ) {
						alt8=1;
					}

				}
				else if ( (LA8_0==88) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:97: ( WS )? ',' ( WS )? selectItems[iMeta]
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:97: ( WS )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==WS) ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:97: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt148); 
							}
							break;

					}

					match(input,88,FOLLOW_88_in_insertStmnt151); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:105: ( WS )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==WS) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:105: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt153); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertStmnt156);
					selectItems(iMeta);
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:130: ( WS )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==WS) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:130: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt161); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt164); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:141: ( WS )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==WS) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:141: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt166); 
					}
					break;

			}

			}

			match(input,VALUES,FOLLOW_VALUES_in_insertStmnt172); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:10: ( WS )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==WS) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:10: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt174); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt177); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:21: ( WS )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==WS) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:21: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt179); 
					}
					break;

			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:25: (a= anyValue )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:26: a= anyValue
			{
			pushFollow(FOLLOW_anyValue_in_insertStmnt185);
			a=anyValue();
			state._fsp--;

			iMeta.values.add(a);
			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:62: ( ( WS )? ',' ( WS )? a= anyValue )*
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==WS) ) {
					int LA15_1 = input.LA(2);
					if ( (LA15_1==88) ) {
						alt15=1;
					}

				}
				else if ( (LA15_0==88) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:63: ( WS )? ',' ( WS )? a= anyValue
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:63: ( WS )?
					int alt13=2;
					int LA13_0 = input.LA(1);
					if ( (LA13_0==WS) ) {
						alt13=1;
					}
					switch (alt13) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:63: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt192); 
							}
							break;

					}

					match(input,88,FOLLOW_88_in_insertStmnt195); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:71: ( WS )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==WS) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:71: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt197); 
							}
							break;

					}

					pushFollow(FOLLOW_anyValue_in_insertStmnt202);
					a=anyValue();
					state._fsp--;

					iMeta.values.add(a);
					}
					break;

				default :
					break loop15;
				}
			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:111: ( WS )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==WS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:111: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt208); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt211); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:122: ( WS )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==WS) ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:122: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt213); 
					}
					break;

			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:3: ( WHERE WS i= intervalClause )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==WHERE) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:4: WHERE WS i= intervalClause
					{
					match(input,WHERE,FOLLOW_WHERE_in_insertStmnt219); 
					match(input,WS,FOLLOW_WS_in_insertStmnt221); 
					pushFollow(FOLLOW_intervalClause_in_insertStmnt225);
					i=intervalClause();
					state._fsp--;

					}
					break;

			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==WS) ) {
				int LA19_1 = input.LA(2);
				if ( (LA19_1==BREAK) ) {
					alt19=1;
				}
			}
			switch (alt19) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt233); 
					match(input,BREAK,FOLLOW_BREAK_in_insertStmnt235); 
					match(input,WS,FOLLOW_WS_in_insertStmnt237); 
					match(input,BY,FOLLOW_BY_in_insertStmnt239); 
					match(input,WS,FOLLOW_WS_in_insertStmnt241); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt245); 
					 iMeta.granularitySpec = new GranularitySpec(unquote((gran!=null?gran.getText():null)));
					}
					break;

			}

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
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
		return iMeta;
	}
	// $ANTLR end "insertStmnt"



	// $ANTLR start "grandQuery"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:1: grandQuery returns [QueryProgram program] : (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? ;
	public final QueryProgram grandQuery()  throws RecognitionException {
		QueryProgram program = null;


		Token j=null;
		Token a=null;
		QueryMeta s1 =null;
		QueryMeta s2 =null;

		 program = null; 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:2: ( (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:4: (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )?
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:4: (s1= queryStmnt )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:5: s1= queryStmnt
			{
			pushFollow(FOLLOW_queryStmnt_in_grandQuery279);
			s1=queryStmnt();
			state._fsp--;

			}

			 program = new QueryProgram();program.addStmnt(s1); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:4: ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==WS) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==JOIN||LA30_1==LEFT_JOIN||LA30_1==RIGHT_JOIN) ) {
					alt30=1;
				}
			}
			switch (alt30) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:5: WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN
					{
					match(input,WS,FOLLOW_WS_in_grandQuery289); 
					j=input.LT(1);
					if ( input.LA(1)==JOIN||input.LA(1)==LEFT_JOIN||input.LA(1)==RIGHT_JOIN ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					program.addJoinType((j!=null?j.getText():null).toUpperCase());
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:5: ( WS )?
					int alt20=2;
					int LA20_0 = input.LA(1);
					if ( (LA20_0==WS) ) {
						alt20=1;
					}
					switch (alt20) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:5: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery314); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_grandQuery317); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:16: ( WS )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==WS) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:16: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery319); 
							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:20: (s2= queryStmnt )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:21: s2= queryStmnt
					{
					pushFollow(FOLLOW_queryStmnt_in_grandQuery325);
					s2=queryStmnt();
					state._fsp--;

					}

					program.addStmnt(s2);
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:60: ( WS )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==WS) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:60: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery330); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_grandQuery333); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:71: ( WS )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==WS) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:71: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery335); 
							}
							break;

					}

					match(input,ON,FOLLOW_ON_in_grandQuery338); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:5: ( WS )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==WS) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:5: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery345); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_grandQuery348); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:16: ( WS )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==WS) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:16: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery350); 
							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:20: (a= ID )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:21: a= ID
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_grandQuery356); 
					 program.addJoinHook((a!=null?a.getText():null)); 
					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:60: ( ( WS )? ',' ( WS )? a= ID )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( (LA28_0==WS) ) {
							int LA28_1 = input.LA(2);
							if ( (LA28_1==88) ) {
								alt28=1;
							}

						}
						else if ( (LA28_0==88) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:61: ( WS )? ',' ( WS )? a= ID
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:61: ( WS )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==WS) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:61: WS
									{
									match(input,WS,FOLLOW_WS_in_grandQuery361); 
									}
									break;

							}

							match(input,88,FOLLOW_88_in_grandQuery364); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:69: ( WS )?
							int alt27=2;
							int LA27_0 = input.LA(1);
							if ( (LA27_0==WS) ) {
								alt27=1;
							}
							switch (alt27) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:69: WS
									{
									match(input,WS,FOLLOW_WS_in_grandQuery366); 
									}
									break;

							}

							a=(Token)match(input,ID,FOLLOW_ID_in_grandQuery371); 
							 program.addJoinHook((a!=null?a.getText():null)); 
							}
							break;

						default :
							break loop28;
						}
					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:114: ( WS )?
					int alt29=2;
					int LA29_0 = input.LA(1);
					if ( (LA29_0==WS) ) {
						alt29=1;
					}
					switch (alt29) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:114: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery377); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_grandQuery380); 
					}
					break;

			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:4: ( WS )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==WS) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandQuery399); 
					}
					break;

			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:8: ( OPT_SEMI_COLON )?
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0==OPT_SEMI_COLON) ) {
				alt32=1;
			}
			switch (alt32) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:8: OPT_SEMI_COLON
					{
					match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandQuery402); 
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
	// $ANTLR end "grandQuery"



	// $ANTLR start "queryStmnt"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:76:1: queryStmnt returns [QueryMeta qMeta] : SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? ;
	public final QueryMeta queryStmnt()  throws RecognitionException {
		QueryMeta qMeta = null;


		Token id=null;
		Token dir=null;
		Token l=null;
		Token s1=null;
		Token s2=null;
		Token s=null;
		Pair<Granularity, List<Pair<Integer, Integer>>> gran =null;
		Having h =null;
		PostAggItem p =null;

		 qMeta = GroupByQueryMeta.promote(new QueryMeta());
			((BaseAggQueryMeta)qMeta).aggregations = new ArrayList<>();
			qMeta.intervals = new ArrayList<>();
		      
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:81:2: ( SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:81:4: SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_queryStmnt425); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:82:7: ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )?
			int alt36=3;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==WS) ) {
				int LA36_1 = input.LA(2);
				if ( (LA36_1==87) ) {
					alt36=2;
				}
				else if ( (LA36_1==COUNT||LA36_1==DOUBLE_SUM||LA36_1==ID||LA36_1==JAVASCRIPT||LA36_1==LONG_SUM||LA36_1==MAX||LA36_1==MIN||LA36_1==UNIQUE) ) {
					alt36=1;
				}
			}
			switch (alt36) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:83:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:83:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:9: WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt453); 
					pushFollow(FOLLOW_selectItems_in_queryStmnt455);
					selectItems(qMeta);
					state._fsp--;

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:31: ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					loop35:
					while (true) {
						int alt35=2;
						int LA35_0 = input.LA(1);
						if ( (LA35_0==WS) ) {
							int LA35_1 = input.LA(2);
							if ( (LA35_1==88) ) {
								alt35=1;
							}

						}
						else if ( (LA35_0==88) ) {
							alt35=1;
						}

						switch (alt35) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:32: ( WS )? ',' ( WS )? selectItems[qMeta]
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:32: ( WS )?
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==WS) ) {
								alt33=1;
							}
							switch (alt33) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:32: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt459); 
									}
									break;

							}

							match(input,88,FOLLOW_88_in_queryStmnt462); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:40: ( WS )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==WS) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:84:40: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt464); 
									}
									break;

							}

							pushFollow(FOLLOW_selectItems_in_queryStmnt467);
							selectItems(qMeta);
							state._fsp--;

							}
							break;

						default :
							break loop35;
						}
					}

					}

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:8: ( WS '*' )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:8: ( WS '*' )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:9: WS '*'
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt498); 
					match(input,87,FOLLOW_87_in_queryStmnt500); 
					}

					}
					break;

			}

			match(input,WS,FOLLOW_WS_in_queryStmnt515); 
			match(input,FROM,FOLLOW_FROM_in_queryStmnt517); 
			match(input,WS,FOLLOW_WS_in_queryStmnt519); 
			id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt523); 
			 
				  	qMeta.dataSource = (id!=null?id.getText():null); 
			  	  	if (((BaseAggQueryMeta)qMeta).aggregations.isEmpty()) {
				  		qMeta = SelectQueryMeta.promote(qMeta);
				  	}
				    
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:96:2: ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==WS) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==WHERE) ) {
					alt61=1;
				}
			}
			switch (alt61) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:97:4: WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt539); 
					match(input,WHERE,FOLLOW_WHERE_in_queryStmnt541); 
					match(input,WS,FOLLOW_WS_in_queryStmnt543); 
					pushFollow(FOLLOW_whereClause_in_queryStmnt545);
					whereClause(qMeta);
					state._fsp--;

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:4: ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:99:5: ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )?
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:99:5: ( WS BREAK WS BY WS gran= granularityClause )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==WS) ) {
						int LA37_1 = input.LA(2);
						if ( (LA37_1==BREAK) ) {
							alt37=1;
						}
					}
					switch (alt37) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:99:6: WS BREAK WS BY WS gran= granularityClause
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt562); 
							match(input,BREAK,FOLLOW_BREAK_in_queryStmnt564); 
							match(input,WS,FOLLOW_WS_in_queryStmnt566); 
							match(input,BY,FOLLOW_BY_in_queryStmnt568); 
							match(input,WS,FOLLOW_WS_in_queryStmnt570); 
							pushFollow(FOLLOW_granularityClause_in_queryStmnt574);
							gran=granularityClause();
							state._fsp--;


									      qMeta.granularity = gran.a;
									      if (gran.b != null) {
									        qMeta.microIntervals.addAll(gran.b);
									      }
									    
							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:106:5: ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==WS) ) {
						int LA42_1 = input.LA(2);
						if ( (LA42_1==GROUP) ) {
							alt42=1;
						}
					}
					switch (alt42) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:106:6: WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )?
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt591); 
							match(input,GROUP,FOLLOW_GROUP_in_queryStmnt593); 
							match(input,WS,FOLLOW_WS_in_queryStmnt595); 
							match(input,BY,FOLLOW_BY_in_queryStmnt597); 
							match(input,WS,FOLLOW_WS_in_queryStmnt599); 

									       qMeta = GroupByQueryMeta.promote(qMeta);
									       if (((GroupByQueryMeta)qMeta).fetchDimensions == null) {
									          System.err.println("No dimensions !! ");
									       }
									      
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:113:10: (id= ID ( ( WS )? ',' ( WS )? id= ID )* )
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:113:11: id= ID ( ( WS )? ',' ( WS )? id= ID )*
							{
							id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt625); 

									              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
									                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
									              }   
									           
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:14: ( ( WS )? ',' ( WS )? id= ID )*
							loop40:
							while (true) {
								int alt40=2;
								int LA40_0 = input.LA(1);
								if ( (LA40_0==WS) ) {
									int LA40_1 = input.LA(2);
									if ( (LA40_1==88) ) {
										alt40=1;
									}

								}
								else if ( (LA40_0==88) ) {
									alt40=1;
								}

								switch (alt40) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:15: ( WS )? ',' ( WS )? id= ID
									{
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:15: ( WS )?
									int alt38=2;
									int LA38_0 = input.LA(1);
									if ( (LA38_0==WS) ) {
										alt38=1;
									}
									switch (alt38) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:15: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt657); 
											}
											break;

									}

									match(input,88,FOLLOW_88_in_queryStmnt660); 
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:23: ( WS )?
									int alt39=2;
									int LA39_0 = input.LA(1);
									if ( (LA39_0==WS) ) {
										alt39=1;
									}
									switch (alt39) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:23: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt662); 
											}
											break;

									}

									id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt667); 

												              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
												                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
												              }   
											           	
									}
									break;

								default :
									break loop40;
								}
							}

							}

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:127:10: ( WS HAVING WS h= havingClause )?
							int alt41=2;
							int LA41_0 = input.LA(1);
							if ( (LA41_0==WS) ) {
								int LA41_1 = input.LA(2);
								if ( (LA41_1==HAVING) ) {
									alt41=1;
								}
							}
							switch (alt41) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:127:11: WS HAVING WS h= havingClause
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt724); 
									match(input,HAVING,FOLLOW_HAVING_in_queryStmnt726); 
									match(input,WS,FOLLOW_WS_in_queryStmnt728); 
									pushFollow(FOLLOW_havingClause_in_queryStmnt732);
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:131:5: ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )?
					int alt44=2;
					int LA44_0 = input.LA(1);
					if ( (LA44_0==WS) ) {
						int LA44_1 = input.LA(2);
						if ( (LA44_1==ORDER) ) {
							alt44=1;
						}
					}
					switch (alt44) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:131:6: WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )?
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt776); 
							match(input,ORDER,FOLLOW_ORDER_in_queryStmnt778); 
							match(input,WS,FOLLOW_WS_in_queryStmnt780); 
							match(input,BY,FOLLOW_BY_in_queryStmnt782); 
							match(input,WS,FOLLOW_WS_in_queryStmnt784); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:131:24: (id= ID )
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:131:25: id= ID
							{
							id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt789); 
							}

								
									  	if (((PlainDimQueryMeta)qMeta).fetchDimensions.size() != 1) {
										   ((GroupByQueryMeta)qMeta).limitSpec = new LimitSpec();
										   
									  	} else {// If fetchDimensions = 1 then TopN is more optimal.
									           qMeta = TopNQueryMeta.promote(qMeta);
								        	   ((TopNQueryMeta)qMeta).metric = (id!=null?id.getText():null);
									      	}
									      
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:9: ( WS dir= ( ASC | DESC ) )?
							int alt43=2;
							int LA43_0 = input.LA(1);
							if ( (LA43_0==WS) ) {
								int LA43_1 = input.LA(2);
								if ( (LA43_1==ASC||LA43_1==DESC) ) {
									alt43=1;
								}
							}
							switch (alt43) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:10: WS dir= ( ASC | DESC )
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt822); 
									dir=input.LT(1);
									if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
										input.consume();
										state.errorRecovery=false;
									}
									else {
										MismatchedSetException mse = new MismatchedSetException(null,input);
										throw mse;
									}
									 
											        if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta)qMeta).limitSpec != null) {
												    if (dir != null && (dir!=null?dir.getText():null) != null) {
												        ((GroupByQueryMeta)qMeta).limitSpec.addColumn((id!=null?id.getText():null), (dir!=null?dir.getText():null));
												    } else {
												    	((GroupByQueryMeta)qMeta).limitSpec.addColumn((id!=null?id.getText():null), "ASC");
												    }
											      	}
											      
									}
									break;

							}


										    // At this point if the qMeta is not TopN and is still GroupBy then do the following(default is ascending sort).
										    if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta)qMeta).limitSpec != null) {
										       if (!((GroupByQueryMeta)qMeta).limitSpec.columns.containsKey((id!=null?id.getText():null))) {
										       	   ((GroupByQueryMeta)qMeta).limitSpec.addColumn((id!=null?id.getText():null), "ASC");
										       }
										       
										    }

										
							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:5: ( WS LIMIT WS (l= LONG ) )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==WS) ) {
						int LA45_1 = input.LA(2);
						if ( (LA45_1==LIMIT) ) {
							alt45=1;
						}
					}
					switch (alt45) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:164:6: WS LIMIT WS (l= LONG )
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt876); 
							match(input,LIMIT,FOLLOW_LIMIT_in_queryStmnt878); 
							match(input,WS,FOLLOW_WS_in_queryStmnt880); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:164:18: (l= LONG )
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:164:19: l= LONG
							{
							l=(Token)match(input,LONG,FOLLOW_LONG_in_queryStmnt885); 
							}

								
									  	if (qMeta instanceof SelectQueryMeta) {
										    ((SelectQueryMeta)qMeta).pagingSpec.threshold = Integer.valueOf((l!=null?l.getText():null));	      	
									      	} else if (qMeta instanceof TopNQueryMeta) {
									      	    ((TopNQueryMeta)qMeta).threshold = Integer.valueOf((l!=null?l.getText():null));
									      	} else if (((PlainDimQueryMeta)qMeta).fetchDimensions.size() != 1) {
									      	    if (((GroupByQueryMeta)qMeta).limitSpec != null) {
									      	        ((GroupByQueryMeta)qMeta).limitSpec.limit = Long.valueOf((l!=null?l.getText():null));
									      	    }
									      	}
									      
							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:7: ( WS THEN WS p= postAggItem )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==WS) ) {
						int LA46_1 = input.LA(2);
						if ( (LA46_1==THEN) ) {
							alt46=1;
						}
					}
					switch (alt46) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:8: WS THEN WS p= postAggItem
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt923); 
							match(input,THEN,FOLLOW_THEN_in_queryStmnt925); 
							match(input,WS,FOLLOW_WS_in_queryStmnt927); 
							pushFollow(FOLLOW_postAggItem_in_queryStmnt931);
							p=postAggItem();
							state._fsp--;

							QueryUtils.setPostAggregation(qMeta, p);
							}
							break;

					}

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:4: ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==WS) ) {
						int LA56_1 = input.LA(2);
						if ( (LA56_1==WHICH) ) {
							alt56=1;
						}
					}
					switch (alt56) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:5: WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt946); 
							match(input,WHICH,FOLLOW_WHICH_in_queryStmnt948); 
							match(input,WS,FOLLOW_WS_in_queryStmnt950); 
							match(input,CONTAINS,FOLLOW_CONTAINS_in_queryStmnt952); 
							qMeta = SearchQueryMeta.promote(qMeta);
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:68: ( WS )?
							int alt47=2;
							int LA47_0 = input.LA(1);
							if ( (LA47_0==WS) ) {
								alt47=1;
							}
							switch (alt47) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:68: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt956); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt959); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:79: ( WS )?
							int alt48=2;
							int LA48_0 = input.LA(1);
							if ( (LA48_0==WS) ) {
								alt48=1;
							}
							switch (alt48) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:79: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt961); 
									}
									break;

							}

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:83: (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* )
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:84: s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
							{
							s1=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt967); 
							((SearchQueryMeta)qMeta).type = "insensitive_contains";((SearchQueryMeta)qMeta).addValue((s1!=null?s1.getText():null));
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:208: ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
							loop51:
							while (true) {
								int alt51=2;
								int LA51_0 = input.LA(1);
								if ( (LA51_0==WS) ) {
									int LA51_1 = input.LA(2);
									if ( (LA51_1==88) ) {
										alt51=1;
									}

								}
								else if ( (LA51_0==88) ) {
									alt51=1;
								}

								switch (alt51) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:209: ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING
									{
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:209: ( WS )?
									int alt49=2;
									int LA49_0 = input.LA(1);
									if ( (LA49_0==WS) ) {
										alt49=1;
									}
									switch (alt49) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:209: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt971); 
											}
											break;

									}

									match(input,88,FOLLOW_88_in_queryStmnt974); 
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:217: ( WS )?
									int alt50=2;
									int LA50_0 = input.LA(1);
									if ( (LA50_0==WS) ) {
										alt50=1;
									}
									switch (alt50) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:217: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt976); 
											}
											break;

									}

									s2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt981); 
									((SearchQueryMeta)qMeta).type = "fragment";((SearchQueryMeta)qMeta).addValue((s2!=null?s2.getText():null));
									}
									break;

								default :
									break loop51;
								}
							}

							}

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:337: ( WS )?
							int alt52=2;
							int LA52_0 = input.LA(1);
							if ( (LA52_0==WS) ) {
								alt52=1;
							}
							switch (alt52) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:337: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt988); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt991); 
							match(input,WS,FOLLOW_WS_in_queryStmnt997); 
							match(input,SORT,FOLLOW_SORT_in_queryStmnt999); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:13: ( WS )?
							int alt53=2;
							int LA53_0 = input.LA(1);
							if ( (LA53_0==WS) ) {
								alt53=1;
							}
							switch (alt53) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:13: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1001); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1004); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:24: ( WS )?
							int alt54=2;
							int LA54_0 = input.LA(1);
							if ( (LA54_0==WS) ) {
								alt54=1;
							}
							switch (alt54) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:24: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1006); 
									}
									break;

							}

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:28: (s= SINGLE_QUOTE_STRING )
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:29: s= SINGLE_QUOTE_STRING
							{
							s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1012); 
							}

							((SearchQueryMeta)qMeta).setSort((s!=null?s.getText():null));
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:97: ( WS )?
							int alt55=2;
							int LA55_0 = input.LA(1);
							if ( (LA55_0==WS) ) {
								alt55=1;
							}
							switch (alt55) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:97: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1017); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1020); 
							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:4: ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==WS) ) {
						int LA60_1 = input.LA(2);
						if ( (LA60_1==HINT) ) {
							alt60=1;
						}
					}
					switch (alt60) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:5: WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1032); 
							match(input,HINT,FOLLOW_HINT_in_queryStmnt1034); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:13: ( WS )?
							int alt57=2;
							int LA57_0 = input.LA(1);
							if ( (LA57_0==WS) ) {
								alt57=1;
							}
							switch (alt57) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:13: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1036); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1039); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:24: ( WS )?
							int alt58=2;
							int LA58_0 = input.LA(1);
							if ( (LA58_0==WS) ) {
								alt58=1;
							}
							switch (alt58) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:24: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1041); 
									}
									break;

							}

							s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1046); 
							qMeta = HintProcessor.process(qMeta, (s!=null?s.getText():null));
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:99: ( WS )?
							int alt59=2;
							int LA59_0 = input.LA(1);
							if ( (LA59_0==WS) ) {
								alt59=1;
							}
							switch (alt59) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:99: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1050); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1053); 
							}
							break;

					}

					}
					break;

			}


				  	if (qMeta.intervals == null || qMeta.intervals.isEmpty()) {
				  		qMeta = TimeBoundaryQueryMeta.promote(qMeta);
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
	// $ANTLR end "queryStmnt"



	// $ANTLR start "anyValue"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:193:1: anyValue returns [Object obj] : (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) );
	public final Object anyValue()  throws RecognitionException {
		Object obj = null;


		Token a=null;
		Token b=null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:194:2: (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) )
			int alt62=2;
			int LA62_0 = input.LA(1);
			if ( (LA62_0==SINGLE_QUOTE_STRING) ) {
				alt62=1;
			}
			else if ( (LA62_0==FLOAT||LA62_0==LONG) ) {
				alt62=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 62, 0, input);
				throw nvae;
			}

			switch (alt62) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:194:3: a= SINGLE_QUOTE_STRING
					{
					a=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1087); 
					obj = unquote((a!=null?a.getText():null));
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:194:53: b= ( LONG | FLOAT )
					{
					b=input.LT(1);
					if ( input.LA(1)==FLOAT||input.LA(1)==LONG ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					obj = (b!=null?b.getText():null);
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
		return obj;
	}
	// $ANTLR end "anyValue"



	// $ANTLR start "selectItems"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:197:1: selectItems[BaseStatementMeta meta] : (ai= aggItem |sd= simpleDim );
	public final void selectItems(BaseStatementMeta meta)  throws RecognitionException {
		AggItem ai =null;
		Pair<String, String> sd =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:198:2: (ai= aggItem |sd= simpleDim )
			int alt63=2;
			int LA63_0 = input.LA(1);
			if ( (LA63_0==COUNT||LA63_0==DOUBLE_SUM||LA63_0==JAVASCRIPT||LA63_0==LONG_SUM||LA63_0==MAX||LA63_0==MIN||LA63_0==UNIQUE) ) {
				alt63=1;
			}
			else if ( (LA63_0==ID) ) {
				alt63=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 63, 0, input);
				throw nvae;
			}

			switch (alt63) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:198:5: ai= aggItem
					{
					pushFollow(FOLLOW_aggItem_in_selectItems1118);
					ai=aggItem();
					state._fsp--;

					 
						      if (meta instanceof QueryMeta) {
						        ((BaseAggQueryMeta)meta).aggregations.add(ai);
						      } else if (meta instanceof InsertMeta) {
					 	        ((InsertMeta)meta).aggregations.add(ai);
						      }
						   
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:5: sd= simpleDim
					{
					pushFollow(FOLLOW_simpleDim_in_selectItems1128);
					sd=simpleDim();
					state._fsp--;

					 
						      if (meta instanceof QueryMeta) {
						         ((PlainDimQueryMeta)meta).fetchDimensions.put(sd.a, sd.b);
						      } else if (meta instanceof InsertMeta) {
					 	         ((InsertMeta)meta).fetchDimensions.put(sd.a, sd.b);
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
	// $ANTLR end "selectItems"



	// $ANTLR start "simpleDim"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:1: simpleDim returns [Pair<String, String> dims] : (a= ID ( WS AS WS b= ID )? ) ;
	public final Pair<String, String> simpleDim()  throws RecognitionException {
		Pair<String, String> dims = null;


		Token a=null;
		Token b=null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:215:2: ( (a= ID ( WS AS WS b= ID )? ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:215:4: (a= ID ( WS AS WS b= ID )? )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:215:4: (a= ID ( WS AS WS b= ID )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:215:5: a= ID ( WS AS WS b= ID )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_simpleDim1148); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:215:10: ( WS AS WS b= ID )?
			int alt64=2;
			int LA64_0 = input.LA(1);
			if ( (LA64_0==WS) ) {
				int LA64_1 = input.LA(2);
				if ( (LA64_1==AS) ) {
					alt64=1;
				}
			}
			switch (alt64) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:215:11: WS AS WS b= ID
					{
					match(input,WS,FOLLOW_WS_in_simpleDim1151); 
					match(input,AS,FOLLOW_AS_in_simpleDim1153); 
					match(input,WS,FOLLOW_WS_in_simpleDim1155); 
					b=(Token)match(input,ID,FOLLOW_ID_in_simpleDim1159); 
					}
					break;

			}


				     dims = (b != null)? new Pair<String, String>((a!=null?a.getText():null), (b!=null?b.getText():null)): new Pair<String, String>((a!=null?a.getText():null), null);
				   
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
		return dims;
	}
	// $ANTLR end "simpleDim"



	// $ANTLR start "whereClause"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:222:1: whereClause[QueryMeta qMeta] : i= intervalClause ( WS AND WS f= grandFilter )? ;
	public final void whereClause(QueryMeta qMeta)  throws RecognitionException {
		List<Interval> i =null;
		Filter f =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:223:2: (i= intervalClause ( WS AND WS f= grandFilter )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:223:3: i= intervalClause ( WS AND WS f= grandFilter )?
			{
			pushFollow(FOLLOW_intervalClause_in_whereClause1182);
			i=intervalClause();
			state._fsp--;

			qMeta.intervals.addAll(i);
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:223:49: ( WS AND WS f= grandFilter )?
			int alt65=2;
			int LA65_0 = input.LA(1);
			if ( (LA65_0==WS) ) {
				int LA65_1 = input.LA(2);
				if ( (LA65_1==AND) ) {
					alt65=1;
				}
			}
			switch (alt65) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:223:50: WS AND WS f= grandFilter
					{
					match(input,WS,FOLLOW_WS_in_whereClause1187); 
					match(input,AND,FOLLOW_AND_in_whereClause1189); 
					match(input,WS,FOLLOW_WS_in_whereClause1191); 
					pushFollow(FOLLOW_grandFilter_in_whereClause1195);
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:227:1: intervalClause returns [List<Interval> intervals] : 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) ;
	public final List<Interval> intervalClause()  throws RecognitionException {
		List<Interval> intervals = null;


		Token st2=null;
		Token et2=null;
		ParserRuleReturnScope st =null;
		ParserRuleReturnScope et =null;
		Pair<String, String> p1 =null;
		Pair<String, String> p2 =null;

		 intervals = new ArrayList<>();
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:2: ( 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:4: 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			{
			match(input,89,FOLLOW_89_in_intervalClause1221); 
			match(input,WS,FOLLOW_WS_in_intervalClause1223); 
			match(input,BETWEEN,FOLLOW_BETWEEN_in_intervalClause1225); 
			match(input,WS,FOLLOW_WS_in_intervalClause1227); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:230:2: ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( ((LA73_0 >= DATE && LA73_0 <= DATE_YEAR_ONLY)||LA73_0==SINGLE_QUOTE_STRING) ) {
				alt73=1;
			}
			else if ( (LA73_0==LPARAN) ) {
				alt73=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:231:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:231:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:7: (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:7: (st= isoTime |st2= SINGLE_QUOTE_STRING )
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( ((LA66_0 >= DATE && LA66_0 <= DATE_YEAR_ONLY)) ) {
						alt66=1;
					}
					else if ( (LA66_0==SINGLE_QUOTE_STRING) ) {
						alt66=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 66, 0, input);
						throw nvae;
					}

					switch (alt66) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:8: st= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause1247);
							st=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:22: st2= SINGLE_QUOTE_STRING
							{
							st2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause1254); 
							}
							break;

					}

					match(input,WS,FOLLOW_WS_in_intervalClause1258); 
					match(input,AND,FOLLOW_AND_in_intervalClause1260); 
					match(input,WS,FOLLOW_WS_in_intervalClause1262); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:58: (et= isoTime |et2= SINGLE_QUOTE_STRING )
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( ((LA67_0 >= DATE && LA67_0 <= DATE_YEAR_ONLY)) ) {
						alt67=1;
					}
					else if ( (LA67_0==SINGLE_QUOTE_STRING) ) {
						alt67=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 67, 0, input);
						throw nvae;
					}

					switch (alt67) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:59: et= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause1267);
							et=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:73: et2= SINGLE_QUOTE_STRING
							{
							et2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause1274); 
							}
							break;

					}

					}

					  if (st2 != null) {
								if (et2 != null) {
									intervals.add(new Interval((st2!=null?st2.getText():null), (et2!=null?et2.getText():null)));
								} else {
									intervals.add(new Interval((st2!=null?st2.getText():null), (et!=null?input.toString(et.start,et.stop):null)));
								}
							   } else {
								if (et2 != null) {
									intervals.add(new Interval((st!=null?input.toString(st.start,st.stop):null), (et2!=null?et2.getText():null)));
								} else {
									intervals.add(new Interval((st!=null?input.toString(st.start,st.stop):null), (et!=null?input.toString(et.start,et.stop):null)));
								}
							   }
							
					}

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:249:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:249:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:249:5: LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_intervalClause1299); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:249:12: ( WS )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==WS) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:249:12: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause1301); 
							}
							break;

					}

					pushFollow(FOLLOW_pairString_in_intervalClause1306);
					p1=pairString();
					state._fsp--;

					intervals.add(new Interval(p1.a, p1.b));
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:7: ( ( WS )? ',' ( WS )? p2= pairString )*
					loop71:
					while (true) {
						int alt71=2;
						int LA71_0 = input.LA(1);
						if ( (LA71_0==WS) ) {
							int LA71_1 = input.LA(2);
							if ( (LA71_1==88) ) {
								alt71=1;
							}

						}
						else if ( (LA71_0==88) ) {
							alt71=1;
						}

						switch (alt71) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:8: ( WS )? ',' ( WS )? p2= pairString
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:8: ( WS )?
							int alt69=2;
							int LA69_0 = input.LA(1);
							if ( (LA69_0==WS) ) {
								alt69=1;
							}
							switch (alt69) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:8: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause1318); 
									}
									break;

							}

							match(input,88,FOLLOW_88_in_intervalClause1321); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:16: ( WS )?
							int alt70=2;
							int LA70_0 = input.LA(1);
							if ( (LA70_0==WS) ) {
								alt70=1;
							}
							switch (alt70) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:16: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause1323); 
									}
									break;

							}

							pushFollow(FOLLOW_pairString_in_intervalClause1328);
							p2=pairString();
							state._fsp--;

							intervals.add(new Interval(p2.a, p2.b));
							}
							break;

						default :
							break loop71;
						}
					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:79: ( WS )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==WS) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:79: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause1334); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_intervalClause1337); 
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
		return intervals;
	}
	// $ANTLR end "intervalClause"



	// $ANTLR start "getEquals"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:255:1: getEquals returns [EqualsToHolder holder] : (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) ;
	public final EqualsToHolder getEquals()  throws RecognitionException {
		EqualsToHolder holder = null;


		Token a=null;
		Token b=null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:2: ( (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:5: a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_getEquals1360); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:10: ( WS )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==WS) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:10: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals1362); 
					}
					break;

			}

			match(input,EQUALS,FOLLOW_EQUALS_in_getEquals1365); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:21: ( WS )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==WS) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:256:21: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals1367); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:261:1: granularityClause returns [Pair<Granularity, List<Pair<Integer, Integer>>> clause] : ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) );
	public final Pair<Granularity, List<Pair<Integer, Integer>>> granularityClause()  throws RecognitionException {
		Pair<Granularity, List<Pair<Integer, Integer>>> clause = null;


		Token s=null;
		Token dur=null;
		Token orig=null;
		Token per=null;
		Token tz=null;
		List<Pair<Integer, Integer>> inc =null;

		Granularity granularity = new Granularity("all");clause = new Pair<>(granularity, null);
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:263:2: ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) )
			int alt98=2;
			int LA98_0 = input.LA(1);
			if ( (LA98_0==SINGLE_QUOTE_STRING) ) {
				alt98=1;
			}
			else if ( (LA98_0==DURATION||LA98_0==PERIOD) ) {
				alt98=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 98, 0, input);
				throw nvae;
			}

			switch (alt98) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:263:3: ( (s= SINGLE_QUOTE_STRING ) )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:263:3: ( (s= SINGLE_QUOTE_STRING ) )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:263:4: (s= SINGLE_QUOTE_STRING )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:263:4: (s= SINGLE_QUOTE_STRING )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:263:5: s= SINGLE_QUOTE_STRING
					{
					s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1412); 
					}

					granularity = new Granularity((s!=null?s.getText():null));clause = new Pair<>(granularity, null);
					}

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:265:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:265:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
					int alt97=2;
					int LA97_0 = input.LA(1);
					if ( (LA97_0==DURATION) ) {
						alt97=1;
					}
					else if ( (LA97_0==PERIOD) ) {
						alt97=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 97, 0, input);
						throw nvae;
					}

					switch (alt97) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:7: DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
							{
							match(input,DURATION,FOLLOW_DURATION_in_granularityClause1436); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:16: ( WS )?
							int alt76=2;
							int LA76_0 = input.LA(1);
							if ( (LA76_0==WS) ) {
								alt76=1;
							}
							switch (alt76) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:16: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1438); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause1441); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:27: ( WS )?
							int alt77=2;
							int LA77_0 = input.LA(1);
							if ( (LA77_0==WS) ) {
								alt77=1;
							}
							switch (alt77) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:27: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1443); 
									}
									break;

							}

							dur=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1448); 
							granularity.setDuration((dur!=null?dur.getText():null));
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:93: ( WS )?
							int alt78=2;
							int LA78_0 = input.LA(1);
							if ( (LA78_0==WS) ) {
								alt78=1;
							}
							switch (alt78) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:93: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1452); 
									}
									break;

							}

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:97: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt80=2;
							int LA80_0 = input.LA(1);
							if ( (LA80_0==88) ) {
								int LA80_1 = input.LA(2);
								if ( (LA80_1==WS) ) {
									int LA80_4 = input.LA(3);
									if ( (LA80_4==SINGLE_QUOTE_STRING) ) {
										alt80=1;
									}
								}
								else if ( (LA80_1==SINGLE_QUOTE_STRING) ) {
									alt80=1;
								}
							}
							switch (alt80) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:98: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,88,FOLLOW_88_in_granularityClause1456); 
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:102: ( WS )?
									int alt79=2;
									int LA79_0 = input.LA(1);
									if ( (LA79_0==WS) ) {
										alt79=1;
									}
									switch (alt79) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:102: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1458); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1463); 
									granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							clause = new Pair<>(granularity, null);
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:211: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
							int alt84=2;
							int LA84_0 = input.LA(1);
							if ( (LA84_0==WS||LA84_0==88) ) {
								alt84=1;
							}
							switch (alt84) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:212: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
									{
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:212: ( WS )?
									int alt81=2;
									int LA81_0 = input.LA(1);
									if ( (LA81_0==WS) ) {
										alt81=1;
									}
									switch (alt81) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:212: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1471); 
											}
											break;

									}

									match(input,88,FOLLOW_88_in_granularityClause1474); 
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:220: ( WS )?
									int alt82=2;
									int LA82_0 = input.LA(1);
									if ( (LA82_0==WS) ) {
										int LA82_1 = input.LA(2);
										if ( (LA82_1==WS) ) {
											alt82=1;
										}
									}
									switch (alt82) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:220: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1476); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause1481);
									inc=granularityInclude();
									state._fsp--;

									clause = new Pair<>(granularity, inc);
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:288: ( WS )?
									int alt83=2;
									int LA83_0 = input.LA(1);
									if ( (LA83_0==WS) ) {
										alt83=1;
									}
									switch (alt83) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:288: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1485); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause1490); 
							}

							}
							break;
						case 2 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:7: PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
							{
							match(input,PERIOD,FOLLOW_PERIOD_in_granularityClause1509); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:14: ( WS )?
							int alt85=2;
							int LA85_0 = input.LA(1);
							if ( (LA85_0==WS) ) {
								alt85=1;
							}
							switch (alt85) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:14: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1511); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause1514); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:25: ( WS )?
							int alt86=2;
							int LA86_0 = input.LA(1);
							if ( (LA86_0==WS) ) {
								alt86=1;
							}
							switch (alt86) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:25: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1516); 
									}
									break;

							}

							per=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1521); 
							granularity.setPeriod((per!=null?per.getText():null));
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:89: ( WS )?
							int alt87=2;
							int LA87_0 = input.LA(1);
							if ( (LA87_0==WS) ) {
								alt87=1;
							}
							switch (alt87) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:89: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1525); 
									}
									break;

							}

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:93: ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )?
							int alt89=2;
							int LA89_0 = input.LA(1);
							if ( (LA89_0==88) ) {
								int LA89_1 = input.LA(2);
								if ( (LA89_1==WS) ) {
									int LA89_4 = input.LA(3);
									if ( (LA89_4==SINGLE_QUOTE_STRING) ) {
										alt89=1;
									}
								}
								else if ( (LA89_1==SINGLE_QUOTE_STRING) ) {
									alt89=1;
								}
							}
							switch (alt89) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:94: ',' ( WS )? tz= SINGLE_QUOTE_STRING
									{
									match(input,88,FOLLOW_88_in_granularityClause1529); 
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:98: ( WS )?
									int alt88=2;
									int LA88_0 = input.LA(1);
									if ( (LA88_0==WS) ) {
										alt88=1;
									}
									switch (alt88) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:98: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1531); 
											}
											break;

									}

									tz=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1536); 
									granularity.setTimeZone((tz!=null?tz.getText():null));
									}
									break;

							}

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:164: ( WS )?
							int alt90=2;
							int LA90_0 = input.LA(1);
							if ( (LA90_0==WS) ) {
								alt90=1;
							}
							switch (alt90) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:164: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause1542); 
									}
									break;

							}

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:168: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt92=2;
							int LA92_0 = input.LA(1);
							if ( (LA92_0==88) ) {
								int LA92_1 = input.LA(2);
								if ( (LA92_1==WS) ) {
									int LA92_4 = input.LA(3);
									if ( (LA92_4==SINGLE_QUOTE_STRING) ) {
										alt92=1;
									}
								}
								else if ( (LA92_1==SINGLE_QUOTE_STRING) ) {
									alt92=1;
								}
							}
							switch (alt92) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:169: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,88,FOLLOW_88_in_granularityClause1546); 
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:173: ( WS )?
									int alt91=2;
									int LA91_0 = input.LA(1);
									if ( (LA91_0==WS) ) {
										alt91=1;
									}
									switch (alt91) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:173: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1548); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1553); 
									granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							clause = new Pair<>(granularity, null);
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:283: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
							int alt96=2;
							int LA96_0 = input.LA(1);
							if ( (LA96_0==WS||LA96_0==88) ) {
								alt96=1;
							}
							switch (alt96) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:284: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
									{
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:284: ( WS )?
									int alt93=2;
									int LA93_0 = input.LA(1);
									if ( (LA93_0==WS) ) {
										alt93=1;
									}
									switch (alt93) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:284: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1562); 
											}
											break;

									}

									match(input,88,FOLLOW_88_in_granularityClause1565); 
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:292: ( WS )?
									int alt94=2;
									int LA94_0 = input.LA(1);
									if ( (LA94_0==WS) ) {
										int LA94_1 = input.LA(2);
										if ( (LA94_1==WS) ) {
											alt94=1;
										}
									}
									switch (alt94) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:292: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1567); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause1572);
									inc=granularityInclude();
									state._fsp--;

									clause = new Pair<>(granularity, inc);
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:360: ( WS )?
									int alt95=2;
									int LA95_0 = input.LA(1);
									if ( (LA95_0==WS) ) {
										alt95=1;
									}
									switch (alt95) {
										case 1 :
											// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:360: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause1576); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause1581); 
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
		return clause;
	}
	// $ANTLR end "granularityClause"



	// $ANTLR start "granularityInclude"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:1: granularityInclude returns [List<Pair<Integer, Integer>> microIntervals] : ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) ;
	public final List<Pair<Integer, Integer>> granularityInclude()  throws RecognitionException {
		List<Pair<Integer, Integer>> microIntervals = null;


		Pair<Integer, Integer> p1 =null;
		Pair<Integer, Integer> p2 =null;

		microIntervals = new ArrayList<>();
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:274:2: ( ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:4: WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN
			{
			match(input,WS,FOLLOW_WS_in_granularityInclude1609); 
			match(input,INCLUDE,FOLLOW_INCLUDE_in_granularityInclude1611); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:15: ( WS )?
			int alt99=2;
			int LA99_0 = input.LA(1);
			if ( (LA99_0==WS) ) {
				alt99=1;
			}
			switch (alt99) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:15: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude1613); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_granularityInclude1616); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:26: ( WS )?
			int alt100=2;
			int LA100_0 = input.LA(1);
			if ( (LA100_0==WS) ) {
				alt100=1;
			}
			switch (alt100) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:26: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude1618); 
					}
					break;

			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:30: (p1= pairNums ( ',' p2= pairNums )* )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:31: p1= pairNums ( ',' p2= pairNums )*
			{
			pushFollow(FOLLOW_pairNums_in_granularityInclude1624);
			p1=pairNums();
			state._fsp--;

			microIntervals.add(p1);
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:69: ( ',' p2= pairNums )*
			loop101:
			while (true) {
				int alt101=2;
				int LA101_0 = input.LA(1);
				if ( (LA101_0==88) ) {
					alt101=1;
				}

				switch (alt101) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:70: ',' p2= pairNums
					{
					match(input,88,FOLLOW_88_in_granularityInclude1629); 
					pushFollow(FOLLOW_pairNums_in_granularityInclude1633);
					p2=pairNums();
					state._fsp--;

					microIntervals.add(p2);
					}
					break;

				default :
					break loop101;
				}
			}

			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:115: ( WS )?
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==WS) ) {
				alt102=1;
			}
			switch (alt102) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:115: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude1640); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_granularityInclude1643); 
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
		return microIntervals;
	}
	// $ANTLR end "granularityInclude"



	// $ANTLR start "pairNums"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:278:1: pairNums returns [Pair<Integer, Integer> pair] : ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) ;
	public final Pair<Integer, Integer> pairNums()  throws RecognitionException {
		Pair<Integer, Integer> pair = null;


		Token i=null;
		Token j=null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:2: ( ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:5: LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairNums1662); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:13: ( WS )?
			int alt103=2;
			int LA103_0 = input.LA(1);
			if ( (LA103_0==WS) ) {
				alt103=1;
			}
			switch (alt103) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums1664); 
					}
					break;

			}

			i=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums1669); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:25: ( WS )?
			int alt104=2;
			int LA104_0 = input.LA(1);
			if ( (LA104_0==WS) ) {
				alt104=1;
			}
			switch (alt104) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:25: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums1672); 
					}
					break;

			}

			match(input,88,FOLLOW_88_in_pairNums1675); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:33: ( WS )?
			int alt105=2;
			int LA105_0 = input.LA(1);
			if ( (LA105_0==WS) ) {
				alt105=1;
			}
			switch (alt105) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:33: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums1677); 
					}
					break;

			}

			j=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums1682); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:44: ( WS )?
			int alt106=2;
			int LA106_0 = input.LA(1);
			if ( (LA106_0==WS) ) {
				alt106=1;
			}
			switch (alt106) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:44: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums1684); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairNums1687); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:282:1: pairString returns [Pair<String, String> pair] : ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) ;
	public final Pair<String, String> pairString()  throws RecognitionException {
		Pair<String, String> pair = null;


		Token i=null;
		Token j=null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:2: ( ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:5: LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairString1707); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:13: ( WS )?
			int alt107=2;
			int LA107_0 = input.LA(1);
			if ( (LA107_0==WS) ) {
				alt107=1;
			}
			switch (alt107) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString1709); 
					}
					break;

			}

			i=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString1714); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:40: ( WS )?
			int alt108=2;
			int LA108_0 = input.LA(1);
			if ( (LA108_0==WS) ) {
				alt108=1;
			}
			switch (alt108) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:40: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString1717); 
					}
					break;

			}

			match(input,88,FOLLOW_88_in_pairString1720); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:48: ( WS )?
			int alt109=2;
			int LA109_0 = input.LA(1);
			if ( (LA109_0==WS) ) {
				alt109=1;
			}
			switch (alt109) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:48: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString1722); 
					}
					break;

			}

			j=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString1727); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:74: ( WS )?
			int alt110=2;
			int LA110_0 = input.LA(1);
			if ( (LA110_0==WS) ) {
				alt110=1;
			}
			switch (alt110) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:74: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString1729); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairString1732); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:290:1: havingClause returns [Having having] : h= complexHaving ;
	public final Having havingClause()  throws RecognitionException {
		Having having = null;


		Having h =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:291:2: (h= complexHaving )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:291:4: h= complexHaving
			{
			pushFollow(FOLLOW_complexHaving_in_havingClause1757);
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:294:1: simpleHaving returns [Having having] : ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) );
	public final Having simpleHaving()  throws RecognitionException {
		Having having = null;


		Token a=null;
		Token t=null;
		Token v=null;
		Token n=null;
		EqualsToHolder e =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:295:2: ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) )
			int alt115=3;
			int LA115_0 = input.LA(1);
			if ( (LA115_0==ID) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA115_3 = input.LA(3);
					if ( (LA115_3==COMPARE_OPER) ) {
						alt115=1;
					}
					else if ( (LA115_3==EQUALS) ) {
						alt115=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 115, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case COMPARE_OPER:
					{
					alt115=1;
					}
					break;
				case EQUALS:
					{
					alt115=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 115, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA115_0==NOT) ) {
				alt115=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 115, 0, input);
				throw nvae;
			}

			switch (alt115) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:295:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:295:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:295:5: a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving1778); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:295:10: ( WS )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==WS) ) {
						alt111=1;
					}
					switch (alt111) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:295:10: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving1780); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving1785); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:295:29: ( WS )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==WS) ) {
						alt112=1;
					}
					switch (alt112) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:295:29: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving1787); 
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:4: (e= getEquals )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:4: (e= getEquals )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:5: e= getEquals
					{
					pushFollow(FOLLOW_getEquals_in_simpleHaving1809);
					e=getEquals();
					state._fsp--;

					}

					having = new Having("=", e.name, e.value);
					}
					break;
				case 3 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:5: n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_simpleHaving1820); 
					match(input,WS,FOLLOW_WS_in_simpleHaving1822); 
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving1826); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:19: ( WS )?
					int alt113=2;
					int LA113_0 = input.LA(1);
					if ( (LA113_0==WS) ) {
						alt113=1;
					}
					switch (alt113) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:19: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving1828); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving1833); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:38: ( WS )?
					int alt114=2;
					int LA114_0 = input.LA(1);
					if ( (LA114_0==WS) ) {
						alt114=1;
					}
					switch (alt114) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:38: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving1835); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:300:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );
	public final Having complexHaving()  throws RecognitionException {
		Having having = null;


		Token o=null;
		Having s =null;
		Having a =null;
		Having b =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:2: ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) )
			int alt116=2;
			alt116 = dfa116.predict(input);
			switch (alt116) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:4: (s= simpleHaving )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:4: (s= simpleHaving )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:5: s= simpleHaving
					{
					pushFollow(FOLLOW_simpleHaving_in_complexHaving1868);
					s=simpleHaving();
					state._fsp--;

					}

					having = s;
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:5: a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving
					{
					pushFollow(FOLLOW_simpleHaving_in_complexHaving1879);
					a=simpleHaving();
					state._fsp--;

					match(input,WS,FOLLOW_WS_in_complexHaving1881); 
					o=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,WS,FOLLOW_WS_in_complexHaving1891); 
					pushFollow(FOLLOW_complexHaving_in_complexHaving1895);
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:310:1: selectorFilter returns [Filter filter] : e= getEquals ;
	public final Filter selectorFilter()  throws RecognitionException {
		Filter filter = null;


		EqualsToHolder e =null;

		filter = new Filter("selector");
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:312:2: (e= getEquals )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:312:4: e= getEquals
			{
			pushFollow(FOLLOW_getEquals_in_selectorFilter1932);
			e=getEquals();
			state._fsp--;

			filter.dimension = e.name;
					 filter.value = unquote(e.value);
					
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:1: regexFilter returns [Filter filter] : (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) ;
	public final Filter regexFilter()  throws RecognitionException {
		Filter filter = null;


		Token a=null;
		Token b=null;

		filter = new Filter("regex");
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:2: ( (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:5: a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_regexFilter1961); 
			match(input,WS,FOLLOW_WS_in_regexFilter1963); 
			match(input,LIKE,FOLLOW_LIKE_in_regexFilter1965); 
			match(input,WS,FOLLOW_WS_in_regexFilter1967); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:24: ( SINGLE_QUOTE_STRING )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:25: SINGLE_QUOTE_STRING
			{
			b=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1973); 
			}

			}

			filter.dimension = (a!=null?a.getText():null);
					 filter.pattern = unquote((b!=null?b.getText():null));
					
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:1: simpleFilter returns [Filter filter] : ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) );
	public final Filter simpleFilter()  throws RecognitionException {
		Filter filter = null;


		Filter a =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:327:2: ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) )
			int alt121=2;
			int LA121_0 = input.LA(1);
			if ( (LA121_0==ID) ) {
				alt121=1;
			}
			else if ( (LA121_0==LPARAN) ) {
				alt121=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 121, 0, input);
				throw nvae;
			}

			switch (alt121) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:327:4: (a= selectorFilter |a= regexFilter )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:327:4: (a= selectorFilter |a= regexFilter )
					int alt117=2;
					int LA117_0 = input.LA(1);
					if ( (LA117_0==ID) ) {
						int LA117_1 = input.LA(2);
						if ( (LA117_1==WS) ) {
							int LA117_2 = input.LA(3);
							if ( (LA117_2==LIKE) ) {
								alt117=2;
							}
							else if ( (LA117_2==EQUALS) ) {
								alt117=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 117, 2, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA117_1==EQUALS) ) {
							alt117=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 117, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 117, 0, input);
						throw nvae;
					}

					switch (alt117) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:327:5: a= selectorFilter
							{
							pushFollow(FOLLOW_selectorFilter_in_simpleFilter1998);
							a=selectorFilter();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:327:24: a= regexFilter
							{
							pushFollow(FOLLOW_regexFilter_in_simpleFilter2004);
							a=regexFilter();
							state._fsp--;

							}
							break;

					}

					filter = a;
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:6: LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_simpleFilter2014); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:13: ( WS )?
					int alt118=2;
					int LA118_0 = input.LA(1);
					if ( (LA118_0==WS) ) {
						alt118=1;
					}
					switch (alt118) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:13: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleFilter2016); 
							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:17: (a= selectorFilter |a= regexFilter )
					int alt119=2;
					int LA119_0 = input.LA(1);
					if ( (LA119_0==ID) ) {
						int LA119_1 = input.LA(2);
						if ( (LA119_1==WS) ) {
							int LA119_2 = input.LA(3);
							if ( (LA119_2==LIKE) ) {
								alt119=2;
							}
							else if ( (LA119_2==EQUALS) ) {
								alt119=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 119, 2, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA119_1==EQUALS) ) {
							alt119=1;
						}

						else {
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 119, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 119, 0, input);
						throw nvae;
					}

					switch (alt119) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:18: a= selectorFilter
							{
							pushFollow(FOLLOW_selectorFilter_in_simpleFilter2022);
							a=selectorFilter();
							state._fsp--;

							}
							break;
						case 2 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:37: a= regexFilter
							{
							pushFollow(FOLLOW_regexFilter_in_simpleFilter2028);
							a=regexFilter();
							state._fsp--;

							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:52: ( WS )?
					int alt120=2;
					int LA120_0 = input.LA(1);
					if ( (LA120_0==WS) ) {
						alt120=1;
					}
					switch (alt120) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:52: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleFilter2031); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_simpleFilter2034); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:1: simpleLogicalFilter returns [Filter filter] : ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) );
	public final Filter simpleLogicalFilter()  throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;
		Filter s =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:332:2: ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) )
			int alt125=2;
			int LA125_0 = input.LA(1);
			if ( (LA125_0==ID||LA125_0==NOT) ) {
				alt125=1;
			}
			else if ( (LA125_0==LPARAN) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA125_4 = input.LA(3);
					if ( (LA125_4==ID) ) {
						int LA125_8 = input.LA(4);
						if ( (LA125_8==WS) ) {
							int LA125_13 = input.LA(5);
							if ( (LA125_13==LIKE) ) {
								int LA125_19 = input.LA(6);
								if ( (LA125_19==WS) ) {
									alt125=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 125, 19, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA125_13==EQUALS) ) {
								int LA125_20 = input.LA(6);
								if ( (LA125_20==WS) ) {
									alt125=1;
								}
								else if ( (LA125_20==FLOAT||LA125_20==LONG||LA125_20==SINGLE_QUOTE_STRING) ) {
									alt125=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 125, 20, input);
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
										new NoViableAltException("", 125, 13, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA125_8==EQUALS) ) {
							int LA125_14 = input.LA(5);
							if ( (LA125_14==WS) ) {
								int LA125_21 = input.LA(6);
								if ( (LA125_21==FLOAT||LA125_21==LONG||LA125_21==SINGLE_QUOTE_STRING) ) {
									alt125=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 125, 21, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA125_14==FLOAT||LA125_14==LONG||LA125_14==SINGLE_QUOTE_STRING) ) {
								int LA125_22 = input.LA(6);
								if ( (LA125_22==WS) ) {
									alt125=1;
								}
								else if ( (LA125_22==RPARAN) ) {
									alt125=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 125, 22, input);
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
										new NoViableAltException("", 125, 14, input);
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
									new NoViableAltException("", 125, 8, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA125_4==LPARAN||LA125_4==NOT) ) {
						alt125=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 125, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case ID:
					{
					int LA125_5 = input.LA(3);
					if ( (LA125_5==WS) ) {
						int LA125_11 = input.LA(4);
						if ( (LA125_11==LIKE) ) {
							int LA125_15 = input.LA(5);
							if ( (LA125_15==WS) ) {
								int LA125_23 = input.LA(6);
								if ( (LA125_23==SINGLE_QUOTE_STRING) ) {
									alt125=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 125, 23, input);
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
										new NoViableAltException("", 125, 15, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA125_11==EQUALS) ) {
							int LA125_16 = input.LA(5);
							if ( (LA125_16==WS) ) {
								int LA125_24 = input.LA(6);
								if ( (LA125_24==FLOAT||LA125_24==LONG||LA125_24==SINGLE_QUOTE_STRING) ) {
									alt125=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 125, 24, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA125_16==FLOAT||LA125_16==LONG||LA125_16==SINGLE_QUOTE_STRING) ) {
								int LA125_25 = input.LA(6);
								if ( (LA125_25==WS) ) {
									alt125=1;
								}
								else if ( (LA125_25==RPARAN) ) {
									alt125=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 125, 25, input);
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
										new NoViableAltException("", 125, 16, input);
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
									new NoViableAltException("", 125, 11, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}
					else if ( (LA125_5==EQUALS) ) {
						int LA125_12 = input.LA(4);
						if ( (LA125_12==WS) ) {
							int LA125_17 = input.LA(5);
							if ( (LA125_17==FLOAT||LA125_17==LONG||LA125_17==SINGLE_QUOTE_STRING) ) {
								int LA125_26 = input.LA(6);
								if ( (LA125_26==WS) ) {
									alt125=1;
								}
								else if ( (LA125_26==RPARAN) ) {
									alt125=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 125, 26, input);
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
										new NoViableAltException("", 125, 17, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA125_12==FLOAT||LA125_12==LONG||LA125_12==SINGLE_QUOTE_STRING) ) {
							int LA125_18 = input.LA(5);
							if ( (LA125_18==WS) ) {
								int LA125_27 = input.LA(6);
								if ( (LA125_27==AND||LA125_27==OR) ) {
									alt125=2;
								}
								else if ( (LA125_27==RPARAN) ) {
									alt125=1;
								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 125, 27, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( (LA125_18==RPARAN) ) {
								alt125=1;
							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 125, 18, input);
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
									new NoViableAltException("", 125, 12, input);
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
								new NoViableAltException("", 125, 5, input);
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
					alt125=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 125, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 125, 0, input);
				throw nvae;
			}

			switch (alt125) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:332:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:332:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					int alt122=2;
					int LA122_0 = input.LA(1);
					if ( (LA122_0==ID||LA122_0==LPARAN) ) {
						alt122=1;
					}
					else if ( (LA122_0==NOT) ) {
						alt122=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 122, 0, input);
						throw nvae;
					}

					switch (alt122) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:332:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:332:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:332:5: a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter
							{
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2055);
							a=simpleFilter();
							state._fsp--;

							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2057); 
							o=input.LT(1);
							if ( input.LA(1)==AND||input.LA(1)==OR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2067); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2071);
							b=simpleFilter();
							state._fsp--;

							}

							}
							break;
						case 2 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:332:55: (o= NOT WS b= simpleFilter )
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:332:55: (o= NOT WS b= simpleFilter )
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:332:56: o= NOT WS b= simpleFilter
							{
							o=(Token)match(input,NOT,FOLLOW_NOT_in_simpleLogicalFilter2079); 
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2081); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2085);
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:340:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:340:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:340:5: LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_simpleLogicalFilter2098); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:340:12: ( WS )?
					int alt123=2;
					int LA123_0 = input.LA(1);
					if ( (LA123_0==WS) ) {
						alt123=1;
					}
					switch (alt123) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:340:12: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2100); 
							}
							break;

					}

					pushFollow(FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter2105);
					s=simpleLogicalFilter();
					state._fsp--;

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:340:38: ( WS )?
					int alt124=2;
					int LA124_0 = input.LA(1);
					if ( (LA124_0==WS) ) {
						alt124=1;
					}
					switch (alt124) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:340:38: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2107); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_simpleLogicalFilter2110); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:1: grandFilter returns [Filter filter] : (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? ;
	public final Filter grandFilter()  throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:346:2: ( (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:346:4: (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )?
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:346:4: (a= simpleFilter |a= simpleLogicalFilter )
			int alt126=2;
			alt126 = dfa126.predict(input);
			switch (alt126) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:346:5: a= simpleFilter
					{
					pushFollow(FOLLOW_simpleFilter_in_grandFilter2134);
					a=simpleFilter();
					state._fsp--;

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:346:22: a= simpleLogicalFilter
					{
					pushFollow(FOLLOW_simpleLogicalFilter_in_grandFilter2140);
					a=simpleLogicalFilter();
					state._fsp--;

					}
					break;

			}

			filter = a;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:346:60: ( WS o= ( AND | OR ) WS b= grandFilter )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==WS) ) {
				int LA127_1 = input.LA(2);
				if ( (LA127_1==AND||LA127_1==OR) ) {
					alt127=1;
				}
			}
			switch (alt127) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:346:61: WS o= ( AND | OR ) WS b= grandFilter
					{
					match(input,WS,FOLLOW_WS_in_grandFilter2147); 
					o=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,WS,FOLLOW_WS_in_grandFilter2157); 
					pushFollow(FOLLOW_grandFilter_in_grandFilter2161);
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



	// $ANTLR start "aggItem"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:357:1: aggItem returns [AggItem aggItem] : aggCallSite[aggItem] ( WS AS WS x= ID )? ;
	public final AggItem aggItem()  throws RecognitionException {
		AggItem aggItem = null;


		Token x=null;

		  aggItem = new AggItem(); 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:359:2: ( aggCallSite[aggItem] ( WS AS WS x= ID )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:359:4: aggCallSite[aggItem] ( WS AS WS x= ID )?
			{
			pushFollow(FOLLOW_aggCallSite_in_aggItem2198);
			aggCallSite(aggItem);
			state._fsp--;

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:359:25: ( WS AS WS x= ID )?
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==WS) ) {
				int LA128_1 = input.LA(2);
				if ( (LA128_1==AS) ) {
					alt128=1;
				}
			}
			switch (alt128) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:359:26: WS AS WS x= ID
					{
					match(input,WS,FOLLOW_WS_in_aggItem2202); 
					match(input,AS,FOLLOW_AS_in_aggItem2204); 
					match(input,WS,FOLLOW_WS_in_aggItem2206); 
					x=(Token)match(input,ID,FOLLOW_ID_in_aggItem2210); 
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
	// $ANTLR end "aggItem"



	// $ANTLR start "aggCallSite"
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:361:1: aggCallSite[AggItem aggItem] : (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) );
	public final void aggCallSite(AggItem aggItem)  throws RecognitionException {
		Token x=null;
		Token y=null;
		String p =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:2: (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) )
			int alt135=2;
			int LA135_0 = input.LA(1);
			if ( (LA135_0==DOUBLE_SUM||LA135_0==JAVASCRIPT||LA135_0==LONG_SUM||LA135_0==MAX||LA135_0==MIN||LA135_0==UNIQUE) ) {
				alt135=1;
			}
			else if ( (LA135_0==COUNT) ) {
				alt135=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 135, 0, input);
				throw nvae;
			}

			switch (alt135) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:4: p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
					{
					pushFollow(FOLLOW_aggFunc_in_aggCallSite2229);
					p=aggFunc();
					state._fsp--;

					aggItem.setAggType(p);
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:39: ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:40: ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:40: ( WS )?
					int alt129=2;
					int LA129_0 = input.LA(1);
					if ( (LA129_0==WS) ) {
						alt129=1;
					}
					switch (alt129) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:40: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite2234); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_aggCallSite2237); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:51: ( WS )?
					int alt130=2;
					int LA130_0 = input.LA(1);
					if ( (LA130_0==WS) ) {
						alt130=1;
					}
					switch (alt130) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:51: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite2239); 
							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:55: (x= ID )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:57: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_aggCallSite2246); 
					aggItem.setFieldName((x!=null?x.getText():null));
					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:96: ( ( WS )? ',' ( WS )? y= ID )*
					loop133:
					while (true) {
						int alt133=2;
						int LA133_0 = input.LA(1);
						if ( (LA133_0==WS) ) {
							int LA133_1 = input.LA(2);
							if ( (LA133_1==88) ) {
								alt133=1;
							}

						}
						else if ( (LA133_0==88) ) {
							alt133=1;
						}

						switch (alt133) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:97: ( WS )? ',' ( WS )? y= ID
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:97: ( WS )?
							int alt131=2;
							int LA131_0 = input.LA(1);
							if ( (LA131_0==WS) ) {
								alt131=1;
							}
							switch (alt131) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:97: WS
									{
									match(input,WS,FOLLOW_WS_in_aggCallSite2252); 
									}
									break;

							}

							match(input,88,FOLLOW_88_in_aggCallSite2255); 
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:105: ( WS )?
							int alt132=2;
							int LA132_0 = input.LA(1);
							if ( (LA132_0==WS) ) {
								alt132=1;
							}
							switch (alt132) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:362:105: WS
									{
									match(input,WS,FOLLOW_WS_in_aggCallSite2257); 
									}
									break;

							}

							y=(Token)match(input,ID,FOLLOW_ID_in_aggCallSite2262); 

								    if (aggItem.fieldNames == null || aggItem.fieldNames.isEmpty()) {
								       aggItem.fieldNames = new ArrayList<>();
								       aggItem.fieldNames.add(aggItem.fieldName);
								       aggItem.fieldName = null;
								    }
								    aggItem.fieldNames.add((y!=null?y.getText():null));
								
							}
							break;

						default :
							break loop133;
						}
					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:369:6: ( WS )?
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( (LA134_0==WS) ) {
						alt134=1;
					}
					switch (alt134) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:369:6: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite2268); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_aggCallSite2271); 
					}

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:370:4: COUNT ( '(*)' )
					{
					match(input,COUNT,FOLLOW_COUNT_in_aggCallSite2278); 
					aggItem.setAggType("count");
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:370:41: ( '(*)' )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:370:42: '(*)'
					{
					match(input,86,FOLLOW_86_in_aggCallSite2283); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:373:1: aggFunc returns [String name] : ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT );
	public final String aggFunc()  throws RecognitionException {
		String name = null;


		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:2: ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT )
			int alt136=6;
			switch ( input.LA(1) ) {
			case LONG_SUM:
				{
				alt136=1;
				}
				break;
			case DOUBLE_SUM:
				{
				alt136=2;
				}
				break;
			case UNIQUE:
				{
				alt136=3;
				}
				break;
			case MIN:
				{
				alt136=4;
				}
				break;
			case MAX:
				{
				alt136=5;
				}
				break;
			case JAVASCRIPT:
				{
				alt136=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 136, 0, input);
				throw nvae;
			}
			switch (alt136) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:4: LONG_SUM
					{
					match(input,LONG_SUM,FOLLOW_LONG_SUM_in_aggFunc2301); 
					name = "longSum";
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:375:4: DOUBLE_SUM
					{
					match(input,DOUBLE_SUM,FOLLOW_DOUBLE_SUM_in_aggFunc2308); 
					name = "doubleSum";
					}
					break;
				case 3 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:4: UNIQUE
					{
					match(input,UNIQUE,FOLLOW_UNIQUE_in_aggFunc2315); 
					name = "hyperUnique";
					}
					break;
				case 4 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:377:4: MIN
					{
					match(input,MIN,FOLLOW_MIN_in_aggFunc2322); 
					name = "min";
					}
					break;
				case 5 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:378:4: MAX
					{
					match(input,MAX,FOLLOW_MAX_in_aggFunc2329); 
					name = "max";
					}
					break;
				case 6 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:4: JAVASCRIPT
					{
					match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_aggFunc2336); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:385:1: postAggItem returns [PostAggItem postAggItem] : ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) );
	public final PostAggItem postAggItem()  throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:2: ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) )
			int alt146=2;
			int LA146_0 = input.LA(1);
			if ( (LA146_0==FLOAT||LA146_0==ID||LA146_0==JAVASCRIPT||LA146_0==LONG||LA146_0==UNIQUE) ) {
				alt146=1;
			}
			else if ( (LA146_0==LPARAN) ) {
				alt146=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 146, 0, input);
				throw nvae;
			}

			switch (alt146) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:5: a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					pushFollow(FOLLOW_simpleArith_in_postAggItem2364);
					a=simpleArith();
					state._fsp--;

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:20: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt139=2;
					int LA139_0 = input.LA(1);
					if ( (LA139_0==WS) ) {
						int LA139_1 = input.LA(2);
						if ( (LA139_1==ARITH_OPER) ) {
							alt139=1;
						}
					}
					else if ( (LA139_0==ARITH_OPER) ) {
						alt139=1;
					}
					switch (alt139) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:21: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:21: ( WS )?
							int alt137=2;
							int LA137_0 = input.LA(1);
							if ( (LA137_0==WS) ) {
								alt137=1;
							}
							switch (alt137) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:21: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem2368); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem2371);
							postAggArithOper(postAggItem);
							state._fsp--;

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:55: ( WS )?
							int alt138=2;
							int LA138_0 = input.LA(1);
							if ( (LA138_0==WS) ) {
								alt138=1;
							}
							switch (alt138) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:387:55: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem2374); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem2379);
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN )
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:6: LPARAN ( WS )? a= postAggItem ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_postAggItem2397); 
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:13: ( WS )?
					int alt140=2;
					int LA140_0 = input.LA(1);
					if ( (LA140_0==WS) ) {
						alt140=1;
					}
					switch (alt140) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:13: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem2399); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggItem_in_postAggItem2404);
					a=postAggItem();
					state._fsp--;

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:31: ( WS )?
					int alt141=2;
					int LA141_0 = input.LA(1);
					if ( (LA141_0==WS) ) {
						alt141=1;
					}
					switch (alt141) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:31: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem2406); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_postAggItem2409); 
					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:43: ( postAggLabel[postAggItem] )?
					int alt142=2;
					int LA142_0 = input.LA(1);
					if ( (LA142_0==AS) ) {
						alt142=1;
					}
					switch (alt142) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:44: postAggLabel[postAggItem]
							{
							pushFollow(FOLLOW_postAggLabel_in_postAggItem2413);
							postAggLabel(postAggItem);
							state._fsp--;

							}
							break;

					}

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:72: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt145=2;
					int LA145_0 = input.LA(1);
					if ( (LA145_0==WS) ) {
						int LA145_1 = input.LA(2);
						if ( (LA145_1==ARITH_OPER) ) {
							alt145=1;
						}
					}
					else if ( (LA145_0==ARITH_OPER) ) {
						alt145=1;
					}
					switch (alt145) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:73: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:73: ( WS )?
							int alt143=2;
							int LA143_0 = input.LA(1);
							if ( (LA143_0==WS) ) {
								alt143=1;
							}
							switch (alt143) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:73: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem2419); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem2422);
							postAggArithOper(postAggItem);
							state._fsp--;

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:107: ( WS )?
							int alt144=2;
							int LA144_0 = input.LA(1);
							if ( (LA144_0==WS) ) {
								alt144=1;
							}
							switch (alt144) {
								case 1 :
									// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:107: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem2425); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem2430);
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:405:1: simpleArith returns [PostAggItem postAggItem] : (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? ;
	public final PostAggItem simpleArith()  throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:2: ( (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:4: (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:4: (a= simplePostAggAccess )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:5: a= simplePostAggAccess
			{
			pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2466);
			a=simplePostAggAccess();
			state._fsp--;

			postAggItem=a;
			}

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			int alt149=2;
			alt149 = dfa149.predict(input);
			switch (alt149) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:46: ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess
					{
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:46: ( WS )?
					int alt147=2;
					int LA147_0 = input.LA(1);
					if ( (LA147_0==WS) ) {
						alt147=1;
					}
					switch (alt147) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:46: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith2472); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggArithOper_in_simpleArith2475);
					postAggArithOper(postAggItem);
					state._fsp--;

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:80: ( WS )?
					int alt148=2;
					int LA148_0 = input.LA(1);
					if ( (LA148_0==WS) ) {
						alt148=1;
					}
					switch (alt148) {
						case 1 :
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:80: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith2478); 
							}
							break;

					}

					pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2483);
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:419:1: simplePostAggAccess returns [PostAggItem postAggItem] : (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef );
	public final PostAggItem simplePostAggAccess()  throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem c =null;
		PostAggItem f =null;
		PostAggItem h =null;
		PostAggItem js =null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:420:2: (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef )
			int alt150=4;
			switch ( input.LA(1) ) {
			case FLOAT:
			case LONG:
				{
				alt150=1;
				}
				break;
			case ID:
				{
				alt150=2;
				}
				break;
			case UNIQUE:
				{
				alt150=3;
				}
				break;
			case JAVASCRIPT:
				{
				alt150=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 150, 0, input);
				throw nvae;
			}
			switch (alt150) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:420:4: c= constantAccess
					{
					pushFollow(FOLLOW_constantAccess_in_simplePostAggAccess2512);
					c=constantAccess();
					state._fsp--;

					postAggItem = c;
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:421:4: f= fieldAccess
					{
					pushFollow(FOLLOW_fieldAccess_in_simplePostAggAccess2529);
					f=fieldAccess();
					state._fsp--;

					postAggItem = f;
					}
					break;
				case 3 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:422:4: h= hyperUniqueCardinality
					{
					pushFollow(FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2542);
					h=hyperUniqueCardinality();
					state._fsp--;

					postAggItem = h;
					}
					break;
				case 4 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:4: js= postAggJavascriptDef
					{
					pushFollow(FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2551);
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:1: constantAccess returns [PostAggItem postAggItem] : ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem constantAccess()  throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("constant"); 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:430:2: ( ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:430:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:430:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:430:5: (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )?
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:430:5: (a= FLOAT |a= LONG )
			int alt151=2;
			int LA151_0 = input.LA(1);
			if ( (LA151_0==FLOAT) ) {
				alt151=1;
			}
			else if ( (LA151_0==LONG) ) {
				alt151=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 151, 0, input);
				throw nvae;
			}

			switch (alt151) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:430:6: a= FLOAT
					{
					a=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constantAccess2581); 
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:430:16: a= LONG
					{
					a=(Token)match(input,LONG,FOLLOW_LONG_in_constantAccess2587); 
					}
					break;

			}

			postAggItem.constantValue = Double.valueOf((a!=null?a.getText():null));
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:5: ( WS postAggLabel[postAggItem] )?
			int alt152=2;
			int LA152_0 = input.LA(1);
			if ( (LA152_0==WS) ) {
				int LA152_1 = input.LA(2);
				if ( (LA152_1==AS) ) {
					alt152=1;
				}
			}
			switch (alt152) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:6: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_constantAccess2600); 
					pushFollow(FOLLOW_postAggLabel_in_constantAccess2602);
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:435:1: fieldAccess returns [PostAggItem postAggItem] : (a= ID ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem fieldAccess()  throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("fieldAccess"); 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:2: ( (a= ID ( WS postAggLabel[postAggItem] )? ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:5: a= ID ( WS postAggLabel[postAggItem] )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_fieldAccess2630); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:10: ( WS postAggLabel[postAggItem] )?
			int alt153=2;
			int LA153_0 = input.LA(1);
			if ( (LA153_0==WS) ) {
				int LA153_1 = input.LA(2);
				if ( (LA153_1==AS) ) {
					alt153=1;
				}
			}
			switch (alt153) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:11: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_fieldAccess2633); 
					pushFollow(FOLLOW_postAggLabel_in_fieldAccess2635);
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:440:1: hyperUniqueCardinality returns [PostAggItem postAggItem] : ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) ;
	public final PostAggItem hyperUniqueCardinality()  throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("hyperUniqueCardinality"); 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:2: ( ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:5: UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN
			{
			match(input,UNIQUE,FOLLOW_UNIQUE_in_hyperUniqueCardinality2664); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:12: ( WS )?
			int alt154=2;
			int LA154_0 = input.LA(1);
			if ( (LA154_0==WS) ) {
				alt154=1;
			}
			switch (alt154) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:12: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality2666); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_hyperUniqueCardinality2669); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:23: ( WS )?
			int alt155=2;
			int LA155_0 = input.LA(1);
			if ( (LA155_0==WS) ) {
				alt155=1;
			}
			switch (alt155) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:23: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality2671); 
					}
					break;

			}

			a=(Token)match(input,ID,FOLLOW_ID_in_hyperUniqueCardinality2676); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:32: ( WS )?
			int alt156=2;
			int LA156_0 = input.LA(1);
			if ( (LA156_0==WS) ) {
				alt156=1;
			}
			switch (alt156) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:32: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality2678); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_hyperUniqueCardinality2681); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:447:1: postAggJavascriptDef returns [PostAggItem postAggItem] : JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING ;
	public final PostAggItem postAggJavascriptDef()  throws RecognitionException {
		PostAggItem postAggItem = null;


		Token str=null;

		  postAggItem = new PostAggItem("javascript"); 
		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:449:2: ( JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:449:4: JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING
			{
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2707); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:449:15: ( WS )?
			int alt157=2;
			int LA157_0 = input.LA(1);
			if ( (LA157_0==WS) ) {
				alt157=1;
			}
			switch (alt157) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:449:15: WS
					{
					match(input,WS,FOLLOW_WS_in_postAggJavascriptDef2709); 
					}
					break;

			}

			str=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2714); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:452:1: postAggLabel[PostAggItem postAggItem] : ( AS WS id= ID ) ;
	public final void postAggLabel(PostAggItem postAggItem)  throws RecognitionException {
		Token id=null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:2: ( ( AS WS id= ID ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:4: ( AS WS id= ID )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:4: ( AS WS id= ID )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:5: AS WS id= ID
			{
			match(input,AS,FOLLOW_AS_in_postAggLabel2730); 
			match(input,WS,FOLLOW_WS_in_postAggLabel2732); 
			id=(Token)match(input,ID,FOLLOW_ID_in_postAggLabel2736); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:1: postAggArithOper[PostAggItem postAggItem] : arith= ARITH_OPER ;
	public final void postAggArithOper(PostAggItem postAggItem)  throws RecognitionException {
		Token arith=null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:2: (arith= ARITH_OPER )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:3: arith= ARITH_OPER
			{
			arith=(Token)match(input,ARITH_OPER,FOLLOW_ARITH_OPER_in_postAggArithOper2752); 
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
	// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:462:1: isoTime returns [String date] : (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ );
	public final druidGParser.isoTime_return isoTime()  throws RecognitionException {
		druidGParser.isoTime_return retval = new druidGParser.isoTime_return();
		retval.start = input.LT(1);

		Token d=null;

		try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:463:2: (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ )
			int alt158=9;
			switch ( input.LA(1) ) {
			case DATE_YEAR_ONLY:
				{
				alt158=1;
				}
				break;
			case DATE_YEAR_MONTH_ONLY:
				{
				alt158=2;
				}
				break;
			case DATE:
				{
				alt158=3;
				}
				break;
			case DATE_HOUR:
				{
				alt158=4;
				}
				break;
			case DATE_HOUR_MIN:
				{
				alt158=5;
				}
				break;
			case DATE_HOUR_MIN_SEC:
				{
				alt158=6;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB:
				{
				alt158=7;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_TZ:
				{
				alt158=8;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_UTC_TZ:
				{
				alt158=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 158, 0, input);
				throw nvae;
			}
			switch (alt158) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:463:3: d= DATE_YEAR_ONLY
					{
					d=(Token)match(input,DATE_YEAR_ONLY,FOLLOW_DATE_YEAR_ONLY_in_isoTime2771); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:3: d= DATE_YEAR_MONTH_ONLY
					{
					d=(Token)match(input,DATE_YEAR_MONTH_ONLY,FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime2779); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 3 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:465:3: d= DATE
					{
					d=(Token)match(input,DATE,FOLLOW_DATE_in_isoTime2787); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 4 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:466:3: d= DATE_HOUR
					{
					d=(Token)match(input,DATE_HOUR,FOLLOW_DATE_HOUR_in_isoTime2795); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 5 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:467:3: d= DATE_HOUR_MIN
					{
					d=(Token)match(input,DATE_HOUR_MIN,FOLLOW_DATE_HOUR_MIN_in_isoTime2803); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 6 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:3: d= DATE_HOUR_MIN_SEC
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC,FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2811); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 7 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:469:3: d= DATE_HOUR_MIN_SEC_SUB
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB,FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2819); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 8 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:470:3: d= DATE_HOUR_MIN_SEC_SUB_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2827); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 9 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:471:3: d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_UTC_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2835); 
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


	protected DFA116 dfa116 = new DFA116(this);
	protected DFA126 dfa126 = new DFA126(this);
	protected DFA149 dfa149 = new DFA149(this);
	static final String DFA116_eotS =
		"\176\uffff";
	static final String DFA116_eofS =
		"\12\uffff\1\24\1\uffff\1\24\2\uffff\1\24\1\uffff\3\24\3\uffff\2\24\5\uffff"+
		"\2\24\3\uffff\2\24\3\uffff\1\24\15\uffff\1\24\17\uffff\1\24\67\uffff";
	static final String DFA116_minS =
		"\1\47\1\14\1\125\1\14\2\41\1\47\3\41\1\101\1\41\1\101\1\14\1\41\1\101"+
		"\1\41\2\101\1\4\3\uffff\1\101\1\4\3\uffff\1\14\1\41\1\101\1\4\3\uffff"+
		"\1\101\1\4\3\uffff\1\4\15\uffff\1\4\15\uffff\2\41\1\101\67\uffff";
	static final String DFA116_maxS =
		"\1\75\2\125\1\36\2\125\1\47\2\125\1\65\1\125\1\113\2\125\1\65\1\125\1"+
		"\113\2\125\1\124\3\uffff\1\125\1\124\3\uffff\1\14\2\125\1\124\3\uffff"+
		"\1\125\1\124\3\uffff\1\124\15\uffff\1\124\15\uffff\1\125\1\65\1\125\67"+
		"\uffff";
	static final String DFA116_acceptS =
		"\24\uffff\1\1\35\uffff\1\2\24\uffff\1\1\15\uffff\1\1\41\uffff\4\1\3\uffff";
	static final String DFA116_specialS =
		"\176\uffff}>";
	static final String[] DFA116_transitionS = {
			"\1\1\25\uffff\1\2",
			"\1\4\21\uffff\1\5\66\uffff\1\3",
			"\1\6",
			"\1\7\21\uffff\1\10",
			"\1\12\23\uffff\1\12\37\uffff\1\11",
			"\1\14\23\uffff\1\14\25\uffff\1\14\11\uffff\1\13",
			"\1\15",
			"\1\17\23\uffff\1\17\37\uffff\1\16",
			"\1\21\23\uffff\1\21\25\uffff\1\21\11\uffff\1\20",
			"\1\22\23\uffff\1\22",
			"\1\24\6\uffff\1\24\14\uffff\1\23",
			"\1\27\23\uffff\1\27\25\uffff\1\27",
			"\1\24\6\uffff\1\24\14\uffff\1\30",
			"\1\35\110\uffff\1\34",
			"\1\36\23\uffff\1\36",
			"\1\24\6\uffff\1\24\14\uffff\1\37",
			"\1\43\23\uffff\1\43\25\uffff\1\43",
			"\1\24\6\uffff\1\24\14\uffff\1\44",
			"\1\24\6\uffff\1\24\14\uffff\1\50",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\24\1\62\1\24\3\uffff\2\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\24\6\uffff\1\24\14\uffff\1\66",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\24\1\62\1\24\3\uffff\2\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\104",
			"\1\106\23\uffff\1\106\37\uffff\1\105",
			"\1\24\6\uffff\1\24\14\uffff\1\107",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\24\1\62\1\24\3\uffff\2\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\24\6\uffff\1\24\14\uffff\1\125",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\24\1\62\1\24\3\uffff\2\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\24\1\62\1\24\3\uffff\2\24\6\uffff\1\24\4\uffff\1\24",
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
			"\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\14\uffff"+
			"\1\24\1\62\1\24\3\uffff\2\24\6\uffff\1\24\4\uffff\1\24",
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
			"\1\170\23\uffff\1\170\37\uffff\1\167",
			"\1\171\23\uffff\1\171",
			"\1\24\6\uffff\1\24\14\uffff\1\172",
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

	static final short[] DFA116_eot = DFA.unpackEncodedString(DFA116_eotS);
	static final short[] DFA116_eof = DFA.unpackEncodedString(DFA116_eofS);
	static final char[] DFA116_min = DFA.unpackEncodedStringToUnsignedChars(DFA116_minS);
	static final char[] DFA116_max = DFA.unpackEncodedStringToUnsignedChars(DFA116_maxS);
	static final short[] DFA116_accept = DFA.unpackEncodedString(DFA116_acceptS);
	static final short[] DFA116_special = DFA.unpackEncodedString(DFA116_specialS);
	static final short[][] DFA116_transition;

	static {
		int numStates = DFA116_transitionS.length;
		DFA116_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA116_transition[i] = DFA.unpackEncodedString(DFA116_transitionS[i]);
		}
	}

	protected class DFA116 extends DFA {

		public DFA116(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 116;
			this.eot = DFA116_eot;
			this.eof = DFA116_eof;
			this.min = DFA116_min;
			this.max = DFA116_max;
			this.accept = DFA116_accept;
			this.special = DFA116_special;
			this.transition = DFA116_transition;
		}
		@Override
		public String getDescription() {
			return "300:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );";
		}
	}

	static final String DFA126_eotS =
		"\164\uffff";
	static final String DFA126_eofS =
		"\15\uffff\1\30\7\uffff\3\30\11\uffff\3\30\3\uffff\1\30\30\uffff\1\30\63"+
		"\uffff";
	static final String DFA126_minS =
		"\1\47\1\36\1\47\1\uffff\1\36\1\41\1\47\1\36\2\uffff\1\125\2\41\1\101\1"+
		"\36\2\uffff\1\36\1\41\1\113\1\41\2\101\1\4\3\uffff\1\36\1\41\1\125\2\41"+
		"\1\110\2\101\1\4\3\uffff\1\4\3\uffff\1\125\13\uffff\1\125\2\41\1\110\1"+
		"\113\1\41\2\110\1\4\1\101\63\uffff";
	static final String DFA126_maxS =
		"\1\75\2\125\1\uffff\1\63\1\125\1\75\1\125\2\uffff\2\125\1\113\2\125\2"+
		"\uffff\1\63\1\125\2\113\2\125\1\124\3\uffff\1\63\3\125\1\113\3\125\1\124"+
		"\3\uffff\1\124\3\uffff\1\125\13\uffff\2\125\1\113\1\125\2\113\2\125\1"+
		"\110\1\125\63\uffff";
	static final String DFA126_acceptS =
		"\3\uffff\1\2\24\uffff\1\1\50\uffff\1\1\3\uffff\1\1\3\uffff\1\1\13\uffff"+
		"\1\1\13\uffff\15\1\1\uffff\2\1\3\uffff";
	static final String DFA126_specialS =
		"\164\uffff}>";
	static final String[] DFA126_transitionS = {
			"\1\1\17\uffff\1\2\5\uffff\1\3",
			"\1\5\66\uffff\1\4",
			"\1\7\17\uffff\1\3\5\uffff\1\3\27\uffff\1\6",
			"",
			"\1\13\24\uffff\1\12",
			"\1\15\23\uffff\1\15\25\uffff\1\15\11\uffff\1\14",
			"\1\16\17\uffff\1\3\5\uffff\1\3",
			"\1\22\66\uffff\1\21",
			"",
			"",
			"\1\23",
			"\1\25\23\uffff\1\25\25\uffff\1\25\11\uffff\1\24",
			"\1\26\23\uffff\1\26\25\uffff\1\26",
			"\1\30\6\uffff\1\30\14\uffff\1\27",
			"\1\34\66\uffff\1\33",
			"",
			"",
			"\1\36\24\uffff\1\35",
			"\1\40\23\uffff\1\40\25\uffff\1\40\11\uffff\1\37",
			"\1\41",
			"\1\42\23\uffff\1\42\25\uffff\1\42",
			"\1\30\6\uffff\1\30\14\uffff\1\43",
			"\1\30\6\uffff\1\30\14\uffff\1\47",
			"\1\53\5\uffff\1\30\30\uffff\1\30\2\uffff\1\30\10\uffff\1\30\2\uffff"+
			"\1\30\1\uffff\1\30\14\uffff\1\30\1\53\1\30\3\uffff\2\30\6\uffff\1\30"+
			"\4\uffff\1\30",
			"",
			"",
			"",
			"\1\70\24\uffff\1\67",
			"\1\72\23\uffff\1\72\25\uffff\1\72\11\uffff\1\71",
			"\1\73",
			"\1\75\23\uffff\1\75\25\uffff\1\75\11\uffff\1\74",
			"\1\76\23\uffff\1\76\25\uffff\1\76",
			"\1\100\14\uffff\1\77",
			"\1\30\6\uffff\1\30\14\uffff\1\101",
			"\1\30\6\uffff\1\30\14\uffff\1\105",
			"\1\111\5\uffff\1\30\30\uffff\1\30\2\uffff\1\30\10\uffff\1\30\2\uffff"+
			"\1\30\1\uffff\1\30\14\uffff\1\30\1\111\1\30\3\uffff\2\30\6\uffff\1\30"+
			"\4\uffff\1\30",
			"",
			"",
			"",
			"\1\125\5\uffff\1\30\30\uffff\1\30\2\uffff\1\30\10\uffff\1\30\2\uffff"+
			"\1\30\1\uffff\1\30\14\uffff\1\30\1\125\1\30\3\uffff\2\30\6\uffff\1\30"+
			"\4\uffff\1\30",
			"",
			"",
			"",
			"\1\141",
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
			"\1\142",
			"\1\144\23\uffff\1\144\25\uffff\1\144\11\uffff\1\143",
			"\1\145\23\uffff\1\145\25\uffff\1\145",
			"\1\147\14\uffff\1\146",
			"\1\150",
			"\1\151\23\uffff\1\151\25\uffff\1\151",
			"\1\153\14\uffff\1\152",
			"\1\155\14\uffff\1\154",
			"\1\3\75\uffff\1\3\5\uffff\1\157",
			"\1\30\6\uffff\1\30\14\uffff\1\160",
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

	static final short[] DFA126_eot = DFA.unpackEncodedString(DFA126_eotS);
	static final short[] DFA126_eof = DFA.unpackEncodedString(DFA126_eofS);
	static final char[] DFA126_min = DFA.unpackEncodedStringToUnsignedChars(DFA126_minS);
	static final char[] DFA126_max = DFA.unpackEncodedStringToUnsignedChars(DFA126_maxS);
	static final short[] DFA126_accept = DFA.unpackEncodedString(DFA126_acceptS);
	static final short[] DFA126_special = DFA.unpackEncodedString(DFA126_specialS);
	static final short[][] DFA126_transition;

	static {
		int numStates = DFA126_transitionS.length;
		DFA126_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA126_transition[i] = DFA.unpackEncodedString(DFA126_transitionS[i]);
		}
	}

	protected class DFA126 extends DFA {

		public DFA126(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 126;
			this.eot = DFA126_eot;
			this.eof = DFA126_eof;
			this.min = DFA126_min;
			this.max = DFA126_max;
			this.accept = DFA126_accept;
			this.special = DFA126_special;
			this.transition = DFA126_transition;
		}
		@Override
		public String getDescription() {
			return "346:4: (a= simpleFilter |a= simpleLogicalFilter )";
		}
	}

	static final String DFA149_eotS =
		"\134\uffff";
	static final String DFA149_eofS =
		"\2\3\132\uffff";
	static final String DFA149_minS =
		"\2\5\1\41\6\uffff\1\41\3\uffff\1\41\3\uffff\1\67\1\113\1\uffff\1\41\3"+
		"\uffff\1\67\1\113\4\uffff\1\67\1\113\1\uffff\1\67\1\47\1\113\4\uffff\1"+
		"\67\1\113\1\uffff\1\67\1\47\1\113\1\uffff\1\67\1\47\1\113\1\uffff\2\47"+
		"\1\110\1\uffff\1\67\1\47\1\113\1\uffff\2\47\1\110\1\uffff\2\47\1\110\1"+
		"\uffff\1\47\3\110\25\uffff";
	static final String DFA149_maxS =
		"\1\125\1\124\1\125\6\uffff\1\125\3\uffff\1\121\3\uffff\2\125\1\uffff\1"+
		"\121\3\uffff\2\125\4\uffff\2\125\1\uffff\1\67\1\125\1\113\4\uffff\2\125"+
		"\1\uffff\1\67\1\125\1\113\1\uffff\1\67\1\125\1\113\1\uffff\1\125\1\47"+
		"\1\125\1\uffff\1\67\1\125\1\113\1\uffff\1\125\1\47\1\125\1\uffff\1\125"+
		"\1\47\1\125\1\uffff\1\47\2\125\1\110\25\uffff";
	static final String DFA149_acceptS =
		"\3\uffff\1\2\12\uffff\3\1\4\uffff\3\1\3\uffff\3\1\6\uffff\4\1\6\uffff"+
		"\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\4\uffff"+
		"\25\1";
	static final String DFA149_specialS =
		"\134\uffff}>";
	static final String[] DFA149_transitionS = {
			"\1\2\73\uffff\1\3\6\uffff\1\3\14\uffff\1\1",
			"\1\11\40\uffff\1\3\10\uffff\1\3\2\uffff\1\3\16\uffff\1\3\5\uffff\2\3"+
			"\13\uffff\1\3",
			"\1\16\5\uffff\1\20\6\uffff\1\22\6\uffff\1\17\1\uffff\1\3\31\uffff\1"+
			"\21\3\uffff\1\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\25\5\uffff\1\27\6\uffff\1\31\6\uffff\1\26\1\uffff\1\3\31\uffff\1"+
			"\30\3\uffff\1\24",
			"",
			"",
			"",
			"\1\33\5\uffff\1\35\6\uffff\1\37\6\uffff\1\34\1\uffff\1\3\31\uffff\1"+
			"\36",
			"",
			"",
			"",
			"\1\42\35\uffff\1\41",
			"\1\44\11\uffff\1\43",
			"",
			"\1\45\5\uffff\1\47\6\uffff\1\51\6\uffff\1\46\1\uffff\1\3\31\uffff\1"+
			"\50",
			"",
			"",
			"",
			"\1\54\35\uffff\1\53",
			"\1\56\11\uffff\1\55",
			"",
			"",
			"",
			"",
			"\1\60\35\uffff\1\57",
			"\1\62\11\uffff\1\61",
			"",
			"\1\63",
			"\1\65\55\uffff\1\64",
			"\1\66",
			"",
			"",
			"",
			"",
			"\1\70\35\uffff\1\67",
			"\1\72\11\uffff\1\71",
			"",
			"\1\73",
			"\1\75\55\uffff\1\74",
			"\1\76",
			"",
			"\1\77",
			"\1\101\55\uffff\1\100",
			"\1\102",
			"",
			"\1\104\55\uffff\1\103",
			"\1\105",
			"\1\107\14\uffff\1\106",
			"",
			"\1\110",
			"\1\112\55\uffff\1\111",
			"\1\113",
			"",
			"\1\115\55\uffff\1\114",
			"\1\116",
			"\1\120\14\uffff\1\117",
			"",
			"\1\122\55\uffff\1\121",
			"\1\123",
			"\1\125\14\uffff\1\124",
			"",
			"\1\126",
			"\1\130\14\uffff\1\127",
			"\1\132\14\uffff\1\131",
			"\1\133",
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

	static final short[] DFA149_eot = DFA.unpackEncodedString(DFA149_eotS);
	static final short[] DFA149_eof = DFA.unpackEncodedString(DFA149_eofS);
	static final char[] DFA149_min = DFA.unpackEncodedStringToUnsignedChars(DFA149_minS);
	static final char[] DFA149_max = DFA.unpackEncodedStringToUnsignedChars(DFA149_maxS);
	static final short[] DFA149_accept = DFA.unpackEncodedString(DFA149_acceptS);
	static final short[] DFA149_special = DFA.unpackEncodedString(DFA149_specialS);
	static final short[][] DFA149_transition;

	static {
		int numStates = DFA149_transitionS.length;
		DFA149_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA149_transition[i] = DFA.unpackEncodedString(DFA149_transitionS[i]);
		}
	}

	protected class DFA149 extends DFA {

		public DFA149(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 149;
			this.eot = DFA149_eot;
			this.eof = DFA149_eof;
			this.min = DFA149_min;
			this.max = DFA149_max;
			this.accept = DFA149_accept;
			this.special = DFA149_special;
			this.transition = DFA149_transition;
		}
		@Override
		public String getDescription() {
			return "407:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?";
		}
	}

	public static final BitSet FOLLOW_grandQuery_in_program42 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandInsert_in_program54 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStmnt_in_grandInsert84 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200002L});
	public static final BitSet FOLLOW_WS_in_grandInsert93 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandInsert96 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insertStmnt120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt122 = new BitSet(new long[]{0x0000100000000000L});
	public static final BitSet FOLLOW_INTO_in_insertStmnt124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt126 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_insertStmnt131 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt136 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt139 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000220000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt141 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000020000L});
	public static final BitSet FOLLOW_selectItems_in_insertStmnt144 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_insertStmnt148 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_insertStmnt151 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000220000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt153 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000020000L});
	public static final BitSet FOLLOW_selectItems_in_insertStmnt156 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_insertStmnt161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt164 = new BitSet(new long[]{0x0000000000000000L,0x0000000000240000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_VALUES_in_insertStmnt172 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt174 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt177 = new BitSet(new long[]{0x0020000200000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_insertStmnt179 = new BitSet(new long[]{0x0020000200000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_anyValue_in_insertStmnt185 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_insertStmnt192 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_insertStmnt195 = new BitSet(new long[]{0x0020000200000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_insertStmnt197 = new BitSet(new long[]{0x0020000200000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_anyValue_in_insertStmnt202 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_insertStmnt208 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt211 = new BitSet(new long[]{0x0000000000000002L,0x0000000000280000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000280000L});
	public static final BitSet FOLLOW_WHERE_in_insertStmnt219 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt221 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertStmnt225 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt233 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_insertStmnt235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt237 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertStmnt239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt241 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt245 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryStmnt_in_grandQuery279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200002L});
	public static final BitSet FOLLOW_WS_in_grandQuery289 = new BitSet(new long[]{0x0004800000000000L,0x0000000000000080L});
	public static final BitSet FOLLOW_set_in_grandQuery293 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_grandQuery314 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_grandQuery317 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200400L});
	public static final BitSet FOLLOW_WS_in_grandQuery319 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_queryStmnt_in_grandQuery325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_WS_in_grandQuery330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_grandQuery333 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200001L});
	public static final BitSet FOLLOW_WS_in_grandQuery335 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_ON_in_grandQuery338 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_grandQuery345 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_grandQuery348 = new BitSet(new long[]{0x0000008000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_grandQuery350 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_grandQuery356 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_grandQuery361 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_grandQuery364 = new BitSet(new long[]{0x0000008000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_grandQuery366 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_grandQuery371 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_grandQuery377 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_grandQuery380 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200002L});
	public static final BitSet FOLLOW_WS_in_grandQuery399 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandQuery402 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_queryStmnt425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt453 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000020000L});
	public static final BitSet FOLLOW_selectItems_in_queryStmnt455 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt459 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_queryStmnt462 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000220000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt464 = new BitSet(new long[]{0x0A40408008004000L,0x0000000000020000L});
	public static final BitSet FOLLOW_selectItems_in_queryStmnt467 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_87_in_queryStmnt500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt515 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_FROM_in_queryStmnt517 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt519 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt523 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt539 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_WHERE_in_queryStmnt541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt543 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_whereClause_in_queryStmnt545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt562 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_queryStmnt564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt566 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt570 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000820L});
	public static final BitSet FOLLOW_granularityClause_in_queryStmnt574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt591 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_GROUP_in_queryStmnt593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt595 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt597 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt599 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt625 = new BitSet(new long[]{0x0000000000000002L,0x0000000001200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt657 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_queryStmnt660 = new BitSet(new long[]{0x0000008000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt662 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt667 = new BitSet(new long[]{0x0000000000000002L,0x0000000001200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt724 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_HAVING_in_queryStmnt726 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt728 = new BitSet(new long[]{0x2000008000000000L});
	public static final BitSet FOLLOW_havingClause_in_queryStmnt732 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt776 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
	public static final BitSet FOLLOW_ORDER_in_queryStmnt778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt780 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt784 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt789 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt822 = new BitSet(new long[]{0x0000000004000080L});
	public static final BitSet FOLLOW_set_in_queryStmnt826 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt876 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_LIMIT_in_queryStmnt878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt880 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LONG_in_queryStmnt885 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_THEN_in_queryStmnt925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt927 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_postAggItem_in_queryStmnt931 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_WHICH_in_queryStmnt948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt950 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CONTAINS_in_queryStmnt952 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt956 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_queryStmnt961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt967 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_queryStmnt971 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_queryStmnt974 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_queryStmnt976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt981 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_queryStmnt988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_SORT_in_queryStmnt999 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1001 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1032 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_HINT_in_queryStmnt1034 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1036 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1039 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1046 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1050 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1087 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_anyValue1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggItem_in_selectItems1118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDim_in_selectItems1128 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleDim1148 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleDim1151 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_simpleDim1153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleDim1155 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_simpleDim1159 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intervalClause_in_whereClause1182 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_whereClause1187 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_whereClause1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_whereClause1191 = new BitSet(new long[]{0x2080008000000000L});
	public static final BitSet FOLLOW_grandFilter_in_whereClause1195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_89_in_intervalClause1221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_intervalClause1223 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BETWEEN_in_intervalClause1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_intervalClause1227 = new BitSet(new long[]{0x0080000000FF8000L,0x0000000000000800L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause1247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause1254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_intervalClause1258 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_intervalClause1260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_intervalClause1262 = new BitSet(new long[]{0x0000000000FF8000L,0x0000000000000800L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause1267 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause1274 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_intervalClause1299 = new BitSet(new long[]{0x0100000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_intervalClause1301 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause1306 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_intervalClause1318 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_intervalClause1321 = new BitSet(new long[]{0x0100000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_intervalClause1323 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause1328 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_intervalClause1334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_intervalClause1337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_getEquals1360 = new BitSet(new long[]{0x0000000040000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_getEquals1362 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_EQUALS_in_getEquals1365 = new BitSet(new long[]{0x0020000200000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_getEquals1367 = new BitSet(new long[]{0x0020000200000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_set_in_getEquals1373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1412 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_granularityClause1436 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_granularityClause1438 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause1441 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_granularityClause1443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1448 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_granularityClause1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_88_in_granularityClause1456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_granularityClause1458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1463 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_granularityClause1471 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_granularityClause1474 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_granularityClause1476 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause1481 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_WS_in_granularityClause1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause1490 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_granularityClause1509 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_granularityClause1511 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_granularityClause1516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_granularityClause1525 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_88_in_granularityClause1529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_granularityClause1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1536 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_granularityClause1542 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_88_in_granularityClause1546 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_granularityClause1548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1553 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_granularityClause1562 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_granularityClause1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_granularityClause1567 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_WS_in_granularityClause1576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause1581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_granularityInclude1609 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_INCLUDE_in_granularityInclude1611 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_granularityInclude1613 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityInclude1616 = new BitSet(new long[]{0x0100000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_granularityInclude1618 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude1624 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_88_in_granularityInclude1629 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude1633 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_granularityInclude1640 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_granularityInclude1643 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairNums1662 = new BitSet(new long[]{0x0020000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_pairNums1664 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums1669 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
	public static final BitSet FOLLOW_WS_in_pairNums1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_pairNums1675 = new BitSet(new long[]{0x0020000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_pairNums1677 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums1682 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200200L});
	public static final BitSet FOLLOW_WS_in_pairNums1684 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RSQUARE_in_pairNums1687 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairString1707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_pairString1709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1714 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
	public static final BitSet FOLLOW_WS_in_pairString1717 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_pairString1720 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_pairString1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200200L});
	public static final BitSet FOLLOW_WS_in_pairString1729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_RSQUARE_in_pairString1732 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexHaving_in_havingClause1757 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleHaving1778 = new BitSet(new long[]{0x0000000000001000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1780 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1785 = new BitSet(new long[]{0x0020000200000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1787 = new BitSet(new long[]{0x0020000200000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving1792 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_simpleHaving1809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleHaving1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1822 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_simpleHaving1826 = new BitSet(new long[]{0x0000000000001000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1828 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1833 = new BitSet(new long[]{0x0020000200000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving1835 = new BitSet(new long[]{0x0020000200000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving1840 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleHaving_in_complexHaving1868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleHaving_in_complexHaving1879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_complexHaving1881 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_complexHaving1885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_complexHaving1891 = new BitSet(new long[]{0x2000008000000000L});
	public static final BitSet FOLLOW_complexHaving_in_complexHaving1895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_selectorFilter1932 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_regexFilter1961 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_regexFilter1963 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_LIKE_in_regexFilter1965 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_regexFilter1967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectorFilter_in_simpleFilter1998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_regexFilter_in_simpleFilter2004 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_simpleFilter2014 = new BitSet(new long[]{0x0000008000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleFilter2016 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_selectorFilter_in_simpleFilter2022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_regexFilter_in_simpleFilter2028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_WS_in_simpleFilter2031 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_simpleFilter2034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2055 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2057 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_simpleLogicalFilter2061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2067 = new BitSet(new long[]{0x0080008000000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleLogicalFilter2079 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2081 = new BitSet(new long[]{0x0080008000000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2085 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_simpleLogicalFilter2098 = new BitSet(new long[]{0x2080008000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2100 = new BitSet(new long[]{0x2080008000000000L});
	public static final BitSet FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter2105 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2107 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_simpleLogicalFilter2110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_grandFilter2134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_simpleLogicalFilter_in_grandFilter2140 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_grandFilter2147 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000004L});
	public static final BitSet FOLLOW_set_in_grandFilter2151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_grandFilter2157 = new BitSet(new long[]{0x2080008000000000L});
	public static final BitSet FOLLOW_grandFilter_in_grandFilter2161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggCallSite_in_aggItem2198 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_aggItem2202 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_aggItem2204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_aggItem2206 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_aggItem2210 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggFunc_in_aggCallSite2229 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite2234 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_aggCallSite2237 = new BitSet(new long[]{0x0000008000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite2239 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_aggCallSite2246 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_aggCallSite2252 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_88_in_aggCallSite2255 = new BitSet(new long[]{0x0000008000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite2257 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_aggCallSite2262 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200100L});
	public static final BitSet FOLLOW_WS_in_aggCallSite2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_aggCallSite2271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_aggCallSite2278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_86_in_aggCallSite2283 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_SUM_in_aggFunc2301 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_SUM_in_aggFunc2308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_aggFunc2315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_aggFunc2322 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAX_in_aggFunc2329 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_aggFunc2336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleArith_in_postAggItem2364 = new BitSet(new long[]{0x0000000000000022L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_postAggItem2368 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem2371 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000220000L});
	public static final BitSet FOLLOW_WS_in_postAggItem2374 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem2379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_postAggItem2397 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000220000L});
	public static final BitSet FOLLOW_WS_in_postAggItem2399 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem2404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_WS_in_postAggItem2406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_postAggItem2409 = new BitSet(new long[]{0x0000000000000062L,0x0000000000200000L});
	public static final BitSet FOLLOW_postAggLabel_in_postAggItem2413 = new BitSet(new long[]{0x0000000000000022L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_postAggItem2419 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem2422 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000220000L});
	public static final BitSet FOLLOW_WS_in_postAggItem2425 = new BitSet(new long[]{0x00A0408200000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem2430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2466 = new BitSet(new long[]{0x0000000000000022L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_simpleArith2472 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_simpleArith2475 = new BitSet(new long[]{0x0020408200000000L,0x0000000000220000L});
	public static final BitSet FOLLOW_WS_in_simpleArith2478 = new BitSet(new long[]{0x0020408200000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAccess_in_simplePostAggAccess2512 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldAccess_in_simplePostAggAccess2529 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2542 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2551 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constantAccess2581 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_LONG_in_constantAccess2587 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_constantAccess2600 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_constantAccess2602 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldAccess2630 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_fieldAccess2633 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_fieldAccess2635 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_hyperUniqueCardinality2664 = new BitSet(new long[]{0x0080000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2666 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_hyperUniqueCardinality2669 = new BitSet(new long[]{0x0000008000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2671 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_hyperUniqueCardinality2676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200100L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_RPARAN_in_hyperUniqueCardinality2681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200800L});
	public static final BitSet FOLLOW_WS_in_postAggJavascriptDef2709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2714 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_postAggLabel2730 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_WS_in_postAggLabel2732 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_ID_in_postAggLabel2736 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARITH_OPER_in_postAggArithOper2752 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_YEAR_ONLY_in_isoTime2771 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime2779 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_isoTime2787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_in_isoTime2795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_in_isoTime2803 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2811 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2827 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2835 = new BitSet(new long[]{0x0000000000000002L});
}
