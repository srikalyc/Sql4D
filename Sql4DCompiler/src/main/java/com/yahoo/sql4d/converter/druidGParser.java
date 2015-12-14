// $ANTLR 3.5.2 druidG.g 2015-04-24 15:38:08

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
		"DATE_YEAR_ONLY", "DELETE", "DELIMITER", "DESC", "DOUBLE_SUM", "DROP", 
		"DURATION", "EQUALS", "ESC_SEQ", "FIELD_ACCESS", "FLOAT", "FROM", "GROUP", 
		"HAVING", "HEX_DIGIT", "HINT", "HYPER_UNIQUE", "ID", "INCLUDE", "INSERT", 
		"INSERT_HADOOP", "INSERT_REALTIME", "INTO", "ISO", "JAVASCRIPT", "JOIN", 
		"KAFKA", "LCURLY", "LEFT_JOIN", "LIKE", "LIMIT", "LONG", "LONG_SUM", "LPARAN", 
		"LSQUARE", "MAX", "MAX_WINDOW", "MIN", "NEWLINE", "NOT", "NUM", "OCTAL_ESC", 
		"ON", "OPT_AMPERSAND", "OPT_SEMI_COLON", "OR", "ORDER", "PARTITION", "PERIOD", 
		"RCURLY", "RIGHT_JOIN", "ROLLUP", "RPARAN", "RSQUARE", "SELECT", "SINGLE_QUOTE_STRING", 
		"SORT", "STRING", "TABLE", "THEN", "UNICODE_ESC", "UNIQUE", "VALUES", 
		"WHERE", "WHICH", "WS", "'(*)'", "'*'", "','", "'interval'"
	};
	public static final int EOF=-1;
	public static final int T__89=89;
	public static final int T__90=90;
	public static final int T__91=91;
	public static final int T__92=92;
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
	public static final int DELIMITER=25;
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
	public static final int HYPER_UNIQUE=39;
	public static final int ID=40;
	public static final int INCLUDE=41;
	public static final int INSERT=42;
	public static final int INSERT_HADOOP=43;
	public static final int INSERT_REALTIME=44;
	public static final int INTO=45;
	public static final int ISO=46;
	public static final int JAVASCRIPT=47;
	public static final int JOIN=48;
	public static final int KAFKA=49;
	public static final int LCURLY=50;
	public static final int LEFT_JOIN=51;
	public static final int LIKE=52;
	public static final int LIMIT=53;
	public static final int LONG=54;
	public static final int LONG_SUM=55;
	public static final int LPARAN=56;
	public static final int LSQUARE=57;
	public static final int MAX=58;
	public static final int MAX_WINDOW=59;
	public static final int MIN=60;
	public static final int NEWLINE=61;
	public static final int NOT=62;
	public static final int NUM=63;
	public static final int OCTAL_ESC=64;
	public static final int ON=65;
	public static final int OPT_AMPERSAND=66;
	public static final int OPT_SEMI_COLON=67;
	public static final int OR=68;
	public static final int ORDER=69;
	public static final int PARTITION=70;
	public static final int PERIOD=71;
	public static final int RCURLY=72;
	public static final int RIGHT_JOIN=73;
	public static final int ROLLUP=74;
	public static final int RPARAN=75;
	public static final int RSQUARE=76;
	public static final int SELECT=77;
	public static final int SINGLE_QUOTE_STRING=78;
	public static final int SORT=79;
	public static final int STRING=80;
	public static final int TABLE=81;
	public static final int THEN=82;
	public static final int UNICODE_ESC=83;
	public static final int UNIQUE=84;
	public static final int VALUES=85;
	public static final int WHERE=86;
	public static final int WHICH=87;
	public static final int WS=88;

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
	@Override public String getGrammarFileName() { return "druidG.g"; }



	// $ANTLR start "program"
	// druidG.g:43:1: program returns [Program program] : ( (s1= grandQuery ) | (s2= grandInsert ) | (s3= grandDelete ) | (s4= grandDrop ) );
	public final Program program() throws RecognitionException {
		Program program = null;


		QueryProgram s1 =null;
		InsertProgram s2 =null;
		DeleteProgram s3 =null;
		DropProgram s4 =null;

		 program = null; 
		try {
			// druidG.g:45:2: ( (s1= grandQuery ) | (s2= grandInsert ) | (s3= grandDelete ) | (s4= grandDrop ) )
			int alt1=4;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt1=1;
				}
				break;
			case INSERT:
			case INSERT_HADOOP:
			case INSERT_REALTIME:
				{
				alt1=2;
				}
				break;
			case DELETE:
				{
				alt1=3;
				}
				break;
			case DROP:
				{
				alt1=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// druidG.g:45:4: (s1= grandQuery )
					{
					// druidG.g:45:4: (s1= grandQuery )
					// druidG.g:45:5: s1= grandQuery
					{
					pushFollow(FOLLOW_grandQuery_in_program49);
					s1=grandQuery();
					state._fsp--;

					}

					 program = s1; 
					}
					break;
				case 2 :
					// druidG.g:46:4: (s2= grandInsert )
					{
					// druidG.g:46:4: (s2= grandInsert )
					// druidG.g:46:5: s2= grandInsert
					{
					pushFollow(FOLLOW_grandInsert_in_program61);
					s2=grandInsert();
					state._fsp--;

					}

					 program = s2; 
					}
					break;
				case 3 :
					// druidG.g:47:4: (s3= grandDelete )
					{
					// druidG.g:47:4: (s3= grandDelete )
					// druidG.g:47:5: s3= grandDelete
					{
					pushFollow(FOLLOW_grandDelete_in_program73);
					s3=grandDelete();
					state._fsp--;

					}

					 program = s3; 
					}
					break;
				case 4 :
					// druidG.g:48:4: (s4= grandDrop )
					{
					// druidG.g:48:4: (s4= grandDrop )
					// druidG.g:48:5: s4= grandDrop
					{
					pushFollow(FOLLOW_grandDrop_in_program85);
					s4=grandDrop();
					state._fsp--;

					}

					 program = s4; 
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



	// $ANTLR start "grandDelete"
	// druidG.g:51:1: grandDelete returns [DeleteProgram program] : (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) ;
	public final DeleteProgram grandDelete() throws RecognitionException {
		DeleteProgram program = null;


		DeleteMeta s1 =null;

		 program = null; 
		try {
			// druidG.g:53:2: ( (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
			// druidG.g:53:4: (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			{
			// druidG.g:53:4: (s1= deleteStmnt )
			// druidG.g:53:5: s1= deleteStmnt
			{
			pushFollow(FOLLOW_deleteStmnt_in_grandDelete113);
			s1=deleteStmnt();
			state._fsp--;

			}

			 program = new DeleteProgram();program.addStmnt(s1); 
			// druidG.g:54:4: ( WS )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==WS) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// druidG.g:54:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandDelete122); 
					}
					break;

			}

			// druidG.g:54:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			int alt5=2;
			switch ( input.LA(1) ) {
			case OPT_SEMI_COLON:
				{
				alt5=1;
				}
				break;
			case EOF:
				{
				alt5=1;
				}
				break;
			case OPT_AMPERSAND:
				{
				alt5=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}
			switch (alt5) {
				case 1 :
					// druidG.g:54:9: ( OPT_SEMI_COLON )?
					{
					// druidG.g:54:9: ( OPT_SEMI_COLON )?
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==OPT_SEMI_COLON) ) {
						alt3=1;
					}
					switch (alt3) {
						case 1 :
							// druidG.g:54:9: OPT_SEMI_COLON
							{
							match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandDelete126); 
							}
							break;

					}

					}
					break;
				case 2 :
					// druidG.g:54:27: ( OPT_AMPERSAND )?
					{
					// druidG.g:54:27: ( OPT_AMPERSAND )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==OPT_AMPERSAND) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// druidG.g:54:28: OPT_AMPERSAND
							{
							match(input,OPT_AMPERSAND,FOLLOW_OPT_AMPERSAND_in_grandDelete132); 
							program.waitForCompletion = false;
							}
							break;

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
		return program;
	}
	// $ANTLR end "grandDelete"



	// $ANTLR start "grandDrop"
	// druidG.g:57:1: grandDrop returns [DropProgram program] : (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) ;
	public final DropProgram grandDrop() throws RecognitionException {
		DropProgram program = null;


		DropMeta s1 =null;

		 program = null; 
		try {
			// druidG.g:59:2: ( (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
			// druidG.g:59:4: (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			{
			// druidG.g:59:4: (s1= dropStmnt )
			// druidG.g:59:5: s1= dropStmnt
			{
			pushFollow(FOLLOW_dropStmnt_in_grandDrop164);
			s1=dropStmnt();
			state._fsp--;

			}

			 program = new DropProgram();program.addStmnt(s1); 
			// druidG.g:60:4: ( WS )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==WS) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// druidG.g:60:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandDrop173); 
					}
					break;

			}

			// druidG.g:60:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
			int alt9=2;
			switch ( input.LA(1) ) {
			case OPT_SEMI_COLON:
				{
				alt9=1;
				}
				break;
			case EOF:
				{
				alt9=1;
				}
				break;
			case OPT_AMPERSAND:
				{
				alt9=2;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}
			switch (alt9) {
				case 1 :
					// druidG.g:60:9: ( OPT_SEMI_COLON )?
					{
					// druidG.g:60:9: ( OPT_SEMI_COLON )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==OPT_SEMI_COLON) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// druidG.g:60:9: OPT_SEMI_COLON
							{
							match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandDrop177); 
							}
							break;

					}

					}
					break;
				case 2 :
					// druidG.g:60:27: ( OPT_AMPERSAND )?
					{
					// druidG.g:60:27: ( OPT_AMPERSAND )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==OPT_AMPERSAND) ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// druidG.g:60:28: OPT_AMPERSAND
							{
							match(input,OPT_AMPERSAND,FOLLOW_OPT_AMPERSAND_in_grandDrop183); 
							program.waitForCompletion = false;
							}
							break;

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
		return program;
	}
	// $ANTLR end "grandDrop"



	// $ANTLR start "grandInsert"
	// druidG.g:63:1: grandInsert returns [InsertProgram program] : ( (s1= insertStmnt ) | (s2= insertHStmnt ) | (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) );
	public final InsertProgram grandInsert() throws RecognitionException {
		InsertProgram program = null;


		BasicInsertMeta s1 =null;
		BatchInsertMeta s2 =null;
		RTInsertMeta s3 =null;

		 program = null; 
		try {
			// druidG.g:65:2: ( (s1= insertStmnt ) | (s2= insertHStmnt ) | (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
			int alt14=3;
			switch ( input.LA(1) ) {
			case INSERT:
				{
				alt14=1;
				}
				break;
			case INSERT_HADOOP:
				{
				alt14=2;
				}
				break;
			case INSERT_REALTIME:
				{
				alt14=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}
			switch (alt14) {
				case 1 :
					// druidG.g:65:4: (s1= insertStmnt )
					{
					// druidG.g:65:4: (s1= insertStmnt )
					// druidG.g:65:5: s1= insertStmnt
					{
					pushFollow(FOLLOW_insertStmnt_in_grandInsert214);
					s1=insertStmnt();
					state._fsp--;

					}

					 program = InsertProgram.getInsertInstance();program.addStmnt(s1); 
					}
					break;
				case 2 :
					// druidG.g:66:4: (s2= insertHStmnt )
					{
					// druidG.g:66:4: (s2= insertHStmnt )
					// druidG.g:66:5: s2= insertHStmnt
					{
					pushFollow(FOLLOW_insertHStmnt_in_grandInsert226);
					s2=insertHStmnt();
					state._fsp--;

					}

					 program = InsertProgram.getInsertHadoopInstance();program.addStmnt(s2); 
					}
					break;
				case 3 :
					// druidG.g:67:4: (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
					{
					// druidG.g:67:4: (s3= insertRTStmnt )
					// druidG.g:67:5: s3= insertRTStmnt
					{
					pushFollow(FOLLOW_insertRTStmnt_in_grandInsert238);
					s3=insertRTStmnt();
					state._fsp--;

					}

					 program = InsertProgram.getInsertRTInstance();program.addStmnt(s3); 
					// druidG.g:68:4: ( WS )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==WS) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// druidG.g:68:4: WS
							{
							match(input,WS,FOLLOW_WS_in_grandInsert247); 
							}
							break;

					}

					// druidG.g:68:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
					int alt13=2;
					switch ( input.LA(1) ) {
					case OPT_SEMI_COLON:
						{
						alt13=1;
						}
						break;
					case EOF:
						{
						alt13=1;
						}
						break;
					case OPT_AMPERSAND:
						{
						alt13=2;
						}
						break;
					default:
						NoViableAltException nvae =
							new NoViableAltException("", 13, 0, input);
						throw nvae;
					}
					switch (alt13) {
						case 1 :
							// druidG.g:68:9: ( OPT_SEMI_COLON )?
							{
							// druidG.g:68:9: ( OPT_SEMI_COLON )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==OPT_SEMI_COLON) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// druidG.g:68:9: OPT_SEMI_COLON
									{
									match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandInsert251); 
									}
									break;

							}

							}
							break;
						case 2 :
							// druidG.g:68:27: ( OPT_AMPERSAND )?
							{
							// druidG.g:68:27: ( OPT_AMPERSAND )?
							int alt12=2;
							int LA12_0 = input.LA(1);
							if ( (LA12_0==OPT_AMPERSAND) ) {
								alt12=1;
							}
							switch (alt12) {
								case 1 :
									// druidG.g:68:28: OPT_AMPERSAND
									{
									match(input,OPT_AMPERSAND,FOLLOW_OPT_AMPERSAND_in_grandInsert257); 
									program.waitForCompletion = false;
									}
									break;

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
		return program;
	}
	// $ANTLR end "grandInsert"



	// $ANTLR start "deleteStmnt"
	// druidG.g:71:1: deleteStmnt returns [DeleteMeta dMeta] : DELETE WS FROM WS (id= ID WS ) WHERE WS i= intervalClause ;
	public final DeleteMeta deleteStmnt() throws RecognitionException {
		DeleteMeta dMeta = null;


		Token id=null;
		List<Interval> i =null;

		 dMeta = new DeleteMeta();      
		try {
			// druidG.g:73:2: ( DELETE WS FROM WS (id= ID WS ) WHERE WS i= intervalClause )
			// druidG.g:73:3: DELETE WS FROM WS (id= ID WS ) WHERE WS i= intervalClause
			{
			match(input,DELETE,FOLLOW_DELETE_in_deleteStmnt283); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt285); 
			match(input,FROM,FOLLOW_FROM_in_deleteStmnt287); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt289); 
			// druidG.g:73:21: (id= ID WS )
			// druidG.g:73:22: id= ID WS
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_deleteStmnt294); 
			dMeta.dataSource = (id!=null?id.getText():null); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt298); 
			}

			match(input,WHERE,FOLLOW_WHERE_in_deleteStmnt303); 
			match(input,WS,FOLLOW_WS_in_deleteStmnt305); 
			pushFollow(FOLLOW_intervalClause_in_deleteStmnt309);
			i=intervalClause();
			state._fsp--;

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     dMeta.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
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
		return dMeta;
	}
	// $ANTLR end "deleteStmnt"



	// $ANTLR start "dropStmnt"
	// druidG.g:82:1: dropStmnt returns [DropMeta dMeta] : DROP WS TABLE WS (id= ID ) ;
	public final DropMeta dropStmnt() throws RecognitionException {
		DropMeta dMeta = null;


		Token id=null;

		 dMeta = new DropMeta();      
		try {
			// druidG.g:84:2: ( DROP WS TABLE WS (id= ID ) )
			// druidG.g:84:3: DROP WS TABLE WS (id= ID )
			{
			match(input,DROP,FOLLOW_DROP_in_dropStmnt337); 
			match(input,WS,FOLLOW_WS_in_dropStmnt339); 
			match(input,TABLE,FOLLOW_TABLE_in_dropStmnt341); 
			match(input,WS,FOLLOW_WS_in_dropStmnt343); 
			// druidG.g:84:20: (id= ID )
			// druidG.g:84:21: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_dropStmnt348); 
			dMeta.dataSource = (id!=null?id.getText():null); 
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
		return dMeta;
	}
	// $ANTLR end "dropStmnt"



	// $ANTLR start "insertStmnt"
	// druidG.g:87:1: insertStmnt returns [BasicInsertMeta iMeta] : ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ;
	public final BasicInsertMeta insertStmnt() throws RecognitionException {
		BasicInsertMeta iMeta = null;


		Token id=null;
		Token paths=null;
		Token gran=null;
		Token delim=null;
		Token listDelim=null;
		Object a =null;
		List<Interval> i =null;

		 iMeta = new BasicInsertMeta();      
		try {
			// druidG.g:89:2: ( ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? )
			// druidG.g:89:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
			{
			// druidG.g:89:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? )
			// druidG.g:89:4: INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT,FOLLOW_INSERT_in_insertStmnt375); 
			match(input,WS,FOLLOW_WS_in_insertStmnt377); 
			match(input,INTO,FOLLOW_INTO_in_insertStmnt379); 
			match(input,WS,FOLLOW_WS_in_insertStmnt381); 
			// druidG.g:89:22: (id= ID )
			// druidG.g:89:23: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertStmnt386); 
			iMeta.dataSource = (id!=null?id.getText():null); 
			}

			// druidG.g:89:62: ( WS )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==WS) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// druidG.g:89:62: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt391); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt394); 
			// druidG.g:89:73: ( WS )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==WS) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// druidG.g:89:73: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt396); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertStmnt399);
			selectItems(iMeta);
			state._fsp--;

			// druidG.g:89:96: ( ( WS )? ',' ( WS )? selectItems[iMeta] )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==WS) ) {
					int LA19_1 = input.LA(2);
					if ( (LA19_1==91) ) {
						alt19=1;
					}

				}
				else if ( (LA19_0==91) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// druidG.g:89:97: ( WS )? ',' ( WS )? selectItems[iMeta]
					{
					// druidG.g:89:97: ( WS )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==WS) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// druidG.g:89:97: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt403); 
							}
							break;

					}

					match(input,91,FOLLOW_91_in_insertStmnt406); 
					// druidG.g:89:105: ( WS )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==WS) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// druidG.g:89:105: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt408); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertStmnt411);
					selectItems(iMeta);
					state._fsp--;

					}
					break;

				default :
					break loop19;
				}
			}

			// druidG.g:89:130: ( WS )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==WS) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// druidG.g:89:130: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt416); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt419); 
			// druidG.g:89:141: ( WS )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==WS) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// druidG.g:89:141: WS
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt421); 
					}
					break;

			}

			}

			// druidG.g:90:3: ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==VALUES) ) {
				alt29=1;
			}
			else if ( (LA29_0==FROM) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// druidG.g:91:5: ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? )
					{
					// druidG.g:91:5: ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? )
					// druidG.g:91:6: VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )?
					{
					match(input,VALUES,FOLLOW_VALUES_in_insertStmnt434); 
					// druidG.g:91:13: ( WS )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==WS) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// druidG.g:91:13: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt436); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt439); 
					// druidG.g:91:24: ( WS )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==WS) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// druidG.g:91:24: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt441); 
							}
							break;

					}

					// druidG.g:91:28: (a= anyValue )
					// druidG.g:91:29: a= anyValue
					{
					pushFollow(FOLLOW_anyValue_in_insertStmnt447);
					a=anyValue();
					state._fsp--;

					iMeta.values.add(a);
					}

					// druidG.g:91:65: ( ( WS )? ',' ( WS )? a= anyValue )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( (LA26_0==WS) ) {
							int LA26_1 = input.LA(2);
							if ( (LA26_1==91) ) {
								alt26=1;
							}

						}
						else if ( (LA26_0==91) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// druidG.g:91:66: ( WS )? ',' ( WS )? a= anyValue
							{
							// druidG.g:91:66: ( WS )?
							int alt24=2;
							int LA24_0 = input.LA(1);
							if ( (LA24_0==WS) ) {
								alt24=1;
							}
							switch (alt24) {
								case 1 :
									// druidG.g:91:66: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt454); 
									}
									break;

							}

							match(input,91,FOLLOW_91_in_insertStmnt457); 
							// druidG.g:91:74: ( WS )?
							int alt25=2;
							int LA25_0 = input.LA(1);
							if ( (LA25_0==WS) ) {
								alt25=1;
							}
							switch (alt25) {
								case 1 :
									// druidG.g:91:74: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt459); 
									}
									break;

							}

							pushFollow(FOLLOW_anyValue_in_insertStmnt464);
							a=anyValue();
							state._fsp--;

							iMeta.values.add(a);
							}
							break;

						default :
							break loop26;
						}
					}

					// druidG.g:91:114: ( WS )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==WS) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// druidG.g:91:114: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt470); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt473); 
					// druidG.g:91:125: ( WS )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==WS) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// druidG.g:91:125: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt475); 
							}
							break;

					}

					}

					}
					break;
				case 2 :
					// druidG.g:93:5: ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS )
					{
					// druidG.g:93:5: ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS )
					// druidG.g:93:6: FROM WS (paths= SINGLE_QUOTE_STRING ) WS
					{
					match(input,FROM,FOLLOW_FROM_in_insertStmnt492); 
					match(input,WS,FOLLOW_WS_in_insertStmnt494); 
					// druidG.g:93:14: (paths= SINGLE_QUOTE_STRING )
					// druidG.g:93:15: paths= SINGLE_QUOTE_STRING
					{
					paths=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt499); 
					iMeta.dataPath = unquote((paths!=null?paths.getText():null));
					}

					match(input,WS,FOLLOW_WS_in_insertStmnt504); 
					}

					}
					break;

			}

			// druidG.g:95:3: ( WHERE WS i= intervalClause )
			// druidG.g:95:4: WHERE WS i= intervalClause
			{
			match(input,WHERE,FOLLOW_WHERE_in_insertStmnt514); 
			match(input,WS,FOLLOW_WS_in_insertStmnt516); 
			pushFollow(FOLLOW_intervalClause_in_insertStmnt520);
			i=intervalClause();
			state._fsp--;

			}

			// druidG.g:96:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==WS) ) {
				int LA30_1 = input.LA(2);
				if ( (LA30_1==BREAK) ) {
					alt30=1;
				}
			}
			switch (alt30) {
				case 1 :
					// druidG.g:96:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt527); 
					match(input,BREAK,FOLLOW_BREAK_in_insertStmnt529); 
					match(input,WS,FOLLOW_WS_in_insertStmnt531); 
					match(input,BY,FOLLOW_BY_in_insertStmnt533); 
					match(input,WS,FOLLOW_WS_in_insertStmnt535); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt539); 
					 iMeta.granularitySpec = new GranularitySpec(unquote((gran!=null?gran.getText():null)));
					}
					break;

			}

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			// druidG.g:102:2: ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( (LA38_0==WS) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// druidG.g:102:3: WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )?
					{
					match(input,WS,FOLLOW_WS_in_insertStmnt553); 
					match(input,DELIMITER,FOLLOW_DELIMITER_in_insertStmnt555); 
					// druidG.g:102:16: ( WS )?
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==WS) ) {
						alt31=1;
					}
					switch (alt31) {
						case 1 :
							// druidG.g:102:16: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt557); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertStmnt560); 
					// druidG.g:102:27: ( WS )?
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==WS) ) {
						alt32=1;
					}
					switch (alt32) {
						case 1 :
							// druidG.g:102:27: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt562); 
							}
							break;

					}

					delim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt567); 
					iMeta.delimiter=unicode(unquote((delim!=null?delim.getText():null)));
					// druidG.g:102:105: ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==WS) ) {
						int LA35_1 = input.LA(2);
						if ( (LA35_1==91) ) {
							alt35=1;
						}
					}
					else if ( (LA35_0==91) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// druidG.g:102:106: ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING
							{
							// druidG.g:102:106: ( WS )?
							int alt33=2;
							int LA33_0 = input.LA(1);
							if ( (LA33_0==WS) ) {
								alt33=1;
							}
							switch (alt33) {
								case 1 :
									// druidG.g:102:106: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt571); 
									}
									break;

							}

							match(input,91,FOLLOW_91_in_insertStmnt574); 
							// druidG.g:102:114: ( WS )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==WS) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// druidG.g:102:114: WS
									{
									match(input,WS,FOLLOW_WS_in_insertStmnt576); 
									}
									break;

							}

							listDelim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt581); 
							iMeta.listDelimiter=unicode(unquote((listDelim!=null?listDelim.getText():null)));
							}
							break;

					}

					// druidG.g:102:207: ( WS )?
					int alt36=2;
					int LA36_0 = input.LA(1);
					if ( (LA36_0==WS) ) {
						alt36=1;
					}
					switch (alt36) {
						case 1 :
							// druidG.g:102:207: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt587); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertStmnt590); 
					// druidG.g:102:218: ( WS )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==WS) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// druidG.g:102:218: WS
							{
							match(input,WS,FOLLOW_WS_in_insertStmnt592); 
							}
							break;

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
		return iMeta;
	}
	// $ANTLR end "insertStmnt"



	// $ANTLR start "insertHStmnt"
	// druidG.g:105:1: insertHStmnt returns [BatchInsertMeta bMeta] : ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )? ;
	public final BatchInsertMeta insertHStmnt() throws RecognitionException {
		BatchInsertMeta bMeta = null;


		Token id=null;
		Token paths=null;
		Token gran=null;
		Token delim=null;
		Token listDelim=null;
		Token type=null;
		Token size=null;
		Token boundary=null;
		List<Interval> i =null;

		 bMeta = new BatchInsertMeta();      
		try {
			// druidG.g:107:2: ( ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )? )
			// druidG.g:107:3: ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause ) ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )?
			{
			// druidG.g:107:3: ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? )
			// druidG.g:107:4: INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT_HADOOP,FOLLOW_INSERT_HADOOP_in_insertHStmnt616); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt618); 
			match(input,INTO,FOLLOW_INTO_in_insertHStmnt620); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt622); 
			// druidG.g:107:29: (id= ID )
			// druidG.g:107:30: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertHStmnt627); 
			bMeta.dataSource = (id!=null?id.getText():null); 
			}

			// druidG.g:107:69: ( WS )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==WS) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// druidG.g:107:69: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt632); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt635); 
			// druidG.g:107:80: ( WS )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==WS) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// druidG.g:107:80: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt637); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertHStmnt640);
			selectItems(bMeta);
			state._fsp--;

			// druidG.g:107:103: ( ( WS )? ',' ( WS )? selectItems[bMeta] )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( (LA43_0==WS) ) {
					int LA43_1 = input.LA(2);
					if ( (LA43_1==91) ) {
						alt43=1;
					}

				}
				else if ( (LA43_0==91) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// druidG.g:107:104: ( WS )? ',' ( WS )? selectItems[bMeta]
					{
					// druidG.g:107:104: ( WS )?
					int alt41=2;
					int LA41_0 = input.LA(1);
					if ( (LA41_0==WS) ) {
						alt41=1;
					}
					switch (alt41) {
						case 1 :
							// druidG.g:107:104: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt644); 
							}
							break;

					}

					match(input,91,FOLLOW_91_in_insertHStmnt647); 
					// druidG.g:107:112: ( WS )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==WS) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// druidG.g:107:112: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt649); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertHStmnt652);
					selectItems(bMeta);
					state._fsp--;

					}
					break;

				default :
					break loop43;
				}
			}

			// druidG.g:107:137: ( WS )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==WS) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// druidG.g:107:137: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt657); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt660); 
			// druidG.g:107:148: ( WS )?
			int alt45=2;
			int LA45_0 = input.LA(1);
			if ( (LA45_0==WS) ) {
				alt45=1;
			}
			switch (alt45) {
				case 1 :
					// druidG.g:107:148: WS
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt662); 
					}
					break;

			}

			}

			match(input,FROM,FOLLOW_FROM_in_insertHStmnt669); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt671); 
			// druidG.g:108:11: (paths= SINGLE_QUOTE_STRING )
			// druidG.g:108:12: paths= SINGLE_QUOTE_STRING
			{
			paths=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt676); 
			bMeta.inputSpec.setPath(unquote((paths!=null?paths.getText():null)));bMeta.inferFormat(unquote((paths!=null?paths.getText():null)));
			}

			match(input,WS,FOLLOW_WS_in_insertHStmnt681); 
			// druidG.g:109:3: ( WHERE WS i= intervalClause )
			// druidG.g:109:4: WHERE WS i= intervalClause
			{
			match(input,WHERE,FOLLOW_WHERE_in_insertHStmnt686); 
			match(input,WS,FOLLOW_WS_in_insertHStmnt688); 
			pushFollow(FOLLOW_intervalClause_in_insertHStmnt692);
			i=intervalClause();
			state._fsp--;

			}

			// druidG.g:110:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt46=2;
			int LA46_0 = input.LA(1);
			if ( (LA46_0==WS) ) {
				int LA46_1 = input.LA(2);
				if ( (LA46_1==BREAK) ) {
					alt46=1;
				}
			}
			switch (alt46) {
				case 1 :
					// druidG.g:110:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt699); 
					match(input,BREAK,FOLLOW_BREAK_in_insertHStmnt701); 
					match(input,WS,FOLLOW_WS_in_insertHStmnt703); 
					match(input,BY,FOLLOW_BY_in_insertHStmnt705); 
					match(input,WS,FOLLOW_WS_in_insertHStmnt707); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt711); 
					 bMeta.granularitySpec = new GranularitySpec(unquote((gran!=null?gran.getText():null)));
					}
					break;

			}

			 // We set this later after granularitySpec object is fully formed.
				  if (i!= null && !i.isEmpty()) {
				     bMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
				  }
				
			// druidG.g:116:3: ( WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==WS) ) {
				int LA54_1 = input.LA(2);
				if ( (LA54_1==DELIMITER) ) {
					alt54=1;
				}
			}
			switch (alt54) {
				case 1 :
					// druidG.g:116:4: WS DELIMITER ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )?
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt726); 
					match(input,DELIMITER,FOLLOW_DELIMITER_in_insertHStmnt728); 
					// druidG.g:116:17: ( WS )?
					int alt47=2;
					int LA47_0 = input.LA(1);
					if ( (LA47_0==WS) ) {
						alt47=1;
					}
					switch (alt47) {
						case 1 :
							// druidG.g:116:17: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt730); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt733); 
					// druidG.g:116:28: ( WS )?
					int alt48=2;
					int LA48_0 = input.LA(1);
					if ( (LA48_0==WS) ) {
						alt48=1;
					}
					switch (alt48) {
						case 1 :
							// druidG.g:116:28: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt735); 
							}
							break;

					}

					delim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt740); 
					bMeta.delimiter=unicode(unquote((delim!=null?delim.getText():null)));
					// druidG.g:116:106: ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )?
					int alt51=2;
					int LA51_0 = input.LA(1);
					if ( (LA51_0==WS) ) {
						int LA51_1 = input.LA(2);
						if ( (LA51_1==91) ) {
							alt51=1;
						}
					}
					else if ( (LA51_0==91) ) {
						alt51=1;
					}
					switch (alt51) {
						case 1 :
							// druidG.g:116:107: ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING
							{
							// druidG.g:116:107: ( WS )?
							int alt49=2;
							int LA49_0 = input.LA(1);
							if ( (LA49_0==WS) ) {
								alt49=1;
							}
							switch (alt49) {
								case 1 :
									// druidG.g:116:107: WS
									{
									match(input,WS,FOLLOW_WS_in_insertHStmnt744); 
									}
									break;

							}

							match(input,91,FOLLOW_91_in_insertHStmnt747); 
							// druidG.g:116:115: ( WS )?
							int alt50=2;
							int LA50_0 = input.LA(1);
							if ( (LA50_0==WS) ) {
								alt50=1;
							}
							switch (alt50) {
								case 1 :
									// druidG.g:116:115: WS
									{
									match(input,WS,FOLLOW_WS_in_insertHStmnt749); 
									}
									break;

							}

							listDelim=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt754); 
							bMeta.listDelimiter=unicode(unquote((listDelim!=null?listDelim.getText():null)));
							}
							break;

					}

					// druidG.g:116:208: ( WS )?
					int alt52=2;
					int LA52_0 = input.LA(1);
					if ( (LA52_0==WS) ) {
						alt52=1;
					}
					switch (alt52) {
						case 1 :
							// druidG.g:116:208: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt760); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt763); 
					// druidG.g:116:219: ( WS )?
					int alt53=2;
					int LA53_0 = input.LA(1);
					if ( (LA53_0==WS) ) {
						int LA53_1 = input.LA(2);
						if ( (LA53_1==EOF||LA53_1==WS) ) {
							alt53=1;
						}
					}
					switch (alt53) {
						case 1 :
							// druidG.g:116:219: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt765); 
							}
							break;

					}

					}
					break;

			}

			// druidG.g:117:3: ( WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )?
			int alt61=2;
			int LA61_0 = input.LA(1);
			if ( (LA61_0==WS) ) {
				int LA61_1 = input.LA(2);
				if ( (LA61_1==PARTITION) ) {
					alt61=1;
				}
			}
			switch (alt61) {
				case 1 :
					// druidG.g:117:4: WS PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )?
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt774); 
					match(input,PARTITION,FOLLOW_PARTITION_in_insertHStmnt776); 
					// druidG.g:117:17: ( WS )?
					int alt55=2;
					int LA55_0 = input.LA(1);
					if ( (LA55_0==WS) ) {
						alt55=1;
					}
					switch (alt55) {
						case 1 :
							// druidG.g:117:17: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt778); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt781); 
					// druidG.g:117:28: ( WS )?
					int alt56=2;
					int LA56_0 = input.LA(1);
					if ( (LA56_0==WS) ) {
						alt56=1;
					}
					switch (alt56) {
						case 1 :
							// druidG.g:117:28: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt783); 
							}
							break;

					}

					type=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt788); 
					// druidG.g:117:57: ( WS )?
					int alt57=2;
					int LA57_0 = input.LA(1);
					if ( (LA57_0==WS) ) {
						alt57=1;
					}
					switch (alt57) {
						case 1 :
							// druidG.g:117:57: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt790); 
							}
							break;

					}

					match(input,91,FOLLOW_91_in_insertHStmnt793); 
					// druidG.g:117:65: ( WS )?
					int alt58=2;
					int LA58_0 = input.LA(1);
					if ( (LA58_0==WS) ) {
						alt58=1;
					}
					switch (alt58) {
						case 1 :
							// druidG.g:117:65: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt795); 
							}
							break;

					}

					size=(Token)match(input,LONG,FOLLOW_LONG_in_insertHStmnt800); 
					bMeta.partitionsSpec.type=unquote((type!=null?type.getText():null));bMeta.partitionsSpec.targetPartitionSize=Long.valueOf((size!=null?size.getText():null)); 
					// druidG.g:117:195: ( WS )?
					int alt59=2;
					int LA59_0 = input.LA(1);
					if ( (LA59_0==WS) ) {
						alt59=1;
					}
					switch (alt59) {
						case 1 :
							// druidG.g:117:195: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt804); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt807); 
					// druidG.g:117:206: ( WS )?
					int alt60=2;
					int LA60_0 = input.LA(1);
					if ( (LA60_0==WS) ) {
						int LA60_1 = input.LA(2);
						if ( (LA60_1==EOF||LA60_1==WS) ) {
							alt60=1;
						}
					}
					switch (alt60) {
						case 1 :
							// druidG.g:117:206: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt809); 
							}
							break;

					}

					}
					break;

			}

			// druidG.g:118:3: ( WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )?
			int alt68=2;
			int LA68_0 = input.LA(1);
			if ( (LA68_0==WS) ) {
				alt68=1;
			}
			switch (alt68) {
				case 1 :
					// druidG.g:118:4: WS ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )?
					{
					match(input,WS,FOLLOW_WS_in_insertHStmnt817); 
					match(input,ROLLUP,FOLLOW_ROLLUP_in_insertHStmnt819); 
					// druidG.g:118:14: ( WS )?
					int alt62=2;
					int LA62_0 = input.LA(1);
					if ( (LA62_0==WS) ) {
						alt62=1;
					}
					switch (alt62) {
						case 1 :
							// druidG.g:118:14: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt821); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_insertHStmnt824); 
					// druidG.g:118:25: ( WS )?
					int alt63=2;
					int LA63_0 = input.LA(1);
					if ( (LA63_0==WS) ) {
						alt63=1;
					}
					switch (alt63) {
						case 1 :
							// druidG.g:118:25: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt826); 
							}
							break;

					}

					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt831); 
					// druidG.g:118:54: ( WS )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==WS) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// druidG.g:118:54: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt833); 
							}
							break;

					}

					match(input,91,FOLLOW_91_in_insertHStmnt836); 
					// druidG.g:118:62: ( WS )?
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==WS) ) {
						alt65=1;
					}
					switch (alt65) {
						case 1 :
							// druidG.g:118:62: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt838); 
							}
							break;

					}

					boundary=(Token)match(input,LONG,FOLLOW_LONG_in_insertHStmnt843); 
					bMeta.rollupSpec.rollupGranularity=unquote((gran!=null?gran.getText():null));bMeta.rollupSpec.rowFlushBoundary=Long.valueOf((boundary!=null?boundary.getText():null)); 
					// druidG.g:118:202: ( WS )?
					int alt66=2;
					int LA66_0 = input.LA(1);
					if ( (LA66_0==WS) ) {
						alt66=1;
					}
					switch (alt66) {
						case 1 :
							// druidG.g:118:202: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt847); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_insertHStmnt850); 
					// druidG.g:118:213: ( WS )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==WS) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// druidG.g:118:213: WS
							{
							match(input,WS,FOLLOW_WS_in_insertHStmnt852); 
							}
							break;

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
		return bMeta;
	}
	// $ANTLR end "insertHStmnt"



	// $ANTLR start "insertRTStmnt"
	// druidG.g:121:1: insertRTStmnt returns [RTInsertMeta iMeta] : ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ;
	public final RTInsertMeta insertRTStmnt() throws RecognitionException {
		RTInsertMeta iMeta = null;


		Token id=null;
		Token gran=null;
		Object a =null;
		List<Interval> i =null;

		 iMeta = new RTInsertMeta();      
		try {
			// druidG.g:123:2: ( ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? )
			// druidG.g:123:3: ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			{
			// druidG.g:123:3: ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? )
			// druidG.g:123:4: INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )?
			{
			match(input,INSERT_REALTIME,FOLLOW_INSERT_REALTIME_in_insertRTStmnt875); 
			match(input,WS,FOLLOW_WS_in_insertRTStmnt877); 
			match(input,INTO,FOLLOW_INTO_in_insertRTStmnt879); 
			match(input,WS,FOLLOW_WS_in_insertRTStmnt881); 
			// druidG.g:123:31: (id= ID )
			// druidG.g:123:32: id= ID
			{
			id=(Token)match(input,ID,FOLLOW_ID_in_insertRTStmnt886); 
			iMeta.dataSource = (id!=null?id.getText():null); 
			}

			// druidG.g:123:71: ( WS )?
			int alt69=2;
			int LA69_0 = input.LA(1);
			if ( (LA69_0==WS) ) {
				alt69=1;
			}
			switch (alt69) {
				case 1 :
					// druidG.g:123:71: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt891); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertRTStmnt894); 
			// druidG.g:123:82: ( WS )?
			int alt70=2;
			int LA70_0 = input.LA(1);
			if ( (LA70_0==WS) ) {
				alt70=1;
			}
			switch (alt70) {
				case 1 :
					// druidG.g:123:82: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt896); 
					}
					break;

			}

			pushFollow(FOLLOW_selectItems_in_insertRTStmnt899);
			selectItems(iMeta);
			state._fsp--;

			// druidG.g:123:105: ( ( WS )? ',' ( WS )? selectItems[iMeta] )*
			loop73:
			while (true) {
				int alt73=2;
				int LA73_0 = input.LA(1);
				if ( (LA73_0==WS) ) {
					int LA73_1 = input.LA(2);
					if ( (LA73_1==91) ) {
						alt73=1;
					}

				}
				else if ( (LA73_0==91) ) {
					alt73=1;
				}

				switch (alt73) {
				case 1 :
					// druidG.g:123:106: ( WS )? ',' ( WS )? selectItems[iMeta]
					{
					// druidG.g:123:106: ( WS )?
					int alt71=2;
					int LA71_0 = input.LA(1);
					if ( (LA71_0==WS) ) {
						alt71=1;
					}
					switch (alt71) {
						case 1 :
							// druidG.g:123:106: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt903); 
							}
							break;

					}

					match(input,91,FOLLOW_91_in_insertRTStmnt906); 
					// druidG.g:123:114: ( WS )?
					int alt72=2;
					int LA72_0 = input.LA(1);
					if ( (LA72_0==WS) ) {
						alt72=1;
					}
					switch (alt72) {
						case 1 :
							// druidG.g:123:114: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt908); 
							}
							break;

					}

					pushFollow(FOLLOW_selectItems_in_insertRTStmnt911);
					selectItems(iMeta);
					state._fsp--;

					}
					break;

				default :
					break loop73;
				}
			}

			// druidG.g:123:139: ( WS )?
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==WS) ) {
				alt74=1;
			}
			switch (alt74) {
				case 1 :
					// druidG.g:123:139: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt916); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertRTStmnt919); 
			// druidG.g:123:150: ( WS )?
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==WS) ) {
				alt75=1;
			}
			switch (alt75) {
				case 1 :
					// druidG.g:123:150: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt921); 
					}
					break;

			}

			}

			match(input,VALUES,FOLLOW_VALUES_in_insertRTStmnt927); 
			// druidG.g:124:10: ( WS )?
			int alt76=2;
			int LA76_0 = input.LA(1);
			if ( (LA76_0==WS) ) {
				alt76=1;
			}
			switch (alt76) {
				case 1 :
					// druidG.g:124:10: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt929); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_insertRTStmnt932); 
			// druidG.g:124:21: ( WS )?
			int alt77=2;
			int LA77_0 = input.LA(1);
			if ( (LA77_0==WS) ) {
				alt77=1;
			}
			switch (alt77) {
				case 1 :
					// druidG.g:124:21: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt934); 
					}
					break;

			}

			// druidG.g:124:25: (a= anyValue )
			// druidG.g:124:26: a= anyValue
			{
			pushFollow(FOLLOW_anyValue_in_insertRTStmnt940);
			a=anyValue();
			state._fsp--;

			iMeta.values.add(a);
			}

			// druidG.g:124:62: ( ( WS )? ',' ( WS )? a= anyValue )*
			loop80:
			while (true) {
				int alt80=2;
				int LA80_0 = input.LA(1);
				if ( (LA80_0==WS) ) {
					int LA80_1 = input.LA(2);
					if ( (LA80_1==91) ) {
						alt80=1;
					}

				}
				else if ( (LA80_0==91) ) {
					alt80=1;
				}

				switch (alt80) {
				case 1 :
					// druidG.g:124:63: ( WS )? ',' ( WS )? a= anyValue
					{
					// druidG.g:124:63: ( WS )?
					int alt78=2;
					int LA78_0 = input.LA(1);
					if ( (LA78_0==WS) ) {
						alt78=1;
					}
					switch (alt78) {
						case 1 :
							// druidG.g:124:63: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt947); 
							}
							break;

					}

					match(input,91,FOLLOW_91_in_insertRTStmnt950); 
					// druidG.g:124:71: ( WS )?
					int alt79=2;
					int LA79_0 = input.LA(1);
					if ( (LA79_0==WS) ) {
						alt79=1;
					}
					switch (alt79) {
						case 1 :
							// druidG.g:124:71: WS
							{
							match(input,WS,FOLLOW_WS_in_insertRTStmnt952); 
							}
							break;

					}

					pushFollow(FOLLOW_anyValue_in_insertRTStmnt957);
					a=anyValue();
					state._fsp--;

					iMeta.values.add(a);
					}
					break;

				default :
					break loop80;
				}
			}

			// druidG.g:124:111: ( WS )?
			int alt81=2;
			int LA81_0 = input.LA(1);
			if ( (LA81_0==WS) ) {
				alt81=1;
			}
			switch (alt81) {
				case 1 :
					// druidG.g:124:111: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt963); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_insertRTStmnt966); 
			// druidG.g:124:122: ( WS )?
			int alt82=2;
			int LA82_0 = input.LA(1);
			if ( (LA82_0==WS) ) {
				alt82=1;
			}
			switch (alt82) {
				case 1 :
					// druidG.g:124:122: WS
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt968); 
					}
					break;

			}

			// druidG.g:125:3: ( WHERE WS i= intervalClause )?
			int alt83=2;
			int LA83_0 = input.LA(1);
			if ( (LA83_0==WHERE) ) {
				alt83=1;
			}
			switch (alt83) {
				case 1 :
					// druidG.g:125:4: WHERE WS i= intervalClause
					{
					match(input,WHERE,FOLLOW_WHERE_in_insertRTStmnt974); 
					match(input,WS,FOLLOW_WS_in_insertRTStmnt976); 
					pushFollow(FOLLOW_intervalClause_in_insertRTStmnt980);
					i=intervalClause();
					state._fsp--;

					}
					break;

			}

			// druidG.g:126:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
			int alt84=2;
			int LA84_0 = input.LA(1);
			if ( (LA84_0==WS) ) {
				int LA84_1 = input.LA(2);
				if ( (LA84_1==BREAK) ) {
					alt84=1;
				}
			}
			switch (alt84) {
				case 1 :
					// druidG.g:126:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
					{
					match(input,WS,FOLLOW_WS_in_insertRTStmnt988); 
					match(input,BREAK,FOLLOW_BREAK_in_insertRTStmnt990); 
					match(input,WS,FOLLOW_WS_in_insertRTStmnt992); 
					match(input,BY,FOLLOW_BY_in_insertRTStmnt994); 
					match(input,WS,FOLLOW_WS_in_insertRTStmnt996); 
					gran=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_insertRTStmnt1000); 
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
	// $ANTLR end "insertRTStmnt"



	// $ANTLR start "grandQuery"
	// druidG.g:134:1: grandQuery returns [QueryProgram program] : (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )* ( WS )? ( OPT_SEMI_COLON )? ;
	public final QueryProgram grandQuery() throws RecognitionException {
		QueryProgram program = null;


		Token j=null;
		Token a=null;
		QueryMeta s1 =null;
		QueryMeta s2 =null;

		 program = null; 
		try {
			// druidG.g:136:2: ( (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )* ( WS )? ( OPT_SEMI_COLON )? )
			// druidG.g:136:4: (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )* ( WS )? ( OPT_SEMI_COLON )?
			{
			// druidG.g:136:4: (s1= queryStmnt )
			// druidG.g:136:5: s1= queryStmnt
			{
			pushFollow(FOLLOW_queryStmnt_in_grandQuery1034);
			s1=queryStmnt();
			state._fsp--;

			}

			 program = new QueryProgram();program.addStmnt(s1); 
			// druidG.g:137:4: ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )*
			loop95:
			while (true) {
				int alt95=2;
				int LA95_0 = input.LA(1);
				if ( (LA95_0==WS) ) {
					int LA95_1 = input.LA(2);
					if ( (LA95_1==JOIN||LA95_1==LEFT_JOIN||LA95_1==RIGHT_JOIN) ) {
						alt95=1;
					}

				}

				switch (alt95) {
				case 1 :
					// druidG.g:137:5: WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN
					{
					match(input,WS,FOLLOW_WS_in_grandQuery1044); 
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
					// druidG.g:139:5: ( WS )?
					int alt85=2;
					int LA85_0 = input.LA(1);
					if ( (LA85_0==WS) ) {
						alt85=1;
					}
					switch (alt85) {
						case 1 :
							// druidG.g:139:5: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1069); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_grandQuery1072); 
					// druidG.g:139:16: ( WS )?
					int alt86=2;
					int LA86_0 = input.LA(1);
					if ( (LA86_0==WS) ) {
						alt86=1;
					}
					switch (alt86) {
						case 1 :
							// druidG.g:139:16: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1074); 
							}
							break;

					}

					// druidG.g:139:20: (s2= queryStmnt )
					// druidG.g:139:21: s2= queryStmnt
					{
					pushFollow(FOLLOW_queryStmnt_in_grandQuery1080);
					s2=queryStmnt();
					state._fsp--;

					}

					program.addStmnt(s2);
					// druidG.g:139:60: ( WS )?
					int alt87=2;
					int LA87_0 = input.LA(1);
					if ( (LA87_0==WS) ) {
						alt87=1;
					}
					switch (alt87) {
						case 1 :
							// druidG.g:139:60: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1085); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_grandQuery1088); 
					// druidG.g:139:71: ( WS )?
					int alt88=2;
					int LA88_0 = input.LA(1);
					if ( (LA88_0==WS) ) {
						alt88=1;
					}
					switch (alt88) {
						case 1 :
							// druidG.g:139:71: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1090); 
							}
							break;

					}

					match(input,ON,FOLLOW_ON_in_grandQuery1093); 
					// druidG.g:140:5: ( WS )?
					int alt89=2;
					int LA89_0 = input.LA(1);
					if ( (LA89_0==WS) ) {
						alt89=1;
					}
					switch (alt89) {
						case 1 :
							// druidG.g:140:5: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1100); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_grandQuery1103); 
					// druidG.g:140:16: ( WS )?
					int alt90=2;
					int LA90_0 = input.LA(1);
					if ( (LA90_0==WS) ) {
						alt90=1;
					}
					switch (alt90) {
						case 1 :
							// druidG.g:140:16: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1105); 
							}
							break;

					}

					// druidG.g:140:20: (a= ID )
					// druidG.g:140:21: a= ID
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_grandQuery1111); 
					 program.addJoinHook((a!=null?a.getText():null)); 
					}

					// druidG.g:140:60: ( ( WS )? ',' ( WS )? a= ID )*
					loop93:
					while (true) {
						int alt93=2;
						int LA93_0 = input.LA(1);
						if ( (LA93_0==WS) ) {
							int LA93_1 = input.LA(2);
							if ( (LA93_1==91) ) {
								alt93=1;
							}

						}
						else if ( (LA93_0==91) ) {
							alt93=1;
						}

						switch (alt93) {
						case 1 :
							// druidG.g:140:61: ( WS )? ',' ( WS )? a= ID
							{
							// druidG.g:140:61: ( WS )?
							int alt91=2;
							int LA91_0 = input.LA(1);
							if ( (LA91_0==WS) ) {
								alt91=1;
							}
							switch (alt91) {
								case 1 :
									// druidG.g:140:61: WS
									{
									match(input,WS,FOLLOW_WS_in_grandQuery1116); 
									}
									break;

							}

							match(input,91,FOLLOW_91_in_grandQuery1119); 
							// druidG.g:140:69: ( WS )?
							int alt92=2;
							int LA92_0 = input.LA(1);
							if ( (LA92_0==WS) ) {
								alt92=1;
							}
							switch (alt92) {
								case 1 :
									// druidG.g:140:69: WS
									{
									match(input,WS,FOLLOW_WS_in_grandQuery1121); 
									}
									break;

							}

							a=(Token)match(input,ID,FOLLOW_ID_in_grandQuery1126); 
							 program.addJoinHook((a!=null?a.getText():null)); 
							}
							break;

						default :
							break loop93;
						}
					}

					// druidG.g:140:114: ( WS )?
					int alt94=2;
					int LA94_0 = input.LA(1);
					if ( (LA94_0==WS) ) {
						alt94=1;
					}
					switch (alt94) {
						case 1 :
							// druidG.g:140:114: WS
							{
							match(input,WS,FOLLOW_WS_in_grandQuery1132); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_grandQuery1135); 
					}
					break;

				default :
					break loop95;
				}
			}

			// druidG.g:142:4: ( WS )?
			int alt96=2;
			int LA96_0 = input.LA(1);
			if ( (LA96_0==WS) ) {
				alt96=1;
			}
			switch (alt96) {
				case 1 :
					// druidG.g:142:4: WS
					{
					match(input,WS,FOLLOW_WS_in_grandQuery1154); 
					}
					break;

			}

			// druidG.g:142:8: ( OPT_SEMI_COLON )?
			int alt97=2;
			int LA97_0 = input.LA(1);
			if ( (LA97_0==OPT_SEMI_COLON) ) {
				alt97=1;
			}
			switch (alt97) {
				case 1 :
					// druidG.g:142:8: OPT_SEMI_COLON
					{
					match(input,OPT_SEMI_COLON,FOLLOW_OPT_SEMI_COLON_in_grandQuery1157); 
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
	// druidG.g:145:1: queryStmnt returns [QueryMeta qMeta] : SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM ( ( WS id= ID ) | ( WS LPARAN (fromQuery= queryStmnt ) RPARAN ) ) ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? ;
	public final QueryMeta queryStmnt() throws RecognitionException {
		QueryMeta qMeta = null;


		Token id=null;
		Token dir=null;
		Token l=null;
		Token s1=null;
		Token s2=null;
		Token s=null;
		QueryMeta fromQuery =null;
		Pair<Granularity, List<Pair<Integer, Integer>>> gran =null;
		Having h =null;
		PostAggItem p =null;

		 qMeta = GroupByQueryMeta.promote(new QueryMeta());
			((BaseAggQueryMeta)qMeta).aggregations = new ArrayList<>();
			qMeta.intervals = new ArrayList<>();
		      
		try {
			// druidG.g:150:2: ( SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM ( ( WS id= ID ) | ( WS LPARAN (fromQuery= queryStmnt ) RPARAN ) ) ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? )
			// druidG.g:150:4: SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM ( ( WS id= ID ) | ( WS LPARAN (fromQuery= queryStmnt ) RPARAN ) ) ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
			{
			match(input,SELECT,FOLLOW_SELECT_in_queryStmnt1180); 
			// druidG.g:151:7: ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )?
			int alt101=3;
			int LA101_0 = input.LA(1);
			if ( (LA101_0==WS) ) {
				int LA101_1 = input.LA(2);
				if ( (LA101_1==90) ) {
					alt101=2;
				}
				else if ( (LA101_1==COUNT||LA101_1==DOUBLE_SUM||(LA101_1 >= HYPER_UNIQUE && LA101_1 <= ID)||LA101_1==JAVASCRIPT||LA101_1==LONG_SUM||LA101_1==MAX||LA101_1==MIN||LA101_1==UNIQUE) ) {
					alt101=1;
				}
			}
			switch (alt101) {
				case 1 :
					// druidG.g:152:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					{
					// druidG.g:152:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
					// druidG.g:153:9: WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1208); 
					pushFollow(FOLLOW_selectItems_in_queryStmnt1210);
					selectItems(qMeta);
					state._fsp--;

					// druidG.g:153:31: ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
					loop100:
					while (true) {
						int alt100=2;
						int LA100_0 = input.LA(1);
						if ( (LA100_0==WS) ) {
							int LA100_1 = input.LA(2);
							if ( (LA100_1==91) ) {
								alt100=1;
							}

						}
						else if ( (LA100_0==91) ) {
							alt100=1;
						}

						switch (alt100) {
						case 1 :
							// druidG.g:153:32: ( WS )? ',' ( WS )? selectItems[qMeta]
							{
							// druidG.g:153:32: ( WS )?
							int alt98=2;
							int LA98_0 = input.LA(1);
							if ( (LA98_0==WS) ) {
								alt98=1;
							}
							switch (alt98) {
								case 1 :
									// druidG.g:153:32: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1214); 
									}
									break;

							}

							match(input,91,FOLLOW_91_in_queryStmnt1217); 
							// druidG.g:153:40: ( WS )?
							int alt99=2;
							int LA99_0 = input.LA(1);
							if ( (LA99_0==WS) ) {
								alt99=1;
							}
							switch (alt99) {
								case 1 :
									// druidG.g:153:40: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1219); 
									}
									break;

							}

							pushFollow(FOLLOW_selectItems_in_queryStmnt1222);
							selectItems(qMeta);
							state._fsp--;

							}
							break;

						default :
							break loop100;
						}
					}

					}

					}
					break;
				case 2 :
					// druidG.g:156:8: ( WS '*' )
					{
					// druidG.g:156:8: ( WS '*' )
					// druidG.g:156:9: WS '*'
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1253); 
					match(input,90,FOLLOW_90_in_queryStmnt1255); 
					}

					}
					break;

			}

			match(input,WS,FOLLOW_WS_in_queryStmnt1270); 
			match(input,FROM,FOLLOW_FROM_in_queryStmnt1272); 
			// druidG.g:159:4: ( ( WS id= ID ) | ( WS LPARAN (fromQuery= queryStmnt ) RPARAN ) )
			int alt102=2;
			int LA102_0 = input.LA(1);
			if ( (LA102_0==WS) ) {
				int LA102_1 = input.LA(2);
				if ( (LA102_1==ID) ) {
					alt102=1;
				}
				else if ( (LA102_1==LPARAN) ) {
					alt102=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 102, 1, input);
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
					// druidG.g:160:13: ( WS id= ID )
					{
					// druidG.g:160:13: ( WS id= ID )
					// druidG.g:160:14: WS id= ID
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1293); 
					id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1297); 
					 qMeta.dataSource = (id!=null?id.getText():null); 
					}

					}
					break;
				case 2 :
					// druidG.g:162:11: ( WS LPARAN (fromQuery= queryStmnt ) RPARAN )
					{
					// druidG.g:162:11: ( WS LPARAN (fromQuery= queryStmnt ) RPARAN )
					// druidG.g:162:12: WS LPARAN (fromQuery= queryStmnt ) RPARAN
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1334); 
					match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1336); 
					// druidG.g:162:22: (fromQuery= queryStmnt )
					// druidG.g:162:23: fromQuery= queryStmnt
					{
					pushFollow(FOLLOW_queryStmnt_in_queryStmnt1341);
					fromQuery=queryStmnt();
					state._fsp--;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1344); 
					qMeta.queryDataSource = fromQuery;
					}

					}
					break;

			}


			             if (((BaseAggQueryMeta)qMeta).aggregations.isEmpty()) {
				  		     qMeta = SelectQueryMeta.promote(qMeta);
				  	     }
				     
			// druidG.g:168:2: ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
			int alt127=2;
			int LA127_0 = input.LA(1);
			if ( (LA127_0==WS) ) {
				int LA127_1 = input.LA(2);
				if ( (LA127_1==WHERE) ) {
					alt127=1;
				}
			}
			switch (alt127) {
				case 1 :
					// druidG.g:169:4: WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
					{
					match(input,WS,FOLLOW_WS_in_queryStmnt1363); 
					match(input,WHERE,FOLLOW_WHERE_in_queryStmnt1365); 
					match(input,WS,FOLLOW_WS_in_queryStmnt1367); 
					pushFollow(FOLLOW_whereClause_in_queryStmnt1369);
					whereClause(qMeta);
					state._fsp--;

					// druidG.g:170:4: ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? )
					// druidG.g:171:5: ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )?
					{
					// druidG.g:171:5: ( WS BREAK WS BY WS gran= granularityClause )?
					int alt103=2;
					int LA103_0 = input.LA(1);
					if ( (LA103_0==WS) ) {
						int LA103_1 = input.LA(2);
						if ( (LA103_1==BREAK) ) {
							alt103=1;
						}
					}
					switch (alt103) {
						case 1 :
							// druidG.g:171:6: WS BREAK WS BY WS gran= granularityClause
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1387); 
							match(input,BREAK,FOLLOW_BREAK_in_queryStmnt1389); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1391); 
							match(input,BY,FOLLOW_BY_in_queryStmnt1393); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1395); 
							pushFollow(FOLLOW_granularityClause_in_queryStmnt1399);
							gran=granularityClause();
							state._fsp--;


									      qMeta.granularity = gran.a;
									      if (gran.b != null) {
									        qMeta.microIntervals.addAll(gran.b);
									      }
									    
							}
							break;

					}

					// druidG.g:178:5: ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )?
					int alt108=2;
					int LA108_0 = input.LA(1);
					if ( (LA108_0==WS) ) {
						int LA108_1 = input.LA(2);
						if ( (LA108_1==GROUP) ) {
							alt108=1;
						}
					}
					switch (alt108) {
						case 1 :
							// druidG.g:178:6: WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )?
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1416); 
							match(input,GROUP,FOLLOW_GROUP_in_queryStmnt1418); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1420); 
							match(input,BY,FOLLOW_BY_in_queryStmnt1422); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1424); 

									       qMeta = GroupByQueryMeta.promote(qMeta);
									       if (((GroupByQueryMeta)qMeta).fetchDimensions == null) {
									          System.err.println("No dimensions !! ");
									       }
									      
							// druidG.g:185:10: (id= ID ( ( WS )? ',' ( WS )? id= ID )* )
							// druidG.g:185:11: id= ID ( ( WS )? ',' ( WS )? id= ID )*
							{
							id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1450); 

									              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
									                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
									              }   
									           
							// druidG.g:191:14: ( ( WS )? ',' ( WS )? id= ID )*
							loop106:
							while (true) {
								int alt106=2;
								int LA106_0 = input.LA(1);
								if ( (LA106_0==WS) ) {
									int LA106_1 = input.LA(2);
									if ( (LA106_1==91) ) {
										alt106=1;
									}

								}
								else if ( (LA106_0==91) ) {
									alt106=1;
								}

								switch (alt106) {
								case 1 :
									// druidG.g:191:15: ( WS )? ',' ( WS )? id= ID
									{
									// druidG.g:191:15: ( WS )?
									int alt104=2;
									int LA104_0 = input.LA(1);
									if ( (LA104_0==WS) ) {
										alt104=1;
									}
									switch (alt104) {
										case 1 :
											// druidG.g:191:15: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1482); 
											}
											break;

									}

									match(input,91,FOLLOW_91_in_queryStmnt1485); 
									// druidG.g:191:23: ( WS )?
									int alt105=2;
									int LA105_0 = input.LA(1);
									if ( (LA105_0==WS) ) {
										alt105=1;
									}
									switch (alt105) {
										case 1 :
											// druidG.g:191:23: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1487); 
											}
											break;

									}

									id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1492); 

												              if (!((GroupByQueryMeta)qMeta).checkDimOrAlias((id!=null?id.getText():null))) {
												                 System.err.println("Dimension/Alias " + (id!=null?id.getText():null) + " not valid..");
												              }   
											           	
									}
									break;

								default :
									break loop106;
								}
							}

							}

							// druidG.g:199:10: ( WS HAVING WS h= havingClause )?
							int alt107=2;
							int LA107_0 = input.LA(1);
							if ( (LA107_0==WS) ) {
								int LA107_1 = input.LA(2);
								if ( (LA107_1==HAVING) ) {
									alt107=1;
								}
							}
							switch (alt107) {
								case 1 :
									// druidG.g:199:11: WS HAVING WS h= havingClause
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1549); 
									match(input,HAVING,FOLLOW_HAVING_in_queryStmnt1551); 
									match(input,WS,FOLLOW_WS_in_queryStmnt1553); 
									pushFollow(FOLLOW_havingClause_in_queryStmnt1557);
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
					// druidG.g:203:5: ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )?
					int alt110=2;
					int LA110_0 = input.LA(1);
					if ( (LA110_0==WS) ) {
						int LA110_1 = input.LA(2);
						if ( (LA110_1==ORDER) ) {
							alt110=1;
						}
					}
					switch (alt110) {
						case 1 :
							// druidG.g:203:6: WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )?
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1601); 
							match(input,ORDER,FOLLOW_ORDER_in_queryStmnt1603); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1605); 
							match(input,BY,FOLLOW_BY_in_queryStmnt1607); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1609); 
							// druidG.g:203:24: (id= ID )
							// druidG.g:203:25: id= ID
							{
							id=(Token)match(input,ID,FOLLOW_ID_in_queryStmnt1614); 
							}

								
									  	if (((PlainDimQueryMeta)qMeta).fetchDimensions.size() != 1) {
										   ((GroupByQueryMeta)qMeta).limitSpec = new LimitSpec();
										   
									  	} else {// If fetchDimensions = 1 then TopN is more optimal.
									           qMeta = TopNQueryMeta.promote(qMeta);
								        	   ((TopNQueryMeta)qMeta).metric = (id!=null?id.getText():null);
									      	}
									      
							// druidG.g:214:9: ( WS dir= ( ASC | DESC ) )?
							int alt109=2;
							int LA109_0 = input.LA(1);
							if ( (LA109_0==WS) ) {
								int LA109_1 = input.LA(2);
								if ( (LA109_1==ASC||LA109_1==DESC) ) {
									alt109=1;
								}
							}
							switch (alt109) {
								case 1 :
									// druidG.g:214:10: WS dir= ( ASC | DESC )
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1647); 
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

					// druidG.g:235:5: ( WS LIMIT WS (l= LONG ) )?
					int alt111=2;
					int LA111_0 = input.LA(1);
					if ( (LA111_0==WS) ) {
						int LA111_1 = input.LA(2);
						if ( (LA111_1==LIMIT) ) {
							alt111=1;
						}
					}
					switch (alt111) {
						case 1 :
							// druidG.g:236:6: WS LIMIT WS (l= LONG )
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1701); 
							match(input,LIMIT,FOLLOW_LIMIT_in_queryStmnt1703); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1705); 
							// druidG.g:236:18: (l= LONG )
							// druidG.g:236:19: l= LONG
							{
							l=(Token)match(input,LONG,FOLLOW_LONG_in_queryStmnt1710); 
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

					// druidG.g:250:7: ( WS THEN WS p= postAggItem )?
					int alt112=2;
					int LA112_0 = input.LA(1);
					if ( (LA112_0==WS) ) {
						int LA112_1 = input.LA(2);
						if ( (LA112_1==THEN) ) {
							alt112=1;
						}
					}
					switch (alt112) {
						case 1 :
							// druidG.g:250:8: WS THEN WS p= postAggItem
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1748); 
							match(input,THEN,FOLLOW_THEN_in_queryStmnt1750); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1752); 
							pushFollow(FOLLOW_postAggItem_in_queryStmnt1756);
							p=postAggItem();
							state._fsp--;

							QueryUtils.setPostAggregation(qMeta, p);
							}
							break;

					}

					}

					// druidG.g:252:4: ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )?
					int alt122=2;
					int LA122_0 = input.LA(1);
					if ( (LA122_0==WS) ) {
						int LA122_1 = input.LA(2);
						if ( (LA122_1==WHICH) ) {
							alt122=1;
						}
					}
					switch (alt122) {
						case 1 :
							// druidG.g:252:5: WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1771); 
							match(input,WHICH,FOLLOW_WHICH_in_queryStmnt1773); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1775); 
							match(input,CONTAINS,FOLLOW_CONTAINS_in_queryStmnt1777); 
							qMeta = SearchQueryMeta.promote(qMeta);
							// druidG.g:252:68: ( WS )?
							int alt113=2;
							int LA113_0 = input.LA(1);
							if ( (LA113_0==WS) ) {
								alt113=1;
							}
							switch (alt113) {
								case 1 :
									// druidG.g:252:68: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1781); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1784); 
							// druidG.g:252:79: ( WS )?
							int alt114=2;
							int LA114_0 = input.LA(1);
							if ( (LA114_0==WS) ) {
								alt114=1;
							}
							switch (alt114) {
								case 1 :
									// druidG.g:252:79: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1786); 
									}
									break;

							}

							// druidG.g:252:83: (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* )
							// druidG.g:252:84: s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
							{
							s1=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1792); 
							((SearchQueryMeta)qMeta).type = "insensitive_contains";((SearchQueryMeta)qMeta).addValue((s1!=null?s1.getText():null));
							// druidG.g:252:208: ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
							loop117:
							while (true) {
								int alt117=2;
								int LA117_0 = input.LA(1);
								if ( (LA117_0==WS) ) {
									int LA117_1 = input.LA(2);
									if ( (LA117_1==91) ) {
										alt117=1;
									}

								}
								else if ( (LA117_0==91) ) {
									alt117=1;
								}

								switch (alt117) {
								case 1 :
									// druidG.g:252:209: ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING
									{
									// druidG.g:252:209: ( WS )?
									int alt115=2;
									int LA115_0 = input.LA(1);
									if ( (LA115_0==WS) ) {
										alt115=1;
									}
									switch (alt115) {
										case 1 :
											// druidG.g:252:209: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1796); 
											}
											break;

									}

									match(input,91,FOLLOW_91_in_queryStmnt1799); 
									// druidG.g:252:217: ( WS )?
									int alt116=2;
									int LA116_0 = input.LA(1);
									if ( (LA116_0==WS) ) {
										alt116=1;
									}
									switch (alt116) {
										case 1 :
											// druidG.g:252:217: WS
											{
											match(input,WS,FOLLOW_WS_in_queryStmnt1801); 
											}
											break;

									}

									s2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1806); 
									((SearchQueryMeta)qMeta).type = "fragment";((SearchQueryMeta)qMeta).addValue((s2!=null?s2.getText():null));
									}
									break;

								default :
									break loop117;
								}
							}

							}

							// druidG.g:252:337: ( WS )?
							int alt118=2;
							int LA118_0 = input.LA(1);
							if ( (LA118_0==WS) ) {
								alt118=1;
							}
							switch (alt118) {
								case 1 :
									// druidG.g:252:337: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1813); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1816); 
							match(input,WS,FOLLOW_WS_in_queryStmnt1822); 
							match(input,SORT,FOLLOW_SORT_in_queryStmnt1824); 
							// druidG.g:253:13: ( WS )?
							int alt119=2;
							int LA119_0 = input.LA(1);
							if ( (LA119_0==WS) ) {
								alt119=1;
							}
							switch (alt119) {
								case 1 :
									// druidG.g:253:13: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1826); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1829); 
							// druidG.g:253:24: ( WS )?
							int alt120=2;
							int LA120_0 = input.LA(1);
							if ( (LA120_0==WS) ) {
								alt120=1;
							}
							switch (alt120) {
								case 1 :
									// druidG.g:253:24: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1831); 
									}
									break;

							}

							// druidG.g:253:28: (s= SINGLE_QUOTE_STRING )
							// druidG.g:253:29: s= SINGLE_QUOTE_STRING
							{
							s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1837); 
							}

							((SearchQueryMeta)qMeta).setSort((s!=null?s.getText():null));
							// druidG.g:253:97: ( WS )?
							int alt121=2;
							int LA121_0 = input.LA(1);
							if ( (LA121_0==WS) ) {
								alt121=1;
							}
							switch (alt121) {
								case 1 :
									// druidG.g:253:97: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1842); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1845); 
							}
							break;

					}

					// druidG.g:255:4: ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
					int alt126=2;
					int LA126_0 = input.LA(1);
					if ( (LA126_0==WS) ) {
						int LA126_1 = input.LA(2);
						if ( (LA126_1==HINT) ) {
							alt126=1;
						}
					}
					switch (alt126) {
						case 1 :
							// druidG.g:255:5: WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN
							{
							match(input,WS,FOLLOW_WS_in_queryStmnt1857); 
							match(input,HINT,FOLLOW_HINT_in_queryStmnt1859); 
							// druidG.g:255:13: ( WS )?
							int alt123=2;
							int LA123_0 = input.LA(1);
							if ( (LA123_0==WS) ) {
								alt123=1;
							}
							switch (alt123) {
								case 1 :
									// druidG.g:255:13: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1861); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_queryStmnt1864); 
							// druidG.g:255:24: ( WS )?
							int alt124=2;
							int LA124_0 = input.LA(1);
							if ( (LA124_0==WS) ) {
								alt124=1;
							}
							switch (alt124) {
								case 1 :
									// druidG.g:255:24: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1866); 
									}
									break;

							}

							s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1871); 
							qMeta = HintProcessor.process(qMeta, (s!=null?s.getText():null));
							// druidG.g:255:99: ( WS )?
							int alt125=2;
							int LA125_0 = input.LA(1);
							if ( (LA125_0==WS) ) {
								alt125=1;
							}
							switch (alt125) {
								case 1 :
									// druidG.g:255:99: WS
									{
									match(input,WS,FOLLOW_WS_in_queryStmnt1875); 
									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_queryStmnt1878); 
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
	// druidG.g:265:1: anyValue returns [Object obj] : (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) );
	public final Object anyValue() throws RecognitionException {
		Object obj = null;


		Token a=null;
		Token b=null;

		try {
			// druidG.g:266:2: (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) )
			int alt128=2;
			int LA128_0 = input.LA(1);
			if ( (LA128_0==SINGLE_QUOTE_STRING) ) {
				alt128=1;
			}
			else if ( (LA128_0==FLOAT||LA128_0==LONG) ) {
				alt128=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 128, 0, input);
				throw nvae;
			}

			switch (alt128) {
				case 1 :
					// druidG.g:266:3: a= SINGLE_QUOTE_STRING
					{
					a=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1912); 
					obj = unquote((a!=null?a.getText():null));
					}
					break;
				case 2 :
					// druidG.g:266:53: b= ( LONG | FLOAT )
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
	// druidG.g:269:1: selectItems[BaseStatementMeta meta] : (ai= aggItem |sd= simpleDim );
	public final void selectItems(BaseStatementMeta meta) throws RecognitionException {
		AggItem ai =null;
		Pair<String, String> sd =null;

		try {
			// druidG.g:270:2: (ai= aggItem |sd= simpleDim )
			int alt129=2;
			int LA129_0 = input.LA(1);
			if ( (LA129_0==COUNT||LA129_0==DOUBLE_SUM||LA129_0==HYPER_UNIQUE||LA129_0==JAVASCRIPT||LA129_0==LONG_SUM||LA129_0==MAX||LA129_0==MIN||LA129_0==UNIQUE) ) {
				alt129=1;
			}
			else if ( (LA129_0==ID) ) {
				alt129=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 129, 0, input);
				throw nvae;
			}

			switch (alt129) {
				case 1 :
					// druidG.g:270:5: ai= aggItem
					{
					pushFollow(FOLLOW_aggItem_in_selectItems1943);
					ai=aggItem();
					state._fsp--;

					 
						      if (meta instanceof QueryMeta) {
						        ((BaseAggQueryMeta)meta).aggregations.add(ai);
						      } else if (meta instanceof InsertMeta) {
					 	        ((InsertMeta)meta).aggregations.add(ai);
					   	        if (ai.isDirectMetric()) {//Unique, hyperUnique, Count etc are not part of the data
						      	  ((InsertMeta)meta).addColumnInOrder(ai.getCanonicalName());
						        }
						      }
						      
						   
					}
					break;
				case 2 :
					// druidG.g:281:5: sd= simpleDim
					{
					pushFollow(FOLLOW_simpleDim_in_selectItems1953);
					sd=simpleDim();
					state._fsp--;

					 
						      if (meta instanceof QueryMeta) {
						         ((PlainDimQueryMeta)meta).fetchDimensions.put(sd.a, sd.b);
						      } else if (meta instanceof InsertMeta) {
					 	         ((InsertMeta)meta).fetchDimensions.put(sd.a, sd.b);
					 	         ((InsertMeta)meta).addColumnInOrder((sd.b != null)? sd.b : sd.a);
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
	// druidG.g:291:1: simpleDim returns [Pair<String, String> dims] : (a= ID ( WS AS WS b= ID )? ) ;
	public final Pair<String, String> simpleDim() throws RecognitionException {
		Pair<String, String> dims = null;


		Token a=null;
		Token b=null;

		try {
			// druidG.g:292:2: ( (a= ID ( WS AS WS b= ID )? ) )
			// druidG.g:292:4: (a= ID ( WS AS WS b= ID )? )
			{
			// druidG.g:292:4: (a= ID ( WS AS WS b= ID )? )
			// druidG.g:292:5: a= ID ( WS AS WS b= ID )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_simpleDim1974); 
			// druidG.g:292:10: ( WS AS WS b= ID )?
			int alt130=2;
			int LA130_0 = input.LA(1);
			if ( (LA130_0==WS) ) {
				int LA130_1 = input.LA(2);
				if ( (LA130_1==AS) ) {
					alt130=1;
				}
			}
			switch (alt130) {
				case 1 :
					// druidG.g:292:11: WS AS WS b= ID
					{
					match(input,WS,FOLLOW_WS_in_simpleDim1977); 
					match(input,AS,FOLLOW_AS_in_simpleDim1979); 
					match(input,WS,FOLLOW_WS_in_simpleDim1981); 
					b=(Token)match(input,ID,FOLLOW_ID_in_simpleDim1985); 
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
	// druidG.g:299:1: whereClause[QueryMeta qMeta] : intls= intervalClause ( WS AND WS f= grandFilter )? ;
	public final void whereClause(QueryMeta qMeta) throws RecognitionException {
		List<Interval> intls =null;
		Filter f =null;

		try {
			// druidG.g:300:2: (intls= intervalClause ( WS AND WS f= grandFilter )? )
			// druidG.g:300:3: intls= intervalClause ( WS AND WS f= grandFilter )?
			{
			pushFollow(FOLLOW_intervalClause_in_whereClause2008);
			intls=intervalClause();
			state._fsp--;

			qMeta.intervals.addAll(intls);
			// druidG.g:300:57: ( WS AND WS f= grandFilter )?
			int alt131=2;
			int LA131_0 = input.LA(1);
			if ( (LA131_0==WS) ) {
				int LA131_1 = input.LA(2);
				if ( (LA131_1==AND) ) {
					alt131=1;
				}
			}
			switch (alt131) {
				case 1 :
					// druidG.g:300:58: WS AND WS f= grandFilter
					{
					match(input,WS,FOLLOW_WS_in_whereClause2013); 
					match(input,AND,FOLLOW_AND_in_whereClause2015); 
					match(input,WS,FOLLOW_WS_in_whereClause2017); 
					pushFollow(FOLLOW_grandFilter_in_whereClause2021);
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
	// druidG.g:304:1: intervalClause returns [List<Interval> intervals] : 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) ;
	public final List<Interval> intervalClause() throws RecognitionException {
		List<Interval> intervals = null;


		Token st2=null;
		Token et2=null;
		ParserRuleReturnScope st =null;
		ParserRuleReturnScope et =null;
		Pair<String, String> p1 =null;
		Pair<String, String> p2 =null;

		 intervals = new ArrayList<>();
		try {
			// druidG.g:306:2: ( 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) )
			// druidG.g:306:4: 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			{
			match(input,92,FOLLOW_92_in_intervalClause2047); 
			match(input,WS,FOLLOW_WS_in_intervalClause2049); 
			match(input,BETWEEN,FOLLOW_BETWEEN_in_intervalClause2051); 
			match(input,WS,FOLLOW_WS_in_intervalClause2053); 
			// druidG.g:307:2: ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
			int alt139=2;
			int LA139_0 = input.LA(1);
			if ( ((LA139_0 >= DATE && LA139_0 <= DATE_YEAR_ONLY)||LA139_0==SINGLE_QUOTE_STRING) ) {
				alt139=1;
			}
			else if ( (LA139_0==LPARAN) ) {
				alt139=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 139, 0, input);
				throw nvae;
			}

			switch (alt139) {
				case 1 :
					// druidG.g:308:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					{
					// druidG.g:308:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
					// druidG.g:309:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					{
					// druidG.g:309:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
					// druidG.g:309:7: (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING )
					{
					// druidG.g:309:7: (st= isoTime |st2= SINGLE_QUOTE_STRING )
					int alt132=2;
					int LA132_0 = input.LA(1);
					if ( ((LA132_0 >= DATE && LA132_0 <= DATE_YEAR_ONLY)) ) {
						alt132=1;
					}
					else if ( (LA132_0==SINGLE_QUOTE_STRING) ) {
						alt132=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 132, 0, input);
						throw nvae;
					}

					switch (alt132) {
						case 1 :
							// druidG.g:309:8: st= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause2073);
							st=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// druidG.g:309:22: st2= SINGLE_QUOTE_STRING
							{
							st2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2080); 
							}
							break;

					}

					match(input,WS,FOLLOW_WS_in_intervalClause2084); 
					match(input,AND,FOLLOW_AND_in_intervalClause2086); 
					match(input,WS,FOLLOW_WS_in_intervalClause2088); 
					// druidG.g:309:58: (et= isoTime |et2= SINGLE_QUOTE_STRING )
					int alt133=2;
					int LA133_0 = input.LA(1);
					if ( ((LA133_0 >= DATE && LA133_0 <= DATE_YEAR_ONLY)) ) {
						alt133=1;
					}
					else if ( (LA133_0==SINGLE_QUOTE_STRING) ) {
						alt133=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 133, 0, input);
						throw nvae;
					}

					switch (alt133) {
						case 1 :
							// druidG.g:309:59: et= isoTime
							{
							pushFollow(FOLLOW_isoTime_in_intervalClause2093);
							et=isoTime();
							state._fsp--;

							}
							break;
						case 2 :
							// druidG.g:309:73: et2= SINGLE_QUOTE_STRING
							{
							et2=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2100); 
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
					// druidG.g:326:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					{
					// druidG.g:326:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
					// druidG.g:326:5: LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_intervalClause2126); 
					// druidG.g:326:12: ( WS )?
					int alt134=2;
					int LA134_0 = input.LA(1);
					if ( (LA134_0==WS) ) {
						alt134=1;
					}
					switch (alt134) {
						case 1 :
							// druidG.g:326:12: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause2128); 
							}
							break;

					}

					pushFollow(FOLLOW_pairString_in_intervalClause2133);
					p1=pairString();
					state._fsp--;

					intervals.add(new Interval(p1.a, p1.b));
					// druidG.g:327:7: ( ( WS )? ',' ( WS )? p2= pairString )*
					loop137:
					while (true) {
						int alt137=2;
						int LA137_0 = input.LA(1);
						if ( (LA137_0==WS) ) {
							int LA137_1 = input.LA(2);
							if ( (LA137_1==91) ) {
								alt137=1;
							}

						}
						else if ( (LA137_0==91) ) {
							alt137=1;
						}

						switch (alt137) {
						case 1 :
							// druidG.g:327:8: ( WS )? ',' ( WS )? p2= pairString
							{
							// druidG.g:327:8: ( WS )?
							int alt135=2;
							int LA135_0 = input.LA(1);
							if ( (LA135_0==WS) ) {
								alt135=1;
							}
							switch (alt135) {
								case 1 :
									// druidG.g:327:8: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause2145); 
									}
									break;

							}

							match(input,91,FOLLOW_91_in_intervalClause2148); 
							// druidG.g:327:16: ( WS )?
							int alt136=2;
							int LA136_0 = input.LA(1);
							if ( (LA136_0==WS) ) {
								alt136=1;
							}
							switch (alt136) {
								case 1 :
									// druidG.g:327:16: WS
									{
									match(input,WS,FOLLOW_WS_in_intervalClause2150); 
									}
									break;

							}

							pushFollow(FOLLOW_pairString_in_intervalClause2155);
							p2=pairString();
							state._fsp--;

							intervals.add(new Interval(p2.a, p2.b));
							}
							break;

						default :
							break loop137;
						}
					}

					// druidG.g:327:79: ( WS )?
					int alt138=2;
					int LA138_0 = input.LA(1);
					if ( (LA138_0==WS) ) {
						alt138=1;
					}
					switch (alt138) {
						case 1 :
							// druidG.g:327:79: WS
							{
							match(input,WS,FOLLOW_WS_in_intervalClause2161); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_intervalClause2164); 
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
	// druidG.g:332:1: getEquals returns [EqualsToHolder holder] : (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) ;
	public final EqualsToHolder getEquals() throws RecognitionException {
		EqualsToHolder holder = null;


		Token a=null;
		Token b=null;

		try {
			// druidG.g:333:2: ( (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) )
			// druidG.g:333:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			{
			// druidG.g:333:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
			// druidG.g:333:5: a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_getEquals2187); 
			// druidG.g:333:10: ( WS )?
			int alt140=2;
			int LA140_0 = input.LA(1);
			if ( (LA140_0==WS) ) {
				alt140=1;
			}
			switch (alt140) {
				case 1 :
					// druidG.g:333:10: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals2189); 
					}
					break;

			}

			match(input,EQUALS,FOLLOW_EQUALS_in_getEquals2192); 
			// druidG.g:333:21: ( WS )?
			int alt141=2;
			int LA141_0 = input.LA(1);
			if ( (LA141_0==WS) ) {
				alt141=1;
			}
			switch (alt141) {
				case 1 :
					// druidG.g:333:21: WS
					{
					match(input,WS,FOLLOW_WS_in_getEquals2194); 
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
	// druidG.g:338:1: granularityClause returns [Pair<Granularity, List<Pair<Integer, Integer>>> clause] : ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) );
	public final Pair<Granularity, List<Pair<Integer, Integer>>> granularityClause() throws RecognitionException {
		Pair<Granularity, List<Pair<Integer, Integer>>> clause = null;


		Token s=null;
		Token dur=null;
		Token orig=null;
		Token per=null;
		Token tz=null;
		List<Pair<Integer, Integer>> inc =null;

		Granularity granularity = new Granularity("all");clause = new Pair<>(granularity, null);
		try {
			// druidG.g:340:2: ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) )
			int alt164=2;
			int LA164_0 = input.LA(1);
			if ( (LA164_0==SINGLE_QUOTE_STRING) ) {
				alt164=1;
			}
			else if ( (LA164_0==DURATION||LA164_0==PERIOD) ) {
				alt164=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 164, 0, input);
				throw nvae;
			}

			switch (alt164) {
				case 1 :
					// druidG.g:340:3: ( (s= SINGLE_QUOTE_STRING ) )
					{
					// druidG.g:340:3: ( (s= SINGLE_QUOTE_STRING ) )
					// druidG.g:340:4: (s= SINGLE_QUOTE_STRING )
					{
					// druidG.g:340:4: (s= SINGLE_QUOTE_STRING )
					// druidG.g:340:5: s= SINGLE_QUOTE_STRING
					{
					s=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2239); 
					}

					granularity = new Granularity((s!=null?s.getText():null));clause = new Pair<>(granularity, null);
					}

					}
					break;
				case 2 :
					// druidG.g:342:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
					{
					// druidG.g:342:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
					int alt163=2;
					int LA163_0 = input.LA(1);
					if ( (LA163_0==DURATION) ) {
						alt163=1;
					}
					else if ( (LA163_0==PERIOD) ) {
						alt163=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 163, 0, input);
						throw nvae;
					}

					switch (alt163) {
						case 1 :
							// druidG.g:343:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							{
							// druidG.g:343:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							// druidG.g:343:7: DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
							{
							match(input,DURATION,FOLLOW_DURATION_in_granularityClause2263); 
							// druidG.g:343:16: ( WS )?
							int alt142=2;
							int LA142_0 = input.LA(1);
							if ( (LA142_0==WS) ) {
								alt142=1;
							}
							switch (alt142) {
								case 1 :
									// druidG.g:343:16: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2265); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause2268); 
							// druidG.g:343:27: ( WS )?
							int alt143=2;
							int LA143_0 = input.LA(1);
							if ( (LA143_0==WS) ) {
								alt143=1;
							}
							switch (alt143) {
								case 1 :
									// druidG.g:343:27: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2270); 
									}
									break;

							}

							dur=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2275); 
							granularity.setDuration((dur!=null?dur.getText():null));
							// druidG.g:343:93: ( WS )?
							int alt144=2;
							int LA144_0 = input.LA(1);
							if ( (LA144_0==WS) ) {
								alt144=1;
							}
							switch (alt144) {
								case 1 :
									// druidG.g:343:93: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2279); 
									}
									break;

							}

							// druidG.g:343:97: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt146=2;
							int LA146_0 = input.LA(1);
							if ( (LA146_0==91) ) {
								int LA146_1 = input.LA(2);
								if ( (LA146_1==WS) ) {
									int LA146_4 = input.LA(3);
									if ( (LA146_4==SINGLE_QUOTE_STRING) ) {
										alt146=1;
									}
								}
								else if ( (LA146_1==SINGLE_QUOTE_STRING) ) {
									alt146=1;
								}
							}
							switch (alt146) {
								case 1 :
									// druidG.g:343:98: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,91,FOLLOW_91_in_granularityClause2283); 
									// druidG.g:343:102: ( WS )?
									int alt145=2;
									int LA145_0 = input.LA(1);
									if ( (LA145_0==WS) ) {
										alt145=1;
									}
									switch (alt145) {
										case 1 :
											// druidG.g:343:102: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2285); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2290); 
									granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							clause = new Pair<>(granularity, null);
							// druidG.g:343:211: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
							int alt150=2;
							int LA150_0 = input.LA(1);
							if ( (LA150_0==WS||LA150_0==91) ) {
								alt150=1;
							}
							switch (alt150) {
								case 1 :
									// druidG.g:343:212: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
									{
									// druidG.g:343:212: ( WS )?
									int alt147=2;
									int LA147_0 = input.LA(1);
									if ( (LA147_0==WS) ) {
										alt147=1;
									}
									switch (alt147) {
										case 1 :
											// druidG.g:343:212: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2298); 
											}
											break;

									}

									match(input,91,FOLLOW_91_in_granularityClause2301); 
									// druidG.g:343:220: ( WS )?
									int alt148=2;
									int LA148_0 = input.LA(1);
									if ( (LA148_0==WS) ) {
										int LA148_1 = input.LA(2);
										if ( (LA148_1==WS) ) {
											alt148=1;
										}
									}
									switch (alt148) {
										case 1 :
											// druidG.g:343:220: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2303); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause2308);
									inc=granularityInclude();
									state._fsp--;

									clause = new Pair<>(granularity, inc);
									// druidG.g:343:288: ( WS )?
									int alt149=2;
									int LA149_0 = input.LA(1);
									if ( (LA149_0==WS) ) {
										alt149=1;
									}
									switch (alt149) {
										case 1 :
											// druidG.g:343:288: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2312); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause2317); 
							}

							}
							break;
						case 2 :
							// druidG.g:345:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							{
							// druidG.g:345:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
							// druidG.g:345:7: PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
							{
							match(input,PERIOD,FOLLOW_PERIOD_in_granularityClause2336); 
							// druidG.g:345:14: ( WS )?
							int alt151=2;
							int LA151_0 = input.LA(1);
							if ( (LA151_0==WS) ) {
								alt151=1;
							}
							switch (alt151) {
								case 1 :
									// druidG.g:345:14: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2338); 
									}
									break;

							}

							match(input,LPARAN,FOLLOW_LPARAN_in_granularityClause2341); 
							// druidG.g:345:25: ( WS )?
							int alt152=2;
							int LA152_0 = input.LA(1);
							if ( (LA152_0==WS) ) {
								alt152=1;
							}
							switch (alt152) {
								case 1 :
									// druidG.g:345:25: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2343); 
									}
									break;

							}

							per=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2348); 
							granularity.setPeriod((per!=null?per.getText():null));
							// druidG.g:345:89: ( WS )?
							int alt153=2;
							int LA153_0 = input.LA(1);
							if ( (LA153_0==WS) ) {
								alt153=1;
							}
							switch (alt153) {
								case 1 :
									// druidG.g:345:89: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2352); 
									}
									break;

							}

							// druidG.g:345:93: ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )?
							int alt155=2;
							int LA155_0 = input.LA(1);
							if ( (LA155_0==91) ) {
								int LA155_1 = input.LA(2);
								if ( (LA155_1==WS) ) {
									int LA155_4 = input.LA(3);
									if ( (LA155_4==SINGLE_QUOTE_STRING) ) {
										alt155=1;
									}
								}
								else if ( (LA155_1==SINGLE_QUOTE_STRING) ) {
									alt155=1;
								}
							}
							switch (alt155) {
								case 1 :
									// druidG.g:345:94: ',' ( WS )? tz= SINGLE_QUOTE_STRING
									{
									match(input,91,FOLLOW_91_in_granularityClause2356); 
									// druidG.g:345:98: ( WS )?
									int alt154=2;
									int LA154_0 = input.LA(1);
									if ( (LA154_0==WS) ) {
										alt154=1;
									}
									switch (alt154) {
										case 1 :
											// druidG.g:345:98: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2358); 
											}
											break;

									}

									tz=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2363); 
									granularity.setTimeZone((tz!=null?tz.getText():null));
									}
									break;

							}

							// druidG.g:345:164: ( WS )?
							int alt156=2;
							int LA156_0 = input.LA(1);
							if ( (LA156_0==WS) ) {
								alt156=1;
							}
							switch (alt156) {
								case 1 :
									// druidG.g:345:164: WS
									{
									match(input,WS,FOLLOW_WS_in_granularityClause2369); 
									}
									break;

							}

							// druidG.g:345:168: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
							int alt158=2;
							int LA158_0 = input.LA(1);
							if ( (LA158_0==91) ) {
								int LA158_1 = input.LA(2);
								if ( (LA158_1==WS) ) {
									int LA158_4 = input.LA(3);
									if ( (LA158_4==SINGLE_QUOTE_STRING) ) {
										alt158=1;
									}
								}
								else if ( (LA158_1==SINGLE_QUOTE_STRING) ) {
									alt158=1;
								}
							}
							switch (alt158) {
								case 1 :
									// druidG.g:345:169: ',' ( WS )? orig= SINGLE_QUOTE_STRING
									{
									match(input,91,FOLLOW_91_in_granularityClause2373); 
									// druidG.g:345:173: ( WS )?
									int alt157=2;
									int LA157_0 = input.LA(1);
									if ( (LA157_0==WS) ) {
										alt157=1;
									}
									switch (alt157) {
										case 1 :
											// druidG.g:345:173: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2375); 
											}
											break;

									}

									orig=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2380); 
									granularity.setOrigin((orig!=null?orig.getText():null));
									}
									break;

							}

							clause = new Pair<>(granularity, null);
							// druidG.g:345:283: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
							int alt162=2;
							int LA162_0 = input.LA(1);
							if ( (LA162_0==WS||LA162_0==91) ) {
								alt162=1;
							}
							switch (alt162) {
								case 1 :
									// druidG.g:345:284: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
									{
									// druidG.g:345:284: ( WS )?
									int alt159=2;
									int LA159_0 = input.LA(1);
									if ( (LA159_0==WS) ) {
										alt159=1;
									}
									switch (alt159) {
										case 1 :
											// druidG.g:345:284: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2389); 
											}
											break;

									}

									match(input,91,FOLLOW_91_in_granularityClause2392); 
									// druidG.g:345:292: ( WS )?
									int alt160=2;
									int LA160_0 = input.LA(1);
									if ( (LA160_0==WS) ) {
										int LA160_1 = input.LA(2);
										if ( (LA160_1==WS) ) {
											alt160=1;
										}
									}
									switch (alt160) {
										case 1 :
											// druidG.g:345:292: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2394); 
											}
											break;

									}

									pushFollow(FOLLOW_granularityInclude_in_granularityClause2399);
									inc=granularityInclude();
									state._fsp--;

									clause = new Pair<>(granularity, inc);
									// druidG.g:345:360: ( WS )?
									int alt161=2;
									int LA161_0 = input.LA(1);
									if ( (LA161_0==WS) ) {
										alt161=1;
									}
									switch (alt161) {
										case 1 :
											// druidG.g:345:360: WS
											{
											match(input,WS,FOLLOW_WS_in_granularityClause2403); 
											}
											break;

									}

									}
									break;

							}

							match(input,RPARAN,FOLLOW_RPARAN_in_granularityClause2408); 
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
	// druidG.g:349:1: granularityInclude returns [List<Pair<Integer, Integer>> microIntervals] : ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) ;
	public final List<Pair<Integer, Integer>> granularityInclude() throws RecognitionException {
		List<Pair<Integer, Integer>> microIntervals = null;


		Pair<Integer, Integer> p1 =null;
		Pair<Integer, Integer> p2 =null;

		microIntervals = new ArrayList<>();
		try {
			// druidG.g:351:2: ( ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) )
			// druidG.g:352:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			{
			// druidG.g:352:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
			// druidG.g:352:4: WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN
			{
			match(input,WS,FOLLOW_WS_in_granularityInclude2436); 
			match(input,INCLUDE,FOLLOW_INCLUDE_in_granularityInclude2438); 
			// druidG.g:352:15: ( WS )?
			int alt165=2;
			int LA165_0 = input.LA(1);
			if ( (LA165_0==WS) ) {
				alt165=1;
			}
			switch (alt165) {
				case 1 :
					// druidG.g:352:15: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude2440); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_granularityInclude2443); 
			// druidG.g:352:26: ( WS )?
			int alt166=2;
			int LA166_0 = input.LA(1);
			if ( (LA166_0==WS) ) {
				alt166=1;
			}
			switch (alt166) {
				case 1 :
					// druidG.g:352:26: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude2445); 
					}
					break;

			}

			// druidG.g:352:30: (p1= pairNums ( ',' p2= pairNums )* )
			// druidG.g:352:31: p1= pairNums ( ',' p2= pairNums )*
			{
			pushFollow(FOLLOW_pairNums_in_granularityInclude2451);
			p1=pairNums();
			state._fsp--;

			microIntervals.add(p1);
			// druidG.g:352:69: ( ',' p2= pairNums )*
			loop167:
			while (true) {
				int alt167=2;
				int LA167_0 = input.LA(1);
				if ( (LA167_0==91) ) {
					alt167=1;
				}

				switch (alt167) {
				case 1 :
					// druidG.g:352:70: ',' p2= pairNums
					{
					match(input,91,FOLLOW_91_in_granularityInclude2456); 
					pushFollow(FOLLOW_pairNums_in_granularityInclude2460);
					p2=pairNums();
					state._fsp--;

					microIntervals.add(p2);
					}
					break;

				default :
					break loop167;
				}
			}

			}

			// druidG.g:352:115: ( WS )?
			int alt168=2;
			int LA168_0 = input.LA(1);
			if ( (LA168_0==WS) ) {
				alt168=1;
			}
			switch (alt168) {
				case 1 :
					// druidG.g:352:115: WS
					{
					match(input,WS,FOLLOW_WS_in_granularityInclude2467); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_granularityInclude2470); 
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
	// druidG.g:355:1: pairNums returns [Pair<Integer, Integer> pair] : ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) ;
	public final Pair<Integer, Integer> pairNums() throws RecognitionException {
		Pair<Integer, Integer> pair = null;


		Token i=null;
		Token j=null;

		try {
			// druidG.g:356:2: ( ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) )
			// druidG.g:356:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			{
			// druidG.g:356:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
			// druidG.g:356:5: LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairNums2489); 
			// druidG.g:356:13: ( WS )?
			int alt169=2;
			int LA169_0 = input.LA(1);
			if ( (LA169_0==WS) ) {
				alt169=1;
			}
			switch (alt169) {
				case 1 :
					// druidG.g:356:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2491); 
					}
					break;

			}

			i=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums2496); 
			// druidG.g:356:25: ( WS )?
			int alt170=2;
			int LA170_0 = input.LA(1);
			if ( (LA170_0==WS) ) {
				alt170=1;
			}
			switch (alt170) {
				case 1 :
					// druidG.g:356:25: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2499); 
					}
					break;

			}

			match(input,91,FOLLOW_91_in_pairNums2502); 
			// druidG.g:356:33: ( WS )?
			int alt171=2;
			int LA171_0 = input.LA(1);
			if ( (LA171_0==WS) ) {
				alt171=1;
			}
			switch (alt171) {
				case 1 :
					// druidG.g:356:33: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2504); 
					}
					break;

			}

			j=(Token)match(input,LONG,FOLLOW_LONG_in_pairNums2509); 
			// druidG.g:356:44: ( WS )?
			int alt172=2;
			int LA172_0 = input.LA(1);
			if ( (LA172_0==WS) ) {
				alt172=1;
			}
			switch (alt172) {
				case 1 :
					// druidG.g:356:44: WS
					{
					match(input,WS,FOLLOW_WS_in_pairNums2511); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairNums2514); 
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
	// druidG.g:359:1: pairString returns [Pair<String, String> pair] : ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) ;
	public final Pair<String, String> pairString() throws RecognitionException {
		Pair<String, String> pair = null;


		Token i=null;
		Token j=null;

		try {
			// druidG.g:360:2: ( ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) )
			// druidG.g:360:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			{
			// druidG.g:360:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
			// druidG.g:360:5: LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE
			{
			match(input,LSQUARE,FOLLOW_LSQUARE_in_pairString2534); 
			// druidG.g:360:13: ( WS )?
			int alt173=2;
			int LA173_0 = input.LA(1);
			if ( (LA173_0==WS) ) {
				alt173=1;
			}
			switch (alt173) {
				case 1 :
					// druidG.g:360:13: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2536); 
					}
					break;

			}

			i=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString2541); 
			// druidG.g:360:40: ( WS )?
			int alt174=2;
			int LA174_0 = input.LA(1);
			if ( (LA174_0==WS) ) {
				alt174=1;
			}
			switch (alt174) {
				case 1 :
					// druidG.g:360:40: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2544); 
					}
					break;

			}

			match(input,91,FOLLOW_91_in_pairString2547); 
			// druidG.g:360:48: ( WS )?
			int alt175=2;
			int LA175_0 = input.LA(1);
			if ( (LA175_0==WS) ) {
				alt175=1;
			}
			switch (alt175) {
				case 1 :
					// druidG.g:360:48: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2549); 
					}
					break;

			}

			j=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_pairString2554); 
			// druidG.g:360:74: ( WS )?
			int alt176=2;
			int LA176_0 = input.LA(1);
			if ( (LA176_0==WS) ) {
				alt176=1;
			}
			switch (alt176) {
				case 1 :
					// druidG.g:360:74: WS
					{
					match(input,WS,FOLLOW_WS_in_pairString2556); 
					}
					break;

			}

			match(input,RSQUARE,FOLLOW_RSQUARE_in_pairString2559); 
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
	// druidG.g:367:1: havingClause returns [Having having] : h= complexHaving ;
	public final Having havingClause() throws RecognitionException {
		Having having = null;


		Having h =null;

		try {
			// druidG.g:368:2: (h= complexHaving )
			// druidG.g:368:4: h= complexHaving
			{
			pushFollow(FOLLOW_complexHaving_in_havingClause2584);
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
	// druidG.g:371:1: simpleHaving returns [Having having] : ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) );
	public final Having simpleHaving() throws RecognitionException {
		Having having = null;


		Token a=null;
		Token t=null;
		Token v=null;
		Token n=null;
		EqualsToHolder e =null;

		try {
			// druidG.g:372:2: ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) )
			int alt181=3;
			int LA181_0 = input.LA(1);
			if ( (LA181_0==ID) ) {
				switch ( input.LA(2) ) {
				case WS:
					{
					int LA181_3 = input.LA(3);
					if ( (LA181_3==COMPARE_OPER) ) {
						alt181=1;
					}
					else if ( (LA181_3==EQUALS) ) {
						alt181=2;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 181, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

					}
					break;
				case COMPARE_OPER:
					{
					alt181=1;
					}
					break;
				case EQUALS:
					{
					alt181=2;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 181, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}
			else if ( (LA181_0==NOT) ) {
				alt181=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 181, 0, input);
				throw nvae;
			}

			switch (alt181) {
				case 1 :
					// druidG.g:372:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// druidG.g:372:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// druidG.g:372:5: a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving2605); 
					// druidG.g:372:10: ( WS )?
					int alt177=2;
					int LA177_0 = input.LA(1);
					if ( (LA177_0==WS) ) {
						alt177=1;
					}
					switch (alt177) {
						case 1 :
							// druidG.g:372:10: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2607); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving2612); 
					// druidG.g:372:29: ( WS )?
					int alt178=2;
					int LA178_0 = input.LA(1);
					if ( (LA178_0==WS) ) {
						alt178=1;
					}
					switch (alt178) {
						case 1 :
							// druidG.g:372:29: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2614); 
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
					// druidG.g:373:4: (e= getEquals )
					{
					// druidG.g:373:4: (e= getEquals )
					// druidG.g:373:5: e= getEquals
					{
					pushFollow(FOLLOW_getEquals_in_simpleHaving2636);
					e=getEquals();
					state._fsp--;

					}

					having = new Having("=", e.name, e.value);
					}
					break;
				case 3 :
					// druidG.g:374:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					{
					// druidG.g:374:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
					// druidG.g:374:5: n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
					{
					n=(Token)match(input,NOT,FOLLOW_NOT_in_simpleHaving2647); 
					match(input,WS,FOLLOW_WS_in_simpleHaving2649); 
					a=(Token)match(input,ID,FOLLOW_ID_in_simpleHaving2653); 
					// druidG.g:374:19: ( WS )?
					int alt179=2;
					int LA179_0 = input.LA(1);
					if ( (LA179_0==WS) ) {
						alt179=1;
					}
					switch (alt179) {
						case 1 :
							// druidG.g:374:19: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2655); 
							}
							break;

					}

					t=(Token)match(input,COMPARE_OPER,FOLLOW_COMPARE_OPER_in_simpleHaving2660); 
					// druidG.g:374:38: ( WS )?
					int alt180=2;
					int LA180_0 = input.LA(1);
					if ( (LA180_0==WS) ) {
						alt180=1;
					}
					switch (alt180) {
						case 1 :
							// druidG.g:374:38: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleHaving2662); 
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
	// druidG.g:377:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );
	public final Having complexHaving() throws RecognitionException {
		Having having = null;


		Token o=null;
		Having s =null;
		Having a =null;
		Having b =null;

		try {
			// druidG.g:378:2: ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) )
			int alt182=2;
			alt182 = dfa182.predict(input);
			switch (alt182) {
				case 1 :
					// druidG.g:378:4: (s= simpleHaving )
					{
					// druidG.g:378:4: (s= simpleHaving )
					// druidG.g:378:5: s= simpleHaving
					{
					pushFollow(FOLLOW_simpleHaving_in_complexHaving2695);
					s=simpleHaving();
					state._fsp--;

					}

					having = s;
					}
					break;
				case 2 :
					// druidG.g:379:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
					{
					// druidG.g:379:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
					// druidG.g:379:5: a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving
					{
					pushFollow(FOLLOW_simpleHaving_in_complexHaving2706);
					a=simpleHaving();
					state._fsp--;

					match(input,WS,FOLLOW_WS_in_complexHaving2708); 
					o=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,WS,FOLLOW_WS_in_complexHaving2718); 
					pushFollow(FOLLOW_complexHaving_in_complexHaving2722);
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



	// $ANTLR start "grandFilter"
	// druidG.g:386:1: grandFilter returns [Filter filter] : a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* ;
	public final Filter grandFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;

		try {
			// druidG.g:387:2: (a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* )
			// druidG.g:387:3: a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )*
			{
			pushFollow(FOLLOW_semiGrandFilter_in_grandFilter2751);
			a=semiGrandFilter();
			state._fsp--;

			filter = a;
			// druidG.g:387:35: ( WS o= ( AND | OR ) WS b= semiGrandFilter )*
			loop183:
			while (true) {
				int alt183=2;
				int LA183_0 = input.LA(1);
				if ( (LA183_0==WS) ) {
					int LA183_1 = input.LA(2);
					if ( (LA183_1==AND||LA183_1==OR) ) {
						alt183=1;
					}

				}

				switch (alt183) {
				case 1 :
					// druidG.g:387:36: WS o= ( AND | OR ) WS b= semiGrandFilter
					{
					match(input,WS,FOLLOW_WS_in_grandFilter2756); 
					o=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						state.errorRecovery=false;
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					match(input,WS,FOLLOW_WS_in_grandFilter2766); 
					pushFollow(FOLLOW_semiGrandFilter_in_grandFilter2770);
					b=semiGrandFilter();
					state._fsp--;


						         Filter tmpFilter = filter;
						         filter = new Filter((o!=null?o.getText():null).toLowerCase());
							 filter.fields = new ArrayList<>();
							 filter.fields.add(tmpFilter);
							 if (b != null) {
							    filter.fields.add(b);
							 }
							
					}
					break;

				default :
					break loop183;
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
		return filter;
	}
	// $ANTLR end "grandFilter"



	// $ANTLR start "semiGrandFilter"
	// druidG.g:399:1: semiGrandFilter returns [Filter filter] : (a= simpleLogicalFilter | LPARAN ( WS )? a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* ( WS )? RPARAN );
	public final Filter semiGrandFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;

		try {
			// druidG.g:400:2: (a= simpleLogicalFilter | LPARAN ( WS )? a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* ( WS )? RPARAN )
			int alt187=2;
			int LA187_0 = input.LA(1);
			if ( (LA187_0==ID||LA187_0==NOT) ) {
				alt187=1;
			}
			else if ( (LA187_0==LPARAN) ) {
				alt187=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 187, 0, input);
				throw nvae;
			}

			switch (alt187) {
				case 1 :
					// druidG.g:401:2: a= simpleLogicalFilter
					{
					pushFollow(FOLLOW_simpleLogicalFilter_in_semiGrandFilter2801);
					a=simpleLogicalFilter();
					state._fsp--;

					filter = a;
					}
					break;
				case 2 :
					// druidG.g:402:3: LPARAN ( WS )? a= semiGrandFilter ( WS o= ( AND | OR ) WS b= semiGrandFilter )* ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_semiGrandFilter2808); 
					// druidG.g:402:10: ( WS )?
					int alt184=2;
					int LA184_0 = input.LA(1);
					if ( (LA184_0==WS) ) {
						alt184=1;
					}
					switch (alt184) {
						case 1 :
							// druidG.g:402:10: WS
							{
							match(input,WS,FOLLOW_WS_in_semiGrandFilter2810); 
							}
							break;

					}

					pushFollow(FOLLOW_semiGrandFilter_in_semiGrandFilter2815);
					a=semiGrandFilter();
					state._fsp--;

					filter = a;
					// druidG.g:402:47: ( WS o= ( AND | OR ) WS b= semiGrandFilter )*
					loop185:
					while (true) {
						int alt185=2;
						int LA185_0 = input.LA(1);
						if ( (LA185_0==WS) ) {
							int LA185_1 = input.LA(2);
							if ( (LA185_1==AND||LA185_1==OR) ) {
								alt185=1;
							}

						}

						switch (alt185) {
						case 1 :
							// druidG.g:402:48: WS o= ( AND | OR ) WS b= semiGrandFilter
							{
							match(input,WS,FOLLOW_WS_in_semiGrandFilter2821); 
							o=input.LT(1);
							if ( input.LA(1)==AND||input.LA(1)==OR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,WS,FOLLOW_WS_in_semiGrandFilter2831); 
							pushFollow(FOLLOW_semiGrandFilter_in_semiGrandFilter2835);
							b=semiGrandFilter();
							state._fsp--;

							Filter tmpFilter = filter;
								         filter = new Filter((o!=null?o.getText():null).toLowerCase());
									 filter.fields = new ArrayList<>();
									 filter.fields.add(tmpFilter);
									 if (b != null) {
									    filter.fields.add(b);
									 }
									
							}
							break;

						default :
							break loop185;
						}
					}

					// druidG.g:410:7: ( WS )?
					int alt186=2;
					int LA186_0 = input.LA(1);
					if ( (LA186_0==WS) ) {
						alt186=1;
					}
					switch (alt186) {
						case 1 :
							// druidG.g:410:7: WS
							{
							match(input,WS,FOLLOW_WS_in_semiGrandFilter2851); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_semiGrandFilter2854); 
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
	// $ANTLR end "semiGrandFilter"



	// $ANTLR start "simpleLogicalFilter"
	// druidG.g:413:1: simpleLogicalFilter returns [Filter filter] : ( (a= simpleFilter ) | ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) );
	public final Filter simpleLogicalFilter() throws RecognitionException {
		Filter filter = null;


		Token o=null;
		Filter a =null;
		Filter b =null;

		try {
			// druidG.g:414:2: ( (a= simpleFilter ) | ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) )
			int alt189=2;
			alt189 = dfa189.predict(input);
			switch (alt189) {
				case 1 :
					// druidG.g:415:2: (a= simpleFilter )
					{
					// druidG.g:415:2: (a= simpleFilter )
					// druidG.g:415:3: a= simpleFilter
					{
					pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2873);
					a=simpleFilter();
					state._fsp--;

					}

					filter = a;
					}
					break;
				case 2 :
					// druidG.g:416:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					{
					// druidG.g:416:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
					int alt188=2;
					int LA188_0 = input.LA(1);
					if ( (LA188_0==ID) ) {
						alt188=1;
					}
					else if ( (LA188_0==NOT) ) {
						alt188=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 188, 0, input);
						throw nvae;
					}

					switch (alt188) {
						case 1 :
							// druidG.g:416:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							{
							// druidG.g:416:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
							// druidG.g:416:5: a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter
							{
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2885);
							a=simpleFilter();
							state._fsp--;

							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2887); 
							o=input.LT(1);
							if ( input.LA(1)==AND||input.LA(1)==OR ) {
								input.consume();
								state.errorRecovery=false;
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								throw mse;
							}
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2897); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2901);
							b=simpleFilter();
							state._fsp--;

							}

							}
							break;
						case 2 :
							// druidG.g:416:55: (o= NOT WS b= simpleFilter )
							{
							// druidG.g:416:55: (o= NOT WS b= simpleFilter )
							// druidG.g:416:56: o= NOT WS b= simpleFilter
							{
							o=(Token)match(input,NOT,FOLLOW_NOT_in_simpleLogicalFilter2909); 
							match(input,WS,FOLLOW_WS_in_simpleLogicalFilter2911); 
							pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2915);
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
							 if (b != null) {		 
					   	 	    filter.fields.add(b);
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
		return filter;
	}
	// $ANTLR end "simpleLogicalFilter"



	// $ANTLR start "simpleFilter"
	// druidG.g:429:1: simpleFilter returns [Filter filter] : (a= selectorFilter |a= regexFilter ) ;
	public final Filter simpleFilter() throws RecognitionException {
		Filter filter = null;


		Filter a =null;

		try {
			// druidG.g:430:2: ( (a= selectorFilter |a= regexFilter ) )
			// druidG.g:430:4: (a= selectorFilter |a= regexFilter )
			{
			// druidG.g:430:4: (a= selectorFilter |a= regexFilter )
			int alt190=2;
			int LA190_0 = input.LA(1);
			if ( (LA190_0==ID) ) {
				int LA190_1 = input.LA(2);
				if ( (LA190_1==WS) ) {
					int LA190_2 = input.LA(3);
					if ( (LA190_2==LIKE) ) {
						alt190=2;
					}
					else if ( (LA190_2==EQUALS) ) {
						alt190=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 190, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA190_1==EQUALS) ) {
					alt190=1;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 190, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 190, 0, input);
				throw nvae;
			}

			switch (alt190) {
				case 1 :
					// druidG.g:430:5: a= selectorFilter
					{
					pushFollow(FOLLOW_selectorFilter_in_simpleFilter2942);
					a=selectorFilter();
					state._fsp--;

					}
					break;
				case 2 :
					// druidG.g:430:24: a= regexFilter
					{
					pushFollow(FOLLOW_regexFilter_in_simpleFilter2948);
					a=regexFilter();
					state._fsp--;

					}
					break;

			}

			filter = a;
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



	// $ANTLR start "selectorFilter"
	// druidG.g:433:1: selectorFilter returns [Filter filter] : e= getEquals ;
	public final Filter selectorFilter() throws RecognitionException {
		Filter filter = null;


		EqualsToHolder e =null;

		filter = new Filter("selector");
		try {
			// druidG.g:435:2: (e= getEquals )
			// druidG.g:435:4: e= getEquals
			{
			pushFollow(FOLLOW_getEquals_in_selectorFilter2973);
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
	// druidG.g:441:1: regexFilter returns [Filter filter] : (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) ;
	public final Filter regexFilter() throws RecognitionException {
		Filter filter = null;


		Token a=null;
		Token b=null;

		filter = new Filter("regex");
		try {
			// druidG.g:443:2: ( (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) )
			// druidG.g:443:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			{
			// druidG.g:443:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
			// druidG.g:443:5: a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING )
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_regexFilter3002); 
			match(input,WS,FOLLOW_WS_in_regexFilter3004); 
			match(input,LIKE,FOLLOW_LIKE_in_regexFilter3006); 
			match(input,WS,FOLLOW_WS_in_regexFilter3008); 
			// druidG.g:443:24: ( SINGLE_QUOTE_STRING )
			// druidG.g:443:25: SINGLE_QUOTE_STRING
			{
			b=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter3014); 
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



	// $ANTLR start "aggItem"
	// druidG.g:453:1: aggItem returns [AggItem aggItem] : aggCallSite[aggItem] ( WS AS WS x= ID )? ;
	public final AggItem aggItem() throws RecognitionException {
		AggItem aggItem = null;


		Token x=null;

		  aggItem = new AggItem(); 
		try {
			// druidG.g:455:2: ( aggCallSite[aggItem] ( WS AS WS x= ID )? )
			// druidG.g:455:4: aggCallSite[aggItem] ( WS AS WS x= ID )?
			{
			pushFollow(FOLLOW_aggCallSite_in_aggItem3045);
			aggCallSite(aggItem);
			state._fsp--;

			// druidG.g:455:25: ( WS AS WS x= ID )?
			int alt191=2;
			int LA191_0 = input.LA(1);
			if ( (LA191_0==WS) ) {
				int LA191_1 = input.LA(2);
				if ( (LA191_1==AS) ) {
					alt191=1;
				}
			}
			switch (alt191) {
				case 1 :
					// druidG.g:455:26: WS AS WS x= ID
					{
					match(input,WS,FOLLOW_WS_in_aggItem3049); 
					match(input,AS,FOLLOW_AS_in_aggItem3051); 
					match(input,WS,FOLLOW_WS_in_aggItem3053); 
					x=(Token)match(input,ID,FOLLOW_ID_in_aggItem3057); 
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
	// druidG.g:457:1: aggCallSite[AggItem aggItem] : (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) );
	public final void aggCallSite(AggItem aggItem) throws RecognitionException {
		Token x=null;
		Token y=null;
		String p =null;

		try {
			// druidG.g:458:2: (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) )
			int alt198=2;
			int LA198_0 = input.LA(1);
			if ( (LA198_0==DOUBLE_SUM||LA198_0==HYPER_UNIQUE||LA198_0==JAVASCRIPT||LA198_0==LONG_SUM||LA198_0==MAX||LA198_0==MIN||LA198_0==UNIQUE) ) {
				alt198=1;
			}
			else if ( (LA198_0==COUNT) ) {
				alt198=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 198, 0, input);
				throw nvae;
			}

			switch (alt198) {
				case 1 :
					// druidG.g:458:4: p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
					{
					pushFollow(FOLLOW_aggFunc_in_aggCallSite3076);
					p=aggFunc();
					state._fsp--;

					aggItem.setAggType(p);
					// druidG.g:458:39: ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
					// druidG.g:458:40: ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN
					{
					// druidG.g:458:40: ( WS )?
					int alt192=2;
					int LA192_0 = input.LA(1);
					if ( (LA192_0==WS) ) {
						alt192=1;
					}
					switch (alt192) {
						case 1 :
							// druidG.g:458:40: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite3081); 
							}
							break;

					}

					match(input,LPARAN,FOLLOW_LPARAN_in_aggCallSite3084); 
					// druidG.g:458:51: ( WS )?
					int alt193=2;
					int LA193_0 = input.LA(1);
					if ( (LA193_0==WS) ) {
						alt193=1;
					}
					switch (alt193) {
						case 1 :
							// druidG.g:458:51: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite3086); 
							}
							break;

					}

					// druidG.g:458:55: (x= ID )
					// druidG.g:458:57: x= ID
					{
					x=(Token)match(input,ID,FOLLOW_ID_in_aggCallSite3093); 
					aggItem.setFieldName((x!=null?x.getText():null));
					}

					// druidG.g:458:96: ( ( WS )? ',' ( WS )? y= ID )*
					loop196:
					while (true) {
						int alt196=2;
						int LA196_0 = input.LA(1);
						if ( (LA196_0==WS) ) {
							int LA196_1 = input.LA(2);
							if ( (LA196_1==91) ) {
								alt196=1;
							}

						}
						else if ( (LA196_0==91) ) {
							alt196=1;
						}

						switch (alt196) {
						case 1 :
							// druidG.g:458:97: ( WS )? ',' ( WS )? y= ID
							{
							// druidG.g:458:97: ( WS )?
							int alt194=2;
							int LA194_0 = input.LA(1);
							if ( (LA194_0==WS) ) {
								alt194=1;
							}
							switch (alt194) {
								case 1 :
									// druidG.g:458:97: WS
									{
									match(input,WS,FOLLOW_WS_in_aggCallSite3099); 
									}
									break;

							}

							match(input,91,FOLLOW_91_in_aggCallSite3102); 
							// druidG.g:458:105: ( WS )?
							int alt195=2;
							int LA195_0 = input.LA(1);
							if ( (LA195_0==WS) ) {
								alt195=1;
							}
							switch (alt195) {
								case 1 :
									// druidG.g:458:105: WS
									{
									match(input,WS,FOLLOW_WS_in_aggCallSite3104); 
									}
									break;

							}

							y=(Token)match(input,ID,FOLLOW_ID_in_aggCallSite3109); 

								    if (aggItem.fieldNames == null || aggItem.fieldNames.isEmpty()) {
								       aggItem.fieldNames = new ArrayList<>();
								       aggItem.fieldNames.add(aggItem.fieldName);
								       aggItem.fieldName = null;
								    }
								    aggItem.fieldNames.add((y!=null?y.getText():null));
								
							}
							break;

						default :
							break loop196;
						}
					}

					// druidG.g:465:6: ( WS )?
					int alt197=2;
					int LA197_0 = input.LA(1);
					if ( (LA197_0==WS) ) {
						alt197=1;
					}
					switch (alt197) {
						case 1 :
							// druidG.g:465:6: WS
							{
							match(input,WS,FOLLOW_WS_in_aggCallSite3115); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_aggCallSite3118); 
					}

					}
					break;
				case 2 :
					// druidG.g:466:4: COUNT ( '(*)' )
					{
					match(input,COUNT,FOLLOW_COUNT_in_aggCallSite3125); 
					aggItem.setAggType("count");
					// druidG.g:466:41: ( '(*)' )
					// druidG.g:466:42: '(*)'
					{
					match(input,89,FOLLOW_89_in_aggCallSite3130); 
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
	// druidG.g:469:1: aggFunc returns [String name] : ( LONG_SUM | DOUBLE_SUM | UNIQUE | HYPER_UNIQUE | MIN | MAX | JAVASCRIPT );
	public final String aggFunc() throws RecognitionException {
		String name = null;


		try {
			// druidG.g:470:2: ( LONG_SUM | DOUBLE_SUM | UNIQUE | HYPER_UNIQUE | MIN | MAX | JAVASCRIPT )
			int alt199=7;
			switch ( input.LA(1) ) {
			case LONG_SUM:
				{
				alt199=1;
				}
				break;
			case DOUBLE_SUM:
				{
				alt199=2;
				}
				break;
			case UNIQUE:
				{
				alt199=3;
				}
				break;
			case HYPER_UNIQUE:
				{
				alt199=4;
				}
				break;
			case MIN:
				{
				alt199=5;
				}
				break;
			case MAX:
				{
				alt199=6;
				}
				break;
			case JAVASCRIPT:
				{
				alt199=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 199, 0, input);
				throw nvae;
			}
			switch (alt199) {
				case 1 :
					// druidG.g:470:4: LONG_SUM
					{
					match(input,LONG_SUM,FOLLOW_LONG_SUM_in_aggFunc3148); 
					name = "longSum";
					}
					break;
				case 2 :
					// druidG.g:471:4: DOUBLE_SUM
					{
					match(input,DOUBLE_SUM,FOLLOW_DOUBLE_SUM_in_aggFunc3155); 
					name = "doubleSum";
					}
					break;
				case 3 :
					// druidG.g:472:4: UNIQUE
					{
					match(input,UNIQUE,FOLLOW_UNIQUE_in_aggFunc3162); 
					name = "unique";
					}
					break;
				case 4 :
					// druidG.g:473:4: HYPER_UNIQUE
					{
					match(input,HYPER_UNIQUE,FOLLOW_HYPER_UNIQUE_in_aggFunc3169); 
					name = "hyperUnique";
					}
					break;
				case 5 :
					// druidG.g:474:4: MIN
					{
					match(input,MIN,FOLLOW_MIN_in_aggFunc3176); 
					name = "min";
					}
					break;
				case 6 :
					// druidG.g:475:4: MAX
					{
					match(input,MAX,FOLLOW_MAX_in_aggFunc3183); 
					name = "max";
					}
					break;
				case 7 :
					// druidG.g:476:4: JAVASCRIPT
					{
					match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_aggFunc3190); 
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
	// druidG.g:482:1: postAggItem returns [PostAggItem postAggItem] : ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) );
	public final PostAggItem postAggItem() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// druidG.g:484:2: ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) )
			int alt209=2;
			int LA209_0 = input.LA(1);
			if ( (LA209_0==FLOAT||LA209_0==ID||LA209_0==JAVASCRIPT||LA209_0==LONG||LA209_0==UNIQUE) ) {
				alt209=1;
			}
			else if ( (LA209_0==LPARAN) ) {
				alt209=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 209, 0, input);
				throw nvae;
			}

			switch (alt209) {
				case 1 :
					// druidG.g:484:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// druidG.g:484:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// druidG.g:484:5: a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					pushFollow(FOLLOW_simpleArith_in_postAggItem3218);
					a=simpleArith();
					state._fsp--;

					// druidG.g:484:20: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt202=2;
					int LA202_0 = input.LA(1);
					if ( (LA202_0==WS) ) {
						int LA202_1 = input.LA(2);
						if ( (LA202_1==ARITH_OPER) ) {
							alt202=1;
						}
					}
					else if ( (LA202_0==ARITH_OPER) ) {
						alt202=1;
					}
					switch (alt202) {
						case 1 :
							// druidG.g:484:21: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// druidG.g:484:21: ( WS )?
							int alt200=2;
							int LA200_0 = input.LA(1);
							if ( (LA200_0==WS) ) {
								alt200=1;
							}
							switch (alt200) {
								case 1 :
									// druidG.g:484:21: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3222); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem3225);
							postAggArithOper(postAggItem);
							state._fsp--;

							// druidG.g:484:55: ( WS )?
							int alt201=2;
							int LA201_0 = input.LA(1);
							if ( (LA201_0==WS) ) {
								alt201=1;
							}
							switch (alt201) {
								case 1 :
									// druidG.g:484:55: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3228); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem3233);
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
					// druidG.g:491:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					{
					// druidG.g:491:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
					// druidG.g:491:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					{
					// druidG.g:491:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN )
					// druidG.g:491:6: LPARAN ( WS )? a= postAggItem ( WS )? RPARAN
					{
					match(input,LPARAN,FOLLOW_LPARAN_in_postAggItem3251); 
					// druidG.g:491:13: ( WS )?
					int alt203=2;
					int LA203_0 = input.LA(1);
					if ( (LA203_0==WS) ) {
						alt203=1;
					}
					switch (alt203) {
						case 1 :
							// druidG.g:491:13: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem3253); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggItem_in_postAggItem3258);
					a=postAggItem();
					state._fsp--;

					// druidG.g:491:31: ( WS )?
					int alt204=2;
					int LA204_0 = input.LA(1);
					if ( (LA204_0==WS) ) {
						alt204=1;
					}
					switch (alt204) {
						case 1 :
							// druidG.g:491:31: WS
							{
							match(input,WS,FOLLOW_WS_in_postAggItem3260); 
							}
							break;

					}

					match(input,RPARAN,FOLLOW_RPARAN_in_postAggItem3263); 
					}

					// druidG.g:491:43: ( postAggLabel[postAggItem] )?
					int alt205=2;
					int LA205_0 = input.LA(1);
					if ( (LA205_0==AS) ) {
						alt205=1;
					}
					switch (alt205) {
						case 1 :
							// druidG.g:491:44: postAggLabel[postAggItem]
							{
							pushFollow(FOLLOW_postAggLabel_in_postAggItem3267);
							postAggLabel(postAggItem);
							state._fsp--;

							}
							break;

					}

					// druidG.g:491:72: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
					int alt208=2;
					int LA208_0 = input.LA(1);
					if ( (LA208_0==WS) ) {
						int LA208_1 = input.LA(2);
						if ( (LA208_1==ARITH_OPER) ) {
							alt208=1;
						}
					}
					else if ( (LA208_0==ARITH_OPER) ) {
						alt208=1;
					}
					switch (alt208) {
						case 1 :
							// druidG.g:491:73: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
							{
							// druidG.g:491:73: ( WS )?
							int alt206=2;
							int LA206_0 = input.LA(1);
							if ( (LA206_0==WS) ) {
								alt206=1;
							}
							switch (alt206) {
								case 1 :
									// druidG.g:491:73: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3273); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggArithOper_in_postAggItem3276);
							postAggArithOper(postAggItem);
							state._fsp--;

							// druidG.g:491:107: ( WS )?
							int alt207=2;
							int LA207_0 = input.LA(1);
							if ( (LA207_0==WS) ) {
								alt207=1;
							}
							switch (alt207) {
								case 1 :
									// druidG.g:491:107: WS
									{
									match(input,WS,FOLLOW_WS_in_postAggItem3279); 
									}
									break;

							}

							pushFollow(FOLLOW_postAggItem_in_postAggItem3284);
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
	// druidG.g:502:1: simpleArith returns [PostAggItem postAggItem] : (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? ;
	public final PostAggItem simpleArith() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem a =null;
		PostAggItem b =null;

		  postAggItem = new PostAggItem("arithmetic"); 
		try {
			// druidG.g:504:2: ( (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? )
			// druidG.g:504:4: (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			{
			// druidG.g:504:4: (a= simplePostAggAccess )
			// druidG.g:504:5: a= simplePostAggAccess
			{
			pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith3320);
			a=simplePostAggAccess();
			state._fsp--;

			postAggItem=a;
			}

			// druidG.g:504:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
			int alt212=2;
			alt212 = dfa212.predict(input);
			switch (alt212) {
				case 1 :
					// druidG.g:504:46: ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess
					{
					// druidG.g:504:46: ( WS )?
					int alt210=2;
					int LA210_0 = input.LA(1);
					if ( (LA210_0==WS) ) {
						alt210=1;
					}
					switch (alt210) {
						case 1 :
							// druidG.g:504:46: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith3326); 
							}
							break;

					}

					pushFollow(FOLLOW_postAggArithOper_in_simpleArith3329);
					postAggArithOper(postAggItem);
					state._fsp--;

					// druidG.g:504:80: ( WS )?
					int alt211=2;
					int LA211_0 = input.LA(1);
					if ( (LA211_0==WS) ) {
						alt211=1;
					}
					switch (alt211) {
						case 1 :
							// druidG.g:504:80: WS
							{
							match(input,WS,FOLLOW_WS_in_simpleArith3332); 
							}
							break;

					}

					pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith3337);
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
	// druidG.g:516:1: simplePostAggAccess returns [PostAggItem postAggItem] : (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef );
	public final PostAggItem simplePostAggAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		PostAggItem c =null;
		PostAggItem f =null;
		PostAggItem h =null;
		PostAggItem js =null;

		try {
			// druidG.g:517:2: (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef )
			int alt213=4;
			switch ( input.LA(1) ) {
			case FLOAT:
			case LONG:
				{
				alt213=1;
				}
				break;
			case ID:
				{
				alt213=2;
				}
				break;
			case UNIQUE:
				{
				alt213=3;
				}
				break;
			case JAVASCRIPT:
				{
				alt213=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 213, 0, input);
				throw nvae;
			}
			switch (alt213) {
				case 1 :
					// druidG.g:517:4: c= constantAccess
					{
					pushFollow(FOLLOW_constantAccess_in_simplePostAggAccess3366);
					c=constantAccess();
					state._fsp--;

					postAggItem = c;
					}
					break;
				case 2 :
					// druidG.g:518:4: f= fieldAccess
					{
					pushFollow(FOLLOW_fieldAccess_in_simplePostAggAccess3383);
					f=fieldAccess();
					state._fsp--;

					postAggItem = f;
					}
					break;
				case 3 :
					// druidG.g:519:4: h= hyperUniqueCardinality
					{
					pushFollow(FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess3396);
					h=hyperUniqueCardinality();
					state._fsp--;

					postAggItem = h;
					}
					break;
				case 4 :
					// druidG.g:520:4: js= postAggJavascriptDef
					{
					pushFollow(FOLLOW_postAggJavascriptDef_in_simplePostAggAccess3405);
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
	// druidG.g:525:1: constantAccess returns [PostAggItem postAggItem] : ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem constantAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("constant"); 
		try {
			// druidG.g:527:2: ( ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) )
			// druidG.g:527:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			{
			// druidG.g:527:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
			// druidG.g:527:5: (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )?
			{
			// druidG.g:527:5: (a= FLOAT |a= LONG )
			int alt214=2;
			int LA214_0 = input.LA(1);
			if ( (LA214_0==FLOAT) ) {
				alt214=1;
			}
			else if ( (LA214_0==LONG) ) {
				alt214=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 214, 0, input);
				throw nvae;
			}

			switch (alt214) {
				case 1 :
					// druidG.g:527:6: a= FLOAT
					{
					a=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_constantAccess3435); 
					}
					break;
				case 2 :
					// druidG.g:527:16: a= LONG
					{
					a=(Token)match(input,LONG,FOLLOW_LONG_in_constantAccess3441); 
					}
					break;

			}

			postAggItem.constantValue = Double.valueOf((a!=null?a.getText():null));
			// druidG.g:529:5: ( WS postAggLabel[postAggItem] )?
			int alt215=2;
			int LA215_0 = input.LA(1);
			if ( (LA215_0==WS) ) {
				int LA215_1 = input.LA(2);
				if ( (LA215_1==AS) ) {
					alt215=1;
				}
			}
			switch (alt215) {
				case 1 :
					// druidG.g:529:6: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_constantAccess3454); 
					pushFollow(FOLLOW_postAggLabel_in_constantAccess3456);
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
	// druidG.g:532:1: fieldAccess returns [PostAggItem postAggItem] : (a= ID ( WS postAggLabel[postAggItem] )? ) ;
	public final PostAggItem fieldAccess() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("fieldAccess"); 
		try {
			// druidG.g:534:2: ( (a= ID ( WS postAggLabel[postAggItem] )? ) )
			// druidG.g:534:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			{
			// druidG.g:534:4: (a= ID ( WS postAggLabel[postAggItem] )? )
			// druidG.g:534:5: a= ID ( WS postAggLabel[postAggItem] )?
			{
			a=(Token)match(input,ID,FOLLOW_ID_in_fieldAccess3484); 
			// druidG.g:534:10: ( WS postAggLabel[postAggItem] )?
			int alt216=2;
			int LA216_0 = input.LA(1);
			if ( (LA216_0==WS) ) {
				int LA216_1 = input.LA(2);
				if ( (LA216_1==AS) ) {
					alt216=1;
				}
			}
			switch (alt216) {
				case 1 :
					// druidG.g:534:11: WS postAggLabel[postAggItem]
					{
					match(input,WS,FOLLOW_WS_in_fieldAccess3487); 
					pushFollow(FOLLOW_postAggLabel_in_fieldAccess3489);
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
	// druidG.g:537:1: hyperUniqueCardinality returns [PostAggItem postAggItem] : ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) ;
	public final PostAggItem hyperUniqueCardinality() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token a=null;

		  postAggItem = new PostAggItem("hyperUniqueCardinality"); 
		try {
			// druidG.g:539:2: ( ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) )
			// druidG.g:539:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			{
			// druidG.g:539:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
			// druidG.g:539:5: UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN
			{
			match(input,UNIQUE,FOLLOW_UNIQUE_in_hyperUniqueCardinality3518); 
			// druidG.g:539:12: ( WS )?
			int alt217=2;
			int LA217_0 = input.LA(1);
			if ( (LA217_0==WS) ) {
				alt217=1;
			}
			switch (alt217) {
				case 1 :
					// druidG.g:539:12: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality3520); 
					}
					break;

			}

			match(input,LPARAN,FOLLOW_LPARAN_in_hyperUniqueCardinality3523); 
			// druidG.g:539:23: ( WS )?
			int alt218=2;
			int LA218_0 = input.LA(1);
			if ( (LA218_0==WS) ) {
				alt218=1;
			}
			switch (alt218) {
				case 1 :
					// druidG.g:539:23: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality3525); 
					}
					break;

			}

			a=(Token)match(input,ID,FOLLOW_ID_in_hyperUniqueCardinality3530); 
			// druidG.g:539:32: ( WS )?
			int alt219=2;
			int LA219_0 = input.LA(1);
			if ( (LA219_0==WS) ) {
				alt219=1;
			}
			switch (alt219) {
				case 1 :
					// druidG.g:539:32: WS
					{
					match(input,WS,FOLLOW_WS_in_hyperUniqueCardinality3532); 
					}
					break;

			}

			match(input,RPARAN,FOLLOW_RPARAN_in_hyperUniqueCardinality3535); 
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
	// druidG.g:544:1: postAggJavascriptDef returns [PostAggItem postAggItem] : JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING ;
	public final PostAggItem postAggJavascriptDef() throws RecognitionException {
		PostAggItem postAggItem = null;


		Token str=null;

		  postAggItem = new PostAggItem("javascript"); 
		try {
			// druidG.g:546:2: ( JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING )
			// druidG.g:546:4: JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING
			{
			match(input,JAVASCRIPT,FOLLOW_JAVASCRIPT_in_postAggJavascriptDef3561); 
			// druidG.g:546:15: ( WS )?
			int alt220=2;
			int LA220_0 = input.LA(1);
			if ( (LA220_0==WS) ) {
				alt220=1;
			}
			switch (alt220) {
				case 1 :
					// druidG.g:546:15: WS
					{
					match(input,WS,FOLLOW_WS_in_postAggJavascriptDef3563); 
					}
					break;

			}

			str=(Token)match(input,SINGLE_QUOTE_STRING,FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef3568); 
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
	// druidG.g:549:1: postAggLabel[PostAggItem postAggItem] : ( AS WS id= ID ) ;
	public final void postAggLabel(PostAggItem postAggItem) throws RecognitionException {
		Token id=null;

		try {
			// druidG.g:550:2: ( ( AS WS id= ID ) )
			// druidG.g:550:4: ( AS WS id= ID )
			{
			// druidG.g:550:4: ( AS WS id= ID )
			// druidG.g:550:5: AS WS id= ID
			{
			match(input,AS,FOLLOW_AS_in_postAggLabel3584); 
			match(input,WS,FOLLOW_WS_in_postAggLabel3586); 
			id=(Token)match(input,ID,FOLLOW_ID_in_postAggLabel3590); 
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
	// druidG.g:553:1: postAggArithOper[PostAggItem postAggItem] : arith= ARITH_OPER ;
	public final void postAggArithOper(PostAggItem postAggItem) throws RecognitionException {
		Token arith=null;

		try {
			// druidG.g:554:2: (arith= ARITH_OPER )
			// druidG.g:554:3: arith= ARITH_OPER
			{
			arith=(Token)match(input,ARITH_OPER,FOLLOW_ARITH_OPER_in_postAggArithOper3606); 
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
	// druidG.g:559:1: isoTime returns [String date] : (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ );
	public final druidGParser.isoTime_return isoTime() throws RecognitionException {
		druidGParser.isoTime_return retval = new druidGParser.isoTime_return();
		retval.start = input.LT(1);

		Token d=null;

		try {
			// druidG.g:560:2: (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ )
			int alt221=9;
			switch ( input.LA(1) ) {
			case DATE_YEAR_ONLY:
				{
				alt221=1;
				}
				break;
			case DATE_YEAR_MONTH_ONLY:
				{
				alt221=2;
				}
				break;
			case DATE:
				{
				alt221=3;
				}
				break;
			case DATE_HOUR:
				{
				alt221=4;
				}
				break;
			case DATE_HOUR_MIN:
				{
				alt221=5;
				}
				break;
			case DATE_HOUR_MIN_SEC:
				{
				alt221=6;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB:
				{
				alt221=7;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_TZ:
				{
				alt221=8;
				}
				break;
			case DATE_HOUR_MIN_SEC_SUB_UTC_TZ:
				{
				alt221=9;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 221, 0, input);
				throw nvae;
			}
			switch (alt221) {
				case 1 :
					// druidG.g:560:3: d= DATE_YEAR_ONLY
					{
					d=(Token)match(input,DATE_YEAR_ONLY,FOLLOW_DATE_YEAR_ONLY_in_isoTime3625); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 2 :
					// druidG.g:561:3: d= DATE_YEAR_MONTH_ONLY
					{
					d=(Token)match(input,DATE_YEAR_MONTH_ONLY,FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime3633); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 3 :
					// druidG.g:562:3: d= DATE
					{
					d=(Token)match(input,DATE,FOLLOW_DATE_in_isoTime3641); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 4 :
					// druidG.g:563:3: d= DATE_HOUR
					{
					d=(Token)match(input,DATE_HOUR,FOLLOW_DATE_HOUR_in_isoTime3649); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 5 :
					// druidG.g:564:3: d= DATE_HOUR_MIN
					{
					d=(Token)match(input,DATE_HOUR_MIN,FOLLOW_DATE_HOUR_MIN_in_isoTime3657); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 6 :
					// druidG.g:565:3: d= DATE_HOUR_MIN_SEC
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC,FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime3665); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 7 :
					// druidG.g:566:3: d= DATE_HOUR_MIN_SEC_SUB
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB,FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime3673); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 8 :
					// druidG.g:567:3: d= DATE_HOUR_MIN_SEC_SUB_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime3681); 
					retval.date = (d!=null?d.getText():null);
					}
					break;
				case 9 :
					// druidG.g:568:3: d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ
					{
					d=(Token)match(input,DATE_HOUR_MIN_SEC_SUB_UTC_TZ,FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime3689); 
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


	protected DFA182 dfa182 = new DFA182(this);
	protected DFA189 dfa189 = new DFA189(this);
	protected DFA212 dfa212 = new DFA212(this);
	static final String DFA182_eotS =
		"\176\uffff";
	static final String DFA182_eofS =
		"\12\uffff\1\24\1\uffff\1\24\2\uffff\1\24\1\uffff\3\24\3\uffff\2\24\5\uffff"+
		"\2\24\3\uffff\2\24\3\uffff\1\24\15\uffff\1\24\17\uffff\1\24\67\uffff";
	static final String DFA182_minS =
		"\1\50\1\14\1\130\1\14\2\41\1\50\3\41\1\103\1\41\1\103\1\14\1\41\1\103"+
		"\1\41\2\103\1\4\3\uffff\1\103\1\4\3\uffff\1\14\1\41\1\103\1\4\3\uffff"+
		"\1\103\1\4\3\uffff\1\4\15\uffff\1\4\15\uffff\2\41\1\103\67\uffff";
	static final String DFA182_maxS =
		"\1\76\2\130\1\36\2\130\1\50\2\130\1\66\1\130\1\116\2\130\1\66\1\130\1"+
		"\116\2\130\1\127\3\uffff\1\130\1\127\3\uffff\1\14\2\130\1\127\3\uffff"+
		"\1\130\1\127\3\uffff\1\127\15\uffff\1\127\15\uffff\1\130\1\66\1\130\67"+
		"\uffff";
	static final String DFA182_acceptS =
		"\24\uffff\1\1\35\uffff\1\2\24\uffff\1\1\15\uffff\1\1\41\uffff\4\1\3\uffff";
	static final String DFA182_specialS =
		"\176\uffff}>";
	static final String[] DFA182_transitionS = {
			"\1\1\25\uffff\1\2",
			"\1\4\21\uffff\1\5\71\uffff\1\3",
			"\1\6",
			"\1\7\21\uffff\1\10",
			"\1\12\24\uffff\1\12\41\uffff\1\11",
			"\1\14\24\uffff\1\14\27\uffff\1\14\11\uffff\1\13",
			"\1\15",
			"\1\17\24\uffff\1\17\41\uffff\1\16",
			"\1\21\24\uffff\1\21\27\uffff\1\21\11\uffff\1\20",
			"\1\22\24\uffff\1\22",
			"\1\24\7\uffff\1\24\14\uffff\1\23",
			"\1\27\24\uffff\1\27\27\uffff\1\27",
			"\1\24\7\uffff\1\24\14\uffff\1\30",
			"\1\35\113\uffff\1\34",
			"\1\36\24\uffff\1\36",
			"\1\24\7\uffff\1\24\14\uffff\1\37",
			"\1\43\24\uffff\1\43\27\uffff\1\43",
			"\1\24\7\uffff\1\24\14\uffff\1\44",
			"\1\24\7\uffff\1\24\14\uffff\1\50",
			"\1\62\41\uffff\1\24\11\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\24\7\uffff\1\24\14\uffff\1\66",
			"\1\62\41\uffff\1\24\11\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\104",
			"\1\106\24\uffff\1\106\41\uffff\1\105",
			"\1\24\7\uffff\1\24\14\uffff\1\107",
			"\1\62\41\uffff\1\24\11\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\24\7\uffff\1\24\14\uffff\1\125",
			"\1\62\41\uffff\1\24\11\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
			"",
			"",
			"",
			"\1\62\41\uffff\1\24\11\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
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
			"\1\62\41\uffff\1\24\11\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"+
			"\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
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
			"\1\170\24\uffff\1\170\41\uffff\1\167",
			"\1\171\24\uffff\1\171",
			"\1\24\7\uffff\1\24\14\uffff\1\172",
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

	static final short[] DFA182_eot = DFA.unpackEncodedString(DFA182_eotS);
	static final short[] DFA182_eof = DFA.unpackEncodedString(DFA182_eofS);
	static final char[] DFA182_min = DFA.unpackEncodedStringToUnsignedChars(DFA182_minS);
	static final char[] DFA182_max = DFA.unpackEncodedStringToUnsignedChars(DFA182_maxS);
	static final short[] DFA182_accept = DFA.unpackEncodedString(DFA182_acceptS);
	static final short[] DFA182_special = DFA.unpackEncodedString(DFA182_specialS);
	static final short[][] DFA182_transition;

	static {
		int numStates = DFA182_transitionS.length;
		DFA182_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA182_transition[i] = DFA.unpackEncodedString(DFA182_transitionS[i]);
		}
	}

	protected class DFA182 extends DFA {

		public DFA182(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 182;
			this.eot = DFA182_eot;
			this.eof = DFA182_eof;
			this.min = DFA182_min;
			this.max = DFA182_max;
			this.accept = DFA182_accept;
			this.special = DFA182_special;
			this.transition = DFA182_transition;
		}
		@Override
		public String getDescription() {
			return "377:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );";
		}
	}

	static final String DFA189_eotS =
		"\110\uffff";
	static final String DFA189_eofS =
		"\10\uffff\1\16\2\uffff\3\16\3\uffff\3\16\3\uffff\1\16\60\uffff";
	static final String DFA189_minS =
		"\1\50\1\36\1\uffff\1\36\1\41\1\130\2\41\1\103\1\116\1\41\2\103\1\4\3\uffff"+
		"\2\103\1\4\3\uffff\1\4\3\uffff\1\130\54\uffff";
	static final String DFA189_maxS =
		"\1\76\1\130\1\uffff\1\64\3\130\1\116\1\130\2\116\2\130\1\127\3\uffff\2"+
		"\130\1\127\3\uffff\1\127\3\uffff\1\130\54\uffff";
	static final String DFA189_acceptS =
		"\2\uffff\1\2\13\uffff\1\1\30\uffff\1\1\3\uffff\1\1\3\uffff\1\1\13\uffff"+
		"\1\1\13\uffff\1\1";
	static final String DFA189_specialS =
		"\110\uffff}>";
	static final String[] DFA189_transitionS = {
			"\1\1\25\uffff\1\2",
			"\1\4\71\uffff\1\3",
			"",
			"\1\6\25\uffff\1\5",
			"\1\10\24\uffff\1\10\27\uffff\1\10\11\uffff\1\7",
			"\1\11",
			"\1\13\24\uffff\1\13\27\uffff\1\13\11\uffff\1\12",
			"\1\14\24\uffff\1\14\27\uffff\1\14",
			"\1\16\7\uffff\1\16\14\uffff\1\15",
			"\1\21",
			"\1\22\24\uffff\1\22\27\uffff\1\22",
			"\1\16\7\uffff\1\16\14\uffff\1\23",
			"\1\16\7\uffff\1\16\14\uffff\1\27",
			"\1\33\5\uffff\1\16\30\uffff\1\16\2\uffff\1\16\11\uffff\1\16\2\uffff"+
			"\1\16\1\uffff\1\16\15\uffff\1\16\1\33\1\16\3\uffff\1\16\1\uffff\1\16"+
			"\6\uffff\1\16\4\uffff\1\16",
			"",
			"",
			"",
			"\1\16\7\uffff\1\16\14\uffff\1\47",
			"\1\16\7\uffff\1\16\14\uffff\1\53",
			"\1\57\5\uffff\1\16\30\uffff\1\16\2\uffff\1\16\11\uffff\1\16\2\uffff"+
			"\1\16\1\uffff\1\16\15\uffff\1\16\1\57\1\16\3\uffff\1\16\1\uffff\1\16"+
			"\6\uffff\1\16\4\uffff\1\16",
			"",
			"",
			"",
			"\1\73\5\uffff\1\16\30\uffff\1\16\2\uffff\1\16\11\uffff\1\16\2\uffff"+
			"\1\16\1\uffff\1\16\15\uffff\1\16\1\73\1\16\3\uffff\1\16\1\uffff\1\16"+
			"\6\uffff\1\16\4\uffff\1\16",
			"",
			"",
			"",
			"\1\107",
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

	static final short[] DFA189_eot = DFA.unpackEncodedString(DFA189_eotS);
	static final short[] DFA189_eof = DFA.unpackEncodedString(DFA189_eofS);
	static final char[] DFA189_min = DFA.unpackEncodedStringToUnsignedChars(DFA189_minS);
	static final char[] DFA189_max = DFA.unpackEncodedStringToUnsignedChars(DFA189_maxS);
	static final short[] DFA189_accept = DFA.unpackEncodedString(DFA189_acceptS);
	static final short[] DFA189_special = DFA.unpackEncodedString(DFA189_specialS);
	static final short[][] DFA189_transition;

	static {
		int numStates = DFA189_transitionS.length;
		DFA189_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA189_transition[i] = DFA.unpackEncodedString(DFA189_transitionS[i]);
		}
	}

	protected class DFA189 extends DFA {

		public DFA189(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 189;
			this.eot = DFA189_eot;
			this.eof = DFA189_eof;
			this.min = DFA189_min;
			this.max = DFA189_max;
			this.accept = DFA189_accept;
			this.special = DFA189_special;
			this.transition = DFA189_transition;
		}
		@Override
		public String getDescription() {
			return "413:1: simpleLogicalFilter returns [Filter filter] : ( (a= simpleFilter ) | ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) );";
		}
	}

	static final String DFA212_eotS =
		"\134\uffff";
	static final String DFA212_eofS =
		"\2\3\132\uffff";
	static final String DFA212_minS =
		"\2\5\1\41\6\uffff\1\41\3\uffff\1\41\3\uffff\1\70\1\116\1\uffff\1\41\3"+
		"\uffff\1\70\1\116\4\uffff\1\70\1\116\1\uffff\1\70\1\50\1\116\4\uffff\1"+
		"\70\1\116\1\uffff\1\70\1\50\1\116\1\uffff\1\70\1\50\1\116\1\uffff\2\50"+
		"\1\113\1\uffff\1\70\1\50\1\116\1\uffff\2\50\1\113\1\uffff\2\50\1\113\1"+
		"\uffff\1\50\3\113\25\uffff";
	static final String DFA212_maxS =
		"\1\130\1\127\1\130\6\uffff\1\130\3\uffff\1\124\3\uffff\2\130\1\uffff\1"+
		"\124\3\uffff\2\130\4\uffff\2\130\1\uffff\1\70\1\130\1\116\4\uffff\2\130"+
		"\1\uffff\1\70\1\130\1\116\1\uffff\1\70\1\130\1\116\1\uffff\1\130\1\50"+
		"\1\130\1\uffff\1\70\1\130\1\116\1\uffff\1\130\1\50\1\130\1\uffff\1\130"+
		"\1\50\1\130\1\uffff\1\50\2\130\1\113\25\uffff";
	static final String DFA212_acceptS =
		"\3\uffff\1\2\12\uffff\3\1\4\uffff\3\1\3\uffff\3\1\6\uffff\4\1\6\uffff"+
		"\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\4\uffff"+
		"\25\1";
	static final String DFA212_specialS =
		"\134\uffff}>";
	static final String[] DFA212_transitionS = {
			"\1\2\75\uffff\1\3\7\uffff\1\3\14\uffff\1\1",
			"\1\11\40\uffff\1\3\11\uffff\1\3\2\uffff\1\3\17\uffff\1\3\5\uffff\1\3"+
			"\1\uffff\1\3\13\uffff\1\3",
			"\1\16\6\uffff\1\20\6\uffff\1\22\6\uffff\1\17\1\uffff\1\3\33\uffff\1"+
			"\21\3\uffff\1\15",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\25\6\uffff\1\27\6\uffff\1\31\6\uffff\1\26\1\uffff\1\3\33\uffff\1"+
			"\30\3\uffff\1\24",
			"",
			"",
			"",
			"\1\33\6\uffff\1\35\6\uffff\1\37\6\uffff\1\34\1\uffff\1\3\33\uffff\1"+
			"\36",
			"",
			"",
			"",
			"\1\42\37\uffff\1\41",
			"\1\44\11\uffff\1\43",
			"",
			"\1\45\6\uffff\1\47\6\uffff\1\51\6\uffff\1\46\1\uffff\1\3\33\uffff\1"+
			"\50",
			"",
			"",
			"",
			"\1\54\37\uffff\1\53",
			"\1\56\11\uffff\1\55",
			"",
			"",
			"",
			"",
			"\1\60\37\uffff\1\57",
			"\1\62\11\uffff\1\61",
			"",
			"\1\63",
			"\1\65\57\uffff\1\64",
			"\1\66",
			"",
			"",
			"",
			"",
			"\1\70\37\uffff\1\67",
			"\1\72\11\uffff\1\71",
			"",
			"\1\73",
			"\1\75\57\uffff\1\74",
			"\1\76",
			"",
			"\1\77",
			"\1\101\57\uffff\1\100",
			"\1\102",
			"",
			"\1\104\57\uffff\1\103",
			"\1\105",
			"\1\107\14\uffff\1\106",
			"",
			"\1\110",
			"\1\112\57\uffff\1\111",
			"\1\113",
			"",
			"\1\115\57\uffff\1\114",
			"\1\116",
			"\1\120\14\uffff\1\117",
			"",
			"\1\122\57\uffff\1\121",
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

	static final short[] DFA212_eot = DFA.unpackEncodedString(DFA212_eotS);
	static final short[] DFA212_eof = DFA.unpackEncodedString(DFA212_eofS);
	static final char[] DFA212_min = DFA.unpackEncodedStringToUnsignedChars(DFA212_minS);
	static final char[] DFA212_max = DFA.unpackEncodedStringToUnsignedChars(DFA212_maxS);
	static final short[] DFA212_accept = DFA.unpackEncodedString(DFA212_acceptS);
	static final short[] DFA212_special = DFA.unpackEncodedString(DFA212_specialS);
	static final short[][] DFA212_transition;

	static {
		int numStates = DFA212_transitionS.length;
		DFA212_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA212_transition[i] = DFA.unpackEncodedString(DFA212_transitionS[i]);
		}
	}

	protected class DFA212 extends DFA {

		public DFA212(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 212;
			this.eot = DFA212_eot;
			this.eof = DFA212_eof;
			this.min = DFA212_min;
			this.max = DFA212_max;
			this.accept = DFA212_accept;
			this.special = DFA212_special;
			this.transition = DFA212_transition;
		}
		@Override
		public String getDescription() {
			return "504:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?";
		}
	}

	public static final BitSet FOLLOW_grandQuery_in_program49 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandInsert_in_program61 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandDelete_in_program73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_grandDrop_in_program85 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_deleteStmnt_in_grandDelete113 = new BitSet(new long[]{0x0000000000000002L,0x000000000100000CL});
	public static final BitSet FOLLOW_WS_in_grandDelete122 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandDelete126 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandDelete132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropStmnt_in_grandDrop164 = new BitSet(new long[]{0x0000000000000002L,0x000000000100000CL});
	public static final BitSet FOLLOW_WS_in_grandDrop173 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandDrop177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandDrop183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertStmnt_in_grandInsert214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertHStmnt_in_grandInsert226 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insertRTStmnt_in_grandInsert238 = new BitSet(new long[]{0x0000000000000002L,0x000000000100000CL});
	public static final BitSet FOLLOW_WS_in_grandInsert247 = new BitSet(new long[]{0x0000000000000002L,0x000000000000000CL});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandInsert251 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandInsert257 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DELETE_in_deleteStmnt283 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt285 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_FROM_in_deleteStmnt287 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt289 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_deleteStmnt294 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_deleteStmnt303 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_deleteStmnt305 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_intervalClause_in_deleteStmnt309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DROP_in_dropStmnt337 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_dropStmnt339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_TABLE_in_dropStmnt341 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_dropStmnt343 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_dropStmnt348 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insertStmnt375 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt377 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_INTO_in_insertStmnt379 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt381 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_insertStmnt386 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt391 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt394 = new BitSet(new long[]{0x1480818008004000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt396 = new BitSet(new long[]{0x1480818008004000L,0x0000000000100000L});
	public static final BitSet FOLLOW_selectItems_in_insertStmnt399 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertStmnt403 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_insertStmnt406 = new BitSet(new long[]{0x1480818008004000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt408 = new BitSet(new long[]{0x1480818008004000L,0x0000000000100000L});
	public static final BitSet FOLLOW_selectItems_in_insertStmnt411 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertStmnt416 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt419 = new BitSet(new long[]{0x0000000400000000L,0x0000000001200000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt421 = new BitSet(new long[]{0x0000000400000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_VALUES_in_insertStmnt434 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt436 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt439 = new BitSet(new long[]{0x0040000200000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt441 = new BitSet(new long[]{0x0040000200000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_anyValue_in_insertStmnt447 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertStmnt454 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_insertStmnt457 = new BitSet(new long[]{0x0040000200000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt459 = new BitSet(new long[]{0x0040000200000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_anyValue_in_insertStmnt464 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertStmnt470 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt473 = new BitSet(new long[]{0x0000000000000000L,0x0000000001400000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt475 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_FROM_in_insertStmnt492 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt499 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_insertStmnt514 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt516 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertStmnt520 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt527 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_insertStmnt529 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt531 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertStmnt533 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt539 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt553 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_DELIMITER_in_insertStmnt555 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt557 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertStmnt560 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt567 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertStmnt571 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_insertStmnt574 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt581 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_insertStmnt587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_insertStmnt590 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertStmnt592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_HADOOP_in_insertHStmnt616 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt618 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_INTO_in_insertHStmnt620 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt622 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_insertHStmnt627 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt632 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt635 = new BitSet(new long[]{0x1480818008004000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt637 = new BitSet(new long[]{0x1480818008004000L,0x0000000000100000L});
	public static final BitSet FOLLOW_selectItems_in_insertHStmnt640 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt644 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_insertHStmnt647 = new BitSet(new long[]{0x1480818008004000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt649 = new BitSet(new long[]{0x1480818008004000L,0x0000000000100000L});
	public static final BitSet FOLLOW_selectItems_in_insertHStmnt652 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt660 = new BitSet(new long[]{0x0000000400000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt662 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_FROM_in_insertHStmnt669 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt676 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_insertHStmnt686 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt688 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertHStmnt692 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt699 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_insertHStmnt701 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt703 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertHStmnt705 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt711 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt726 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_DELIMITER_in_insertHStmnt728 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt730 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt733 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt740 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt744 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_insertHStmnt747 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt754 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt763 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt765 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_PARTITION_in_insertHStmnt776 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt778 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt781 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt788 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt790 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_insertHStmnt793 = new BitSet(new long[]{0x0040000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt795 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LONG_in_insertHStmnt800 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt804 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt807 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt809 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
	public static final BitSet FOLLOW_ROLLUP_in_insertHStmnt819 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt821 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertHStmnt824 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt831 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt833 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_insertHStmnt836 = new BitSet(new long[]{0x0040000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt838 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LONG_in_insertHStmnt843 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt847 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_insertHStmnt850 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertHStmnt852 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_REALTIME_in_insertRTStmnt875 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt877 = new BitSet(new long[]{0x0000200000000000L});
	public static final BitSet FOLLOW_INTO_in_insertRTStmnt879 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt881 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_insertRTStmnt886 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt891 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertRTStmnt894 = new BitSet(new long[]{0x1480818008004000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt896 = new BitSet(new long[]{0x1480818008004000L,0x0000000000100000L});
	public static final BitSet FOLLOW_selectItems_in_insertRTStmnt899 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt903 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_insertRTStmnt906 = new BitSet(new long[]{0x1480818008004000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt908 = new BitSet(new long[]{0x1480818008004000L,0x0000000000100000L});
	public static final BitSet FOLLOW_selectItems_in_insertRTStmnt911 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_insertRTStmnt919 = new BitSet(new long[]{0x0000000000000000L,0x0000000001200000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_VALUES_in_insertRTStmnt927 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt929 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_insertRTStmnt932 = new BitSet(new long[]{0x0040000200000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt934 = new BitSet(new long[]{0x0040000200000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_anyValue_in_insertRTStmnt940 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt947 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_insertRTStmnt950 = new BitSet(new long[]{0x0040000200000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt952 = new BitSet(new long[]{0x0040000200000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_anyValue_in_insertRTStmnt957 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_insertRTStmnt966 = new BitSet(new long[]{0x0000000000000002L,0x0000000001400000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt968 = new BitSet(new long[]{0x0000000000000002L,0x0000000001400000L});
	public static final BitSet FOLLOW_WHERE_in_insertRTStmnt974 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt976 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_intervalClause_in_insertRTStmnt980 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt988 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_insertRTStmnt990 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt992 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_insertRTStmnt994 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_insertRTStmnt996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertRTStmnt1000 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_queryStmnt_in_grandQuery1034 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000008L});
	public static final BitSet FOLLOW_WS_in_grandQuery1044 = new BitSet(new long[]{0x0009000000000000L,0x0000000000000200L});
	public static final BitSet FOLLOW_set_in_grandQuery1048 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1069 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_grandQuery1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000001002000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_queryStmnt_in_grandQuery1080 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_grandQuery1085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_grandQuery1088 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000002L});
	public static final BitSet FOLLOW_WS_in_grandQuery1090 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_grandQuery1093 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1100 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_grandQuery1103 = new BitSet(new long[]{0x0000010000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1105 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_grandQuery1111 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_grandQuery1116 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_grandQuery1119 = new BitSet(new long[]{0x0000010000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_grandQuery1121 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_grandQuery1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_grandQuery1132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_grandQuery1135 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000008L});
	public static final BitSet FOLLOW_WS_in_grandQuery1154 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
	public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandQuery1157 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_queryStmnt1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1208 = new BitSet(new long[]{0x1480818008004000L,0x0000000000100000L});
	public static final BitSet FOLLOW_selectItems_in_queryStmnt1210 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1214 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_queryStmnt1217 = new BitSet(new long[]{0x1480818008004000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1219 = new BitSet(new long[]{0x1480818008004000L,0x0000000000100000L});
	public static final BitSet FOLLOW_selectItems_in_queryStmnt1222 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1253 = new BitSet(new long[]{0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_90_in_queryStmnt1255 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1270 = new BitSet(new long[]{0x0000000400000000L});
	public static final BitSet FOLLOW_FROM_in_queryStmnt1272 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1293 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1297 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1334 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
	public static final BitSet FOLLOW_queryStmnt_in_queryStmnt1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1344 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_WHERE_in_queryStmnt1365 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1367 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_whereClause_in_queryStmnt1369 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1387 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_BREAK_in_queryStmnt1389 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1391 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt1393 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1395 = new BitSet(new long[]{0x0000000020000000L,0x0000000000004080L});
	public static final BitSet FOLLOW_granularityClause_in_queryStmnt1399 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1416 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_GROUP_in_queryStmnt1418 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1420 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt1422 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1424 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1450 = new BitSet(new long[]{0x0000000000000002L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1482 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_queryStmnt1485 = new BitSet(new long[]{0x0000010000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1487 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1492 = new BitSet(new long[]{0x0000000000000002L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1549 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_HAVING_in_queryStmnt1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1553 = new BitSet(new long[]{0x4000010000000000L});
	public static final BitSet FOLLOW_havingClause_in_queryStmnt1557 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1601 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
	public static final BitSet FOLLOW_ORDER_in_queryStmnt1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1605 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_BY_in_queryStmnt1607 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1609 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_queryStmnt1614 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1647 = new BitSet(new long[]{0x0000000004000080L});
	public static final BitSet FOLLOW_set_in_queryStmnt1651 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1701 = new BitSet(new long[]{0x0020000000000000L});
	public static final BitSet FOLLOW_LIMIT_in_queryStmnt1703 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1705 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LONG_in_queryStmnt1710 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_THEN_in_queryStmnt1750 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1752 = new BitSet(new long[]{0x0140810200000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_postAggItem_in_queryStmnt1756 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1771 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_WHICH_in_queryStmnt1773 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1775 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_CONTAINS_in_queryStmnt1777 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1781 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1784 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1786 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1792 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1796 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_queryStmnt1799 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1801 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1806 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1816 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_SORT_in_queryStmnt1824 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1826 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1829 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1831 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1837 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1845 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1857 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_HINT_in_queryStmnt1859 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1861 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_queryStmnt1864 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1871 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_queryStmnt1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_queryStmnt1878 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_anyValue1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggItem_in_selectItems1943 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleDim_in_selectItems1953 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleDim1974 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleDim1977 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_simpleDim1979 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleDim1981 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_simpleDim1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_intervalClause_in_whereClause2008 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_whereClause2013 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_whereClause2015 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_whereClause2017 = new BitSet(new long[]{0x4100010000000000L});
	public static final BitSet FOLLOW_grandFilter_in_whereClause2021 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_92_in_intervalClause2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2049 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_BETWEEN_in_intervalClause2051 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2053 = new BitSet(new long[]{0x0100000000FF8000L,0x0000000000004000L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause2073 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2080 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2084 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AND_in_intervalClause2086 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2088 = new BitSet(new long[]{0x0000000000FF8000L,0x0000000000004000L});
	public static final BitSet FOLLOW_isoTime_in_intervalClause2093 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause2100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_intervalClause2126 = new BitSet(new long[]{0x0200000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2128 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause2133 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_intervalClause2145 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_intervalClause2148 = new BitSet(new long[]{0x0200000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_intervalClause2150 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_pairString_in_intervalClause2155 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_intervalClause2161 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_intervalClause2164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_getEquals2187 = new BitSet(new long[]{0x0000000040000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_getEquals2189 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_EQUALS_in_getEquals2192 = new BitSet(new long[]{0x0040000200000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_getEquals2194 = new BitSet(new long[]{0x0040000200000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_set_in_getEquals2200 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2239 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DURATION_in_granularityClause2263 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2265 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause2268 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2275 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_granularityClause2279 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_91_in_granularityClause2283 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2290 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_granularityClause2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_granularityClause2301 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_granularityClause2312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause2317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PERIOD_in_granularityClause2336 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2338 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityClause2341 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2348 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_granularityClause2352 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_91_in_granularityClause2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2363 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_granularityClause2369 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_91_in_granularityClause2373 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2380 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_granularityClause2389 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_granularityClause2392 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_granularityClause2394 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_granularityInclude_in_granularityClause2399 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_granularityClause2403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_granularityClause2408 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2436 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_INCLUDE_in_granularityInclude2438 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2440 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_granularityInclude2443 = new BitSet(new long[]{0x0200000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2445 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude2451 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_91_in_granularityInclude2456 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_pairNums_in_granularityInclude2460 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_granularityInclude2467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_granularityInclude2470 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairNums2489 = new BitSet(new long[]{0x0040000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_pairNums2491 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums2496 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_pairNums2499 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_pairNums2502 = new BitSet(new long[]{0x0040000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_pairNums2504 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_LONG_in_pairNums2509 = new BitSet(new long[]{0x0000000000000000L,0x0000000001001000L});
	public static final BitSet FOLLOW_WS_in_pairNums2511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RSQUARE_in_pairNums2514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LSQUARE_in_pairString2534 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_pairString2536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString2541 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000000L});
	public static final BitSet FOLLOW_WS_in_pairString2544 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_pairString2547 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_pairString2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString2554 = new BitSet(new long[]{0x0000000000000000L,0x0000000001001000L});
	public static final BitSet FOLLOW_WS_in_pairString2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_RSQUARE_in_pairString2559 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_complexHaving_in_havingClause2584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_simpleHaving2605 = new BitSet(new long[]{0x0000000000001000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2607 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving2612 = new BitSet(new long[]{0x0040000200000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2614 = new BitSet(new long[]{0x0040000200000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving2619 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_simpleHaving2636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleHaving2647 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2649 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_simpleHaving2653 = new BitSet(new long[]{0x0000000000001000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2655 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving2660 = new BitSet(new long[]{0x0040000200000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleHaving2662 = new BitSet(new long[]{0x0040000200000000L});
	public static final BitSet FOLLOW_set_in_simpleHaving2667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleHaving_in_complexHaving2695 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleHaving_in_complexHaving2706 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_complexHaving2708 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_complexHaving2712 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_complexHaving2718 = new BitSet(new long[]{0x4000010000000000L});
	public static final BitSet FOLLOW_complexHaving_in_complexHaving2722 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_semiGrandFilter_in_grandFilter2751 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_grandFilter2756 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_grandFilter2760 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_grandFilter2766 = new BitSet(new long[]{0x4100010000000000L});
	public static final BitSet FOLLOW_semiGrandFilter_in_grandFilter2770 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_simpleLogicalFilter_in_semiGrandFilter2801 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_semiGrandFilter2808 = new BitSet(new long[]{0x4100010000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_semiGrandFilter2810 = new BitSet(new long[]{0x4100010000000000L});
	public static final BitSet FOLLOW_semiGrandFilter_in_semiGrandFilter2815 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_semiGrandFilter2821 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_semiGrandFilter2825 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_semiGrandFilter2831 = new BitSet(new long[]{0x4100010000000000L});
	public static final BitSet FOLLOW_semiGrandFilter_in_semiGrandFilter2835 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_semiGrandFilter2851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_semiGrandFilter2854 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2873 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2885 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2887 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000010L});
	public static final BitSet FOLLOW_set_in_simpleLogicalFilter2891 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2897 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2901 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_simpleLogicalFilter2909 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2911 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2915 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectorFilter_in_simpleFilter2942 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_regexFilter_in_simpleFilter2948 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_getEquals_in_selectorFilter2973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_regexFilter3002 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_regexFilter3004 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_LIKE_in_regexFilter3006 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_regexFilter3008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter3014 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggCallSite_in_aggItem3045 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_aggItem3049 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AS_in_aggItem3051 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_aggItem3053 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_aggItem3057 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_aggFunc_in_aggCallSite3076 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3081 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_aggCallSite3084 = new BitSet(new long[]{0x0000010000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3086 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_aggCallSite3093 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3099 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_91_in_aggCallSite3102 = new BitSet(new long[]{0x0000010000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3104 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_aggCallSite3109 = new BitSet(new long[]{0x0000000000000000L,0x0000000009000800L});
	public static final BitSet FOLLOW_WS_in_aggCallSite3115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_aggCallSite3118 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COUNT_in_aggCallSite3125 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_89_in_aggCallSite3130 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LONG_SUM_in_aggFunc3148 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DOUBLE_SUM_in_aggFunc3155 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_aggFunc3162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_HYPER_UNIQUE_in_aggFunc3169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MIN_in_aggFunc3176 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_MAX_in_aggFunc3183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_aggFunc3190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simpleArith_in_postAggItem3218 = new BitSet(new long[]{0x0000000000000022L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3222 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem3225 = new BitSet(new long[]{0x0140810200000000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3228 = new BitSet(new long[]{0x0140810200000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem3233 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPARAN_in_postAggItem3251 = new BitSet(new long[]{0x0140810200000000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3253 = new BitSet(new long[]{0x0140810200000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem3258 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_postAggItem3260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_postAggItem3263 = new BitSet(new long[]{0x0000000000000062L,0x0000000001000000L});
	public static final BitSet FOLLOW_postAggLabel_in_postAggItem3267 = new BitSet(new long[]{0x0000000000000022L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3273 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_postAggItem3276 = new BitSet(new long[]{0x0140810200000000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_postAggItem3279 = new BitSet(new long[]{0x0140810200000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_postAggItem_in_postAggItem3284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith3320 = new BitSet(new long[]{0x0000000000000022L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_simpleArith3326 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_postAggArithOper_in_simpleArith3329 = new BitSet(new long[]{0x0040810200000000L,0x0000000001100000L});
	public static final BitSet FOLLOW_WS_in_simpleArith3332 = new BitSet(new long[]{0x0040810200000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith3337 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_constantAccess_in_simplePostAggAccess3366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_fieldAccess_in_simplePostAggAccess3383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess3396 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_postAggJavascriptDef_in_simplePostAggAccess3405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FLOAT_in_constantAccess3435 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_LONG_in_constantAccess3441 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_constantAccess3454 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_constantAccess3456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fieldAccess3484 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_fieldAccess3487 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_postAggLabel_in_fieldAccess3489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UNIQUE_in_hyperUniqueCardinality3518 = new BitSet(new long[]{0x0100000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3520 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_LPARAN_in_hyperUniqueCardinality3523 = new BitSet(new long[]{0x0000010000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3525 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_hyperUniqueCardinality3530 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000800L});
	public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_RPARAN_in_hyperUniqueCardinality3535 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_JAVASCRIPT_in_postAggJavascriptDef3561 = new BitSet(new long[]{0x0000000000000000L,0x0000000001004000L});
	public static final BitSet FOLLOW_WS_in_postAggJavascriptDef3563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef3568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_postAggLabel3584 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
	public static final BitSet FOLLOW_WS_in_postAggLabel3586 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_ID_in_postAggLabel3590 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ARITH_OPER_in_postAggArithOper3606 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_YEAR_ONLY_in_isoTime3625 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime3633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_isoTime3641 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_in_isoTime3649 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_in_isoTime3657 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime3665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime3673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime3681 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime3689 = new BitSet(new long[]{0x0000000000000002L});
}
