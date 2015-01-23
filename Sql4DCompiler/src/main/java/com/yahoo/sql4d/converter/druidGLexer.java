// $ANTLR 3.5.2 druidG.g 2015-01-22 18:57:53

	package com.yahoo.sql4d.converter;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class druidGLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "druidG.g"; }

	// $ANTLR start "T__89"
	public final void mT__89() throws RecognitionException {
		try {
			int _type = T__89;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:6:7: ( '(*)' )
			// druidG.g:6:9: '(*)'
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
	// $ANTLR end "T__89"

	// $ANTLR start "T__90"
	public final void mT__90() throws RecognitionException {
		try {
			int _type = T__90;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:7:7: ( '*' )
			// druidG.g:7:9: '*'
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
	// $ANTLR end "T__90"

	// $ANTLR start "T__91"
	public final void mT__91() throws RecognitionException {
		try {
			int _type = T__91;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:8:7: ( ',' )
			// druidG.g:8:9: ','
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
	// $ANTLR end "T__91"

	// $ANTLR start "T__92"
	public final void mT__92() throws RecognitionException {
		try {
			int _type = T__92;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:9:7: ( 'interval' )
			// druidG.g:9:9: 'interval'
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
	// $ANTLR end "T__92"

	// $ANTLR start "LPARAN"
	public final void mLPARAN() throws RecognitionException {
		try {
			int _type = LPARAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:552:8: ( '(' )
			// druidG.g:552:11: '('
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
			// druidG.g:553:8: ( ')' )
			// druidG.g:553:11: ')'
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
			// druidG.g:554:8: ( '{' )
			// druidG.g:554:11: '{'
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
			// druidG.g:555:8: ( '}' )
			// druidG.g:555:11: '}'
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
			// druidG.g:556:9: ( '[' )
			// druidG.g:556:12: '['
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
			// druidG.g:557:9: ( ']' )
			// druidG.g:557:12: ']'
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

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:560:11: ( ( 'INSERT' | 'insert' ) )
			// druidG.g:560:12: ( 'INSERT' | 'insert' )
			{
			// druidG.g:560:12: ( 'INSERT' | 'insert' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='I') ) {
				alt1=1;
			}
			else if ( (LA1_0=='i') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// druidG.g:560:13: 'INSERT'
					{
					match("INSERT"); 

					}
					break;
				case 2 :
					// druidG.g:560:22: 'insert'
					{
					match("insert"); 

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
	// $ANTLR end "INSERT"

	// $ANTLR start "INSERT_HADOOP"
	public final void mINSERT_HADOOP() throws RecognitionException {
		try {
			int _type = INSERT_HADOOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:561:15: ( ( 'INSERT_HADOOP' | 'insert_hadoop' ) )
			// druidG.g:561:16: ( 'INSERT_HADOOP' | 'insert_hadoop' )
			{
			// druidG.g:561:16: ( 'INSERT_HADOOP' | 'insert_hadoop' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='I') ) {
				alt2=1;
			}
			else if ( (LA2_0=='i') ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// druidG.g:561:17: 'INSERT_HADOOP'
					{
					match("INSERT_HADOOP"); 

					}
					break;
				case 2 :
					// druidG.g:561:33: 'insert_hadoop'
					{
					match("insert_hadoop"); 

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
	// $ANTLR end "INSERT_HADOOP"

	// $ANTLR start "INSERT_REALTIME"
	public final void mINSERT_REALTIME() throws RecognitionException {
		try {
			int _type = INSERT_REALTIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:562:17: ( ( 'INSERT_REALTIME' | 'insert_realtime' ) )
			// druidG.g:562:18: ( 'INSERT_REALTIME' | 'insert_realtime' )
			{
			// druidG.g:562:18: ( 'INSERT_REALTIME' | 'insert_realtime' )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='I') ) {
				alt3=1;
			}
			else if ( (LA3_0=='i') ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// druidG.g:562:19: 'INSERT_REALTIME'
					{
					match("INSERT_REALTIME"); 

					}
					break;
				case 2 :
					// druidG.g:562:37: 'insert_realtime'
					{
					match("insert_realtime"); 

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
	// $ANTLR end "INSERT_REALTIME"

	// $ANTLR start "INTO"
	public final void mINTO() throws RecognitionException {
		try {
			int _type = INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:563:15: ( ( 'INTO' | 'into' ) )
			// druidG.g:563:16: ( 'INTO' | 'into' )
			{
			// druidG.g:563:16: ( 'INTO' | 'into' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='I') ) {
				alt4=1;
			}
			else if ( (LA4_0=='i') ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// druidG.g:563:17: 'INTO'
					{
					match("INTO"); 

					}
					break;
				case 2 :
					// druidG.g:563:24: 'into'
					{
					match("into"); 

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
	// $ANTLR end "INTO"

	// $ANTLR start "VALUES"
	public final void mVALUES() throws RecognitionException {
		try {
			int _type = VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:564:17: ( ( 'VALUES' | 'values' ) )
			// druidG.g:564:18: ( 'VALUES' | 'values' )
			{
			// druidG.g:564:18: ( 'VALUES' | 'values' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='V') ) {
				alt5=1;
			}
			else if ( (LA5_0=='v') ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// druidG.g:564:19: 'VALUES'
					{
					match("VALUES"); 

					}
					break;
				case 2 :
					// druidG.g:564:28: 'values'
					{
					match("values"); 

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
	// $ANTLR end "VALUES"

	// $ANTLR start "MAX_WINDOW"
	public final void mMAX_WINDOW() throws RecognitionException {
		try {
			int _type = MAX_WINDOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:567:17: ( ( 'MAX_WINDOW' | 'max_window' ) )
			// druidG.g:567:18: ( 'MAX_WINDOW' | 'max_window' )
			{
			// druidG.g:567:18: ( 'MAX_WINDOW' | 'max_window' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='M') ) {
				alt6=1;
			}
			else if ( (LA6_0=='m') ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// druidG.g:567:19: 'MAX_WINDOW'
					{
					match("MAX_WINDOW"); 

					}
					break;
				case 2 :
					// druidG.g:567:32: 'max_window'
					{
					match("max_window"); 

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
	// $ANTLR end "MAX_WINDOW"

	// $ANTLR start "DELIMITER"
	public final void mDELIMITER() throws RecognitionException {
		try {
			int _type = DELIMITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:569:17: ( ( 'DELIMITER' | 'delimiter' ) )
			// druidG.g:569:18: ( 'DELIMITER' | 'delimiter' )
			{
			// druidG.g:569:18: ( 'DELIMITER' | 'delimiter' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='D') ) {
				alt7=1;
			}
			else if ( (LA7_0=='d') ) {
				alt7=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// druidG.g:569:19: 'DELIMITER'
					{
					match("DELIMITER"); 

					}
					break;
				case 2 :
					// druidG.g:569:31: 'delimiter'
					{
					match("delimiter"); 

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
	// $ANTLR end "DELIMITER"

	// $ANTLR start "PARTITION"
	public final void mPARTITION() throws RecognitionException {
		try {
			int _type = PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:570:17: ( ( 'PARTITION' | 'partition' ) )
			// druidG.g:570:18: ( 'PARTITION' | 'partition' )
			{
			// druidG.g:570:18: ( 'PARTITION' | 'partition' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='P') ) {
				alt8=1;
			}
			else if ( (LA8_0=='p') ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// druidG.g:570:19: 'PARTITION'
					{
					match("PARTITION"); 

					}
					break;
				case 2 :
					// druidG.g:570:31: 'partition'
					{
					match("partition"); 

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
	// $ANTLR end "PARTITION"

	// $ANTLR start "ROLLUP"
	public final void mROLLUP() throws RecognitionException {
		try {
			int _type = ROLLUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:571:17: ( ( 'ROLLUP' | 'rollup' ) )
			// druidG.g:571:18: ( 'ROLLUP' | 'rollup' )
			{
			// druidG.g:571:18: ( 'ROLLUP' | 'rollup' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='R') ) {
				alt9=1;
			}
			else if ( (LA9_0=='r') ) {
				alt9=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// druidG.g:571:19: 'ROLLUP'
					{
					match("ROLLUP"); 

					}
					break;
				case 2 :
					// druidG.g:571:31: 'rollup'
					{
					match("rollup"); 

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
	// $ANTLR end "ROLLUP"

	// $ANTLR start "DROP"
	public final void mDROP() throws RecognitionException {
		try {
			int _type = DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:573:17: ( ( 'DROP' | 'drop' ) )
			// druidG.g:573:18: ( 'DROP' | 'drop' )
			{
			// druidG.g:573:18: ( 'DROP' | 'drop' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='D') ) {
				alt10=1;
			}
			else if ( (LA10_0=='d') ) {
				alt10=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// druidG.g:573:19: 'DROP'
					{
					match("DROP"); 

					}
					break;
				case 2 :
					// druidG.g:573:26: 'drop'
					{
					match("drop"); 

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
	// $ANTLR end "DROP"

	// $ANTLR start "TABLE"
	public final void mTABLE() throws RecognitionException {
		try {
			int _type = TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:574:17: ( ( 'TABLE' | 'table' ) )
			// druidG.g:574:18: ( 'TABLE' | 'table' )
			{
			// druidG.g:574:18: ( 'TABLE' | 'table' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='T') ) {
				alt11=1;
			}
			else if ( (LA11_0=='t') ) {
				alt11=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// druidG.g:574:19: 'TABLE'
					{
					match("TABLE"); 

					}
					break;
				case 2 :
					// druidG.g:574:27: 'table'
					{
					match("table"); 

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
	// $ANTLR end "TABLE"

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:575:17: ( ( 'DELETE' | 'delete' ) )
			// druidG.g:575:18: ( 'DELETE' | 'delete' )
			{
			// druidG.g:575:18: ( 'DELETE' | 'delete' )
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
					// druidG.g:575:19: 'DELETE'
					{
					match("DELETE"); 

					}
					break;
				case 2 :
					// druidG.g:575:28: 'delete'
					{
					match("delete"); 

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
	// $ANTLR end "DELETE"

	// $ANTLR start "KAFKA"
	public final void mKAFKA() throws RecognitionException {
		try {
			int _type = KAFKA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:576:17: ( ( 'KAFKA' | 'kafka' ) )
			// druidG.g:576:18: ( 'KAFKA' | 'kafka' )
			{
			// druidG.g:576:18: ( 'KAFKA' | 'kafka' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='K') ) {
				alt13=1;
			}
			else if ( (LA13_0=='k') ) {
				alt13=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// druidG.g:576:19: 'KAFKA'
					{
					match("KAFKA"); 

					}
					break;
				case 2 :
					// druidG.g:576:27: 'kafka'
					{
					match("kafka"); 

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
	// $ANTLR end "KAFKA"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:580:9: ( ( 'STRING' ) )
			// druidG.g:580:10: ( 'STRING' )
			{
			// druidG.g:580:10: ( 'STRING' )
			// druidG.g:580:11: 'STRING'
			{
			match("STRING"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "ISO"
	public final void mISO() throws RecognitionException {
		try {
			int _type = ISO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:581:6: ( ( 'ISO' ) )
			// druidG.g:581:7: ( 'ISO' )
			{
			// druidG.g:581:7: ( 'ISO' )
			// druidG.g:581:8: 'ISO'
			{
			match("ISO"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ISO"

	// $ANTLR start "AUTO_ISO"
	public final void mAUTO_ISO() throws RecognitionException {
		try {
			int _type = AUTO_ISO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:582:10: ( ( 'AUTO_ISO' ) )
			// druidG.g:582:11: ( 'AUTO_ISO' )
			{
			// druidG.g:582:11: ( 'AUTO_ISO' )
			// druidG.g:582:12: 'AUTO_ISO'
			{
			match("AUTO_ISO"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AUTO_ISO"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:585:9: ( ( 'SELECT' | 'select' ) )
			// druidG.g:585:11: ( 'SELECT' | 'select' )
			{
			// druidG.g:585:11: ( 'SELECT' | 'select' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='S') ) {
				alt14=1;
			}
			else if ( (LA14_0=='s') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// druidG.g:585:12: 'SELECT'
					{
					match("SELECT"); 

					}
					break;
				case 2 :
					// druidG.g:585:21: 'select'
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
			// druidG.g:587:8: ( ( 'COUNT' ) )
			// druidG.g:587:10: ( 'COUNT' )
			{
			// druidG.g:587:10: ( 'COUNT' )
			// druidG.g:587:11: 'COUNT'
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
			// druidG.g:588:10: ( ( 'LONG_SUM' ) )
			// druidG.g:588:12: ( 'LONG_SUM' )
			{
			// druidG.g:588:12: ( 'LONG_SUM' )
			// druidG.g:588:13: 'LONG_SUM'
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
			// druidG.g:589:12: ( ( 'DOUBLE_SUM' ) )
			// druidG.g:589:14: ( 'DOUBLE_SUM' )
			{
			// druidG.g:589:14: ( 'DOUBLE_SUM' )
			// druidG.g:589:15: 'DOUBLE_SUM'
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
			// druidG.g:590:9: ( ( 'UNIQUE' ) )
			// druidG.g:590:11: ( 'UNIQUE' )
			{
			// druidG.g:590:11: ( 'UNIQUE' )
			// druidG.g:590:12: 'UNIQUE'
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

	// $ANTLR start "HYPER_UNIQUE"
	public final void mHYPER_UNIQUE() throws RecognitionException {
		try {
			int _type = HYPER_UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:591:15: ( ( 'HYPER_UNIQUE' ) )
			// druidG.g:591:17: ( 'HYPER_UNIQUE' )
			{
			// druidG.g:591:17: ( 'HYPER_UNIQUE' )
			// druidG.g:591:18: 'HYPER_UNIQUE'
			{
			match("HYPER_UNIQUE"); 

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HYPER_UNIQUE"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			int _type = MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:592:6: ( ( 'MIN' ) )
			// druidG.g:592:8: ( 'MIN' )
			{
			// druidG.g:592:8: ( 'MIN' )
			// druidG.g:592:9: 'MIN'
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
			// druidG.g:593:5: ( ( 'MAX' ) )
			// druidG.g:593:7: ( 'MAX' )
			{
			// druidG.g:593:7: ( 'MAX' )
			// druidG.g:593:8: 'MAX'
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
			// druidG.g:595:9: ( ( 'DURATION' ) )
			// druidG.g:595:11: ( 'DURATION' )
			{
			// druidG.g:595:11: ( 'DURATION' )
			// druidG.g:595:12: 'DURATION'
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
			// druidG.g:596:8: ( ( 'PERIOD' ) )
			// druidG.g:596:10: ( 'PERIOD' )
			{
			// druidG.g:596:10: ( 'PERIOD' )
			// druidG.g:596:11: 'PERIOD'
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
			// druidG.g:597:9: ( ( 'INCLUDE' ) )
			// druidG.g:597:11: ( 'INCLUDE' )
			{
			// druidG.g:597:11: ( 'INCLUDE' )
			// druidG.g:597:12: 'INCLUDE'
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
			// druidG.g:599:7: ( ( 'WHICH' ) )
			// druidG.g:599:9: ( 'WHICH' )
			{
			// druidG.g:599:9: ( 'WHICH' )
			// druidG.g:599:10: 'WHICH'
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
			// druidG.g:600:9: ( ( 'CONTAINS' ) )
			// druidG.g:600:11: ( 'CONTAINS' )
			{
			// druidG.g:600:11: ( 'CONTAINS' )
			// druidG.g:600:12: 'CONTAINS'
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
			// druidG.g:601:6: ( ( 'SORT' ) )
			// druidG.g:601:8: ( 'SORT' )
			{
			// druidG.g:601:8: ( 'SORT' )
			// druidG.g:601:9: 'SORT'
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
			// druidG.g:603:6: ( ( 'HINT' ) )
			// druidG.g:603:8: ( 'HINT' )
			{
			// druidG.g:603:8: ( 'HINT' )
			// druidG.g:603:9: 'HINT'
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
			// druidG.g:605:5: ( ( 'AS' | 'as' ) )
			// druidG.g:605:7: ( 'AS' | 'as' )
			{
			// druidG.g:605:7: ( 'AS' | 'as' )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='A') ) {
				alt15=1;
			}
			else if ( (LA15_0=='a') ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// druidG.g:605:8: 'AS'
					{
					match("AS"); 

					}
					break;
				case 2 :
					// druidG.g:605:13: 'as'
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
			// druidG.g:606:14: ( ( 'FIELD_ACCESS' | 'field_access' ) )
			// druidG.g:606:16: ( 'FIELD_ACCESS' | 'field_access' )
			{
			// druidG.g:606:16: ( 'FIELD_ACCESS' | 'field_access' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0=='F') ) {
				alt16=1;
			}
			else if ( (LA16_0=='f') ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// druidG.g:606:17: 'FIELD_ACCESS'
					{
					match("FIELD_ACCESS"); 

					}
					break;
				case 2 :
					// druidG.g:606:32: 'field_access'
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
			// druidG.g:607:7: ( ( 'FROM' | 'from' ) )
			// druidG.g:607:9: ( 'FROM' | 'from' )
			{
			// druidG.g:607:9: ( 'FROM' | 'from' )
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='F') ) {
				alt17=1;
			}
			else if ( (LA17_0=='f') ) {
				alt17=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}

			switch (alt17) {
				case 1 :
					// druidG.g:607:10: 'FROM'
					{
					match("FROM"); 

					}
					break;
				case 2 :
					// druidG.g:607:17: 'from'
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
			// druidG.g:608:8: ( ( 'WHERE' | 'where' ) )
			// druidG.g:608:10: ( 'WHERE' | 'where' )
			{
			// druidG.g:608:10: ( 'WHERE' | 'where' )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='W') ) {
				alt18=1;
			}
			else if ( (LA18_0=='w') ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// druidG.g:608:11: 'WHERE'
					{
					match("WHERE"); 

					}
					break;
				case 2 :
					// druidG.g:608:19: 'where'
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
			// druidG.g:609:9: ( ( 'BETWEEN' | 'between' ) )
			// druidG.g:609:11: ( 'BETWEEN' | 'between' )
			{
			// druidG.g:609:11: ( 'BETWEEN' | 'between' )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='B') ) {
				alt19=1;
			}
			else if ( (LA19_0=='b') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// druidG.g:609:12: 'BETWEEN'
					{
					match("BETWEEN"); 

					}
					break;
				case 2 :
					// druidG.g:609:22: 'between'
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
			// druidG.g:610:6: ( ( 'AND' | 'and' ) )
			// druidG.g:610:8: ( 'AND' | 'and' )
			{
			// druidG.g:610:8: ( 'AND' | 'and' )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0=='A') ) {
				alt20=1;
			}
			else if ( (LA20_0=='a') ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// druidG.g:610:9: 'AND'
					{
					match("AND"); 

					}
					break;
				case 2 :
					// druidG.g:610:15: 'and'
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
			// druidG.g:611:5: ( ( 'OR' | 'or' ) )
			// druidG.g:611:7: ( 'OR' | 'or' )
			{
			// druidG.g:611:7: ( 'OR' | 'or' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='O') ) {
				alt21=1;
			}
			else if ( (LA21_0=='o') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// druidG.g:611:8: 'OR'
					{
					match("OR"); 

					}
					break;
				case 2 :
					// druidG.g:611:13: 'or'
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
			// druidG.g:612:6: ( ( 'NOT' | 'not' ) )
			// druidG.g:612:8: ( 'NOT' | 'not' )
			{
			// druidG.g:612:8: ( 'NOT' | 'not' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='N') ) {
				alt22=1;
			}
			else if ( (LA22_0=='n') ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// druidG.g:612:9: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// druidG.g:612:15: 'not'
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
			// druidG.g:613:7: ( ( 'GROUP' | 'group' ) )
			// druidG.g:613:9: ( 'GROUP' | 'group' )
			{
			// druidG.g:613:9: ( 'GROUP' | 'group' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='G') ) {
				alt23=1;
			}
			else if ( (LA23_0=='g') ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// druidG.g:613:10: 'GROUP'
					{
					match("GROUP"); 

					}
					break;
				case 2 :
					// druidG.g:613:20: 'group'
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
			// druidG.g:614:5: ( ( 'ASC' | 'asc' ) )
			// druidG.g:614:7: ( 'ASC' | 'asc' )
			{
			// druidG.g:614:7: ( 'ASC' | 'asc' )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0=='A') ) {
				alt24=1;
			}
			else if ( (LA24_0=='a') ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// druidG.g:614:8: 'ASC'
					{
					match("ASC"); 

					}
					break;
				case 2 :
					// druidG.g:614:16: 'asc'
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
			// druidG.g:615:6: ( ( 'DESC' | 'desc' ) )
			// druidG.g:615:8: ( 'DESC' | 'desc' )
			{
			// druidG.g:615:8: ( 'DESC' | 'desc' )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0=='D') ) {
				alt25=1;
			}
			else if ( (LA25_0=='d') ) {
				alt25=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// druidG.g:615:9: 'DESC'
					{
					match("DESC"); 

					}
					break;
				case 2 :
					// druidG.g:615:18: 'desc'
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
			// druidG.g:616:7: ( ( 'ORDER' | 'order' ) )
			// druidG.g:616:9: ( 'ORDER' | 'order' )
			{
			// druidG.g:616:9: ( 'ORDER' | 'order' )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='O') ) {
				alt26=1;
			}
			else if ( (LA26_0=='o') ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// druidG.g:616:10: 'ORDER'
					{
					match("ORDER"); 

					}
					break;
				case 2 :
					// druidG.g:616:20: 'order'
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
			// druidG.g:617:8: ( ( 'HAVING' | 'having' ) )
			// druidG.g:617:10: ( 'HAVING' | 'having' )
			{
			// druidG.g:617:10: ( 'HAVING' | 'having' )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0=='H') ) {
				alt27=1;
			}
			else if ( (LA27_0=='h') ) {
				alt27=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// druidG.g:617:11: 'HAVING'
					{
					match("HAVING"); 

					}
					break;
				case 2 :
					// druidG.g:617:22: 'having'
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
			// druidG.g:618:7: ( ( 'BREAK' | 'break' ) )
			// druidG.g:618:9: ( 'BREAK' | 'break' )
			{
			// druidG.g:618:9: ( 'BREAK' | 'break' )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='B') ) {
				alt28=1;
			}
			else if ( (LA28_0=='b') ) {
				alt28=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// druidG.g:618:10: 'BREAK'
					{
					match("BREAK"); 

					}
					break;
				case 2 :
					// druidG.g:618:20: 'break'
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
			// druidG.g:619:4: ( ( 'BY' | 'by' ) )
			// druidG.g:619:6: ( 'BY' | 'by' )
			{
			// druidG.g:619:6: ( 'BY' | 'by' )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0=='B') ) {
				alt29=1;
			}
			else if ( (LA29_0=='b') ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// druidG.g:619:7: 'BY'
					{
					match("BY"); 

					}
					break;
				case 2 :
					// druidG.g:619:14: 'by'
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
			// druidG.g:621:7: ( ( 'LIMIT' | 'limit' ) )
			// druidG.g:621:9: ( 'LIMIT' | 'limit' )
			{
			// druidG.g:621:9: ( 'LIMIT' | 'limit' )
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0=='L') ) {
				alt30=1;
			}
			else if ( (LA30_0=='l') ) {
				alt30=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 30, 0, input);
				throw nvae;
			}

			switch (alt30) {
				case 1 :
					// druidG.g:621:10: 'LIMIT'
					{
					match("LIMIT"); 

					}
					break;
				case 2 :
					// druidG.g:621:20: 'limit'
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
			// druidG.g:622:6: ( ( 'LIKE' | 'like' ) )
			// druidG.g:622:8: ( 'LIKE' | 'like' )
			{
			// druidG.g:622:8: ( 'LIKE' | 'like' )
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0=='L') ) {
				alt31=1;
			}
			else if ( (LA31_0=='l') ) {
				alt31=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}

			switch (alt31) {
				case 1 :
					// druidG.g:622:9: 'LIKE'
					{
					match("LIKE"); 

					}
					break;
				case 2 :
					// druidG.g:622:18: 'like'
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
			// druidG.g:623:6: ( ( 'THEN' | 'then' ) )
			// druidG.g:623:8: ( 'THEN' | 'then' )
			{
			// druidG.g:623:8: ( 'THEN' | 'then' )
			int alt32=2;
			int LA32_0 = input.LA(1);
			if ( (LA32_0=='T') ) {
				alt32=1;
			}
			else if ( (LA32_0=='t') ) {
				alt32=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}

			switch (alt32) {
				case 1 :
					// druidG.g:623:9: 'THEN'
					{
					match("THEN"); 

					}
					break;
				case 2 :
					// druidG.g:623:18: 'then'
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
			// druidG.g:626:2: ( ( 'JAVASCRIPT:' | 'javascript:' ) )
			// druidG.g:626:5: ( 'JAVASCRIPT:' | 'javascript:' )
			{
			// druidG.g:626:5: ( 'JAVASCRIPT:' | 'javascript:' )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0=='J') ) {
				alt33=1;
			}
			else if ( (LA33_0=='j') ) {
				alt33=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// druidG.g:626:6: 'JAVASCRIPT:'
					{
					match("JAVASCRIPT:"); 

					}
					break;
				case 2 :
					// druidG.g:626:21: 'javascript:'
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
			// druidG.g:628:7: ( ( 'JOIN' | 'join' ) )
			// druidG.g:628:9: ( 'JOIN' | 'join' )
			{
			// druidG.g:628:9: ( 'JOIN' | 'join' )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0=='J') ) {
				alt34=1;
			}
			else if ( (LA34_0=='j') ) {
				alt34=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// druidG.g:628:10: 'JOIN'
					{
					match("JOIN"); 

					}
					break;
				case 2 :
					// druidG.g:628:19: 'join'
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
			// druidG.g:631:12: ( ( 'LEFT_JOIN' | 'left_join' ) )
			// druidG.g:631:14: ( 'LEFT_JOIN' | 'left_join' )
			{
			// druidG.g:631:14: ( 'LEFT_JOIN' | 'left_join' )
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0=='L') ) {
				alt35=1;
			}
			else if ( (LA35_0=='l') ) {
				alt35=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 35, 0, input);
				throw nvae;
			}

			switch (alt35) {
				case 1 :
					// druidG.g:631:15: 'LEFT_JOIN'
					{
					match("LEFT_JOIN"); 

					}
					break;
				case 2 :
					// druidG.g:631:29: 'left_join'
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
			// druidG.g:634:13: ( ( 'RIGHT_JOIN' | 'right_join' ) )
			// druidG.g:634:15: ( 'RIGHT_JOIN' | 'right_join' )
			{
			// druidG.g:634:15: ( 'RIGHT_JOIN' | 'right_join' )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0=='R') ) {
				alt36=1;
			}
			else if ( (LA36_0=='r') ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// druidG.g:634:16: 'RIGHT_JOIN'
					{
					match("RIGHT_JOIN"); 

					}
					break;
				case 2 :
					// druidG.g:634:31: 'right_join'
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
			// druidG.g:637:5: ( ( 'ON' ) )
			// druidG.g:637:7: ( 'ON' )
			{
			// druidG.g:637:7: ( 'ON' )
			// druidG.g:637:8: 'ON'
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
			// druidG.g:642:2: ( ';' )
			// druidG.g:642:4: ';'
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

	// $ANTLR start "OPT_AMPERSAND"
	public final void mOPT_AMPERSAND() throws RecognitionException {
		try {
			int _type = OPT_AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:645:2: ( '&' )
			// druidG.g:645:4: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPT_AMPERSAND"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:648:2: ( ( ' ' | '\\t' )+ )
			// druidG.g:648:4: ( ' ' | '\\t' )+
			{
			// druidG.g:648:4: ( ' ' | '\\t' )+
			int cnt37=0;
			loop37:
			while (true) {
				int alt37=2;
				int LA37_0 = input.LA(1);
				if ( (LA37_0=='\t'||LA37_0==' ') ) {
					alt37=1;
				}

				switch (alt37) {
				case 1 :
					// druidG.g:
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
					if ( cnt37 >= 1 ) break loop37;
					EarlyExitException eee = new EarlyExitException(37, input);
					throw eee;
				}
				cnt37++;
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

	// $ANTLR start "DATE_YEAR_ONLY"
	public final void mDATE_YEAR_ONLY() throws RecognitionException {
		try {
			// druidG.g:653:2: ( NUM NUM NUM NUM )
			// druidG.g:653:4: NUM NUM NUM NUM
			{
			mNUM(); 

			mNUM(); 

			mNUM(); 

			mNUM(); 

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE_YEAR_ONLY"

	// $ANTLR start "DATE_YEAR_MONTH_ONLY"
	public final void mDATE_YEAR_MONTH_ONLY() throws RecognitionException {
		try {
			int _type = DATE_YEAR_MONTH_ONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:656:2: ( DATE_YEAR_ONLY '-' NUM NUM )
			// druidG.g:656:4: DATE_YEAR_ONLY '-' NUM NUM
			{
			mDATE_YEAR_ONLY(); 

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
	// $ANTLR end "DATE_YEAR_MONTH_ONLY"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:659:2: ( DATE_YEAR_MONTH_ONLY '-' NUM NUM )
			// druidG.g:659:4: DATE_YEAR_MONTH_ONLY '-' NUM NUM
			{
			mDATE_YEAR_MONTH_ONLY(); 

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
			// druidG.g:662:2: ( DATE 'T' NUM NUM )
			// druidG.g:662:4: DATE 'T' NUM NUM
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
			// druidG.g:665:2: ( DATE_HOUR ':' NUM NUM )
			// druidG.g:665:5: DATE_HOUR ':' NUM NUM
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
			// druidG.g:668:2: ( DATE_HOUR_MIN ':' NUM NUM )
			// druidG.g:668:5: DATE_HOUR_MIN ':' NUM NUM
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
			// druidG.g:671:2: ( DATE_HOUR_MIN_SEC '.' NUM NUM NUM )
			// druidG.g:671:5: DATE_HOUR_MIN_SEC '.' NUM NUM NUM
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
			// druidG.g:674:2: ( DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM )
			// druidG.g:674:5: DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM
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
			// druidG.g:677:2: ( DATE_HOUR_MIN 'Z' | DATE_HOUR_MIN_SEC 'Z' | DATE_HOUR_MIN_SEC_SUB 'Z' )
			int alt38=3;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= '0' && LA38_0 <= '9')) ) {
				int LA38_1 = input.LA(2);
				if ( ((LA38_1 >= '0' && LA38_1 <= '9')) ) {
					int LA38_2 = input.LA(3);
					if ( ((LA38_2 >= '0' && LA38_2 <= '9')) ) {
						int LA38_3 = input.LA(4);
						if ( ((LA38_3 >= '0' && LA38_3 <= '9')) ) {
							int LA38_4 = input.LA(5);
							if ( (LA38_4=='-') ) {
								int LA38_5 = input.LA(6);
								if ( ((LA38_5 >= '0' && LA38_5 <= '9')) ) {
									int LA38_6 = input.LA(7);
									if ( ((LA38_6 >= '0' && LA38_6 <= '9')) ) {
										int LA38_7 = input.LA(8);
										if ( (LA38_7=='-') ) {
											int LA38_8 = input.LA(9);
											if ( ((LA38_8 >= '0' && LA38_8 <= '9')) ) {
												int LA38_9 = input.LA(10);
												if ( ((LA38_9 >= '0' && LA38_9 <= '9')) ) {
													int LA38_10 = input.LA(11);
													if ( (LA38_10=='T') ) {
														int LA38_11 = input.LA(12);
														if ( ((LA38_11 >= '0' && LA38_11 <= '9')) ) {
															int LA38_12 = input.LA(13);
															if ( ((LA38_12 >= '0' && LA38_12 <= '9')) ) {
																int LA38_13 = input.LA(14);
																if ( (LA38_13==':') ) {
																	int LA38_14 = input.LA(15);
																	if ( ((LA38_14 >= '0' && LA38_14 <= '9')) ) {
																		int LA38_15 = input.LA(16);
																		if ( ((LA38_15 >= '0' && LA38_15 <= '9')) ) {
																			int LA38_16 = input.LA(17);
																			if ( (LA38_16=='Z') ) {
																				alt38=1;
																			}
																			else if ( (LA38_16==':') ) {
																				int LA38_18 = input.LA(18);
																				if ( ((LA38_18 >= '0' && LA38_18 <= '9')) ) {
																					int LA38_19 = input.LA(19);
																					if ( ((LA38_19 >= '0' && LA38_19 <= '9')) ) {
																						int LA38_20 = input.LA(20);
																						if ( (LA38_20=='Z') ) {
																							alt38=2;
																						}
																						else if ( (LA38_20=='.') ) {
																							alt38=3;
																						}

																						else {
																							int nvaeMark = input.mark();
																							try {
																								for (int nvaeConsume = 0; nvaeConsume < 20 - 1; nvaeConsume++) {
																									input.consume();
																								}
																								NoViableAltException nvae =
																									new NoViableAltException("", 38, 20, input);
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
																								new NoViableAltException("", 38, 19, input);
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
																							new NoViableAltException("", 38, 18, input);
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
																						new NoViableAltException("", 38, 16, input);
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
																					new NoViableAltException("", 38, 15, input);
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
																				new NoViableAltException("", 38, 14, input);
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
																			new NoViableAltException("", 38, 13, input);
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
																		new NoViableAltException("", 38, 12, input);
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
																	new NoViableAltException("", 38, 11, input);
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
																new NoViableAltException("", 38, 10, input);
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
															new NoViableAltException("", 38, 9, input);
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
														new NoViableAltException("", 38, 8, input);
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
													new NoViableAltException("", 38, 7, input);
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
												new NoViableAltException("", 38, 6, input);
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
											new NoViableAltException("", 38, 5, input);
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
										new NoViableAltException("", 38, 4, input);
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
									new NoViableAltException("", 38, 3, input);
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
								new NoViableAltException("", 38, 2, input);
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
							new NoViableAltException("", 38, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 38, 0, input);
				throw nvae;
			}

			switch (alt38) {
				case 1 :
					// druidG.g:677:5: DATE_HOUR_MIN 'Z'
					{
					mDATE_HOUR_MIN(); 

					match('Z'); 
					}
					break;
				case 2 :
					// druidG.g:678:6: DATE_HOUR_MIN_SEC 'Z'
					{
					mDATE_HOUR_MIN_SEC(); 

					match('Z'); 
					}
					break;
				case 3 :
					// druidG.g:679:6: DATE_HOUR_MIN_SEC_SUB 'Z'
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
			// druidG.g:682:13: ( ( '*' | '+' | '/' | '-' ) )
			// druidG.g:
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
			// druidG.g:685:9: ( '=' )
			// druidG.g:685:11: '='
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
			// druidG.g:687:15: ( ( '<' | '>' ) )
			// druidG.g:
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
			// druidG.g:691:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// druidG.g:691:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// druidG.g:691:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop39:
			while (true) {
				int alt39=2;
				int LA39_0 = input.LA(1);
				if ( ((LA39_0 >= '0' && LA39_0 <= '9')||(LA39_0 >= 'A' && LA39_0 <= 'Z')||LA39_0=='_'||(LA39_0 >= 'a' && LA39_0 <= 'z')) ) {
					alt39=1;
				}

				switch (alt39) {
				case 1 :
					// druidG.g:
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
					break loop39;
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
			// druidG.g:695:11: ( ( '\\r\\n' | '\\r' | '\\n' ) )
			// druidG.g:695:14: ( '\\r\\n' | '\\r' | '\\n' )
			{
			// druidG.g:695:14: ( '\\r\\n' | '\\r' | '\\n' )
			int alt40=3;
			int LA40_0 = input.LA(1);
			if ( (LA40_0=='\r') ) {
				int LA40_1 = input.LA(2);
				if ( (LA40_1=='\n') ) {
					alt40=1;
				}

				else {
					alt40=2;
				}

			}
			else if ( (LA40_0=='\n') ) {
				alt40=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 40, 0, input);
				throw nvae;
			}

			switch (alt40) {
				case 1 :
					// druidG.g:695:16: '\\r\\n'
					{
					match("\r\n"); 

					}
					break;
				case 2 :
					// druidG.g:696:18: '\\r'
					{
					match('\r'); 
					}
					break;
				case 3 :
					// druidG.g:697:18: '\\n'
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

	// $ANTLR start "SINGLE_QUOTE_STRING"
	public final void mSINGLE_QUOTE_STRING() throws RecognitionException {
		try {
			int _type = SINGLE_QUOTE_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// druidG.g:706:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
			// druidG.g:706:8: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
			{
			match('\''); 
			// druidG.g:706:13: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
			loop41:
			while (true) {
				int alt41=3;
				int LA41_0 = input.LA(1);
				if ( (LA41_0=='\\') ) {
					alt41=1;
				}
				else if ( ((LA41_0 >= '\u0000' && LA41_0 <= '&')||(LA41_0 >= '(' && LA41_0 <= '[')||(LA41_0 >= ']' && LA41_0 <= '\uFFFF')) ) {
					alt41=2;
				}

				switch (alt41) {
				case 1 :
					// druidG.g:706:14: ESC_SEQ
					{
					mESC_SEQ(); 

					}
					break;
				case 2 :
					// druidG.g:706:24: ~ ( '\\\\' | '\\'' )
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
					break loop41;
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
			// druidG.g:709:6: ( ( NUM )+ )
			// druidG.g:709:8: ( NUM )+
			{
			// druidG.g:709:8: ( NUM )+
			int cnt42=0;
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( ((LA42_0 >= '0' && LA42_0 <= '9')) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// druidG.g:
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
					if ( cnt42 >= 1 ) break loop42;
					EarlyExitException eee = new EarlyExitException(42, input);
					throw eee;
				}
				cnt42++;
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
			// druidG.g:710:10: ( ( NUM )* '.' ( NUM )+ )
			// druidG.g:710:15: ( NUM )* '.' ( NUM )+
			{
			// druidG.g:710:15: ( NUM )*
			loop43:
			while (true) {
				int alt43=2;
				int LA43_0 = input.LA(1);
				if ( ((LA43_0 >= '0' && LA43_0 <= '9')) ) {
					alt43=1;
				}

				switch (alt43) {
				case 1 :
					// druidG.g:
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
					break loop43;
				}
			}

			match('.'); 
			// druidG.g:710:24: ( NUM )+
			int cnt44=0;
			loop44:
			while (true) {
				int alt44=2;
				int LA44_0 = input.LA(1);
				if ( ((LA44_0 >= '0' && LA44_0 <= '9')) ) {
					alt44=1;
				}

				switch (alt44) {
				case 1 :
					// druidG.g:
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
					if ( cnt44 >= 1 ) break loop44;
					EarlyExitException eee = new EarlyExitException(44, input);
					throw eee;
				}
				cnt44++;
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
			// druidG.g:712:14: ( ( '0' .. '9' ) )
			// druidG.g:
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
			// druidG.g:714:20: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
			// druidG.g:
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
			// druidG.g:717:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
			int alt45=3;
			int LA45_0 = input.LA(1);
			if ( (LA45_0=='\\') ) {
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
					alt45=1;
					}
					break;
				case 'u':
					{
					alt45=2;
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
					alt45=3;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}

			switch (alt45) {
				case 1 :
					// druidG.g:717:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
					// druidG.g:718:9: UNICODE_ESC
					{
					mUNICODE_ESC(); 

					}
					break;
				case 3 :
					// druidG.g:719:9: OCTAL_ESC
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
			// druidG.g:723:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
			int alt46=3;
			int LA46_0 = input.LA(1);
			if ( (LA46_0=='\\') ) {
				int LA46_1 = input.LA(2);
				if ( ((LA46_1 >= '0' && LA46_1 <= '3')) ) {
					int LA46_2 = input.LA(3);
					if ( ((LA46_2 >= '0' && LA46_2 <= '7')) ) {
						int LA46_4 = input.LA(4);
						if ( ((LA46_4 >= '0' && LA46_4 <= '7')) ) {
							alt46=1;
						}

						else {
							alt46=2;
						}

					}

					else {
						alt46=3;
					}

				}
				else if ( ((LA46_1 >= '4' && LA46_1 <= '7')) ) {
					int LA46_3 = input.LA(3);
					if ( ((LA46_3 >= '0' && LA46_3 <= '7')) ) {
						alt46=2;
					}

					else {
						alt46=3;
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 46, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 46, 0, input);
				throw nvae;
			}

			switch (alt46) {
				case 1 :
					// druidG.g:723:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
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
					// druidG.g:724:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
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
					// druidG.g:725:9: '\\\\' ( '0' .. '7' )
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
			// druidG.g:729:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
			// druidG.g:729:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
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
		// druidG.g:1:8: ( T__89 | T__90 | T__91 | T__92 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | INSERT | INSERT_HADOOP | INSERT_REALTIME | INTO | VALUES | MAX_WINDOW | DELIMITER | PARTITION | ROLLUP | DROP | TABLE | DELETE | KAFKA | STRING | ISO | AUTO_ISO | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | HYPER_UNIQUE | MIN | MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ASC | DESC | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | OPT_AMPERSAND | WS | DATE_YEAR_MONTH_ONLY | DATE | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | NEWLINE | SINGLE_QUOTE_STRING | LONG | FLOAT )
		int alt47=83;
		alt47 = dfa47.predict(input);
		switch (alt47) {
			case 1 :
				// druidG.g:1:10: T__89
				{
				mT__89(); 

				}
				break;
			case 2 :
				// druidG.g:1:16: T__90
				{
				mT__90(); 

				}
				break;
			case 3 :
				// druidG.g:1:22: T__91
				{
				mT__91(); 

				}
				break;
			case 4 :
				// druidG.g:1:28: T__92
				{
				mT__92(); 

				}
				break;
			case 5 :
				// druidG.g:1:34: LPARAN
				{
				mLPARAN(); 

				}
				break;
			case 6 :
				// druidG.g:1:41: RPARAN
				{
				mRPARAN(); 

				}
				break;
			case 7 :
				// druidG.g:1:48: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 8 :
				// druidG.g:1:55: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 9 :
				// druidG.g:1:62: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 10 :
				// druidG.g:1:70: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 11 :
				// druidG.g:1:78: INSERT
				{
				mINSERT(); 

				}
				break;
			case 12 :
				// druidG.g:1:85: INSERT_HADOOP
				{
				mINSERT_HADOOP(); 

				}
				break;
			case 13 :
				// druidG.g:1:99: INSERT_REALTIME
				{
				mINSERT_REALTIME(); 

				}
				break;
			case 14 :
				// druidG.g:1:115: INTO
				{
				mINTO(); 

				}
				break;
			case 15 :
				// druidG.g:1:120: VALUES
				{
				mVALUES(); 

				}
				break;
			case 16 :
				// druidG.g:1:127: MAX_WINDOW
				{
				mMAX_WINDOW(); 

				}
				break;
			case 17 :
				// druidG.g:1:138: DELIMITER
				{
				mDELIMITER(); 

				}
				break;
			case 18 :
				// druidG.g:1:148: PARTITION
				{
				mPARTITION(); 

				}
				break;
			case 19 :
				// druidG.g:1:158: ROLLUP
				{
				mROLLUP(); 

				}
				break;
			case 20 :
				// druidG.g:1:165: DROP
				{
				mDROP(); 

				}
				break;
			case 21 :
				// druidG.g:1:170: TABLE
				{
				mTABLE(); 

				}
				break;
			case 22 :
				// druidG.g:1:176: DELETE
				{
				mDELETE(); 

				}
				break;
			case 23 :
				// druidG.g:1:183: KAFKA
				{
				mKAFKA(); 

				}
				break;
			case 24 :
				// druidG.g:1:189: STRING
				{
				mSTRING(); 

				}
				break;
			case 25 :
				// druidG.g:1:196: ISO
				{
				mISO(); 

				}
				break;
			case 26 :
				// druidG.g:1:200: AUTO_ISO
				{
				mAUTO_ISO(); 

				}
				break;
			case 27 :
				// druidG.g:1:209: SELECT
				{
				mSELECT(); 

				}
				break;
			case 28 :
				// druidG.g:1:216: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 29 :
				// druidG.g:1:222: LONG_SUM
				{
				mLONG_SUM(); 

				}
				break;
			case 30 :
				// druidG.g:1:231: DOUBLE_SUM
				{
				mDOUBLE_SUM(); 

				}
				break;
			case 31 :
				// druidG.g:1:242: UNIQUE
				{
				mUNIQUE(); 

				}
				break;
			case 32 :
				// druidG.g:1:249: HYPER_UNIQUE
				{
				mHYPER_UNIQUE(); 

				}
				break;
			case 33 :
				// druidG.g:1:262: MIN
				{
				mMIN(); 

				}
				break;
			case 34 :
				// druidG.g:1:266: MAX
				{
				mMAX(); 

				}
				break;
			case 35 :
				// druidG.g:1:270: DURATION
				{
				mDURATION(); 

				}
				break;
			case 36 :
				// druidG.g:1:279: PERIOD
				{
				mPERIOD(); 

				}
				break;
			case 37 :
				// druidG.g:1:286: INCLUDE
				{
				mINCLUDE(); 

				}
				break;
			case 38 :
				// druidG.g:1:294: WHICH
				{
				mWHICH(); 

				}
				break;
			case 39 :
				// druidG.g:1:300: CONTAINS
				{
				mCONTAINS(); 

				}
				break;
			case 40 :
				// druidG.g:1:309: SORT
				{
				mSORT(); 

				}
				break;
			case 41 :
				// druidG.g:1:314: HINT
				{
				mHINT(); 

				}
				break;
			case 42 :
				// druidG.g:1:319: AS
				{
				mAS(); 

				}
				break;
			case 43 :
				// druidG.g:1:322: FIELD_ACCESS
				{
				mFIELD_ACCESS(); 

				}
				break;
			case 44 :
				// druidG.g:1:335: FROM
				{
				mFROM(); 

				}
				break;
			case 45 :
				// druidG.g:1:340: WHERE
				{
				mWHERE(); 

				}
				break;
			case 46 :
				// druidG.g:1:346: BETWEEN
				{
				mBETWEEN(); 

				}
				break;
			case 47 :
				// druidG.g:1:354: AND
				{
				mAND(); 

				}
				break;
			case 48 :
				// druidG.g:1:358: OR
				{
				mOR(); 

				}
				break;
			case 49 :
				// druidG.g:1:361: NOT
				{
				mNOT(); 

				}
				break;
			case 50 :
				// druidG.g:1:365: GROUP
				{
				mGROUP(); 

				}
				break;
			case 51 :
				// druidG.g:1:371: ASC
				{
				mASC(); 

				}
				break;
			case 52 :
				// druidG.g:1:375: DESC
				{
				mDESC(); 

				}
				break;
			case 53 :
				// druidG.g:1:380: ORDER
				{
				mORDER(); 

				}
				break;
			case 54 :
				// druidG.g:1:386: HAVING
				{
				mHAVING(); 

				}
				break;
			case 55 :
				// druidG.g:1:393: BREAK
				{
				mBREAK(); 

				}
				break;
			case 56 :
				// druidG.g:1:399: BY
				{
				mBY(); 

				}
				break;
			case 57 :
				// druidG.g:1:402: LIMIT
				{
				mLIMIT(); 

				}
				break;
			case 58 :
				// druidG.g:1:408: LIKE
				{
				mLIKE(); 

				}
				break;
			case 59 :
				// druidG.g:1:413: THEN
				{
				mTHEN(); 

				}
				break;
			case 60 :
				// druidG.g:1:418: JAVASCRIPT
				{
				mJAVASCRIPT(); 

				}
				break;
			case 61 :
				// druidG.g:1:429: JOIN
				{
				mJOIN(); 

				}
				break;
			case 62 :
				// druidG.g:1:434: LEFT_JOIN
				{
				mLEFT_JOIN(); 

				}
				break;
			case 63 :
				// druidG.g:1:444: RIGHT_JOIN
				{
				mRIGHT_JOIN(); 

				}
				break;
			case 64 :
				// druidG.g:1:455: ON
				{
				mON(); 

				}
				break;
			case 65 :
				// druidG.g:1:458: OPT_SEMI_COLON
				{
				mOPT_SEMI_COLON(); 

				}
				break;
			case 66 :
				// druidG.g:1:473: OPT_AMPERSAND
				{
				mOPT_AMPERSAND(); 

				}
				break;
			case 67 :
				// druidG.g:1:487: WS
				{
				mWS(); 

				}
				break;
			case 68 :
				// druidG.g:1:490: DATE_YEAR_MONTH_ONLY
				{
				mDATE_YEAR_MONTH_ONLY(); 

				}
				break;
			case 69 :
				// druidG.g:1:511: DATE
				{
				mDATE(); 

				}
				break;
			case 70 :
				// druidG.g:1:516: DATE_HOUR
				{
				mDATE_HOUR(); 

				}
				break;
			case 71 :
				// druidG.g:1:526: DATE_HOUR_MIN
				{
				mDATE_HOUR_MIN(); 

				}
				break;
			case 72 :
				// druidG.g:1:540: DATE_HOUR_MIN_SEC
				{
				mDATE_HOUR_MIN_SEC(); 

				}
				break;
			case 73 :
				// druidG.g:1:558: DATE_HOUR_MIN_SEC_SUB
				{
				mDATE_HOUR_MIN_SEC_SUB(); 

				}
				break;
			case 74 :
				// druidG.g:1:580: DATE_HOUR_MIN_SEC_SUB_TZ
				{
				mDATE_HOUR_MIN_SEC_SUB_TZ(); 

				}
				break;
			case 75 :
				// druidG.g:1:605: DATE_HOUR_MIN_SEC_SUB_UTC_TZ
				{
				mDATE_HOUR_MIN_SEC_SUB_UTC_TZ(); 

				}
				break;
			case 76 :
				// druidG.g:1:634: ARITH_OPER
				{
				mARITH_OPER(); 

				}
				break;
			case 77 :
				// druidG.g:1:645: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 78 :
				// druidG.g:1:652: COMPARE_OPER
				{
				mCOMPARE_OPER(); 

				}
				break;
			case 79 :
				// druidG.g:1:665: ID
				{
				mID(); 

				}
				break;
			case 80 :
				// druidG.g:1:668: NEWLINE
				{
				mNEWLINE(); 

				}
				break;
			case 81 :
				// druidG.g:1:676: SINGLE_QUOTE_STRING
				{
				mSINGLE_QUOTE_STRING(); 

				}
				break;
			case 82 :
				// druidG.g:1:696: LONG
				{
				mLONG(); 

				}
				break;
			case 83 :
				// druidG.g:1:701: FLOAT
				{
				mFLOAT(); 

				}
				break;

		}
	}


	protected DFA47 dfa47 = new DFA47(this);
	static final String DFA47_eotS =
		"\1\uffff\1\75\2\uffff\1\70\5\uffff\47\70\3\uffff\1\u0085\12\uffff\37\70"+
		"\1\u00ac\13\70\1\u00ac\10\70\1\u00c4\2\70\1\u00c4\1\u00c8\1\u00c9\1\u00c8"+
		"\13\70\1\uffff\1\u0085\5\70\1\u00de\2\70\1\u00e2\1\u00e3\32\70\1\u0100"+
		"\1\uffff\1\u0101\15\70\1\u0100\1\u0101\7\70\1\uffff\3\70\2\uffff\1\70"+
		"\2\u011a\12\70\1\u0085\1\70\1\u0127\2\70\1\u0127\1\70\1\uffff\3\70\2\uffff"+
		"\3\70\1\u0131\1\u0132\4\70\1\u0131\1\u0132\10\70\1\u013f\1\70\1\u013f"+
		"\4\70\1\u0145\1\70\2\uffff\5\70\1\u014c\3\70\1\u0150\4\70\1\u0155\1\70"+
		"\1\u0155\7\70\1\uffff\4\70\1\u014c\2\70\1\u0164\1\70\1\u0164\1\u0085\1"+
		"\70\1\uffff\11\70\2\uffff\13\70\1\u017d\1\uffff\1\u017d\2\u017e\2\70\1"+
		"\uffff\2\70\1\u0183\2\70\1\u0186\1\uffff\3\70\1\uffff\1\70\1\u018b\1\u018c"+
		"\1\70\1\uffff\1\70\1\u018c\1\70\1\u0190\1\70\1\u0190\2\u0192\2\u0193\1"+
		"\70\1\u0186\2\70\1\uffff\1\70\1\uffff\1\u0085\1\70\2\u019b\1\70\2\u019e"+
		"\3\70\1\u01a2\3\70\1\u01a2\1\70\1\u01a7\1\70\1\u01a9\1\70\1\u01a9\1\70"+
		"\2\uffff\1\u01ac\1\u01ad\1\70\1\u01ad\1\uffff\2\70\1\uffff\1\70\1\u01b2"+
		"\1\70\1\u01b4\2\uffff\3\70\1\uffff\1\70\2\uffff\1\u01b4\3\70\1\uffff\2"+
		"\70\1\uffff\1\70\1\u01c2\1\uffff\3\70\1\uffff\4\70\1\uffff\1\70\1\uffff"+
		"\2\70\2\uffff\4\70\1\uffff\1\70\1\uffff\2\70\2\u01d4\3\70\1\u01d8\1\u01da"+
		"\4\70\1\uffff\4\70\1\u01e3\5\70\1\u01e9\1\u01ea\1\u01eb\4\70\1\uffff\3"+
		"\70\3\uffff\6\70\1\u01fa\1\70\1\uffff\1\u01fa\2\u01fc\2\70\3\uffff\1\u01ff"+
		"\3\70\1\u01ff\2\70\1\uffff\4\70\2\u020a\1\uffff\1\u020b\1\uffff\2\u020c"+
		"\1\uffff\5\70\1\u0211\4\70\3\uffff\3\70\3\uffff\4\70\1\u021f\2\u0220\1"+
		"\uffff\1\u0222\1\70\1\u0222\1\70\2\uffff\1\u0225\1\uffff\2\70\2\uffff"+
		"\2\u022a\2\uffff\1\u022c\4\uffff\1\u0231\4\uffff\1\u0236\2\uffff";
	static final String DFA47_eofS =
		"\u0238\uffff";
	static final String DFA47_minS =
		"\1\11\1\52\2\uffff\1\156\5\uffff\1\116\1\101\1\141\1\101\1\141\1\105\1"+
		"\145\1\101\1\141\1\111\1\151\1\101\1\141\1\101\1\141\1\105\1\116\1\145"+
		"\1\117\1\105\1\116\1\101\1\110\1\156\1\111\1\151\1\150\1\105\1\145\1\116"+
		"\1\162\1\117\1\157\1\122\1\162\1\141\1\145\1\101\1\141\3\uffff\1\56\12"+
		"\uffff\1\163\1\103\1\117\1\114\1\154\1\130\1\116\1\170\1\114\1\117\1\125"+
		"\1\122\1\154\1\157\2\122\1\162\1\114\1\107\1\154\1\147\1\102\1\105\1\142"+
		"\1\145\1\106\1\146\1\122\1\114\1\122\1\124\1\60\1\104\1\154\2\116\1\113"+
		"\1\106\1\111\1\120\1\116\1\126\1\105\1\60\1\144\1\105\1\117\1\145\1\157"+
		"\1\145\1\124\1\105\1\60\1\164\1\145\4\60\1\124\1\164\1\117\1\157\1\166"+
		"\1\153\1\146\1\126\1\111\1\166\1\151\1\uffff\1\56\2\145\1\105\1\117\1"+
		"\114\1\60\1\125\1\165\2\60\1\137\1\105\1\103\1\120\1\102\1\101\1\145\1"+
		"\143\1\160\1\124\1\111\1\164\1\114\1\110\1\154\1\150\1\114\1\116\1\154"+
		"\1\156\1\113\1\153\1\111\1\105\1\124\1\117\1\60\1\uffff\1\60\1\145\1\116"+
		"\1\124\1\107\1\111\1\105\1\124\1\121\1\105\1\124\1\111\1\103\1\122\2\60"+
		"\1\114\1\115\1\154\1\155\1\162\1\127\1\101\1\uffff\1\167\1\141\1\105\2"+
		"\uffff\1\145\2\60\1\125\1\165\2\151\1\145\1\164\1\101\1\116\1\141\1\156"+
		"\1\56\1\162\1\60\1\162\1\122\1\60\1\125\1\uffff\1\105\1\145\1\127\2\uffff"+
		"\1\167\1\115\1\124\2\60\1\114\1\124\1\155\1\164\2\60\1\111\1\117\1\151"+
		"\1\125\1\124\1\165\1\164\1\105\1\60\1\145\1\60\1\101\1\141\1\116\1\103"+
		"\1\60\1\137\2\uffff\1\143\1\124\1\101\1\137\1\124\1\60\1\137\1\125\1\122"+
		"\1\60\1\116\1\110\1\105\1\104\1\60\1\144\1\60\1\145\1\105\1\113\1\145"+
		"\1\153\1\122\1\162\1\uffff\1\120\1\160\1\156\1\164\1\60\1\137\1\123\1"+
		"\60\1\163\1\60\1\55\1\166\1\uffff\1\164\1\124\1\104\1\123\1\163\1\111"+
		"\1\151\1\111\1\105\2\uffff\1\105\1\111\1\151\1\145\1\124\1\104\1\164\1"+
		"\120\1\137\1\160\1\137\1\60\1\uffff\3\60\1\107\1\124\1\uffff\1\111\1\164"+
		"\1\60\1\111\1\123\1\60\1\uffff\1\112\1\105\1\137\1\uffff\1\107\2\60\1"+
		"\137\1\uffff\1\137\1\60\1\105\1\60\1\145\5\60\1\147\1\60\1\152\1\103\1"+
		"\uffff\1\143\1\60\1\56\1\141\2\60\1\105\2\60\1\116\1\156\1\124\1\60\1"+
		"\137\1\117\1\164\1\60\1\111\1\60\1\151\1\60\1\112\1\60\1\152\2\uffff\2"+
		"\60\1\123\1\60\1\uffff\1\116\1\125\1\uffff\1\117\1\60\1\125\1\60\2\uffff"+
		"\1\101\1\141\1\116\1\uffff\1\156\2\uffff\1\60\1\157\1\122\1\162\1\60\1"+
		"\154\1\150\1\uffff\1\110\1\60\1\uffff\1\104\1\144\1\105\1\uffff\1\123"+
		"\1\116\1\145\1\117\1\uffff\1\157\1\uffff\1\117\1\157\2\uffff\1\117\1\123"+
		"\1\115\1\111\1\uffff\1\116\1\uffff\1\103\1\143\2\60\1\151\1\111\1\151"+
		"\1\55\1\60\1\141\1\145\1\101\1\105\1\uffff\1\117\1\157\1\122\1\125\1\60"+
		"\1\162\1\116\1\156\1\111\1\151\3\60\1\116\1\111\1\103\1\143\1\uffff\1"+
		"\156\1\120\1\160\1\uffff\1\60\1\uffff\1\144\1\141\1\104\1\101\1\127\1"+
		"\167\1\60\1\115\1\uffff\3\60\1\116\1\156\3\uffff\1\60\1\121\1\105\1\145"+
		"\1\60\1\124\1\164\1\60\1\157\1\154\1\117\1\114\2\60\1\uffff\1\60\1\uffff"+
		"\2\60\1\uffff\1\125\1\123\1\163\2\72\1\124\1\157\1\164\1\117\1\124\3\uffff"+
		"\1\105\1\123\1\163\2\uffff\1\60\1\160\1\151\1\120\1\111\5\60\1\155\1\60"+
		"\1\115\2\uffff\1\72\1\uffff\1\145\1\105\1\uffff\4\60\1\uffff\1\72\1\uffff"+
		"\1\60\1\uffff\1\60\1\56\1\uffff\3\60\1\53\2\uffff";
	static final String DFA47_maxS =
		"\1\175\1\52\2\uffff\1\156\5\uffff\1\123\1\101\1\141\1\111\1\141\1\125"+
		"\1\162\1\105\1\141\1\117\1\157\1\110\1\150\1\101\1\141\1\124\1\125\1\145"+
		"\2\117\1\116\1\131\1\110\1\163\1\122\1\162\1\150\1\131\1\171\1\122\1\162"+
		"\1\117\1\157\1\122\1\162\1\141\1\151\1\117\1\157\3\uffff\1\71\12\uffff"+
		"\1\164\1\124\1\117\1\114\1\154\1\130\1\116\1\170\1\123\1\117\1\125\1\122"+
		"\1\163\1\157\2\122\1\162\1\114\1\107\1\154\1\147\1\102\1\105\1\142\1\145"+
		"\1\106\1\146\1\122\1\114\1\122\1\124\1\172\1\104\1\154\1\125\1\116\1\115"+
		"\1\106\1\111\1\120\1\116\1\126\1\111\1\172\1\144\1\105\1\117\1\145\1\157"+
		"\1\145\1\124\1\105\1\172\1\164\1\145\4\172\1\124\1\164\1\117\1\157\1\166"+
		"\1\155\1\146\1\126\1\111\1\166\1\151\1\uffff\1\71\1\157\1\145\1\105\1"+
		"\117\1\114\1\172\1\125\1\165\2\172\1\137\1\111\1\103\1\120\1\102\1\101"+
		"\1\151\1\143\1\160\1\124\1\111\1\164\1\114\1\110\1\154\1\150\1\114\1\116"+
		"\1\154\1\156\1\113\1\153\1\111\1\105\1\124\1\117\1\172\1\uffff\1\172\1"+
		"\145\1\116\1\124\1\107\1\111\1\105\1\124\1\121\1\105\1\124\1\111\1\103"+
		"\1\122\2\172\1\114\1\115\1\154\1\155\1\162\1\127\1\101\1\uffff\1\167\1"+
		"\141\1\105\2\uffff\1\145\2\172\1\125\1\165\2\151\1\145\1\164\1\101\1\116"+
		"\1\141\1\156\1\71\1\162\1\172\1\162\1\122\1\172\1\125\1\uffff\1\105\1"+
		"\145\1\127\2\uffff\1\167\1\115\1\124\2\172\1\114\1\124\1\155\1\164\2\172"+
		"\1\111\1\117\1\151\1\125\1\124\1\165\1\164\1\105\1\172\1\145\1\172\1\101"+
		"\1\141\1\116\1\103\1\172\1\137\2\uffff\1\143\1\124\1\101\1\137\1\124\1"+
		"\172\1\137\1\125\1\122\1\172\1\116\1\110\1\105\1\104\1\172\1\144\1\172"+
		"\1\145\1\105\1\113\1\145\1\153\1\122\1\162\1\uffff\1\120\1\160\1\156\1"+
		"\164\1\172\1\137\1\123\1\172\1\163\1\172\1\71\1\166\1\uffff\1\164\1\124"+
		"\1\104\1\123\1\163\1\111\1\151\1\111\1\105\2\uffff\1\105\1\111\1\151\1"+
		"\145\1\124\1\104\1\164\1\120\1\137\1\160\1\137\1\172\1\uffff\3\172\1\107"+
		"\1\124\1\uffff\1\111\1\164\1\172\1\111\1\123\1\172\1\uffff\1\112\1\105"+
		"\1\137\1\uffff\1\107\2\172\1\137\1\uffff\1\137\1\172\1\105\1\172\1\145"+
		"\5\172\1\147\1\172\1\152\1\103\1\uffff\1\143\2\71\1\141\2\172\1\105\2"+
		"\172\1\116\1\156\1\124\1\172\1\137\1\117\1\164\1\172\1\111\1\172\1\151"+
		"\1\172\1\112\1\172\1\152\2\uffff\2\172\1\123\1\172\1\uffff\1\116\1\125"+
		"\1\uffff\1\117\1\172\1\125\1\172\2\uffff\1\101\1\141\1\116\1\uffff\1\156"+
		"\2\uffff\1\172\1\157\1\122\1\162\1\71\1\154\1\162\1\uffff\1\122\1\172"+
		"\1\uffff\1\104\1\144\1\105\1\uffff\1\123\1\116\1\145\1\117\1\uffff\1\157"+
		"\1\uffff\1\117\1\157\2\uffff\1\117\1\123\1\115\1\111\1\uffff\1\116\1\uffff"+
		"\1\103\1\143\2\172\1\151\1\111\1\151\1\55\1\172\1\141\1\145\1\101\1\105"+
		"\1\uffff\1\117\1\157\1\122\1\125\1\172\1\162\1\116\1\156\1\111\1\151\3"+
		"\172\1\116\1\111\1\103\1\143\1\uffff\1\156\1\120\1\160\1\uffff\1\71\1"+
		"\uffff\1\144\1\141\1\104\1\101\1\127\1\167\1\172\1\115\1\uffff\3\172\1"+
		"\116\1\156\3\uffff\1\172\1\121\1\105\1\145\1\172\1\124\1\164\1\71\1\157"+
		"\1\154\1\117\1\114\2\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\125\1\123"+
		"\1\163\2\72\1\124\1\157\1\164\1\117\1\124\3\uffff\1\105\1\123\1\163\2"+
		"\uffff\1\71\1\160\1\151\1\120\1\111\3\172\1\71\1\172\1\155\1\172\1\115"+
		"\2\uffff\1\72\1\uffff\1\145\1\105\1\uffff\1\71\2\172\1\71\1\uffff\1\132"+
		"\1\uffff\1\71\1\uffff\1\71\1\132\1\uffff\3\71\1\132\2\uffff";
	static final String DFA47_acceptS =
		"\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\47\uffff\1\101\1\102\1"+
		"\103\1\uffff\1\114\1\115\1\116\1\117\1\120\1\121\1\123\1\1\1\5\1\2\106"+
		"\uffff\1\122\46\uffff\1\52\27\uffff\1\70\3\uffff\1\60\1\100\24\uffff\1"+
		"\31\3\uffff\1\42\1\41\34\uffff\1\63\1\57\30\uffff\1\61\14\uffff\1\16\11"+
		"\uffff\1\64\1\24\14\uffff\1\73\5\uffff\1\50\6\uffff\1\72\3\uffff\1\51"+
		"\4\uffff\1\54\16\uffff\1\75\30\uffff\1\25\1\27\4\uffff\1\34\2\uffff\1"+
		"\71\4\uffff\1\46\1\55\3\uffff\1\67\1\uffff\1\65\1\62\7\uffff\1\13\2\uffff"+
		"\1\17\3\uffff\1\26\4\uffff\1\44\1\uffff\1\23\2\uffff\1\30\1\33\4\uffff"+
		"\1\37\1\uffff\1\66\15\uffff\1\45\21\uffff\1\56\3\uffff\1\104\1\uffff\1"+
		"\4\10\uffff\1\43\5\uffff\1\32\1\47\1\35\16\uffff\1\21\1\uffff\1\22\2\uffff"+
		"\1\76\12\uffff\1\20\1\36\1\77\3\uffff\1\74\1\105\15\uffff\1\40\1\53\1"+
		"\uffff\1\14\2\uffff\1\106\4\uffff\1\15\1\uffff\1\107\1\uffff\1\113\2\uffff"+
		"\1\110\4\uffff\1\111\1\112";
	static final String DFA47_specialS =
		"\u0238\uffff}>";
	static final String[] DFA47_transitionS = {
			"\1\63\1\71\2\uffff\1\71\22\uffff\1\63\5\uffff\1\62\1\72\1\1\1\5\1\2\1"+
			"\65\1\3\1\65\1\73\1\65\12\64\1\uffff\1\61\1\67\1\66\1\67\2\uffff\1\32"+
			"\1\45\1\34\1\17\1\70\1\42\1\53\1\37\1\12\1\57\1\27\1\35\1\15\1\51\1\47"+
			"\1\21\1\70\1\23\1\31\1\25\1\36\1\13\1\40\3\70\1\10\1\uffff\1\11\1\uffff"+
			"\1\70\1\uffff\1\41\1\46\1\70\1\20\1\70\1\43\1\54\1\55\1\4\1\60\1\30\1"+
			"\56\1\16\1\52\1\50\1\22\1\70\1\24\1\33\1\26\1\70\1\14\1\44\3\70\1\6\1"+
			"\uffff\1\7",
			"\1\74",
			"",
			"",
			"\1\77",
			"",
			"",
			"",
			"",
			"",
			"\1\100\4\uffff\1\101",
			"\1\102",
			"\1\103",
			"\1\104\7\uffff\1\105",
			"\1\106",
			"\1\107\11\uffff\1\111\2\uffff\1\110\2\uffff\1\112",
			"\1\113\14\uffff\1\114",
			"\1\115\3\uffff\1\116",
			"\1\117",
			"\1\121\5\uffff\1\120",
			"\1\123\5\uffff\1\122",
			"\1\124\6\uffff\1\125",
			"\1\126\6\uffff\1\127",
			"\1\130",
			"\1\131",
			"\1\133\11\uffff\1\134\4\uffff\1\132",
			"\1\137\4\uffff\1\136\1\uffff\1\135",
			"\1\140",
			"\1\141",
			"\1\144\3\uffff\1\143\5\uffff\1\142",
			"\1\145",
			"\1\150\7\uffff\1\147\17\uffff\1\146",
			"\1\151",
			"\1\153\4\uffff\1\152",
			"\1\154\10\uffff\1\155",
			"\1\156\10\uffff\1\157",
			"\1\160",
			"\1\161\14\uffff\1\162\6\uffff\1\163",
			"\1\164\14\uffff\1\165\6\uffff\1\166",
			"\1\170\3\uffff\1\167",
			"\1\171",
			"\1\172",
			"\1\173",
			"\1\174",
			"\1\175",
			"\1\176",
			"\1\u0080\3\uffff\1\177",
			"\1\u0081\15\uffff\1\u0082",
			"\1\u0083\15\uffff\1\u0084",
			"",
			"",
			"",
			"\1\73\1\uffff\12\u0086",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0088\1\u0087",
			"\1\u008b\17\uffff\1\u0089\1\u008a",
			"\1\u008c",
			"\1\u008d",
			"\1\u008e",
			"\1\u008f",
			"\1\u0090",
			"\1\u0091",
			"\1\u0092\6\uffff\1\u0093",
			"\1\u0094",
			"\1\u0095",
			"\1\u0096",
			"\1\u0097\6\uffff\1\u0098",
			"\1\u0099",
			"\1\u009a",
			"\1\u009b",
			"\1\u009c",
			"\1\u009d",
			"\1\u009e",
			"\1\u009f",
			"\1\u00a0",
			"\1\u00a1",
			"\1\u00a2",
			"\1\u00a3",
			"\1\u00a4",
			"\1\u00a5",
			"\1\u00a6",
			"\1\u00a7",
			"\1\u00a8",
			"\1\u00a9",
			"\1\u00aa",
			"\12\70\7\uffff\2\70\1\u00ab\27\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00ad",
			"\1\u00ae",
			"\1\u00b0\6\uffff\1\u00af",
			"\1\u00b1",
			"\1\u00b3\1\uffff\1\u00b2",
			"\1\u00b4",
			"\1\u00b5",
			"\1\u00b6",
			"\1\u00b7",
			"\1\u00b8",
			"\1\u00ba\3\uffff\1\u00b9",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00bb\27\70",
			"\1\u00bc",
			"\1\u00bd",
			"\1\u00be",
			"\1\u00bf",
			"\1\u00c0",
			"\1\u00c1",
			"\1\u00c2",
			"\1\u00c3",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00c5",
			"\1\u00c6",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\3\70\1\u00c7\26\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u00ca\26\70",
			"\1\u00cb",
			"\1\u00cc",
			"\1\u00cd",
			"\1\u00ce",
			"\1\u00cf",
			"\1\u00d1\1\uffff\1\u00d0",
			"\1\u00d2",
			"\1\u00d3",
			"\1\u00d4",
			"\1\u00d5",
			"\1\u00d6",
			"",
			"\1\73\1\uffff\12\u00d7",
			"\1\u00d8\11\uffff\1\u00d9",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00df",
			"\1\u00e0",
			"\12\70\7\uffff\32\70\4\uffff\1\u00e1\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u00e4",
			"\1\u00e6\3\uffff\1\u00e5",
			"\1\u00e7",
			"\1\u00e8",
			"\1\u00e9",
			"\1\u00ea",
			"\1\u00ec\3\uffff\1\u00eb",
			"\1\u00ed",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1",
			"\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\1\u00f6",
			"\1\u00f7",
			"\1\u00f8",
			"\1\u00f9",
			"\1\u00fa",
			"\1\u00fb",
			"\1\u00fc",
			"\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0102",
			"\1\u0103",
			"\1\u0104",
			"\1\u0105",
			"\1\u0106",
			"\1\u0107",
			"\1\u0108",
			"\1\u0109",
			"\1\u010a",
			"\1\u010b",
			"\1\u010c",
			"\1\u010d",
			"\1\u010e",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u010f",
			"\1\u0110",
			"\1\u0111",
			"\1\u0112",
			"\1\u0113",
			"\1\u0114",
			"\1\u0115",
			"",
			"\1\u0116",
			"\1\u0117",
			"\1\u0118",
			"",
			"",
			"\1\u0119",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u011b",
			"\1\u011c",
			"\1\u011d",
			"\1\u011e",
			"\1\u011f",
			"\1\u0120",
			"\1\u0121",
			"\1\u0122",
			"\1\u0123",
			"\1\u0124",
			"\1\73\1\uffff\12\u0125",
			"\1\u0126",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0128",
			"\1\u0129",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u012a",
			"",
			"\1\u012b",
			"\1\u012c",
			"\1\u012d",
			"",
			"",
			"\1\u012e",
			"\1\u012f",
			"\1\u0130",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0133",
			"\1\u0134",
			"\1\u0135",
			"\1\u0136",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0137",
			"\1\u0138",
			"\1\u0139",
			"\1\u013a",
			"\1\u013b",
			"\1\u013c",
			"\1\u013d",
			"\1\u013e",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0140",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0141",
			"\1\u0142",
			"\1\u0143",
			"\1\u0144",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0146",
			"",
			"",
			"\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a",
			"\1\u014b",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u014d",
			"\1\u014e",
			"\1\u014f",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0151",
			"\1\u0152",
			"\1\u0153",
			"\1\u0154",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0156",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015a",
			"\1\u015b",
			"\1\u015c",
			"\1\u015d",
			"",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0162",
			"\1\u0163",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0165",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0166\1\73\1\uffff\12\u0167",
			"\1\u0168",
			"",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170",
			"\1\u0171",
			"",
			"",
			"\1\u0172",
			"\1\u0173",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u017f",
			"\1\u0180",
			"",
			"\1\u0181",
			"\1\u0182",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0184",
			"\1\u0185",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\u0187",
			"\1\u0188",
			"\1\u0189",
			"",
			"\1\u018a",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u018d",
			"",
			"\1\u018e",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u018f",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0191",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0194",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0195",
			"\1\u0196",
			"",
			"\1\u0197",
			"\12\u0198",
			"\1\73\1\uffff\12\u0167",
			"\1\u0199",
			"\12\70\7\uffff\32\70\4\uffff\1\u019a\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\u019c\1\uffff\32\70",
			"\1\u019d",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u019f",
			"\1\u01a0",
			"\1\u01a1",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01a3",
			"\1\u01a4",
			"\1\u01a5",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01a6",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01a8",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01aa",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01ab",
			"",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01ae",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\u01af",
			"\1\u01b0",
			"",
			"\1\u01b1",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01b3",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"",
			"\1\u01b5",
			"\1\u01b6",
			"\1\u01b7",
			"",
			"\1\u01b8",
			"",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01b9",
			"\1\u01ba",
			"\1\u01bb",
			"\12\u01bc",
			"\1\u01bd",
			"\1\u01be\11\uffff\1\u01bf",
			"",
			"\1\u01c0\11\uffff\1\u01c1",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"",
			"\1\u01ca",
			"",
			"\1\u01cb",
			"\1\u01cc",
			"",
			"",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"",
			"\1\u01d1",
			"",
			"\1\u01d2",
			"\1\u01d3",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01d5",
			"\1\u01d6",
			"\1\u01d7",
			"\1\u01d9",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"",
			"\1\u01df",
			"\1\u01e0",
			"\1\u01e1",
			"\1\u01e2",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01e4",
			"\1\u01e5",
			"\1\u01e6",
			"\1\u01e7",
			"\1\u01e8",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01ec",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"",
			"\1\u01f0",
			"\1\u01f1",
			"\1\u01f2",
			"",
			"\12\u01f3",
			"",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\1\u01f8",
			"\1\u01f9",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01fb",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u01fd",
			"\1\u01fe",
			"",
			"",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0203",
			"\1\u0204",
			"\12\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f",
			"\1\u0210",
			"\1\u0210",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216",
			"",
			"",
			"",
			"\1\u0217",
			"\1\u0218",
			"\1\u0219",
			"",
			"",
			"\12\u021a",
			"\1\u021b",
			"\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\u0221",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0223",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\1\u0224",
			"",
			"",
			"\1\u0226",
			"",
			"\1\u0227",
			"\1\u0228",
			"",
			"\12\u0229",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
			"\12\u022b",
			"",
			"\1\u022d\37\uffff\1\u022e",
			"",
			"\12\u022f",
			"",
			"\12\u0230",
			"\1\u0232\53\uffff\1\u022e",
			"",
			"\12\u0233",
			"\12\u0234",
			"\12\u0235",
			"\1\u0237\1\uffff\1\u0237\54\uffff\1\u022e",
			"",
			""
	};

	static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
	static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
	static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
	static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
	static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
	static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
	static final short[][] DFA47_transition;

	static {
		int numStates = DFA47_transitionS.length;
		DFA47_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
		}
	}

	protected class DFA47 extends DFA {

		public DFA47(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 47;
			this.eot = DFA47_eot;
			this.eof = DFA47_eof;
			this.min = DFA47_min;
			this.max = DFA47_max;
			this.accept = DFA47_accept;
			this.special = DFA47_special;
			this.transition = DFA47_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__89 | T__90 | T__91 | T__92 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | INSERT | INSERT_HADOOP | INSERT_REALTIME | INTO | VALUES | MAX_WINDOW | DELIMITER | PARTITION | ROLLUP | DROP | TABLE | DELETE | KAFKA | STRING | ISO | AUTO_ISO | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | HYPER_UNIQUE | MIN | MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ASC | DESC | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | OPT_AMPERSAND | WS | DATE_YEAR_MONTH_ONLY | DATE | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | NEWLINE | SINGLE_QUOTE_STRING | LONG | FLOAT );";
		}
	}

}
