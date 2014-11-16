package com.yahoo.sql4d.converter;

// $ANTLR 3.5 /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2014-11-15 16:25:58
import org.antlr.runtime.*;

@SuppressWarnings("all")
public class druidGLexer extends Lexer {

    public static final int EOF = -1;
    public static final int T__88 = 88;
    public static final int T__89 = 89;
    public static final int T__90 = 90;
    public static final int T__91 = 91;
    public static final int AND = 4;
    public static final int ARITH_OPER = 5;
    public static final int AS = 6;
    public static final int ASC = 7;
    public static final int AUTO_ISO = 8;
    public static final int BETWEEN = 9;
    public static final int BREAK = 10;
    public static final int BY = 11;
    public static final int COMPARE_OPER = 12;
    public static final int CONTAINS = 13;
    public static final int COUNT = 14;
    public static final int DATE = 15;
    public static final int DATE_HOUR = 16;
    public static final int DATE_HOUR_MIN = 17;
    public static final int DATE_HOUR_MIN_SEC = 18;
    public static final int DATE_HOUR_MIN_SEC_SUB = 19;
    public static final int DATE_HOUR_MIN_SEC_SUB_TZ = 20;
    public static final int DATE_HOUR_MIN_SEC_SUB_UTC_TZ = 21;
    public static final int DATE_YEAR_MONTH_ONLY = 22;
    public static final int DATE_YEAR_ONLY = 23;
    public static final int DELETE = 24;
    public static final int DELIMITOR = 25;
    public static final int DESC = 26;
    public static final int DOUBLE_SUM = 27;
    public static final int DROP = 28;
    public static final int DURATION = 29;
    public static final int EQUALS = 30;
    public static final int ESC_SEQ = 31;
    public static final int FIELD_ACCESS = 32;
    public static final int FLOAT = 33;
    public static final int FROM = 34;
    public static final int GROUP = 35;
    public static final int HAVING = 36;
    public static final int HEX_DIGIT = 37;
    public static final int HINT = 38;
    public static final int ID = 39;
    public static final int INCLUDE = 40;
    public static final int INSERT = 41;
    public static final int INSERT_HADOOP = 42;
    public static final int INSERT_REALTIME = 43;
    public static final int INTO = 44;
    public static final int ISO = 45;
    public static final int JAVASCRIPT = 46;
    public static final int JOIN = 47;
    public static final int KAFKA = 48;
    public static final int LCURLY = 49;
    public static final int LEFT_JOIN = 50;
    public static final int LIKE = 51;
    public static final int LIMIT = 52;
    public static final int LONG = 53;
    public static final int LONG_SUM = 54;
    public static final int LPARAN = 55;
    public static final int LSQUARE = 56;
    public static final int MAX = 57;
    public static final int MAX_WINDOW = 58;
    public static final int MIN = 59;
    public static final int NEWLINE = 60;
    public static final int NOT = 61;
    public static final int NUM = 62;
    public static final int OCTAL_ESC = 63;
    public static final int ON = 64;
    public static final int OPT_AMPERSAND = 65;
    public static final int OPT_SEMI_COLON = 66;
    public static final int OR = 67;
    public static final int ORDER = 68;
    public static final int PARTITION = 69;
    public static final int PERIOD = 70;
    public static final int RCURLY = 71;
    public static final int RIGHT_JOIN = 72;
    public static final int ROLLUP = 73;
    public static final int RPARAN = 74;
    public static final int RSQUARE = 75;
    public static final int SELECT = 76;
    public static final int SINGLE_QUOTE_STRING = 77;
    public static final int SORT = 78;
    public static final int STRING = 79;
    public static final int TABLE = 80;
    public static final int THEN = 81;
    public static final int UNICODE_ESC = 82;
    public static final int UNIQUE = 83;
    public static final int VALUES = 84;
    public static final int WHERE = 85;
    public static final int WHICH = 86;
    public static final int WS = 87;

	// delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[]{};
    }

    public druidGLexer() {
    }

    public druidGLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }

    public druidGLexer(CharStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public String getGrammarFileName() {
        return "/Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g";
    }

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:2:7: ( '(*)' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:2:9: '(*)'
            {
                match("(*)");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:3:7: ( '*' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:3:9: '*'
            {
                match('*');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:4:7: ( ',' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:4:9: ','
            {
                match(',');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:5:7: ( 'interval' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:5:9: 'interval'
            {
                match("interval");

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "T__91"

    // $ANTLR start "LPARAN"
    public final void mLPARAN() throws RecognitionException {
        try {
            int _type = LPARAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:546:8: ( '(' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:546:11: '('
            {
                match('(');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "LPARAN"

    // $ANTLR start "RPARAN"
    public final void mRPARAN() throws RecognitionException {
        try {
            int _type = RPARAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:547:8: ( ')' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:547:11: ')'
            {
                match(')');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "RPARAN"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:548:8: ( '{' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:548:11: '{'
            {
                match('{');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:549:8: ( '}' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:549:11: '}'
            {
                match('}');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "RCURLY"

    // $ANTLR start "LSQUARE"
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:550:9: ( '[' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:550:12: '['
            {
                match('[');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "LSQUARE"

    // $ANTLR start "RSQUARE"
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:551:9: ( ']' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:551:12: ']'
            {
                match(']');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "RSQUARE"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:554:11: ( ( 'INSERT' | 'insert' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:554:12: ( 'INSERT' | 'insert' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:554:12: ( 'INSERT' | 'insert' )
                int alt1 = 2;
                int LA1_0 = input.LA(1);
                if ((LA1_0 == 'I')) {
                    alt1 = 1;
                } else if ((LA1_0 == 'i')) {
                    alt1 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 1, 0, input);
                    throw nvae;
                }

                switch (alt1) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:554:13: 'INSERT'
                    {
                        match("INSERT");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:554:22: 'insert'
                    {
                        match("insert");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "INSERT"

    // $ANTLR start "INSERT_HADOOP"
    public final void mINSERT_HADOOP() throws RecognitionException {
        try {
            int _type = INSERT_HADOOP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:555:15: ( ( 'INSERT_HADOOP' | 'insert_hadoop' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:555:16: ( 'INSERT_HADOOP' | 'insert_hadoop' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:555:16: ( 'INSERT_HADOOP' | 'insert_hadoop' )
                int alt2 = 2;
                int LA2_0 = input.LA(1);
                if ((LA2_0 == 'I')) {
                    alt2 = 1;
                } else if ((LA2_0 == 'i')) {
                    alt2 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 2, 0, input);
                    throw nvae;
                }

                switch (alt2) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:555:17: 'INSERT_HADOOP'
                    {
                        match("INSERT_HADOOP");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:555:33: 'insert_hadoop'
                    {
                        match("insert_hadoop");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "INSERT_HADOOP"

    // $ANTLR start "INSERT_REALTIME"
    public final void mINSERT_REALTIME() throws RecognitionException {
        try {
            int _type = INSERT_REALTIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:556:17: ( ( 'INSERT_REALTIME' | 'insert_realtime' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:556:18: ( 'INSERT_REALTIME' | 'insert_realtime' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:556:18: ( 'INSERT_REALTIME' | 'insert_realtime' )
                int alt3 = 2;
                int LA3_0 = input.LA(1);
                if ((LA3_0 == 'I')) {
                    alt3 = 1;
                } else if ((LA3_0 == 'i')) {
                    alt3 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 3, 0, input);
                    throw nvae;
                }

                switch (alt3) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:556:19: 'INSERT_REALTIME'
                    {
                        match("INSERT_REALTIME");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:556:37: 'insert_realtime'
                    {
                        match("insert_realtime");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "INSERT_REALTIME"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:557:15: ( ( 'INTO' | 'into' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:557:16: ( 'INTO' | 'into' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:557:16: ( 'INTO' | 'into' )
                int alt4 = 2;
                int LA4_0 = input.LA(1);
                if ((LA4_0 == 'I')) {
                    alt4 = 1;
                } else if ((LA4_0 == 'i')) {
                    alt4 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 4, 0, input);
                    throw nvae;
                }

                switch (alt4) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:557:17: 'INTO'
                    {
                        match("INTO");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:557:24: 'into'
                    {
                        match("into");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "INTO"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:17: ( ( 'VALUES' | 'values' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:18: ( 'VALUES' | 'values' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:18: ( 'VALUES' | 'values' )
                int alt5 = 2;
                int LA5_0 = input.LA(1);
                if ((LA5_0 == 'V')) {
                    alt5 = 1;
                } else if ((LA5_0 == 'v')) {
                    alt5 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 5, 0, input);
                    throw nvae;
                }

                switch (alt5) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:19: 'VALUES'
                    {
                        match("VALUES");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:558:28: 'values'
                    {
                        match("values");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "VALUES"

    // $ANTLR start "MAX_WINDOW"
    public final void mMAX_WINDOW() throws RecognitionException {
        try {
            int _type = MAX_WINDOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:561:17: ( ( 'MAX_WINDOW' | 'max_window' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:561:18: ( 'MAX_WINDOW' | 'max_window' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:561:18: ( 'MAX_WINDOW' | 'max_window' )
                int alt6 = 2;
                int LA6_0 = input.LA(1);
                if ((LA6_0 == 'M')) {
                    alt6 = 1;
                } else if ((LA6_0 == 'm')) {
                    alt6 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 6, 0, input);
                    throw nvae;
                }

                switch (alt6) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:561:19: 'MAX_WINDOW'
                    {
                        match("MAX_WINDOW");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:561:32: 'max_window'
                    {
                        match("max_window");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "MAX_WINDOW"

    // $ANTLR start "DELIMITOR"
    public final void mDELIMITOR() throws RecognitionException {
        try {
            int _type = DELIMITOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:563:17: ( ( 'DELIMITOR' | 'delimitor' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:563:18: ( 'DELIMITOR' | 'delimitor' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:563:18: ( 'DELIMITOR' | 'delimitor' )
                int alt7 = 2;
                int LA7_0 = input.LA(1);
                if ((LA7_0 == 'D')) {
                    alt7 = 1;
                } else if ((LA7_0 == 'd')) {
                    alt7 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 7, 0, input);
                    throw nvae;
                }

                switch (alt7) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:563:19: 'DELIMITOR'
                    {
                        match("DELIMITOR");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:563:31: 'delimitor'
                    {
                        match("delimitor");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DELIMITOR"

    // $ANTLR start "PARTITION"
    public final void mPARTITION() throws RecognitionException {
        try {
            int _type = PARTITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:564:17: ( ( 'PARTITION' | 'partition' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:564:18: ( 'PARTITION' | 'partition' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:564:18: ( 'PARTITION' | 'partition' )
                int alt8 = 2;
                int LA8_0 = input.LA(1);
                if ((LA8_0 == 'P')) {
                    alt8 = 1;
                } else if ((LA8_0 == 'p')) {
                    alt8 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 8, 0, input);
                    throw nvae;
                }

                switch (alt8) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:564:19: 'PARTITION'
                    {
                        match("PARTITION");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:564:31: 'partition'
                    {
                        match("partition");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "PARTITION"

    // $ANTLR start "ROLLUP"
    public final void mROLLUP() throws RecognitionException {
        try {
            int _type = ROLLUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:17: ( ( 'ROLLUP' | 'rollup' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:18: ( 'ROLLUP' | 'rollup' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:18: ( 'ROLLUP' | 'rollup' )
                int alt9 = 2;
                int LA9_0 = input.LA(1);
                if ((LA9_0 == 'R')) {
                    alt9 = 1;
                } else if ((LA9_0 == 'r')) {
                    alt9 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 9, 0, input);
                    throw nvae;
                }

                switch (alt9) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:19: 'ROLLUP'
                    {
                        match("ROLLUP");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:565:31: 'rollup'
                    {
                        match("rollup");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "ROLLUP"

    // $ANTLR start "DROP"
    public final void mDROP() throws RecognitionException {
        try {
            int _type = DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:567:17: ( ( 'DROP' | 'drop' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:567:18: ( 'DROP' | 'drop' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:567:18: ( 'DROP' | 'drop' )
                int alt10 = 2;
                int LA10_0 = input.LA(1);
                if ((LA10_0 == 'D')) {
                    alt10 = 1;
                } else if ((LA10_0 == 'd')) {
                    alt10 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 10, 0, input);
                    throw nvae;
                }

                switch (alt10) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:567:19: 'DROP'
                    {
                        match("DROP");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:567:26: 'drop'
                    {
                        match("drop");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DROP"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:568:17: ( ( 'TABLE' | 'table' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:568:18: ( 'TABLE' | 'table' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:568:18: ( 'TABLE' | 'table' )
                int alt11 = 2;
                int LA11_0 = input.LA(1);
                if ((LA11_0 == 'T')) {
                    alt11 = 1;
                } else if ((LA11_0 == 't')) {
                    alt11 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 11, 0, input);
                    throw nvae;
                }

                switch (alt11) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:568:19: 'TABLE'
                    {
                        match("TABLE");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:568:27: 'table'
                    {
                        match("table");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "TABLE"

    // $ANTLR start "DELETE"
    public final void mDELETE() throws RecognitionException {
        try {
            int _type = DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:569:17: ( ( 'DELETE' | 'delete' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:569:18: ( 'DELETE' | 'delete' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:569:18: ( 'DELETE' | 'delete' )
                int alt12 = 2;
                int LA12_0 = input.LA(1);
                if ((LA12_0 == 'D')) {
                    alt12 = 1;
                } else if ((LA12_0 == 'd')) {
                    alt12 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 12, 0, input);
                    throw nvae;
                }

                switch (alt12) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:569:19: 'DELETE'
                    {
                        match("DELETE");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:569:28: 'delete'
                    {
                        match("delete");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DELETE"

    // $ANTLR start "KAFKA"
    public final void mKAFKA() throws RecognitionException {
        try {
            int _type = KAFKA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:17: ( ( 'KAFKA' | 'kafka' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:18: ( 'KAFKA' | 'kafka' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:18: ( 'KAFKA' | 'kafka' )
                int alt13 = 2;
                int LA13_0 = input.LA(1);
                if ((LA13_0 == 'K')) {
                    alt13 = 1;
                } else if ((LA13_0 == 'k')) {
                    alt13 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 13, 0, input);
                    throw nvae;
                }

                switch (alt13) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:19: 'KAFKA'
                    {
                        match("KAFKA");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:570:27: 'kafka'
                    {
                        match("kafka");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "KAFKA"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:574:9: ( ( 'STRING' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:574:10: ( 'STRING' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:574:10: ( 'STRING' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:574:11: 'STRING'
                {
                    match("STRING");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "STRING"

    // $ANTLR start "ISO"
    public final void mISO() throws RecognitionException {
        try {
            int _type = ISO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:575:6: ( ( 'ISO' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:575:7: ( 'ISO' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:575:7: ( 'ISO' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:575:8: 'ISO'
                {
                    match("ISO");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "ISO"

    // $ANTLR start "AUTO_ISO"
    public final void mAUTO_ISO() throws RecognitionException {
        try {
            int _type = AUTO_ISO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:576:10: ( ( 'AUTO_ISO' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:576:11: ( 'AUTO_ISO' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:576:11: ( 'AUTO_ISO' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:576:12: 'AUTO_ISO'
                {
                    match("AUTO_ISO");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "AUTO_ISO"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:579:9: ( ( 'SELECT' | 'select' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:579:11: ( 'SELECT' | 'select' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:579:11: ( 'SELECT' | 'select' )
                int alt14 = 2;
                int LA14_0 = input.LA(1);
                if ((LA14_0 == 'S')) {
                    alt14 = 1;
                } else if ((LA14_0 == 's')) {
                    alt14 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 14, 0, input);
                    throw nvae;
                }

                switch (alt14) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:579:12: 'SELECT'
                    {
                        match("SELECT");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:579:21: 'select'
                    {
                        match("select");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "SELECT"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:581:8: ( ( 'COUNT' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:581:10: ( 'COUNT' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:581:10: ( 'COUNT' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:581:11: 'COUNT'
                {
                    match("COUNT");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "COUNT"

    // $ANTLR start "LONG_SUM"
    public final void mLONG_SUM() throws RecognitionException {
        try {
            int _type = LONG_SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:582:10: ( ( 'LONG_SUM' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:582:12: ( 'LONG_SUM' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:582:12: ( 'LONG_SUM' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:582:13: 'LONG_SUM'
                {
                    match("LONG_SUM");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "LONG_SUM"

    // $ANTLR start "DOUBLE_SUM"
    public final void mDOUBLE_SUM() throws RecognitionException {
        try {
            int _type = DOUBLE_SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:583:12: ( ( 'DOUBLE_SUM' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:583:14: ( 'DOUBLE_SUM' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:583:14: ( 'DOUBLE_SUM' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:583:15: 'DOUBLE_SUM'
                {
                    match("DOUBLE_SUM");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DOUBLE_SUM"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:584:9: ( ( 'UNIQUE' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:584:11: ( 'UNIQUE' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:584:11: ( 'UNIQUE' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:584:12: 'UNIQUE'
                {
                    match("UNIQUE");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "UNIQUE"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:585:6: ( ( 'MIN' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:585:8: ( 'MIN' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:585:8: ( 'MIN' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:585:9: 'MIN'
                {
                    match("MIN");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "MIN"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:586:5: ( ( 'MAX' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:586:7: ( 'MAX' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:586:7: ( 'MAX' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:586:8: 'MAX'
                {
                    match("MAX");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "MAX"

    // $ANTLR start "DURATION"
    public final void mDURATION() throws RecognitionException {
        try {
            int _type = DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:588:9: ( ( 'DURATION' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:588:11: ( 'DURATION' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:588:11: ( 'DURATION' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:588:12: 'DURATION'
                {
                    match("DURATION");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DURATION"

    // $ANTLR start "PERIOD"
    public final void mPERIOD() throws RecognitionException {
        try {
            int _type = PERIOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:589:8: ( ( 'PERIOD' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:589:10: ( 'PERIOD' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:589:10: ( 'PERIOD' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:589:11: 'PERIOD'
                {
                    match("PERIOD");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "PERIOD"

    // $ANTLR start "INCLUDE"
    public final void mINCLUDE() throws RecognitionException {
        try {
            int _type = INCLUDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:590:9: ( ( 'INCLUDE' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:590:11: ( 'INCLUDE' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:590:11: ( 'INCLUDE' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:590:12: 'INCLUDE'
                {
                    match("INCLUDE");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "INCLUDE"

    // $ANTLR start "WHICH"
    public final void mWHICH() throws RecognitionException {
        try {
            int _type = WHICH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:592:7: ( ( 'WHICH' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:592:9: ( 'WHICH' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:592:9: ( 'WHICH' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:592:10: 'WHICH'
                {
                    match("WHICH");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "WHICH"

    // $ANTLR start "CONTAINS"
    public final void mCONTAINS() throws RecognitionException {
        try {
            int _type = CONTAINS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:593:9: ( ( 'CONTAINS' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:593:11: ( 'CONTAINS' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:593:11: ( 'CONTAINS' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:593:12: 'CONTAINS'
                {
                    match("CONTAINS");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "CONTAINS"

    // $ANTLR start "SORT"
    public final void mSORT() throws RecognitionException {
        try {
            int _type = SORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:594:6: ( ( 'SORT' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:594:8: ( 'SORT' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:594:8: ( 'SORT' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:594:9: 'SORT'
                {
                    match("SORT");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "SORT"

    // $ANTLR start "HINT"
    public final void mHINT() throws RecognitionException {
        try {
            int _type = HINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:596:6: ( ( 'HINT' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:596:8: ( 'HINT' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:596:8: ( 'HINT' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:596:9: 'HINT'
                {
                    match("HINT");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "HINT"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:598:5: ( ( 'AS' | 'as' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:598:7: ( 'AS' | 'as' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:598:7: ( 'AS' | 'as' )
                int alt15 = 2;
                int LA15_0 = input.LA(1);
                if ((LA15_0 == 'A')) {
                    alt15 = 1;
                } else if ((LA15_0 == 'a')) {
                    alt15 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 15, 0, input);
                    throw nvae;
                }

                switch (alt15) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:598:8: 'AS'
                    {
                        match("AS");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:598:13: 'as'
                    {
                        match("as");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "AS"

    // $ANTLR start "FIELD_ACCESS"
    public final void mFIELD_ACCESS() throws RecognitionException {
        try {
            int _type = FIELD_ACCESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:14: ( ( 'FIELD_ACCESS' | 'field_access' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:16: ( 'FIELD_ACCESS' | 'field_access' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:16: ( 'FIELD_ACCESS' | 'field_access' )
                int alt16 = 2;
                int LA16_0 = input.LA(1);
                if ((LA16_0 == 'F')) {
                    alt16 = 1;
                } else if ((LA16_0 == 'f')) {
                    alt16 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 16, 0, input);
                    throw nvae;
                }

                switch (alt16) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:17: 'FIELD_ACCESS'
                    {
                        match("FIELD_ACCESS");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:599:32: 'field_access'
                    {
                        match("field_access");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "FIELD_ACCESS"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:7: ( ( 'FROM' | 'from' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:9: ( 'FROM' | 'from' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:9: ( 'FROM' | 'from' )
                int alt17 = 2;
                int LA17_0 = input.LA(1);
                if ((LA17_0 == 'F')) {
                    alt17 = 1;
                } else if ((LA17_0 == 'f')) {
                    alt17 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 17, 0, input);
                    throw nvae;
                }

                switch (alt17) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:10: 'FROM'
                    {
                        match("FROM");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:600:17: 'from'
                    {
                        match("from");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "FROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:8: ( ( 'WHERE' | 'where' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:10: ( 'WHERE' | 'where' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:10: ( 'WHERE' | 'where' )
                int alt18 = 2;
                int LA18_0 = input.LA(1);
                if ((LA18_0 == 'W')) {
                    alt18 = 1;
                } else if ((LA18_0 == 'w')) {
                    alt18 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 18, 0, input);
                    throw nvae;
                }

                switch (alt18) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:11: 'WHERE'
                    {
                        match("WHERE");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:601:19: 'where'
                    {
                        match("where");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "WHERE"

    // $ANTLR start "BETWEEN"
    public final void mBETWEEN() throws RecognitionException {
        try {
            int _type = BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:9: ( ( 'BETWEEN' | 'between' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:11: ( 'BETWEEN' | 'between' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:11: ( 'BETWEEN' | 'between' )
                int alt19 = 2;
                int LA19_0 = input.LA(1);
                if ((LA19_0 == 'B')) {
                    alt19 = 1;
                } else if ((LA19_0 == 'b')) {
                    alt19 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 19, 0, input);
                    throw nvae;
                }

                switch (alt19) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:12: 'BETWEEN'
                    {
                        match("BETWEEN");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:602:22: 'between'
                    {
                        match("between");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "BETWEEN"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:6: ( ( 'AND' | 'and' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:8: ( 'AND' | 'and' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:8: ( 'AND' | 'and' )
                int alt20 = 2;
                int LA20_0 = input.LA(1);
                if ((LA20_0 == 'A')) {
                    alt20 = 1;
                } else if ((LA20_0 == 'a')) {
                    alt20 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 20, 0, input);
                    throw nvae;
                }

                switch (alt20) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:9: 'AND'
                    {
                        match("AND");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:603:15: 'and'
                    {
                        match("and");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "AND"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:604:5: ( ( 'OR' | 'or' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:604:7: ( 'OR' | 'or' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:604:7: ( 'OR' | 'or' )
                int alt21 = 2;
                int LA21_0 = input.LA(1);
                if ((LA21_0 == 'O')) {
                    alt21 = 1;
                } else if ((LA21_0 == 'o')) {
                    alt21 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 21, 0, input);
                    throw nvae;
                }

                switch (alt21) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:604:8: 'OR'
                    {
                        match("OR");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:604:13: 'or'
                    {
                        match("or");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "OR"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:605:6: ( ( 'NOT' | 'not' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:605:8: ( 'NOT' | 'not' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:605:8: ( 'NOT' | 'not' )
                int alt22 = 2;
                int LA22_0 = input.LA(1);
                if ((LA22_0 == 'N')) {
                    alt22 = 1;
                } else if ((LA22_0 == 'n')) {
                    alt22 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 22, 0, input);
                    throw nvae;
                }

                switch (alt22) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:605:9: 'NOT'
                    {
                        match("NOT");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:605:15: 'not'
                    {
                        match("not");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "NOT"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:7: ( ( 'GROUP' | 'group' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:9: ( 'GROUP' | 'group' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:9: ( 'GROUP' | 'group' )
                int alt23 = 2;
                int LA23_0 = input.LA(1);
                if ((LA23_0 == 'G')) {
                    alt23 = 1;
                } else if ((LA23_0 == 'g')) {
                    alt23 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 23, 0, input);
                    throw nvae;
                }

                switch (alt23) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:10: 'GROUP'
                    {
                        match("GROUP");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:606:20: 'group'
                    {
                        match("group");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "GROUP"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:607:5: ( ( 'ASC' | 'asc' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:607:7: ( 'ASC' | 'asc' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:607:7: ( 'ASC' | 'asc' )
                int alt24 = 2;
                int LA24_0 = input.LA(1);
                if ((LA24_0 == 'A')) {
                    alt24 = 1;
                } else if ((LA24_0 == 'a')) {
                    alt24 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 24, 0, input);
                    throw nvae;
                }

                switch (alt24) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:607:8: 'ASC'
                    {
                        match("ASC");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:607:16: 'asc'
                    {
                        match("asc");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "ASC"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:6: ( ( 'DESC' | 'desc' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:8: ( 'DESC' | 'desc' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:8: ( 'DESC' | 'desc' )
                int alt25 = 2;
                int LA25_0 = input.LA(1);
                if ((LA25_0 == 'D')) {
                    alt25 = 1;
                } else if ((LA25_0 == 'd')) {
                    alt25 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 25, 0, input);
                    throw nvae;
                }

                switch (alt25) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:9: 'DESC'
                    {
                        match("DESC");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:608:18: 'desc'
                    {
                        match("desc");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DESC"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:7: ( ( 'ORDER' | 'order' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:9: ( 'ORDER' | 'order' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:9: ( 'ORDER' | 'order' )
                int alt26 = 2;
                int LA26_0 = input.LA(1);
                if ((LA26_0 == 'O')) {
                    alt26 = 1;
                } else if ((LA26_0 == 'o')) {
                    alt26 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 26, 0, input);
                    throw nvae;
                }

                switch (alt26) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:10: 'ORDER'
                    {
                        match("ORDER");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:609:20: 'order'
                    {
                        match("order");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "ORDER"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:8: ( ( 'HAVING' | 'having' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:10: ( 'HAVING' | 'having' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:10: ( 'HAVING' | 'having' )
                int alt27 = 2;
                int LA27_0 = input.LA(1);
                if ((LA27_0 == 'H')) {
                    alt27 = 1;
                } else if ((LA27_0 == 'h')) {
                    alt27 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 27, 0, input);
                    throw nvae;
                }

                switch (alt27) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:11: 'HAVING'
                    {
                        match("HAVING");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:610:22: 'having'
                    {
                        match("having");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "HAVING"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:611:7: ( ( 'BREAK' | 'break' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:611:9: ( 'BREAK' | 'break' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:611:9: ( 'BREAK' | 'break' )
                int alt28 = 2;
                int LA28_0 = input.LA(1);
                if ((LA28_0 == 'B')) {
                    alt28 = 1;
                } else if ((LA28_0 == 'b')) {
                    alt28 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 28, 0, input);
                    throw nvae;
                }

                switch (alt28) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:611:10: 'BREAK'
                    {
                        match("BREAK");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:611:20: 'break'
                    {
                        match("break");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "BREAK"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:4: ( ( 'BY' | 'by' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:6: ( 'BY' | 'by' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:6: ( 'BY' | 'by' )
                int alt29 = 2;
                int LA29_0 = input.LA(1);
                if ((LA29_0 == 'B')) {
                    alt29 = 1;
                } else if ((LA29_0 == 'b')) {
                    alt29 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 29, 0, input);
                    throw nvae;
                }

                switch (alt29) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:7: 'BY'
                    {
                        match("BY");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:612:14: 'by'
                    {
                        match("by");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "BY"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:7: ( ( 'LIMIT' | 'limit' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:9: ( 'LIMIT' | 'limit' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:9: ( 'LIMIT' | 'limit' )
                int alt30 = 2;
                int LA30_0 = input.LA(1);
                if ((LA30_0 == 'L')) {
                    alt30 = 1;
                } else if ((LA30_0 == 'l')) {
                    alt30 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 30, 0, input);
                    throw nvae;
                }

                switch (alt30) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:10: 'LIMIT'
                    {
                        match("LIMIT");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:614:20: 'limit'
                    {
                        match("limit");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "LIMIT"

    // $ANTLR start "LIKE"
    public final void mLIKE() throws RecognitionException {
        try {
            int _type = LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:6: ( ( 'LIKE' | 'like' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:8: ( 'LIKE' | 'like' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:8: ( 'LIKE' | 'like' )
                int alt31 = 2;
                int LA31_0 = input.LA(1);
                if ((LA31_0 == 'L')) {
                    alt31 = 1;
                } else if ((LA31_0 == 'l')) {
                    alt31 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 31, 0, input);
                    throw nvae;
                }

                switch (alt31) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:9: 'LIKE'
                    {
                        match("LIKE");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:615:18: 'like'
                    {
                        match("like");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "LIKE"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:616:6: ( ( 'THEN' | 'then' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:616:8: ( 'THEN' | 'then' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:616:8: ( 'THEN' | 'then' )
                int alt32 = 2;
                int LA32_0 = input.LA(1);
                if ((LA32_0 == 'T')) {
                    alt32 = 1;
                } else if ((LA32_0 == 't')) {
                    alt32 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 32, 0, input);
                    throw nvae;
                }

                switch (alt32) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:616:9: 'THEN'
                    {
                        match("THEN");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:616:18: 'then'
                    {
                        match("then");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "THEN"

    // $ANTLR start "JAVASCRIPT"
    public final void mJAVASCRIPT() throws RecognitionException {
        try {
            int _type = JAVASCRIPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:619:2: ( ( 'JAVASCRIPT:' | 'javascript:' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:619:5: ( 'JAVASCRIPT:' | 'javascript:' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:619:5: ( 'JAVASCRIPT:' | 'javascript:' )
                int alt33 = 2;
                int LA33_0 = input.LA(1);
                if ((LA33_0 == 'J')) {
                    alt33 = 1;
                } else if ((LA33_0 == 'j')) {
                    alt33 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 33, 0, input);
                    throw nvae;
                }

                switch (alt33) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:619:6: 'JAVASCRIPT:'
                    {
                        match("JAVASCRIPT:");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:619:21: 'javascript:'
                    {
                        match("javascript:");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "JAVASCRIPT"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:621:7: ( ( 'JOIN' | 'join' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:621:9: ( 'JOIN' | 'join' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:621:9: ( 'JOIN' | 'join' )
                int alt34 = 2;
                int LA34_0 = input.LA(1);
                if ((LA34_0 == 'J')) {
                    alt34 = 1;
                } else if ((LA34_0 == 'j')) {
                    alt34 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 34, 0, input);
                    throw nvae;
                }

                switch (alt34) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:621:10: 'JOIN'
                    {
                        match("JOIN");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:621:19: 'join'
                    {
                        match("join");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "JOIN"

    // $ANTLR start "LEFT_JOIN"
    public final void mLEFT_JOIN() throws RecognitionException {
        try {
            int _type = LEFT_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:12: ( ( 'LEFT_JOIN' | 'left_join' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:14: ( 'LEFT_JOIN' | 'left_join' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:14: ( 'LEFT_JOIN' | 'left_join' )
                int alt35 = 2;
                int LA35_0 = input.LA(1);
                if ((LA35_0 == 'L')) {
                    alt35 = 1;
                } else if ((LA35_0 == 'l')) {
                    alt35 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 35, 0, input);
                    throw nvae;
                }

                switch (alt35) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:15: 'LEFT_JOIN'
                    {
                        match("LEFT_JOIN");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:624:29: 'left_join'
                    {
                        match("left_join");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "LEFT_JOIN"

    // $ANTLR start "RIGHT_JOIN"
    public final void mRIGHT_JOIN() throws RecognitionException {
        try {
            int _type = RIGHT_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:627:13: ( ( 'RIGHT_JOIN' | 'right_join' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:627:15: ( 'RIGHT_JOIN' | 'right_join' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:627:15: ( 'RIGHT_JOIN' | 'right_join' )
                int alt36 = 2;
                int LA36_0 = input.LA(1);
                if ((LA36_0 == 'R')) {
                    alt36 = 1;
                } else if ((LA36_0 == 'r')) {
                    alt36 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 36, 0, input);
                    throw nvae;
                }

                switch (alt36) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:627:16: 'RIGHT_JOIN'
                    {
                        match("RIGHT_JOIN");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:627:31: 'right_join'
                    {
                        match("right_join");

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "RIGHT_JOIN"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:630:5: ( ( 'ON' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:630:7: ( 'ON' )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:630:7: ( 'ON' )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:630:8: 'ON'
                {
                    match("ON");

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "ON"

    // $ANTLR start "OPT_SEMI_COLON"
    public final void mOPT_SEMI_COLON() throws RecognitionException {
        try {
            int _type = OPT_SEMI_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:635:2: ( ';' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:635:4: ';'
            {
                match(';');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "OPT_SEMI_COLON"

    // $ANTLR start "OPT_AMPERSAND"
    public final void mOPT_AMPERSAND() throws RecognitionException {
        try {
            int _type = OPT_AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:638:2: ( '&' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:638:4: '&'
            {
                match('&');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "OPT_AMPERSAND"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:641:2: ( ( ' ' | '\\t' )+ )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:641:4: ( ' ' | '\\t' )+
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:641:4: ( ' ' | '\\t' )+
                int cnt37 = 0;
                loop37:
                while (true) {
                    int alt37 = 2;
                    int LA37_0 = input.LA(1);
                    if ((LA37_0 == '\t' || LA37_0 == ' ')) {
                        alt37 = 1;
                    }

                    switch (alt37) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
                        {
                            if (input.LA(1) == '\t' || input.LA(1) == ' ') {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt37 >= 1) {
                                break loop37;
                            }
                            EarlyExitException eee = new EarlyExitException(37, input);
                            throw eee;
                    }
                    cnt37++;
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "WS"

    // $ANTLR start "DATE_YEAR_ONLY"
    public final void mDATE_YEAR_ONLY() throws RecognitionException {
        try {
            int _type = DATE_YEAR_ONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:646:2: ( NUM NUM NUM NUM )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:646:4: NUM NUM NUM NUM
            {
                mNUM();

                mNUM();

                mNUM();

                mNUM();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DATE_YEAR_ONLY"

    // $ANTLR start "DATE_YEAR_MONTH_ONLY"
    public final void mDATE_YEAR_MONTH_ONLY() throws RecognitionException {
        try {
            int _type = DATE_YEAR_MONTH_ONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:649:2: ( DATE_YEAR_ONLY '-' NUM NUM )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:649:4: DATE_YEAR_ONLY '-' NUM NUM
            {
                mDATE_YEAR_ONLY();

                match('-');
                mNUM();

                mNUM();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DATE_YEAR_MONTH_ONLY"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:652:2: ( DATE_YEAR_MONTH_ONLY '-' NUM NUM )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:652:4: DATE_YEAR_MONTH_ONLY '-' NUM NUM
            {
                mDATE_YEAR_MONTH_ONLY();

                match('-');
                mNUM();

                mNUM();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DATE"

    // $ANTLR start "DATE_HOUR"
    public final void mDATE_HOUR() throws RecognitionException {
        try {
            int _type = DATE_HOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:655:2: ( DATE 'T' NUM NUM )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:655:4: DATE 'T' NUM NUM
            {
                mDATE();

                match('T');
                mNUM();

                mNUM();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DATE_HOUR"

    // $ANTLR start "DATE_HOUR_MIN"
    public final void mDATE_HOUR_MIN() throws RecognitionException {
        try {
            int _type = DATE_HOUR_MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:658:2: ( DATE_HOUR ':' NUM NUM )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:658:5: DATE_HOUR ':' NUM NUM
            {
                mDATE_HOUR();

                match(':');
                mNUM();

                mNUM();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DATE_HOUR_MIN"

    // $ANTLR start "DATE_HOUR_MIN_SEC"
    public final void mDATE_HOUR_MIN_SEC() throws RecognitionException {
        try {
            int _type = DATE_HOUR_MIN_SEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:661:2: ( DATE_HOUR_MIN ':' NUM NUM )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:661:5: DATE_HOUR_MIN ':' NUM NUM
            {
                mDATE_HOUR_MIN();

                match(':');
                mNUM();

                mNUM();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DATE_HOUR_MIN_SEC"

    // $ANTLR start "DATE_HOUR_MIN_SEC_SUB"
    public final void mDATE_HOUR_MIN_SEC_SUB() throws RecognitionException {
        try {
            int _type = DATE_HOUR_MIN_SEC_SUB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:664:2: ( DATE_HOUR_MIN_SEC '.' NUM NUM NUM )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:664:5: DATE_HOUR_MIN_SEC '.' NUM NUM NUM
            {
                mDATE_HOUR_MIN_SEC();

                match('.');
                mNUM();

                mNUM();

                mNUM();

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DATE_HOUR_MIN_SEC_SUB"

    // $ANTLR start "DATE_HOUR_MIN_SEC_SUB_TZ"
    public final void mDATE_HOUR_MIN_SEC_SUB_TZ() throws RecognitionException {
        try {
            int _type = DATE_HOUR_MIN_SEC_SUB_TZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:667:2: ( DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:667:5: DATE_HOUR_MIN_SEC_SUB ( '+' | '-' ) NUM NUM ':' NUM NUM
            {
                mDATE_HOUR_MIN_SEC_SUB();

                if (input.LA(1) == '+' || input.LA(1) == '-') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
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
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DATE_HOUR_MIN_SEC_SUB_TZ"

    // $ANTLR start "DATE_HOUR_MIN_SEC_SUB_UTC_TZ"
    public final void mDATE_HOUR_MIN_SEC_SUB_UTC_TZ() throws RecognitionException {
        try {
            int _type = DATE_HOUR_MIN_SEC_SUB_UTC_TZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:670:2: ( DATE_HOUR_MIN 'Z' | DATE_HOUR_MIN_SEC 'Z' | DATE_HOUR_MIN_SEC_SUB 'Z' )
            int alt38 = 3;
            int LA38_0 = input.LA(1);
            if (((LA38_0 >= '0' && LA38_0 <= '9'))) {
                int LA38_1 = input.LA(2);
                if (((LA38_1 >= '0' && LA38_1 <= '9'))) {
                    int LA38_2 = input.LA(3);
                    if (((LA38_2 >= '0' && LA38_2 <= '9'))) {
                        int LA38_3 = input.LA(4);
                        if (((LA38_3 >= '0' && LA38_3 <= '9'))) {
                            int LA38_4 = input.LA(5);
                            if ((LA38_4 == '-')) {
                                int LA38_5 = input.LA(6);
                                if (((LA38_5 >= '0' && LA38_5 <= '9'))) {
                                    int LA38_6 = input.LA(7);
                                    if (((LA38_6 >= '0' && LA38_6 <= '9'))) {
                                        int LA38_7 = input.LA(8);
                                        if ((LA38_7 == '-')) {
                                            int LA38_8 = input.LA(9);
                                            if (((LA38_8 >= '0' && LA38_8 <= '9'))) {
                                                int LA38_9 = input.LA(10);
                                                if (((LA38_9 >= '0' && LA38_9 <= '9'))) {
                                                    int LA38_10 = input.LA(11);
                                                    if ((LA38_10 == 'T')) {
                                                        int LA38_11 = input.LA(12);
                                                        if (((LA38_11 >= '0' && LA38_11 <= '9'))) {
                                                            int LA38_12 = input.LA(13);
                                                            if (((LA38_12 >= '0' && LA38_12 <= '9'))) {
                                                                int LA38_13 = input.LA(14);
                                                                if ((LA38_13 == ':')) {
                                                                    int LA38_14 = input.LA(15);
                                                                    if (((LA38_14 >= '0' && LA38_14 <= '9'))) {
                                                                        int LA38_15 = input.LA(16);
                                                                        if (((LA38_15 >= '0' && LA38_15 <= '9'))) {
                                                                            int LA38_16 = input.LA(17);
                                                                            if ((LA38_16 == 'Z')) {
                                                                                alt38 = 1;
                                                                            } else if ((LA38_16 == ':')) {
                                                                                int LA38_18 = input.LA(18);
                                                                                if (((LA38_18 >= '0' && LA38_18 <= '9'))) {
                                                                                    int LA38_19 = input.LA(19);
                                                                                    if (((LA38_19 >= '0' && LA38_19 <= '9'))) {
                                                                                        int LA38_20 = input.LA(20);
                                                                                        if ((LA38_20 == 'Z')) {
                                                                                            alt38 = 2;
                                                                                        } else if ((LA38_20 == '.')) {
                                                                                            alt38 = 3;
                                                                                        } else {
                                                                                            int nvaeMark = input.mark();
                                                                                            try {
                                                                                                for (int nvaeConsume = 0; nvaeConsume < 20 - 1; nvaeConsume++) {
                                                                                                    input.consume();
                                                                                                }
                                                                                                NoViableAltException nvae
                                                                                                        = new NoViableAltException("", 38, 20, input);
                                                                                                throw nvae;
                                                                                            } finally {
                                                                                                input.rewind(nvaeMark);
                                                                                            }
                                                                                        }

                                                                                    } else {
                                                                                        int nvaeMark = input.mark();
                                                                                        try {
                                                                                            for (int nvaeConsume = 0; nvaeConsume < 19 - 1; nvaeConsume++) {
                                                                                                input.consume();
                                                                                            }
                                                                                            NoViableAltException nvae
                                                                                                    = new NoViableAltException("", 38, 19, input);
                                                                                            throw nvae;
                                                                                        } finally {
                                                                                            input.rewind(nvaeMark);
                                                                                        }
                                                                                    }

                                                                                } else {
                                                                                    int nvaeMark = input.mark();
                                                                                    try {
                                                                                        for (int nvaeConsume = 0; nvaeConsume < 18 - 1; nvaeConsume++) {
                                                                                            input.consume();
                                                                                        }
                                                                                        NoViableAltException nvae
                                                                                                = new NoViableAltException("", 38, 18, input);
                                                                                        throw nvae;
                                                                                    } finally {
                                                                                        input.rewind(nvaeMark);
                                                                                    }
                                                                                }

                                                                            } else {
                                                                                int nvaeMark = input.mark();
                                                                                try {
                                                                                    for (int nvaeConsume = 0; nvaeConsume < 17 - 1; nvaeConsume++) {
                                                                                        input.consume();
                                                                                    }
                                                                                    NoViableAltException nvae
                                                                                            = new NoViableAltException("", 38, 16, input);
                                                                                    throw nvae;
                                                                                } finally {
                                                                                    input.rewind(nvaeMark);
                                                                                }
                                                                            }

                                                                        } else {
                                                                            int nvaeMark = input.mark();
                                                                            try {
                                                                                for (int nvaeConsume = 0; nvaeConsume < 16 - 1; nvaeConsume++) {
                                                                                    input.consume();
                                                                                }
                                                                                NoViableAltException nvae
                                                                                        = new NoViableAltException("", 38, 15, input);
                                                                                throw nvae;
                                                                            } finally {
                                                                                input.rewind(nvaeMark);
                                                                            }
                                                                        }

                                                                    } else {
                                                                        int nvaeMark = input.mark();
                                                                        try {
                                                                            for (int nvaeConsume = 0; nvaeConsume < 15 - 1; nvaeConsume++) {
                                                                                input.consume();
                                                                            }
                                                                            NoViableAltException nvae
                                                                                    = new NoViableAltException("", 38, 14, input);
                                                                            throw nvae;
                                                                        } finally {
                                                                            input.rewind(nvaeMark);
                                                                        }
                                                                    }

                                                                } else {
                                                                    int nvaeMark = input.mark();
                                                                    try {
                                                                        for (int nvaeConsume = 0; nvaeConsume < 14 - 1; nvaeConsume++) {
                                                                            input.consume();
                                                                        }
                                                                        NoViableAltException nvae
                                                                                = new NoViableAltException("", 38, 13, input);
                                                                        throw nvae;
                                                                    } finally {
                                                                        input.rewind(nvaeMark);
                                                                    }
                                                                }

                                                            } else {
                                                                int nvaeMark = input.mark();
                                                                try {
                                                                    for (int nvaeConsume = 0; nvaeConsume < 13 - 1; nvaeConsume++) {
                                                                        input.consume();
                                                                    }
                                                                    NoViableAltException nvae
                                                                            = new NoViableAltException("", 38, 12, input);
                                                                    throw nvae;
                                                                } finally {
                                                                    input.rewind(nvaeMark);
                                                                }
                                                            }

                                                        } else {
                                                            int nvaeMark = input.mark();
                                                            try {
                                                                for (int nvaeConsume = 0; nvaeConsume < 12 - 1; nvaeConsume++) {
                                                                    input.consume();
                                                                }
                                                                NoViableAltException nvae
                                                                        = new NoViableAltException("", 38, 11, input);
                                                                throw nvae;
                                                            } finally {
                                                                input.rewind(nvaeMark);
                                                            }
                                                        }

                                                    } else {
                                                        int nvaeMark = input.mark();
                                                        try {
                                                            for (int nvaeConsume = 0; nvaeConsume < 11 - 1; nvaeConsume++) {
                                                                input.consume();
                                                            }
                                                            NoViableAltException nvae
                                                                    = new NoViableAltException("", 38, 10, input);
                                                            throw nvae;
                                                        } finally {
                                                            input.rewind(nvaeMark);
                                                        }
                                                    }

                                                } else {
                                                    int nvaeMark = input.mark();
                                                    try {
                                                        for (int nvaeConsume = 0; nvaeConsume < 10 - 1; nvaeConsume++) {
                                                            input.consume();
                                                        }
                                                        NoViableAltException nvae
                                                                = new NoViableAltException("", 38, 9, input);
                                                        throw nvae;
                                                    } finally {
                                                        input.rewind(nvaeMark);
                                                    }
                                                }

                                            } else {
                                                int nvaeMark = input.mark();
                                                try {
                                                    for (int nvaeConsume = 0; nvaeConsume < 9 - 1; nvaeConsume++) {
                                                        input.consume();
                                                    }
                                                    NoViableAltException nvae
                                                            = new NoViableAltException("", 38, 8, input);
                                                    throw nvae;
                                                } finally {
                                                    input.rewind(nvaeMark);
                                                }
                                            }

                                        } else {
                                            int nvaeMark = input.mark();
                                            try {
                                                for (int nvaeConsume = 0; nvaeConsume < 8 - 1; nvaeConsume++) {
                                                    input.consume();
                                                }
                                                NoViableAltException nvae
                                                        = new NoViableAltException("", 38, 7, input);
                                                throw nvae;
                                            } finally {
                                                input.rewind(nvaeMark);
                                            }
                                        }

                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 38, 6, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else {
                                    int nvaeMark = input.mark();
                                    try {
                                        for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                            input.consume();
                                        }
                                        NoViableAltException nvae
                                                = new NoViableAltException("", 38, 5, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else {
                                int nvaeMark = input.mark();
                                try {
                                    for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
                                        input.consume();
                                    }
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 38, 4, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 38, 3, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    } else {
                        int nvaeMark = input.mark();
                        try {
                            for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                input.consume();
                            }
                            NoViableAltException nvae
                                    = new NoViableAltException("", 38, 2, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                    }

                } else {
                    int nvaeMark = input.mark();
                    try {
                        input.consume();
                        NoViableAltException nvae
                                = new NoViableAltException("", 38, 1, input);
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }

            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 38, 0, input);
                throw nvae;
            }

            switch (alt38) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:670:5: DATE_HOUR_MIN 'Z'
                {
                    mDATE_HOUR_MIN();

                    match('Z');
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:671:6: DATE_HOUR_MIN_SEC 'Z'
                {
                    mDATE_HOUR_MIN_SEC();

                    match('Z');
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:672:6: DATE_HOUR_MIN_SEC_SUB 'Z'
                {
                    mDATE_HOUR_MIN_SEC_SUB();

                    match('Z');
                }
                break;

            }
            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "DATE_HOUR_MIN_SEC_SUB_UTC_TZ"

    // $ANTLR start "ARITH_OPER"
    public final void mARITH_OPER() throws RecognitionException {
        try {
            int _type = ARITH_OPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:675:13: ( ( '*' | '+' | '/' | '-' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
            {
                if ((input.LA(1) >= '*' && input.LA(1) <= '+') || input.LA(1) == '-' || input.LA(1) == '/') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "ARITH_OPER"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:678:9: ( '=' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:678:11: '='
            {
                match('=');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "EQUALS"

    // $ANTLR start "COMPARE_OPER"
    public final void mCOMPARE_OPER() throws RecognitionException {
        try {
            int _type = COMPARE_OPER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:680:15: ( ( '<' | '>' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
            {
                if (input.LA(1) == '<' || input.LA(1) == '>') {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "COMPARE_OPER"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:684:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:684:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
                if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:684:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
                loop39:
                while (true) {
                    int alt39 = 2;
                    int LA39_0 = input.LA(1);
                    if (((LA39_0 >= '0' && LA39_0 <= '9') || (LA39_0 >= 'A' && LA39_0 <= 'Z') || LA39_0 == '_' || (LA39_0 >= 'a' && LA39_0 <= 'z'))) {
                        alt39 = 1;
                    }

                    switch (alt39) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'Z') || input.LA(1) == '_' || (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            break loop39;
                    }
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "ID"

    // $ANTLR start "NEWLINE"
    public final void mNEWLINE() throws RecognitionException {
        try {
            int _type = NEWLINE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:688:11: ( ( '\\r\\n' | '\\r' | '\\n' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:688:14: ( '\\r\\n' | '\\r' | '\\n' )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:688:14: ( '\\r\\n' | '\\r' | '\\n' )
                int alt40 = 3;
                int LA40_0 = input.LA(1);
                if ((LA40_0 == '\r')) {
                    int LA40_1 = input.LA(2);
                    if ((LA40_1 == '\n')) {
                        alt40 = 1;
                    } else {
                        alt40 = 2;
                    }

                } else if ((LA40_0 == '\n')) {
                    alt40 = 3;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 40, 0, input);
                    throw nvae;
                }

                switch (alt40) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:688:16: '\\r\\n'
                    {
                        match("\r\n");

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:689:18: '\\r'
                    {
                        match('\r');
                    }
                    break;
                    case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:690:18: '\\n'
                    {
                        match('\n');
                    }
                    break;

                }

                _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "NEWLINE"

    // $ANTLR start "SINGLE_QUOTE_STRING"
    public final void mSINGLE_QUOTE_STRING() throws RecognitionException {
        try {
            int _type = SINGLE_QUOTE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:699:5: ( '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\'' )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:699:8: '\\'' ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )* '\\''
            {
                match('\'');
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:699:13: ( ESC_SEQ |~ ( '\\\\' | '\\'' ) )*
                loop41:
                while (true) {
                    int alt41 = 3;
                    int LA41_0 = input.LA(1);
                    if ((LA41_0 == '\\')) {
                        alt41 = 1;
                    } else if (((LA41_0 >= '\u0000' && LA41_0 <= '&') || (LA41_0 >= '(' && LA41_0 <= '[') || (LA41_0 >= ']' && LA41_0 <= '\uFFFF'))) {
                        alt41 = 2;
                    }

                    switch (alt41) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:699:14: ESC_SEQ
                        {
                            mESC_SEQ();

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:699:24: ~ ( '\\\\' | '\\'' )
                        {
                            if ((input.LA(1) >= '\u0000' && input.LA(1) <= '&') || (input.LA(1) >= '(' && input.LA(1) <= '[') || (input.LA(1) >= ']' && input.LA(1) <= '\uFFFF')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            break loop41;
                    }
                }

                match('\'');
            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "SINGLE_QUOTE_STRING"

    // $ANTLR start "LONG"
    public final void mLONG() throws RecognitionException {
        try {
            int _type = LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:702:6: ( ( NUM )+ )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:702:8: ( NUM )+
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:702:8: ( NUM )+
                int cnt42 = 0;
                loop42:
                while (true) {
                    int alt42 = 2;
                    int LA42_0 = input.LA(1);
                    if (((LA42_0 >= '0' && LA42_0 <= '9'))) {
                        alt42 = 1;
                    }

                    switch (alt42) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
                        {
                            if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                                input.consume();
                            } else {
                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                recover(mse);
                                throw mse;
                            }
                        }
                        break;

                        default:
                            if (cnt42 >= 1) {
                                break loop42;
                            }
                            EarlyExitException eee = new EarlyExitException(42, input);
                            throw eee;
                    }
                    cnt42++;
                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "LONG"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:703:10: ( LONG ( '.' LONG )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:703:15: LONG ( '.' LONG )?
            {
                mLONG();

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:703:20: ( '.' LONG )?
                int alt43 = 2;
                int LA43_0 = input.LA(1);
                if ((LA43_0 == '.')) {
                    alt43 = 1;
                }
                switch (alt43) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:703:21: '.' LONG
                    {
                        match('.');
                        mLONG();

                    }
                    break;

                }

            }

            state.type = _type;
            state.channel = _channel;
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "FLOAT"

    // $ANTLR start "NUM"
    public final void mNUM() throws RecognitionException {
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:705:14: ( ( '0' .. '9' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
            {
                if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "NUM"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:707:20: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:
            {
                if ((input.LA(1) >= '0' && input.LA(1) <= '9') || (input.LA(1) >= 'A' && input.LA(1) <= 'F') || (input.LA(1) >= 'a' && input.LA(1) <= 'f')) {
                    input.consume();
                } else {
                    MismatchedSetException mse = new MismatchedSetException(null, input);
                    recover(mse);
                    throw mse;
                }
            }

        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "HEX_DIGIT"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:710:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt44 = 3;
            int LA44_0 = input.LA(1);
            if ((LA44_0 == '\\')) {
                switch (input.LA(2)) {
                    case '\"':
                    case '\'':
                    case '\\':
                    case 'b':
                    case 'f':
                    case 'n':
                    case 'r':
                    case 't': {
                        alt44 = 1;
                    }
                    break;
                    case 'u': {
                        alt44 = 2;
                    }
                    break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7': {
                        alt44 = 3;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 44, 1, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 44, 0, input);
                throw nvae;
            }

            switch (alt44) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:710:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
                {
                    match('\\');
                    if (input.LA(1) == '\"' || input.LA(1) == '\'' || input.LA(1) == '\\' || input.LA(1) == 'b' || input.LA(1) == 'f' || input.LA(1) == 'n' || input.LA(1) == 'r' || input.LA(1) == 't') {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:711:9: UNICODE_ESC
                {
                    mUNICODE_ESC();

                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:712:9: OCTAL_ESC
                {
                    mOCTAL_ESC();

                }
                break;

            }
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "ESC_SEQ"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:716:5: ( '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) ( '0' .. '7' ) | '\\\\' ( '0' .. '7' ) )
            int alt45 = 3;
            int LA45_0 = input.LA(1);
            if ((LA45_0 == '\\')) {
                int LA45_1 = input.LA(2);
                if (((LA45_1 >= '0' && LA45_1 <= '3'))) {
                    int LA45_2 = input.LA(3);
                    if (((LA45_2 >= '0' && LA45_2 <= '7'))) {
                        int LA45_4 = input.LA(4);
                        if (((LA45_4 >= '0' && LA45_4 <= '7'))) {
                            alt45 = 1;
                        } else {
                            alt45 = 2;
                        }

                    } else {
                        alt45 = 3;
                    }

                } else if (((LA45_1 >= '4' && LA45_1 <= '7'))) {
                    int LA45_3 = input.LA(3);
                    if (((LA45_3 >= '0' && LA45_3 <= '7'))) {
                        alt45 = 2;
                    } else {
                        alt45 = 3;
                    }

                } else {
                    int nvaeMark = input.mark();
                    try {
                        input.consume();
                        NoViableAltException nvae
                                = new NoViableAltException("", 45, 1, input);
                        throw nvae;
                    } finally {
                        input.rewind(nvaeMark);
                    }
                }

            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 45, 0, input);
                throw nvae;
            }

            switch (alt45) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:716:9: '\\\\' ( '0' .. '3' ) ( '0' .. '7' ) ( '0' .. '7' )
                {
                    match('\\');
                    if ((input.LA(1) >= '0' && input.LA(1) <= '3')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:717:9: '\\\\' ( '0' .. '7' ) ( '0' .. '7' )
                {
                    match('\\');
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:718:9: '\\\\' ( '0' .. '7' )
                {
                    match('\\');
                    if ((input.LA(1) >= '0' && input.LA(1) <= '7')) {
                        input.consume();
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        recover(mse);
                        throw mse;
                    }
                }
                break;

            }
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "OCTAL_ESC"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:722:5: ( '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:722:9: '\\\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
            {
                match('\\');
                match('u');
                mHEX_DIGIT();

                mHEX_DIGIT();

                mHEX_DIGIT();

                mHEX_DIGIT();

            }

        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    @Override
    public void mTokens() throws RecognitionException {
        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:8: ( T__88 | T__89 | T__90 | T__91 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | INSERT | INSERT_HADOOP | INSERT_REALTIME | INTO | VALUES | MAX_WINDOW | DELIMITOR | PARTITION | ROLLUP | DROP | TABLE | DELETE | KAFKA | STRING | ISO | AUTO_ISO | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ASC | DESC | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | OPT_AMPERSAND | WS | DATE_YEAR_ONLY | DATE_YEAR_MONTH_ONLY | DATE | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | NEWLINE | SINGLE_QUOTE_STRING | LONG | FLOAT )
        int alt46 = 83;
        alt46 = dfa46.predict(input);
        switch (alt46) {
            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:10: T__88
            {
                mT__88();

            }
            break;
            case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:16: T__89
            {
                mT__89();

            }
            break;
            case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:22: T__90
            {
                mT__90();

            }
            break;
            case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:28: T__91
            {
                mT__91();

            }
            break;
            case 5: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:34: LPARAN
            {
                mLPARAN();

            }
            break;
            case 6: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:41: RPARAN
            {
                mRPARAN();

            }
            break;
            case 7: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:48: LCURLY
            {
                mLCURLY();

            }
            break;
            case 8: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:55: RCURLY
            {
                mRCURLY();

            }
            break;
            case 9: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:62: LSQUARE
            {
                mLSQUARE();

            }
            break;
            case 10: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:70: RSQUARE
            {
                mRSQUARE();

            }
            break;
            case 11: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:78: INSERT
            {
                mINSERT();

            }
            break;
            case 12: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:85: INSERT_HADOOP
            {
                mINSERT_HADOOP();

            }
            break;
            case 13: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:99: INSERT_REALTIME
            {
                mINSERT_REALTIME();

            }
            break;
            case 14: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:115: INTO
            {
                mINTO();

            }
            break;
            case 15: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:120: VALUES
            {
                mVALUES();

            }
            break;
            case 16: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:127: MAX_WINDOW
            {
                mMAX_WINDOW();

            }
            break;
            case 17: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:138: DELIMITOR
            {
                mDELIMITOR();

            }
            break;
            case 18: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:148: PARTITION
            {
                mPARTITION();

            }
            break;
            case 19: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:158: ROLLUP
            {
                mROLLUP();

            }
            break;
            case 20: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:165: DROP
            {
                mDROP();

            }
            break;
            case 21: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:170: TABLE
            {
                mTABLE();

            }
            break;
            case 22: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:176: DELETE
            {
                mDELETE();

            }
            break;
            case 23: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:183: KAFKA
            {
                mKAFKA();

            }
            break;
            case 24: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:189: STRING
            {
                mSTRING();

            }
            break;
            case 25: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:196: ISO
            {
                mISO();

            }
            break;
            case 26: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:200: AUTO_ISO
            {
                mAUTO_ISO();

            }
            break;
            case 27: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:209: SELECT
            {
                mSELECT();

            }
            break;
            case 28: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:216: COUNT
            {
                mCOUNT();

            }
            break;
            case 29: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:222: LONG_SUM
            {
                mLONG_SUM();

            }
            break;
            case 30: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:231: DOUBLE_SUM
            {
                mDOUBLE_SUM();

            }
            break;
            case 31: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:242: UNIQUE
            {
                mUNIQUE();

            }
            break;
            case 32: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:249: MIN
            {
                mMIN();

            }
            break;
            case 33: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:253: MAX
            {
                mMAX();

            }
            break;
            case 34: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:257: DURATION
            {
                mDURATION();

            }
            break;
            case 35: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:266: PERIOD
            {
                mPERIOD();

            }
            break;
            case 36: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:273: INCLUDE
            {
                mINCLUDE();

            }
            break;
            case 37: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:281: WHICH
            {
                mWHICH();

            }
            break;
            case 38: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:287: CONTAINS
            {
                mCONTAINS();

            }
            break;
            case 39: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:296: SORT
            {
                mSORT();

            }
            break;
            case 40: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:301: HINT
            {
                mHINT();

            }
            break;
            case 41: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:306: AS
            {
                mAS();

            }
            break;
            case 42: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:309: FIELD_ACCESS
            {
                mFIELD_ACCESS();

            }
            break;
            case 43: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:322: FROM
            {
                mFROM();

            }
            break;
            case 44: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:327: WHERE
            {
                mWHERE();

            }
            break;
            case 45: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:333: BETWEEN
            {
                mBETWEEN();

            }
            break;
            case 46: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:341: AND
            {
                mAND();

            }
            break;
            case 47: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:345: OR
            {
                mOR();

            }
            break;
            case 48: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:348: NOT
            {
                mNOT();

            }
            break;
            case 49: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:352: GROUP
            {
                mGROUP();

            }
            break;
            case 50: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:358: ASC
            {
                mASC();

            }
            break;
            case 51: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:362: DESC
            {
                mDESC();

            }
            break;
            case 52: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:367: ORDER
            {
                mORDER();

            }
            break;
            case 53: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:373: HAVING
            {
                mHAVING();

            }
            break;
            case 54: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:380: BREAK
            {
                mBREAK();

            }
            break;
            case 55: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:386: BY
            {
                mBY();

            }
            break;
            case 56: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:389: LIMIT
            {
                mLIMIT();

            }
            break;
            case 57: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:395: LIKE
            {
                mLIKE();

            }
            break;
            case 58: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:400: THEN
            {
                mTHEN();

            }
            break;
            case 59: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:405: JAVASCRIPT
            {
                mJAVASCRIPT();

            }
            break;
            case 60: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:416: JOIN
            {
                mJOIN();

            }
            break;
            case 61: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:421: LEFT_JOIN
            {
                mLEFT_JOIN();

            }
            break;
            case 62: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:431: RIGHT_JOIN
            {
                mRIGHT_JOIN();

            }
            break;
            case 63: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:442: ON
            {
                mON();

            }
            break;
            case 64: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:445: OPT_SEMI_COLON
            {
                mOPT_SEMI_COLON();

            }
            break;
            case 65: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:460: OPT_AMPERSAND
            {
                mOPT_AMPERSAND();

            }
            break;
            case 66: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:474: WS
            {
                mWS();

            }
            break;
            case 67: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:477: DATE_YEAR_ONLY
            {
                mDATE_YEAR_ONLY();

            }
            break;
            case 68: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:492: DATE_YEAR_MONTH_ONLY
            {
                mDATE_YEAR_MONTH_ONLY();

            }
            break;
            case 69: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:513: DATE
            {
                mDATE();

            }
            break;
            case 70: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:518: DATE_HOUR
            {
                mDATE_HOUR();

            }
            break;
            case 71: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:528: DATE_HOUR_MIN
            {
                mDATE_HOUR_MIN();

            }
            break;
            case 72: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:542: DATE_HOUR_MIN_SEC
            {
                mDATE_HOUR_MIN_SEC();

            }
            break;
            case 73: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:560: DATE_HOUR_MIN_SEC_SUB
            {
                mDATE_HOUR_MIN_SEC_SUB();

            }
            break;
            case 74: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:582: DATE_HOUR_MIN_SEC_SUB_TZ
            {
                mDATE_HOUR_MIN_SEC_SUB_TZ();

            }
            break;
            case 75: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:607: DATE_HOUR_MIN_SEC_SUB_UTC_TZ
            {
                mDATE_HOUR_MIN_SEC_SUB_UTC_TZ();

            }
            break;
            case 76: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:636: ARITH_OPER
            {
                mARITH_OPER();

            }
            break;
            case 77: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:647: EQUALS
            {
                mEQUALS();

            }
            break;
            case 78: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:654: COMPARE_OPER
            {
                mCOMPARE_OPER();

            }
            break;
            case 79: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:667: ID
            {
                mID();

            }
            break;
            case 80: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:670: NEWLINE
            {
                mNEWLINE();

            }
            break;
            case 81: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:678: SINGLE_QUOTE_STRING
            {
                mSINGLE_QUOTE_STRING();

            }
            break;
            case 82: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:698: LONG
            {
                mLONG();

            }
            break;
            case 83: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:1:703: FLOAT
            {
                mFLOAT();

            }
            break;

        }
    }

    protected DFA46 dfa46 = new DFA46(this);
    static final String DFA46_eotS
            = "\1\uffff\1\74\2\uffff\1\70\5\uffff\47\70\3\uffff\1\u0083\11\uffff\37\70"
            + "\1\u00ab\12\70\1\u00ab\10\70\1\u00c2\2\70\1\u00c2\1\u00c6\1\u00c7\1\u00c6"
            + "\13\70\1\uffff\1\u0083\1\uffff\5\70\1\u00dc\2\70\1\u00e0\1\u00e1\32\70"
            + "\1\u00fe\1\uffff\1\u00ff\14\70\1\u00fe\1\u00ff\7\70\1\uffff\3\70\2\uffff"
            + "\1\70\2\u0117\12\70\1\u0083\1\70\1\u0124\2\70\1\u0124\1\70\1\uffff\3\70"
            + "\2\uffff\3\70\1\u012e\1\u012f\4\70\1\u012e\1\u012f\10\70\1\u013c\1\70"
            + "\1\u013c\4\70\1\u0142\1\70\2\uffff\5\70\1\u0149\4\70\1\u014e\2\70\1\u0151"
            + "\1\70\1\u0151\7\70\1\uffff\4\70\1\u0149\2\70\1\u0160\1\70\1\u0160\1\u0162"
            + "\1\70\1\uffff\11\70\2\uffff\13\70\1\u017a\1\uffff\1\u017a\2\u017b\2\70"
            + "\1\uffff\2\70\1\u0180\2\70\1\u0183\1\uffff\2\70\1\u0186\1\u0187\1\uffff"
            + "\2\70\1\uffff\1\70\1\u0187\1\70\1\u018c\1\70\1\u018c\2\u018e\2\u018f\1"
            + "\70\1\u0183\2\70\1\uffff\1\70\2\uffff\1\u0083\1\70\2\u0197\1\70\2\u019a"
            + "\3\70\1\u019e\3\70\1\u019e\1\70\1\u01a3\1\70\1\u01a5\1\70\1\u01a5\1\70"
            + "\2\uffff\1\u01a8\1\u01a9\1\70\1\u01a9\1\uffff\2\70\1\uffff\1\70\1\u01ae"
            + "\2\uffff\1\u01af\3\70\1\uffff\1\70\2\uffff\1\u01af\3\70\1\uffff\2\70\1"
            + "\uffff\1\70\1\u01bd\1\uffff\3\70\1\uffff\4\70\1\uffff\1\70\1\uffff\2\70"
            + "\2\uffff\4\70\2\uffff\2\70\2\u01ce\3\70\1\u01d2\1\u01d4\4\70\1\uffff\4"
            + "\70\1\u01dd\5\70\1\u01e3\1\u01e4\1\u01e5\3\70\1\uffff\3\70\3\uffff\6\70"
            + "\1\u01f3\1\70\1\uffff\1\u01f3\2\u01f5\2\70\3\uffff\1\u01f8\2\70\1\u01f8"
            + "\2\70\1\uffff\4\70\2\u0202\1\uffff\1\u0203\1\uffff\2\u0204\1\uffff\4\70"
            + "\1\u0208\4\70\3\uffff\2\70\3\uffff\4\70\2\u0215\1\uffff\1\u0217\1\70\1"
            + "\u0217\1\70\1\uffff\1\u021a\1\uffff\2\70\2\uffff\2\u021f\2\uffff\1\u0221"
            + "\4\uffff\1\u0226\4\uffff\1\u022b\2\uffff";
    static final String DFA46_eofS
            = "\u022d\uffff";
    static final String DFA46_minS
            = "\1\11\1\52\2\uffff\1\156\5\uffff\1\116\1\101\1\141\1\101\1\141\1\105\1"
            + "\145\1\101\1\141\1\111\1\151\1\101\1\141\1\101\1\141\1\105\1\116\1\145"
            + "\1\117\1\105\1\116\1\110\1\101\1\156\1\111\1\151\1\150\1\105\1\145\1\116"
            + "\1\162\1\117\1\157\1\122\1\162\1\141\1\145\1\101\1\141\3\uffff\1\56\11"
            + "\uffff\1\163\1\103\1\117\1\114\1\154\1\130\1\116\1\170\1\114\1\117\1\125"
            + "\1\122\1\154\1\157\2\122\1\162\1\114\1\107\1\154\1\147\1\102\1\105\1\142"
            + "\1\145\1\106\1\146\1\122\1\114\1\122\1\124\1\60\1\104\1\154\2\116\1\113"
            + "\1\106\1\111\1\105\1\116\1\126\1\60\1\144\1\105\1\117\1\145\1\157\1\145"
            + "\1\124\1\105\1\60\1\164\1\145\4\60\1\124\1\164\1\117\1\157\1\166\1\153"
            + "\1\146\1\126\1\111\1\166\1\151\1\uffff\1\56\1\uffff\2\145\1\105\1\117"
            + "\1\114\1\60\1\125\1\165\2\60\1\137\1\105\1\103\1\120\1\102\1\101\1\145"
            + "\1\143\1\160\1\124\1\111\1\164\1\114\1\110\1\154\1\150\1\114\1\116\1\154"
            + "\1\156\1\113\1\153\1\111\1\105\1\124\1\117\1\60\1\uffff\1\60\1\145\1\116"
            + "\1\124\1\107\1\111\1\105\1\124\1\121\1\103\1\122\1\124\1\111\2\60\1\114"
            + "\1\115\1\154\1\155\1\162\1\127\1\101\1\uffff\1\167\1\141\1\105\2\uffff"
            + "\1\145\2\60\1\125\1\165\2\151\1\145\1\164\1\101\1\116\1\141\1\156\1\56"
            + "\1\162\1\60\1\162\1\122\1\60\1\125\1\uffff\1\105\1\145\1\127\2\uffff\1"
            + "\167\1\115\1\124\2\60\1\114\1\124\1\155\1\164\2\60\1\111\1\117\1\151\1"
            + "\125\1\124\1\165\1\164\1\105\1\60\1\145\1\60\1\101\1\141\1\116\1\103\1"
            + "\60\1\137\2\uffff\1\143\1\124\1\101\1\137\1\124\1\60\1\137\1\125\1\110"
            + "\1\105\1\60\1\116\1\104\1\60\1\144\1\60\1\145\1\105\1\113\1\145\1\153"
            + "\1\122\1\162\1\uffff\1\120\1\160\1\156\1\164\1\60\1\137\1\123\1\60\1\163"
            + "\1\60\1\55\1\166\1\uffff\1\164\1\124\1\104\1\123\1\163\1\111\1\151\1\111"
            + "\1\105\2\uffff\1\105\1\111\1\151\1\145\1\124\1\104\1\164\1\120\1\137\1"
            + "\160\1\137\1\60\1\uffff\3\60\1\107\1\124\1\uffff\1\111\1\164\1\60\1\111"
            + "\1\123\1\60\1\uffff\1\112\1\105\2\60\1\uffff\1\107\1\137\1\uffff\1\137"
            + "\1\60\1\105\1\60\1\145\5\60\1\147\1\60\1\152\1\103\1\uffff\1\143\1\uffff"
            + "\1\60\1\56\1\141\2\60\1\105\2\60\1\116\1\156\1\124\1\60\1\137\1\117\1"
            + "\164\1\60\1\111\1\60\1\151\1\60\1\112\1\60\1\152\2\uffff\2\60\1\123\1"
            + "\60\1\uffff\1\116\1\125\1\uffff\1\117\1\60\2\uffff\1\60\1\101\1\141\1"
            + "\116\1\uffff\1\156\2\uffff\1\60\1\157\1\122\1\162\1\60\1\154\1\150\1\uffff"
            + "\1\110\1\60\1\uffff\1\104\1\144\1\117\1\uffff\1\123\1\116\1\157\1\117"
            + "\1\uffff\1\157\1\uffff\1\117\1\157\2\uffff\1\117\1\123\1\115\1\111\2\uffff"
            + "\1\103\1\143\2\60\1\151\1\111\1\151\1\55\1\60\1\141\1\145\1\101\1\105"
            + "\1\uffff\1\117\1\157\1\122\1\125\1\60\1\162\1\116\1\156\1\111\1\151\3"
            + "\60\1\116\1\103\1\143\1\uffff\1\156\1\120\1\160\1\uffff\1\60\1\uffff\1"
            + "\144\1\141\1\104\1\101\1\127\1\167\1\60\1\115\1\uffff\3\60\1\116\1\156"
            + "\3\uffff\1\60\1\105\1\145\1\60\1\124\1\164\1\60\1\157\1\154\1\117\1\114"
            + "\2\60\1\uffff\1\60\1\uffff\2\60\1\uffff\1\123\1\163\2\72\1\124\1\157\1"
            + "\164\1\117\1\124\3\uffff\1\123\1\163\2\uffff\1\60\1\160\1\151\1\120\1"
            + "\111\4\60\1\155\1\60\1\115\1\uffff\1\72\1\uffff\1\145\1\105\1\uffff\4"
            + "\60\1\uffff\1\72\1\uffff\1\60\1\uffff\1\60\1\56\1\uffff\3\60\1\53\2\uffff";
    static final String DFA46_maxS
            = "\1\175\1\52\2\uffff\1\156\5\uffff\1\123\1\101\1\141\1\111\1\141\1\125"
            + "\1\162\1\105\1\141\1\117\1\157\1\110\1\150\1\101\1\141\1\124\1\125\1\145"
            + "\2\117\1\116\1\110\1\111\1\163\1\122\1\162\1\150\1\131\1\171\1\122\1\162"
            + "\1\117\1\157\1\122\1\162\1\141\1\151\1\117\1\157\3\uffff\1\71\11\uffff"
            + "\1\164\1\124\1\117\1\114\1\154\1\130\1\116\1\170\1\123\1\117\1\125\1\122"
            + "\1\163\1\157\2\122\1\162\1\114\1\107\1\154\1\147\1\102\1\105\1\142\1\145"
            + "\1\106\1\146\1\122\1\114\1\122\1\124\1\172\1\104\1\154\1\125\1\116\1\115"
            + "\1\106\2\111\1\116\1\126\1\172\1\144\1\105\1\117\1\145\1\157\1\145\1\124"
            + "\1\105\1\172\1\164\1\145\4\172\1\124\1\164\1\117\1\157\1\166\1\155\1\146"
            + "\1\126\1\111\1\166\1\151\1\uffff\1\71\1\uffff\1\157\1\145\1\105\1\117"
            + "\1\114\1\172\1\125\1\165\2\172\1\137\1\111\1\103\1\120\1\102\1\101\1\151"
            + "\1\143\1\160\1\124\1\111\1\164\1\114\1\110\1\154\1\150\1\114\1\116\1\154"
            + "\1\156\1\113\1\153\1\111\1\105\1\124\1\117\1\172\1\uffff\1\172\1\145\1"
            + "\116\1\124\1\107\1\111\1\105\1\124\1\121\1\103\1\122\1\124\1\111\2\172"
            + "\1\114\1\115\1\154\1\155\1\162\1\127\1\101\1\uffff\1\167\1\141\1\105\2"
            + "\uffff\1\145\2\172\1\125\1\165\2\151\1\145\1\164\1\101\1\116\1\141\1\156"
            + "\1\71\1\162\1\172\1\162\1\122\1\172\1\125\1\uffff\1\105\1\145\1\127\2"
            + "\uffff\1\167\1\115\1\124\2\172\1\114\1\124\1\155\1\164\2\172\1\111\1\117"
            + "\1\151\1\125\1\124\1\165\1\164\1\105\1\172\1\145\1\172\1\101\1\141\1\116"
            + "\1\103\1\172\1\137\2\uffff\1\143\1\124\1\101\1\137\1\124\1\172\1\137\1"
            + "\125\1\110\1\105\1\172\1\116\1\104\1\172\1\144\1\172\1\145\1\105\1\113"
            + "\1\145\1\153\1\122\1\162\1\uffff\1\120\1\160\1\156\1\164\1\172\1\137\1"
            + "\123\1\172\1\163\1\172\1\71\1\166\1\uffff\1\164\1\124\1\104\1\123\1\163"
            + "\1\111\1\151\1\111\1\105\2\uffff\1\105\1\111\1\151\1\145\1\124\1\104\1"
            + "\164\1\120\1\137\1\160\1\137\1\172\1\uffff\3\172\1\107\1\124\1\uffff\1"
            + "\111\1\164\1\172\1\111\1\123\1\172\1\uffff\1\112\1\105\2\172\1\uffff\1"
            + "\107\1\137\1\uffff\1\137\1\172\1\105\1\172\1\145\5\172\1\147\1\172\1\152"
            + "\1\103\1\uffff\1\143\1\uffff\2\71\1\141\2\172\1\105\2\172\1\116\1\156"
            + "\1\124\1\172\1\137\1\117\1\164\1\172\1\111\1\172\1\151\1\172\1\112\1\172"
            + "\1\152\2\uffff\2\172\1\123\1\172\1\uffff\1\116\1\125\1\uffff\1\117\1\172"
            + "\2\uffff\1\172\1\101\1\141\1\116\1\uffff\1\156\2\uffff\1\172\1\157\1\122"
            + "\1\162\1\71\1\154\1\162\1\uffff\1\122\1\172\1\uffff\1\104\1\144\1\117"
            + "\1\uffff\1\123\1\116\1\157\1\117\1\uffff\1\157\1\uffff\1\117\1\157\2\uffff"
            + "\1\117\1\123\1\115\1\111\2\uffff\1\103\1\143\2\172\1\151\1\111\1\151\1"
            + "\55\1\172\1\141\1\145\1\101\1\105\1\uffff\1\117\1\157\1\122\1\125\1\172"
            + "\1\162\1\116\1\156\1\111\1\151\3\172\1\116\1\103\1\143\1\uffff\1\156\1"
            + "\120\1\160\1\uffff\1\71\1\uffff\1\144\1\141\1\104\1\101\1\127\1\167\1"
            + "\172\1\115\1\uffff\3\172\1\116\1\156\3\uffff\1\172\1\105\1\145\1\172\1"
            + "\124\1\164\1\71\1\157\1\154\1\117\1\114\2\172\1\uffff\1\172\1\uffff\2"
            + "\172\1\uffff\1\123\1\163\2\72\1\124\1\157\1\164\1\117\1\124\3\uffff\1"
            + "\123\1\163\2\uffff\1\71\1\160\1\151\1\120\1\111\2\172\1\71\1\172\1\155"
            + "\1\172\1\115\1\uffff\1\72\1\uffff\1\145\1\105\1\uffff\1\71\2\172\1\71"
            + "\1\uffff\1\132\1\uffff\1\71\1\uffff\1\71\1\132\1\uffff\3\71\1\132\2\uffff";
    static final String DFA46_acceptS
            = "\2\uffff\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\47\uffff\1\100\1\101\1"
            + "\102\1\uffff\1\114\1\115\1\116\1\117\1\120\1\121\1\1\1\5\1\2\105\uffff"
            + "\1\122\1\uffff\1\123\45\uffff\1\51\26\uffff\1\67\3\uffff\1\57\1\77\24"
            + "\uffff\1\31\3\uffff\1\41\1\40\34\uffff\1\62\1\56\27\uffff\1\60\14\uffff"
            + "\1\16\11\uffff\1\63\1\24\14\uffff\1\72\5\uffff\1\47\6\uffff\1\71\4\uffff"
            + "\1\50\2\uffff\1\53\16\uffff\1\74\1\uffff\1\103\27\uffff\1\25\1\27\4\uffff"
            + "\1\34\2\uffff\1\70\2\uffff\1\45\1\54\4\uffff\1\66\1\uffff\1\64\1\61\7"
            + "\uffff\1\13\2\uffff\1\17\3\uffff\1\26\4\uffff\1\43\1\uffff\1\23\2\uffff"
            + "\1\30\1\33\4\uffff\1\37\1\65\15\uffff\1\44\20\uffff\1\55\3\uffff\1\104"
            + "\1\uffff\1\4\10\uffff\1\42\5\uffff\1\32\1\46\1\35\15\uffff\1\21\1\uffff"
            + "\1\22\2\uffff\1\75\11\uffff\1\20\1\36\1\76\2\uffff\1\73\1\105\14\uffff"
            + "\1\52\1\uffff\1\14\2\uffff\1\106\4\uffff\1\15\1\uffff\1\107\1\uffff\1"
            + "\113\2\uffff\1\110\4\uffff\1\111\1\112";
    static final String DFA46_specialS
            = "\u022d\uffff}>";
    static final String[] DFA46_transitionS = {
        "\1\63\1\71\2\uffff\1\71\22\uffff\1\63\5\uffff\1\62\1\72\1\1\1\5\1\2\1"
        + "\65\1\3\1\65\1\uffff\1\65\12\64\1\uffff\1\61\1\67\1\66\1\67\2\uffff\1"
        + "\32\1\45\1\34\1\17\1\70\1\42\1\53\1\40\1\12\1\57\1\27\1\35\1\15\1\51"
        + "\1\47\1\21\1\70\1\23\1\31\1\25\1\36\1\13\1\37\3\70\1\10\1\uffff\1\11"
        + "\1\uffff\1\70\1\uffff\1\41\1\46\1\70\1\20\1\70\1\43\1\54\1\55\1\4\1\60"
        + "\1\30\1\56\1\16\1\52\1\50\1\22\1\70\1\24\1\33\1\26\1\70\1\14\1\44\3\70"
        + "\1\6\1\uffff\1\7",
        "\1\73",
        "",
        "",
        "\1\76",
        "",
        "",
        "",
        "",
        "",
        "\1\77\4\uffff\1\100",
        "\1\101",
        "\1\102",
        "\1\103\7\uffff\1\104",
        "\1\105",
        "\1\106\11\uffff\1\110\2\uffff\1\107\2\uffff\1\111",
        "\1\112\14\uffff\1\113",
        "\1\114\3\uffff\1\115",
        "\1\116",
        "\1\120\5\uffff\1\117",
        "\1\122\5\uffff\1\121",
        "\1\123\6\uffff\1\124",
        "\1\125\6\uffff\1\126",
        "\1\127",
        "\1\130",
        "\1\132\11\uffff\1\133\4\uffff\1\131",
        "\1\136\4\uffff\1\135\1\uffff\1\134",
        "\1\137",
        "\1\140",
        "\1\143\3\uffff\1\142\5\uffff\1\141",
        "\1\144",
        "\1\145",
        "\1\147\7\uffff\1\146",
        "\1\151\4\uffff\1\150",
        "\1\152\10\uffff\1\153",
        "\1\154\10\uffff\1\155",
        "\1\156",
        "\1\157\14\uffff\1\160\6\uffff\1\161",
        "\1\162\14\uffff\1\163\6\uffff\1\164",
        "\1\166\3\uffff\1\165",
        "\1\167",
        "\1\170",
        "\1\171",
        "\1\172",
        "\1\173",
        "\1\174",
        "\1\176\3\uffff\1\175",
        "\1\177\15\uffff\1\u0080",
        "\1\u0081\15\uffff\1\u0082",
        "",
        "",
        "",
        "\1\u0085\1\uffff\12\u0084",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\u0087\1\u0086",
        "\1\u008a\17\uffff\1\u0088\1\u0089",
        "\1\u008b",
        "\1\u008c",
        "\1\u008d",
        "\1\u008e",
        "\1\u008f",
        "\1\u0090",
        "\1\u0091\6\uffff\1\u0092",
        "\1\u0093",
        "\1\u0094",
        "\1\u0095",
        "\1\u0096\6\uffff\1\u0097",
        "\1\u0098",
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
        "\12\70\7\uffff\2\70\1\u00aa\27\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u00ac",
        "\1\u00ad",
        "\1\u00af\6\uffff\1\u00ae",
        "\1\u00b0",
        "\1\u00b2\1\uffff\1\u00b1",
        "\1\u00b3",
        "\1\u00b4",
        "\1\u00b6\3\uffff\1\u00b5",
        "\1\u00b7",
        "\1\u00b8",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\2\70\1\u00b9\27\70",
        "\1\u00ba",
        "\1\u00bb",
        "\1\u00bc",
        "\1\u00bd",
        "\1\u00be",
        "\1\u00bf",
        "\1\u00c0",
        "\1\u00c1",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u00c3",
        "\1\u00c4",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\3\70\1\u00c5\26\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\3\70\1\u00c8\26\70",
        "\1\u00c9",
        "\1\u00ca",
        "\1\u00cb",
        "\1\u00cc",
        "\1\u00cd",
        "\1\u00cf\1\uffff\1\u00ce",
        "\1\u00d0",
        "\1\u00d1",
        "\1\u00d2",
        "\1\u00d3",
        "\1\u00d4",
        "",
        "\1\u0085\1\uffff\12\u00d5",
        "",
        "\1\u00d6\11\uffff\1\u00d7",
        "\1\u00d8",
        "\1\u00d9",
        "\1\u00da",
        "\1\u00db",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u00dd",
        "\1\u00de",
        "\12\70\7\uffff\32\70\4\uffff\1\u00df\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u00e2",
        "\1\u00e4\3\uffff\1\u00e3",
        "\1\u00e5",
        "\1\u00e6",
        "\1\u00e7",
        "\1\u00e8",
        "\1\u00ea\3\uffff\1\u00e9",
        "\1\u00eb",
        "\1\u00ec",
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
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0100",
        "\1\u0101",
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
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u010c",
        "\1\u010d",
        "\1\u010e",
        "\1\u010f",
        "\1\u0110",
        "\1\u0111",
        "\1\u0112",
        "",
        "\1\u0113",
        "\1\u0114",
        "\1\u0115",
        "",
        "",
        "\1\u0116",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0118",
        "\1\u0119",
        "\1\u011a",
        "\1\u011b",
        "\1\u011c",
        "\1\u011d",
        "\1\u011e",
        "\1\u011f",
        "\1\u0120",
        "\1\u0121",
        "\1\u0085\1\uffff\12\u0122",
        "\1\u0123",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0125",
        "\1\u0126",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0127",
        "",
        "\1\u0128",
        "\1\u0129",
        "\1\u012a",
        "",
        "",
        "\1\u012b",
        "\1\u012c",
        "\1\u012d",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0130",
        "\1\u0131",
        "\1\u0132",
        "\1\u0133",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0134",
        "\1\u0135",
        "\1\u0136",
        "\1\u0137",
        "\1\u0138",
        "\1\u0139",
        "\1\u013a",
        "\1\u013b",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u013d",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u013e",
        "\1\u013f",
        "\1\u0140",
        "\1\u0141",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0143",
        "",
        "",
        "\1\u0144",
        "\1\u0145",
        "\1\u0146",
        "\1\u0147",
        "\1\u0148",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u014a",
        "\1\u014b",
        "\1\u014c",
        "\1\u014d",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u014f",
        "\1\u0150",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0152",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0153",
        "\1\u0154",
        "\1\u0155",
        "\1\u0156",
        "\1\u0157",
        "\1\u0158",
        "\1\u0159",
        "",
        "\1\u015a",
        "\1\u015b",
        "\1\u015c",
        "\1\u015d",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u015e",
        "\1\u015f",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0161",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0163\1\u0085\1\uffff\12\u0164",
        "\1\u0165",
        "",
        "\1\u0166",
        "\1\u0167",
        "\1\u0168",
        "\1\u0169",
        "\1\u016a",
        "\1\u016b",
        "\1\u016c",
        "\1\u016d",
        "\1\u016e",
        "",
        "",
        "\1\u016f",
        "\1\u0170",
        "\1\u0171",
        "\1\u0172",
        "\1\u0173",
        "\1\u0174",
        "\1\u0175",
        "\1\u0176",
        "\1\u0177",
        "\1\u0178",
        "\1\u0179",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u017c",
        "\1\u017d",
        "",
        "\1\u017e",
        "\1\u017f",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0181",
        "\1\u0182",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "\1\u0184",
        "\1\u0185",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "\1\u0188",
        "\1\u0189",
        "",
        "\1\u018a",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u018b",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u018d",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0190",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0191",
        "\1\u0192",
        "",
        "\1\u0193",
        "",
        "\12\u0194",
        "\1\u0085\1\uffff\12\u0164",
        "\1\u0195",
        "\12\70\7\uffff\32\70\4\uffff\1\u0196\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\u0198\1\uffff\32\70",
        "\1\u0199",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u019b",
        "\1\u019c",
        "\1\u019d",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u019f",
        "\1\u01a0",
        "\1\u01a1",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01a2",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01a4",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01a6",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01a7",
        "",
        "",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01aa",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "\1\u01ab",
        "\1\u01ac",
        "",
        "\1\u01ad",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01b0",
        "\1\u01b1",
        "\1\u01b2",
        "",
        "\1\u01b3",
        "",
        "",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01b4",
        "\1\u01b5",
        "\1\u01b6",
        "\12\u01b7",
        "\1\u01b8",
        "\1\u01b9\11\uffff\1\u01ba",
        "",
        "\1\u01bb\11\uffff\1\u01bc",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "\1\u01be",
        "\1\u01bf",
        "\1\u01c0",
        "",
        "\1\u01c1",
        "\1\u01c2",
        "\1\u01c3",
        "\1\u01c4",
        "",
        "\1\u01c5",
        "",
        "\1\u01c6",
        "\1\u01c7",
        "",
        "",
        "\1\u01c8",
        "\1\u01c9",
        "\1\u01ca",
        "\1\u01cb",
        "",
        "",
        "\1\u01cc",
        "\1\u01cd",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01cf",
        "\1\u01d0",
        "\1\u01d1",
        "\1\u01d3",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01d5",
        "\1\u01d6",
        "\1\u01d7",
        "\1\u01d8",
        "",
        "\1\u01d9",
        "\1\u01da",
        "\1\u01db",
        "\1\u01dc",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01de",
        "\1\u01df",
        "\1\u01e0",
        "\1\u01e1",
        "\1\u01e2",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01e6",
        "\1\u01e7",
        "\1\u01e8",
        "",
        "\1\u01e9",
        "\1\u01ea",
        "\1\u01eb",
        "",
        "\12\u01ec",
        "",
        "\1\u01ed",
        "\1\u01ee",
        "\1\u01ef",
        "\1\u01f0",
        "\1\u01f1",
        "\1\u01f2",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01f4",
        "",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01f6",
        "\1\u01f7",
        "",
        "",
        "",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01f9",
        "\1\u01fa",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u01fb",
        "\1\u01fc",
        "\12\u01fd",
        "\1\u01fe",
        "\1\u01ff",
        "\1\u0200",
        "\1\u0201",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "",
        "\1\u0205",
        "\1\u0206",
        "\1\u0207",
        "\1\u0207",
        "\1\u0209",
        "\1\u020a",
        "\1\u020b",
        "\1\u020c",
        "\1\u020d",
        "",
        "",
        "",
        "\1\u020e",
        "\1\u020f",
        "",
        "",
        "\12\u0210",
        "\1\u0211",
        "\1\u0212",
        "\1\u0213",
        "\1\u0214",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\u0216",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0218",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\1\u0219",
        "",
        "\1\u021b",
        "",
        "\1\u021c",
        "\1\u021d",
        "",
        "\12\u021e",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\70\7\uffff\32\70\4\uffff\1\70\1\uffff\32\70",
        "\12\u0220",
        "",
        "\1\u0222\37\uffff\1\u0223",
        "",
        "\12\u0224",
        "",
        "\12\u0225",
        "\1\u0227\53\uffff\1\u0223",
        "",
        "\12\u0228",
        "\12\u0229",
        "\12\u022a",
        "\1\u022c\1\uffff\1\u022c\54\uffff\1\u0223",
        "",
        ""
    };

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    protected class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }

        @Override
        public String getDescription() {
            return "1:1: Tokens : ( T__88 | T__89 | T__90 | T__91 | LPARAN | RPARAN | LCURLY | RCURLY | LSQUARE | RSQUARE | INSERT | INSERT_HADOOP | INSERT_REALTIME | INTO | VALUES | MAX_WINDOW | DELIMITOR | PARTITION | ROLLUP | DROP | TABLE | DELETE | KAFKA | STRING | ISO | AUTO_ISO | SELECT | COUNT | LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | DURATION | PERIOD | INCLUDE | WHICH | CONTAINS | SORT | HINT | AS | FIELD_ACCESS | FROM | WHERE | BETWEEN | AND | OR | NOT | GROUP | ASC | DESC | ORDER | HAVING | BREAK | BY | LIMIT | LIKE | THEN | JAVASCRIPT | JOIN | LEFT_JOIN | RIGHT_JOIN | ON | OPT_SEMI_COLON | OPT_AMPERSAND | WS | DATE_YEAR_ONLY | DATE_YEAR_MONTH_ONLY | DATE | DATE_HOUR | DATE_HOUR_MIN | DATE_HOUR_MIN_SEC | DATE_HOUR_MIN_SEC_SUB | DATE_HOUR_MIN_SEC_SUB_TZ | DATE_HOUR_MIN_SEC_SUB_UTC_TZ | ARITH_OPER | EQUALS | COMPARE_OPER | ID | NEWLINE | SINGLE_QUOTE_STRING | LONG | FLOAT );";
        }
    }

}
