package com.yahoo.sql4d.converter;

// $ANTLR 3.5 /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2014-10-02 21:03:52

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class druidGLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__70=70;
	public static final int T__71=71;
	public static final int T__72=72;
	public static final int T__73=73;
	public static final int AND=4;
	public static final int ARITH_OPER=5;
	public static final int AS=6;
	public static final int ASC=7;
	public static final int BETWEEN=8;
	public static final int BREAK=9;
	public static final int BY=10;
	public static final int COMPARE_OPER=11;
	public static final int CONTAINS=12;
	public static final int COUNT=13;
	public static final int DATE=14;
	public static final int DATE_HOUR=15;
	public static final int DATE_HOUR_MIN=16;
	public static final int DATE_HOUR_MIN_SEC=17;
	public static final int DATE_HOUR_MIN_SEC_SUB=18;
	public static final int DATE_HOUR_MIN_SEC_SUB_TZ=19;
	public static final int DATE_HOUR_MIN_SEC_SUB_UTC_TZ=20;
	public static final int DESC=21;
	public static final int DOUBLE_SUM=22;
	public static final int DURATION=23;
	public static final int EQUALS=24;
	public static final int ESC_SEQ=25;
	public static final int FIELD_ACCESS=26;
	public static final int FLOAT=27;
	public static final int FROM=28;
	public static final int GROUP=29;
	public static final int HAVING=30;
	public static final int HEX_DIGIT=31;
	public static final int HINT=32;
	public static final int ID=33;
	public static final int INCLUDE=34;
	public static final int JAVASCRIPT=35;
	public static final int JOIN=36;
	public static final int LCURLY=37;
	public static final int LEFT_JOIN=38;
	public static final int LIKE=39;
	public static final int LIMIT=40;
	public static final int LONG=41;
	public static final int LONG_SUM=42;
	public static final int LPARAN=43;
	public static final int LSQUARE=44;
	public static final int MAX=45;
	public static final int MIN=46;
	public static final int NEWLINE=47;
	public static final int NOT=48;
	public static final int NUM=49;
	public static final int OCTAL_ESC=50;
	public static final int ON=51;
	public static final int OPT_SEMI_COLON=52;
	public static final int OR=53;
	public static final int ORDER=54;
	public static final int PERIOD=55;
	public static final int RCURLY=56;
	public static final int RIGHT_JOIN=57;
	public static final int RPARAN=58;
	public static final int RSQUARE=59;
	public static final int SELECT=60;
	public static final int SINGLE_QUOTE_STRING=61;
	public static final int SORT=62;
	public static final int STRING=63;
	public static final int THEN=64;
	public static final int UNICODE_ESC=65;
	public static final int UNIQUE=66;
	public static final int WHERE=67;
	public static final int WHICH=68;
	public static final int WS=69;

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
	@Override public String getGrammarFileName() { return "/Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g"; }

	// $ANTLR start "T__70"
	public final void mT__70() throws RecognitionException {
		try {
			int _type = T__70;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:2:7: ( '(*)' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:2:9: '(*)'
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
	// $ANTLR end "T__70"

	// $ANTLR start "T__71"
	public final void mT__71() throws RecognitionException {
		try {
			int _type = T__71;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:3:7: ( '*' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:3:9: '*'
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
	// $ANTLR end "T__71"

	// $ANTLR start "T__72"
	public final void mT__72() throws RecognitionException {
		try {
			int _type = T__72;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:4:7: ( ',' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:4:9: ','
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
	// $ANTLR end "T__72"

	// $ANTLR start "T__73"
	public final void mT__73() throws RecognitionException {
		try {
			int _type = T__73;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:5:7: ( 'interval' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:5:9: 'interval'
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
	// $ANTLR end "T__73"

	// $ANTLR start "LPARAN"
	public final void mLPARAN() throws RecognitionException {
		try {
			int _type = LPARAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:8: ( '(' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:423:11: '('
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:424:8: ( ')' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:424:11: ')'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:425:8: ( '{' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:425:11: '{'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:426:8: ( '}' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:426:11: '}'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:427:9: ( '[' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:427:12: '['
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:9: ( ']' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:428:12: ']'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:9: ( ( 'SELECT' | 'select' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:11: ( 'SELECT' | 'select' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:11: ( 'SELECT' | 'select' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:12: 'SELECT'
					{
					match("SELECT"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:21: 'select'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:433:8: ( ( 'COUNT' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:433:10: ( 'COUNT' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:433:10: ( 'COUNT' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:433:11: 'COUNT'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:434:10: ( ( 'LONG_SUM' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:434:12: ( 'LONG_SUM' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:434:12: ( 'LONG_SUM' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:434:13: 'LONG_SUM'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:435:12: ( ( 'DOUBLE_SUM' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:435:14: ( 'DOUBLE_SUM' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:435:14: ( 'DOUBLE_SUM' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:435:15: 'DOUBLE_SUM'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:436:9: ( ( 'UNIQUE' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:436:11: ( 'UNIQUE' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:436:11: ( 'UNIQUE' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:436:12: 'UNIQUE'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:6: ( ( 'MIN' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:8: ( 'MIN' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:8: ( 'MIN' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:437:9: 'MIN'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:438:5: ( ( 'MAX' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:438:7: ( 'MAX' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:438:7: ( 'MAX' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:438:8: 'MAX'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:440:9: ( ( 'DURATION' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:440:11: ( 'DURATION' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:440:11: ( 'DURATION' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:440:12: 'DURATION'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:441:8: ( ( 'PERIOD' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:441:10: ( 'PERIOD' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:441:10: ( 'PERIOD' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:441:11: 'PERIOD'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:9: ( ( 'INCLUDE' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:11: ( 'INCLUDE' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:11: ( 'INCLUDE' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:442:12: 'INCLUDE'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:444:7: ( ( 'WHICH' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:444:9: ( 'WHICH' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:444:9: ( 'WHICH' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:444:10: 'WHICH'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:445:9: ( ( 'CONTAINS' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:445:11: ( 'CONTAINS' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:445:11: ( 'CONTAINS' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:445:12: 'CONTAINS'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:446:6: ( ( 'SORT' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:446:8: ( 'SORT' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:446:8: ( 'SORT' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:446:9: 'SORT'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:448:6: ( ( 'HINT' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:448:8: ( 'HINT' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:448:8: ( 'HINT' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:448:9: 'HINT'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:450:5: ( ( 'AS' | 'as' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:450:7: ( 'AS' | 'as' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:450:7: ( 'AS' | 'as' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:450:8: 'AS'
					{
					match("AS"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:450:13: 'as'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:451:14: ( ( 'FIELD_ACCESS' | 'field_access' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:451:16: ( 'FIELD_ACCESS' | 'field_access' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:451:16: ( 'FIELD_ACCESS' | 'field_access' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:451:17: 'FIELD_ACCESS'
					{
					match("FIELD_ACCESS"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:451:32: 'field_access'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:452:7: ( ( 'FROM' | 'from' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:452:9: ( 'FROM' | 'from' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:452:9: ( 'FROM' | 'from' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:452:10: 'FROM'
					{
					match("FROM"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:452:17: 'from'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:8: ( ( 'WHERE' | 'where' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:10: ( 'WHERE' | 'where' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:10: ( 'WHERE' | 'where' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:11: 'WHERE'
					{
					match("WHERE"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:453:19: 'where'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:454:9: ( ( 'BETWEEN' | 'between' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:454:11: ( 'BETWEEN' | 'between' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:454:11: ( 'BETWEEN' | 'between' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:454:12: 'BETWEEN'
					{
					match("BETWEEN"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:454:22: 'between'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:455:6: ( ( 'AND' | 'and' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:455:8: ( 'AND' | 'and' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:455:8: ( 'AND' | 'and' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:455:9: 'AND'
					{
					match("AND"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:455:15: 'and'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:5: ( ( 'OR' | 'or' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:7: ( 'OR' | 'or' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:7: ( 'OR' | 'or' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:8: 'OR'
					{
					match("OR"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:456:13: 'or'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:6: ( ( 'NOT' | 'not' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:8: ( 'NOT' | 'not' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:8: ( 'NOT' | 'not' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:9: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:15: 'not'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:458:7: ( ( 'GROUP' | 'group' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:458:9: ( 'GROUP' | 'group' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:458:9: ( 'GROUP' | 'group' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:458:10: 'GROUP'
					{
					match("GROUP"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:458:20: 'group'
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

	// $ANTLR start "ASC"
	public final void mASC() throws RecognitionException {
		try {
			int _type = ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:459:5: ( ( 'ASC' | 'asc' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:459:7: ( 'ASC' | 'asc' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:459:7: ( 'ASC' | 'asc' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='A') ) {
				alt11=1;
			}
			else if ( (LA11_0=='a') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:459:8: 'ASC'
					{
					match("ASC"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:459:16: 'asc'
					{
					match("asc"); 

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
	// $ANTLR end "ASC"

	// $ANTLR start "DESC"
	public final void mDESC() throws RecognitionException {
		try {
			int _type = DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:460:6: ( ( 'DESC' | 'desc' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:460:8: ( 'DESC' | 'desc' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:460:8: ( 'DESC' | 'desc' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='D') ) {
				alt12=1;
			}
			else if ( (LA12_0=='d') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:460:9: 'DESC'
					{
					match("DESC"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:460:18: 'desc'
					{
					match("desc"); 

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
	// $ANTLR end "DESC"

	// $ANTLR start "ORDER"
	public final void mORDER() throws RecognitionException {
		try {
			int _type = ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:461:7: ( ( 'ORDER' | 'order' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:461:9: ( 'ORDER' | 'order' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:461:9: ( 'ORDER' | 'order' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='O') ) {
				alt13=1;
			}
			else if ( (LA13_0=='o') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:461:10: 'ORDER'
					{
					match("ORDER"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:461:20: 'order'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:462:8: ( ( 'HAVING' | 'having' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:462:10: ( 'HAVING' | 'having' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:462:10: ( 'HAVING' | 'having' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='H') ) {
				alt14=1;
			}
			else if ( (LA14_0=='h') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:462:11: 'HAVING'
					{
					match("HAVING"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:462:22: 'having'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:463:7: ( ( 'BREAK' | 'break' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:463:9: ( 'BREAK' | 'break' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:463:9: ( 'BREAK' | 'break' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='B') ) {
				alt15=1;
			}
			else if ( (LA15_0=='b') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:463:10: 'BREAK'
					{
					match("BREAK"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:463:20: 'break'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:4: ( ( 'BY' | 'by' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:6: ( 'BY' | 'by' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:6: ( 'BY' | 'by' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='B') ) {
				alt16=1;
			}
			else if ( (LA16_0=='b') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:7: 'BY'
					{
					match("BY"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:14: 'by'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:466:7: ( ( 'LIMIT' | 'limit' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:466:9: ( 'LIMIT' | 'limit' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:466:9: ( 'LIMIT' | 'limit' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='L') ) {
				alt17=1;
			}
			else if ( (LA17_0=='l') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:466:10: 'LIMIT'
					{
					match("LIMIT"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:466:20: 'limit'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:467:6: ( ( 'LIKE' | 'like' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:467:8: ( 'LIKE' | 'like' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:467:8: ( 'LIKE' | 'like' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='L') ) {
				alt18=1;
			}
			else if ( (LA18_0=='l') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:467:9: 'LIKE'
					{
					match("LIKE"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:467:18: 'like'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:6: ( ( 'THEN' | 'then' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:8: ( 'THEN' | 'then' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:8: ( 'THEN' | 'then' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='T') ) {
				alt19=1;
			}
			else if ( (LA19_0=='t') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:9: 'THEN'
					{
					match("THEN"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:468:18: 'then'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:471:2: ( ( 'JAVASCRIPT:' | 'javascript:' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:471:5: ( 'JAVASCRIPT:' | 'javascript:' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:471:5: ( 'JAVASCRIPT:' | 'javascript:' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='J') ) {
				alt20=1;
			}
			else if ( (LA20_0=='j') ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:471:6: 'JAVASCRIPT:'
					{
					match("JAVASCRIPT:"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:471:21: 'javascript:'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:473:7: ( ( 'JOIN' | 'join' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:473:9: ( 'JOIN' | 'join' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:473:9: ( 'JOIN' | 'join' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='J') ) {
				alt21=1;
			}
			else if ( (LA21_0=='j') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:473:10: 'JOIN'
					{
					match("JOIN"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:473:19: 'join'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:476:12: ( ( 'LEFT_JOIN' | 'left_join' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:476:14: ( 'LEFT_JOIN' | 'left_join' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:476:14: ( 'LEFT_JOIN' | 'left_join' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='L') ) {
				alt22=1;
			}
			else if ( (LA22_0=='l') ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:476:15: 'LEFT_JOIN'
					{
					match("LEFT_JOIN"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:476:29: 'left_join'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:479:13: ( ( 'RIGHT_JOIN' | 'right_join' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:479:15: ( 'RIGHT_JOIN' | 'right_join' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:479:15: ( 'RIGHT_JOIN' | 'right_join' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='R') ) {
				alt23=1;
			}
			else if ( (LA23_0=='r') ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:479:16: 'RIGHT_JOIN'
					{
					match("RIGHT_JOIN"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:479:31: 'right_join'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:482:5: ( ( 'ON' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:482:7: ( 'ON' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:482:7: ( 'ON' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:482:8: 'ON'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:2: ( ';' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:487:4: ';'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:490:2: ( ( ' ' | '\\t' )+ )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:490:4: ( ' ' | '\\t' )+
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:490:4: ( ' ' | '\\t' )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0=='\t'||LA24_0==' ') ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
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
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:2: ( NUM NUM NUM NUM '-' NUM NUM '-' NUM NUM )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:495:4: NUM NUM NUM NUM '-' NUM NUM '-' NUM NUM
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

			state.type = _type;
			state.channel = _channel;
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:498:2: ( DATE 'T' NUM NUM )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:498:4: DATE 'T' NUM NUM
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:501:2: ( DATE_HOUR ':' NUM NUM )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:501:5: DATE_HOUR ':' NUM NUM
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:504:2: ( DATE_HOUR_MIN ':' NUM NUM )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:504:5: DATE_HOUR_MIN ':' NUM NUM
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:507:2: ( DATE_HOUR_MIN_SEC '.' NUM NUM NUM )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:507:5: DATE_HOUR_MIN_SEC '.' NUM NUM NUM
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:510:2: ( DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:510:5: DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:513:2: ( DATE_HOUR_MIN 'Z' | DATE_HOUR_MIN_SEC 'Z' | DATE_HOUR_MIN_SEC_SUB 'Z' )
			int alt25=3;
			int LA25_0 = input.LA(1);
			if ( ((LA25_0 >= '0' && LA25_0 <= '9')) ) {
				int LA25_1 = input.LA(2);
				if ( ((LA25_1 >= '0' && LA25_1 <= '9')) ) {
					int LA25_2 = input.LA(3);
					if ( ((LA25_2 >= '0' && LA25_2 <= '9')) ) {
						int LA25_3 = input.LA(4);
						if ( ((LA25_3 >= '0' && LA25_3 <= '9')) ) {
							int LA25_4 = input.LA(5);
							if ( (LA25_4=='-') ) {
								int LA25_5 = input.LA(6);
								if ( ((LA25_5 >= '0' && LA25_5 <= '9')) ) {
									int LA25_6 = input.LA(7);
									if ( ((LA25_6 >= '0' && LA25_6 <= '9')) ) {
										int LA25_7 = input.LA(8);
										if ( (LA25_7=='-') ) {
											int LA25_8 = input.LA(9);
											if ( ((LA25_8 >= '0' && LA25_8 <= '9')) ) {
												int LA25_9 = input.LA(10);
												if ( ((LA25_9 >= '0' && LA25_9 <= '9')) ) {
													int LA25_10 = input.LA(11);
													if ( (LA25_10=='T') ) {
														int LA25_11 = input.LA(12);
														if ( ((LA25_11 >= '0' && LA25_11 <= '9')) ) {
															int LA25_12 = input.LA(13);
															if ( ((LA25_12 >= '0' && LA25_12 <= '9')) ) {
																int LA25_13 = input.LA(14);
																if ( (LA25_13==':') ) {
																	int LA25_14 = input.LA(15);
																	if ( ((LA25_14 >= '0' && LA25_14 <= '9')) ) {
																		int LA25_15 = input.LA(16);
																		if ( ((LA25_15 >= '0' && LA25_15 <= '9')) ) {
																			int LA25_16 = input.LA(17);
																			if ( (LA25_16=='Z') ) {
																				alt25=1;
																			}
																			else if ( (LA25_16==':') ) {
																				int LA25_18 = input.LA(18);
																				if ( ((LA25_18 >= '0' && LA25_18 <= '9')) ) {
																					int LA25_19 = input.LA(19);
																					if ( ((LA25_19 >= '0' && LA25_19 <= '9')) ) {
																						int LA25_20 = input.LA(20);
																						if ( (LA25_20=='Z') ) {
																							alt25=2;
																						}
																						else if ( (LA25_20=='.') ) {
																							alt25=3;
																						}

																						else {
																							int nvaeMark = input.mark();
																							try {
																								for (int nvaeConsume = 0; nvaeConsume < 20 - 1; nvaeConsume++) {
																									input.consume();
																								}
																								NoViableAltException nvae =
																									new NoViableAltException("", 25, 20, input);
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
																								new NoViableAltException("", 25, 19, input);
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
																							new NoViableAltException("", 25, 18, input);
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
																						new NoViableAltException("", 25, 16, input);
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
																					new NoViableAltException("", 25, 15, input);
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
																				new NoViableAltException("", 25, 14, input);
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
																			new NoViableAltException("", 25, 13, input);
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
																		new NoViableAltException("", 25, 12, input);
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
																	new NoViableAltException("", 25, 11, input);
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
																new NoViableAltException("", 25, 10, input);
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
															new NoViableAltException("", 25, 9, input);
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
														new NoViableAltException("", 25, 8, input);
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
													new NoViableAltException("", 25, 7, input);
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
												new NoViableAltException("", 25, 6, input);
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
											new NoViableAltException("", 25, 5, input);
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
										new NoViableAltException("", 25, 4, input);
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
									new NoViableAltException("", 25, 3, input);
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
								new NoViableAltException("", 25, 2, input);
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
							new NoViableAltException("", 25, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:513:5: DATE_HOUR_MIN 'Z'
					{
					mDATE_HOUR_MIN(); 

					match('Z'); 
					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:514:6: DATE_HOUR_MIN_SEC 'Z'
					{
					mDATE_HOUR_MIN_SEC(); 

					match('Z'); 
					}
					break;
				case 3 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:515:6: DATE_HOUR_MIN_SEC_SUB 'Z'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:518:13: ( ( '*' | '+' | '/' | '-' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:521:9: ( '=' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:521:11: '='
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:523:15: ( ( '<' | '>' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:527:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:527:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:527:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( ((LA26_0 >= '0' && LA26_0 <= '9')||(LA26_0 >= 'A' && LA26_0 <= 'Z')||LA26_0=='_'||(LA26_0 >= 'a' && LA26_0 <= 'z')) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
					break loop26;
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:531:11: ( ( '\\r\\n' | '\\r' | '\\n' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:531:14: ( '\\r\\n' | '\\r' | '\\n' )
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:531:14: ( '\\r\\n' | '\\r' | '\\n' )
			int alt27=3;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='\r') ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1=='\n') ) {
					alt27=1;
				}

				else {
					alt27=2;
				}

			}
			else if ( (LA27_0=='\n') ) {
				alt27=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:531:16: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:532:18: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:533:18: '\\n'
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:540:5: ( '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:540:8: '\"' ( ESC_SEQ |~ ( '\\\\' | '\"' ) )* '\"'
			{
			match('\"'); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:540:12: ( ESC_SEQ |~ ( '\\\\' | '\"' ) )*
			loop28:
			while (true) {
				int alt28=3;
				int LA28_0 = input.LA(1);
				if ( (LA28_0=='\\') ) {
					alt28=1;
				}
				else if ( ((LA28_0 >= '\u0000' && LA28_0 <= '!')||(LA28_0 >= '#' && LA28_0 <= '[')||(LA28_0 >= ']' && LA28_0 <= '\uFFFF')) ) {
					alt28=2;
				}

				switch (alt28) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:540:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:540:24: ~ ( '\\\\' | '\"' )
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
					break loop28;
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:545:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:545:8: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
			{
			match('\''); 
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:545:13: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
			loop29:
			while (true) {
				int alt29=3;
				int LA29_0 = input.LA(1);
				if ( (LA29_0=='\\') ) {
					alt29=1;
				}
				else if ( ((LA29_0 >= '\u0000' && LA29_0 <= '&')||(LA29_0 >= '(' && LA29_0 <= '[')||(LA29_0 >= ']' && LA29_0 <= '\uFFFF')) ) {
					alt29=2;
				}

				switch (alt29) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:545:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:545:24: ~ ( '\\\\' | '\\'' )
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
					break loop29;
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:548:6: ( ( NUM )+ )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:548:8: ( NUM )+
			{
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:548:8: ( NUM )+
			int cnt30=0;
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( ((LA30_0 >= '0' && LA30_0 <= '9')) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
					if ( cnt30 >= 1 ) break loop30;
					EarlyExitException eee = new EarlyExitException(30, input);
					throw eee;
				}
				cnt30++;
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:549:10: ( LONG ( '.' LONG )? )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:549:15: LONG ( '.' LONG )?
			{
			mLONG(); 

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:549:20: ( '.' LONG )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='.') ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:549:21: '.' LONG
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:551:14: ( ( '0' .. '9' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:553:20: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:556:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt32=3;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='\\') ) {
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
					alt32=1;
					}
					break;
				case 'u':
					{
					alt32=2;
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
					alt32=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 32, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:556:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:557:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:9: OCTAL_ESC
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:562:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt33=3;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='\\') ) {
				int LA33_1 = input.LA(2);
				if ( ((LA33_1 >= '0' && LA33_1 <= '3')) ) {
					int LA33_2 = input.LA(3);
					if ( ((LA33_2 >= '0' && LA33_2 <= '7')) ) {
						int LA33_4 = input.LA(4);
						if ( ((LA33_4 >= '0' && LA33_4 <= '7')) ) {
							alt33=1;
						}

						else {
							alt33=2;
						}

					}

					else {
						alt33=3;
					}

				}
				else if ( ((LA33_1 >= '4' && LA33_1 <= '7')) ) {
					int LA33_3 = input.LA(3);
					if ( ((LA33_3 >= '0' && LA33_3 <= '7')) ) {
						alt33=2;
					}

					else {
						alt33=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:562:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:563:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:564:9: '\\\\' ( '0' .. '7' )
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:568:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:568:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
		// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:8: ( T__70 | T__71 | T__72 | T__73 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ASC | DESC | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | WS | DATE | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | NEWLINE | STRING | SINGLE_QUOTE_STRING | LONG | FLOAT )
		int alt34=65;
		alt34 = dfa34.predict(input);
		switch (alt34) {
			case 1 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:10: T__70
				{
				mT__70(); 

				}
				break;
			case 2 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:16: T__71
				{
				mT__71(); 

				}
				break;
			case 3 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:22: T__72
				{
				mT__72(); 

				}
				break;
			case 4 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:28: T__73
				{
				mT__73(); 

				}
				break;
			case 5 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:34: LPARAN
				{
				mLPARAN(); 

				}
				break;
			case 6 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:41: RPARAN
				{
				mRPARAN(); 

				}
				break;
			case 7 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:48: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 8 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:55: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 9 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:62: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 10 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:70: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 11 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:78: SELECT
				{
				mSELECT(); 

				}
				break;
			case 12 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:85: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 13 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:91: LONG_SUM
				{
				mLONG_SUM(); 

				}
				break;
			case 14 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:100: DOUBLE_SUM
				{
				mDOUBLE_SUM(); 

				}
				break;
			case 15 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:111: UNIQUE
				{
				mUNIQUE(); 

				}
				break;
			case 16 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:118: MIN
				{
				mMIN(); 

				}
				break;
			case 17 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:122: MAX
				{
				mMAX(); 

				}
				break;
			case 18 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:126: DURATION
				{
				mDURATION(); 

				}
				break;
			case 19 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:135: PERIOD
				{
				mPERIOD(); 

				}
				break;
			case 20 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:142: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 21 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:150: WHICH
				{
				mWHICH(); 

				}
				break;
			case 22 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:156: CONTAINS
				{
				mCONTAINS(); 

				}
				break;
			case 23 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:165: SORT
				{
				mSORT(); 

				}
				break;
			case 24 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:170: HINT
				{
				mHINT(); 

				}
				break;
			case 25 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:175: AS
				{
				mAS(); 

				}
				break;
			case 26 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:178: FIELD_ACCESS
				{
				mFIELD_ACCESS(); 

				}
				break;
			case 27 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:191: FROM
				{
				mFROM(); 

				}
				break;
			case 28 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:196: WHERE
				{
				mWHERE(); 

				}
				break;
			case 29 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:202: BETWEEN
				{
				mBETWEEN(); 

				}
				break;
			case 30 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:210: AND
				{
				mAND(); 

				}
				break;
			case 31 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:214: OR
				{
				mOR(); 

				}
				break;
			case 32 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:217: NOT
				{
				mNOT(); 

				}
				break;
			case 33 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:221: GROUP
				{
				mGROUP(); 

				}
				break;
			case 34 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:227: ASC
				{
				mASC(); 

				}
				break;
			case 35 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:231: DESC
				{
				mDESC(); 

				}
				break;
			case 36 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:236: ORDER
				{
				mORDER(); 

				}
				break;
			case 37 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:242: HAVING
				{
				mHAVING(); 

				}
				break;
			case 38 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:249: BREAK
				{
				mBREAK(); 

				}
				break;
			case 39 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:255: BY
				{
				mBY(); 

				}
				break;
			case 40 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:258: LIMIT
				{
				mLIMIT(); 

				}
				break;
			case 41 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:264: LIKE
				{
				mLIKE(); 

				}
				break;
			case 42 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:269: THEN
				{
				mTHEN(); 

				}
				break;
			case 43 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:274: JAVASCRIPT
				{
				mJAVASCRIPT(); 

				}
				break;
			case 44 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:285: JOIN
				{
				mJOIN(); 

				}
				break;
			case 45 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:290: LEFT_JOIN
				{
				mLEFT_JOIN(); 

				}
				break;
			case 46 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:300: RIGHT_JOIN
				{
				mRIGHT_JOIN(); 

				}
				break;
			case 47 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:311: ON
				{
				mON(); 

				}
				break;
			case 48 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:314: OPT_SEMI_COLON
				{
				mOPT_SEMI_COLON(); 

				}
				break;
			case 49 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:329: WS
				{
				mWS(); 

				}
				break;
			case 50 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:332: DATE
				{
				mDATE(); 

				}
				break;
			case 51 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:337: DATE_HOUR
				{
				mDATE_HOUR(); 

				}
				break;
			case 52 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:347: DATE_HOUR_MIN
				{
				mDATE_HOUR_MIN(); 

				}
				break;
			case 53 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:361: DATE_HOUR_MIN_SEC
				{
				mDATE_HOUR_MIN_SEC(); 

				}
				break;
			case 54 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:379: DATE_HOUR_MIN_SEC_SUB
				{
				mDATE_HOUR_MIN_SEC_SUB(); 

				}
				break;
			case 55 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:401: DATE_HOUR_MIN_SEC_SUB_TZ
				{
				mDATE_HOUR_MIN_SEC_SUB_TZ(); 

				}
				break;
			case 56 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:426: DATE_HOUR_MIN_SEC_SUB_UTC_TZ
				{
				mDATE_HOUR_MIN_SEC_SUB_UTC_TZ(); 

				}
				break;
			case 57 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:455: ARITH_OPER
				{
				mARITH_OPER(); 

				}
				break;
			case 58 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:466: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 59 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:473: COMPARE_OPER
				{
				mCOMPARE_OPER(); 

				}
				break;
			case 60 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:486: ID
				{
				mID(); 

				}
				break;
			case 61 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:489: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 62 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:497: STRING
				{
				mSTRING(); 

				}
				break;
			case 63 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:504: SINGLE_QUOTE_STRING
				{
				mSINGLE_QUOTE_STRING(); 

				}
				break;
			case 64 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:524: LONG
				{
				mLONG(); 

				}
				break;
			case 65 :
				// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:529: FLOAT
				{
				mFLOAT(); 

				}
				break;

		}
	}


	protected DFA34 dfa34 = new DFA34(this);
	static final String DFA34_eotS =
		"\1\uffff\1\66\2\uffff\1\61\5\uffff\41\61\2\uffff\1\155\12\uffff\23\61"+
		"\1\u0087\1\61\1\u0087\10\61\1\u0092\2\61\1\u0092\1\u0096\1\u0097\1\u0096"+
		"\20\61\1\uffff\1\155\1\uffff\16\61\1\u00b9\1\u00ba\6\61\1\u00c1\1\uffff"+
		"\1\u00c2\1\u00c1\1\u00c2\7\61\1\uffff\3\61\2\uffff\1\61\2\u00ce\17\61"+
		"\1\155\2\61\1\u00e1\5\61\1\u00e7\3\61\1\u00eb\1\61\2\uffff\4\61\1\u00f1"+
		"\1\61\2\uffff\1\61\1\u00f4\1\61\1\u00f4\7\61\1\uffff\2\61\1\u00eb\2\61"+
		"\1\u00e7\1\61\2\u0102\1\61\1\u0104\1\61\1\u0104\2\61\1\155\2\61\1\uffff"+
		"\1\61\1\u010d\2\61\1\u0110\1\uffff\3\61\1\uffff\3\61\1\u0117\1\u0118\1"+
		"\uffff\2\61\1\uffff\1\61\1\u0118\1\61\1\u011d\1\61\1\u011d\2\u011f\2\u0120"+
		"\1\61\1\u0110\1\61\1\uffff\1\61\1\uffff\3\61\1\uffff\1\155\1\61\2\u0129"+
		"\1\uffff\2\61\1\uffff\3\61\1\u012f\1\u0130\1\61\2\uffff\1\u0132\3\61\1"+
		"\uffff\1\61\2\uffff\1\u0132\5\61\1\uffff\1\61\1\uffff\5\61\2\uffff\1\u0143"+
		"\1\uffff\2\61\2\u0146\5\61\1\uffff\1\u014d\1\u014e\1\u014f\2\61\1\u0152"+
		"\1\uffff\2\61\1\uffff\5\61\4\uffff\1\u015b\1\61\1\uffff\2\61\1\u015b\4"+
		"\61\2\uffff\1\u0164\4\61\2\u0168\1\u0169\1\uffff\2\61\4\uffff\2\u016e"+
		"\2\uffff\1\u0170\3\uffff\1\u0174\4\uffff\1\u0179\4\uffff\1\u017e\2\uffff";
	static final String DFA34_eofS =
		"\u0180\uffff";
	static final String DFA34_minS =
		"\1\11\1\52\2\uffff\1\156\5\uffff\1\105\1\145\1\117\2\105\1\116\1\101\1"+
		"\105\1\116\1\110\1\101\1\116\1\156\1\111\1\151\1\150\1\105\1\145\1\116"+
		"\1\162\1\117\1\157\1\122\1\162\1\145\1\141\1\145\1\110\1\150\1\101\1\141"+
		"\1\111\1\151\2\uffff\1\56\12\uffff\1\164\1\114\1\122\1\154\2\116\1\113"+
		"\1\106\1\125\1\122\1\123\1\111\1\116\1\130\1\122\1\103\1\105\1\116\1\126"+
		"\1\60\1\104\1\60\1\144\1\105\1\117\1\145\1\157\1\145\1\124\1\105\1\60"+
		"\1\164\1\145\4\60\1\124\1\164\1\117\1\157\1\163\1\166\1\153\1\146\1\105"+
		"\1\145\1\126\1\111\1\166\1\151\1\107\1\147\1\uffff\1\56\1\uffff\1\145"+
		"\1\105\1\124\1\145\1\116\1\124\1\107\1\111\1\105\1\124\1\102\1\101\1\103"+
		"\1\121\2\60\1\111\1\114\1\103\1\122\1\124\1\111\1\60\1\uffff\3\60\1\114"+
		"\1\115\1\154\1\155\1\162\1\127\1\101\1\uffff\1\167\1\141\1\105\2\uffff"+
		"\1\145\2\60\1\125\1\165\1\143\2\151\1\145\1\164\1\116\1\156\1\101\1\116"+
		"\1\141\1\156\1\110\1\150\1\56\1\162\1\103\1\60\1\143\1\124\1\101\1\137"+
		"\1\124\1\60\1\137\1\114\1\124\1\60\1\125\2\uffff\1\117\1\125\1\110\1\105"+
		"\1\60\1\116\2\uffff\1\104\1\60\1\144\1\60\1\145\1\105\1\113\1\145\1\153"+
		"\1\122\1\162\1\uffff\1\120\1\160\1\60\1\156\1\164\1\60\1\137\2\60\1\123"+
		"\1\60\1\163\1\60\1\124\1\164\1\55\1\166\1\124\1\uffff\1\164\1\60\1\111"+
		"\1\123\1\60\1\uffff\1\112\1\105\1\111\1\uffff\1\105\2\104\2\60\1\uffff"+
		"\1\107\1\137\1\uffff\1\137\1\60\1\105\1\60\1\145\5\60\1\147\1\60\1\152"+
		"\1\uffff\1\103\1\uffff\1\143\2\137\1\60\1\56\1\141\2\60\1\uffff\1\116"+
		"\1\125\1\uffff\1\117\1\137\1\117\2\60\1\105\2\uffff\1\60\1\101\1\141\1"+
		"\116\1\uffff\1\156\2\uffff\1\60\1\157\1\122\1\162\1\112\1\152\1\60\1\154"+
		"\1\uffff\1\123\1\115\1\111\1\123\1\116\2\uffff\1\60\1\uffff\1\103\1\143"+
		"\2\60\1\151\1\111\1\151\1\117\1\157\1\55\3\60\1\116\1\125\1\60\1\uffff"+
		"\1\103\1\143\1\uffff\1\156\1\120\1\160\1\111\1\151\1\60\3\uffff\1\60\1"+
		"\115\1\uffff\1\105\1\145\1\60\1\124\1\164\1\116\1\156\1\60\1\uffff\1\60"+
		"\1\123\1\163\2\72\2\60\1\124\1\uffff\1\123\1\163\3\uffff\4\60\1\uffff"+
		"\1\72\1\uffff\2\60\1\72\1\uffff\1\60\1\uffff\1\60\1\56\1\uffff\3\60\1"+
		"\53\2\uffff";
	static final String DFA34_maxS =
		"\1\175\1\52\2\uffff\1\156\5\uffff\1\117\1\145\2\117\1\125\1\116\1\111"+
		"\1\105\1\116\1\110\1\111\1\123\1\163\1\122\1\162\1\150\1\131\1\171\1\122"+
		"\1\162\1\117\1\157\1\122\1\162\1\145\1\141\1\151\1\110\1\150\1\117\1\157"+
		"\1\111\1\151\2\uffff\1\71\12\uffff\1\164\1\114\1\122\1\154\1\125\1\116"+
		"\1\115\1\106\1\125\1\122\1\123\1\111\1\116\1\130\1\122\1\103\1\111\1\116"+
		"\1\126\1\172\1\104\1\172\1\144\1\105\1\117\1\145\1\157\1\145\1\124\1\105"+
		"\1\172\1\164\1\145\4\172\1\124\1\164\1\117\1\157\1\163\1\166\1\155\1\146"+
		"\1\105\1\145\1\126\1\111\1\166\1\151\1\107\1\147\1\uffff\1\71\1\uffff"+
		"\1\145\1\105\1\124\1\145\1\116\1\124\1\107\1\111\1\105\1\124\1\102\1\101"+
		"\1\103\1\121\2\172\1\111\1\114\1\103\1\122\1\124\1\111\1\172\1\uffff\3"+
		"\172\1\114\1\115\1\154\1\155\1\162\1\127\1\101\1\uffff\1\167\1\141\1\105"+
		"\2\uffff\1\145\2\172\1\125\1\165\1\143\2\151\1\145\1\164\1\116\1\156\1"+
		"\101\1\116\1\141\1\156\1\110\1\150\1\71\1\162\1\103\1\172\1\143\1\124"+
		"\1\101\1\137\1\124\1\172\1\137\1\114\1\124\1\172\1\125\2\uffff\1\117\1"+
		"\125\1\110\1\105\1\172\1\116\2\uffff\1\104\1\172\1\144\1\172\1\145\1\105"+
		"\1\113\1\145\1\153\1\122\1\162\1\uffff\1\120\1\160\1\172\1\156\1\164\1"+
		"\172\1\137\2\172\1\123\1\172\1\163\1\172\1\124\1\164\1\71\1\166\1\124"+
		"\1\uffff\1\164\1\172\1\111\1\123\1\172\1\uffff\1\112\1\105\1\111\1\uffff"+
		"\1\105\2\104\2\172\1\uffff\1\107\1\137\1\uffff\1\137\1\172\1\105\1\172"+
		"\1\145\5\172\1\147\1\172\1\152\1\uffff\1\103\1\uffff\1\143\2\137\2\71"+
		"\1\141\2\172\1\uffff\1\116\1\125\1\uffff\1\117\1\137\1\117\2\172\1\105"+
		"\2\uffff\1\172\1\101\1\141\1\116\1\uffff\1\156\2\uffff\1\172\1\157\1\122"+
		"\1\162\1\112\1\152\1\71\1\154\1\uffff\1\123\1\115\1\111\1\123\1\116\2"+
		"\uffff\1\172\1\uffff\1\103\1\143\2\172\1\151\1\111\1\151\1\117\1\157\1"+
		"\55\3\172\1\116\1\125\1\172\1\uffff\1\103\1\143\1\uffff\1\156\1\120\1"+
		"\160\1\111\1\151\1\71\3\uffff\1\172\1\115\1\uffff\1\105\1\145\1\172\1"+
		"\124\1\164\1\116\1\156\1\71\1\uffff\1\172\1\123\1\163\2\72\2\172\1\124"+
		"\1\uffff\1\123\1\163\3\uffff\1\71\2\172\1\71\1\uffff\1\72\1\uffff\2\71"+
		"\1\132\1\uffff\1\71\1\uffff\1\71\1\132\1\uffff\3\71\1\132\2\uffff";
	static final String DFA34_acceptS =
		"\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\41\uffff\1\60\1\61\1\uffff"+
		"\1\71\1\72\1\73\1\74\1\75\1\76\1\77\1\1\1\5\1\2\65\uffff\1\100\1\uffff"+
		"\1\101\27\uffff\1\31\12\uffff\1\47\3\uffff\1\37\1\57\41\uffff\1\20\1\21"+
		"\6\uffff\1\42\1\36\13\uffff\1\40\22\uffff\1\27\5\uffff\1\51\3\uffff\1"+
		"\43\5\uffff\1\30\2\uffff\1\33\15\uffff\1\52\1\uffff\1\54\10\uffff\1\14"+
		"\2\uffff\1\50\6\uffff\1\25\1\34\4\uffff\1\46\1\uffff\1\44\1\41\10\uffff"+
		"\1\13\5\uffff\1\17\1\23\1\uffff\1\45\20\uffff\1\24\2\uffff\1\35\6\uffff"+
		"\1\4\1\26\1\15\2\uffff\1\22\10\uffff\1\55\10\uffff\1\16\2\uffff\1\53\1"+
		"\56\1\62\4\uffff\1\32\1\uffff\1\63\3\uffff\1\64\1\uffff\1\70\2\uffff\1"+
		"\65\4\uffff\1\66\1\67";
	static final String DFA34_specialS =
		"\u0180\uffff}>";
	static final String[] DFA34_transitionS = {
			"\1\54\1\62\2\uffff\1\62\22\uffff\1\54\1\uffff\1\63\4\uffff\1\64\1\1\1"+
			"\5\1\2\1\56\1\3\1\56\1\uffff\1\56\12\55\1\uffff\1\53\1\60\1\57\1\60\2"+
			"\uffff\1\25\1\32\1\14\1\16\1\61\1\27\1\40\1\24\1\22\1\47\1\61\1\15\1"+
			"\20\1\36\1\34\1\21\1\61\1\51\1\12\1\45\1\17\1\61\1\23\3\61\1\10\1\uffff"+
			"\1\11\1\uffff\1\61\1\uffff\1\26\1\33\1\61\1\42\1\61\1\30\1\41\1\43\1"+
			"\4\1\50\1\61\1\44\1\61\1\37\1\35\2\61\1\52\1\13\1\46\2\61\1\31\3\61\1"+
			"\6\1\uffff\1\7",
			"\1\65",
			"",
			"",
			"\1\70",
			"",
			"",
			"",
			"",
			"",
			"\1\71\11\uffff\1\72",
			"\1\73",
			"\1\74",
			"\1\77\3\uffff\1\76\5\uffff\1\75",
			"\1\102\11\uffff\1\100\5\uffff\1\101",
			"\1\103",
			"\1\105\7\uffff\1\104",
			"\1\106",
			"\1\107",
			"\1\110",
			"\1\112\7\uffff\1\111",
			"\1\114\4\uffff\1\113",
			"\1\116\4\uffff\1\115",
			"\1\117\10\uffff\1\120",
			"\1\121\10\uffff\1\122",
			"\1\123",
			"\1\124\14\uffff\1\125\6\uffff\1\126",
			"\1\127\14\uffff\1\130\6\uffff\1\131",
			"\1\133\3\uffff\1\132",
			"\1\134",
			"\1\135",
			"\1\136",
			"\1\137",
			"\1\140",
			"\1\141",
			"\1\142",
			"\1\144\3\uffff\1\143",
			"\1\145",
			"\1\146",
			"\1\147\15\uffff\1\150",
			"\1\151\15\uffff\1\152",
			"\1\153",
			"\1\154",
			"",
			"",
			"\1\157\1\uffff\12\156",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\160",
			"\1\161",
			"\1\162",
			"\1\163",
			"\1\165\6\uffff\1\164",
			"\1\166",
			"\1\170\1\uffff\1\167",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\177",
			"\1\u0080",
			"\1\u0081",
			"\1\u0083\3\uffff\1\u0082",
			"\1\u0084",
			"\1\u0085",
			"\12\61\7\uffff\2\61\1\u0086\27\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0088",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\2\61\1\u0089\27\61",
			"\1\u008a",
			"\1\u008b",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0093",
			"\1\u0094",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\3\61\1\u0095\26\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\3\61\1\u0098\26\61",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u00a0\1\uffff\1\u009f",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"",
			"\1\157\1\uffff\12\u00aa",
			"",
			"\1\u00ab",
			"\1\u00ac",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00af",
			"\1\u00b0",
			"\1\u00b1",
			"\1\u00b2",
			"\1\u00b3",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00bb",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00c3",
			"\1\u00c4",
			"\1\u00c5",
			"\1\u00c6",
			"\1\u00c7",
			"\1\u00c8",
			"\1\u00c9",
			"",
			"\1\u00ca",
			"\1\u00cb",
			"\1\u00cc",
			"",
			"",
			"\1\u00cd",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00cf",
			"\1\u00d0",
			"\1\u00d1",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\157\1\uffff\12\u00de",
			"\1\u00df",
			"\1\u00e0",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00e2",
			"\1\u00e3",
			"\1\u00e4",
			"\1\u00e5",
			"\1\u00e6",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00ec",
			"",
			"",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00f2",
			"",
			"",
			"\1\u00f3",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00f5",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"",
			"\1\u00fd",
			"\1\u00fe",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u00ff",
			"\1\u0100",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0101",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0103",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0105",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108\1\157\1\uffff\12\u0109",
			"\1\u010a",
			"\1\u010b",
			"",
			"\1\u010c",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u010e",
			"\1\u010f",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"",
			"\1\u0114",
			"\1\u0115",
			"\1\u0116",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u0119",
			"\1\u011a",
			"",
			"\1\u011b",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u011c",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u011e",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0121",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0122",
			"",
			"\1\u0123",
			"",
			"\1\u0124",
			"\1\u0125",
			"\1\u0126",
			"\12\u0127",
			"\1\157\1\uffff\12\u0109",
			"\1\u0128",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u012a",
			"\1\u012b",
			"",
			"\1\u012c",
			"\1\u012d",
			"\1\u012e",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0131",
			"",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"",
			"\1\u0136",
			"",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\12\u013c",
			"\1\u013d",
			"",
			"\1\u013e",
			"\1\u013f",
			"\1\u0140",
			"\1\u0141",
			"\1\u0142",
			"",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u0144",
			"\1\u0145",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\1\u014c",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0150",
			"\1\u0151",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"",
			"\1\u0153",
			"\1\u0154",
			"",
			"\1\u0155",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\12\u015a",
			"",
			"",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u015c",
			"",
			"\1\u015d",
			"\1\u015e",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\12\u0163",
			"",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u0165",
			"\1\u0166",
			"\1\u0167",
			"\1\u0167",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\1\u016a",
			"",
			"\1\u016b",
			"\1\u016c",
			"",
			"",
			"",
			"\12\u016d",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\61\7\uffff\32\61\4\uffff\1\61\1\uffff\32\61",
			"\12\u016f",
			"",
			"\1\u0171",
			"",
			"\12\u0172",
			"\12\u0173",
			"\1\u0175\37\uffff\1\u0176",
			"",
			"\12\u0177",
			"",
			"\12\u0178",
			"\1\u017a\53\uffff\1\u0176",
			"",
			"\12\u017b",
			"\12\u017c",
			"\12\u017d",
			"\1\u017f\1\uffff\1\u017f\54\uffff\1\u0176",
			"",
			""
	};

	static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
	static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
	static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
	static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
	static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
	static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
	static final short[][] DFA34_transition;

	static {
		int numStates = DFA34_transitionS.length;
		DFA34_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
		}
	}

	protected class DFA34 extends DFA {

		public DFA34(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 34;
			this.eot = DFA34_eot;
			this.eof = DFA34_eof;
			this.min = DFA34_min;
			this.max = DFA34_max;
			this.accept = DFA34_accept;
			this.special = DFA34_special;
			this.transition = DFA34_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__70 | T__71 | T__72 | T__73 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ASC | DESC | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | WS | DATE | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | NEWLINE | STRING | SINGLE_QUOTE_STRING | LONG | FLOAT );";
		}
	}

}
