// $ANTLR 3.5 /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2014-11-15 16:25:58
package com.yahoo.sql4d.converter;

import org.antlr.runtime.*;
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
import com.yahoo.sql4d.query.select.*;
import com.yahoo.sql4d.query.search.*;
import com.yahoo.sql4d.query.topn.*;
import com.yahoo.sql4d.query.timeboundary.*;
import static com.yahoo.sql4d.Utils.*;
import static com.yahoo.sql4d.DruidUtils.*;

import java.util.List;
import java.util.ArrayList;

/**
 * Copyright 2014 Yahoo! Inc. Licensed under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law
 * or agreed to in writing, software distributed under the License is
 * distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the specific language
 * governing permissions and limitations under the License. See accompanying
 * LICENSE file.
 */
@SuppressWarnings("all")
public class druidGParser extends Parser {

    public static final String[] tokenNames = new String[]{
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARITH_OPER", "AS", "ASC",
        "AUTO_ISO", "BETWEEN", "BREAK", "BY", "COMPARE_OPER", "CONTAINS", "COUNT",
        "DATE", "DATE_HOUR", "DATE_HOUR_MIN", "DATE_HOUR_MIN_SEC", "DATE_HOUR_MIN_SEC_SUB",
        "DATE_HOUR_MIN_SEC_SUB_TZ", "DATE_HOUR_MIN_SEC_SUB_UTC_TZ", "DATE_YEAR_MONTH_ONLY",
        "DATE_YEAR_ONLY", "DELETE", "DELIMITOR", "DESC", "DOUBLE_SUM", "DROP",
        "DURATION", "EQUALS", "ESC_SEQ", "FIELD_ACCESS", "FLOAT", "FROM", "GROUP",
        "HAVING", "HEX_DIGIT", "HINT", "ID", "INCLUDE", "INSERT", "INSERT_HADOOP",
        "INSERT_REALTIME", "INTO", "ISO", "JAVASCRIPT", "JOIN", "KAFKA", "LCURLY",
        "LEFT_JOIN", "LIKE", "LIMIT", "LONG", "LONG_SUM", "LPARAN", "LSQUARE",
        "MAX", "MAX_WINDOW", "MIN", "NEWLINE", "NOT", "NUM", "OCTAL_ESC", "ON",
        "OPT_AMPERSAND", "OPT_SEMI_COLON", "OR", "ORDER", "PARTITION", "PERIOD",
        "RCURLY", "RIGHT_JOIN", "ROLLUP", "RPARAN", "RSQUARE", "SELECT", "SINGLE_QUOTE_STRING",
        "SORT", "STRING", "TABLE", "THEN", "UNICODE_ESC", "UNIQUE", "VALUES",
        "WHERE", "WHICH", "WS", "'(*)'", "'*'", "','", "'interval'"
    };
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
    public Parser[] getDelegates() {
        return new Parser[]{};
    }

