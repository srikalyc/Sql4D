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
package com.yahoo.sql4d.converter;

// $ANTLR 3.5 /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2014-07-26 18:25:12

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class druidGLexer extends Lexer {
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
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public druidGLexer() {} 
	public druidGLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public druidGLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g"; }

	// $ANTLR start "T__68"
	public final void mT__68() throws RecognitionException {
		try {
			int _type = T__68;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:2:7: ( '(*)' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:2:9: '(*)'
			{
			match("(*)"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__68"

	// $ANTLR start "T__69"
	public final void mT__69() throws RecognitionException {
		try {
			int _type = T__69;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:3:7: ( '*' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:3:9: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__69"

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:4:7: ( ',' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:4:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:5:7: ( 'interval' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:5:9: 'interval'
			{
			match("interval"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__71"

	// $ANTLR start "LPARAN"
	public final void mLPARAN() throws RecognitionException {
		try {
			int _type = LPARAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:380:8: ( '(' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:380:11: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPARAN"

	// $ANTLR start "RPARAN"
	public final void mRPARAN() throws RecognitionException {
		try {
			int _type = RPARAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:8: ( ')' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:11: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPARAN"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:8: ( '{' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:383:8: ( '}' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:383:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:384:9: ( '[' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:384:12: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:385:9: ( ']' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:385:12: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:9: ( ( 'SELECT' | 'select' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:11: ( 'SELECT' | 'select' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:11: ( 'SELECT' | 'select' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='S') ) {
				alt1=1;
			}
			else if ( (LA1_0=='s') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:12: 'SELECT'
					{
					match("SELECT"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:21: 'select'
					{
					match("select"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:8: ( ( 'COUNT' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:10: ( 'COUNT' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:10: ( 'COUNT' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:11: 'COUNT'
			{
			match("COUNT"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "LONG_SUM"
	public final void mLONG_SUM() throws RecognitionException {
		try {
			int _type = LONG_SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:10: ( ( 'LONG_SUM' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:12: ( 'LONG_SUM' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:12: ( 'LONG_SUM' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:13: 'LONG_SUM'
			{
			match("LONG_SUM"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG_SUM"

	// $ANTLR start "DOUBLE_SUM"
	public final void mDOUBLE_SUM() throws RecognitionException {
		try {
			int _type = DOUBLE_SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:392:12: ( ( 'DOUBLE_SUM' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:392:14: ( 'DOUBLE_SUM' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:392:14: ( 'DOUBLE_SUM' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:392:15: 'DOUBLE_SUM'
			{
			match("DOUBLE_SUM"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLE_SUM"

	// $ANTLR start "UNIQUE"
	public final void mUNIQUE() throws RecognitionException {
		try {
			int _type = UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:9: ( ( 'UNIQUE' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:11: ( 'UNIQUE' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:11: ( 'UNIQUE' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:12: 'UNIQUE'
			{
			match("UNIQUE"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIQUE"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			int _type = MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:6: ( ( 'MIN' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:8: ( 'MIN' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:8: ( 'MIN' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:9: 'MIN'
			{
			match("MIN"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN"

	// $ANTLR start "MAX"
	public final void mMAX() throws RecognitionException {
		try {
			int _type = MAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:395:5: ( ( 'MAX' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:395:7: ( 'MAX' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:395:7: ( 'MAX' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:395:8: 'MAX'
			{
			match("MAX"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAX"

	// $ANTLR start "DURATION"
	public final void mDURATION() throws RecognitionException {
		try {
			int _type = DURATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:9: ( ( 'DURATION' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:11: ( 'DURATION' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:11: ( 'DURATION' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:12: 'DURATION'
			{
			match("DURATION"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DURATION"

	// $ANTLR start "PERIOD"
	public final void mPERIOD() throws RecognitionException {
		try {
			int _type = PERIOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:8: ( ( 'PERIOD' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:10: ( 'PERIOD' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:10: ( 'PERIOD' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:11: 'PERIOD'
			{
			match("PERIOD"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERIOD"

	// $ANTLR start "INCLUDE"
	public final void mINCLUDE() throws RecognitionException {
		try {
			int _type = INCLUDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:399:9: ( ( 'INCLUDE' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:399:11: ( 'INCLUDE' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:399:11: ( 'INCLUDE' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:399:12: 'INCLUDE'
			{
			match("INCLUDE"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INCLUDE"

	// $ANTLR start "WHICH"
	public final void mWHICH() throws RecognitionException {
		try {
			int _type = WHICH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:401:7: ( ( 'WHICH' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:401:9: ( 'WHICH' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:401:9: ( 'WHICH' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:401:10: 'WHICH'
			{
			match("WHICH"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHICH"

	// $ANTLR start "CONTAINS"
	public final void mCONTAINS() throws RecognitionException {
		try {
			int _type = CONTAINS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:9: ( ( 'CONTAINS' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:11: ( 'CONTAINS' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:11: ( 'CONTAINS' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:12: 'CONTAINS'
			{
			match("CONTAINS"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONTAINS"

	// $ANTLR start "SORT"
	public final void mSORT() throws RecognitionException {
		try {
			int _type = SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:403:6: ( ( 'SORT' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:403:8: ( 'SORT' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:403:8: ( 'SORT' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:403:9: 'SORT'
			{
			match("SORT"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SORT"

	// $ANTLR start "HINT"
	public final void mHINT() throws RecognitionException {
		try {
			int _type = HINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:405:6: ( ( 'HINT' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:405:8: ( 'HINT' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:405:8: ( 'HINT' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:405:9: 'HINT'
			{
			match("HINT"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HINT"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:5: ( ( 'AS' | 'as' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:7: ( 'AS' | 'as' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:7: ( 'AS' | 'as' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='A') ) {
				alt2=1;
			}
			else if ( (LA2_0=='a') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:8: 'AS'
					{
					match("AS"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:13: 'as'
					{
					match("as"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS"

	// $ANTLR start "FIELD_ACCESS"
	public final void mFIELD_ACCESS() throws RecognitionException {
		try {
			int _type = FIELD_ACCESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:408:14: ( ( 'FIELD_ACCESS' | 'field_access' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:408:16: ( 'FIELD_ACCESS' | 'field_access' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:408:16: ( 'FIELD_ACCESS' | 'field_access' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='F') ) {
				alt3=1;
			}
			else if ( (LA3_0=='f') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:408:17: 'FIELD_ACCESS'
					{
					match("FIELD_ACCESS"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:408:32: 'field_access'
					{
					match("field_access"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIELD_ACCESS"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:409:7: ( ( 'FROM' | 'from' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:409:9: ( 'FROM' | 'from' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:409:9: ( 'FROM' | 'from' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='F') ) {
				alt4=1;
			}
			else if ( (LA4_0=='f') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:409:10: 'FROM'
					{
					match("FROM"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:409:17: 'from'
					{
					match("from"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:8: ( ( 'WHERE' | 'where' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:10: ( 'WHERE' | 'where' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:10: ( 'WHERE' | 'where' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='W') ) {
				alt5=1;
			}
			else if ( (LA5_0=='w') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:11: 'WHERE'
					{
					match("WHERE"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:19: 'where'
					{
					match("where"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "BETWEEN"
	public final void mBETWEEN() throws RecognitionException {
		try {
			int _type = BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:411:9: ( ( 'BETWEEN' | 'between' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:411:11: ( 'BETWEEN' | 'between' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:411:11: ( 'BETWEEN' | 'between' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='B') ) {
				alt6=1;
			}
			else if ( (LA6_0=='b') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:411:12: 'BETWEEN'
					{
					match("BETWEEN"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:411:22: 'between'
					{
					match("between"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BETWEEN"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:412:6: ( ( 'AND' | 'and' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:412:8: ( 'AND' | 'and' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:412:8: ( 'AND' | 'and' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='A') ) {
				alt7=1;
			}
			else if ( (LA7_0=='a') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:412:9: 'AND'
					{
					match("AND"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:412:15: 'and'
					{
					match("and"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:413:5: ( ( 'OR' | 'or' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:413:7: ( 'OR' | 'or' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:413:7: ( 'OR' | 'or' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='O') ) {
				alt8=1;
			}
			else if ( (LA8_0=='o') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:413:8: 'OR'
					{
					match("OR"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:413:13: 'or'
					{
					match("or"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:414:6: ( ( 'NOT' | 'not' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:414:8: ( 'NOT' | 'not' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:414:8: ( 'NOT' | 'not' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='N') ) {
				alt9=1;
			}
			else if ( (LA9_0=='n') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:414:9: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:414:15: 'not'
					{
					match("not"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "GROUP"
	public final void mGROUP() throws RecognitionException {
		try {
			int _type = GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:7: ( ( 'GROUP' | 'group' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:9: ( 'GROUP' | 'group' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:9: ( 'GROUP' | 'group' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='G') ) {
				alt10=1;
			}
			else if ( (LA10_0=='g') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:10: 'GROUP'
					{
					match("GROUP"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:20: 'group'
					{
					match("group"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUP"

	// $ANTLR start "ORDER"
	public final void mORDER() throws RecognitionException {
		try {
			int _type = ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:7: ( ( 'ORDER' | 'order' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:9: ( 'ORDER' | 'order' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:9: ( 'ORDER' | 'order' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='O') ) {
				alt11=1;
			}
			else if ( (LA11_0=='o') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:10: 'ORDER'
					{
					match("ORDER"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:20: 'order'
					{
					match("order"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORDER"

	// $ANTLR start "HAVING"
	public final void mHAVING() throws RecognitionException {
		try {
			int _type = HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:417:8: ( ( 'HAVING' | 'having' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:417:10: ( 'HAVING' | 'having' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:417:10: ( 'HAVING' | 'having' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='H') ) {
				alt12=1;
			}
			else if ( (LA12_0=='h') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:417:11: 'HAVING'
					{
					match("HAVING"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:417:22: 'having'
					{
					match("having"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HAVING"

	// $ANTLR start "BREAK"
	public final void mBREAK() throws RecognitionException {
		try {
			int _type = BREAK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:418:7: ( ( 'BREAK' | 'break' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:418:9: ( 'BREAK' | 'break' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:418:9: ( 'BREAK' | 'break' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='B') ) {
				alt13=1;
			}
			else if ( (LA13_0=='b') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:418:10: 'BREAK'
					{
					match("BREAK"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:418:20: 'break'
					{
					match("break"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BREAK"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:419:4: ( ( 'BY' | 'by' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:419:6: ( 'BY' | 'by' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:419:6: ( 'BY' | 'by' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='B') ) {
				alt14=1;
			}
			else if ( (LA14_0=='b') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:419:7: 'BY'
					{
					match("BY"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:419:14: 'by'
					{
					match("by"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "LIMIT"
	public final void mLIMIT() throws RecognitionException {
		try {
			int _type = LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:421:7: ( ( 'LIMIT' | 'limit' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:421:9: ( 'LIMIT' | 'limit' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:421:9: ( 'LIMIT' | 'limit' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='L') ) {
				alt15=1;
			}
			else if ( (LA15_0=='l') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:421:10: 'LIMIT'
					{
					match("LIMIT"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:421:20: 'limit'
					{
					match("limit"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIMIT"

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:422:6: ( ( 'LIKE' | 'like' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:422:8: ( 'LIKE' | 'like' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:422:8: ( 'LIKE' | 'like' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='L') ) {
				alt16=1;
			}
			else if ( (LA16_0=='l') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:422:9: 'LIKE'
					{
					match("LIKE"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:422:18: 'like'
					{
					match("like"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIKE"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:6: ( ( 'THEN' | 'then' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:8: ( 'THEN' | 'then' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:8: ( 'THEN' | 'then' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='T') ) {
				alt17=1;
			}
			else if ( (LA17_0=='t') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:9: 'THEN'
					{
					match("THEN"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:18: 'then'
					{
					match("then"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "JAVASCRIPT"
	public final void mJAVASCRIPT() throws RecognitionException {
		try {
			int _type = JAVASCRIPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:426:2: ( ( 'JAVASCRIPT:' | 'javascript:' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:426:5: ( 'JAVASCRIPT:' | 'javascript:' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:426:5: ( 'JAVASCRIPT:' | 'javascript:' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='J') ) {
				alt18=1;
			}
			else if ( (LA18_0=='j') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:426:6: 'JAVASCRIPT:'
					{
					match("JAVASCRIPT:"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:426:21: 'javascript:'
					{
					match("javascript:"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JAVASCRIPT"

	// $ANTLR start "JOIN"
	public final void mJOIN() throws RecognitionException {
		try {
			int _type = JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:7: ( ( 'JOIN' | 'join' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:9: ( 'JOIN' | 'join' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:9: ( 'JOIN' | 'join' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='J') ) {
				alt19=1;
			}
			else if ( (LA19_0=='j') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:10: 'JOIN'
					{
					match("JOIN"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:19: 'join'
					{
					match("join"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOIN"

	// $ANTLR start "LEFT_JOIN"
	public final void mLEFT_JOIN() throws RecognitionException {
		try {
			int _type = LEFT_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:12: ( ( 'LEFT_JOIN' | 'left_join' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:14: ( 'LEFT_JOIN' | 'left_join' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:14: ( 'LEFT_JOIN' | 'left_join' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='L') ) {
				alt20=1;
			}
			else if ( (LA20_0=='l') ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:15: 'LEFT_JOIN'
					{
					match("LEFT_JOIN"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:29: 'left_join'
					{
					match("left_join"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT_JOIN"

	// $ANTLR start "RIGHT_JOIN"
	public final void mRIGHT_JOIN() throws RecognitionException {
		try {
			int _type = RIGHT_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:434:13: ( ( 'RIGHT_JOIN' | 'right_join' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:434:15: ( 'RIGHT_JOIN' | 'right_join' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:434:15: ( 'RIGHT_JOIN' | 'right_join' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='R') ) {
				alt21=1;
			}
			else if ( (LA21_0=='r') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:434:16: 'RIGHT_JOIN'
					{
					match("RIGHT_JOIN"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:434:31: 'right_join'
					{
					match("right_join"); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT_JOIN"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:5: ( ( 'ON' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:7: ( 'ON' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:7: ( 'ON' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:8: 'ON'
			{
			match("ON"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "OPT_SEMI_COLON"
	public final void mOPT_SEMI_COLON() throws RecognitionException {
		try {
			int _type = OPT_SEMI_COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:2: ( ';' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:4: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPT_SEMI_COLON"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:445:2: ( ( ' ' | '\\t' )+ )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:445:4: ( ' ' | '\\t' )+
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:445:4: ( ' ' | '\\t' )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0=='\t'||LA22_0==' ') ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
					{
					if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:450:2: ( NUM NUM NUM NUM '-' NUM NUM '-' NUM NUM )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:450:4: NUM NUM NUM NUM '-' NUM NUM '-' NUM NUM
			{
			mNUM(); 

			mNUM(); 

			mNUM(); 

			mNUM(); 

			match('-'); 
			mNUM(); 

			mNUM(); 

			match('-'); 
			mNUM(); 

			mNUM(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "DATE_HOUR"
	public final void mDATE_HOUR() throws RecognitionException {
		try {
			int _type = DATE_HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:2: ( DATE 'T' NUM NUM )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:4: DATE 'T' NUM NUM
			{
			mDATE(); 

			match('T'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR"

	// $ANTLR start "DATE_HOUR_MIN"
	public final void mDATE_HOUR_MIN() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:2: ( DATE_HOUR ':' NUM NUM )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:5: DATE_HOUR ':' NUM NUM
			{
			mDATE_HOUR(); 

			match(':'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR_MIN"

	// $ANTLR start "DATE_HOUR_MIN_SEC"
	public final void mDATE_HOUR_MIN_SEC() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN_SEC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:459:2: ( DATE_HOUR_MIN ':' NUM NUM )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:459:5: DATE_HOUR_MIN ':' NUM NUM
			{
			mDATE_HOUR_MIN(); 

			match(':'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR_MIN_SEC"

	// $ANTLR start "DATE_HOUR_MIN_SEC_SUB"
	public final void mDATE_HOUR_MIN_SEC_SUB() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN_SEC_SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:462:2: ( DATE_HOUR_MIN_SEC '.' NUM NUM NUM )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:462:5: DATE_HOUR_MIN_SEC '.' NUM NUM NUM
			{
			mDATE_HOUR_MIN_SEC(); 

			match('.'); 
			mNUM(); 

			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR_MIN_SEC_SUB"

	// $ANTLR start "DATE_HOUR_MIN_SEC_SUB_TZ"
	public final void mDATE_HOUR_MIN_SEC_SUB_TZ() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN_SEC_SUB_TZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:465:2: ( DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:465:5: DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM
			{
			mDATE_HOUR_MIN_SEC_SUB(); 

			if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			mNUM(); 

			mNUM(); 

			match(':'); 
			mNUM(); 

			mNUM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR_MIN_SEC_SUB_TZ"

	// $ANTLR start "DATE_HOUR_MIN_SEC_SUB_UTC_TZ"
	public final void mDATE_HOUR_MIN_SEC_SUB_UTC_TZ() throws RecognitionException {
		try {
			int _type = DATE_HOUR_MIN_SEC_SUB_UTC_TZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:2: ( DATE_HOUR_MIN 'Z' | DATE_HOUR_MIN_SEC 'Z' | DATE_HOUR_MIN_SEC_SUB 'Z' )
			int alt23=3;
			int LA23_0 = input.LA(1);
			if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
				int LA23_1 = input.LA(2);
				if ( ((LA23_1 >= '0' && LA23_1 <= '9')) ) {
					int LA23_2 = input.LA(3);
					if ( ((LA23_2 >= '0' && LA23_2 <= '9')) ) {
						int LA23_3 = input.LA(4);
						if ( ((LA23_3 >= '0' && LA23_3 <= '9')) ) {
							int LA23_4 = input.LA(5);
							if ( (LA23_4=='-') ) {
								int LA23_5 = input.LA(6);
								if ( ((LA23_5 >= '0' && LA23_5 <= '9')) ) {
									int LA23_6 = input.LA(7);
									if ( ((LA23_6 >= '0' && LA23_6 <= '9')) ) {
										int LA23_7 = input.LA(8);
										if ( (LA23_7=='-') ) {
											int LA23_8 = input.LA(9);
											if ( ((LA23_8 >= '0' && LA23_8 <= '9')) ) {
												int LA23_9 = input.LA(10);
												if ( ((LA23_9 >= '0' && LA23_9 <= '9')) ) {
													int LA23_10 = input.LA(11);
													if ( (LA23_10=='T') ) {
														int LA23_11 = input.LA(12);
														if ( ((LA23_11 >= '0' && LA23_11 <= '9')) ) {
															int LA23_12 = input.LA(13);
															if ( ((LA23_12 >= '0' && LA23_12 <= '9')) ) {
																int LA23_13 = input.LA(14);
																if ( (LA23_13==':') ) {
																	int LA23_14 = input.LA(15);
																	if ( ((LA23_14 >= '0' && LA23_14 <= '9')) ) {
																		int LA23_15 = input.LA(16);
																		if ( ((LA23_15 >= '0' && LA23_15 <= '9')) ) {
																			int LA23_16 = input.LA(17);
																			if ( (LA23_16=='Z') ) {
																				alt23=1;
																			}
																			else if ( (LA23_16==':') ) {
																				int LA23_18 = input.LA(18);
																				if ( ((LA23_18 >= '0' && LA23_18 <= '9')) ) {
																					int LA23_19 = input.LA(19);
																					if ( ((LA23_19 >= '0' && LA23_19 <= '9')) ) {
																						int LA23_20 = input.LA(20);
																						if ( (LA23_20=='Z') ) {
																							alt23=2;
																						}
																						else if ( (LA23_20=='.') ) {
																							alt23=3;
																						}

																						else {
																							int nvaeMark = input.mark();
																							try {
																								for (int nvaeConsume = 0; nvaeConsume < 20 - 1; nvaeConsume++) {
																									input.consume();
																								}
																								NoViableAltException nvae =
																									new NoViableAltException("", 23, 20, input);
																								throw nvae;
																							} finally {
																								input.rewind(nvaeMark);
																							}
																						}

																					}

																					else {
																						int nvaeMark = input.mark();
																						try {
																							for (int nvaeConsume = 0; nvaeConsume < 19 - 1; nvaeConsume++) {
																								input.consume();
																							}
																							NoViableAltException nvae =
																								new NoViableAltException("", 23, 19, input);
																							throw nvae;
																						} finally {
																							input.rewind(nvaeMark);
																						}
																					}

																				}

																				else {
																					int nvaeMark = input.mark();
																					try {
																						for (int nvaeConsume = 0; nvaeConsume < 18 - 1; nvaeConsume++) {
																							input.consume();
																						}
																						NoViableAltException nvae =
																							new NoViableAltException("", 23, 18, input);
																						throw nvae;
																					} finally {
																						input.rewind(nvaeMark);
																					}
																				}

																			}

																			else {
																				int nvaeMark = input.mark();
																				try {
																					for (int nvaeConsume = 0; nvaeConsume < 17 - 1; nvaeConsume++) {
																						input.consume();
																					}
																					NoViableAltException nvae =
																						new NoViableAltException("", 23, 16, input);
																					throw nvae;
																				} finally {
																					input.rewind(nvaeMark);
																				}
																			}

																		}

																		else {
																			int nvaeMark = input.mark();
																			try {
																				for (int nvaeConsume = 0; nvaeConsume < 16 - 1; nvaeConsume++) {
																					input.consume();
																				}
																				NoViableAltException nvae =
																					new NoViableAltException("", 23, 15, input);
																				throw nvae;
																			} finally {
																				input.rewind(nvaeMark);
																			}
																		}

																	}

																	else {
																		int nvaeMark = input.mark();
																		try {
																			for (int nvaeConsume = 0; nvaeConsume < 15 - 1; nvaeConsume++) {
																				input.consume();
																			}
																			NoViableAltException nvae =
																				new NoViableAltException("", 23, 14, input);
																			throw nvae;
																		} finally {
																			input.rewind(nvaeMark);
																		}
																	}

																}

																else {
																	int nvaeMark = input.mark();
																	try {
																		for (int nvaeConsume = 0; nvaeConsume < 14 - 1; nvaeConsume++) {
																			input.consume();
																		}
																		NoViableAltException nvae =
																			new NoViableAltException("", 23, 13, input);
																		throw nvae;
																	} finally {
																		input.rewind(nvaeMark);
																	}
																}

															}

															else {
																int nvaeMark = input.mark();
																try {
																	for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++) {
																		input.consume();
																	}
																	NoViableAltException nvae =
																		new NoViableAltException("", 23, 12, input);
																	throw nvae;
																} finally {
																	input.rewind(nvaeMark);
																}
															}

														}

														else {
															int nvaeMark = input.mark();
															try {
																for (int nvaeConsume = 0; nvaeConsume < 12 - 1; nvaeConsume++) {
																	input.consume();
																}
																NoViableAltException nvae =
																	new NoViableAltException("", 23, 11, input);
																throw nvae;
															} finally {
																input.rewind(nvaeMark);
															}
														}

													}

													else {
														int nvaeMark = input.mark();
														try {
															for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
																input.consume();
															}
															NoViableAltException nvae =
																new NoViableAltException("", 23, 10, input);
															throw nvae;
														} finally {
															input.rewind(nvaeMark);
														}
													}

												}

												else {
													int nvaeMark = input.mark();
													try {
														for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
															input.consume();
														}
														NoViableAltException nvae =
															new NoViableAltException("", 23, 9, input);
														throw nvae;
													} finally {
														input.rewind(nvaeMark);
													}
												}

											}

											else {
												int nvaeMark = input.mark();
												try {
													for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
														input.consume();
													}
													NoViableAltException nvae =
														new NoViableAltException("", 23, 8, input);
													throw nvae;
												} finally {
													input.rewind(nvaeMark);
												}
											}

										}

										else {
											int nvaeMark = input.mark();
											try {
												for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
													input.consume();
												}
												NoViableAltException nvae =
													new NoViableAltException("", 23, 7, input);
												throw nvae;
											} finally {
												input.rewind(nvaeMark);
											}
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 23, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 23, 5, input);
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
										new NoViableAltException("", 23, 4, input);
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
									new NoViableAltException("", 23, 3, input);
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
								new NoViableAltException("", 23, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 23, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:5: DATE_HOUR_MIN 'Z'
					{
					mDATE_HOUR_MIN(); 

					match('Z'); 
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:469:6: DATE_HOUR_MIN_SEC 'Z'
					{
					mDATE_HOUR_MIN_SEC(); 

					match('Z'); 
					}
					break;
				case 3 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:470:6: DATE_HOUR_MIN_SEC_SUB 'Z'
					{
					mDATE_HOUR_MIN_SEC_SUB(); 

					match('Z'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_HOUR_MIN_SEC_SUB_UTC_TZ"

	// $ANTLR start "ARITH_OPER"
	public final void mARITH_OPER() throws RecognitionException {
		try {
			int _type = ARITH_OPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:473:13: ( ( '*' | '+' | '/' | '-' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
			{
			if ( (input.LA(1) >= '*' && input.LA(1) <= '+')||input.LA(1)=='-'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARITH_OPER"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:476:9: ( '=' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:476:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "COMPARE_OPER"
	public final void mCOMPARE_OPER() throws RecognitionException {
		try {
			int _type = COMPARE_OPER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:478:15: ( ( '<' | '>' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
			{
			if ( input.LA(1)=='<'||input.LA(1)=='>' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMPARE_OPER"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:482:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:482:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:482:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= '0' && LA24_0 <= '9')||(LA24_0 >= 'A' && LA24_0 <= 'Z')||LA24_0=='_'||(LA24_0 >= 'a' && LA24_0 <= 'z')) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop24;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NEWLINE"
	public final void mNEWLINE() throws RecognitionException {
		try {
			int _type = NEWLINE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:486:11: ( ( '\\r\\n' | '\\r' | '\\n' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:486:14: ( '\\r\\n' | '\\r' | '\\n' )
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:486:14: ( '\\r\\n' | '\\r' | '\\n' )
			int alt25=3;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='\r') ) {
				int LA25_1 = input.LA(2);
				if ( (LA25_1=='\n') ) {
					alt25=1;
				}

				else {
					alt25=2;
				}

			}
			else if ( (LA25_0=='\n') ) {
				alt25=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:486:16: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:18: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:488:18: '\\n'
					{
					match('\n'); 
					}
					break;

			}

			 
			                _channel = HIDDEN;
			             
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEWLINE"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop26:
			while (true) {
				int alt26=3;
				int LA26_0 = input.LA(1);
				if ( (LA26_0=='\\') ) {
					alt26=1;
				}
				else if ( ((LA26_0 >= '\u0000' && LA26_0 <= '!')||(LA26_0 >= '#' && LA26_0 <= '[')||(LA26_0 >= ']' && LA26_0 <= '\uFFFF')) ) {
					alt26=2;
				}

				switch (alt26) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:24: ~ ( '\\\\' | '\"' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop26;
				}
			}

			match('\"'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "SINGLE_QUOTE_STRING"
	public final void mSINGLE_QUOTE_STRING() throws RecognitionException {
		try {
			int _type = SINGLE_QUOTE_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:8: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
			{
			match('\''); 
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:13: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
			loop27:
			while (true) {
				int alt27=3;
				int LA27_0 = input.LA(1);
				if ( (LA27_0=='\\') ) {
					alt27=1;
				}
				else if ( ((LA27_0 >= '\u0000' && LA27_0 <= '&')||(LA27_0 >= '(' && LA27_0 <= '[')||(LA27_0 >= ']' && LA27_0 <= '\uFFFF')) ) {
					alt27=2;
				}

				switch (alt27) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:24: ~ ( '\\\\' | '\\'' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop27;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SINGLE_QUOTE_STRING"

	// $ANTLR start "LONG"
	public final void mLONG() throws RecognitionException {
		try {
			int _type = LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:503:6: ( ( NUM )+ )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:503:8: ( NUM )+
			{
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:503:8: ( NUM )+
			int cnt28=0;
			loop28:
			while (true) {
				int alt28=2;
				int LA28_0 = input.LA(1);
				if ( ((LA28_0 >= '0' && LA28_0 <= '9')) ) {
					alt28=1;
				}

				switch (alt28) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt28 >= 1 ) break loop28;
					EarlyExitException eee = new EarlyExitException(28, input);
					throw eee;
				}
				cnt28++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LONG"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:504:10: ( LONG ( '.' LONG )? )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:504:15: LONG ( '.' LONG )?
			{
			mLONG(); 

			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:504:20: ( '.' LONG )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='.') ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:504:21: '.' LONG
					{
					match('.'); 
					mLONG(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:506:14: ( ( '0' .. '9' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "HEX_DIGIT"
	public final void mHEX_DIGIT() throws RecognitionException {
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:508:20: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HEX_DIGIT"

	// $ANTLR start "ESC_SEQ"
	public final void mESC_SEQ() throws RecognitionException {
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:511:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt30=3;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='\\') ) {
				switch ( input.LA(2) ) {
				case '\"':
				case '\'':
				case '\\':
				case 'b':
				case 'f':
				case 'n':
				case 'r':
				case 't':
					{
					alt30=1;
					}
					break;
				case 'u':
					{
					alt30=2;
					}
					break;
				case '0':
				case '1':
				case '2':
				case '3':
				case '4':
				case '5':
				case '6':
				case '7':
					{
					alt30=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 30, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:511:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
					{
					match('\\'); 
					if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:513:9: OCTAL_ESC
					{
					mOCTAL_ESC(); 

					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ESC_SEQ"

	// $ANTLR start "OCTAL_ESC"
	public final void mOCTAL_ESC() throws RecognitionException {
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:517:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt31=3;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='\\') ) {
				int LA31_1 = input.LA(2);
				if ( ((LA31_1 >= '0' && LA31_1 <= '3')) ) {
					int LA31_2 = input.LA(3);
					if ( ((LA31_2 >= '0' && LA31_2 <= '7')) ) {
						int LA31_4 = input.LA(4);
						if ( ((LA31_4 >= '0' && LA31_4 <= '7')) ) {
							alt31=1;
						}

						else {
							alt31=2;
						}

					}

					else {
						alt31=3;
					}

				}
				else if ( ((LA31_1 >= '4' && LA31_1 <= '7')) ) {
					int LA31_3 = input.LA(3);
					if ( ((LA31_3 >= '0' && LA31_3 <= '7')) ) {
						alt31=2;
					}

					else {
						alt31=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 31, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:517:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 2 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:518:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;
				case 3 :
					// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:519:9: '\\\\' ( '0' .. '7' )
					{
					match('\\'); 
					if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OCTAL_ESC"

	// $ANTLR start "UNICODE_ESC"
	public final void mUNICODE_ESC() throws RecognitionException {
		try {
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:523:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:523:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
			{
			match('\\'); 
			match('u'); 
			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			mHEX_DIGIT(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNICODE_ESC"

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:8: ( T__68 | T__69 | T__70 | T__71 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | WS | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | NEWLINE | STRING | SINGLE_QUOTE_STRING | LONG | FLOAT )
		int alt32=62;
		alt32 = dfa32.predict(input);
		switch (alt32) {
			case 1 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:10: T__68
				{
				mT__68(); 

				}
				break;
			case 2 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:16: T__69
				{
				mT__69(); 

				}
				break;
			case 3 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:22: T__70
				{
				mT__70(); 

				}
				break;
			case 4 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:28: T__71
				{
				mT__71(); 

				}
				break;
			case 5 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:34: LPARAN
				{
				mLPARAN(); 

				}
				break;
			case 6 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:41: RPARAN
				{
				mRPARAN(); 

				}
				break;
			case 7 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:48: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 8 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:55: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 9 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:62: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 10 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:70: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 11 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:78: SELECT
				{
				mSELECT(); 

				}
				break;
			case 12 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:85: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 13 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:91: LONG_SUM
				{
				mLONG_SUM(); 

				}
				break;
			case 14 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:100: DOUBLE_SUM
				{
				mDOUBLE_SUM(); 

				}
				break;
			case 15 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:111: UNIQUE
				{
				mUNIQUE(); 

				}
				break;
			case 16 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:118: MIN
				{
				mMIN(); 

				}
				break;
			case 17 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:122: MAX
				{
				mMAX(); 

				}
				break;
			case 18 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:126: DURATION
				{
				mDURATION(); 

				}
				break;
			case 19 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:135: PERIOD
				{
				mPERIOD(); 

				}
				break;
			case 20 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:142: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 21 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:150: WHICH
				{
				mWHICH(); 

				}
				break;
			case 22 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:156: CONTAINS
				{
				mCONTAINS(); 

				}
				break;
			case 23 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:165: SORT
				{
				mSORT(); 

				}
				break;
			case 24 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:170: HINT
				{
				mHINT(); 

				}
				break;
			case 25 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:175: AS
				{
				mAS(); 

				}
				break;
			case 26 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:178: FIELD_ACCESS
				{
				mFIELD_ACCESS(); 

				}
				break;
			case 27 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:191: FROM
				{
				mFROM(); 

				}
				break;
			case 28 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:196: WHERE
				{
				mWHERE(); 

				}
				break;
			case 29 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:202: BETWEEN
				{
				mBETWEEN(); 

				}
				break;
			case 30 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:210: AND
				{
				mAND(); 

				}
				break;
			case 31 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:214: OR
				{
				mOR(); 

				}
				break;
			case 32 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:217: NOT
				{
				mNOT(); 

				}
				break;
			case 33 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:221: GROUP
				{
				mGROUP(); 

				}
				break;
			case 34 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:227: ORDER
				{
				mORDER(); 

				}
				break;
			case 35 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:233: HAVING
				{
				mHAVING(); 

				}
				break;
			case 36 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:240: BREAK
				{
				mBREAK(); 

				}
				break;
			case 37 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:246: BY
				{
				mBY(); 

				}
				break;
			case 38 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:249: LIMIT
				{
				mLIMIT(); 

				}
				break;
			case 39 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:255: LIKE
				{
				mLIKE(); 

				}
				break;
			case 40 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:260: THEN
				{
				mTHEN(); 

				}
				break;
			case 41 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:265: JAVASCRIPT
				{
				mJAVASCRIPT(); 

				}
				break;
			case 42 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:276: JOIN
				{
				mJOIN(); 

				}
				break;
			case 43 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:281: LEFT_JOIN
				{
				mLEFT_JOIN(); 

				}
				break;
			case 44 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:291: RIGHT_JOIN
				{
				mRIGHT_JOIN(); 

				}
				break;
			case 45 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:302: ON
				{
				mON(); 

				}
				break;
			case 46 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:305: OPT_SEMI_COLON
				{
				mOPT_SEMI_COLON(); 

				}
				break;
			case 47 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:320: WS
				{
				mWS(); 

				}
				break;
			case 48 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:323: DATE_HOUR
				{
				mDATE_HOUR(); 

				}
				break;
			case 49 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:333: DATE_HOUR_MIN
				{
				mDATE_HOUR_MIN(); 

				}
				break;
			case 50 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:347: DATE_HOUR_MIN_SEC
				{
				mDATE_HOUR_MIN_SEC(); 

				}
				break;
			case 51 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:365: DATE_HOUR_MIN_SEC_SUB
				{
				mDATE_HOUR_MIN_SEC_SUB(); 

				}
				break;
			case 52 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:387: DATE_HOUR_MIN_SEC_SUB_TZ
				{
				mDATE_HOUR_MIN_SEC_SUB_TZ(); 

				}
				break;
			case 53 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:412: DATE_HOUR_MIN_SEC_SUB_UTC_TZ
				{
				mDATE_HOUR_MIN_SEC_SUB_UTC_TZ(); 

				}
				break;
			case 54 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:441: ARITH_OPER
				{
				mARITH_OPER(); 

				}
				break;
			case 55 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:452: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 56 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:459: COMPARE_OPER
				{
				mCOMPARE_OPER(); 

				}
				break;
			case 57 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:472: ID
				{
				mID(); 

				}
				break;
			case 58 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:475: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 59 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:483: STRING
				{
				mSTRING(); 

				}
				break;
			case 60 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:490: SINGLE_QUOTE_STRING
				{
				mSINGLE_QUOTE_STRING(); 

				}
				break;
			case 61 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:510: LONG
				{
				mLONG(); 

				}
				break;
			case 62 :
				// /Users/abcdef/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:515: FLOAT
				{
				mFLOAT(); 

				}
				break;

		}
	}


	protected DFA32 dfa32 = new DFA32(this);
	static final String DFA32_eotS =
		"\1\uffff\1\65\2\uffff\1\60\5\uffff\40\60\2\uffff\1\152\12\uffff\22\60"+
		"\1\u0082\1\60\1\u0082\10\60\1\u008c\2\60\1\u008c\1\u0090\1\u0091\1\u0090"+
		"\17\60\1\uffff\1\152\1\uffff\15\60\1\u00b1\1\u00b2\6\60\1\uffff\2\u00b9"+
		"\7\60\1\uffff\3\60\2\uffff\1\60\2\u00c5\16\60\1\152\2\60\1\u00d7\5\60"+
		"\1\u00dd\4\60\2\uffff\4\60\1\u00e6\1\60\1\uffff\1\60\1\u00e9\1\60\1\u00e9"+
		"\7\60\1\uffff\4\60\1\u00dd\1\60\2\u00f7\1\60\1\u00f9\1\60\1\u00f9\2\60"+
		"\1\152\2\60\1\uffff\1\60\1\u0102\2\60\1\u0105\1\uffff\6\60\1\u010c\1\u010d"+
		"\1\uffff\2\60\1\uffff\1\60\1\u010d\1\60\1\u0112\1\60\1\u0112\2\u0114\2"+
		"\u0115\1\60\1\u0105\1\60\1\uffff\1\60\1\uffff\3\60\1\uffff\1\152\1\60"+
		"\2\u011e\1\uffff\2\60\1\uffff\3\60\1\u0124\1\u0125\1\60\2\uffff\1\u0127"+
		"\3\60\1\uffff\1\60\2\uffff\1\u0127\5\60\1\uffff\1\60\1\uffff\5\60\2\uffff"+
		"\1\u0138\1\uffff\2\60\2\u013b\5\60\1\uffff\1\u0142\1\u0143\1\u0144\2\60"+
		"\1\u0147\1\uffff\2\60\1\uffff\5\60\4\uffff\1\u0150\1\60\1\uffff\2\60\1"+
		"\u0150\4\60\2\uffff\1\u0159\4\60\2\u015d\2\uffff\2\60\3\uffff\2\u0162"+
		"\2\uffff\1\u0164\3\uffff\1\u0168\4\uffff\1\u016d\4\uffff\1\u0172\2\uffff";
	static final String DFA32_eofS =
		"\u0174\uffff";
	static final String DFA32_minS =
		"\1\11\1\52\2\uffff\1\156\5\uffff\1\105\1\145\1\117\1\105\1\117\1\116\1"+
		"\101\1\105\1\116\1\110\1\101\1\116\1\156\1\111\1\151\1\150\1\105\1\145"+
		"\1\116\1\162\1\117\1\157\1\122\1\162\1\141\1\145\1\110\1\150\1\101\1\141"+
		"\1\111\1\151\2\uffff\1\56\12\uffff\1\164\1\114\1\122\1\154\2\116\1\113"+
		"\1\106\1\125\1\122\1\111\1\116\1\130\1\122\1\103\1\105\1\116\1\126\1\60"+
		"\1\104\1\60\1\144\1\105\1\117\1\145\1\157\1\145\1\124\1\105\1\60\1\164"+
		"\1\145\4\60\1\124\1\164\1\117\1\157\1\166\1\153\1\146\1\105\1\145\1\126"+
		"\1\111\1\166\1\151\1\107\1\147\1\uffff\1\56\1\uffff\1\145\1\105\1\124"+
		"\1\145\1\116\1\124\1\107\1\111\1\105\1\124\1\102\1\101\1\121\2\60\1\111"+
		"\1\114\1\103\1\122\1\124\1\111\1\uffff\2\60\1\114\1\115\1\154\1\155\1"+
		"\162\1\127\1\101\1\uffff\1\167\1\141\1\105\2\uffff\1\145\2\60\1\125\1"+
		"\165\2\151\1\145\1\164\1\116\1\156\1\101\1\116\1\141\1\156\1\110\1\150"+
		"\1\56\1\162\1\103\1\60\1\143\1\124\1\101\1\137\1\124\1\60\1\137\1\114"+
		"\1\124\1\125\2\uffff\1\117\1\125\1\110\1\105\1\60\1\116\1\uffff\1\104"+
		"\1\60\1\144\1\60\1\145\1\105\1\113\1\145\1\153\1\122\1\162\1\uffff\1\120"+
		"\1\160\1\156\1\164\1\60\1\137\2\60\1\123\1\60\1\163\1\60\1\124\1\164\1"+
		"\55\1\166\1\124\1\uffff\1\164\1\60\1\111\1\123\1\60\1\uffff\1\112\1\105"+
		"\1\111\1\105\2\104\2\60\1\uffff\1\107\1\137\1\uffff\1\137\1\60\1\105\1"+
		"\60\1\145\5\60\1\147\1\60\1\152\1\uffff\1\103\1\uffff\1\143\2\137\1\60"+
		"\1\56\1\141\2\60\1\uffff\1\116\1\125\1\uffff\1\117\1\137\1\117\2\60\1"+
		"\105\2\uffff\1\60\1\101\1\141\1\116\1\uffff\1\156\2\uffff\1\60\1\157\1"+
		"\122\1\162\1\112\1\152\1\60\1\154\1\uffff\1\123\1\115\1\111\1\123\1\116"+
		"\2\uffff\1\60\1\uffff\1\103\1\143\2\60\1\151\1\111\1\151\1\117\1\157\1"+
		"\55\3\60\1\116\1\125\1\60\1\uffff\1\103\1\143\1\uffff\1\156\1\120\1\160"+
		"\1\111\1\151\1\60\3\uffff\1\60\1\115\1\uffff\1\105\1\145\1\60\1\124\1"+
		"\164\1\116\1\156\1\60\1\uffff\1\60\1\123\1\163\2\72\2\60\1\124\1\uffff"+
		"\1\123\1\163\2\uffff\4\60\1\uffff\1\72\1\uffff\2\60\1\72\1\uffff\1\60"+
		"\1\uffff\1\60\1\56\1\uffff\3\60\1\53\2\uffff";
	static final String DFA32_maxS =
		"\1\175\1\52\2\uffff\1\156\5\uffff\1\117\1\145\2\117\1\125\1\116\1\111"+
		"\1\105\1\116\1\110\1\111\1\123\1\163\1\122\1\162\1\150\1\131\1\171\1\122"+
		"\1\162\1\117\1\157\1\122\1\162\1\141\1\151\1\110\1\150\1\117\1\157\1\111"+
		"\1\151\2\uffff\1\71\12\uffff\1\164\1\114\1\122\1\154\1\125\1\116\1\115"+
		"\1\106\1\125\1\122\1\111\1\116\1\130\1\122\1\103\1\111\1\116\1\126\1\172"+
		"\1\104\1\172\1\144\1\105\1\117\1\145\1\157\1\145\1\124\1\105\1\172\1\164"+
		"\1\145\4\172\1\124\1\164\1\117\1\157\1\166\1\155\1\146\1\105\1\145\1\126"+
		"\1\111\1\166\1\151\1\107\1\147\1\uffff\1\71\1\uffff\1\145\1\105\1\124"+
		"\1\145\1\116\1\124\1\107\1\111\1\105\1\124\1\102\1\101\1\121\2\172\1\111"+
		"\1\114\1\103\1\122\1\124\1\111\1\uffff\2\172\1\114\1\115\1\154\1\155\1"+
		"\162\1\127\1\101\1\uffff\1\167\1\141\1\105\2\uffff\1\145\2\172\1\125\1"+
		"\165\2\151\1\145\1\164\1\116\1\156\1\101\1\116\1\141\1\156\1\110\1\150"+
		"\1\71\1\162\1\103\1\172\1\143\1\124\1\101\1\137\1\124\1\172\1\137\1\114"+
		"\1\124\1\125\2\uffff\1\117\1\125\1\110\1\105\1\172\1\116\1\uffff\1\104"+
		"\1\172\1\144\1\172\1\145\1\105\1\113\1\145\1\153\1\122\1\162\1\uffff\1"+
		"\120\1\160\1\156\1\164\1\172\1\137\2\172\1\123\1\172\1\163\1\172\1\124"+
		"\1\164\1\71\1\166\1\124\1\uffff\1\164\1\172\1\111\1\123\1\172\1\uffff"+
		"\1\112\1\105\1\111\1\105\2\104\2\172\1\uffff\1\107\1\137\1\uffff\1\137"+
		"\1\172\1\105\1\172\1\145\5\172\1\147\1\172\1\152\1\uffff\1\103\1\uffff"+
		"\1\143\2\137\2\71\1\141\2\172\1\uffff\1\116\1\125\1\uffff\1\117\1\137"+
		"\1\117\2\172\1\105\2\uffff\1\172\1\101\1\141\1\116\1\uffff\1\156\2\uffff"+
		"\1\172\1\157\1\122\1\162\1\112\1\152\1\71\1\154\1\uffff\1\123\1\115\1"+
		"\111\1\123\1\116\2\uffff\1\172\1\uffff\1\103\1\143\2\172\1\151\1\111\1"+
		"\151\1\117\1\157\1\55\3\172\1\116\1\125\1\172\1\uffff\1\103\1\143\1\uffff"+
		"\1\156\1\120\1\160\1\111\1\151\1\71\3\uffff\1\172\1\115\1\uffff\1\105"+
		"\1\145\1\172\1\124\1\164\1\116\1\156\1\71\1\uffff\1\172\1\123\1\163\2"+
		"\72\2\172\1\124\1\uffff\1\123\1\163\2\uffff\1\71\2\172\1\71\1\uffff\1"+
		"\72\1\uffff\2\71\1\132\1\uffff\1\71\1\uffff\1\71\1\132\1\uffff\3\71\1"+
		"\132\2\uffff";
	static final String DFA32_acceptS =
		"\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\40\uffff\1\56\1\57\1\uffff"+
		"\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\1\1\5\1\2\63\uffff\1\75\1\uffff"+
		"\1\76\25\uffff\1\31\11\uffff\1\45\3\uffff\1\37\1\55\37\uffff\1\20\1\21"+
		"\6\uffff\1\36\13\uffff\1\40\21\uffff\1\27\5\uffff\1\47\10\uffff\1\30\2"+
		"\uffff\1\33\15\uffff\1\50\1\uffff\1\52\10\uffff\1\14\2\uffff\1\46\6\uffff"+
		"\1\25\1\34\4\uffff\1\44\1\uffff\1\42\1\41\10\uffff\1\13\5\uffff\1\17\1"+
		"\23\1\uffff\1\43\20\uffff\1\24\2\uffff\1\35\6\uffff\1\4\1\26\1\15\2\uffff"+
		"\1\22\10\uffff\1\53\10\uffff\1\16\2\uffff\1\51\1\54\4\uffff\1\32\1\uffff"+
		"\1\60\3\uffff\1\61\1\uffff\1\65\2\uffff\1\62\4\uffff\1\63\1\64";
	static final String DFA32_specialS =
		"\u0174\uffff}>";
	static final String[] DFA32_transitionS = {
			"\1\53\1\61\2\uffff\1\61\22\uffff\1\53\1\uffff\1\62\4\uffff\1\63\1\1\1"+
			"\5\1\2\1\55\1\3\1\55\1\uffff\1\55\12\54\1\uffff\1\52\1\57\1\56\1\57\2"+
			"\uffff\1\25\1\32\1\14\1\16\1\60\1\27\1\40\1\24\1\22\1\46\1\60\1\15\1"+
			"\20\1\36\1\34\1\21\1\60\1\50\1\12\1\44\1\17\1\60\1\23\3\60\1\10\1\uffff"+
			"\1\11\1\uffff\1\60\1\uffff\1\26\1\33\3\60\1\30\1\41\1\42\1\4\1\47\1\60"+
			"\1\43\1\60\1\37\1\35\2\60\1\51\1\13\1\45\2\60\1\31\3\60\1\6\1\uffff\1"+
			"\7",
			"\1\64",
			"",
			"",
			"\1\67",
			"",
			"",
			"",
			"",
			"",
			"\1\70\11\uffff\1\71",
			"\1\72",
			"\1\73",
			"\1\76\3\uffff\1\75\5\uffff\1\74",
			"\1\77\5\uffff\1\100",
			"\1\101",
			"\1\103\7\uffff\1\102",
			"\1\104",
			"\1\105",
			"\1\106",
			"\1\110\7\uffff\1\107",
			"\1\112\4\uffff\1\111",
			"\1\114\4\uffff\1\113",
			"\1\115\10\uffff\1\116",
			"\1\117\10\uffff\1\120",
			"\1\121",
			"\1\122\14\uffff\1\123\6\uffff\1\124",
			"\1\125\14\uffff\1\126\6\uffff\1\127",
			"\1\131\3\uffff\1\130",
			"\1\132",
			"\1\133",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\141\3\uffff\1\140",
			"\1\142",
			"\1\143",
			"\1\144\15\uffff\1\145",
			"\1\146\15\uffff\1\147",
			"\1\150",
			"\1\151",
			"",
			"",
			"\1\154\1\uffff\12\153",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\155",
			"\1\156",
			"\1\157",
			"\1\160",
			"\1\162\6\uffff\1\161",
			"\1\163",
			"\1\165\1\uffff\1\164",
			"\1\166",
			"\1\167",
			"\1\170",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\177\3\uffff\1\176",
			"\1\u0080",
			"\1\u0081",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0083",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0084",
			"\1\u0085",
			"\1\u0086",
			"\1\u0087",
			"\1\u0088",
			"\1\u0089",
			"\1\u008a",
			"\1\u008b",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u008d",
			"\1\u008e",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\3\60\1\u008f\26\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u0092\26\60",
			"\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097",
			"\1\u0099\1\uffff\1\u0098",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"",
			"\1\154\1\uffff\12\u00a3",
			"",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00ba",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"",
			"",
			"\1\u00c4",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\154\1\uffff\12\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\1\u00e1",
			"",
			"",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00e7",
			"",
			"\1\u00e8",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00ea",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00eb",
			"\1\u00ec",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00f6",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00f8",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00fa",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd\1\154\1\uffff\12\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"",
			"\1\u0101",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0103",
			"\1\u0104",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\1\u010e",
			"\1\u010f",
			"",
			"\1\u0110",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0111",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0113",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0116",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0117",
			"",
			"\1\u0118",
			"",
			"\1\u0119",
			"\1\u011a",
			"\1\u011b",
			"\12\u011c",
			"\1\154\1\uffff\12\u00fe",
			"\1\u011d",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\1\u011f",
			"\1\u0120",
			"",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0126",
			"",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0128",
			"\1\u0129",
			"\1\u012a",
			"",
			"\1\u012b",
			"",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\12\u0131",
			"\1\u0132",
			"",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\1\u0137",
			"",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\1\u0139",
			"\1\u013a",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0145",
			"\1\u0146",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"",
			"\1\u0148",
			"\1\u0149",
			"",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\1\u014d",
			"\1\u014e",
			"\12\u014f",
			"",
			"",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0151",
			"",
			"\1\u0152",
			"\1\u0153",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u0154",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\12\u0158",
			"",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015c",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\1\u015e",
			"",
			"\1\u015f",
			"\1\u0160",
			"",
			"",
			"\12\u0161",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
			"\12\u0163",
			"",
			"\1\u0165",
			"",
			"\12\u0166",
			"\12\u0167",
			"\1\u0169\37\uffff\1\u016a",
			"",
			"\12\u016b",
			"",
			"\12\u016c",
			"\1\u016e\53\uffff\1\u016a",
			"",
			"\12\u016f",
			"\12\u0170",
			"\12\u0171",
			"\1\u0173\1\uffff\1\u0173\54\uffff\1\u016a",
			"",
			""
	};

	static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
	static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
	static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
	static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
	static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
	static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
	static final short[][] DFA32_transition;

	static {
		int numStates = DFA32_transitionS.length;
		DFA32_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
		}
	}

	protected class DFA32 extends DFA {

		public DFA32(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 32;
			this.eot = DFA32_eot;
			this.eof = DFA32_eof;
			this.min = DFA32_min;
			this.max = DFA32_max;
			this.accept = DFA32_accept;
			this.special = DFA32_special;
			this.transition = DFA32_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__68 | T__69 | T__70 | T__71 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | WS | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | NEWLINE | STRING | SINGLE_QUOTE_STRING | LONG | FLOAT );";
		}
	}

}