    // delegators
    public druidGParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }

    public druidGParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    @Override
    public String[] getTokenNames() {
        return druidGParser.tokenNames;
    }

    @Override
    public String getGrammarFileName() {
        return "/Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g";
    }

    // $ANTLR start "program"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:1: program returns [Program program] : ( (s1= grandQuery ) | (s2= grandInsert ) );
    public final Program program() throws RecognitionException {
        Program program = null;

        QueryProgram s1 = null;
        InsertProgram s2 = null;

        program = null;
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:43:2: ( (s1= grandQuery ) | (s2= grandInsert ) )
            int alt1 = 2;
            int LA1_0 = input.LA(1);
            if ((LA1_0 == SELECT)) {
                alt1 = 1;
            } else if (((LA1_0 >= INSERT && LA1_0 <= INSERT_REALTIME))) {
                alt1 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 1, 0, input);
                throw nvae;
            }

            switch (alt1) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:43:4: (s1= grandQuery )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:43:4: (s1= grandQuery )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:43:5: s1= grandQuery
                    {
                        pushFollow(FOLLOW_grandQuery_in_program42);
                        s1 = grandQuery();
                        state._fsp--;

                    }

                    program = s1;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:44:4: (s2= grandInsert )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:44:4: (s2= grandInsert )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:44:5: s2= grandInsert
                    {
                        pushFollow(FOLLOW_grandInsert_in_program54);
                        s2 = grandInsert();
                        state._fsp--;

                    }

                    program = s2;
                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return program;
    }
	// $ANTLR end "program"

    // $ANTLR start "grandDelete"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:47:1: grandDelete returns [DeleteProgram program] : (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) ;
    public final DeleteProgram grandDelete() throws RecognitionException {
        DeleteProgram program = null;

        DeleteMeta s1 = null;

        program = null;
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:2: ( (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:4: (s1= deleteStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:4: (s1= deleteStmnt )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:5: s1= deleteStmnt
                {
                    pushFollow(FOLLOW_deleteStmnt_in_grandDelete82);
                    s1 = deleteStmnt();
                    state._fsp--;

                }

                program = new DeleteProgram();
                program.addStmnt(s1);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:4: ( WS )?
                int alt2 = 2;
                int LA2_0 = input.LA(1);
                if ((LA2_0 == WS)) {
                    alt2 = 1;
                }
                switch (alt2) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:4: WS
                    {
                        match(input, WS, FOLLOW_WS_in_grandDelete91);
                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
                int alt5 = 2;
                switch (input.LA(1)) {
                    case OPT_SEMI_COLON: {
                        alt5 = 1;
                    }
                    break;
                    case EOF: {
                        alt5 = 1;
                    }
                    break;
                    case OPT_AMPERSAND: {
                        alt5 = 2;
                    }
                    break;
                    default:
                        NoViableAltException nvae
                                = new NoViableAltException("", 5, 0, input);
                        throw nvae;
                }
                switch (alt5) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:9: ( OPT_SEMI_COLON )?
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:9: ( OPT_SEMI_COLON )?
                        int alt3 = 2;
                        int LA3_0 = input.LA(1);
                        if ((LA3_0 == OPT_SEMI_COLON)) {
                            alt3 = 1;
                        }
                        switch (alt3) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:9: OPT_SEMI_COLON
                            {
                                match(input, OPT_SEMI_COLON, FOLLOW_OPT_SEMI_COLON_in_grandDelete95);
                            }
                            break;

                        }

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:27: ( OPT_AMPERSAND )?
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:27: ( OPT_AMPERSAND )?
                        int alt4 = 2;
                        int LA4_0 = input.LA(1);
                        if ((LA4_0 == OPT_AMPERSAND)) {
                            alt4 = 1;
                        }
                        switch (alt4) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:28: OPT_AMPERSAND
                            {
                                match(input, OPT_AMPERSAND, FOLLOW_OPT_AMPERSAND_in_grandDelete101);
                                program.waitForCompletion = false;
                            }
                            break;

                        }

                    }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return program;
    }
	// $ANTLR end "grandDelete"

    // $ANTLR start "grandDrop"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:53:1: grandDrop returns [DropProgram program] : (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) ;
    public final DropProgram grandDrop() throws RecognitionException {
        DropProgram program = null;

        DropMeta s1 = null;

        program = null;
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:2: ( (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:4: (s1= dropStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:4: (s1= dropStmnt )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:5: s1= dropStmnt
                {
                    pushFollow(FOLLOW_dropStmnt_in_grandDrop133);
                    s1 = dropStmnt();
                    state._fsp--;

                }

                program = new DropProgram();
                program.addStmnt(s1);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:4: ( WS )?
                int alt6 = 2;
                int LA6_0 = input.LA(1);
                if ((LA6_0 == WS)) {
                    alt6 = 1;
                }
                switch (alt6) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:4: WS
                    {
                        match(input, WS, FOLLOW_WS_in_grandDrop142);
                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
                int alt9 = 2;
                switch (input.LA(1)) {
                    case OPT_SEMI_COLON: {
                        alt9 = 1;
                    }
                    break;
                    case EOF: {
                        alt9 = 1;
                    }
                    break;
                    case OPT_AMPERSAND: {
                        alt9 = 2;
                    }
                    break;
                    default:
                        NoViableAltException nvae
                                = new NoViableAltException("", 9, 0, input);
                        throw nvae;
                }
                switch (alt9) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:9: ( OPT_SEMI_COLON )?
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:9: ( OPT_SEMI_COLON )?
                        int alt7 = 2;
                        int LA7_0 = input.LA(1);
                        if ((LA7_0 == OPT_SEMI_COLON)) {
                            alt7 = 1;
                        }
                        switch (alt7) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:9: OPT_SEMI_COLON
                            {
                                match(input, OPT_SEMI_COLON, FOLLOW_OPT_SEMI_COLON_in_grandDrop146);
                            }
                            break;

                        }

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:27: ( OPT_AMPERSAND )?
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:27: ( OPT_AMPERSAND )?
                        int alt8 = 2;
                        int LA8_0 = input.LA(1);
                        if ((LA8_0 == OPT_AMPERSAND)) {
                            alt8 = 1;
                        }
                        switch (alt8) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:28: OPT_AMPERSAND
                            {
                                match(input, OPT_AMPERSAND, FOLLOW_OPT_AMPERSAND_in_grandDrop152);
                                program.waitForCompletion = false;
                            }
                            break;

                        }

                    }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return program;
    }
	// $ANTLR end "grandDrop"

    // $ANTLR start "grandInsert"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:59:1: grandInsert returns [InsertProgram program] : ( (s1= insertStmnt ) | (s2= insertHStmnt ) | (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) );
    public final InsertProgram grandInsert() throws RecognitionException {
        InsertProgram program = null;

        BasicInsertMeta s1 = null;
        BatchInsertMeta s2 = null;
        RTInsertMeta s3 = null;

        program = null;
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:61:2: ( (s1= insertStmnt ) | (s2= insertHStmnt ) | (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? ) )
            int alt14 = 3;
            switch (input.LA(1)) {
                case INSERT: {
                    alt14 = 1;
                }
                break;
                case INSERT_HADOOP: {
                    alt14 = 2;
                }
                break;
                case INSERT_REALTIME: {
                    alt14 = 3;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 14, 0, input);
                    throw nvae;
            }
            switch (alt14) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:61:4: (s1= insertStmnt )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:61:4: (s1= insertStmnt )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:61:5: s1= insertStmnt
                    {
                        pushFollow(FOLLOW_insertStmnt_in_grandInsert183);
                        s1 = insertStmnt();
                        state._fsp--;

                    }

                    program = InsertProgram.getInsertInstance();
                    program.addStmnt(s1);
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:62:4: (s2= insertHStmnt )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:62:4: (s2= insertHStmnt )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:62:5: s2= insertHStmnt
                    {
                        pushFollow(FOLLOW_insertHStmnt_in_grandInsert195);
                        s2 = insertHStmnt();
                        state._fsp--;

                    }

                    program = InsertProgram.getInsertHadoopInstance();
                    program.addStmnt(s2);
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:63:4: (s3= insertRTStmnt ) ( WS )? ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:63:4: (s3= insertRTStmnt )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:63:5: s3= insertRTStmnt
                    {
                        pushFollow(FOLLOW_insertRTStmnt_in_grandInsert207);
                        s3 = insertRTStmnt();
                        state._fsp--;

                    }

                    program = InsertProgram.getInsertRTInstance();
                    program.addStmnt(s3);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:4: ( WS )?
                    int alt10 = 2;
                    int LA10_0 = input.LA(1);
                    if ((LA10_0 == WS)) {
                        alt10 = 1;
                    }
                    switch (alt10) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:4: WS
                        {
                            match(input, WS, FOLLOW_WS_in_grandInsert216);
                        }
                        break;

                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:8: ( ( OPT_SEMI_COLON )? | ( OPT_AMPERSAND )? )
                    int alt13 = 2;
                    switch (input.LA(1)) {
                        case OPT_SEMI_COLON: {
                            alt13 = 1;
                        }
                        break;
                        case EOF: {
                            alt13 = 1;
                        }
                        break;
                        case OPT_AMPERSAND: {
                            alt13 = 2;
                        }
                        break;
                        default:
                            NoViableAltException nvae
                                    = new NoViableAltException("", 13, 0, input);
                            throw nvae;
                    }
                    switch (alt13) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:9: ( OPT_SEMI_COLON )?
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:9: ( OPT_SEMI_COLON )?
                            int alt11 = 2;
                            int LA11_0 = input.LA(1);
                            if ((LA11_0 == OPT_SEMI_COLON)) {
                                alt11 = 1;
                            }
                            switch (alt11) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:9: OPT_SEMI_COLON
                                {
                                    match(input, OPT_SEMI_COLON, FOLLOW_OPT_SEMI_COLON_in_grandInsert220);
                                }
                                break;

                            }

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:27: ( OPT_AMPERSAND )?
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:27: ( OPT_AMPERSAND )?
                            int alt12 = 2;
                            int LA12_0 = input.LA(1);
                            if ((LA12_0 == OPT_AMPERSAND)) {
                                alt12 = 1;
                            }
                            switch (alt12) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:28: OPT_AMPERSAND
                                {
                                    match(input, OPT_AMPERSAND, FOLLOW_OPT_AMPERSAND_in_grandInsert226);
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
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return program;
    }
	// $ANTLR end "grandInsert"

    // $ANTLR start "deleteStmnt"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:1: deleteStmnt returns [DeleteMeta dMeta] : DELETE WS FROM WS (id= ID ) WHERE WS i= intervalClause ;
    public final DeleteMeta deleteStmnt() throws RecognitionException {
        DeleteMeta dMeta = null;

        Token id = null;
        List<Interval> i = null;

        dMeta = new DeleteMeta();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:69:2: ( DELETE WS FROM WS (id= ID ) WHERE WS i= intervalClause )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:69:3: DELETE WS FROM WS (id= ID ) WHERE WS i= intervalClause
            {
                match(input, DELETE, FOLLOW_DELETE_in_deleteStmnt252);
                match(input, WS, FOLLOW_WS_in_deleteStmnt254);
                match(input, FROM, FOLLOW_FROM_in_deleteStmnt256);
                match(input, WS, FOLLOW_WS_in_deleteStmnt258);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:69:21: (id= ID )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:69:22: id= ID
                {
                    id = (Token) match(input, ID, FOLLOW_ID_in_deleteStmnt263);
                    dMeta.dataSource = (id != null ? id.getText() : null);
                }

                match(input, WHERE, FOLLOW_WHERE_in_deleteStmnt270);
                match(input, WS, FOLLOW_WS_in_deleteStmnt272);
                pushFollow(FOLLOW_intervalClause_in_deleteStmnt276);
                i = intervalClause();
                state._fsp--;

                // We set this later after granularitySpec object is fully formed.
                if (i != null && !i.isEmpty()) {
                    dMeta.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return dMeta;
    }
	// $ANTLR end "deleteStmnt"

    // $ANTLR start "dropStmnt"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:78:1: dropStmnt returns [DropMeta dMeta] : DROP WS TABLE WS (id= ID ) ;
    public final DropMeta dropStmnt() throws RecognitionException {
        DropMeta dMeta = null;

        Token id = null;

        dMeta = new DropMeta();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:2: ( DROP WS TABLE WS (id= ID ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:3: DROP WS TABLE WS (id= ID )
            {
                match(input, DROP, FOLLOW_DROP_in_dropStmnt304);
                match(input, WS, FOLLOW_WS_in_dropStmnt306);
                match(input, TABLE, FOLLOW_TABLE_in_dropStmnt308);
                match(input, WS, FOLLOW_WS_in_dropStmnt310);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:20: (id= ID )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:21: id= ID
                {
                    id = (Token) match(input, ID, FOLLOW_ID_in_dropStmnt315);
                    dMeta.dataSource = (id != null ? id.getText() : null);
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return dMeta;
    }
	// $ANTLR end "dropStmnt"

    // $ANTLR start "insertStmnt"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:83:1: insertStmnt returns [BasicInsertMeta iMeta] : ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ;
    public final BasicInsertMeta insertStmnt() throws RecognitionException {
        BasicInsertMeta iMeta = null;

        Token id = null;
        Token paths = null;
        Token gran = null;
        Token delim = null;
        Token listDelim = null;
        Object a = null;
        List<Interval> i = null;

        iMeta = new BasicInsertMeta();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:2: ( ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) ) ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:3: ( INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:4: INSERT WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )?
                {
                    match(input, INSERT, FOLLOW_INSERT_in_insertStmnt342);
                    match(input, WS, FOLLOW_WS_in_insertStmnt344);
                    match(input, INTO, FOLLOW_INTO_in_insertStmnt346);
                    match(input, WS, FOLLOW_WS_in_insertStmnt348);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:22: (id= ID )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:23: id= ID
                    {
                        id = (Token) match(input, ID, FOLLOW_ID_in_insertStmnt353);
                        iMeta.dataSource = (id != null ? id.getText() : null);
                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:62: ( WS )?
                    int alt15 = 2;
                    int LA15_0 = input.LA(1);
                    if ((LA15_0 == WS)) {
                        alt15 = 1;
                    }
                    switch (alt15) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:62: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertStmnt358);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_insertStmnt361);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:73: ( WS )?
                    int alt16 = 2;
                    int LA16_0 = input.LA(1);
                    if ((LA16_0 == WS)) {
                        alt16 = 1;
                    }
                    switch (alt16) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:73: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertStmnt363);
                        }
                        break;

                    }

                    pushFollow(FOLLOW_selectItems_in_insertStmnt366);
                    selectItems(iMeta);
                    state._fsp--;

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:96: ( ( WS )? ',' ( WS )? selectItems[iMeta] )*
                    loop19:
                    while (true) {
                        int alt19 = 2;
                        int LA19_0 = input.LA(1);
                        if ((LA19_0 == WS)) {
                            int LA19_1 = input.LA(2);
                            if ((LA19_1 == 90)) {
                                alt19 = 1;
                            }

                        } else if ((LA19_0 == 90)) {
                            alt19 = 1;
                        }

                        switch (alt19) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:97: ( WS )? ',' ( WS )? selectItems[iMeta]
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:97: ( WS )?
                                int alt17 = 2;
                                int LA17_0 = input.LA(1);
                                if ((LA17_0 == WS)) {
                                    alt17 = 1;
                                }
                                switch (alt17) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:97: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertStmnt370);
                                    }
                                    break;

                                }

                                match(input, 90, FOLLOW_90_in_insertStmnt373);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:105: ( WS )?
                                int alt18 = 2;
                                int LA18_0 = input.LA(1);
                                if ((LA18_0 == WS)) {
                                    alt18 = 1;
                                }
                                switch (alt18) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:105: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertStmnt375);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_selectItems_in_insertStmnt378);
                                selectItems(iMeta);
                                state._fsp--;

                            }
                            break;

                            default:
                                break loop19;
                        }
                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:130: ( WS )?
                    int alt20 = 2;
                    int LA20_0 = input.LA(1);
                    if ((LA20_0 == WS)) {
                        alt20 = 1;
                    }
                    switch (alt20) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:130: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertStmnt383);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_insertStmnt386);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:141: ( WS )?
                    int alt21 = 2;
                    int LA21_0 = input.LA(1);
                    if ((LA21_0 == WS)) {
                        alt21 = 1;
                    }
                    switch (alt21) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:85:141: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertStmnt388);
                        }
                        break;

                    }

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:86:3: ( ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ) | ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS ) )
                int alt29 = 2;
                int LA29_0 = input.LA(1);
                if ((LA29_0 == VALUES)) {
                    alt29 = 1;
                } else if ((LA29_0 == FROM)) {
                    alt29 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 29, 0, input);
                    throw nvae;
                }

                switch (alt29) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:5: ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? )
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:5: ( VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:6: VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )?
                        {
                            match(input, VALUES, FOLLOW_VALUES_in_insertStmnt401);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:13: ( WS )?
                            int alt22 = 2;
                            int LA22_0 = input.LA(1);
                            if ((LA22_0 == WS)) {
                                alt22 = 1;
                            }
                            switch (alt22) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:13: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_insertStmnt403);
                                }
                                break;

                            }

                            match(input, LPARAN, FOLLOW_LPARAN_in_insertStmnt406);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:24: ( WS )?
                            int alt23 = 2;
                            int LA23_0 = input.LA(1);
                            if ((LA23_0 == WS)) {
                                alt23 = 1;
                            }
                            switch (alt23) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:24: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_insertStmnt408);
                                }
                                break;

                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:28: (a= anyValue )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:29: a= anyValue
                            {
                                pushFollow(FOLLOW_anyValue_in_insertStmnt414);
                                a = anyValue();
                                state._fsp--;

                                iMeta.values.add(a);
                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:65: ( ( WS )? ',' ( WS )? a= anyValue )*
                            loop26:
                            while (true) {
                                int alt26 = 2;
                                int LA26_0 = input.LA(1);
                                if ((LA26_0 == WS)) {
                                    int LA26_1 = input.LA(2);
                                    if ((LA26_1 == 90)) {
                                        alt26 = 1;
                                    }

                                } else if ((LA26_0 == 90)) {
                                    alt26 = 1;
                                }

                                switch (alt26) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:66: ( WS )? ',' ( WS )? a= anyValue
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:66: ( WS )?
                                        int alt24 = 2;
                                        int LA24_0 = input.LA(1);
                                        if ((LA24_0 == WS)) {
                                            alt24 = 1;
                                        }
                                        switch (alt24) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:66: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_insertStmnt421);
                                            }
                                            break;

                                        }

                                        match(input, 90, FOLLOW_90_in_insertStmnt424);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:74: ( WS )?
                                        int alt25 = 2;
                                        int LA25_0 = input.LA(1);
                                        if ((LA25_0 == WS)) {
                                            alt25 = 1;
                                        }
                                        switch (alt25) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:74: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_insertStmnt426);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_anyValue_in_insertStmnt431);
                                        a = anyValue();
                                        state._fsp--;

                                        iMeta.values.add(a);
                                    }
                                    break;

                                    default:
                                        break loop26;
                                }
                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:114: ( WS )?
                            int alt27 = 2;
                            int LA27_0 = input.LA(1);
                            if ((LA27_0 == WS)) {
                                alt27 = 1;
                            }
                            switch (alt27) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:114: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_insertStmnt437);
                                }
                                break;

                            }

                            match(input, RPARAN, FOLLOW_RPARAN_in_insertStmnt440);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:125: ( WS )?
                            int alt28 = 2;
                            int LA28_0 = input.LA(1);
                            if ((LA28_0 == WS)) {
                                int LA28_1 = input.LA(2);
                                if ((LA28_1 == EOF || LA28_1 == DELIMITOR || LA28_1 == WHERE || LA28_1 == WS)) {
                                    alt28 = 1;
                                }
                            }
                            switch (alt28) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:87:125: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_insertStmnt442);
                                }
                                break;

                            }

                        }

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:5: ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS )
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:5: ( FROM WS (paths= SINGLE_QUOTE_STRING ) WS )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:6: FROM WS (paths= SINGLE_QUOTE_STRING ) WS
                        {
                            match(input, FROM, FOLLOW_FROM_in_insertStmnt459);
                            match(input, WS, FOLLOW_WS_in_insertStmnt461);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:14: (paths= SINGLE_QUOTE_STRING )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:15: paths= SINGLE_QUOTE_STRING
                            {
                                paths = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt466);
                                iMeta.dataPath = unquote((paths != null ? paths.getText() : null));
                            }

                            match(input, WS, FOLLOW_WS_in_insertStmnt471);
                        }

                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:3: ( WHERE WS i= intervalClause )?
                int alt30 = 2;
                int LA30_0 = input.LA(1);
                if ((LA30_0 == WHERE)) {
                    alt30 = 1;
                }
                switch (alt30) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:91:4: WHERE WS i= intervalClause
                    {
                        match(input, WHERE, FOLLOW_WHERE_in_insertStmnt481);
                        match(input, WS, FOLLOW_WS_in_insertStmnt483);
                        pushFollow(FOLLOW_intervalClause_in_insertStmnt487);
                        i = intervalClause();
                        state._fsp--;

                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:92:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
                int alt31 = 2;
                int LA31_0 = input.LA(1);
                if ((LA31_0 == WS)) {
                    alt31 = 1;
                }
                switch (alt31) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:92:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
                    {
                        match(input, WS, FOLLOW_WS_in_insertStmnt495);
                        match(input, BREAK, FOLLOW_BREAK_in_insertStmnt497);
                        match(input, WS, FOLLOW_WS_in_insertStmnt499);
                        match(input, BY, FOLLOW_BY_in_insertStmnt501);
                        match(input, WS, FOLLOW_WS_in_insertStmnt503);
                        gran = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt507);
                        iMeta.granularitySpec = new GranularitySpec(unquote((gran != null ? gran.getText() : null)));
                    }
                    break;

                }

                // We set this later after granularitySpec object is fully formed.
                if (i != null && !i.isEmpty()) {
                    iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:2: ( DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
                int alt39 = 2;
                int LA39_0 = input.LA(1);
                if ((LA39_0 == DELIMITOR)) {
                    alt39 = 1;
                }
                switch (alt39) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:3: DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )?
                    {
                        match(input, DELIMITOR, FOLLOW_DELIMITOR_in_insertStmnt521);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:13: ( WS )?
                        int alt32 = 2;
                        int LA32_0 = input.LA(1);
                        if ((LA32_0 == WS)) {
                            alt32 = 1;
                        }
                        switch (alt32) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:13: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertStmnt523);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_insertStmnt526);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:24: ( WS )?
                        int alt33 = 2;
                        int LA33_0 = input.LA(1);
                        if ((LA33_0 == WS)) {
                            alt33 = 1;
                        }
                        switch (alt33) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:24: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertStmnt528);
                            }
                            break;

                        }

                        delim = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt533);
                        iMeta.delimiter = unquote((delim != null ? delim.getText() : null));
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:93: ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )?
                        int alt36 = 2;
                        int LA36_0 = input.LA(1);
                        if ((LA36_0 == WS)) {
                            int LA36_1 = input.LA(2);
                            if ((LA36_1 == 90)) {
                                alt36 = 1;
                            }
                        } else if ((LA36_0 == 90)) {
                            alt36 = 1;
                        }
                        switch (alt36) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:94: ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:94: ( WS )?
                                int alt34 = 2;
                                int LA34_0 = input.LA(1);
                                if ((LA34_0 == WS)) {
                                    alt34 = 1;
                                }
                                switch (alt34) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:94: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertStmnt537);
                                    }
                                    break;

                                }

                                match(input, 90, FOLLOW_90_in_insertStmnt540);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:102: ( WS )?
                                int alt35 = 2;
                                int LA35_0 = input.LA(1);
                                if ((LA35_0 == WS)) {
                                    alt35 = 1;
                                }
                                switch (alt35) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:102: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertStmnt542);
                                    }
                                    break;

                                }

                                listDelim = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt547);
                                iMeta.listDelimiter = unquote((listDelim != null ? listDelim.getText() : null));
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:186: ( WS )?
                        int alt37 = 2;
                        int LA37_0 = input.LA(1);
                        if ((LA37_0 == WS)) {
                            alt37 = 1;
                        }
                        switch (alt37) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:186: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertStmnt553);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_insertStmnt556);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:197: ( WS )?
                        int alt38 = 2;
                        int LA38_0 = input.LA(1);
                        if ((LA38_0 == WS)) {
                            alt38 = 1;
                        }
                        switch (alt38) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:197: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertStmnt558);
                            }
                            break;

                        }

                    }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return iMeta;
    }
	// $ANTLR end "insertStmnt"

    // $ANTLR start "insertHStmnt"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:101:1: insertHStmnt returns [BatchInsertMeta bMeta] : ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause WS )? ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )? ;
    public final BatchInsertMeta insertHStmnt() throws RecognitionException {
        BatchInsertMeta bMeta = null;

        Token id = null;
        Token paths = null;
        Token gran = null;
        Token delim = null;
        Token listDelim = null;
        Token type = null;
        Token size = null;
        Token boundary = null;
        List<Interval> i = null;

        bMeta = new BatchInsertMeta();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:2: ( ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause WS )? ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:3: ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? ) FROM WS (paths= SINGLE_QUOTE_STRING ) WS ( WHERE WS i= intervalClause WS )? ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ( DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )? ( PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )? ( ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )?
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:3: ( INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:4: INSERT_HADOOP WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[bMeta] ( ( WS )? ',' ( WS )? selectItems[bMeta] )* ( WS )? RPARAN ( WS )?
                {
                    match(input, INSERT_HADOOP, FOLLOW_INSERT_HADOOP_in_insertHStmnt582);
                    match(input, WS, FOLLOW_WS_in_insertHStmnt584);
                    match(input, INTO, FOLLOW_INTO_in_insertHStmnt586);
                    match(input, WS, FOLLOW_WS_in_insertHStmnt588);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:29: (id= ID )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:30: id= ID
                    {
                        id = (Token) match(input, ID, FOLLOW_ID_in_insertHStmnt593);
                        bMeta.dataSource = (id != null ? id.getText() : null);
                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:69: ( WS )?
                    int alt40 = 2;
                    int LA40_0 = input.LA(1);
                    if ((LA40_0 == WS)) {
                        alt40 = 1;
                    }
                    switch (alt40) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:69: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertHStmnt598);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_insertHStmnt601);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:80: ( WS )?
                    int alt41 = 2;
                    int LA41_0 = input.LA(1);
                    if ((LA41_0 == WS)) {
                        alt41 = 1;
                    }
                    switch (alt41) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:80: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertHStmnt603);
                        }
                        break;

                    }

                    pushFollow(FOLLOW_selectItems_in_insertHStmnt606);
                    selectItems(bMeta);
                    state._fsp--;

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:103: ( ( WS )? ',' ( WS )? selectItems[bMeta] )*
                    loop44:
                    while (true) {
                        int alt44 = 2;
                        int LA44_0 = input.LA(1);
                        if ((LA44_0 == WS)) {
                            int LA44_1 = input.LA(2);
                            if ((LA44_1 == 90)) {
                                alt44 = 1;
                            }

                        } else if ((LA44_0 == 90)) {
                            alt44 = 1;
                        }

                        switch (alt44) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:104: ( WS )? ',' ( WS )? selectItems[bMeta]
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:104: ( WS )?
                                int alt42 = 2;
                                int LA42_0 = input.LA(1);
                                if ((LA42_0 == WS)) {
                                    alt42 = 1;
                                }
                                switch (alt42) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:104: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertHStmnt610);
                                    }
                                    break;

                                }

                                match(input, 90, FOLLOW_90_in_insertHStmnt613);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:112: ( WS )?
                                int alt43 = 2;
                                int LA43_0 = input.LA(1);
                                if ((LA43_0 == WS)) {
                                    alt43 = 1;
                                }
                                switch (alt43) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:112: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertHStmnt615);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_selectItems_in_insertHStmnt618);
                                selectItems(bMeta);
                                state._fsp--;

                            }
                            break;

                            default:
                                break loop44;
                        }
                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:137: ( WS )?
                    int alt45 = 2;
                    int LA45_0 = input.LA(1);
                    if ((LA45_0 == WS)) {
                        alt45 = 1;
                    }
                    switch (alt45) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:137: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertHStmnt623);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_insertHStmnt626);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:148: ( WS )?
                    int alt46 = 2;
                    int LA46_0 = input.LA(1);
                    if ((LA46_0 == WS)) {
                        alt46 = 1;
                    }
                    switch (alt46) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:148: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertHStmnt628);
                        }
                        break;

                    }

                }

                bMeta.rollupSpec.aggs = bMeta.aggregations;
                bMeta.dataSpec.dimensions = getDimensions(bMeta.fetchDimensions);
                bMeta.dataSpec.columns = getColumns(bMeta.fetchDimensions, bMeta.aggregations);

                match(input, FROM, FOLLOW_FROM_in_insertHStmnt638);
                match(input, WS, FOLLOW_WS_in_insertHStmnt640);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:11: (paths= SINGLE_QUOTE_STRING )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:12: paths= SINGLE_QUOTE_STRING
                {
                    paths = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt645);
                    bMeta.pathSpec.setPath(unquote((paths != null ? paths.getText() : null)));
                    bMeta.dataSpec.inferFormat(unquote((paths != null ? paths.getText() : null)));
                }

                match(input, WS, FOLLOW_WS_in_insertHStmnt650);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:3: ( WHERE WS i= intervalClause WS )?
                int alt47 = 2;
                int LA47_0 = input.LA(1);
                if ((LA47_0 == WHERE)) {
                    alt47 = 1;
                }
                switch (alt47) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:110:4: WHERE WS i= intervalClause WS
                    {
                        match(input, WHERE, FOLLOW_WHERE_in_insertHStmnt655);
                        match(input, WS, FOLLOW_WS_in_insertHStmnt657);
                        pushFollow(FOLLOW_intervalClause_in_insertHStmnt661);
                        i = intervalClause();
                        state._fsp--;

                        match(input, WS, FOLLOW_WS_in_insertHStmnt663);
                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:111:4: ( BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
                int alt48 = 2;
                int LA48_0 = input.LA(1);
                if ((LA48_0 == BREAK)) {
                    alt48 = 1;
                }
                switch (alt48) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:111:5: BREAK WS BY WS gran= SINGLE_QUOTE_STRING
                    {
                        match(input, BREAK, FOLLOW_BREAK_in_insertHStmnt671);
                        match(input, WS, FOLLOW_WS_in_insertHStmnt673);
                        match(input, BY, FOLLOW_BY_in_insertHStmnt675);
                        match(input, WS, FOLLOW_WS_in_insertHStmnt677);
                        gran = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt681);
                        bMeta.granularitySpec = new GranularitySpec(unquote((gran != null ? gran.getText() : null)));
                    }
                    break;

                }

                // We set this later after granularitySpec object is fully formed.
                if (i != null && !i.isEmpty()) {
                    bMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:3: ( DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )? )?
                int alt56 = 2;
                int LA56_0 = input.LA(1);
                if ((LA56_0 == DELIMITOR)) {
                    alt56 = 1;
                }
                switch (alt56) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:4: DELIMITOR ( WS )? LPARAN ( WS )? delim= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )? ( WS )? RPARAN ( WS )?
                    {
                        match(input, DELIMITOR, FOLLOW_DELIMITOR_in_insertHStmnt696);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:14: ( WS )?
                        int alt49 = 2;
                        int LA49_0 = input.LA(1);
                        if ((LA49_0 == WS)) {
                            alt49 = 1;
                        }
                        switch (alt49) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:14: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt698);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_insertHStmnt701);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:25: ( WS )?
                        int alt50 = 2;
                        int LA50_0 = input.LA(1);
                        if ((LA50_0 == WS)) {
                            alt50 = 1;
                        }
                        switch (alt50) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:25: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt703);
                            }
                            break;

                        }

                        delim = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt708);
                        bMeta.dataSpec.delimiter = unquote((delim != null ? delim.getText() : null));
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:103: ( ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING )?
                        int alt53 = 2;
                        int LA53_0 = input.LA(1);
                        if ((LA53_0 == WS)) {
                            int LA53_1 = input.LA(2);
                            if ((LA53_1 == 90)) {
                                alt53 = 1;
                            }
                        } else if ((LA53_0 == 90)) {
                            alt53 = 1;
                        }
                        switch (alt53) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:104: ( WS )? ',' ( WS )? listDelim= SINGLE_QUOTE_STRING
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:104: ( WS )?
                                int alt51 = 2;
                                int LA51_0 = input.LA(1);
                                if ((LA51_0 == WS)) {
                                    alt51 = 1;
                                }
                                switch (alt51) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:104: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertHStmnt712);
                                    }
                                    break;

                                }

                                match(input, 90, FOLLOW_90_in_insertHStmnt715);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:112: ( WS )?
                                int alt52 = 2;
                                int LA52_0 = input.LA(1);
                                if ((LA52_0 == WS)) {
                                    alt52 = 1;
                                }
                                switch (alt52) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:112: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertHStmnt717);
                                    }
                                    break;

                                }

                                listDelim = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt722);
                                bMeta.dataSpec.listDelimiter = unquote((listDelim != null ? listDelim.getText() : null));
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:205: ( WS )?
                        int alt54 = 2;
                        int LA54_0 = input.LA(1);
                        if ((LA54_0 == WS)) {
                            alt54 = 1;
                        }
                        switch (alt54) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:205: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt728);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_insertHStmnt731);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:216: ( WS )?
                        int alt55 = 2;
                        int LA55_0 = input.LA(1);
                        if ((LA55_0 == WS)) {
                            alt55 = 1;
                        }
                        switch (alt55) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:117:216: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt733);
                            }
                            break;

                        }

                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:3: ( PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )? )?
                int alt63 = 2;
                int LA63_0 = input.LA(1);
                if ((LA63_0 == PARTITION)) {
                    alt63 = 1;
                }
                switch (alt63) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:4: PARTITION ( WS )? LPARAN ( WS )? type= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? size= LONG ( WS )? RPARAN ( WS )?
                    {
                        match(input, PARTITION, FOLLOW_PARTITION_in_insertHStmnt742);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:14: ( WS )?
                        int alt57 = 2;
                        int LA57_0 = input.LA(1);
                        if ((LA57_0 == WS)) {
                            alt57 = 1;
                        }
                        switch (alt57) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:14: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt744);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_insertHStmnt747);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:25: ( WS )?
                        int alt58 = 2;
                        int LA58_0 = input.LA(1);
                        if ((LA58_0 == WS)) {
                            alt58 = 1;
                        }
                        switch (alt58) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:25: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt749);
                            }
                            break;

                        }

                        type = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt754);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:54: ( WS )?
                        int alt59 = 2;
                        int LA59_0 = input.LA(1);
                        if ((LA59_0 == WS)) {
                            alt59 = 1;
                        }
                        switch (alt59) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:54: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt756);
                            }
                            break;

                        }

                        match(input, 90, FOLLOW_90_in_insertHStmnt759);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:62: ( WS )?
                        int alt60 = 2;
                        int LA60_0 = input.LA(1);
                        if ((LA60_0 == WS)) {
                            alt60 = 1;
                        }
                        switch (alt60) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:62: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt761);
                            }
                            break;

                        }

                        size = (Token) match(input, LONG, FOLLOW_LONG_in_insertHStmnt766);
                        bMeta.partitionsSpec.type = unquote((type != null ? type.getText() : null));
                        bMeta.partitionsSpec.targetPartitionSize = Long.valueOf((size != null ? size.getText() : null));
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:192: ( WS )?
                        int alt61 = 2;
                        int LA61_0 = input.LA(1);
                        if ((LA61_0 == WS)) {
                            alt61 = 1;
                        }
                        switch (alt61) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:192: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt770);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_insertHStmnt773);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:203: ( WS )?
                        int alt62 = 2;
                        int LA62_0 = input.LA(1);
                        if ((LA62_0 == WS)) {
                            alt62 = 1;
                        }
                        switch (alt62) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:118:203: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt775);
                            }
                            break;

                        }

                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:3: ( ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )? )?
                int alt70 = 2;
                int LA70_0 = input.LA(1);
                if ((LA70_0 == ROLLUP)) {
                    alt70 = 1;
                }
                switch (alt70) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:4: ROLLUP ( WS )? LPARAN ( WS )? gran= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? boundary= LONG ( WS )? RPARAN ( WS )?
                    {
                        match(input, ROLLUP, FOLLOW_ROLLUP_in_insertHStmnt783);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:11: ( WS )?
                        int alt64 = 2;
                        int LA64_0 = input.LA(1);
                        if ((LA64_0 == WS)) {
                            alt64 = 1;
                        }
                        switch (alt64) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:11: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt785);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_insertHStmnt788);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:22: ( WS )?
                        int alt65 = 2;
                        int LA65_0 = input.LA(1);
                        if ((LA65_0 == WS)) {
                            alt65 = 1;
                        }
                        switch (alt65) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:22: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt790);
                            }
                            break;

                        }

                        gran = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt795);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:51: ( WS )?
                        int alt66 = 2;
                        int LA66_0 = input.LA(1);
                        if ((LA66_0 == WS)) {
                            alt66 = 1;
                        }
                        switch (alt66) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:51: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt797);
                            }
                            break;

                        }

                        match(input, 90, FOLLOW_90_in_insertHStmnt800);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:59: ( WS )?
                        int alt67 = 2;
                        int LA67_0 = input.LA(1);
                        if ((LA67_0 == WS)) {
                            alt67 = 1;
                        }
                        switch (alt67) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:59: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt802);
                            }
                            break;

                        }

                        boundary = (Token) match(input, LONG, FOLLOW_LONG_in_insertHStmnt807);
                        bMeta.rollupSpec.rollupGranularity = unquote((gran != null ? gran.getText() : null));
                        bMeta.rollupSpec.rowFlushBoundary = Long.valueOf((boundary != null ? boundary.getText() : null));
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:199: ( WS )?
                        int alt68 = 2;
                        int LA68_0 = input.LA(1);
                        if ((LA68_0 == WS)) {
                            alt68 = 1;
                        }
                        switch (alt68) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:199: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt811);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_insertHStmnt814);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:210: ( WS )?
                        int alt69 = 2;
                        int LA69_0 = input.LA(1);
                        if ((LA69_0 == WS)) {
                            alt69 = 1;
                        }
                        switch (alt69) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:119:210: WS
                            {
                                match(input, WS, FOLLOW_WS_in_insertHStmnt816);
                            }
                            break;

                        }

                    }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return bMeta;
    }
	// $ANTLR end "insertHStmnt"

    // $ANTLR start "insertRTStmnt"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:122:1: insertRTStmnt returns [RTInsertMeta iMeta] : ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? ;
    public final RTInsertMeta insertRTStmnt() throws RecognitionException {
        RTInsertMeta iMeta = null;

        Token id = null;
        Token gran = null;
        Object a = null;
        List<Interval> i = null;

        iMeta = new RTInsertMeta();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:2: ( ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:3: ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? ) VALUES ( WS )? LPARAN ( WS )? (a= anyValue ) ( ( WS )? ',' ( WS )? a= anyValue )* ( WS )? RPARAN ( WS )? ( WHERE WS i= intervalClause )? ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:3: ( INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:4: INSERT_REALTIME WS INTO WS (id= ID ) ( WS )? LPARAN ( WS )? selectItems[iMeta] ( ( WS )? ',' ( WS )? selectItems[iMeta] )* ( WS )? RPARAN ( WS )?
                {
                    match(input, INSERT_REALTIME, FOLLOW_INSERT_REALTIME_in_insertRTStmnt839);
                    match(input, WS, FOLLOW_WS_in_insertRTStmnt841);
                    match(input, INTO, FOLLOW_INTO_in_insertRTStmnt843);
                    match(input, WS, FOLLOW_WS_in_insertRTStmnt845);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:31: (id= ID )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:32: id= ID
                    {
                        id = (Token) match(input, ID, FOLLOW_ID_in_insertRTStmnt850);
                        iMeta.dataSource = (id != null ? id.getText() : null);
                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:71: ( WS )?
                    int alt71 = 2;
                    int LA71_0 = input.LA(1);
                    if ((LA71_0 == WS)) {
                        alt71 = 1;
                    }
                    switch (alt71) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:71: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertRTStmnt855);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_insertRTStmnt858);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:82: ( WS )?
                    int alt72 = 2;
                    int LA72_0 = input.LA(1);
                    if ((LA72_0 == WS)) {
                        alt72 = 1;
                    }
                    switch (alt72) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:82: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertRTStmnt860);
                        }
                        break;

                    }

                    pushFollow(FOLLOW_selectItems_in_insertRTStmnt863);
                    selectItems(iMeta);
                    state._fsp--;

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:105: ( ( WS )? ',' ( WS )? selectItems[iMeta] )*
                    loop75:
                    while (true) {
                        int alt75 = 2;
                        int LA75_0 = input.LA(1);
                        if ((LA75_0 == WS)) {
                            int LA75_1 = input.LA(2);
                            if ((LA75_1 == 90)) {
                                alt75 = 1;
                            }

                        } else if ((LA75_0 == 90)) {
                            alt75 = 1;
                        }

                        switch (alt75) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:106: ( WS )? ',' ( WS )? selectItems[iMeta]
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:106: ( WS )?
                                int alt73 = 2;
                                int LA73_0 = input.LA(1);
                                if ((LA73_0 == WS)) {
                                    alt73 = 1;
                                }
                                switch (alt73) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:106: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertRTStmnt867);
                                    }
                                    break;

                                }

                                match(input, 90, FOLLOW_90_in_insertRTStmnt870);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:114: ( WS )?
                                int alt74 = 2;
                                int LA74_0 = input.LA(1);
                                if ((LA74_0 == WS)) {
                                    alt74 = 1;
                                }
                                switch (alt74) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:114: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_insertRTStmnt872);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_selectItems_in_insertRTStmnt875);
                                selectItems(iMeta);
                                state._fsp--;

                            }
                            break;

                            default:
                                break loop75;
                        }
                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:139: ( WS )?
                    int alt76 = 2;
                    int LA76_0 = input.LA(1);
                    if ((LA76_0 == WS)) {
                        alt76 = 1;
                    }
                    switch (alt76) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:139: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertRTStmnt880);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_insertRTStmnt883);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:150: ( WS )?
                    int alt77 = 2;
                    int LA77_0 = input.LA(1);
                    if ((LA77_0 == WS)) {
                        alt77 = 1;
                    }
                    switch (alt77) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:150: WS
                        {
                            match(input, WS, FOLLOW_WS_in_insertRTStmnt885);
                        }
                        break;

                    }

                }

                match(input, VALUES, FOLLOW_VALUES_in_insertRTStmnt891);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:10: ( WS )?
                int alt78 = 2;
                int LA78_0 = input.LA(1);
                if ((LA78_0 == WS)) {
                    alt78 = 1;
                }
                switch (alt78) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:10: WS
                    {
                        match(input, WS, FOLLOW_WS_in_insertRTStmnt893);
                    }
                    break;

                }

                match(input, LPARAN, FOLLOW_LPARAN_in_insertRTStmnt896);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:21: ( WS )?
                int alt79 = 2;
                int LA79_0 = input.LA(1);
                if ((LA79_0 == WS)) {
                    alt79 = 1;
                }
                switch (alt79) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:21: WS
                    {
                        match(input, WS, FOLLOW_WS_in_insertRTStmnt898);
                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:25: (a= anyValue )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:26: a= anyValue
                {
                    pushFollow(FOLLOW_anyValue_in_insertRTStmnt904);
                    a = anyValue();
                    state._fsp--;

                    iMeta.values.add(a);
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:62: ( ( WS )? ',' ( WS )? a= anyValue )*
                loop82:
                while (true) {
                    int alt82 = 2;
                    int LA82_0 = input.LA(1);
                    if ((LA82_0 == WS)) {
                        int LA82_1 = input.LA(2);
                        if ((LA82_1 == 90)) {
                            alt82 = 1;
                        }

                    } else if ((LA82_0 == 90)) {
                        alt82 = 1;
                    }

                    switch (alt82) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:63: ( WS )? ',' ( WS )? a= anyValue
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:63: ( WS )?
                            int alt80 = 2;
                            int LA80_0 = input.LA(1);
                            if ((LA80_0 == WS)) {
                                alt80 = 1;
                            }
                            switch (alt80) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:63: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_insertRTStmnt911);
                                }
                                break;

                            }

                            match(input, 90, FOLLOW_90_in_insertRTStmnt914);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:71: ( WS )?
                            int alt81 = 2;
                            int LA81_0 = input.LA(1);
                            if ((LA81_0 == WS)) {
                                alt81 = 1;
                            }
                            switch (alt81) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:71: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_insertRTStmnt916);
                                }
                                break;

                            }

                            pushFollow(FOLLOW_anyValue_in_insertRTStmnt921);
                            a = anyValue();
                            state._fsp--;

                            iMeta.values.add(a);
                        }
                        break;

                        default:
                            break loop82;
                    }
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:111: ( WS )?
                int alt83 = 2;
                int LA83_0 = input.LA(1);
                if ((LA83_0 == WS)) {
                    alt83 = 1;
                }
                switch (alt83) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:111: WS
                    {
                        match(input, WS, FOLLOW_WS_in_insertRTStmnt927);
                    }
                    break;

                }

                match(input, RPARAN, FOLLOW_RPARAN_in_insertRTStmnt930);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:122: ( WS )?
                int alt84 = 2;
                int LA84_0 = input.LA(1);
                if ((LA84_0 == WS)) {
                    alt84 = 1;
                }
                switch (alt84) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:122: WS
                    {
                        match(input, WS, FOLLOW_WS_in_insertRTStmnt932);
                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:126:3: ( WHERE WS i= intervalClause )?
                int alt85 = 2;
                int LA85_0 = input.LA(1);
                if ((LA85_0 == WHERE)) {
                    alt85 = 1;
                }
                switch (alt85) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:126:4: WHERE WS i= intervalClause
                    {
                        match(input, WHERE, FOLLOW_WHERE_in_insertRTStmnt938);
                        match(input, WS, FOLLOW_WS_in_insertRTStmnt940);
                        pushFollow(FOLLOW_intervalClause_in_insertRTStmnt944);
                        i = intervalClause();
                        state._fsp--;

                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:127:4: ( WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING )?
                int alt86 = 2;
                int LA86_0 = input.LA(1);
                if ((LA86_0 == WS)) {
                    int LA86_1 = input.LA(2);
                    if ((LA86_1 == BREAK)) {
                        alt86 = 1;
                    }
                }
                switch (alt86) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:127:5: WS BREAK WS BY WS gran= SINGLE_QUOTE_STRING
                    {
                        match(input, WS, FOLLOW_WS_in_insertRTStmnt952);
                        match(input, BREAK, FOLLOW_BREAK_in_insertRTStmnt954);
                        match(input, WS, FOLLOW_WS_in_insertRTStmnt956);
                        match(input, BY, FOLLOW_BY_in_insertRTStmnt958);
                        match(input, WS, FOLLOW_WS_in_insertRTStmnt960);
                        gran = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_insertRTStmnt964);
                        iMeta.granularitySpec = new GranularitySpec(unquote((gran != null ? gran.getText() : null)));
                    }
                    break;

                }

                // We set this later after granularitySpec object is fully formed.
                if (i != null && !i.isEmpty()) {
                    iMeta.granularitySpec.interval = i.get(0);// We already checked for list's emptiness(it is safe to access get(0).
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return iMeta;
    }
	// $ANTLR end "insertRTStmnt"

    // $ANTLR start "grandQuery"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:135:1: grandQuery returns [QueryProgram program] : (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? ;
    public final QueryProgram grandQuery() throws RecognitionException {
        QueryProgram program = null;

        Token j = null;
        Token a = null;
        QueryMeta s1 = null;
        QueryMeta s2 = null;

        program = null;
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:137:2: ( (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:137:4: (s1= queryStmnt ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )?
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:137:4: (s1= queryStmnt )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:137:5: s1= queryStmnt
                {
                    pushFollow(FOLLOW_queryStmnt_in_grandQuery998);
                    s1 = queryStmnt();
                    state._fsp--;

                }

                program = new QueryProgram();
                program.addStmnt(s1);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:138:4: ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )?
                int alt97 = 2;
                int LA97_0 = input.LA(1);
                if ((LA97_0 == WS)) {
                    int LA97_1 = input.LA(2);
                    if ((LA97_1 == JOIN || LA97_1 == LEFT_JOIN || LA97_1 == RIGHT_JOIN)) {
                        alt97 = 1;
                    }
                }
                switch (alt97) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:138:5: WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= queryStmnt ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN
                    {
                        match(input, WS, FOLLOW_WS_in_grandQuery1008);
                        j = input.LT(1);
                        if (input.LA(1) == JOIN || input.LA(1) == LEFT_JOIN || input.LA(1) == RIGHT_JOIN) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        program.addJoinType((j != null ? j.getText() : null).toUpperCase());
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:5: ( WS )?
                        int alt87 = 2;
                        int LA87_0 = input.LA(1);
                        if ((LA87_0 == WS)) {
                            alt87 = 1;
                        }
                        switch (alt87) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:5: WS
                            {
                                match(input, WS, FOLLOW_WS_in_grandQuery1033);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_grandQuery1036);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:16: ( WS )?
                        int alt88 = 2;
                        int LA88_0 = input.LA(1);
                        if ((LA88_0 == WS)) {
                            alt88 = 1;
                        }
                        switch (alt88) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:16: WS
                            {
                                match(input, WS, FOLLOW_WS_in_grandQuery1038);
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:20: (s2= queryStmnt )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:21: s2= queryStmnt
                        {
                            pushFollow(FOLLOW_queryStmnt_in_grandQuery1044);
                            s2 = queryStmnt();
                            state._fsp--;

                        }

                        program.addStmnt(s2);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:60: ( WS )?
                        int alt89 = 2;
                        int LA89_0 = input.LA(1);
                        if ((LA89_0 == WS)) {
                            alt89 = 1;
                        }
                        switch (alt89) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:60: WS
                            {
                                match(input, WS, FOLLOW_WS_in_grandQuery1049);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_grandQuery1052);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:71: ( WS )?
                        int alt90 = 2;
                        int LA90_0 = input.LA(1);
                        if ((LA90_0 == WS)) {
                            alt90 = 1;
                        }
                        switch (alt90) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:71: WS
                            {
                                match(input, WS, FOLLOW_WS_in_grandQuery1054);
                            }
                            break;

                        }

                        match(input, ON, FOLLOW_ON_in_grandQuery1057);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:5: ( WS )?
                        int alt91 = 2;
                        int LA91_0 = input.LA(1);
                        if ((LA91_0 == WS)) {
                            alt91 = 1;
                        }
                        switch (alt91) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:5: WS
                            {
                                match(input, WS, FOLLOW_WS_in_grandQuery1064);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_grandQuery1067);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:16: ( WS )?
                        int alt92 = 2;
                        int LA92_0 = input.LA(1);
                        if ((LA92_0 == WS)) {
                            alt92 = 1;
                        }
                        switch (alt92) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:16: WS
                            {
                                match(input, WS, FOLLOW_WS_in_grandQuery1069);
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:20: (a= ID )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:21: a= ID
                        {
                            a = (Token) match(input, ID, FOLLOW_ID_in_grandQuery1075);
                            program.addJoinHook((a != null ? a.getText() : null));
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:60: ( ( WS )? ',' ( WS )? a= ID )*
                        loop95:
                        while (true) {
                            int alt95 = 2;
                            int LA95_0 = input.LA(1);
                            if ((LA95_0 == WS)) {
                                int LA95_1 = input.LA(2);
                                if ((LA95_1 == 90)) {
                                    alt95 = 1;
                                }

                            } else if ((LA95_0 == 90)) {
                                alt95 = 1;
                            }

                            switch (alt95) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:61: ( WS )? ',' ( WS )? a= ID
                                {
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:61: ( WS )?
                                    int alt93 = 2;
                                    int LA93_0 = input.LA(1);
                                    if ((LA93_0 == WS)) {
                                        alt93 = 1;
                                    }
                                    switch (alt93) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:61: WS
                                        {
                                            match(input, WS, FOLLOW_WS_in_grandQuery1080);
                                        }
                                        break;

                                    }

                                    match(input, 90, FOLLOW_90_in_grandQuery1083);
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:69: ( WS )?
                                    int alt94 = 2;
                                    int LA94_0 = input.LA(1);
                                    if ((LA94_0 == WS)) {
                                        alt94 = 1;
                                    }
                                    switch (alt94) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:69: WS
                                        {
                                            match(input, WS, FOLLOW_WS_in_grandQuery1085);
                                        }
                                        break;

                                    }

                                    a = (Token) match(input, ID, FOLLOW_ID_in_grandQuery1090);
                                    program.addJoinHook((a != null ? a.getText() : null));
                                }
                                break;

                                default:
                                    break loop95;
                            }
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:114: ( WS )?
                        int alt96 = 2;
                        int LA96_0 = input.LA(1);
                        if ((LA96_0 == WS)) {
                            alt96 = 1;
                        }
                        switch (alt96) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:114: WS
                            {
                                match(input, WS, FOLLOW_WS_in_grandQuery1096);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_grandQuery1099);
                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:4: ( WS )?
                int alt98 = 2;
                int LA98_0 = input.LA(1);
                if ((LA98_0 == WS)) {
                    alt98 = 1;
                }
                switch (alt98) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:4: WS
                    {
                        match(input, WS, FOLLOW_WS_in_grandQuery1118);
                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:8: ( OPT_SEMI_COLON )?
                int alt99 = 2;
                int LA99_0 = input.LA(1);
                if ((LA99_0 == OPT_SEMI_COLON)) {
                    alt99 = 1;
                }
                switch (alt99) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:8: OPT_SEMI_COLON
                    {
                        match(input, OPT_SEMI_COLON, FOLLOW_OPT_SEMI_COLON_in_grandQuery1121);
                    }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return program;
    }
	// $ANTLR end "grandQuery"

    // $ANTLR start "queryStmnt"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:1: queryStmnt returns [QueryMeta qMeta] : SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? ;
    public final QueryMeta queryStmnt() throws RecognitionException {
        QueryMeta qMeta = null;

        Token id = null;
        Token dir = null;
        Token l = null;
        Token s1 = null;
        Token s2 = null;
        Token s = null;
        Pair<Granularity, List<Pair<Integer, Integer>>> gran = null;
        Having h = null;
        PostAggItem p = null;

        qMeta = GroupByQueryMeta.promote(new QueryMeta());
        ((BaseAggQueryMeta) qMeta).aggregations = new ArrayList<>();
        qMeta.intervals = new ArrayList<>();

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:151:2: ( SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:151:4: SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
            {
                match(input, SELECT, FOLLOW_SELECT_in_queryStmnt1144);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:152:7: ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )?
                int alt103 = 3;
                int LA103_0 = input.LA(1);
                if ((LA103_0 == WS)) {
                    int LA103_1 = input.LA(2);
                    if ((LA103_1 == 89)) {
                        alt103 = 2;
                    } else if ((LA103_1 == COUNT || LA103_1 == DOUBLE_SUM || LA103_1 == ID || LA103_1 == JAVASCRIPT || LA103_1 == LONG_SUM || LA103_1 == MAX || LA103_1 == MIN || LA103_1 == UNIQUE)) {
                        alt103 = 1;
                    }
                }
                switch (alt103) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:154:9: WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
                        {
                            match(input, WS, FOLLOW_WS_in_queryStmnt1172);
                            pushFollow(FOLLOW_selectItems_in_queryStmnt1174);
                            selectItems(qMeta);
                            state._fsp--;

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:154:31: ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
                            loop102:
                            while (true) {
                                int alt102 = 2;
                                int LA102_0 = input.LA(1);
                                if ((LA102_0 == WS)) {
                                    int LA102_1 = input.LA(2);
                                    if ((LA102_1 == 90)) {
                                        alt102 = 1;
                                    }

                                } else if ((LA102_0 == 90)) {
                                    alt102 = 1;
                                }

                                switch (alt102) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:154:32: ( WS )? ',' ( WS )? selectItems[qMeta]
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:154:32: ( WS )?
                                        int alt100 = 2;
                                        int LA100_0 = input.LA(1);
                                        if ((LA100_0 == WS)) {
                                            alt100 = 1;
                                        }
                                        switch (alt100) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:154:32: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_queryStmnt1178);
                                            }
                                            break;

                                        }

                                        match(input, 90, FOLLOW_90_in_queryStmnt1181);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:154:40: ( WS )?
                                        int alt101 = 2;
                                        int LA101_0 = input.LA(1);
                                        if ((LA101_0 == WS)) {
                                            alt101 = 1;
                                        }
                                        switch (alt101) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:154:40: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_queryStmnt1183);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_selectItems_in_queryStmnt1186);
                                        selectItems(qMeta);
                                        state._fsp--;

                                    }
                                    break;

                                    default:
                                        break loop102;
                                }
                            }

                        }

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:157:8: ( WS '*' )
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:157:8: ( WS '*' )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:157:9: WS '*'
                        {
                            match(input, WS, FOLLOW_WS_in_queryStmnt1217);
                            match(input, 89, FOLLOW_89_in_queryStmnt1219);
                        }

                    }
                    break;

                }

                match(input, WS, FOLLOW_WS_in_queryStmnt1234);
                match(input, FROM, FOLLOW_FROM_in_queryStmnt1236);
                match(input, WS, FOLLOW_WS_in_queryStmnt1238);
                id = (Token) match(input, ID, FOLLOW_ID_in_queryStmnt1242);

                qMeta.dataSource = (id != null ? id.getText() : null);
                if (((BaseAggQueryMeta) qMeta).aggregations.isEmpty()) {
                    qMeta = SelectQueryMeta.promote(qMeta);
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:166:2: ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
                int alt128 = 2;
                int LA128_0 = input.LA(1);
                if ((LA128_0 == WS)) {
                    int LA128_1 = input.LA(2);
                    if ((LA128_1 == WHERE)) {
                        alt128 = 1;
                    }
                }
                switch (alt128) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:167:4: WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
                    {
                        match(input, WS, FOLLOW_WS_in_queryStmnt1258);
                        match(input, WHERE, FOLLOW_WHERE_in_queryStmnt1260);
                        match(input, WS, FOLLOW_WS_in_queryStmnt1262);
                        pushFollow(FOLLOW_whereClause_in_queryStmnt1264);
                        whereClause(qMeta);
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:168:4: ( ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:169:5: ( WS BREAK WS BY WS gran= granularityClause )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )?
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:169:5: ( WS BREAK WS BY WS gran= granularityClause )?
                            int alt104 = 2;
                            int LA104_0 = input.LA(1);
                            if ((LA104_0 == WS)) {
                                int LA104_1 = input.LA(2);
                                if ((LA104_1 == BREAK)) {
                                    alt104 = 1;
                                }
                            }
                            switch (alt104) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:169:6: WS BREAK WS BY WS gran= granularityClause
                                {
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1282);
                                    match(input, BREAK, FOLLOW_BREAK_in_queryStmnt1284);
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1286);
                                    match(input, BY, FOLLOW_BY_in_queryStmnt1288);
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1290);
                                    pushFollow(FOLLOW_granularityClause_in_queryStmnt1294);
                                    gran = granularityClause();
                                    state._fsp--;

                                    qMeta.granularity = gran.a;
                                    if (gran.b != null) {
                                        qMeta.microIntervals.addAll(gran.b);
                                    }

                                }
                                break;

                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:176:5: ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )?
                            int alt109 = 2;
                            int LA109_0 = input.LA(1);
                            if ((LA109_0 == WS)) {
                                int LA109_1 = input.LA(2);
                                if ((LA109_1 == GROUP)) {
                                    alt109 = 1;
                                }
                            }
                            switch (alt109) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:176:6: WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )?
                                {
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1311);
                                    match(input, GROUP, FOLLOW_GROUP_in_queryStmnt1313);
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1315);
                                    match(input, BY, FOLLOW_BY_in_queryStmnt1317);
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1319);

                                    qMeta = GroupByQueryMeta.promote(qMeta);
                                    if (((GroupByQueryMeta) qMeta).fetchDimensions == null) {
                                        System.err.println("No dimensions !! ");
                                    }

                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:10: (id= ID ( ( WS )? ',' ( WS )? id= ID )* )
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:11: id= ID ( ( WS )? ',' ( WS )? id= ID )*
                                    {
                                        id = (Token) match(input, ID, FOLLOW_ID_in_queryStmnt1345);

                                        if (!((GroupByQueryMeta) qMeta).checkDimOrAlias((id != null ? id.getText() : null))) {
                                            System.err.println("Dimension/Alias " + (id != null ? id.getText() : null) + " not valid..");
                                        }

                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:14: ( ( WS )? ',' ( WS )? id= ID )*
                                        loop107:
                                        while (true) {
                                            int alt107 = 2;
                                            int LA107_0 = input.LA(1);
                                            if ((LA107_0 == WS)) {
                                                int LA107_1 = input.LA(2);
                                                if ((LA107_1 == 90)) {
                                                    alt107 = 1;
                                                }

                                            } else if ((LA107_0 == 90)) {
                                                alt107 = 1;
                                            }

                                            switch (alt107) {
                                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:15: ( WS )? ',' ( WS )? id= ID
                                                {
                                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:15: ( WS )?
                                                    int alt105 = 2;
                                                    int LA105_0 = input.LA(1);
                                                    if ((LA105_0 == WS)) {
                                                        alt105 = 1;
                                                    }
                                                    switch (alt105) {
                                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:15: WS
                                                        {
                                                            match(input, WS, FOLLOW_WS_in_queryStmnt1377);
                                                        }
                                                        break;

                                                    }

                                                    match(input, 90, FOLLOW_90_in_queryStmnt1380);
                                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:23: ( WS )?
                                                    int alt106 = 2;
                                                    int LA106_0 = input.LA(1);
                                                    if ((LA106_0 == WS)) {
                                                        alt106 = 1;
                                                    }
                                                    switch (alt106) {
                                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:23: WS
                                                        {
                                                            match(input, WS, FOLLOW_WS_in_queryStmnt1382);
                                                        }
                                                        break;

                                                    }

                                                    id = (Token) match(input, ID, FOLLOW_ID_in_queryStmnt1387);

                                                    if (!((GroupByQueryMeta) qMeta).checkDimOrAlias((id != null ? id.getText() : null))) {
                                                        System.err.println("Dimension/Alias " + (id != null ? id.getText() : null) + " not valid..");
                                                    }

                                                }
                                                break;

                                                default:
                                                    break loop107;
                                            }
                                        }

                                    }

                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:197:10: ( WS HAVING WS h= havingClause )?
                                    int alt108 = 2;
                                    int LA108_0 = input.LA(1);
                                    if ((LA108_0 == WS)) {
                                        int LA108_1 = input.LA(2);
                                        if ((LA108_1 == HAVING)) {
                                            alt108 = 1;
                                        }
                                    }
                                    switch (alt108) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:197:11: WS HAVING WS h= havingClause
                                        {
                                            match(input, WS, FOLLOW_WS_in_queryStmnt1444);
                                            match(input, HAVING, FOLLOW_HAVING_in_queryStmnt1446);
                                            match(input, WS, FOLLOW_WS_in_queryStmnt1448);
                                            pushFollow(FOLLOW_havingClause_in_queryStmnt1452);
                                            h = havingClause();
                                            state._fsp--;

                                            ((GroupByQueryMeta) qMeta).having = h;
                                        }
                                        break;

                                    }

                                }
                                break;

                            }

                            qMeta = QueryUtils.checkAndPromoteToTimeSeries(qMeta);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:5: ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )?
                            int alt111 = 2;
                            int LA111_0 = input.LA(1);
                            if ((LA111_0 == WS)) {
                                int LA111_1 = input.LA(2);
                                if ((LA111_1 == ORDER)) {
                                    alt111 = 1;
                                }
                            }
                            switch (alt111) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:6: WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )?
                                {
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1496);
                                    match(input, ORDER, FOLLOW_ORDER_in_queryStmnt1498);
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1500);
                                    match(input, BY, FOLLOW_BY_in_queryStmnt1502);
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1504);
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:24: (id= ID )
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:25: id= ID
                                    {
                                        id = (Token) match(input, ID, FOLLOW_ID_in_queryStmnt1509);
                                    }

                                    if (((PlainDimQueryMeta) qMeta).fetchDimensions.size() != 1) {
                                        ((GroupByQueryMeta) qMeta).limitSpec = new LimitSpec();

                                    } else {// If fetchDimensions = 1 then TopN is more optimal.
                                        qMeta = TopNQueryMeta.promote(qMeta);
                                        ((TopNQueryMeta) qMeta).metric = (id != null ? id.getText() : null);
                                    }

                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:9: ( WS dir= ( ASC | DESC ) )?
                                    int alt110 = 2;
                                    int LA110_0 = input.LA(1);
                                    if ((LA110_0 == WS)) {
                                        int LA110_1 = input.LA(2);
                                        if ((LA110_1 == ASC || LA110_1 == DESC)) {
                                            alt110 = 1;
                                        }
                                    }
                                    switch (alt110) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:10: WS dir= ( ASC | DESC )
                                        {
                                            match(input, WS, FOLLOW_WS_in_queryStmnt1542);
                                            dir = input.LT(1);
                                            if (input.LA(1) == ASC || input.LA(1) == DESC) {
                                                input.consume();
                                                state.errorRecovery = false;
                                            } else {
                                                MismatchedSetException mse = new MismatchedSetException(null, input);
                                                throw mse;
                                            }

                                            if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta) qMeta).limitSpec != null) {
                                                if (dir != null && (dir != null ? dir.getText() : null) != null) {
                                                    ((GroupByQueryMeta) qMeta).limitSpec.addColumn((id != null ? id.getText() : null), (dir != null ? dir.getText() : null));
                                                } else {
                                                    ((GroupByQueryMeta) qMeta).limitSpec.addColumn((id != null ? id.getText() : null), "ASC");
                                                }
                                            }

                                        }
                                        break;

                                    }

                                    // At this point if the qMeta is not TopN and is still GroupBy then do the following(default is ascending sort).
                                    if (qMeta instanceof GroupByQueryMeta && ((GroupByQueryMeta) qMeta).limitSpec != null) {
                                        if (!((GroupByQueryMeta) qMeta).limitSpec.columns.containsKey((id != null ? id.getText() : null))) {
                                            ((GroupByQueryMeta) qMeta).limitSpec.addColumn((id != null ? id.getText() : null), "ASC");
                                        }

                                    }

                                }
                                break;

                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:5: ( WS LIMIT WS (l= LONG ) )?
                            int alt112 = 2;
                            int LA112_0 = input.LA(1);
                            if ((LA112_0 == WS)) {
                                int LA112_1 = input.LA(2);
                                if ((LA112_1 == LIMIT)) {
                                    alt112 = 1;
                                }
                            }
                            switch (alt112) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:234:6: WS LIMIT WS (l= LONG )
                                {
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1596);
                                    match(input, LIMIT, FOLLOW_LIMIT_in_queryStmnt1598);
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1600);
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:234:18: (l= LONG )
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:234:19: l= LONG
                                    {
                                        l = (Token) match(input, LONG, FOLLOW_LONG_in_queryStmnt1605);
                                    }

                                    if (qMeta instanceof SelectQueryMeta) {
                                        ((SelectQueryMeta) qMeta).pagingSpec.threshold = Integer.valueOf((l != null ? l.getText() : null));
                                    } else if (qMeta instanceof TopNQueryMeta) {
                                        ((TopNQueryMeta) qMeta).threshold = Integer.valueOf((l != null ? l.getText() : null));
                                    } else if (((PlainDimQueryMeta) qMeta).fetchDimensions.size() != 1) {
                                        if (((GroupByQueryMeta) qMeta).limitSpec != null) {
                                            ((GroupByQueryMeta) qMeta).limitSpec.limit = Long.valueOf((l != null ? l.getText() : null));
                                        }
                                    }

                                }
                                break;

                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:248:7: ( WS THEN WS p= postAggItem )?
                            int alt113 = 2;
                            int LA113_0 = input.LA(1);
                            if ((LA113_0 == WS)) {
                                int LA113_1 = input.LA(2);
                                if ((LA113_1 == THEN)) {
                                    alt113 = 1;
                                }
                            }
                            switch (alt113) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:248:8: WS THEN WS p= postAggItem
                                {
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1643);
                                    match(input, THEN, FOLLOW_THEN_in_queryStmnt1645);
                                    match(input, WS, FOLLOW_WS_in_queryStmnt1647);
                                    pushFollow(FOLLOW_postAggItem_in_queryStmnt1651);
                                    p = postAggItem();
                                    state._fsp--;

                                    QueryUtils.setPostAggregation(qMeta, p);
                                }
                                break;

                            }

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:4: ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )?
                        int alt123 = 2;
                        int LA123_0 = input.LA(1);
                        if ((LA123_0 == WS)) {
                            int LA123_1 = input.LA(2);
                            if ((LA123_1 == WHICH)) {
                                alt123 = 1;
                            }
                        }
                        switch (alt123) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:5: WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN
                            {
                                match(input, WS, FOLLOW_WS_in_queryStmnt1666);
                                match(input, WHICH, FOLLOW_WHICH_in_queryStmnt1668);
                                match(input, WS, FOLLOW_WS_in_queryStmnt1670);
                                match(input, CONTAINS, FOLLOW_CONTAINS_in_queryStmnt1672);
                                qMeta = SearchQueryMeta.promote(qMeta);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:68: ( WS )?
                                int alt114 = 2;
                                int LA114_0 = input.LA(1);
                                if ((LA114_0 == WS)) {
                                    alt114 = 1;
                                }
                                switch (alt114) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:68: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_queryStmnt1676);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_queryStmnt1679);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:79: ( WS )?
                                int alt115 = 2;
                                int LA115_0 = input.LA(1);
                                if ((LA115_0 == WS)) {
                                    alt115 = 1;
                                }
                                switch (alt115) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:79: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_queryStmnt1681);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:83: (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* )
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:84: s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
                                {
                                    s1 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1687);
                                    ((SearchQueryMeta) qMeta).type = "insensitive_contains";
                                    ((SearchQueryMeta) qMeta).addValue((s1 != null ? s1.getText() : null));
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:208: ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
                                    loop118:
                                    while (true) {
                                        int alt118 = 2;
                                        int LA118_0 = input.LA(1);
                                        if ((LA118_0 == WS)) {
                                            int LA118_1 = input.LA(2);
                                            if ((LA118_1 == 90)) {
                                                alt118 = 1;
                                            }

                                        } else if ((LA118_0 == 90)) {
                                            alt118 = 1;
                                        }

                                        switch (alt118) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:209: ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING
                                            {
                                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:209: ( WS )?
                                                int alt116 = 2;
                                                int LA116_0 = input.LA(1);
                                                if ((LA116_0 == WS)) {
                                                    alt116 = 1;
                                                }
                                                switch (alt116) {
                                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:209: WS
                                                    {
                                                        match(input, WS, FOLLOW_WS_in_queryStmnt1691);
                                                    }
                                                    break;

                                                }

                                                match(input, 90, FOLLOW_90_in_queryStmnt1694);
                                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:217: ( WS )?
                                                int alt117 = 2;
                                                int LA117_0 = input.LA(1);
                                                if ((LA117_0 == WS)) {
                                                    alt117 = 1;
                                                }
                                                switch (alt117) {
                                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:217: WS
                                                    {
                                                        match(input, WS, FOLLOW_WS_in_queryStmnt1696);
                                                    }
                                                    break;

                                                }

                                                s2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1701);
                                                ((SearchQueryMeta) qMeta).type = "fragment";
                                                ((SearchQueryMeta) qMeta).addValue((s2 != null ? s2.getText() : null));
                                            }
                                            break;

                                            default:
                                                break loop118;
                                        }
                                    }

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:337: ( WS )?
                                int alt119 = 2;
                                int LA119_0 = input.LA(1);
                                if ((LA119_0 == WS)) {
                                    alt119 = 1;
                                }
                                switch (alt119) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:337: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_queryStmnt1708);
                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_queryStmnt1711);
                                match(input, WS, FOLLOW_WS_in_queryStmnt1717);
                                match(input, SORT, FOLLOW_SORT_in_queryStmnt1719);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:13: ( WS )?
                                int alt120 = 2;
                                int LA120_0 = input.LA(1);
                                if ((LA120_0 == WS)) {
                                    alt120 = 1;
                                }
                                switch (alt120) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:13: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_queryStmnt1721);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_queryStmnt1724);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:24: ( WS )?
                                int alt121 = 2;
                                int LA121_0 = input.LA(1);
                                if ((LA121_0 == WS)) {
                                    alt121 = 1;
                                }
                                switch (alt121) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:24: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_queryStmnt1726);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:28: (s= SINGLE_QUOTE_STRING )
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:29: s= SINGLE_QUOTE_STRING
                                {
                                    s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1732);
                                }

                                ((SearchQueryMeta) qMeta).setSort((s != null ? s.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:97: ( WS )?
                                int alt122 = 2;
                                int LA122_0 = input.LA(1);
                                if ((LA122_0 == WS)) {
                                    alt122 = 1;
                                }
                                switch (alt122) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:97: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_queryStmnt1737);
                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_queryStmnt1740);
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:253:4: ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
                        int alt127 = 2;
                        int LA127_0 = input.LA(1);
                        if ((LA127_0 == WS)) {
                            int LA127_1 = input.LA(2);
                            if ((LA127_1 == HINT)) {
                                alt127 = 1;
                            }
                        }
                        switch (alt127) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:253:5: WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN
                            {
                                match(input, WS, FOLLOW_WS_in_queryStmnt1752);
                                match(input, HINT, FOLLOW_HINT_in_queryStmnt1754);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:253:13: ( WS )?
                                int alt124 = 2;
                                int LA124_0 = input.LA(1);
                                if ((LA124_0 == WS)) {
                                    alt124 = 1;
                                }
                                switch (alt124) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:253:13: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_queryStmnt1756);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_queryStmnt1759);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:253:24: ( WS )?
                                int alt125 = 2;
                                int LA125_0 = input.LA(1);
                                if ((LA125_0 == WS)) {
                                    alt125 = 1;
                                }
                                switch (alt125) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:253:24: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_queryStmnt1761);
                                    }
                                    break;

                                }

                                s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1766);
                                qMeta = HintProcessor.process(qMeta, (s != null ? s.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:253:99: ( WS )?
                                int alt126 = 2;
                                int LA126_0 = input.LA(1);
                                if ((LA126_0 == WS)) {
                                    alt126 = 1;
                                }
                                switch (alt126) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:253:99: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_queryStmnt1770);
                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_queryStmnt1773);
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

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return qMeta;
    }
	// $ANTLR end "queryStmnt"

    // $ANTLR start "anyValue"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:263:1: anyValue returns [Object obj] : (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) );
    public final Object anyValue() throws RecognitionException {
        Object obj = null;

        Token a = null;
        Token b = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:264:2: (a= SINGLE_QUOTE_STRING |b= ( LONG | FLOAT ) )
            int alt129 = 2;
            int LA129_0 = input.LA(1);
            if ((LA129_0 == SINGLE_QUOTE_STRING)) {
                alt129 = 1;
            } else if ((LA129_0 == FLOAT || LA129_0 == LONG)) {
                alt129 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 129, 0, input);
                throw nvae;
            }

            switch (alt129) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:264:3: a= SINGLE_QUOTE_STRING
                {
                    a = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1807);
                    obj = unquote((a != null ? a.getText() : null));
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:264:53: b= ( LONG | FLOAT )
                {
                    b = input.LT(1);
                    if (input.LA(1) == FLOAT || input.LA(1) == LONG) {
                        input.consume();
                        state.errorRecovery = false;
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        throw mse;
                    }
                    obj = (b != null ? b.getText() : null);
                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return obj;
    }
	// $ANTLR end "anyValue"

    // $ANTLR start "selectItems"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:267:1: selectItems[BaseStatementMeta meta] : (ai= aggItem |sd= simpleDim );
    public final void selectItems(BaseStatementMeta meta) throws RecognitionException {
        AggItem ai = null;
        Pair<String, String> sd = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:2: (ai= aggItem |sd= simpleDim )
            int alt130 = 2;
            int LA130_0 = input.LA(1);
            if ((LA130_0 == COUNT || LA130_0 == DOUBLE_SUM || LA130_0 == JAVASCRIPT || LA130_0 == LONG_SUM || LA130_0 == MAX || LA130_0 == MIN || LA130_0 == UNIQUE)) {
                alt130 = 1;
            } else if ((LA130_0 == ID)) {
                alt130 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 130, 0, input);
                throw nvae;
            }

            switch (alt130) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:5: ai= aggItem
                {
                    pushFollow(FOLLOW_aggItem_in_selectItems1838);
                    ai = aggItem();
                    state._fsp--;

                    if (meta instanceof QueryMeta) {
                        ((BaseAggQueryMeta) meta).aggregations.add(ai);
                    } else if (meta instanceof InsertMeta) {
                        ((InsertMeta) meta).aggregations.add(ai);
                    }

                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:5: sd= simpleDim
                {
                    pushFollow(FOLLOW_simpleDim_in_selectItems1848);
                    sd = simpleDim();
                    state._fsp--;

                    if (meta instanceof QueryMeta) {
                        ((PlainDimQueryMeta) meta).fetchDimensions.put(sd.a, sd.b);
                    } else if (meta instanceof InsertMeta) {
                        ((InsertMeta) meta).fetchDimensions.put(sd.a, sd.b);
                    }

                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "selectItems"

    // $ANTLR start "simpleDim"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:1: simpleDim returns [Pair<String, String> dims] : (a= ID ( WS AS WS b= ID )? ) ;
    public final Pair<String, String> simpleDim() throws RecognitionException {
        Pair<String, String> dims = null;

        Token a = null;
        Token b = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:285:2: ( (a= ID ( WS AS WS b= ID )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:285:4: (a= ID ( WS AS WS b= ID )? )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:285:4: (a= ID ( WS AS WS b= ID )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:285:5: a= ID ( WS AS WS b= ID )?
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_simpleDim1868);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:285:10: ( WS AS WS b= ID )?
                    int alt131 = 2;
                    int LA131_0 = input.LA(1);
                    if ((LA131_0 == WS)) {
                        int LA131_1 = input.LA(2);
                        if ((LA131_1 == AS)) {
                            alt131 = 1;
                        }
                    }
                    switch (alt131) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:285:11: WS AS WS b= ID
                        {
                            match(input, WS, FOLLOW_WS_in_simpleDim1871);
                            match(input, AS, FOLLOW_AS_in_simpleDim1873);
                            match(input, WS, FOLLOW_WS_in_simpleDim1875);
                            b = (Token) match(input, ID, FOLLOW_ID_in_simpleDim1879);
                        }
                        break;

                    }

                    dims = (b != null) ? new Pair<String, String>((a != null ? a.getText() : null), (b != null ? b.getText() : null)) : new Pair<String, String>((a != null ? a.getText() : null), null);

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return dims;
    }
	// $ANTLR end "simpleDim"

    // $ANTLR start "whereClause"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:292:1: whereClause[QueryMeta qMeta] : intls= intervalClause ( WS AND WS f= grandFilter )? ;
    public final void whereClause(QueryMeta qMeta) throws RecognitionException {
        List<Interval> intls = null;
        Filter f = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:293:2: (intls= intervalClause ( WS AND WS f= grandFilter )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:293:3: intls= intervalClause ( WS AND WS f= grandFilter )?
            {
                pushFollow(FOLLOW_intervalClause_in_whereClause1902);
                intls = intervalClause();
                state._fsp--;

                qMeta.intervals.addAll(intls);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:293:57: ( WS AND WS f= grandFilter )?
                int alt132 = 2;
                int LA132_0 = input.LA(1);
                if ((LA132_0 == WS)) {
                    int LA132_1 = input.LA(2);
                    if ((LA132_1 == AND)) {
                        alt132 = 1;
                    }
                }
                switch (alt132) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:293:58: WS AND WS f= grandFilter
                    {
                        match(input, WS, FOLLOW_WS_in_whereClause1907);
                        match(input, AND, FOLLOW_AND_in_whereClause1909);
                        match(input, WS, FOLLOW_WS_in_whereClause1911);
                        pushFollow(FOLLOW_grandFilter_in_whereClause1915);
                        f = grandFilter();
                        state._fsp--;

                        qMeta.filter = f;
                    }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "whereClause"

    // $ANTLR start "intervalClause"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:1: intervalClause returns [List<Interval> intervals] : 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) ;
    public final List<Interval> intervalClause() throws RecognitionException {
        List<Interval> intervals = null;

        Token st2 = null;
        Token et2 = null;
        ParserRuleReturnScope st = null;
        ParserRuleReturnScope et = null;
        Pair<String, String> p1 = null;
        Pair<String, String> p2 = null;

        intervals = new ArrayList<>();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:299:2: ( 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:299:4: 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
            {
                match(input, 91, FOLLOW_91_in_intervalClause1941);
                match(input, WS, FOLLOW_WS_in_intervalClause1943);
                match(input, BETWEEN, FOLLOW_BETWEEN_in_intervalClause1945);
                match(input, WS, FOLLOW_WS_in_intervalClause1947);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:300:2: ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
                int alt140 = 2;
                int LA140_0 = input.LA(1);
                if (((LA140_0 >= DATE && LA140_0 <= DATE_YEAR_ONLY) || LA140_0 == SINGLE_QUOTE_STRING)) {
                    alt140 = 1;
                } else if ((LA140_0 == LPARAN)) {
                    alt140 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 140, 0, input);
                    throw nvae;
                }

                switch (alt140) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:7: (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING )
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:7: (st= isoTime |st2= SINGLE_QUOTE_STRING )
                                int alt133 = 2;
                                int LA133_0 = input.LA(1);
                                if (((LA133_0 >= DATE && LA133_0 <= DATE_YEAR_ONLY))) {
                                    alt133 = 1;
                                } else if ((LA133_0 == SINGLE_QUOTE_STRING)) {
                                    alt133 = 2;
                                } else {
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 133, 0, input);
                                    throw nvae;
                                }

                                switch (alt133) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:8: st= isoTime
                                    {
                                        pushFollow(FOLLOW_isoTime_in_intervalClause1967);
                                        st = isoTime();
                                        state._fsp--;

                                    }
                                    break;
                                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:22: st2= SINGLE_QUOTE_STRING
                                    {
                                        st2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause1974);
                                    }
                                    break;

                                }

                                match(input, WS, FOLLOW_WS_in_intervalClause1978);
                                match(input, AND, FOLLOW_AND_in_intervalClause1980);
                                match(input, WS, FOLLOW_WS_in_intervalClause1982);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:58: (et= isoTime |et2= SINGLE_QUOTE_STRING )
                                int alt134 = 2;
                                int LA134_0 = input.LA(1);
                                if (((LA134_0 >= DATE && LA134_0 <= DATE_YEAR_ONLY))) {
                                    alt134 = 1;
                                } else if ((LA134_0 == SINGLE_QUOTE_STRING)) {
                                    alt134 = 2;
                                } else {
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 134, 0, input);
                                    throw nvae;
                                }

                                switch (alt134) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:59: et= isoTime
                                    {
                                        pushFollow(FOLLOW_isoTime_in_intervalClause1987);
                                        et = isoTime();
                                        state._fsp--;

                                    }
                                    break;
                                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:73: et2= SINGLE_QUOTE_STRING
                                    {
                                        et2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause1994);
                                    }
                                    break;

                                }

                            }

                            if (st2 != null) {
                                if (et2 != null) {
                                    intervals.add(new Interval((st2 != null ? st2.getText() : null), (et2 != null ? et2.getText() : null)));
                                } else {
                                    intervals.add(new Interval((st2 != null ? st2.getText() : null), (et != null ? input.toString(et.start, et.stop) : null)));
                                }
                            } else {
                                if (et2 != null) {
                                    intervals.add(new Interval((st != null ? input.toString(st.start, st.stop) : null), (et2 != null ? et2.getText() : null)));
                                } else {
                                    intervals.add(new Interval((st != null ? input.toString(st.start, st.stop) : null), (et != null ? input.toString(et.start, et.stop) : null)));
                                }
                            }

                        }

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:319:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:319:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:319:5: LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN
                        {
                            match(input, LPARAN, FOLLOW_LPARAN_in_intervalClause2020);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:319:12: ( WS )?
                            int alt135 = 2;
                            int LA135_0 = input.LA(1);
                            if ((LA135_0 == WS)) {
                                alt135 = 1;
                            }
                            switch (alt135) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:319:12: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_intervalClause2022);
                                }
                                break;

                            }

                            pushFollow(FOLLOW_pairString_in_intervalClause2027);
                            p1 = pairString();
                            state._fsp--;

                            intervals.add(new Interval(p1.a, p1.b));
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:7: ( ( WS )? ',' ( WS )? p2= pairString )*
                            loop138:
                            while (true) {
                                int alt138 = 2;
                                int LA138_0 = input.LA(1);
                                if ((LA138_0 == WS)) {
                                    int LA138_1 = input.LA(2);
                                    if ((LA138_1 == 90)) {
                                        alt138 = 1;
                                    }

                                } else if ((LA138_0 == 90)) {
                                    alt138 = 1;
                                }

                                switch (alt138) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:8: ( WS )? ',' ( WS )? p2= pairString
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:8: ( WS )?
                                        int alt136 = 2;
                                        int LA136_0 = input.LA(1);
                                        if ((LA136_0 == WS)) {
                                            alt136 = 1;
                                        }
                                        switch (alt136) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:8: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_intervalClause2039);
                                            }
                                            break;

                                        }

                                        match(input, 90, FOLLOW_90_in_intervalClause2042);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:16: ( WS )?
                                        int alt137 = 2;
                                        int LA137_0 = input.LA(1);
                                        if ((LA137_0 == WS)) {
                                            alt137 = 1;
                                        }
                                        switch (alt137) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:16: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_intervalClause2044);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_pairString_in_intervalClause2049);
                                        p2 = pairString();
                                        state._fsp--;

                                        intervals.add(new Interval(p2.a, p2.b));
                                    }
                                    break;

                                    default:
                                        break loop138;
                                }
                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:79: ( WS )?
                            int alt139 = 2;
                            int LA139_0 = input.LA(1);
                            if ((LA139_0 == WS)) {
                                alt139 = 1;
                            }
                            switch (alt139) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:79: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_intervalClause2055);
                                }
                                break;

                            }

                            match(input, RPARAN, FOLLOW_RPARAN_in_intervalClause2058);
                        }

                    }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return intervals;
    }
	// $ANTLR end "intervalClause"

    // $ANTLR start "getEquals"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:325:1: getEquals returns [EqualsToHolder holder] : (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) ;
    public final EqualsToHolder getEquals() throws RecognitionException {
        EqualsToHolder holder = null;

        Token a = null;
        Token b = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:2: ( (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:5: a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG )
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_getEquals2081);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:10: ( WS )?
                    int alt141 = 2;
                    int LA141_0 = input.LA(1);
                    if ((LA141_0 == WS)) {
                        alt141 = 1;
                    }
                    switch (alt141) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:10: WS
                        {
                            match(input, WS, FOLLOW_WS_in_getEquals2083);
                        }
                        break;

                    }

                    match(input, EQUALS, FOLLOW_EQUALS_in_getEquals2086);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:21: ( WS )?
                    int alt142 = 2;
                    int LA142_0 = input.LA(1);
                    if ((LA142_0 == WS)) {
                        alt142 = 1;
                    }
                    switch (alt142) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:21: WS
                        {
                            match(input, WS, FOLLOW_WS_in_getEquals2088);
                        }
                        break;

                    }

                    b = input.LT(1);
                    if (input.LA(1) == FLOAT || input.LA(1) == LONG || input.LA(1) == SINGLE_QUOTE_STRING) {
                        input.consume();
                        state.errorRecovery = false;
                    } else {
                        MismatchedSetException mse = new MismatchedSetException(null, input);
                        throw mse;
                    }
                }

                holder = new EqualsToHolder((a != null ? a.getText() : null), (b != null ? b.getText() : null));
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return holder;
    }
	// $ANTLR end "getEquals"

    // $ANTLR start "granularityClause"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:1: granularityClause returns [Pair<Granularity, List<Pair<Integer, Integer>>> clause] : ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) );
    public final Pair<Granularity, List<Pair<Integer, Integer>>> granularityClause() throws RecognitionException {
        Pair<Granularity, List<Pair<Integer, Integer>>> clause = null;

        Token s = null;
        Token dur = null;
        Token orig = null;
        Token per = null;
        Token tz = null;
        List<Pair<Integer, Integer>> inc = null;

        Granularity granularity = new Granularity("all");
        clause = new Pair<>(granularity, null);
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:333:2: ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) ) )
            int alt165 = 2;
            int LA165_0 = input.LA(1);
            if ((LA165_0 == SINGLE_QUOTE_STRING)) {
                alt165 = 1;
            } else if ((LA165_0 == DURATION || LA165_0 == PERIOD)) {
                alt165 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 165, 0, input);
                throw nvae;
            }

            switch (alt165) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:333:3: ( (s= SINGLE_QUOTE_STRING ) )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:333:3: ( (s= SINGLE_QUOTE_STRING ) )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:333:4: (s= SINGLE_QUOTE_STRING )
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:333:4: (s= SINGLE_QUOTE_STRING )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:333:5: s= SINGLE_QUOTE_STRING
                        {
                            s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2133);
                        }

                        granularity = new Granularity((s != null ? s.getText() : null));
                        clause = new Pair<>(granularity, null);
                    }

                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:335:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:335:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN ) )
                    int alt164 = 2;
                    int LA164_0 = input.LA(1);
                    if ((LA164_0 == DURATION)) {
                        alt164 = 1;
                    } else if ((LA164_0 == PERIOD)) {
                        alt164 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 164, 0, input);
                        throw nvae;
                    }

                    switch (alt164) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:7: DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
                            {
                                match(input, DURATION, FOLLOW_DURATION_in_granularityClause2157);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:16: ( WS )?
                                int alt143 = 2;
                                int LA143_0 = input.LA(1);
                                if ((LA143_0 == WS)) {
                                    alt143 = 1;
                                }
                                switch (alt143) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:16: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause2159);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_granularityClause2162);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:27: ( WS )?
                                int alt144 = 2;
                                int LA144_0 = input.LA(1);
                                if ((LA144_0 == WS)) {
                                    alt144 = 1;
                                }
                                switch (alt144) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:27: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause2164);
                                    }
                                    break;

                                }

                                dur = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2169);
                                granularity.setDuration((dur != null ? dur.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:93: ( WS )?
                                int alt145 = 2;
                                int LA145_0 = input.LA(1);
                                if ((LA145_0 == WS)) {
                                    alt145 = 1;
                                }
                                switch (alt145) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:93: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause2173);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:97: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
                                int alt147 = 2;
                                int LA147_0 = input.LA(1);
                                if ((LA147_0 == 90)) {
                                    int LA147_1 = input.LA(2);
                                    if ((LA147_1 == WS)) {
                                        int LA147_4 = input.LA(3);
                                        if ((LA147_4 == SINGLE_QUOTE_STRING)) {
                                            alt147 = 1;
                                        }
                                    } else if ((LA147_1 == SINGLE_QUOTE_STRING)) {
                                        alt147 = 1;
                                    }
                                }
                                switch (alt147) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:98: ',' ( WS )? orig= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 90, FOLLOW_90_in_granularityClause2177);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:102: ( WS )?
                                        int alt146 = 2;
                                        int LA146_0 = input.LA(1);
                                        if ((LA146_0 == WS)) {
                                            alt146 = 1;
                                        }
                                        switch (alt146) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:102: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause2179);
                                            }
                                            break;

                                        }

                                        orig = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2184);
                                        granularity.setOrigin((orig != null ? orig.getText() : null));
                                    }
                                    break;

                                }

                                clause = new Pair<>(granularity, null);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:211: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
                                int alt151 = 2;
                                int LA151_0 = input.LA(1);
                                if ((LA151_0 == WS || LA151_0 == 90)) {
                                    alt151 = 1;
                                }
                                switch (alt151) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:212: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:212: ( WS )?
                                        int alt148 = 2;
                                        int LA148_0 = input.LA(1);
                                        if ((LA148_0 == WS)) {
                                            alt148 = 1;
                                        }
                                        switch (alt148) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:212: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause2192);
                                            }
                                            break;

                                        }

                                        match(input, 90, FOLLOW_90_in_granularityClause2195);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:220: ( WS )?
                                        int alt149 = 2;
                                        int LA149_0 = input.LA(1);
                                        if ((LA149_0 == WS)) {
                                            int LA149_1 = input.LA(2);
                                            if ((LA149_1 == WS)) {
                                                alt149 = 1;
                                            }
                                        }
                                        switch (alt149) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:220: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause2197);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_granularityInclude_in_granularityClause2202);
                                        inc = granularityInclude();
                                        state._fsp--;

                                        clause = new Pair<>(granularity, inc);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:288: ( WS )?
                                        int alt150 = 2;
                                        int LA150_0 = input.LA(1);
                                        if ((LA150_0 == WS)) {
                                            alt150 = 1;
                                        }
                                        switch (alt150) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:288: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause2206);
                                            }
                                            break;

                                        }

                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_granularityClause2211);
                            }

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:7: PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )? RPARAN
                            {
                                match(input, PERIOD, FOLLOW_PERIOD_in_granularityClause2230);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:14: ( WS )?
                                int alt152 = 2;
                                int LA152_0 = input.LA(1);
                                if ((LA152_0 == WS)) {
                                    alt152 = 1;
                                }
                                switch (alt152) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:14: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause2232);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_granularityClause2235);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:25: ( WS )?
                                int alt153 = 2;
                                int LA153_0 = input.LA(1);
                                if ((LA153_0 == WS)) {
                                    alt153 = 1;
                                }
                                switch (alt153) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:25: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause2237);
                                    }
                                    break;

                                }

                                per = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2242);
                                granularity.setPeriod((per != null ? per.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:89: ( WS )?
                                int alt154 = 2;
                                int LA154_0 = input.LA(1);
                                if ((LA154_0 == WS)) {
                                    alt154 = 1;
                                }
                                switch (alt154) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:89: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause2246);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:93: ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )?
                                int alt156 = 2;
                                int LA156_0 = input.LA(1);
                                if ((LA156_0 == 90)) {
                                    int LA156_1 = input.LA(2);
                                    if ((LA156_1 == WS)) {
                                        int LA156_4 = input.LA(3);
                                        if ((LA156_4 == SINGLE_QUOTE_STRING)) {
                                            alt156 = 1;
                                        }
                                    } else if ((LA156_1 == SINGLE_QUOTE_STRING)) {
                                        alt156 = 1;
                                    }
                                }
                                switch (alt156) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:94: ',' ( WS )? tz= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 90, FOLLOW_90_in_granularityClause2250);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:98: ( WS )?
                                        int alt155 = 2;
                                        int LA155_0 = input.LA(1);
                                        if ((LA155_0 == WS)) {
                                            alt155 = 1;
                                        }
                                        switch (alt155) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:98: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause2252);
                                            }
                                            break;

                                        }

                                        tz = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2257);
                                        granularity.setTimeZone((tz != null ? tz.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:164: ( WS )?
                                int alt157 = 2;
                                int LA157_0 = input.LA(1);
                                if ((LA157_0 == WS)) {
                                    alt157 = 1;
                                }
                                switch (alt157) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:164: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause2263);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:168: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
                                int alt159 = 2;
                                int LA159_0 = input.LA(1);
                                if ((LA159_0 == 90)) {
                                    int LA159_1 = input.LA(2);
                                    if ((LA159_1 == WS)) {
                                        int LA159_4 = input.LA(3);
                                        if ((LA159_4 == SINGLE_QUOTE_STRING)) {
                                            alt159 = 1;
                                        }
                                    } else if ((LA159_1 == SINGLE_QUOTE_STRING)) {
                                        alt159 = 1;
                                    }
                                }
                                switch (alt159) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:169: ',' ( WS )? orig= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 90, FOLLOW_90_in_granularityClause2267);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:173: ( WS )?
                                        int alt158 = 2;
                                        int LA158_0 = input.LA(1);
                                        if ((LA158_0 == WS)) {
                                            alt158 = 1;
                                        }
                                        switch (alt158) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:173: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause2269);
                                            }
                                            break;

                                        }

                                        orig = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2274);
                                        granularity.setOrigin((orig != null ? orig.getText() : null));
                                    }
                                    break;

                                }

                                clause = new Pair<>(granularity, null);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:283: ( ( WS )? ',' ( WS )? inc= granularityInclude ( WS )? )?
                                int alt163 = 2;
                                int LA163_0 = input.LA(1);
                                if ((LA163_0 == WS || LA163_0 == 90)) {
                                    alt163 = 1;
                                }
                                switch (alt163) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:284: ( WS )? ',' ( WS )? inc= granularityInclude ( WS )?
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:284: ( WS )?
                                        int alt160 = 2;
                                        int LA160_0 = input.LA(1);
                                        if ((LA160_0 == WS)) {
                                            alt160 = 1;
                                        }
                                        switch (alt160) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:284: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause2283);
                                            }
                                            break;

                                        }

                                        match(input, 90, FOLLOW_90_in_granularityClause2286);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:292: ( WS )?
                                        int alt161 = 2;
                                        int LA161_0 = input.LA(1);
                                        if ((LA161_0 == WS)) {
                                            int LA161_1 = input.LA(2);
                                            if ((LA161_1 == WS)) {
                                                alt161 = 1;
                                            }
                                        }
                                        switch (alt161) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:292: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause2288);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_granularityInclude_in_granularityClause2293);
                                        inc = granularityInclude();
                                        state._fsp--;

                                        clause = new Pair<>(granularity, inc);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:360: ( WS )?
                                        int alt162 = 2;
                                        int LA162_0 = input.LA(1);
                                        if ((LA162_0 == WS)) {
                                            alt162 = 1;
                                        }
                                        switch (alt162) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:360: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause2297);
                                            }
                                            break;

                                        }

                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_granularityClause2302);
                            }

                        }
                        break;

                    }

                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return clause;
    }
	// $ANTLR end "granularityClause"

    // $ANTLR start "granularityInclude"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:342:1: granularityInclude returns [List<Pair<Integer, Integer>> microIntervals] : ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) ;
    public final List<Pair<Integer, Integer>> granularityInclude() throws RecognitionException {
        List<Pair<Integer, Integer>> microIntervals = null;

        Pair<Integer, Integer> p1 = null;
        Pair<Integer, Integer> p2 = null;

        microIntervals = new ArrayList<>();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:2: ( ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:4: WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN
                {
                    match(input, WS, FOLLOW_WS_in_granularityInclude2330);
                    match(input, INCLUDE, FOLLOW_INCLUDE_in_granularityInclude2332);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:15: ( WS )?
                    int alt166 = 2;
                    int LA166_0 = input.LA(1);
                    if ((LA166_0 == WS)) {
                        alt166 = 1;
                    }
                    switch (alt166) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:15: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude2334);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_granularityInclude2337);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:26: ( WS )?
                    int alt167 = 2;
                    int LA167_0 = input.LA(1);
                    if ((LA167_0 == WS)) {
                        alt167 = 1;
                    }
                    switch (alt167) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:26: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude2339);
                        }
                        break;

                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:30: (p1= pairNums ( ',' p2= pairNums )* )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:31: p1= pairNums ( ',' p2= pairNums )*
                    {
                        pushFollow(FOLLOW_pairNums_in_granularityInclude2345);
                        p1 = pairNums();
                        state._fsp--;

                        microIntervals.add(p1);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:69: ( ',' p2= pairNums )*
                        loop168:
                        while (true) {
                            int alt168 = 2;
                            int LA168_0 = input.LA(1);
                            if ((LA168_0 == 90)) {
                                alt168 = 1;
                            }

                            switch (alt168) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:70: ',' p2= pairNums
                                {
                                    match(input, 90, FOLLOW_90_in_granularityInclude2350);
                                    pushFollow(FOLLOW_pairNums_in_granularityInclude2354);
                                    p2 = pairNums();
                                    state._fsp--;

                                    microIntervals.add(p2);
                                }
                                break;

                                default:
                                    break loop168;
                            }
                        }

                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:115: ( WS )?
                    int alt169 = 2;
                    int LA169_0 = input.LA(1);
                    if ((LA169_0 == WS)) {
                        alt169 = 1;
                    }
                    switch (alt169) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:345:115: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude2361);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_granularityInclude2364);
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return microIntervals;
    }
	// $ANTLR end "granularityInclude"

    // $ANTLR start "pairNums"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:348:1: pairNums returns [Pair<Integer, Integer> pair] : ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) ;
    public final Pair<Integer, Integer> pairNums() throws RecognitionException {
        Pair<Integer, Integer> pair = null;

        Token i = null;
        Token j = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:2: ( ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:5: LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE
                {
                    match(input, LSQUARE, FOLLOW_LSQUARE_in_pairNums2383);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:13: ( WS )?
                    int alt170 = 2;
                    int LA170_0 = input.LA(1);
                    if ((LA170_0 == WS)) {
                        alt170 = 1;
                    }
                    switch (alt170) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:13: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums2385);
                        }
                        break;

                    }

                    i = (Token) match(input, LONG, FOLLOW_LONG_in_pairNums2390);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:25: ( WS )?
                    int alt171 = 2;
                    int LA171_0 = input.LA(1);
                    if ((LA171_0 == WS)) {
                        alt171 = 1;
                    }
                    switch (alt171) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:25: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums2393);
                        }
                        break;

                    }

                    match(input, 90, FOLLOW_90_in_pairNums2396);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:33: ( WS )?
                    int alt172 = 2;
                    int LA172_0 = input.LA(1);
                    if ((LA172_0 == WS)) {
                        alt172 = 1;
                    }
                    switch (alt172) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:33: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums2398);
                        }
                        break;

                    }

                    j = (Token) match(input, LONG, FOLLOW_LONG_in_pairNums2403);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:44: ( WS )?
                    int alt173 = 2;
                    int LA173_0 = input.LA(1);
                    if ((LA173_0 == WS)) {
                        alt173 = 1;
                    }
                    switch (alt173) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:44: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums2405);
                        }
                        break;

                    }

                    match(input, RSQUARE, FOLLOW_RSQUARE_in_pairNums2408);
                }

                pair = new Pair<>(Integer.parseInt((i != null ? i.getText() : null)), Integer.parseInt((j != null ? j.getText() : null)));
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return pair;
    }
	// $ANTLR end "pairNums"

    // $ANTLR start "pairString"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:352:1: pairString returns [Pair<String, String> pair] : ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) ;
    public final Pair<String, String> pairString() throws RecognitionException {
        Pair<String, String> pair = null;

        Token i = null;
        Token j = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:2: ( ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:5: LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE
                {
                    match(input, LSQUARE, FOLLOW_LSQUARE_in_pairString2428);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:13: ( WS )?
                    int alt174 = 2;
                    int LA174_0 = input.LA(1);
                    if ((LA174_0 == WS)) {
                        alt174 = 1;
                    }
                    switch (alt174) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:13: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString2430);
                        }
                        break;

                    }

                    i = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_pairString2435);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:40: ( WS )?
                    int alt175 = 2;
                    int LA175_0 = input.LA(1);
                    if ((LA175_0 == WS)) {
                        alt175 = 1;
                    }
                    switch (alt175) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:40: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString2438);
                        }
                        break;

                    }

                    match(input, 90, FOLLOW_90_in_pairString2441);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:48: ( WS )?
                    int alt176 = 2;
                    int LA176_0 = input.LA(1);
                    if ((LA176_0 == WS)) {
                        alt176 = 1;
                    }
                    switch (alt176) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:48: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString2443);
                        }
                        break;

                    }

                    j = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_pairString2448);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:74: ( WS )?
                    int alt177 = 2;
                    int LA177_0 = input.LA(1);
                    if ((LA177_0 == WS)) {
                        alt177 = 1;
                    }
                    switch (alt177) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:353:74: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString2450);
                        }
                        break;

                    }

                    match(input, RSQUARE, FOLLOW_RSQUARE_in_pairString2453);
                }

                pair = new Pair<>(((i != null ? i.getText() : null)).replaceAll("'", ""), ((j != null ? j.getText() : null)).replaceAll("'", ""));
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return pair;
    }
	// $ANTLR end "pairString"

    // $ANTLR start "havingClause"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:1: havingClause returns [Having having] : h= complexHaving ;
    public final Having havingClause() throws RecognitionException {
        Having having = null;

        Having h = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:361:2: (h= complexHaving )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:361:4: h= complexHaving
            {
                pushFollow(FOLLOW_complexHaving_in_havingClause2478);
                h = complexHaving();
                state._fsp--;

                having = h;
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return having;
    }
	// $ANTLR end "havingClause"

    // $ANTLR start "simpleHaving"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:1: simpleHaving returns [Having having] : ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) );
    public final Having simpleHaving() throws RecognitionException {
        Having having = null;

        Token a = null;
        Token t = null;
        Token v = null;
        Token n = null;
        EqualsToHolder e = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:2: ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) )
            int alt182 = 3;
            int LA182_0 = input.LA(1);
            if ((LA182_0 == ID)) {
                switch (input.LA(2)) {
                    case WS: {
                        int LA182_3 = input.LA(3);
                        if ((LA182_3 == COMPARE_OPER)) {
                            alt182 = 1;
                        } else if ((LA182_3 == EQUALS)) {
                            alt182 = 2;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 182, 3, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case COMPARE_OPER: {
                        alt182 = 1;
                    }
                    break;
                    case EQUALS: {
                        alt182 = 2;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 182, 1, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else if ((LA182_0 == NOT)) {
                alt182 = 3;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 182, 0, input);
                throw nvae;
            }

            switch (alt182) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:5: a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
                    {
                        a = (Token) match(input, ID, FOLLOW_ID_in_simpleHaving2499);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:10: ( WS )?
                        int alt178 = 2;
                        int LA178_0 = input.LA(1);
                        if ((LA178_0 == WS)) {
                            alt178 = 1;
                        }
                        switch (alt178) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:10: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving2501);
                            }
                            break;

                        }

                        t = (Token) match(input, COMPARE_OPER, FOLLOW_COMPARE_OPER_in_simpleHaving2506);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:29: ( WS )?
                        int alt179 = 2;
                        int LA179_0 = input.LA(1);
                        if ((LA179_0 == WS)) {
                            alt179 = 1;
                        }
                        switch (alt179) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:29: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving2508);
                            }
                            break;

                        }

                        v = input.LT(1);
                        if (input.LA(1) == FLOAT || input.LA(1) == LONG) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                    }

                    having = new Having((t != null ? t.getText() : null), (a != null ? a.getText() : null), (v != null ? v.getText() : null));
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:366:4: (e= getEquals )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:366:4: (e= getEquals )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:366:5: e= getEquals
                    {
                        pushFollow(FOLLOW_getEquals_in_simpleHaving2530);
                        e = getEquals();
                        state._fsp--;

                    }

                    having = new Having("=", e.name, e.value);
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:5: n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
                    {
                        n = (Token) match(input, NOT, FOLLOW_NOT_in_simpleHaving2541);
                        match(input, WS, FOLLOW_WS_in_simpleHaving2543);
                        a = (Token) match(input, ID, FOLLOW_ID_in_simpleHaving2547);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:19: ( WS )?
                        int alt180 = 2;
                        int LA180_0 = input.LA(1);
                        if ((LA180_0 == WS)) {
                            alt180 = 1;
                        }
                        switch (alt180) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:19: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving2549);
                            }
                            break;

                        }

                        t = (Token) match(input, COMPARE_OPER, FOLLOW_COMPARE_OPER_in_simpleHaving2554);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:38: ( WS )?
                        int alt181 = 2;
                        int LA181_0 = input.LA(1);
                        if ((LA181_0 == WS)) {
                            alt181 = 1;
                        }
                        switch (alt181) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:38: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving2556);
                            }
                            break;

                        }

                        v = input.LT(1);
                        if (input.LA(1) == FLOAT || input.LA(1) == LONG) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                    }

                    having = new Having((n != null ? n.getText() : null).toLowerCase());
                    having.havingSpecs = Arrays.asList(new Having((t != null ? t.getText() : null), (a != null ? a.getText() : null), (v != null ? v.getText() : null)));
                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return having;
    }
	// $ANTLR end "simpleHaving"

    // $ANTLR start "complexHaving"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:370:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );
    public final Having complexHaving() throws RecognitionException {
        Having having = null;

        Token o = null;
        Having s = null;
        Having a = null;
        Having b = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:371:2: ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) )
            int alt183 = 2;
            alt183 = dfa183.predict(input);
            switch (alt183) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:371:4: (s= simpleHaving )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:371:4: (s= simpleHaving )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:371:5: s= simpleHaving
                    {
                        pushFollow(FOLLOW_simpleHaving_in_complexHaving2589);
                        s = simpleHaving();
                        state._fsp--;

                    }

                    having = s;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:372:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:372:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:372:5: a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving
                    {
                        pushFollow(FOLLOW_simpleHaving_in_complexHaving2600);
                        a = simpleHaving();
                        state._fsp--;

                        match(input, WS, FOLLOW_WS_in_complexHaving2602);
                        o = input.LT(1);
                        if (input.LA(1) == AND || input.LA(1) == OR) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        match(input, WS, FOLLOW_WS_in_complexHaving2612);
                        pushFollow(FOLLOW_complexHaving_in_complexHaving2616);
                        b = complexHaving();
                        state._fsp--;

                    }

                    having = new Having((o != null ? o.getText() : null).toLowerCase());
                    having.havingSpecs = Arrays.asList(a, b);
                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return having;
    }
	// $ANTLR end "complexHaving"

    // $ANTLR start "selectorFilter"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:380:1: selectorFilter returns [Filter filter] : e= getEquals ;
    public final Filter selectorFilter() throws RecognitionException {
        Filter filter = null;

        EqualsToHolder e = null;

        filter = new Filter("selector");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:2: (e= getEquals )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:382:4: e= getEquals
            {
                pushFollow(FOLLOW_getEquals_in_selectorFilter2653);
                e = getEquals();
                state._fsp--;

                filter.dimension = e.name;
                filter.value = unquote(e.value);

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return filter;
    }
	// $ANTLR end "selectorFilter"

    // $ANTLR start "regexFilter"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:388:1: regexFilter returns [Filter filter] : (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) ;
    public final Filter regexFilter() throws RecognitionException {
        Filter filter = null;

        Token a = null;
        Token b = null;

        filter = new Filter("regex");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:2: ( (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:5: a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING )
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_regexFilter2682);
                    match(input, WS, FOLLOW_WS_in_regexFilter2684);
                    match(input, LIKE, FOLLOW_LIKE_in_regexFilter2686);
                    match(input, WS, FOLLOW_WS_in_regexFilter2688);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:24: ( SINGLE_QUOTE_STRING )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:25: SINGLE_QUOTE_STRING
                    {
                        b = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter2694);
                    }

                }

                filter.dimension = (a != null ? a.getText() : null);
                filter.pattern = unquote((b != null ? b.getText() : null));

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return filter;
    }
	// $ANTLR end "regexFilter"

    // $ANTLR start "simpleFilter"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:396:1: simpleFilter returns [Filter filter] : ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) );
    public final Filter simpleFilter() throws RecognitionException {
        Filter filter = null;

        Filter a = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:2: ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) )
            int alt188 = 2;
            int LA188_0 = input.LA(1);
            if ((LA188_0 == ID)) {
                alt188 = 1;
            } else if ((LA188_0 == LPARAN)) {
                alt188 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 188, 0, input);
                throw nvae;
            }

            switch (alt188) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:4: (a= selectorFilter |a= regexFilter )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:4: (a= selectorFilter |a= regexFilter )
                    int alt184 = 2;
                    int LA184_0 = input.LA(1);
                    if ((LA184_0 == ID)) {
                        int LA184_1 = input.LA(2);
                        if ((LA184_1 == WS)) {
                            int LA184_2 = input.LA(3);
                            if ((LA184_2 == LIKE)) {
                                alt184 = 2;
                            } else if ((LA184_2 == EQUALS)) {
                                alt184 = 1;
                            } else {
                                int nvaeMark = input.mark();
                                try {
                                    for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                        input.consume();
                                    }
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 184, 2, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA184_1 == EQUALS)) {
                            alt184 = 1;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                input.consume();
                                NoViableAltException nvae
                                        = new NoViableAltException("", 184, 1, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 184, 0, input);
                        throw nvae;
                    }

                    switch (alt184) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:5: a= selectorFilter
                        {
                            pushFollow(FOLLOW_selectorFilter_in_simpleFilter2719);
                            a = selectorFilter();
                            state._fsp--;

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:24: a= regexFilter
                        {
                            pushFollow(FOLLOW_regexFilter_in_simpleFilter2725);
                            a = regexFilter();
                            state._fsp--;

                        }
                        break;

                    }

                    filter = a;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:6: LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN
                    {
                        match(input, LPARAN, FOLLOW_LPARAN_in_simpleFilter2735);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:13: ( WS )?
                        int alt185 = 2;
                        int LA185_0 = input.LA(1);
                        if ((LA185_0 == WS)) {
                            alt185 = 1;
                        }
                        switch (alt185) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:13: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleFilter2737);
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:17: (a= selectorFilter |a= regexFilter )
                        int alt186 = 2;
                        int LA186_0 = input.LA(1);
                        if ((LA186_0 == ID)) {
                            int LA186_1 = input.LA(2);
                            if ((LA186_1 == WS)) {
                                int LA186_2 = input.LA(3);
                                if ((LA186_2 == LIKE)) {
                                    alt186 = 2;
                                } else if ((LA186_2 == EQUALS)) {
                                    alt186 = 1;
                                } else {
                                    int nvaeMark = input.mark();
                                    try {
                                        for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                            input.consume();
                                        }
                                        NoViableAltException nvae
                                                = new NoViableAltException("", 186, 2, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA186_1 == EQUALS)) {
                                alt186 = 1;
                            } else {
                                int nvaeMark = input.mark();
                                try {
                                    input.consume();
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 186, 1, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else {
                            NoViableAltException nvae
                                    = new NoViableAltException("", 186, 0, input);
                            throw nvae;
                        }

                        switch (alt186) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:18: a= selectorFilter
                            {
                                pushFollow(FOLLOW_selectorFilter_in_simpleFilter2743);
                                a = selectorFilter();
                                state._fsp--;

                            }
                            break;
                            case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:37: a= regexFilter
                            {
                                pushFollow(FOLLOW_regexFilter_in_simpleFilter2749);
                                a = regexFilter();
                                state._fsp--;

                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:52: ( WS )?
                        int alt187 = 2;
                        int LA187_0 = input.LA(1);
                        if ((LA187_0 == WS)) {
                            alt187 = 1;
                        }
                        switch (alt187) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:52: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleFilter2752);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_simpleFilter2755);
                    }

                    filter = a;
                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return filter;
    }
	// $ANTLR end "simpleFilter"

    // $ANTLR start "simpleLogicalFilter"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:401:1: simpleLogicalFilter returns [Filter filter] : ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) );
    public final Filter simpleLogicalFilter() throws RecognitionException {
        Filter filter = null;

        Token o = null;
        Filter a = null;
        Filter b = null;
        Filter s = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:2: ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) )
            int alt192 = 2;
            int LA192_0 = input.LA(1);
            if ((LA192_0 == ID || LA192_0 == NOT)) {
                alt192 = 1;
            } else if ((LA192_0 == LPARAN)) {
                switch (input.LA(2)) {
                    case WS: {
                        int LA192_4 = input.LA(3);
                        if ((LA192_4 == ID)) {
                            int LA192_8 = input.LA(4);
                            if ((LA192_8 == WS)) {
                                int LA192_13 = input.LA(5);
                                if ((LA192_13 == LIKE)) {
                                    int LA192_19 = input.LA(6);
                                    if ((LA192_19 == WS)) {
                                        alt192 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 192, 19, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA192_13 == EQUALS)) {
                                    int LA192_20 = input.LA(6);
                                    if ((LA192_20 == WS)) {
                                        alt192 = 1;
                                    } else if ((LA192_20 == FLOAT || LA192_20 == LONG || LA192_20 == SINGLE_QUOTE_STRING)) {
                                        alt192 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 192, 20, input);
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
                                                = new NoViableAltException("", 192, 13, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA192_8 == EQUALS)) {
                                int LA192_14 = input.LA(5);
                                if ((LA192_14 == WS)) {
                                    int LA192_21 = input.LA(6);
                                    if ((LA192_21 == FLOAT || LA192_21 == LONG || LA192_21 == SINGLE_QUOTE_STRING)) {
                                        alt192 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 192, 21, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA192_14 == FLOAT || LA192_14 == LONG || LA192_14 == SINGLE_QUOTE_STRING)) {
                                    int LA192_22 = input.LA(6);
                                    if ((LA192_22 == WS)) {
                                        alt192 = 1;
                                    } else if ((LA192_22 == RPARAN)) {
                                        alt192 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 192, 22, input);
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
                                                = new NoViableAltException("", 192, 14, input);
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
                                            = new NoViableAltException("", 192, 8, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA192_4 == LPARAN || LA192_4 == NOT)) {
                            alt192 = 2;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 192, 4, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case ID: {
                        int LA192_5 = input.LA(3);
                        if ((LA192_5 == WS)) {
                            int LA192_11 = input.LA(4);
                            if ((LA192_11 == LIKE)) {
                                int LA192_15 = input.LA(5);
                                if ((LA192_15 == WS)) {
                                    int LA192_23 = input.LA(6);
                                    if ((LA192_23 == SINGLE_QUOTE_STRING)) {
                                        alt192 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 192, 23, input);
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
                                                = new NoViableAltException("", 192, 15, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA192_11 == EQUALS)) {
                                int LA192_16 = input.LA(5);
                                if ((LA192_16 == WS)) {
                                    int LA192_24 = input.LA(6);
                                    if ((LA192_24 == FLOAT || LA192_24 == LONG || LA192_24 == SINGLE_QUOTE_STRING)) {
                                        alt192 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 192, 24, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA192_16 == FLOAT || LA192_16 == LONG || LA192_16 == SINGLE_QUOTE_STRING)) {
                                    int LA192_25 = input.LA(6);
                                    if ((LA192_25 == WS)) {
                                        alt192 = 1;
                                    } else if ((LA192_25 == RPARAN)) {
                                        alt192 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 192, 25, input);
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
                                                = new NoViableAltException("", 192, 16, input);
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
                                            = new NoViableAltException("", 192, 11, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA192_5 == EQUALS)) {
                            int LA192_12 = input.LA(4);
                            if ((LA192_12 == WS)) {
                                int LA192_17 = input.LA(5);
                                if ((LA192_17 == FLOAT || LA192_17 == LONG || LA192_17 == SINGLE_QUOTE_STRING)) {
                                    int LA192_26 = input.LA(6);
                                    if ((LA192_26 == WS)) {
                                        alt192 = 1;
                                    } else if ((LA192_26 == RPARAN)) {
                                        alt192 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 192, 26, input);
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
                                                = new NoViableAltException("", 192, 17, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA192_12 == FLOAT || LA192_12 == LONG || LA192_12 == SINGLE_QUOTE_STRING)) {
                                int LA192_18 = input.LA(5);
                                if ((LA192_18 == WS)) {
                                    int LA192_27 = input.LA(6);
                                    if ((LA192_27 == AND || LA192_27 == OR)) {
                                        alt192 = 2;
                                    } else if ((LA192_27 == RPARAN)) {
                                        alt192 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 192, 27, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA192_18 == RPARAN)) {
                                    alt192 = 1;
                                } else {
                                    int nvaeMark = input.mark();
                                    try {
                                        for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
                                            input.consume();
                                        }
                                        NoViableAltException nvae
                                                = new NoViableAltException("", 192, 18, input);
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
                                            = new NoViableAltException("", 192, 12, input);
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
                                        = new NoViableAltException("", 192, 5, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case LPARAN:
                    case NOT: {
                        alt192 = 2;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 192, 2, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 192, 0, input);
                throw nvae;
            }

            switch (alt192) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
                    int alt189 = 2;
                    int LA189_0 = input.LA(1);
                    if ((LA189_0 == ID || LA189_0 == LPARAN)) {
                        alt189 = 1;
                    } else if ((LA189_0 == NOT)) {
                        alt189 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 189, 0, input);
                        throw nvae;
                    }

                    switch (alt189) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:5: a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter
                            {
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2776);
                                a = simpleFilter();
                                state._fsp--;

                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter2778);
                                o = input.LT(1);
                                if (input.LA(1) == AND || input.LA(1) == OR) {
                                    input.consume();
                                    state.errorRecovery = false;
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    throw mse;
                                }
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter2788);
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2792);
                                b = simpleFilter();
                                state._fsp--;

                            }

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:55: (o= NOT WS b= simpleFilter )
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:55: (o= NOT WS b= simpleFilter )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:56: o= NOT WS b= simpleFilter
                            {
                                o = (Token) match(input, NOT, FOLLOW_NOT_in_simpleLogicalFilter2800);
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter2802);
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter2806);
                                b = simpleFilter();
                                state._fsp--;

                            }

                        }
                        break;

                    }

                    filter = new Filter((o != null ? o.getText() : null).toLowerCase());
                    filter.fields = new ArrayList<>();
                    if (a != null) {
                        filter.fields.add(a);
                    }
                    filter.fields.add(b);

                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:5: LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN
                    {
                        match(input, LPARAN, FOLLOW_LPARAN_in_simpleLogicalFilter2819);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:12: ( WS )?
                        int alt190 = 2;
                        int LA190_0 = input.LA(1);
                        if ((LA190_0 == WS)) {
                            alt190 = 1;
                        }
                        switch (alt190) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:12: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter2821);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter2826);
                        s = simpleLogicalFilter();
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:38: ( WS )?
                        int alt191 = 2;
                        int LA191_0 = input.LA(1);
                        if ((LA191_0 == WS)) {
                            alt191 = 1;
                        }
                        switch (alt191) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:38: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter2828);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_simpleLogicalFilter2831);
                    }

                    filter = s;
                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return filter;
    }
	// $ANTLR end "simpleLogicalFilter"

    // $ANTLR start "grandFilter"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:1: grandFilter returns [Filter filter] : (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? ;
    public final Filter grandFilter() throws RecognitionException {
        Filter filter = null;

        Token o = null;
        Filter a = null;
        Filter b = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:2: ( (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:4: (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )?
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:4: (a= simpleFilter |a= simpleLogicalFilter )
                int alt193 = 2;
                alt193 = dfa193.predict(input);
                switch (alt193) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:5: a= simpleFilter
                    {
                        pushFollow(FOLLOW_simpleFilter_in_grandFilter2855);
                        a = simpleFilter();
                        state._fsp--;

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:22: a= simpleLogicalFilter
                    {
                        pushFollow(FOLLOW_simpleLogicalFilter_in_grandFilter2861);
                        a = simpleLogicalFilter();
                        state._fsp--;

                    }
                    break;

                }

                filter = a;
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:60: ( WS o= ( AND | OR ) WS b= grandFilter )?
                int alt194 = 2;
                int LA194_0 = input.LA(1);
                if ((LA194_0 == WS)) {
                    int LA194_1 = input.LA(2);
                    if ((LA194_1 == AND || LA194_1 == OR)) {
                        alt194 = 1;
                    }
                }
                switch (alt194) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:61: WS o= ( AND | OR ) WS b= grandFilter
                    {
                        match(input, WS, FOLLOW_WS_in_grandFilter2868);
                        o = input.LT(1);
                        if (input.LA(1) == AND || input.LA(1) == OR) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        match(input, WS, FOLLOW_WS_in_grandFilter2878);
                        pushFollow(FOLLOW_grandFilter_in_grandFilter2882);
                        b = grandFilter();
                        state._fsp--;

                        filter = new Filter((o != null ? o.getText() : null).toLowerCase());
                        filter.fields = new ArrayList<>();
                        filter.fields.add(a);
                        filter.fields.add(b);

                    }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return filter;
    }
	// $ANTLR end "grandFilter"

    // $ANTLR start "aggItem"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:427:1: aggItem returns [AggItem aggItem] : aggCallSite[aggItem] ( WS AS WS x= ID )? ;
    public final AggItem aggItem() throws RecognitionException {
        AggItem aggItem = null;

        Token x = null;

        aggItem = new AggItem();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:2: ( aggCallSite[aggItem] ( WS AS WS x= ID )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:4: aggCallSite[aggItem] ( WS AS WS x= ID )?
            {
                pushFollow(FOLLOW_aggCallSite_in_aggItem2919);
                aggCallSite(aggItem);
                state._fsp--;

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:25: ( WS AS WS x= ID )?
                int alt195 = 2;
                int LA195_0 = input.LA(1);
                if ((LA195_0 == WS)) {
                    int LA195_1 = input.LA(2);
                    if ((LA195_1 == AS)) {
                        alt195 = 1;
                    }
                }
                switch (alt195) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:429:26: WS AS WS x= ID
                    {
                        match(input, WS, FOLLOW_WS_in_aggItem2923);
                        match(input, AS, FOLLOW_AS_in_aggItem2925);
                        match(input, WS, FOLLOW_WS_in_aggItem2927);
                        x = (Token) match(input, ID, FOLLOW_ID_in_aggItem2931);
                        aggItem.setAsName((x != null ? x.getText() : null));
                    }
                    break;

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return aggItem;
    }
	// $ANTLR end "aggItem"

    // $ANTLR start "aggCallSite"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:431:1: aggCallSite[AggItem aggItem] : (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) );
    public final void aggCallSite(AggItem aggItem) throws RecognitionException {
        Token x = null;
        Token y = null;
        String p = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:2: (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN ) | COUNT ( '(*)' ) )
            int alt202 = 2;
            int LA202_0 = input.LA(1);
            if ((LA202_0 == DOUBLE_SUM || LA202_0 == JAVASCRIPT || LA202_0 == LONG_SUM || LA202_0 == MAX || LA202_0 == MIN || LA202_0 == UNIQUE)) {
                alt202 = 1;
            } else if ((LA202_0 == COUNT)) {
                alt202 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 202, 0, input);
                throw nvae;
            }

            switch (alt202) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:4: p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
                {
                    pushFollow(FOLLOW_aggFunc_in_aggCallSite2950);
                    p = aggFunc();
                    state._fsp--;

                    aggItem.setAggType(p);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:39: ( ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:40: ( WS )? LPARAN ( WS )? (x= ID ) ( ( WS )? ',' ( WS )? y= ID )* ( WS )? RPARAN
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:40: ( WS )?
                        int alt196 = 2;
                        int LA196_0 = input.LA(1);
                        if ((LA196_0 == WS)) {
                            alt196 = 1;
                        }
                        switch (alt196) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:40: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite2955);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_aggCallSite2958);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:51: ( WS )?
                        int alt197 = 2;
                        int LA197_0 = input.LA(1);
                        if ((LA197_0 == WS)) {
                            alt197 = 1;
                        }
                        switch (alt197) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:51: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite2960);
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:55: (x= ID )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:57: x= ID
                        {
                            x = (Token) match(input, ID, FOLLOW_ID_in_aggCallSite2967);
                            aggItem.setFieldName((x != null ? x.getText() : null));
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:96: ( ( WS )? ',' ( WS )? y= ID )*
                        loop200:
                        while (true) {
                            int alt200 = 2;
                            int LA200_0 = input.LA(1);
                            if ((LA200_0 == WS)) {
                                int LA200_1 = input.LA(2);
                                if ((LA200_1 == 90)) {
                                    alt200 = 1;
                                }

                            } else if ((LA200_0 == 90)) {
                                alt200 = 1;
                            }

                            switch (alt200) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:97: ( WS )? ',' ( WS )? y= ID
                                {
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:97: ( WS )?
                                    int alt198 = 2;
                                    int LA198_0 = input.LA(1);
                                    if ((LA198_0 == WS)) {
                                        alt198 = 1;
                                    }
                                    switch (alt198) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:97: WS
                                        {
                                            match(input, WS, FOLLOW_WS_in_aggCallSite2973);
                                        }
                                        break;

                                    }

                                    match(input, 90, FOLLOW_90_in_aggCallSite2976);
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:105: ( WS )?
                                    int alt199 = 2;
                                    int LA199_0 = input.LA(1);
                                    if ((LA199_0 == WS)) {
                                        alt199 = 1;
                                    }
                                    switch (alt199) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:432:105: WS
                                        {
                                            match(input, WS, FOLLOW_WS_in_aggCallSite2978);
                                        }
                                        break;

                                    }

                                    y = (Token) match(input, ID, FOLLOW_ID_in_aggCallSite2983);

                                    if (aggItem.fieldNames == null || aggItem.fieldNames.isEmpty()) {
                                        aggItem.fieldNames = new ArrayList<>();
                                        aggItem.fieldNames.add(aggItem.fieldName);
                                        aggItem.fieldName = null;
                                    }
                                    aggItem.fieldNames.add((y != null ? y.getText() : null));

                                }
                                break;

                                default:
                                    break loop200;
                            }
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:439:6: ( WS )?
                        int alt201 = 2;
                        int LA201_0 = input.LA(1);
                        if ((LA201_0 == WS)) {
                            alt201 = 1;
                        }
                        switch (alt201) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:439:6: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite2989);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_aggCallSite2992);
                    }

                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:440:4: COUNT ( '(*)' )
                {
                    match(input, COUNT, FOLLOW_COUNT_in_aggCallSite2999);
                    aggItem.setAggType("count");
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:440:41: ( '(*)' )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:440:42: '(*)'
                    {
                        match(input, 88, FOLLOW_88_in_aggCallSite3004);
                    }

                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "aggCallSite"

    // $ANTLR start "aggFunc"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:443:1: aggFunc returns [String name] : ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT );
    public final String aggFunc() throws RecognitionException {
        String name = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:444:2: ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT )
            int alt203 = 6;
            switch (input.LA(1)) {
                case LONG_SUM: {
                    alt203 = 1;
                }
                break;
                case DOUBLE_SUM: {
                    alt203 = 2;
                }
                break;
                case UNIQUE: {
                    alt203 = 3;
                }
                break;
                case MIN: {
                    alt203 = 4;
                }
                break;
                case MAX: {
                    alt203 = 5;
                }
                break;
                case JAVASCRIPT: {
                    alt203 = 6;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 203, 0, input);
                    throw nvae;
            }
            switch (alt203) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:444:4: LONG_SUM
                {
                    match(input, LONG_SUM, FOLLOW_LONG_SUM_in_aggFunc3022);
                    name = "longSum";
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:445:4: DOUBLE_SUM
                {
                    match(input, DOUBLE_SUM, FOLLOW_DOUBLE_SUM_in_aggFunc3029);
                    name = "doubleSum";
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:446:4: UNIQUE
                {
                    match(input, UNIQUE, FOLLOW_UNIQUE_in_aggFunc3036);
                    name = "hyperUnique";
                }
                break;
                case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:447:4: MIN
                {
                    match(input, MIN, FOLLOW_MIN_in_aggFunc3043);
                    name = "min";
                }
                break;
                case 5: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:448:4: MAX
                {
                    match(input, MAX, FOLLOW_MAX_in_aggFunc3050);
                    name = "max";
                }
                break;
                case 6: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:449:4: JAVASCRIPT
                {
                    match(input, JAVASCRIPT, FOLLOW_JAVASCRIPT_in_aggFunc3057);
                    name = "javascript";
                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return name;
    }
	// $ANTLR end "aggFunc"

    // $ANTLR start "postAggItem"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:455:1: postAggItem returns [PostAggItem postAggItem] : ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) );
    public final PostAggItem postAggItem() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem a = null;
        PostAggItem b = null;

        postAggItem = new PostAggItem("arithmetic");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:2: ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) )
            int alt213 = 2;
            int LA213_0 = input.LA(1);
            if ((LA213_0 == FLOAT || LA213_0 == ID || LA213_0 == JAVASCRIPT || LA213_0 == LONG || LA213_0 == UNIQUE)) {
                alt213 = 1;
            } else if ((LA213_0 == LPARAN)) {
                alt213 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 213, 0, input);
                throw nvae;
            }

            switch (alt213) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:5: a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                    {
                        pushFollow(FOLLOW_simpleArith_in_postAggItem3085);
                        a = simpleArith();
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:20: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                        int alt206 = 2;
                        int LA206_0 = input.LA(1);
                        if ((LA206_0 == WS)) {
                            int LA206_1 = input.LA(2);
                            if ((LA206_1 == ARITH_OPER)) {
                                alt206 = 1;
                            }
                        } else if ((LA206_0 == ARITH_OPER)) {
                            alt206 = 1;
                        }
                        switch (alt206) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:21: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:21: ( WS )?
                                int alt204 = 2;
                                int LA204_0 = input.LA(1);
                                if ((LA204_0 == WS)) {
                                    alt204 = 1;
                                }
                                switch (alt204) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:21: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem3089);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggArithOper_in_postAggItem3092);
                                postAggArithOper(postAggItem);
                                state._fsp--;

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:55: ( WS )?
                                int alt205 = 2;
                                int LA205_0 = input.LA(1);
                                if ((LA205_0 == WS)) {
                                    alt205 = 1;
                                }
                                switch (alt205) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:457:55: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem3095);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggItem_in_postAggItem3100);
                                b = postAggItem();
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
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:6: LPARAN ( WS )? a= postAggItem ( WS )? RPARAN
                        {
                            match(input, LPARAN, FOLLOW_LPARAN_in_postAggItem3118);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:13: ( WS )?
                            int alt207 = 2;
                            int LA207_0 = input.LA(1);
                            if ((LA207_0 == WS)) {
                                alt207 = 1;
                            }
                            switch (alt207) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:13: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_postAggItem3120);
                                }
                                break;

                            }

                            pushFollow(FOLLOW_postAggItem_in_postAggItem3125);
                            a = postAggItem();
                            state._fsp--;

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:31: ( WS )?
                            int alt208 = 2;
                            int LA208_0 = input.LA(1);
                            if ((LA208_0 == WS)) {
                                alt208 = 1;
                            }
                            switch (alt208) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:31: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_postAggItem3127);
                                }
                                break;

                            }

                            match(input, RPARAN, FOLLOW_RPARAN_in_postAggItem3130);
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:43: ( postAggLabel[postAggItem] )?
                        int alt209 = 2;
                        int LA209_0 = input.LA(1);
                        if ((LA209_0 == AS)) {
                            alt209 = 1;
                        }
                        switch (alt209) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:44: postAggLabel[postAggItem]
                            {
                                pushFollow(FOLLOW_postAggLabel_in_postAggItem3134);
                                postAggLabel(postAggItem);
                                state._fsp--;

                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:72: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                        int alt212 = 2;
                        int LA212_0 = input.LA(1);
                        if ((LA212_0 == WS)) {
                            int LA212_1 = input.LA(2);
                            if ((LA212_1 == ARITH_OPER)) {
                                alt212 = 1;
                            }
                        } else if ((LA212_0 == ARITH_OPER)) {
                            alt212 = 1;
                        }
                        switch (alt212) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:73: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:73: ( WS )?
                                int alt210 = 2;
                                int LA210_0 = input.LA(1);
                                if ((LA210_0 == WS)) {
                                    alt210 = 1;
                                }
                                switch (alt210) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:73: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem3140);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggArithOper_in_postAggItem3143);
                                postAggArithOper(postAggItem);
                                state._fsp--;

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:107: ( WS )?
                                int alt211 = 2;
                                int LA211_0 = input.LA(1);
                                if ((LA211_0 == WS)) {
                                    alt211 = 1;
                                }
                                switch (alt211) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:464:107: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem3146);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggItem_in_postAggItem3151);
                                b = postAggItem();
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
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return postAggItem;
    }
	// $ANTLR end "postAggItem"

    // $ANTLR start "simpleArith"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:475:1: simpleArith returns [PostAggItem postAggItem] : (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? ;
    public final PostAggItem simpleArith() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem a = null;
        PostAggItem b = null;

        postAggItem = new PostAggItem("arithmetic");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:2: ( (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:4: (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:4: (a= simplePostAggAccess )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:5: a= simplePostAggAccess
                {
                    pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith3187);
                    a = simplePostAggAccess();
                    state._fsp--;

                    postAggItem = a;
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
                int alt216 = 2;
                alt216 = dfa216.predict(input);
                switch (alt216) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:46: ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:46: ( WS )?
                        int alt214 = 2;
                        int LA214_0 = input.LA(1);
                        if ((LA214_0 == WS)) {
                            alt214 = 1;
                        }
                        switch (alt214) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:46: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleArith3193);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_postAggArithOper_in_simpleArith3196);
                        postAggArithOper(postAggItem);
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:80: ( WS )?
                        int alt215 = 2;
                        int LA215_0 = input.LA(1);
                        if ((LA215_0 == WS)) {
                            alt215 = 1;
                        }
                        switch (alt215) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:477:80: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleArith3199);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith3204);
                        b = simplePostAggAccess();
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

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return postAggItem;
    }
	// $ANTLR end "simpleArith"

    // $ANTLR start "simplePostAggAccess"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:489:1: simplePostAggAccess returns [PostAggItem postAggItem] : (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef );
    public final PostAggItem simplePostAggAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem c = null;
        PostAggItem f = null;
        PostAggItem h = null;
        PostAggItem js = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:490:2: (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef )
            int alt217 = 4;
            switch (input.LA(1)) {
                case FLOAT:
                case LONG: {
                    alt217 = 1;
                }
                break;
                case ID: {
                    alt217 = 2;
                }
                break;
                case UNIQUE: {
                    alt217 = 3;
                }
                break;
                case JAVASCRIPT: {
                    alt217 = 4;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 217, 0, input);
                    throw nvae;
            }
            switch (alt217) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:490:4: c= constantAccess
                {
                    pushFollow(FOLLOW_constantAccess_in_simplePostAggAccess3233);
                    c = constantAccess();
                    state._fsp--;

                    postAggItem = c;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:491:4: f= fieldAccess
                {
                    pushFollow(FOLLOW_fieldAccess_in_simplePostAggAccess3250);
                    f = fieldAccess();
                    state._fsp--;

                    postAggItem = f;
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:492:4: h= hyperUniqueCardinality
                {
                    pushFollow(FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess3263);
                    h = hyperUniqueCardinality();
                    state._fsp--;

                    postAggItem = h;
                }
                break;
                case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:493:4: js= postAggJavascriptDef
                {
                    pushFollow(FOLLOW_postAggJavascriptDef_in_simplePostAggAccess3272);
                    js = postAggJavascriptDef();
                    state._fsp--;

                    postAggItem = js;
                }
                break;

            }
        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return postAggItem;
    }
	// $ANTLR end "simplePostAggAccess"

    // $ANTLR start "constantAccess"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:498:1: constantAccess returns [PostAggItem postAggItem] : ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) ;
    public final PostAggItem constantAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("constant");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:2: ( ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:5: (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )?
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:5: (a= FLOAT |a= LONG )
                    int alt218 = 2;
                    int LA218_0 = input.LA(1);
                    if ((LA218_0 == FLOAT)) {
                        alt218 = 1;
                    } else if ((LA218_0 == LONG)) {
                        alt218 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 218, 0, input);
                        throw nvae;
                    }

                    switch (alt218) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:6: a= FLOAT
                        {
                            a = (Token) match(input, FLOAT, FOLLOW_FLOAT_in_constantAccess3302);
                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:500:16: a= LONG
                        {
                            a = (Token) match(input, LONG, FOLLOW_LONG_in_constantAccess3308);
                        }
                        break;

                    }

                    postAggItem.constantValue = Double.valueOf((a != null ? a.getText() : null));
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:502:5: ( WS postAggLabel[postAggItem] )?
                    int alt219 = 2;
                    int LA219_0 = input.LA(1);
                    if ((LA219_0 == WS)) {
                        int LA219_1 = input.LA(2);
                        if ((LA219_1 == AS)) {
                            alt219 = 1;
                        }
                    }
                    switch (alt219) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:502:6: WS postAggLabel[postAggItem]
                        {
                            match(input, WS, FOLLOW_WS_in_constantAccess3321);
                            pushFollow(FOLLOW_postAggLabel_in_constantAccess3323);
                            postAggLabel(postAggItem);
                            state._fsp--;

                        }
                        break;

                    }

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return postAggItem;
    }
	// $ANTLR end "constantAccess"

    // $ANTLR start "fieldAccess"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:505:1: fieldAccess returns [PostAggItem postAggItem] : (a= ID ( WS postAggLabel[postAggItem] )? ) ;
    public final PostAggItem fieldAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("fieldAccess");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:507:2: ( (a= ID ( WS postAggLabel[postAggItem] )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:507:4: (a= ID ( WS postAggLabel[postAggItem] )? )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:507:4: (a= ID ( WS postAggLabel[postAggItem] )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:507:5: a= ID ( WS postAggLabel[postAggItem] )?
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_fieldAccess3351);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:507:10: ( WS postAggLabel[postAggItem] )?
                    int alt220 = 2;
                    int LA220_0 = input.LA(1);
                    if ((LA220_0 == WS)) {
                        int LA220_1 = input.LA(2);
                        if ((LA220_1 == AS)) {
                            alt220 = 1;
                        }
                    }
                    switch (alt220) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:507:11: WS postAggLabel[postAggItem]
                        {
                            match(input, WS, FOLLOW_WS_in_fieldAccess3354);
                            pushFollow(FOLLOW_postAggLabel_in_fieldAccess3356);
                            postAggLabel(postAggItem);
                            state._fsp--;

                        }
                        break;

                    }

                }

                postAggItem.fieldName = (a != null ? a.getText() : null);
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return postAggItem;
    }
	// $ANTLR end "fieldAccess"

    // $ANTLR start "hyperUniqueCardinality"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:510:1: hyperUniqueCardinality returns [PostAggItem postAggItem] : ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) ;
    public final PostAggItem hyperUniqueCardinality() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("hyperUniqueCardinality");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:2: ( ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:5: UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN
                {
                    match(input, UNIQUE, FOLLOW_UNIQUE_in_hyperUniqueCardinality3385);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:12: ( WS )?
                    int alt221 = 2;
                    int LA221_0 = input.LA(1);
                    if ((LA221_0 == WS)) {
                        alt221 = 1;
                    }
                    switch (alt221) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:12: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality3387);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_hyperUniqueCardinality3390);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:23: ( WS )?
                    int alt222 = 2;
                    int LA222_0 = input.LA(1);
                    if ((LA222_0 == WS)) {
                        alt222 = 1;
                    }
                    switch (alt222) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:23: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality3392);
                        }
                        break;

                    }

                    a = (Token) match(input, ID, FOLLOW_ID_in_hyperUniqueCardinality3397);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:32: ( WS )?
                    int alt223 = 2;
                    int LA223_0 = input.LA(1);
                    if ((LA223_0 == WS)) {
                        alt223 = 1;
                    }
                    switch (alt223) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:512:32: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality3399);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_hyperUniqueCardinality3402);
                    postAggItem.fieldName = (a != null ? a.getText() : null);
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return postAggItem;
    }
	// $ANTLR end "hyperUniqueCardinality"

    // $ANTLR start "postAggJavascriptDef"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:517:1: postAggJavascriptDef returns [PostAggItem postAggItem] : JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING ;
    public final PostAggItem postAggJavascriptDef() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token str = null;

        postAggItem = new PostAggItem("javascript");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:519:2: ( JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:519:4: JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING
            {
                match(input, JAVASCRIPT, FOLLOW_JAVASCRIPT_in_postAggJavascriptDef3428);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:519:15: ( WS )?
                int alt224 = 2;
                int LA224_0 = input.LA(1);
                if ((LA224_0 == WS)) {
                    alt224 = 1;
                }
                switch (alt224) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:519:15: WS
                    {
                        match(input, WS, FOLLOW_WS_in_postAggJavascriptDef3430);
                    }
                    break;

                }

                str = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef3435);
                postAggItem.parseToJs((str != null ? str.getText() : null));
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return postAggItem;
    }
	// $ANTLR end "postAggJavascriptDef"

    // $ANTLR start "postAggLabel"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:522:1: postAggLabel[PostAggItem postAggItem] : ( AS WS id= ID ) ;
    public final void postAggLabel(PostAggItem postAggItem) throws RecognitionException {
        Token id = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:523:2: ( ( AS WS id= ID ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:523:4: ( AS WS id= ID )
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:523:4: ( AS WS id= ID )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:523:5: AS WS id= ID
                {
                    match(input, AS, FOLLOW_AS_in_postAggLabel3451);
                    match(input, WS, FOLLOW_WS_in_postAggLabel3453);
                    id = (Token) match(input, ID, FOLLOW_ID_in_postAggLabel3457);
                }

                postAggItem.name = (id != null ? id.getText() : null);
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "postAggLabel"

    // $ANTLR start "postAggArithOper"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:526:1: postAggArithOper[PostAggItem postAggItem] : arith= ARITH_OPER ;
    public final void postAggArithOper(PostAggItem postAggItem) throws RecognitionException {
        Token arith = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:527:2: (arith= ARITH_OPER )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:527:3: arith= ARITH_OPER
            {
                arith = (Token) match(input, ARITH_OPER, FOLLOW_ARITH_OPER_in_postAggArithOper3473);
                postAggItem.fn = (arith != null ? arith.getText() : null);
            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
    // $ANTLR end "postAggArithOper"

    public static class isoTime_return extends ParserRuleReturnScope {

        public String date;
    };

    // $ANTLR start "isoTime"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:532:1: isoTime returns [String date] : (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ );
    public final druidGParser.isoTime_return isoTime() throws RecognitionException {
        druidGParser.isoTime_return retval = new druidGParser.isoTime_return();
        retval.start = input.LT(1);

        Token d = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:533:2: (d= DATE_YEAR_ONLY |d= DATE_YEAR_MONTH_ONLY |d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ )
            int alt225 = 9;
            switch (input.LA(1)) {
                case DATE_YEAR_ONLY: {
                    alt225 = 1;
                }
                break;
                case DATE_YEAR_MONTH_ONLY: {
                    alt225 = 2;
                }
                break;
                case DATE: {
                    alt225 = 3;
                }
                break;
                case DATE_HOUR: {
                    alt225 = 4;
                }
                break;
                case DATE_HOUR_MIN: {
                    alt225 = 5;
                }
                break;
                case DATE_HOUR_MIN_SEC: {
                    alt225 = 6;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB: {
                    alt225 = 7;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB_TZ: {
                    alt225 = 8;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB_UTC_TZ: {
                    alt225 = 9;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 225, 0, input);
                    throw nvae;
            }
            switch (alt225) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:533:3: d= DATE_YEAR_ONLY
                {
                    d = (Token) match(input, DATE_YEAR_ONLY, FOLLOW_DATE_YEAR_ONLY_in_isoTime3492);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:534:3: d= DATE_YEAR_MONTH_ONLY
                {
                    d = (Token) match(input, DATE_YEAR_MONTH_ONLY, FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime3500);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:535:3: d= DATE
                {
                    d = (Token) match(input, DATE, FOLLOW_DATE_in_isoTime3508);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:536:3: d= DATE_HOUR
                {
                    d = (Token) match(input, DATE_HOUR, FOLLOW_DATE_HOUR_in_isoTime3516);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 5: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:537:3: d= DATE_HOUR_MIN
                {
                    d = (Token) match(input, DATE_HOUR_MIN, FOLLOW_DATE_HOUR_MIN_in_isoTime3524);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 6: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:538:3: d= DATE_HOUR_MIN_SEC
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC, FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime3532);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 7: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:539:3: d= DATE_HOUR_MIN_SEC_SUB
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB, FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime3540);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 8: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:540:3: d= DATE_HOUR_MIN_SEC_SUB_TZ
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB_TZ, FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime3548);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 9: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:541:3: d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB_UTC_TZ, FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime3556);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;

            }
            retval.stop = input.LT(-1);

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
        return retval;
    }
	// $ANTLR end "isoTime"

    // Delegated rules
    protected DFA183 dfa183 = new DFA183(this);
    protected DFA193 dfa193 = new DFA193(this);
    protected DFA216 dfa216 = new DFA216(this);
    static final String DFA183_eotS
            = "\176\uffff";
    static final String DFA183_eofS
            = "\12\uffff\1\24\1\uffff\1\24\2\uffff\1\24\1\uffff\3\24\3\uffff\2\24\5\uffff"
            + "\2\24\3\uffff\2\24\3\uffff\1\24\15\uffff\1\24\17\uffff\1\24\67\uffff";
    static final String DFA183_minS
            = "\1\47\1\14\1\127\1\14\2\41\1\47\3\41\1\102\1\41\1\102\1\14\1\41\1\102"
            + "\1\41\2\102\1\4\3\uffff\1\102\1\4\3\uffff\1\14\1\41\1\102\1\4\3\uffff"
            + "\1\102\1\4\3\uffff\1\4\15\uffff\1\4\15\uffff\2\41\1\102\67\uffff";
    static final String DFA183_maxS
            = "\1\75\2\127\1\36\2\127\1\47\2\127\1\65\1\127\1\115\2\127\1\65\1\127\1"
            + "\115\2\127\1\126\3\uffff\1\127\1\126\3\uffff\1\14\2\127\1\126\3\uffff"
            + "\1\127\1\126\3\uffff\1\126\15\uffff\1\126\15\uffff\1\127\1\65\1\127\67"
            + "\uffff";
    static final String DFA183_acceptS
            = "\24\uffff\1\1\35\uffff\1\2\24\uffff\1\1\15\uffff\1\1\41\uffff\4\1\3\uffff";
    static final String DFA183_specialS
            = "\176\uffff}>";
    static final String[] DFA183_transitionS = {
        "\1\1\25\uffff\1\2",
        "\1\4\21\uffff\1\5\70\uffff\1\3",
        "\1\6",
        "\1\7\21\uffff\1\10",
        "\1\12\23\uffff\1\12\41\uffff\1\11",
        "\1\14\23\uffff\1\14\27\uffff\1\14\11\uffff\1\13",
        "\1\15",
        "\1\17\23\uffff\1\17\41\uffff\1\16",
        "\1\21\23\uffff\1\21\27\uffff\1\21\11\uffff\1\20",
        "\1\22\23\uffff\1\22",
        "\1\24\7\uffff\1\24\14\uffff\1\23",
        "\1\27\23\uffff\1\27\27\uffff\1\27",
        "\1\24\7\uffff\1\24\14\uffff\1\30",
        "\1\35\112\uffff\1\34",
        "\1\36\23\uffff\1\36",
        "\1\24\7\uffff\1\24\14\uffff\1\37",
        "\1\43\23\uffff\1\43\27\uffff\1\43",
        "\1\24\7\uffff\1\24\14\uffff\1\44",
        "\1\24\7\uffff\1\24\14\uffff\1\50",
        "\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"
        + "\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
        "",
        "",
        "",
        "\1\24\7\uffff\1\24\14\uffff\1\66",
        "\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"
        + "\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
        "",
        "",
        "",
        "\1\104",
        "\1\106\23\uffff\1\106\41\uffff\1\105",
        "\1\24\7\uffff\1\24\14\uffff\1\107",
        "\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"
        + "\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
        "",
        "",
        "",
        "\1\24\7\uffff\1\24\14\uffff\1\125",
        "\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"
        + "\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
        "",
        "",
        "",
        "\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"
        + "\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\62\41\uffff\1\24\10\uffff\1\24\2\uffff\1\24\1\uffff\1\24\15\uffff"
        + "\1\24\1\62\1\24\3\uffff\1\24\1\uffff\1\24\6\uffff\1\24\4\uffff\1\24",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\170\23\uffff\1\170\41\uffff\1\167",
        "\1\171\23\uffff\1\171",
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

    static final short[] DFA183_eot = DFA.unpackEncodedString(DFA183_eotS);
    static final short[] DFA183_eof = DFA.unpackEncodedString(DFA183_eofS);
    static final char[] DFA183_min = DFA.unpackEncodedStringToUnsignedChars(DFA183_minS);
    static final char[] DFA183_max = DFA.unpackEncodedStringToUnsignedChars(DFA183_maxS);
    static final short[] DFA183_accept = DFA.unpackEncodedString(DFA183_acceptS);
    static final short[] DFA183_special = DFA.unpackEncodedString(DFA183_specialS);
    static final short[][] DFA183_transition;

    static {
        int numStates = DFA183_transitionS.length;
        DFA183_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA183_transition[i] = DFA.unpackEncodedString(DFA183_transitionS[i]);
        }
    }

    protected class DFA183 extends DFA {

        public DFA183(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 183;
            this.eot = DFA183_eot;
            this.eof = DFA183_eof;
            this.min = DFA183_min;
            this.max = DFA183_max;
            this.accept = DFA183_accept;
            this.special = DFA183_special;
            this.transition = DFA183_transition;
        }

        @Override
        public String getDescription() {
            return "370:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );";
        }
    }

    static final String DFA193_eotS
            = "\164\uffff";
    static final String DFA193_eofS
            = "\15\uffff\1\30\7\uffff\3\30\11\uffff\3\30\3\uffff\1\30\30\uffff\1\30\63"
            + "\uffff";
    static final String DFA193_minS
            = "\1\47\1\36\1\47\1\uffff\1\36\1\41\1\47\1\36\2\uffff\1\127\2\41\1\102\1"
            + "\36\2\uffff\1\36\1\41\1\115\1\41\2\102\1\4\3\uffff\1\36\1\41\1\127\2\41"
            + "\1\112\2\102\1\4\3\uffff\1\4\3\uffff\1\127\13\uffff\1\127\2\41\1\112\1"
            + "\115\1\41\2\112\1\4\1\102\63\uffff";
    static final String DFA193_maxS
            = "\1\75\2\127\1\uffff\1\63\1\127\1\75\1\127\2\uffff\2\127\1\115\2\127\2"
            + "\uffff\1\63\1\127\2\115\2\127\1\126\3\uffff\1\63\3\127\1\115\3\127\1\126"
            + "\3\uffff\1\126\3\uffff\1\127\13\uffff\2\127\1\115\1\127\2\115\2\127\1"
            + "\112\1\127\63\uffff";
    static final String DFA193_acceptS
            = "\3\uffff\1\2\24\uffff\1\1\50\uffff\1\1\3\uffff\1\1\3\uffff\1\1\13\uffff"
            + "\1\1\13\uffff\15\1\1\uffff\2\1\3\uffff";
    static final String DFA193_specialS
            = "\164\uffff}>";
    static final String[] DFA193_transitionS = {
        "\1\1\17\uffff\1\2\5\uffff\1\3",
        "\1\5\70\uffff\1\4",
        "\1\7\17\uffff\1\3\5\uffff\1\3\31\uffff\1\6",
        "",
        "\1\13\24\uffff\1\12",
        "\1\15\23\uffff\1\15\27\uffff\1\15\11\uffff\1\14",
        "\1\16\17\uffff\1\3\5\uffff\1\3",
        "\1\22\70\uffff\1\21",
        "",
        "",
        "\1\23",
        "\1\25\23\uffff\1\25\27\uffff\1\25\11\uffff\1\24",
        "\1\26\23\uffff\1\26\27\uffff\1\26",
        "\1\30\7\uffff\1\30\14\uffff\1\27",
        "\1\34\70\uffff\1\33",
        "",
        "",
        "\1\36\24\uffff\1\35",
        "\1\40\23\uffff\1\40\27\uffff\1\40\11\uffff\1\37",
        "\1\41",
        "\1\42\23\uffff\1\42\27\uffff\1\42",
        "\1\30\7\uffff\1\30\14\uffff\1\43",
        "\1\30\7\uffff\1\30\14\uffff\1\47",
        "\1\53\5\uffff\1\30\30\uffff\1\30\2\uffff\1\30\10\uffff\1\30\2\uffff"
        + "\1\30\1\uffff\1\30\15\uffff\1\30\1\53\1\30\3\uffff\1\30\1\uffff\1\30"
        + "\6\uffff\1\30\4\uffff\1\30",
        "",
        "",
        "",
        "\1\70\24\uffff\1\67",
        "\1\72\23\uffff\1\72\27\uffff\1\72\11\uffff\1\71",
        "\1\73",
        "\1\75\23\uffff\1\75\27\uffff\1\75\11\uffff\1\74",
        "\1\76\23\uffff\1\76\27\uffff\1\76",
        "\1\100\14\uffff\1\77",
        "\1\30\7\uffff\1\30\14\uffff\1\101",
        "\1\30\7\uffff\1\30\14\uffff\1\105",
        "\1\111\5\uffff\1\30\30\uffff\1\30\2\uffff\1\30\10\uffff\1\30\2\uffff"
        + "\1\30\1\uffff\1\30\15\uffff\1\30\1\111\1\30\3\uffff\1\30\1\uffff\1\30"
        + "\6\uffff\1\30\4\uffff\1\30",
        "",
        "",
        "",
        "\1\125\5\uffff\1\30\30\uffff\1\30\2\uffff\1\30\10\uffff\1\30\2\uffff"
        + "\1\30\1\uffff\1\30\15\uffff\1\30\1\125\1\30\3\uffff\1\30\1\uffff\1\30"
        + "\6\uffff\1\30\4\uffff\1\30",
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
        "\1\144\23\uffff\1\144\27\uffff\1\144\11\uffff\1\143",
        "\1\145\23\uffff\1\145\27\uffff\1\145",
        "\1\147\14\uffff\1\146",
        "\1\150",
        "\1\151\23\uffff\1\151\27\uffff\1\151",
        "\1\153\14\uffff\1\152",
        "\1\155\14\uffff\1\154",
        "\1\3\76\uffff\1\3\6\uffff\1\157",
        "\1\30\7\uffff\1\30\14\uffff\1\160",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
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

    static final short[] DFA193_eot = DFA.unpackEncodedString(DFA193_eotS);
    static final short[] DFA193_eof = DFA.unpackEncodedString(DFA193_eofS);
    static final char[] DFA193_min = DFA.unpackEncodedStringToUnsignedChars(DFA193_minS);
    static final char[] DFA193_max = DFA.unpackEncodedStringToUnsignedChars(DFA193_maxS);
    static final short[] DFA193_accept = DFA.unpackEncodedString(DFA193_acceptS);
    static final short[] DFA193_special = DFA.unpackEncodedString(DFA193_specialS);
    static final short[][] DFA193_transition;

    static {
        int numStates = DFA193_transitionS.length;
        DFA193_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA193_transition[i] = DFA.unpackEncodedString(DFA193_transitionS[i]);
        }
    }

    protected class DFA193 extends DFA {

        public DFA193(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 193;
            this.eot = DFA193_eot;
            this.eof = DFA193_eof;
            this.min = DFA193_min;
            this.max = DFA193_max;
            this.accept = DFA193_accept;
            this.special = DFA193_special;
            this.transition = DFA193_transition;
        }

        @Override
        public String getDescription() {
            return "416:4: (a= simpleFilter |a= simpleLogicalFilter )";
        }
    }

    static final String DFA216_eotS
            = "\134\uffff";
    static final String DFA216_eofS
            = "\2\3\132\uffff";
    static final String DFA216_minS
            = "\2\5\1\41\6\uffff\1\41\3\uffff\1\41\3\uffff\1\67\1\115\1\uffff\1\41\3"
            + "\uffff\1\67\1\115\4\uffff\1\67\1\115\1\uffff\1\67\1\47\1\115\4\uffff\1"
            + "\67\1\115\1\uffff\1\67\1\47\1\115\1\uffff\1\67\1\47\1\115\1\uffff\2\47"
            + "\1\112\1\uffff\1\67\1\47\1\115\1\uffff\2\47\1\112\1\uffff\2\47\1\112\1"
            + "\uffff\1\47\3\112\25\uffff";
    static final String DFA216_maxS
            = "\1\127\1\126\1\127\6\uffff\1\127\3\uffff\1\123\3\uffff\2\127\1\uffff\1"
            + "\123\3\uffff\2\127\4\uffff\2\127\1\uffff\1\67\1\127\1\115\4\uffff\2\127"
            + "\1\uffff\1\67\1\127\1\115\1\uffff\1\67\1\127\1\115\1\uffff\1\127\1\47"
            + "\1\127\1\uffff\1\67\1\127\1\115\1\uffff\1\127\1\47\1\127\1\uffff\1\127"
            + "\1\47\1\127\1\uffff\1\47\2\127\1\112\25\uffff";
    static final String DFA216_acceptS
            = "\3\uffff\1\2\12\uffff\3\1\4\uffff\3\1\3\uffff\3\1\6\uffff\4\1\6\uffff"
            + "\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\4\uffff"
            + "\25\1";
    static final String DFA216_specialS
            = "\134\uffff}>";
    static final String[] DFA216_transitionS = {
        "\1\2\74\uffff\1\3\7\uffff\1\3\14\uffff\1\1",
        "\1\11\40\uffff\1\3\10\uffff\1\3\2\uffff\1\3\17\uffff\1\3\5\uffff\1\3"
        + "\1\uffff\1\3\13\uffff\1\3",
        "\1\16\5\uffff\1\20\6\uffff\1\22\6\uffff\1\17\1\uffff\1\3\33\uffff\1"
        + "\21\3\uffff\1\15",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\25\5\uffff\1\27\6\uffff\1\31\6\uffff\1\26\1\uffff\1\3\33\uffff\1"
        + "\30\3\uffff\1\24",
        "",
        "",
        "",
        "\1\33\5\uffff\1\35\6\uffff\1\37\6\uffff\1\34\1\uffff\1\3\33\uffff\1"
        + "\36",
        "",
        "",
        "",
        "\1\42\37\uffff\1\41",
        "\1\44\11\uffff\1\43",
        "",
        "\1\45\5\uffff\1\47\6\uffff\1\51\6\uffff\1\46\1\uffff\1\3\33\uffff\1"
        + "\50",
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

    static final short[] DFA216_eot = DFA.unpackEncodedString(DFA216_eotS);
    static final short[] DFA216_eof = DFA.unpackEncodedString(DFA216_eofS);
    static final char[] DFA216_min = DFA.unpackEncodedStringToUnsignedChars(DFA216_minS);
    static final char[] DFA216_max = DFA.unpackEncodedStringToUnsignedChars(DFA216_maxS);
    static final short[] DFA216_accept = DFA.unpackEncodedString(DFA216_acceptS);
    static final short[] DFA216_special = DFA.unpackEncodedString(DFA216_specialS);
    static final short[][] DFA216_transition;

    static {
        int numStates = DFA216_transitionS.length;
        DFA216_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA216_transition[i] = DFA.unpackEncodedString(DFA216_transitionS[i]);
        }
    }

    protected class DFA216 extends DFA {

        public DFA216(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 216;
            this.eot = DFA216_eot;
            this.eof = DFA216_eof;
            this.min = DFA216_min;
            this.max = DFA216_max;
            this.accept = DFA216_accept;
            this.special = DFA216_special;
            this.transition = DFA216_transition;
        }

        @Override
        public String getDescription() {
            return "477:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?";
        }
    }

    public static final BitSet FOLLOW_grandQuery_in_program42 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_grandInsert_in_program54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_deleteStmnt_in_grandDelete82 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800006L});
    public static final BitSet FOLLOW_WS_in_grandDelete91 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000006L});
    public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandDelete95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandDelete101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropStmnt_in_grandDrop133 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800006L});
    public static final BitSet FOLLOW_WS_in_grandDrop142 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000006L});
    public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandDrop146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandDrop152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertStmnt_in_grandInsert183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertHStmnt_in_grandInsert195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_insertRTStmnt_in_grandInsert207 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800006L});
    public static final BitSet FOLLOW_WS_in_grandInsert216 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000006L});
    public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandInsert220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OPT_AMPERSAND_in_grandInsert226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DELETE_in_deleteStmnt252 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_deleteStmnt254 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FROM_in_deleteStmnt256 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_deleteStmnt258 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_deleteStmnt263 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000200000L});
    public static final BitSet FOLLOW_WHERE_in_deleteStmnt270 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_deleteStmnt272 = new BitSet(new long[]{0x0000000000000000L, 0x0000000008000000L});
    public static final BitSet FOLLOW_intervalClause_in_deleteStmnt276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DROP_in_dropStmnt304 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_dropStmnt306 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000010000L});
    public static final BitSet FOLLOW_TABLE_in_dropStmnt308 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_dropStmnt310 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_dropStmnt315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_in_insertStmnt342 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt344 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_INTO_in_insertStmnt346 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt348 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_insertStmnt353 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt358 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_insertStmnt361 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt363 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_selectItems_in_insertStmnt366 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertStmnt370 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_insertStmnt373 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt375 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_selectItems_in_insertStmnt378 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertStmnt383 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_insertStmnt386 = new BitSet(new long[]{0x0000000400000000L, 0x0000000000900000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt388 = new BitSet(new long[]{0x0000000400000000L, 0x0000000000100000L});
    public static final BitSet FOLLOW_VALUES_in_insertStmnt401 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt403 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_insertStmnt406 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt408 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_anyValue_in_insertStmnt414 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertStmnt421 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_insertStmnt424 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt426 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_anyValue_in_insertStmnt431 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertStmnt437 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_insertStmnt440 = new BitSet(new long[]{0x0000000002000002L, 0x0000000000A00000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt442 = new BitSet(new long[]{0x0000000002000002L, 0x0000000000A00000L});
    public static final BitSet FOLLOW_FROM_in_insertStmnt459 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt461 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt466 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt471 = new BitSet(new long[]{0x0000000002000002L, 0x0000000000A00000L});
    public static final BitSet FOLLOW_WHERE_in_insertStmnt481 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt483 = new BitSet(new long[]{0x0000000000000000L, 0x0000000008000000L});
    public static final BitSet FOLLOW_intervalClause_in_insertStmnt487 = new BitSet(new long[]{0x0000000002000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt495 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BREAK_in_insertStmnt497 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt499 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BY_in_insertStmnt501 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt503 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt507 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_DELIMITOR_in_insertStmnt521 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt523 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_insertStmnt526 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt528 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt533 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertStmnt537 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_insertStmnt540 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt542 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertStmnt547 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_insertStmnt553 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_insertStmnt556 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertStmnt558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_HADOOP_in_insertHStmnt582 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt584 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_INTO_in_insertHStmnt586 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt588 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_insertHStmnt593 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt598 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_insertHStmnt601 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt603 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_selectItems_in_insertHStmnt606 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt610 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_insertHStmnt613 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt615 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_selectItems_in_insertHStmnt618 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt623 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_insertHStmnt626 = new BitSet(new long[]{0x0000000400000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt628 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FROM_in_insertHStmnt638 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt640 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt645 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt650 = new BitSet(new long[]{0x0000000002000402L, 0x0000000000200220L});
    public static final BitSet FOLLOW_WHERE_in_insertHStmnt655 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt657 = new BitSet(new long[]{0x0000000000000000L, 0x0000000008000000L});
    public static final BitSet FOLLOW_intervalClause_in_insertHStmnt661 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt663 = new BitSet(new long[]{0x0000000002000402L, 0x0000000000000220L});
    public static final BitSet FOLLOW_BREAK_in_insertHStmnt671 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt673 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BY_in_insertHStmnt675 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt677 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt681 = new BitSet(new long[]{0x0000000002000002L, 0x0000000000000220L});
    public static final BitSet FOLLOW_DELIMITOR_in_insertHStmnt696 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt698 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_insertHStmnt701 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt703 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt708 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt712 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_insertHStmnt715 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt717 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt722 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt728 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_insertHStmnt731 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800220L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt733 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000220L});
    public static final BitSet FOLLOW_PARTITION_in_insertHStmnt742 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt744 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_insertHStmnt747 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt749 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt754 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt756 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_insertHStmnt759 = new BitSet(new long[]{0x0020000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt761 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LONG_in_insertHStmnt766 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt770 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_insertHStmnt773 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800200L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt775 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000200L});
    public static final BitSet FOLLOW_ROLLUP_in_insertHStmnt783 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt785 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_insertHStmnt788 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt790 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertHStmnt795 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt797 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_insertHStmnt800 = new BitSet(new long[]{0x0020000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt802 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LONG_in_insertHStmnt807 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt811 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_insertHStmnt814 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertHStmnt816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INSERT_REALTIME_in_insertRTStmnt839 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt841 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_INTO_in_insertRTStmnt843 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt845 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_insertRTStmnt850 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt855 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_insertRTStmnt858 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt860 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_selectItems_in_insertRTStmnt863 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt867 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_insertRTStmnt870 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt872 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_selectItems_in_insertRTStmnt875 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt880 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_insertRTStmnt883 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000900000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt885 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000100000L});
    public static final BitSet FOLLOW_VALUES_in_insertRTStmnt891 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt893 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_insertRTStmnt896 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt898 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_anyValue_in_insertRTStmnt904 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt911 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_insertRTStmnt914 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt916 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_anyValue_in_insertRTStmnt921 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt927 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_insertRTStmnt930 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000A00000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt932 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000A00000L});
    public static final BitSet FOLLOW_WHERE_in_insertRTStmnt938 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt940 = new BitSet(new long[]{0x0000000000000000L, 0x0000000008000000L});
    public static final BitSet FOLLOW_intervalClause_in_insertRTStmnt944 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt952 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BREAK_in_insertRTStmnt954 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt956 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BY_in_insertRTStmnt958 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_insertRTStmnt960 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_insertRTStmnt964 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_queryStmnt_in_grandQuery998 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800004L});
    public static final BitSet FOLLOW_WS_in_grandQuery1008 = new BitSet(new long[]{0x0004800000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_set_in_grandQuery1012 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_grandQuery1033 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_grandQuery1036 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000801000L});
    public static final BitSet FOLLOW_WS_in_grandQuery1038 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000001000L});
    public static final BitSet FOLLOW_queryStmnt_in_grandQuery1044 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_grandQuery1049 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_grandQuery1052 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800001L});
    public static final BitSet FOLLOW_WS_in_grandQuery1054 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_ON_in_grandQuery1057 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_grandQuery1064 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_grandQuery1067 = new BitSet(new long[]{0x0000008000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_grandQuery1069 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_grandQuery1075 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_grandQuery1080 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_grandQuery1083 = new BitSet(new long[]{0x0000008000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_grandQuery1085 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_grandQuery1090 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_grandQuery1096 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_grandQuery1099 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800004L});
    public static final BitSet FOLLOW_WS_in_grandQuery1118 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000004L});
    public static final BitSet FOLLOW_OPT_SEMI_COLON_in_grandQuery1121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_queryStmnt1144 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1172 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_selectItems_in_queryStmnt1174 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1178 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_queryStmnt1181 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1183 = new BitSet(new long[]{0x0A40408008004000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_selectItems_in_queryStmnt1186 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1217 = new BitSet(new long[]{0x0000000000000000L, 0x0000000002000000L});
    public static final BitSet FOLLOW_89_in_queryStmnt1219 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1234 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_FROM_in_queryStmnt1236 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1238 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_queryStmnt1242 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1258 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000200000L});
    public static final BitSet FOLLOW_WHERE_in_queryStmnt1260 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1262 = new BitSet(new long[]{0x0000000000000000L, 0x0000000008000000L});
    public static final BitSet FOLLOW_whereClause_in_queryStmnt1264 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1282 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BREAK_in_queryStmnt1284 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1286 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BY_in_queryStmnt1288 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1290 = new BitSet(new long[]{0x0000000020000000L, 0x0000000000002040L});
    public static final BitSet FOLLOW_granularityClause_in_queryStmnt1294 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1311 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_GROUP_in_queryStmnt1313 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1315 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BY_in_queryStmnt1317 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1319 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_queryStmnt1345 = new BitSet(new long[]{0x0000000000000002L, 0x0000000004800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1377 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_queryStmnt1380 = new BitSet(new long[]{0x0000008000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1382 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_queryStmnt1387 = new BitSet(new long[]{0x0000000000000002L, 0x0000000004800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1444 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_HAVING_in_queryStmnt1446 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1448 = new BitSet(new long[]{0x2000008000000000L});
    public static final BitSet FOLLOW_havingClause_in_queryStmnt1452 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1496 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000010L});
    public static final BitSet FOLLOW_ORDER_in_queryStmnt1498 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1500 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_BY_in_queryStmnt1502 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1504 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_queryStmnt1509 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1542 = new BitSet(new long[]{0x0000000004000080L});
    public static final BitSet FOLLOW_set_in_queryStmnt1546 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1596 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_LIMIT_in_queryStmnt1598 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1600 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LONG_in_queryStmnt1605 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1643 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000020000L});
    public static final BitSet FOLLOW_THEN_in_queryStmnt1645 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1647 = new BitSet(new long[]{0x00A0408200000000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_postAggItem_in_queryStmnt1651 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1666 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000400000L});
    public static final BitSet FOLLOW_WHICH_in_queryStmnt1668 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1670 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_CONTAINS_in_queryStmnt1672 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1676 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_queryStmnt1679 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1681 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1687 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1691 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_queryStmnt1694 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1696 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1701 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1708 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_queryStmnt1711 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1717 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000004000L});
    public static final BitSet FOLLOW_SORT_in_queryStmnt1719 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1721 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_queryStmnt1724 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1726 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1732 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1737 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_queryStmnt1740 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1752 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_HINT_in_queryStmnt1754 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1756 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_queryStmnt1759 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1761 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_queryStmnt1766 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_queryStmnt1770 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_queryStmnt1773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_anyValue1807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_anyValue1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggItem_in_selectItems1838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleDim_in_selectItems1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleDim1868 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleDim1871 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_simpleDim1873 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleDim1875 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_simpleDim1879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intervalClause_in_whereClause1902 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_whereClause1907 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_whereClause1909 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_whereClause1911 = new BitSet(new long[]{0x2080008000000000L});
    public static final BitSet FOLLOW_grandFilter_in_whereClause1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_intervalClause1941 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_intervalClause1943 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BETWEEN_in_intervalClause1945 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_intervalClause1947 = new BitSet(new long[]{0x0080000000FF8000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_isoTime_in_intervalClause1967 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause1974 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_intervalClause1978 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_intervalClause1980 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_intervalClause1982 = new BitSet(new long[]{0x0000000000FF8000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_isoTime_in_intervalClause1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_intervalClause2020 = new BitSet(new long[]{0x0100000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_intervalClause2022 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_pairString_in_intervalClause2027 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_intervalClause2039 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_intervalClause2042 = new BitSet(new long[]{0x0100000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_intervalClause2044 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_pairString_in_intervalClause2049 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_intervalClause2055 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_intervalClause2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getEquals2081 = new BitSet(new long[]{0x0000000040000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_getEquals2083 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EQUALS_in_getEquals2086 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_getEquals2088 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_set_in_getEquals2094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_granularityClause2157 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_granularityClause2159 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityClause2162 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_granularityClause2164 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2169 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_granularityClause2173 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_90_in_granularityClause2177 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_granularityClause2179 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2184 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_granularityClause2192 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_granularityClause2195 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_granularityClause2197 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_granularityInclude_in_granularityClause2202 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_granularityClause2206 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_granularityClause2211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_granularityClause2230 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_granularityClause2232 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityClause2235 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_granularityClause2237 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2242 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_granularityClause2246 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_90_in_granularityClause2250 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_granularityClause2252 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2257 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_granularityClause2263 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_90_in_granularityClause2267 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_granularityClause2269 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause2274 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_granularityClause2283 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_granularityClause2286 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_granularityClause2288 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_granularityInclude_in_granularityClause2293 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_granularityClause2297 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_granularityClause2302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_granularityInclude2330 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_INCLUDE_in_granularityInclude2332 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_granularityInclude2334 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityInclude2337 = new BitSet(new long[]{0x0100000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_granularityInclude2339 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_pairNums_in_granularityInclude2345 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_90_in_granularityInclude2350 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_pairNums_in_granularityInclude2354 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_granularityInclude2361 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_granularityInclude2364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_pairNums2383 = new BitSet(new long[]{0x0020000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_pairNums2385 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LONG_in_pairNums2390 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800000L});
    public static final BitSet FOLLOW_WS_in_pairNums2393 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_pairNums2396 = new BitSet(new long[]{0x0020000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_pairNums2398 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_LONG_in_pairNums2403 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800800L});
    public static final BitSet FOLLOW_WS_in_pairNums2405 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RSQUARE_in_pairNums2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_pairString2428 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_pairString2430 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString2435 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800000L});
    public static final BitSet FOLLOW_WS_in_pairString2438 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_pairString2441 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_pairString2443 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString2448 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800800L});
    public static final BitSet FOLLOW_WS_in_pairString2450 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000800L});
    public static final BitSet FOLLOW_RSQUARE_in_pairString2453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexHaving_in_havingClause2478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleHaving2499 = new BitSet(new long[]{0x0000000000001000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleHaving2501 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving2506 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleHaving2508 = new BitSet(new long[]{0x0020000200000000L});
    public static final BitSet FOLLOW_set_in_simpleHaving2513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getEquals_in_simpleHaving2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_simpleHaving2541 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleHaving2543 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_simpleHaving2547 = new BitSet(new long[]{0x0000000000001000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleHaving2549 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving2554 = new BitSet(new long[]{0x0020000200000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleHaving2556 = new BitSet(new long[]{0x0020000200000000L});
    public static final BitSet FOLLOW_set_in_simpleHaving2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleHaving_in_complexHaving2589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleHaving_in_complexHaving2600 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_complexHaving2602 = new BitSet(new long[]{0x0000000000000010L, 0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_complexHaving2606 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_complexHaving2612 = new BitSet(new long[]{0x2000008000000000L});
    public static final BitSet FOLLOW_complexHaving_in_complexHaving2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getEquals_in_selectorFilter2653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_regexFilter2682 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_regexFilter2684 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_LIKE_in_regexFilter2686 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_regexFilter2688 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectorFilter_in_simpleFilter2719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexFilter_in_simpleFilter2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_simpleFilter2735 = new BitSet(new long[]{0x0000008000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleFilter2737 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_selectorFilter_in_simpleFilter2743 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_regexFilter_in_simpleFilter2749 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_simpleFilter2752 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_simpleFilter2755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2776 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2778 = new BitSet(new long[]{0x0000000000000010L, 0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_simpleLogicalFilter2782 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2788 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_simpleLogicalFilter2800 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2802 = new BitSet(new long[]{0x0080008000000000L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter2806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_simpleLogicalFilter2819 = new BitSet(new long[]{0x2080008000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2821 = new BitSet(new long[]{0x2080008000000000L});
    public static final BitSet FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter2826 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter2828 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_simpleLogicalFilter2831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleFilter_in_grandFilter2855 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_simpleLogicalFilter_in_grandFilter2861 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_grandFilter2868 = new BitSet(new long[]{0x0000000000000010L, 0x0000000000000008L});
    public static final BitSet FOLLOW_set_in_grandFilter2872 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_grandFilter2878 = new BitSet(new long[]{0x2080008000000000L});
    public static final BitSet FOLLOW_grandFilter_in_grandFilter2882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggCallSite_in_aggItem2919 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_aggItem2923 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_aggItem2925 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_aggItem2927 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_aggItem2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggFunc_in_aggCallSite2950 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_aggCallSite2955 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_aggCallSite2958 = new BitSet(new long[]{0x0000008000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_aggCallSite2960 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_aggCallSite2967 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_aggCallSite2973 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004000000L});
    public static final BitSet FOLLOW_90_in_aggCallSite2976 = new BitSet(new long[]{0x0000008000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_aggCallSite2978 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_aggCallSite2983 = new BitSet(new long[]{0x0000000000000000L, 0x0000000004800400L});
    public static final BitSet FOLLOW_WS_in_aggCallSite2989 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_aggCallSite2992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_aggCallSite2999 = new BitSet(new long[]{0x0000000000000000L, 0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_aggCallSite3004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_SUM_in_aggFunc3022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_SUM_in_aggFunc3029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_aggFunc3036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_aggFunc3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_aggFunc3050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JAVASCRIPT_in_aggFunc3057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleArith_in_postAggItem3085 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_postAggItem3089 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_postAggItem3092 = new BitSet(new long[]{0x00A0408200000000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_postAggItem3095 = new BitSet(new long[]{0x00A0408200000000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem3100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_postAggItem3118 = new BitSet(new long[]{0x00A0408200000000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_postAggItem3120 = new BitSet(new long[]{0x00A0408200000000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem3125 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_postAggItem3127 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_postAggItem3130 = new BitSet(new long[]{0x0000000000000062L, 0x0000000000800000L});
    public static final BitSet FOLLOW_postAggLabel_in_postAggItem3134 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_postAggItem3140 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_postAggItem3143 = new BitSet(new long[]{0x00A0408200000000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_postAggItem3146 = new BitSet(new long[]{0x00A0408200000000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem3151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith3187 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_simpleArith3193 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_simpleArith3196 = new BitSet(new long[]{0x0020408200000000L, 0x0000000000880000L});
    public static final BitSet FOLLOW_WS_in_simpleArith3199 = new BitSet(new long[]{0x0020408200000000L, 0x0000000000080000L});
    public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantAccess_in_simplePostAggAccess3233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_simplePostAggAccess3250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess3263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postAggJavascriptDef_in_simplePostAggAccess3272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constantAccess3302 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_LONG_in_constantAccess3308 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_constantAccess3321 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_postAggLabel_in_constantAccess3323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fieldAccess3351 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_fieldAccess3354 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_postAggLabel_in_fieldAccess3356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_hyperUniqueCardinality3385 = new BitSet(new long[]{0x0080000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3387 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_LPARAN_in_hyperUniqueCardinality3390 = new BitSet(new long[]{0x0000008000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3392 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_hyperUniqueCardinality3397 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800400L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality3399 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000400L});
    public static final BitSet FOLLOW_RPARAN_in_hyperUniqueCardinality3402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JAVASCRIPT_in_postAggJavascriptDef3428 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000802000L});
    public static final BitSet FOLLOW_WS_in_postAggJavascriptDef3430 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000002000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef3435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_postAggLabel3451 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000800000L});
    public static final BitSet FOLLOW_WS_in_postAggLabel3453 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_ID_in_postAggLabel3457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_OPER_in_postAggArithOper3473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_YEAR_ONLY_in_isoTime3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_YEAR_MONTH_ONLY_in_isoTime3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_isoTime3508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_in_isoTime3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_in_isoTime3524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime3532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime3548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime3556 = new BitSet(new long[]{0x0000000000000002L});
}
