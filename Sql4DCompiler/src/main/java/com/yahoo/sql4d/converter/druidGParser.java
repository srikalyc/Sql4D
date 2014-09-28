// $ANTLR 3.5 /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2014-09-27 19:28:02
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
import com.yahoo.sql4d.query.timeboundary.*;
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
        "BETWEEN", "BREAK", "BY", "COMPARE_OPER", "CONTAINS", "COUNT", "DATE",
        "DATE_HOUR", "DATE_HOUR_MIN", "DATE_HOUR_MIN_SEC", "DATE_HOUR_MIN_SEC_SUB",
        "DATE_HOUR_MIN_SEC_SUB_TZ", "DATE_HOUR_MIN_SEC_SUB_UTC_TZ", "DESC", "DOUBLE_SUM",
        "DURATION", "EQUALS", "ESC_SEQ", "FIELD_ACCESS", "FLOAT", "FROM", "GROUP",
        "HAVING", "HEX_DIGIT", "HINT", "ID", "INCLUDE", "JAVASCRIPT", "JOIN",
        "LCURLY", "LEFT_JOIN", "LIKE", "LIMIT", "LONG", "LONG_SUM", "LPARAN",
        "LSQUARE", "MAX", "MIN", "NEWLINE", "NOT", "NUM", "OCTAL_ESC", "ON", "OPT_SEMI_COLON",
        "OR", "ORDER", "PERIOD", "RCURLY", "RIGHT_JOIN", "RPARAN", "RSQUARE",
        "SELECT", "SINGLE_QUOTE_STRING", "SORT", "STRING", "THEN", "UNICODE_ESC",
        "UNIQUE", "WHERE", "WHICH", "WS", "'(*)'", "'*'", "','", "'interval'"
    };
    public static final int EOF = -1;
    public static final int T__70 = 70;
    public static final int T__71 = 71;
    public static final int T__72 = 72;
    public static final int T__73 = 73;
    public static final int AND = 4;
    public static final int ARITH_OPER = 5;
    public static final int AS = 6;
    public static final int ASC = 7;
    public static final int BETWEEN = 8;
    public static final int BREAK = 9;
    public static final int BY = 10;
    public static final int COMPARE_OPER = 11;
    public static final int CONTAINS = 12;
    public static final int COUNT = 13;
    public static final int DATE = 14;
    public static final int DATE_HOUR = 15;
    public static final int DATE_HOUR_MIN = 16;
    public static final int DATE_HOUR_MIN_SEC = 17;
    public static final int DATE_HOUR_MIN_SEC_SUB = 18;
    public static final int DATE_HOUR_MIN_SEC_SUB_TZ = 19;
    public static final int DATE_HOUR_MIN_SEC_SUB_UTC_TZ = 20;
    public static final int DESC = 21;
    public static final int DOUBLE_SUM = 22;
    public static final int DURATION = 23;
    public static final int EQUALS = 24;
    public static final int ESC_SEQ = 25;
    public static final int FIELD_ACCESS = 26;
    public static final int FLOAT = 27;
    public static final int FROM = 28;
    public static final int GROUP = 29;
    public static final int HAVING = 30;
    public static final int HEX_DIGIT = 31;
    public static final int HINT = 32;
    public static final int ID = 33;
    public static final int INCLUDE = 34;
    public static final int JAVASCRIPT = 35;
    public static final int JOIN = 36;
    public static final int LCURLY = 37;
    public static final int LEFT_JOIN = 38;
    public static final int LIKE = 39;
    public static final int LIMIT = 40;
    public static final int LONG = 41;
    public static final int LONG_SUM = 42;
    public static final int LPARAN = 43;
    public static final int LSQUARE = 44;
    public static final int MAX = 45;
    public static final int MIN = 46;
    public static final int NEWLINE = 47;
    public static final int NOT = 48;
    public static final int NUM = 49;
    public static final int OCTAL_ESC = 50;
    public static final int ON = 51;
    public static final int OPT_SEMI_COLON = 52;
    public static final int OR = 53;
    public static final int ORDER = 54;
    public static final int PERIOD = 55;
    public static final int RCURLY = 56;
    public static final int RIGHT_JOIN = 57;
    public static final int RPARAN = 58;
    public static final int RSQUARE = 59;
    public static final int SELECT = 60;
    public static final int SINGLE_QUOTE_STRING = 61;
    public static final int SORT = 62;
    public static final int STRING = 63;
    public static final int THEN = 64;
    public static final int UNICODE_ESC = 65;
    public static final int UNIQUE = 66;
    public static final int WHERE = 67;
    public static final int WHICH = 68;
    public static final int WS = 69;

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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:36:1: program returns [Program program] : (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? ;
    public final Program program() throws RecognitionException {
        Program program = null;

        Token j = null;
        Token a = null;
        QueryMeta s1 = null;
        QueryMeta s2 = null;

        program = new Program();
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:2: ( (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:4: (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )? ( WS )? ( OPT_SEMI_COLON )?
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:4: (s1= statement )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:5: s1= statement
                {
                    pushFollow(FOLLOW_statement_in_program42);
                    s1 = statement();
                    state._fsp--;

                }

                program.listOfQueries.add(s1);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:4: ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN )?
                int alt11 = 2;
                int LA11_0 = input.LA(1);
                if ((LA11_0 == WS)) {
                    int LA11_1 = input.LA(2);
                    if ((LA11_1 == JOIN || LA11_1 == LEFT_JOIN || LA11_1 == RIGHT_JOIN)) {
                        alt11 = 1;
                    }
                }
                switch (alt11) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:5: WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN
                    {
                        match(input, WS, FOLLOW_WS_in_program52);
                        j = input.LT(1);
                        if (input.LA(1) == JOIN || input.LA(1) == LEFT_JOIN || input.LA(1) == RIGHT_JOIN) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        program.joinTypes.add((j != null ? j.getText() : null).toUpperCase());
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:5: ( WS )?
                        int alt1 = 2;
                        int LA1_0 = input.LA(1);
                        if ((LA1_0 == WS)) {
                            alt1 = 1;
                        }
                        switch (alt1) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:5: WS
                            {
                                match(input, WS, FOLLOW_WS_in_program77);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_program80);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:16: ( WS )?
                        int alt2 = 2;
                        int LA2_0 = input.LA(1);
                        if ((LA2_0 == WS)) {
                            alt2 = 1;
                        }
                        switch (alt2) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:16: WS
                            {
                                match(input, WS, FOLLOW_WS_in_program82);
                            }
                            break;

                        }

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:20: (s2= statement )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:21: s2= statement
                        {
                            pushFollow(FOLLOW_statement_in_program88);
                            s2 = statement();
                            state._fsp--;

                        }

                        program.listOfQueries.add(s2);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:68: ( WS )?
                        int alt3 = 2;
                        int LA3_0 = input.LA(1);
                        if ((LA3_0 == WS)) {
                            alt3 = 1;
                        }
                        switch (alt3) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:68: WS
                            {
                                match(input, WS, FOLLOW_WS_in_program93);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_program96);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:79: ( WS )?
                        int alt4 = 2;
                        int LA4_0 = input.LA(1);
                        if ((LA4_0 == WS)) {
                            alt4 = 1;
                        }
                        switch (alt4) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:41:79: WS
                            {
                                match(input, WS, FOLLOW_WS_in_program98);
                            }
                            break;

                        }

                        match(input, ON, FOLLOW_ON_in_program101);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:5: ( WS )?
                        int alt5 = 2;
                        int LA5_0 = input.LA(1);
                        if ((LA5_0 == WS)) {
                            alt5 = 1;
                        }
                        switch (alt5) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:5: WS
                            {
                                match(input, WS, FOLLOW_WS_in_program108);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_program111);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:16: ( WS )?
                        int alt6 = 2;
                        int LA6_0 = input.LA(1);
                        if ((LA6_0 == WS)) {
                            alt6 = 1;
                        }
                        switch (alt6) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:16: WS
                            {
                                match(input, WS, FOLLOW_WS_in_program113);
                            }
                            break;

                        }

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:20: (a= ID )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:21: a= ID
                        {
                            a = (Token) match(input, ID, FOLLOW_ID_in_program119);
                            program.primaryJoinableHooks.add((a != null ? a.getText() : null));
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:73: ( ( WS )? ',' ( WS )? a= ID )*
                        loop9:
                        while (true) {
                            int alt9 = 2;
                            int LA9_0 = input.LA(1);
                            if ((LA9_0 == WS)) {
                                int LA9_1 = input.LA(2);
                                if ((LA9_1 == 72)) {
                                    alt9 = 1;
                                }

                            } else if ((LA9_0 == 72)) {
                                alt9 = 1;
                            }

                            switch (alt9) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:74: ( WS )? ',' ( WS )? a= ID
                                {
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:74: ( WS )?
                                    int alt7 = 2;
                                    int LA7_0 = input.LA(1);
                                    if ((LA7_0 == WS)) {
                                        alt7 = 1;
                                    }
                                    switch (alt7) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:74: WS
                                        {
                                            match(input, WS, FOLLOW_WS_in_program124);
                                        }
                                        break;

                                    }

                                    match(input, 72, FOLLOW_72_in_program127);
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:82: ( WS )?
                                    int alt8 = 2;
                                    int LA8_0 = input.LA(1);
                                    if ((LA8_0 == WS)) {
                                        alt8 = 1;
                                    }
                                    switch (alt8) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:82: WS
                                        {
                                            match(input, WS, FOLLOW_WS_in_program129);
                                        }
                                        break;

                                    }

                                    a = (Token) match(input, ID, FOLLOW_ID_in_program134);
                                    program.primaryJoinableHooks.add((a != null ? a.getText() : null));
                                }
                                break;

                                default:
                                    break loop9;
                            }
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:140: ( WS )?
                        int alt10 = 2;
                        int LA10_0 = input.LA(1);
                        if ((LA10_0 == WS)) {
                            alt10 = 1;
                        }
                        switch (alt10) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:42:140: WS
                            {
                                match(input, WS, FOLLOW_WS_in_program140);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_program143);
                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:44:4: ( WS )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);
                if ((LA12_0 == WS)) {
                    alt12 = 1;
                }
                switch (alt12) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:44:4: WS
                    {
                        match(input, WS, FOLLOW_WS_in_program162);
                    }
                    break;

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:44:8: ( OPT_SEMI_COLON )?
                int alt13 = 2;
                int LA13_0 = input.LA(1);
                if ((LA13_0 == OPT_SEMI_COLON)) {
                    alt13 = 1;
                }
                switch (alt13) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:44:8: OPT_SEMI_COLON
                    {
                        match(input, OPT_SEMI_COLON, FOLLOW_OPT_SEMI_COLON_in_program165);
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
	// $ANTLR end "program"

	// $ANTLR start "statement"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:1: statement returns [QueryMeta qMeta] : SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? ;
    public final QueryMeta statement() throws RecognitionException {
        QueryMeta qMeta = null;

        Token id = null;
        Token dir = null;
        Token l = null;
        Token s1 = null;
        Token s2 = null;
        Token s = null;
        Having h = null;
        PostAggItem p = null;

        qMeta = GroupByQueryMeta.promote(new QueryMeta());
        ((BaseAggQueryMeta) qMeta).aggregations = new ArrayList<>();
        qMeta.intervals = new ArrayList<>();

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:2: ( SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:4: SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
            {
                match(input, SELECT, FOLLOW_SELECT_in_statement191);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:7: ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )?
                int alt17 = 3;
                int LA17_0 = input.LA(1);
                if ((LA17_0 == WS)) {
                    int LA17_1 = input.LA(2);
                    if ((LA17_1 == 71)) {
                        alt17 = 2;
                    } else if ((LA17_1 == COUNT || LA17_1 == DOUBLE_SUM || LA17_1 == ID || LA17_1 == JAVASCRIPT || LA17_1 == LONG_SUM || (LA17_1 >= MAX && LA17_1 <= MIN) || LA17_1 == UNIQUE)) {
                        alt17 = 1;
                    }
                }
                switch (alt17) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:56:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:9: WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
                        {
                            match(input, WS, FOLLOW_WS_in_statement219);
                            pushFollow(FOLLOW_selectItems_in_statement221);
                            selectItems(qMeta);
                            state._fsp--;

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:31: ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
                            loop16:
                            while (true) {
                                int alt16 = 2;
                                int LA16_0 = input.LA(1);
                                if ((LA16_0 == WS)) {
                                    int LA16_1 = input.LA(2);
                                    if ((LA16_1 == 72)) {
                                        alt16 = 1;
                                    }

                                } else if ((LA16_0 == 72)) {
                                    alt16 = 1;
                                }

                                switch (alt16) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:32: ( WS )? ',' ( WS )? selectItems[qMeta]
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:32: ( WS )?
                                        int alt14 = 2;
                                        int LA14_0 = input.LA(1);
                                        if ((LA14_0 == WS)) {
                                            alt14 = 1;
                                        }
                                        switch (alt14) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:32: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_statement225);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_statement228);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:40: ( WS )?
                                        int alt15 = 2;
                                        int LA15_0 = input.LA(1);
                                        if ((LA15_0 == WS)) {
                                            alt15 = 1;
                                        }
                                        switch (alt15) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:57:40: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_statement230);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_selectItems_in_statement233);
                                        selectItems(qMeta);
                                        state._fsp--;

                                    }
                                    break;

                                    default:
                                        break loop16;
                                }
                            }

                        }

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:8: ( WS '*' )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:8: ( WS '*' )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:60:9: WS '*'
                        {
                            match(input, WS, FOLLOW_WS_in_statement264);
                            match(input, 71, FOLLOW_71_in_statement266);
                        }

                    }
                    break;

                }

                match(input, WS, FOLLOW_WS_in_statement281);
                match(input, FROM, FOLLOW_FROM_in_statement283);
                match(input, WS, FOLLOW_WS_in_statement285);
                id = (Token) match(input, ID, FOLLOW_ID_in_statement289);

                qMeta.dataSource = (id != null ? id.getText() : null);
                if (((BaseAggQueryMeta) qMeta).aggregations.isEmpty()) {
                    qMeta = SelectQueryMeta.promote(qMeta);
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:69:2: ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
                int alt42 = 2;
                int LA42_0 = input.LA(1);
                if ((LA42_0 == WS)) {
                    int LA42_1 = input.LA(2);
                    if ((LA42_1 == WHERE)) {
                        alt42 = 1;
                    }
                }
                switch (alt42) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:70:4: WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
                    {
                        match(input, WS, FOLLOW_WS_in_statement305);
                        match(input, WHERE, FOLLOW_WHERE_in_statement307);
                        match(input, WS, FOLLOW_WS_in_statement309);
                        pushFollow(FOLLOW_whereClause_in_statement311);
                        whereClause(qMeta);
                        state._fsp--;

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:71:4: ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:72:5: ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )?
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:72:5: ( WS BREAK WS BY WS granularityClause[qMeta] )?
                            int alt18 = 2;
                            int LA18_0 = input.LA(1);
                            if ((LA18_0 == WS)) {
                                int LA18_1 = input.LA(2);
                                if ((LA18_1 == BREAK)) {
                                    alt18 = 1;
                                }
                            }
                            switch (alt18) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:72:6: WS BREAK WS BY WS granularityClause[qMeta]
                                {
                                    match(input, WS, FOLLOW_WS_in_statement328);
                                    match(input, BREAK, FOLLOW_BREAK_in_statement330);
                                    match(input, WS, FOLLOW_WS_in_statement332);
                                    match(input, BY, FOLLOW_BY_in_statement334);
                                    match(input, WS, FOLLOW_WS_in_statement336);
                                    pushFollow(FOLLOW_granularityClause_in_statement338);
                                    granularityClause(qMeta);
                                    state._fsp--;

                                }
                                break;

                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:5: ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )?
                            int alt23 = 2;
                            int LA23_0 = input.LA(1);
                            if ((LA23_0 == WS)) {
                                int LA23_1 = input.LA(2);
                                if ((LA23_1 == GROUP)) {
                                    alt23 = 1;
                                }
                            }
                            switch (alt23) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:73:6: WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )?
                                {
                                    match(input, WS, FOLLOW_WS_in_statement349);
                                    match(input, GROUP, FOLLOW_GROUP_in_statement351);
                                    match(input, WS, FOLLOW_WS_in_statement353);
                                    match(input, BY, FOLLOW_BY_in_statement355);
                                    match(input, WS, FOLLOW_WS_in_statement357);

                                    qMeta = GroupByQueryMeta.promote(qMeta);
                                    if (((GroupByQueryMeta) qMeta).fetchDimensions == null) {
                                        System.err.println("No dimensions !! ");
                                    }

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:10: (id= ID ( ( WS )? ',' ( WS )? id= ID )* )
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:11: id= ID ( ( WS )? ',' ( WS )? id= ID )*
                                    {
                                        id = (Token) match(input, ID, FOLLOW_ID_in_statement383);

                                        if (!((GroupByQueryMeta) qMeta).checkDimOrAlias((id != null ? id.getText() : null))) {
                                            System.err.println("Dimension/Alias " + (id != null ? id.getText() : null) + " not valid..");
                                        }

                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:86:14: ( ( WS )? ',' ( WS )? id= ID )*
                                        loop21:
                                        while (true) {
                                            int alt21 = 2;
                                            int LA21_0 = input.LA(1);
                                            if ((LA21_0 == WS)) {
                                                int LA21_1 = input.LA(2);
                                                if ((LA21_1 == 72)) {
                                                    alt21 = 1;
                                                }

                                            } else if ((LA21_0 == 72)) {
                                                alt21 = 1;
                                            }

                                            switch (alt21) {
                                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:86:15: ( WS )? ',' ( WS )? id= ID
                                                {
                                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:86:15: ( WS )?
                                                    int alt19 = 2;
                                                    int LA19_0 = input.LA(1);
                                                    if ((LA19_0 == WS)) {
                                                        alt19 = 1;
                                                    }
                                                    switch (alt19) {
                                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:86:15: WS
                                                        {
                                                            match(input, WS, FOLLOW_WS_in_statement415);
                                                        }
                                                        break;

                                                    }

                                                    match(input, 72, FOLLOW_72_in_statement418);
                                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:86:23: ( WS )?
                                                    int alt20 = 2;
                                                    int LA20_0 = input.LA(1);
                                                    if ((LA20_0 == WS)) {
                                                        alt20 = 1;
                                                    }
                                                    switch (alt20) {
                                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:86:23: WS
                                                        {
                                                            match(input, WS, FOLLOW_WS_in_statement420);
                                                        }
                                                        break;

                                                    }

                                                    id = (Token) match(input, ID, FOLLOW_ID_in_statement425);

                                                    if (!((GroupByQueryMeta) qMeta).checkDimOrAlias((id != null ? id.getText() : null))) {
                                                        System.err.println("Dimension/Alias " + (id != null ? id.getText() : null) + " not valid..");
                                                    }

                                                }
                                                break;

                                                default:
                                                    break loop21;
                                            }
                                        }

                                    }

                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:94:10: ( WS HAVING WS h= havingClause )?
                                    int alt22 = 2;
                                    int LA22_0 = input.LA(1);
                                    if ((LA22_0 == WS)) {
                                        int LA22_1 = input.LA(2);
                                        if ((LA22_1 == HAVING)) {
                                            alt22 = 1;
                                        }
                                    }
                                    switch (alt22) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:94:11: WS HAVING WS h= havingClause
                                        {
                                            match(input, WS, FOLLOW_WS_in_statement482);
                                            match(input, HAVING, FOLLOW_HAVING_in_statement484);
                                            match(input, WS, FOLLOW_WS_in_statement486);
                                            pushFollow(FOLLOW_havingClause_in_statement490);
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
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:5: ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )?
                            int alt25 = 2;
                            int LA25_0 = input.LA(1);
                            if ((LA25_0 == WS)) {
                                int LA25_1 = input.LA(2);
                                if ((LA25_1 == ORDER)) {
                                    alt25 = 1;
                                }
                            }
                            switch (alt25) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:6: WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )?
                                {
                                    match(input, WS, FOLLOW_WS_in_statement534);
                                    match(input, ORDER, FOLLOW_ORDER_in_statement536);
                                    match(input, WS, FOLLOW_WS_in_statement538);
                                    match(input, BY, FOLLOW_BY_in_statement540);
                                    match(input, WS, FOLLOW_WS_in_statement542);
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:24: (id= ID )
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:98:25: id= ID
                                    {
                                        id = (Token) match(input, ID, FOLLOW_ID_in_statement547);
                                    }

                                    if (((PlainDimQueryMeta) qMeta).fetchDimensions.size() != 1) {
                                        ((GroupByQueryMeta) qMeta).limitSpec = new LimitSpec();

                                    } else {// If fetchDimensions = 1 then TopN is more optimal.
                                        qMeta = TopNQueryMeta.promote(qMeta);
                                        ((TopNQueryMeta) qMeta).metric = (id != null ? id.getText() : null);
                                    }

                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:9: ( WS dir= ( ASC | DESC ) )?
                                    int alt24 = 2;
                                    int LA24_0 = input.LA(1);
                                    if ((LA24_0 == WS)) {
                                        int LA24_1 = input.LA(2);
                                        if ((LA24_1 == ASC || LA24_1 == DESC)) {
                                            alt24 = 1;
                                        }
                                    }
                                    switch (alt24) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:109:10: WS dir= ( ASC | DESC )
                                        {
                                            match(input, WS, FOLLOW_WS_in_statement580);
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

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:130:5: ( WS LIMIT WS (l= LONG ) )?
                            int alt26 = 2;
                            int LA26_0 = input.LA(1);
                            if ((LA26_0 == WS)) {
                                int LA26_1 = input.LA(2);
                                if ((LA26_1 == LIMIT)) {
                                    alt26 = 1;
                                }
                            }
                            switch (alt26) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:131:6: WS LIMIT WS (l= LONG )
                                {
                                    match(input, WS, FOLLOW_WS_in_statement634);
                                    match(input, LIMIT, FOLLOW_LIMIT_in_statement636);
                                    match(input, WS, FOLLOW_WS_in_statement638);
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:131:18: (l= LONG )
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:131:19: l= LONG
                                    {
                                        l = (Token) match(input, LONG, FOLLOW_LONG_in_statement643);
                                    }

                                    if (((PlainDimQueryMeta) qMeta).fetchDimensions.size() != 1) {
                                        ((GroupByQueryMeta) qMeta).limitSpec.limit = Long.valueOf((l != null ? l.getText() : null));
                                    } else if (qMeta instanceof TopNQueryMeta) {
                                        ((TopNQueryMeta) qMeta).threshold = Integer.valueOf((l != null ? l.getText() : null));
                                    } else if (qMeta instanceof SelectQueryMeta) {
                                        ((SelectQueryMeta) qMeta).pagingSpec.threshold = Integer.valueOf((l != null ? l.getText() : null));
                                    }

                                }
                                break;

                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:7: ( WS THEN WS p= postAggItem )?
                            int alt27 = 2;
                            int LA27_0 = input.LA(1);
                            if ((LA27_0 == WS)) {
                                int LA27_1 = input.LA(2);
                                if ((LA27_1 == THEN)) {
                                    alt27 = 1;
                                }
                            }
                            switch (alt27) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:8: WS THEN WS p= postAggItem
                                {
                                    match(input, WS, FOLLOW_WS_in_statement681);
                                    match(input, THEN, FOLLOW_THEN_in_statement683);
                                    match(input, WS, FOLLOW_WS_in_statement685);
                                    pushFollow(FOLLOW_postAggItem_in_statement689);
                                    p = postAggItem();
                                    state._fsp--;

                                    QueryUtils.setPostAggregation(qMeta, p);
                                }
                                break;

                            }

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:4: ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )?
                        int alt37 = 2;
                        int LA37_0 = input.LA(1);
                        if ((LA37_0 == WS)) {
                            int LA37_1 = input.LA(2);
                            if ((LA37_1 == WHICH)) {
                                alt37 = 1;
                            }
                        }
                        switch (alt37) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:5: WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN
                            {
                                match(input, WS, FOLLOW_WS_in_statement704);
                                match(input, WHICH, FOLLOW_WHICH_in_statement706);
                                match(input, WS, FOLLOW_WS_in_statement708);
                                match(input, CONTAINS, FOLLOW_CONTAINS_in_statement710);
                                qMeta = SearchQueryMeta.promote(qMeta);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:68: ( WS )?
                                int alt28 = 2;
                                int LA28_0 = input.LA(1);
                                if ((LA28_0 == WS)) {
                                    alt28 = 1;
                                }
                                switch (alt28) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:68: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement714);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_statement717);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:79: ( WS )?
                                int alt29 = 2;
                                int LA29_0 = input.LA(1);
                                if ((LA29_0 == WS)) {
                                    alt29 = 1;
                                }
                                switch (alt29) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:79: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement719);
                                    }
                                    break;

                                }

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:83: (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* )
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:84: s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
                                {
                                    s1 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement725);
                                    ((SearchQueryMeta) qMeta).type = "insensitive_contains";
                                    ((SearchQueryMeta) qMeta).addValue((s1 != null ? s1.getText() : null));
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:208: ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
                                    loop32:
                                    while (true) {
                                        int alt32 = 2;
                                        int LA32_0 = input.LA(1);
                                        if ((LA32_0 == WS)) {
                                            int LA32_1 = input.LA(2);
                                            if ((LA32_1 == 72)) {
                                                alt32 = 1;
                                            }

                                        } else if ((LA32_0 == 72)) {
                                            alt32 = 1;
                                        }

                                        switch (alt32) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:209: ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING
                                            {
                                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:209: ( WS )?
                                                int alt30 = 2;
                                                int LA30_0 = input.LA(1);
                                                if ((LA30_0 == WS)) {
                                                    alt30 = 1;
                                                }
                                                switch (alt30) {
                                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:209: WS
                                                    {
                                                        match(input, WS, FOLLOW_WS_in_statement729);
                                                    }
                                                    break;

                                                }

                                                match(input, 72, FOLLOW_72_in_statement732);
                                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:217: ( WS )?
                                                int alt31 = 2;
                                                int LA31_0 = input.LA(1);
                                                if ((LA31_0 == WS)) {
                                                    alt31 = 1;
                                                }
                                                switch (alt31) {
                                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:217: WS
                                                    {
                                                        match(input, WS, FOLLOW_WS_in_statement734);
                                                    }
                                                    break;

                                                }

                                                s2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement739);
                                                ((SearchQueryMeta) qMeta).type = "fragment";
                                                ((SearchQueryMeta) qMeta).addValue((s2 != null ? s2.getText() : null));
                                            }
                                            break;

                                            default:
                                                break loop32;
                                        }
                                    }

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:337: ( WS )?
                                int alt33 = 2;
                                int LA33_0 = input.LA(1);
                                if ((LA33_0 == WS)) {
                                    alt33 = 1;
                                }
                                switch (alt33) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:337: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement746);
                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_statement749);
                                match(input, WS, FOLLOW_WS_in_statement755);
                                match(input, SORT, FOLLOW_SORT_in_statement757);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:13: ( WS )?
                                int alt34 = 2;
                                int LA34_0 = input.LA(1);
                                if ((LA34_0 == WS)) {
                                    alt34 = 1;
                                }
                                switch (alt34) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:13: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement759);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_statement762);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:24: ( WS )?
                                int alt35 = 2;
                                int LA35_0 = input.LA(1);
                                if ((LA35_0 == WS)) {
                                    alt35 = 1;
                                }
                                switch (alt35) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:24: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement764);
                                    }
                                    break;

                                }

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:28: (s= SINGLE_QUOTE_STRING )
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:29: s= SINGLE_QUOTE_STRING
                                {
                                    s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement770);
                                }

                                ((SearchQueryMeta) qMeta).setSort((s != null ? s.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:97: ( WS )?
                                int alt36 = 2;
                                int LA36_0 = input.LA(1);
                                if ((LA36_0 == WS)) {
                                    alt36 = 1;
                                }
                                switch (alt36) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:97: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement775);
                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_statement778);
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:148:4: ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
                        int alt41 = 2;
                        int LA41_0 = input.LA(1);
                        if ((LA41_0 == WS)) {
                            int LA41_1 = input.LA(2);
                            if ((LA41_1 == HINT)) {
                                alt41 = 1;
                            }
                        }
                        switch (alt41) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:148:5: WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN
                            {
                                match(input, WS, FOLLOW_WS_in_statement790);
                                match(input, HINT, FOLLOW_HINT_in_statement792);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:148:13: ( WS )?
                                int alt38 = 2;
                                int LA38_0 = input.LA(1);
                                if ((LA38_0 == WS)) {
                                    alt38 = 1;
                                }
                                switch (alt38) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:148:13: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement794);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_statement797);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:148:24: ( WS )?
                                int alt39 = 2;
                                int LA39_0 = input.LA(1);
                                if ((LA39_0 == WS)) {
                                    alt39 = 1;
                                }
                                switch (alt39) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:148:24: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement799);
                                    }
                                    break;

                                }

                                s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement804);
                                qMeta = HintProcessor.process(qMeta, (s != null ? s.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:148:99: ( WS )?
                                int alt40 = 2;
                                int LA40_0 = input.LA(1);
                                if ((LA40_0 == WS)) {
                                    alt40 = 1;
                                }
                                switch (alt40) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:148:99: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement808);
                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_statement811);
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
	// $ANTLR end "statement"

	// $ANTLR start "selectItems"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:157:1: selectItems[QueryMeta qMeta] : (sI1= aggItemInSelect | simpleDim[qMeta] );
    public final void selectItems(QueryMeta qMeta) throws RecognitionException {
        AggItem sI1 = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:2: (sI1= aggItemInSelect | simpleDim[qMeta] )
            int alt43 = 2;
            int LA43_0 = input.LA(1);
            if ((LA43_0 == COUNT || LA43_0 == DOUBLE_SUM || LA43_0 == JAVASCRIPT || LA43_0 == LONG_SUM || (LA43_0 >= MAX && LA43_0 <= MIN) || LA43_0 == UNIQUE)) {
                alt43 = 1;
            } else if ((LA43_0 == ID)) {
                alt43 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 43, 0, input);
                throw nvae;
            }

            switch (alt43) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:5: sI1= aggItemInSelect
                {
                    pushFollow(FOLLOW_aggItemInSelect_in_selectItems842);
                    sI1 = aggItemInSelect();
                    state._fsp--;

                    ((BaseAggQueryMeta) qMeta).aggregations.add(sI1);
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:159:5: simpleDim[qMeta]
                {
                    pushFollow(FOLLOW_simpleDim_in_selectItems850);
                    simpleDim(qMeta);
                    state._fsp--;

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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:162:1: simpleDim[QueryMeta qMeta] : (a= ID ( WS AS WS b= ID )? ) ;
    public final void simpleDim(QueryMeta qMeta) throws RecognitionException {
        Token a = null;
        Token b = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:2: ( (a= ID ( WS AS WS b= ID )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:4: (a= ID ( WS AS WS b= ID )? )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:4: (a= ID ( WS AS WS b= ID )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:5: a= ID ( WS AS WS b= ID )?
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_simpleDim866);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:10: ( WS AS WS b= ID )?
                    int alt44 = 2;
                    int LA44_0 = input.LA(1);
                    if ((LA44_0 == WS)) {
                        int LA44_1 = input.LA(2);
                        if ((LA44_1 == AS)) {
                            alt44 = 1;
                        }
                    }
                    switch (alt44) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:11: WS AS WS b= ID
                        {
                            match(input, WS, FOLLOW_WS_in_simpleDim869);
                            match(input, AS, FOLLOW_AS_in_simpleDim871);
                            match(input, WS, FOLLOW_WS_in_simpleDim873);
                            b = (Token) match(input, ID, FOLLOW_ID_in_simpleDim877);
                        }
                        break;

                    }

                    if (b != null) {
                        ((PlainDimQueryMeta) qMeta).fetchDimensions.put((a != null ? a.getText() : null), (b != null ? b.getText() : null));
                    } else {
                        ((PlainDimQueryMeta) qMeta).fetchDimensions.put((a != null ? a.getText() : null), null);
                    }

                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "simpleDim"

	// $ANTLR start "whereClause"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:174:1: whereClause[QueryMeta qMeta] : intervalClause[qMeta] ( WS AND WS f= grandFilter )? ;
    public final void whereClause(QueryMeta qMeta) throws RecognitionException {
        Filter f = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:2: ( intervalClause[qMeta] ( WS AND WS f= grandFilter )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:3: intervalClause[qMeta] ( WS AND WS f= grandFilter )?
            {
                pushFollow(FOLLOW_intervalClause_in_whereClause898);
                intervalClause(qMeta);
                state._fsp--;

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:25: ( WS AND WS f= grandFilter )?
                int alt45 = 2;
                int LA45_0 = input.LA(1);
                if ((LA45_0 == WS)) {
                    int LA45_1 = input.LA(2);
                    if ((LA45_1 == AND)) {
                        alt45 = 1;
                    }
                }
                switch (alt45) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:26: WS AND WS f= grandFilter
                    {
                        match(input, WS, FOLLOW_WS_in_whereClause902);
                        match(input, AND, FOLLOW_AND_in_whereClause904);
                        match(input, WS, FOLLOW_WS_in_whereClause906);
                        pushFollow(FOLLOW_grandFilter_in_whereClause910);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:179:1: intervalClause[QueryMeta qMeta] : 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) ;
    public final void intervalClause(QueryMeta qMeta) throws RecognitionException {
        Token st2 = null;
        Token et2 = null;
        ParserRuleReturnScope st = null;
        ParserRuleReturnScope et = null;
        Pair<String> p1 = null;
        Pair<String> p2 = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:2: ( 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:180:4: 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
            {
                match(input, 73, FOLLOW_73_in_intervalClause929);
                match(input, WS, FOLLOW_WS_in_intervalClause931);
                match(input, BETWEEN, FOLLOW_BETWEEN_in_intervalClause933);
                match(input, WS, FOLLOW_WS_in_intervalClause935);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:181:2: ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
                int alt53 = 2;
                int LA53_0 = input.LA(1);
                if (((LA53_0 >= DATE && LA53_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ) || LA53_0 == SINGLE_QUOTE_STRING)) {
                    alt53 = 1;
                } else if ((LA53_0 == LPARAN)) {
                    alt53 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 53, 0, input);
                    throw nvae;
                }

                switch (alt53) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:182:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:182:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
                        {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:7: (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING )
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:7: (st= isoTime |st2= SINGLE_QUOTE_STRING )
                                int alt46 = 2;
                                int LA46_0 = input.LA(1);
                                if (((LA46_0 >= DATE && LA46_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ))) {
                                    alt46 = 1;
                                } else if ((LA46_0 == SINGLE_QUOTE_STRING)) {
                                    alt46 = 2;
                                } else {
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 46, 0, input);
                                    throw nvae;
                                }

                                switch (alt46) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:8: st= isoTime
                                    {
                                        pushFollow(FOLLOW_isoTime_in_intervalClause955);
                                        st = isoTime();
                                        state._fsp--;

                                    }
                                    break;
                                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:22: st2= SINGLE_QUOTE_STRING
                                    {
                                        st2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause962);
                                    }
                                    break;

                                }

                                match(input, WS, FOLLOW_WS_in_intervalClause966);
                                match(input, AND, FOLLOW_AND_in_intervalClause968);
                                match(input, WS, FOLLOW_WS_in_intervalClause970);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:58: (et= isoTime |et2= SINGLE_QUOTE_STRING )
                                int alt47 = 2;
                                int LA47_0 = input.LA(1);
                                if (((LA47_0 >= DATE && LA47_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ))) {
                                    alt47 = 1;
                                } else if ((LA47_0 == SINGLE_QUOTE_STRING)) {
                                    alt47 = 2;
                                } else {
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 47, 0, input);
                                    throw nvae;
                                }

                                switch (alt47) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:59: et= isoTime
                                    {
                                        pushFollow(FOLLOW_isoTime_in_intervalClause975);
                                        et = isoTime();
                                        state._fsp--;

                                    }
                                    break;
                                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:183:73: et2= SINGLE_QUOTE_STRING
                                    {
                                        et2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause982);
                                    }
                                    break;

                                }

                            }

                            if (st2 != null) {
                                if (et2 != null) {
                                    qMeta.intervals.add(new Interval((st2 != null ? st2.getText() : null), (et2 != null ? et2.getText() : null)));
                                } else {
                                    qMeta.intervals.add(new Interval((st2 != null ? st2.getText() : null), (et != null ? input.toString(et.start, et.stop) : null)));
                                }
                            } else {
                                if (et2 != null) {
                                    qMeta.intervals.add(new Interval((st != null ? input.toString(st.start, st.stop) : null), (et2 != null ? et2.getText() : null)));
                                } else {
                                    qMeta.intervals.add(new Interval((st != null ? input.toString(st.start, st.stop) : null), (et != null ? input.toString(et.start, et.stop) : null)));
                                }
                            }

                        }

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:200:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:200:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:200:5: LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN
                        {
                            match(input, LPARAN, FOLLOW_LPARAN_in_intervalClause1007);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:200:12: ( WS )?
                            int alt48 = 2;
                            int LA48_0 = input.LA(1);
                            if ((LA48_0 == WS)) {
                                alt48 = 1;
                            }
                            switch (alt48) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:200:12: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_intervalClause1009);
                                }
                                break;

                            }

                            pushFollow(FOLLOW_pairString_in_intervalClause1014);
                            p1 = pairString();
                            state._fsp--;

                            qMeta.intervals.add(new Interval(p1.a, p1.b));
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:7: ( ( WS )? ',' ( WS )? p2= pairString )*
                            loop51:
                            while (true) {
                                int alt51 = 2;
                                int LA51_0 = input.LA(1);
                                if ((LA51_0 == WS)) {
                                    int LA51_1 = input.LA(2);
                                    if ((LA51_1 == 72)) {
                                        alt51 = 1;
                                    }

                                } else if ((LA51_0 == 72)) {
                                    alt51 = 1;
                                }

                                switch (alt51) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:8: ( WS )? ',' ( WS )? p2= pairString
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:8: ( WS )?
                                        int alt49 = 2;
                                        int LA49_0 = input.LA(1);
                                        if ((LA49_0 == WS)) {
                                            alt49 = 1;
                                        }
                                        switch (alt49) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:8: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_intervalClause1026);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_intervalClause1029);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:16: ( WS )?
                                        int alt50 = 2;
                                        int LA50_0 = input.LA(1);
                                        if ((LA50_0 == WS)) {
                                            alt50 = 1;
                                        }
                                        switch (alt50) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:16: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_intervalClause1031);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_pairString_in_intervalClause1036);
                                        p2 = pairString();
                                        state._fsp--;

                                        qMeta.intervals.add(new Interval(p2.a, p2.b));
                                    }
                                    break;

                                    default:
                                        break loop51;
                                }
                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:85: ( WS )?
                            int alt52 = 2;
                            int LA52_0 = input.LA(1);
                            if ((LA52_0 == WS)) {
                                alt52 = 1;
                            }
                            switch (alt52) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:85: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_intervalClause1042);
                                }
                                break;

                            }

                            match(input, RPARAN, FOLLOW_RPARAN_in_intervalClause1045);
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
    }
	// $ANTLR end "intervalClause"

	// $ANTLR start "getEquals"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:206:1: getEquals returns [EqualsToHolder holder] : (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) ;
    public final EqualsToHolder getEquals() throws RecognitionException {
        EqualsToHolder holder = null;

        Token a = null;
        Token b = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:2: ( (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:5: a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG )
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_getEquals1068);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:10: ( WS )?
                    int alt54 = 2;
                    int LA54_0 = input.LA(1);
                    if ((LA54_0 == WS)) {
                        alt54 = 1;
                    }
                    switch (alt54) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:10: WS
                        {
                            match(input, WS, FOLLOW_WS_in_getEquals1070);
                        }
                        break;

                    }

                    match(input, EQUALS, FOLLOW_EQUALS_in_getEquals1073);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:21: ( WS )?
                    int alt55 = 2;
                    int LA55_0 = input.LA(1);
                    if ((LA55_0 == WS)) {
                        alt55 = 1;
                    }
                    switch (alt55) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:21: WS
                        {
                            match(input, WS, FOLLOW_WS_in_getEquals1075);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:1: granularityClause[QueryMeta qMeta] : ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) ) );
    public final void granularityClause(QueryMeta qMeta) throws RecognitionException {
        Token s = null;
        Token dur = null;
        Token orig = null;
        Token per = null;
        Token tz = null;

        qMeta.granularity = new Granularity();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:2: ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) ) )
            int alt78 = 2;
            int LA78_0 = input.LA(1);
            if ((LA78_0 == SINGLE_QUOTE_STRING)) {
                alt78 = 1;
            } else if ((LA78_0 == DURATION || LA78_0 == PERIOD)) {
                alt78 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 78, 0, input);
                throw nvae;
            }

            switch (alt78) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:3: ( (s= SINGLE_QUOTE_STRING ) )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:3: ( (s= SINGLE_QUOTE_STRING ) )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:4: (s= SINGLE_QUOTE_STRING )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:4: (s= SINGLE_QUOTE_STRING )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:5: s= SINGLE_QUOTE_STRING
                        {
                            s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1119);
                        }

                        qMeta.granularity = new Granularity((s != null ? s.getText() : null));
                    }

                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:216:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:216:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) )
                    int alt77 = 2;
                    int LA77_0 = input.LA(1);
                    if ((LA77_0 == DURATION)) {
                        alt77 = 1;
                    } else if ((LA77_0 == PERIOD)) {
                        alt77 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 77, 0, input);
                        throw nvae;
                    }

                    switch (alt77) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                        {
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:7: DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN
                            {
                                match(input, DURATION, FOLLOW_DURATION_in_granularityClause1143);
                                qMeta.granularity.type = "duration";
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:55: ( WS )?
                                int alt56 = 2;
                                int LA56_0 = input.LA(1);
                                if ((LA56_0 == WS)) {
                                    alt56 = 1;
                                }
                                switch (alt56) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:55: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1147);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_granularityClause1150);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:66: ( WS )?
                                int alt57 = 2;
                                int LA57_0 = input.LA(1);
                                if ((LA57_0 == WS)) {
                                    alt57 = 1;
                                }
                                switch (alt57) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:66: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1152);
                                    }
                                    break;

                                }

                                dur = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1157);
                                qMeta.granularity.setDuration((dur != null ? dur.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:138: ( WS )?
                                int alt58 = 2;
                                int LA58_0 = input.LA(1);
                                if ((LA58_0 == WS)) {
                                    alt58 = 1;
                                }
                                switch (alt58) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:138: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1161);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:142: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
                                int alt60 = 2;
                                int LA60_0 = input.LA(1);
                                if ((LA60_0 == 72)) {
                                    int LA60_1 = input.LA(2);
                                    if ((LA60_1 == WS)) {
                                        int LA60_4 = input.LA(3);
                                        if ((LA60_4 == SINGLE_QUOTE_STRING)) {
                                            alt60 = 1;
                                        }
                                    } else if ((LA60_1 == SINGLE_QUOTE_STRING)) {
                                        alt60 = 1;
                                    }
                                }
                                switch (alt60) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:143: ',' ( WS )? orig= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 72, FOLLOW_72_in_granularityClause1165);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:147: ( WS )?
                                        int alt59 = 2;
                                        int LA59_0 = input.LA(1);
                                        if ((LA59_0 == WS)) {
                                            alt59 = 1;
                                        }
                                        switch (alt59) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:147: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1167);
                                            }
                                            break;

                                        }

                                        orig = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1172);
                                        qMeta.granularity.setOrigin((orig != null ? orig.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:221: ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )?
                                int alt64 = 2;
                                int LA64_0 = input.LA(1);
                                if ((LA64_0 == WS || LA64_0 == 72)) {
                                    alt64 = 1;
                                }
                                switch (alt64) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:222: ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )?
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:222: ( WS )?
                                        int alt61 = 2;
                                        int LA61_0 = input.LA(1);
                                        if ((LA61_0 == WS)) {
                                            alt61 = 1;
                                        }
                                        switch (alt61) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:222: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1179);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_granularityClause1182);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:230: ( WS )?
                                        int alt62 = 2;
                                        int LA62_0 = input.LA(1);
                                        if ((LA62_0 == WS)) {
                                            int LA62_1 = input.LA(2);
                                            if ((LA62_1 == WS)) {
                                                alt62 = 1;
                                            }
                                        }
                                        switch (alt62) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:230: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1184);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_granularityInclude_in_granularityClause1187);
                                        granularityInclude(qMeta);
                                        state._fsp--;

                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:260: ( WS )?
                                        int alt63 = 2;
                                        int LA63_0 = input.LA(1);
                                        if ((LA63_0 == WS)) {
                                            alt63 = 1;
                                        }
                                        switch (alt63) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:260: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1190);
                                            }
                                            break;

                                        }

                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_granularityClause1195);
                            }

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                        {
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:7: PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN
                            {
                                match(input, PERIOD, FOLLOW_PERIOD_in_granularityClause1214);
                                qMeta.granularity.type = "period";
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:51: ( WS )?
                                int alt65 = 2;
                                int LA65_0 = input.LA(1);
                                if ((LA65_0 == WS)) {
                                    alt65 = 1;
                                }
                                switch (alt65) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:51: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1218);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_granularityClause1221);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:62: ( WS )?
                                int alt66 = 2;
                                int LA66_0 = input.LA(1);
                                if ((LA66_0 == WS)) {
                                    alt66 = 1;
                                }
                                switch (alt66) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:62: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1223);
                                    }
                                    break;

                                }

                                per = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1228);
                                qMeta.granularity.setPeriod((per != null ? per.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:132: ( WS )?
                                int alt67 = 2;
                                int LA67_0 = input.LA(1);
                                if ((LA67_0 == WS)) {
                                    alt67 = 1;
                                }
                                switch (alt67) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:132: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1232);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:136: ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )?
                                int alt69 = 2;
                                int LA69_0 = input.LA(1);
                                if ((LA69_0 == 72)) {
                                    int LA69_1 = input.LA(2);
                                    if ((LA69_1 == WS)) {
                                        int LA69_4 = input.LA(3);
                                        if ((LA69_4 == SINGLE_QUOTE_STRING)) {
                                            alt69 = 1;
                                        }
                                    } else if ((LA69_1 == SINGLE_QUOTE_STRING)) {
                                        alt69 = 1;
                                    }
                                }
                                switch (alt69) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:137: ',' ( WS )? tz= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 72, FOLLOW_72_in_granularityClause1236);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:141: ( WS )?
                                        int alt68 = 2;
                                        int LA68_0 = input.LA(1);
                                        if ((LA68_0 == WS)) {
                                            alt68 = 1;
                                        }
                                        switch (alt68) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:141: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1238);
                                            }
                                            break;

                                        }

                                        tz = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1243);
                                        qMeta.granularity.setTimeZone((tz != null ? tz.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:213: ( WS )?
                                int alt70 = 2;
                                int LA70_0 = input.LA(1);
                                if ((LA70_0 == WS)) {
                                    alt70 = 1;
                                }
                                switch (alt70) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:213: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1249);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:217: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
                                int alt72 = 2;
                                int LA72_0 = input.LA(1);
                                if ((LA72_0 == 72)) {
                                    int LA72_1 = input.LA(2);
                                    if ((LA72_1 == WS)) {
                                        int LA72_4 = input.LA(3);
                                        if ((LA72_4 == SINGLE_QUOTE_STRING)) {
                                            alt72 = 1;
                                        }
                                    } else if ((LA72_1 == SINGLE_QUOTE_STRING)) {
                                        alt72 = 1;
                                    }
                                }
                                switch (alt72) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:218: ',' ( WS )? orig= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 72, FOLLOW_72_in_granularityClause1253);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:222: ( WS )?
                                        int alt71 = 2;
                                        int LA71_0 = input.LA(1);
                                        if ((LA71_0 == WS)) {
                                            alt71 = 1;
                                        }
                                        switch (alt71) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:222: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1255);
                                            }
                                            break;

                                        }

                                        orig = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1260);
                                        qMeta.granularity.setOrigin((orig != null ? orig.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:296: ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )?
                                int alt76 = 2;
                                int LA76_0 = input.LA(1);
                                if ((LA76_0 == WS || LA76_0 == 72)) {
                                    alt76 = 1;
                                }
                                switch (alt76) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:297: ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )?
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:297: ( WS )?
                                        int alt73 = 2;
                                        int LA73_0 = input.LA(1);
                                        if ((LA73_0 == WS)) {
                                            alt73 = 1;
                                        }
                                        switch (alt73) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:297: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1267);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_granularityClause1270);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:305: ( WS )?
                                        int alt74 = 2;
                                        int LA74_0 = input.LA(1);
                                        if ((LA74_0 == WS)) {
                                            int LA74_1 = input.LA(2);
                                            if ((LA74_1 == WS)) {
                                                alt74 = 1;
                                            }
                                        }
                                        switch (alt74) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:305: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1272);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_granularityInclude_in_granularityClause1275);
                                        granularityInclude(qMeta);
                                        state._fsp--;

                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:335: ( WS )?
                                        int alt75 = 2;
                                        int LA75_0 = input.LA(1);
                                        if ((LA75_0 == WS)) {
                                            alt75 = 1;
                                        }
                                        switch (alt75) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:335: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1278);
                                            }
                                            break;

                                        }

                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_granularityClause1283);
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
    }
	// $ANTLR end "granularityClause"

	// $ANTLR start "granularityInclude"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:223:1: granularityInclude[QueryMeta qMeta] : ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) ;
    public final void granularityInclude(QueryMeta qMeta) throws RecognitionException {
        Pair<Integer> p1 = null;
        Pair<Integer> p2 = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:2: ( ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:4: WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN
                {
                    match(input, WS, FOLLOW_WS_in_granularityInclude1305);
                    match(input, INCLUDE, FOLLOW_INCLUDE_in_granularityInclude1307);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:15: ( WS )?
                    int alt79 = 2;
                    int LA79_0 = input.LA(1);
                    if ((LA79_0 == WS)) {
                        alt79 = 1;
                    }
                    switch (alt79) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:15: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude1309);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_granularityInclude1312);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:26: ( WS )?
                    int alt80 = 2;
                    int LA80_0 = input.LA(1);
                    if ((LA80_0 == WS)) {
                        alt80 = 1;
                    }
                    switch (alt80) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:26: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude1314);
                        }
                        break;

                    }

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:30: (p1= pairNums ( ',' p2= pairNums )* )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:31: p1= pairNums ( ',' p2= pairNums )*
                    {
                        pushFollow(FOLLOW_pairNums_in_granularityInclude1320);
                        p1 = pairNums();
                        state._fsp--;

                        qMeta.microIntervals.add(p1);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:75: ( ',' p2= pairNums )*
                        loop81:
                        while (true) {
                            int alt81 = 2;
                            int LA81_0 = input.LA(1);
                            if ((LA81_0 == 72)) {
                                alt81 = 1;
                            }

                            switch (alt81) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:76: ',' p2= pairNums
                                {
                                    match(input, 72, FOLLOW_72_in_granularityInclude1325);
                                    pushFollow(FOLLOW_pairNums_in_granularityInclude1329);
                                    p2 = pairNums();
                                    state._fsp--;

                                    qMeta.microIntervals.add(p2);
                                }
                                break;

                                default:
                                    break loop81;
                            }
                        }

                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:127: ( WS )?
                    int alt82 = 2;
                    int LA82_0 = input.LA(1);
                    if ((LA82_0 == WS)) {
                        alt82 = 1;
                    }
                    switch (alt82) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:225:127: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude1336);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_granularityInclude1339);
                }

            }

        } catch (RecognitionException re) {
            reportError(re);
            recover(input, re);
        } finally {
            // do for sure before leaving
        }
    }
	// $ANTLR end "granularityInclude"

	// $ANTLR start "pairNums"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:1: pairNums returns [Pair<Integer> pair] : ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) ;
    public final Pair<Integer> pairNums() throws RecognitionException {
        Pair<Integer> pair = null;

        Token i = null;
        Token j = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:2: ( ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:5: LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE
                {
                    match(input, LSQUARE, FOLLOW_LSQUARE_in_pairNums1358);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:13: ( WS )?
                    int alt83 = 2;
                    int LA83_0 = input.LA(1);
                    if ((LA83_0 == WS)) {
                        alt83 = 1;
                    }
                    switch (alt83) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:13: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1360);
                        }
                        break;

                    }

                    i = (Token) match(input, LONG, FOLLOW_LONG_in_pairNums1365);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:25: ( WS )?
                    int alt84 = 2;
                    int LA84_0 = input.LA(1);
                    if ((LA84_0 == WS)) {
                        alt84 = 1;
                    }
                    switch (alt84) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:25: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1368);
                        }
                        break;

                    }

                    match(input, 72, FOLLOW_72_in_pairNums1371);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:33: ( WS )?
                    int alt85 = 2;
                    int LA85_0 = input.LA(1);
                    if ((LA85_0 == WS)) {
                        alt85 = 1;
                    }
                    switch (alt85) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:33: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1373);
                        }
                        break;

                    }

                    j = (Token) match(input, LONG, FOLLOW_LONG_in_pairNums1378);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:44: ( WS )?
                    int alt86 = 2;
                    int LA86_0 = input.LA(1);
                    if ((LA86_0 == WS)) {
                        alt86 = 1;
                    }
                    switch (alt86) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:44: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1380);
                        }
                        break;

                    }

                    match(input, RSQUARE, FOLLOW_RSQUARE_in_pairNums1383);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:1: pairString returns [Pair<String> pair] : ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) ;
    public final Pair<String> pairString() throws RecognitionException {
        Pair<String> pair = null;

        Token i = null;
        Token j = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:2: ( ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:5: LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE
                {
                    match(input, LSQUARE, FOLLOW_LSQUARE_in_pairString1403);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:13: ( WS )?
                    int alt87 = 2;
                    int LA87_0 = input.LA(1);
                    if ((LA87_0 == WS)) {
                        alt87 = 1;
                    }
                    switch (alt87) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:13: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1405);
                        }
                        break;

                    }

                    i = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_pairString1410);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:40: ( WS )?
                    int alt88 = 2;
                    int LA88_0 = input.LA(1);
                    if ((LA88_0 == WS)) {
                        alt88 = 1;
                    }
                    switch (alt88) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:40: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1413);
                        }
                        break;

                    }

                    match(input, 72, FOLLOW_72_in_pairString1416);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:48: ( WS )?
                    int alt89 = 2;
                    int LA89_0 = input.LA(1);
                    if ((LA89_0 == WS)) {
                        alt89 = 1;
                    }
                    switch (alt89) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:48: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1418);
                        }
                        break;

                    }

                    j = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_pairString1423);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:74: ( WS )?
                    int alt90 = 2;
                    int LA90_0 = input.LA(1);
                    if ((LA90_0 == WS)) {
                        alt90 = 1;
                    }
                    switch (alt90) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:74: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1425);
                        }
                        break;

                    }

                    match(input, RSQUARE, FOLLOW_RSQUARE_in_pairString1428);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:1: havingClause returns [Having having] : h= complexHaving ;
    public final Having havingClause() throws RecognitionException {
        Having having = null;

        Having h = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:2: (h= complexHaving )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:4: h= complexHaving
            {
                pushFollow(FOLLOW_complexHaving_in_havingClause1453);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:244:1: simpleHaving returns [Having having] : ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) );
    public final Having simpleHaving() throws RecognitionException {
        Having having = null;

        Token a = null;
        Token t = null;
        Token v = null;
        Token n = null;
        EqualsToHolder e = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:2: ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) )
            int alt95 = 3;
            int LA95_0 = input.LA(1);
            if ((LA95_0 == ID)) {
                switch (input.LA(2)) {
                    case WS: {
                        int LA95_3 = input.LA(3);
                        if ((LA95_3 == COMPARE_OPER)) {
                            alt95 = 1;
                        } else if ((LA95_3 == EQUALS)) {
                            alt95 = 2;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 95, 3, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case COMPARE_OPER: {
                        alt95 = 1;
                    }
                    break;
                    case EQUALS: {
                        alt95 = 2;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 95, 1, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else if ((LA95_0 == NOT)) {
                alt95 = 3;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 95, 0, input);
                throw nvae;
            }

            switch (alt95) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:5: a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
                    {
                        a = (Token) match(input, ID, FOLLOW_ID_in_simpleHaving1474);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:10: ( WS )?
                        int alt91 = 2;
                        int LA91_0 = input.LA(1);
                        if ((LA91_0 == WS)) {
                            alt91 = 1;
                        }
                        switch (alt91) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:10: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1476);
                            }
                            break;

                        }

                        t = (Token) match(input, COMPARE_OPER, FOLLOW_COMPARE_OPER_in_simpleHaving1481);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:29: ( WS )?
                        int alt92 = 2;
                        int LA92_0 = input.LA(1);
                        if ((LA92_0 == WS)) {
                            alt92 = 1;
                        }
                        switch (alt92) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:29: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1483);
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
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:4: (e= getEquals )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:4: (e= getEquals )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:5: e= getEquals
                    {
                        pushFollow(FOLLOW_getEquals_in_simpleHaving1505);
                        e = getEquals();
                        state._fsp--;

                    }

                    having = new Having("=", e.name, e.value);
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:5: n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
                    {
                        n = (Token) match(input, NOT, FOLLOW_NOT_in_simpleHaving1516);
                        match(input, WS, FOLLOW_WS_in_simpleHaving1518);
                        a = (Token) match(input, ID, FOLLOW_ID_in_simpleHaving1522);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:19: ( WS )?
                        int alt93 = 2;
                        int LA93_0 = input.LA(1);
                        if ((LA93_0 == WS)) {
                            alt93 = 1;
                        }
                        switch (alt93) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:19: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1524);
                            }
                            break;

                        }

                        t = (Token) match(input, COMPARE_OPER, FOLLOW_COMPARE_OPER_in_simpleHaving1529);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:38: ( WS )?
                        int alt94 = 2;
                        int LA94_0 = input.LA(1);
                        if ((LA94_0 == WS)) {
                            alt94 = 1;
                        }
                        switch (alt94) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:38: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1531);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );
    public final Having complexHaving() throws RecognitionException {
        Having having = null;

        Token o = null;
        Having s = null;
        Having a = null;
        Having b = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:2: ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) )
            int alt96 = 2;
            alt96 = dfa96.predict(input);
            switch (alt96) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:4: (s= simpleHaving )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:4: (s= simpleHaving )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:251:5: s= simpleHaving
                    {
                        pushFollow(FOLLOW_simpleHaving_in_complexHaving1564);
                        s = simpleHaving();
                        state._fsp--;

                    }

                    having = s;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:252:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:252:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:252:5: a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving
                    {
                        pushFollow(FOLLOW_simpleHaving_in_complexHaving1575);
                        a = simpleHaving();
                        state._fsp--;

                        match(input, WS, FOLLOW_WS_in_complexHaving1577);
                        o = input.LT(1);
                        if (input.LA(1) == AND || input.LA(1) == OR) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        match(input, WS, FOLLOW_WS_in_complexHaving1587);
                        pushFollow(FOLLOW_complexHaving_in_complexHaving1591);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:260:1: selectorFilter returns [Filter filter] : e= getEquals ;
    public final Filter selectorFilter() throws RecognitionException {
        Filter filter = null;

        EqualsToHolder e = null;

        filter = new Filter("selector");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:262:2: (e= getEquals )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:262:4: e= getEquals
            {
                pushFollow(FOLLOW_getEquals_in_selectorFilter1628);
                e = getEquals();
                state._fsp--;

                filter.dimension = e.name;
                filter.value = e.value;
                if (filter.value.startsWith("'") && filter.value.endsWith("'")) {
                    filter.value = filter.value.substring(1, filter.value.length() - 1);
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
	// $ANTLR end "selectorFilter"

	// $ANTLR start "regexFilter"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:271:1: regexFilter returns [Filter filter] : (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) ;
    public final Filter regexFilter() throws RecognitionException {
        Filter filter = null;

        Token a = null;
        Token b = null;

        filter = new Filter("regex");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:2: ( (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:5: a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING )
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_regexFilter1657);
                    match(input, WS, FOLLOW_WS_in_regexFilter1659);
                    match(input, LIKE, FOLLOW_LIKE_in_regexFilter1661);
                    match(input, WS, FOLLOW_WS_in_regexFilter1663);
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:24: ( SINGLE_QUOTE_STRING )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:273:25: SINGLE_QUOTE_STRING
                    {
                        b = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1669);
                    }

                }

                filter.dimension = (a != null ? a.getText() : null);
                filter.pattern = (b != null ? b.getText() : null);
                if (filter.pattern.startsWith("'") && filter.pattern.endsWith("'")) {
                    filter.pattern = filter.pattern.substring(1, filter.pattern.length() - 1);
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
	// $ANTLR end "regexFilter"

	// $ANTLR start "simpleFilter"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:282:1: simpleFilter returns [Filter filter] : ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) );
    public final Filter simpleFilter() throws RecognitionException {
        Filter filter = null;

        Filter a = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:2: ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) )
            int alt101 = 2;
            int LA101_0 = input.LA(1);
            if ((LA101_0 == ID)) {
                alt101 = 1;
            } else if ((LA101_0 == LPARAN)) {
                alt101 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 101, 0, input);
                throw nvae;
            }

            switch (alt101) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:4: (a= selectorFilter |a= regexFilter )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:4: (a= selectorFilter |a= regexFilter )
                    int alt97 = 2;
                    int LA97_0 = input.LA(1);
                    if ((LA97_0 == ID)) {
                        int LA97_1 = input.LA(2);
                        if ((LA97_1 == WS)) {
                            int LA97_2 = input.LA(3);
                            if ((LA97_2 == LIKE)) {
                                alt97 = 2;
                            } else if ((LA97_2 == EQUALS)) {
                                alt97 = 1;
                            } else {
                                int nvaeMark = input.mark();
                                try {
                                    for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                        input.consume();
                                    }
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 97, 2, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA97_1 == EQUALS)) {
                            alt97 = 1;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                input.consume();
                                NoViableAltException nvae
                                        = new NoViableAltException("", 97, 1, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 97, 0, input);
                        throw nvae;
                    }

                    switch (alt97) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:5: a= selectorFilter
                        {
                            pushFollow(FOLLOW_selectorFilter_in_simpleFilter1694);
                            a = selectorFilter();
                            state._fsp--;

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:24: a= regexFilter
                        {
                            pushFollow(FOLLOW_regexFilter_in_simpleFilter1700);
                            a = regexFilter();
                            state._fsp--;

                        }
                        break;

                    }

                    filter = a;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:6: LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN
                    {
                        match(input, LPARAN, FOLLOW_LPARAN_in_simpleFilter1710);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:13: ( WS )?
                        int alt98 = 2;
                        int LA98_0 = input.LA(1);
                        if ((LA98_0 == WS)) {
                            alt98 = 1;
                        }
                        switch (alt98) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:13: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleFilter1712);
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:17: (a= selectorFilter |a= regexFilter )
                        int alt99 = 2;
                        int LA99_0 = input.LA(1);
                        if ((LA99_0 == ID)) {
                            int LA99_1 = input.LA(2);
                            if ((LA99_1 == WS)) {
                                int LA99_2 = input.LA(3);
                                if ((LA99_2 == LIKE)) {
                                    alt99 = 2;
                                } else if ((LA99_2 == EQUALS)) {
                                    alt99 = 1;
                                } else {
                                    int nvaeMark = input.mark();
                                    try {
                                        for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                            input.consume();
                                        }
                                        NoViableAltException nvae
                                                = new NoViableAltException("", 99, 2, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA99_1 == EQUALS)) {
                                alt99 = 1;
                            } else {
                                int nvaeMark = input.mark();
                                try {
                                    input.consume();
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 99, 1, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else {
                            NoViableAltException nvae
                                    = new NoViableAltException("", 99, 0, input);
                            throw nvae;
                        }

                        switch (alt99) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:18: a= selectorFilter
                            {
                                pushFollow(FOLLOW_selectorFilter_in_simpleFilter1718);
                                a = selectorFilter();
                                state._fsp--;

                            }
                            break;
                            case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:37: a= regexFilter
                            {
                                pushFollow(FOLLOW_regexFilter_in_simpleFilter1724);
                                a = regexFilter();
                                state._fsp--;

                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:52: ( WS )?
                        int alt100 = 2;
                        int LA100_0 = input.LA(1);
                        if ((LA100_0 == WS)) {
                            alt100 = 1;
                        }
                        switch (alt100) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:52: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleFilter1727);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_simpleFilter1730);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:287:1: simpleLogicalFilter returns [Filter filter] : ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) );
    public final Filter simpleLogicalFilter() throws RecognitionException {
        Filter filter = null;

        Token o = null;
        Filter a = null;
        Filter b = null;
        Filter s = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:288:2: ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) )
            int alt105 = 2;
            int LA105_0 = input.LA(1);
            if ((LA105_0 == ID || LA105_0 == NOT)) {
                alt105 = 1;
            } else if ((LA105_0 == LPARAN)) {
                switch (input.LA(2)) {
                    case WS: {
                        int LA105_4 = input.LA(3);
                        if ((LA105_4 == ID)) {
                            int LA105_8 = input.LA(4);
                            if ((LA105_8 == WS)) {
                                int LA105_13 = input.LA(5);
                                if ((LA105_13 == LIKE)) {
                                    int LA105_19 = input.LA(6);
                                    if ((LA105_19 == WS)) {
                                        alt105 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 105, 19, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA105_13 == EQUALS)) {
                                    int LA105_20 = input.LA(6);
                                    if ((LA105_20 == WS)) {
                                        alt105 = 1;
                                    } else if ((LA105_20 == FLOAT || LA105_20 == LONG || LA105_20 == SINGLE_QUOTE_STRING)) {
                                        alt105 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 105, 20, input);
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
                                                = new NoViableAltException("", 105, 13, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA105_8 == EQUALS)) {
                                int LA105_14 = input.LA(5);
                                if ((LA105_14 == WS)) {
                                    int LA105_21 = input.LA(6);
                                    if ((LA105_21 == FLOAT || LA105_21 == LONG || LA105_21 == SINGLE_QUOTE_STRING)) {
                                        alt105 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 105, 21, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA105_14 == FLOAT || LA105_14 == LONG || LA105_14 == SINGLE_QUOTE_STRING)) {
                                    int LA105_22 = input.LA(6);
                                    if ((LA105_22 == WS)) {
                                        alt105 = 1;
                                    } else if ((LA105_22 == RPARAN)) {
                                        alt105 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 105, 22, input);
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
                                                = new NoViableAltException("", 105, 14, input);
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
                                            = new NoViableAltException("", 105, 8, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA105_4 == LPARAN || LA105_4 == NOT)) {
                            alt105 = 2;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 105, 4, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case ID: {
                        int LA105_5 = input.LA(3);
                        if ((LA105_5 == WS)) {
                            int LA105_11 = input.LA(4);
                            if ((LA105_11 == LIKE)) {
                                int LA105_15 = input.LA(5);
                                if ((LA105_15 == WS)) {
                                    int LA105_23 = input.LA(6);
                                    if ((LA105_23 == SINGLE_QUOTE_STRING)) {
                                        alt105 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 105, 23, input);
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
                                                = new NoViableAltException("", 105, 15, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA105_11 == EQUALS)) {
                                int LA105_16 = input.LA(5);
                                if ((LA105_16 == WS)) {
                                    int LA105_24 = input.LA(6);
                                    if ((LA105_24 == FLOAT || LA105_24 == LONG || LA105_24 == SINGLE_QUOTE_STRING)) {
                                        alt105 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 105, 24, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA105_16 == FLOAT || LA105_16 == LONG || LA105_16 == SINGLE_QUOTE_STRING)) {
                                    int LA105_25 = input.LA(6);
                                    if ((LA105_25 == WS)) {
                                        alt105 = 1;
                                    } else if ((LA105_25 == RPARAN)) {
                                        alt105 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 105, 25, input);
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
                                                = new NoViableAltException("", 105, 16, input);
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
                                            = new NoViableAltException("", 105, 11, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA105_5 == EQUALS)) {
                            int LA105_12 = input.LA(4);
                            if ((LA105_12 == WS)) {
                                int LA105_17 = input.LA(5);
                                if ((LA105_17 == FLOAT || LA105_17 == LONG || LA105_17 == SINGLE_QUOTE_STRING)) {
                                    int LA105_26 = input.LA(6);
                                    if ((LA105_26 == WS)) {
                                        alt105 = 1;
                                    } else if ((LA105_26 == RPARAN)) {
                                        alt105 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 105, 26, input);
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
                                                = new NoViableAltException("", 105, 17, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA105_12 == FLOAT || LA105_12 == LONG || LA105_12 == SINGLE_QUOTE_STRING)) {
                                int LA105_18 = input.LA(5);
                                if ((LA105_18 == WS)) {
                                    int LA105_27 = input.LA(6);
                                    if ((LA105_27 == AND || LA105_27 == OR)) {
                                        alt105 = 2;
                                    } else if ((LA105_27 == RPARAN)) {
                                        alt105 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 105, 27, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA105_18 == RPARAN)) {
                                    alt105 = 1;
                                } else {
                                    int nvaeMark = input.mark();
                                    try {
                                        for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
                                            input.consume();
                                        }
                                        NoViableAltException nvae
                                                = new NoViableAltException("", 105, 18, input);
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
                                            = new NoViableAltException("", 105, 12, input);
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
                                        = new NoViableAltException("", 105, 5, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case LPARAN:
                    case NOT: {
                        alt105 = 2;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 105, 2, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 105, 0, input);
                throw nvae;
            }

            switch (alt105) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:288:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:288:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
                    int alt102 = 2;
                    int LA102_0 = input.LA(1);
                    if ((LA102_0 == ID || LA102_0 == LPARAN)) {
                        alt102 = 1;
                    } else if ((LA102_0 == NOT)) {
                        alt102 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 102, 0, input);
                        throw nvae;
                    }

                    switch (alt102) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:288:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
                        {
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:288:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:288:5: a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter
                            {
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1751);
                                a = simpleFilter();
                                state._fsp--;

                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1753);
                                o = input.LT(1);
                                if (input.LA(1) == AND || input.LA(1) == OR) {
                                    input.consume();
                                    state.errorRecovery = false;
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    throw mse;
                                }
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1763);
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1767);
                                b = simpleFilter();
                                state._fsp--;

                            }

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:288:55: (o= NOT WS b= simpleFilter )
                        {
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:288:55: (o= NOT WS b= simpleFilter )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:288:56: o= NOT WS b= simpleFilter
                            {
                                o = (Token) match(input, NOT, FOLLOW_NOT_in_simpleLogicalFilter1775);
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1777);
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1781);
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
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:5: LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN
                    {
                        match(input, LPARAN, FOLLOW_LPARAN_in_simpleLogicalFilter1794);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:12: ( WS )?
                        int alt103 = 2;
                        int LA103_0 = input.LA(1);
                        if ((LA103_0 == WS)) {
                            alt103 = 1;
                        }
                        switch (alt103) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:12: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1796);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter1801);
                        s = simpleLogicalFilter();
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:38: ( WS )?
                        int alt104 = 2;
                        int LA104_0 = input.LA(1);
                        if ((LA104_0 == WS)) {
                            alt104 = 1;
                        }
                        switch (alt104) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:38: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1803);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_simpleLogicalFilter1806);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:1: grandFilter returns [Filter filter] : (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? ;
    public final Filter grandFilter() throws RecognitionException {
        Filter filter = null;

        Token o = null;
        Filter a = null;
        Filter b = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:2: ( (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:4: (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )?
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:4: (a= simpleFilter |a= simpleLogicalFilter )
                int alt106 = 2;
                alt106 = dfa106.predict(input);
                switch (alt106) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:5: a= simpleFilter
                    {
                        pushFollow(FOLLOW_simpleFilter_in_grandFilter1830);
                        a = simpleFilter();
                        state._fsp--;

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:22: a= simpleLogicalFilter
                    {
                        pushFollow(FOLLOW_simpleLogicalFilter_in_grandFilter1836);
                        a = simpleLogicalFilter();
                        state._fsp--;

                    }
                    break;

                }

                filter = a;
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:60: ( WS o= ( AND | OR ) WS b= grandFilter )?
                int alt107 = 2;
                int LA107_0 = input.LA(1);
                if ((LA107_0 == WS)) {
                    int LA107_1 = input.LA(2);
                    if ((LA107_1 == AND || LA107_1 == OR)) {
                        alt107 = 1;
                    }
                }
                switch (alt107) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:302:61: WS o= ( AND | OR ) WS b= grandFilter
                    {
                        match(input, WS, FOLLOW_WS_in_grandFilter1843);
                        o = input.LT(1);
                        if (input.LA(1) == AND || input.LA(1) == OR) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        match(input, WS, FOLLOW_WS_in_grandFilter1853);
                        pushFollow(FOLLOW_grandFilter_in_grandFilter1857);
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

	// $ANTLR start "aggItemInSelect"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:1: aggItemInSelect returns [AggItem aggItem] : aggCallSite[aggItem] ( WS AS WS x= ID )? ;
    public final AggItem aggItemInSelect() throws RecognitionException {
        AggItem aggItem = null;

        Token x = null;

        aggItem = new AggItem();
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:315:2: ( aggCallSite[aggItem] ( WS AS WS x= ID )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:315:4: aggCallSite[aggItem] ( WS AS WS x= ID )?
            {
                pushFollow(FOLLOW_aggCallSite_in_aggItemInSelect1894);
                aggCallSite(aggItem);
                state._fsp--;

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:315:25: ( WS AS WS x= ID )?
                int alt108 = 2;
                int LA108_0 = input.LA(1);
                if ((LA108_0 == WS)) {
                    int LA108_1 = input.LA(2);
                    if ((LA108_1 == AS)) {
                        alt108 = 1;
                    }
                }
                switch (alt108) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:315:26: WS AS WS x= ID
                    {
                        match(input, WS, FOLLOW_WS_in_aggItemInSelect1898);
                        match(input, AS, FOLLOW_AS_in_aggItemInSelect1900);
                        match(input, WS, FOLLOW_WS_in_aggItemInSelect1902);
                        x = (Token) match(input, ID, FOLLOW_ID_in_aggItemInSelect1906);
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
	// $ANTLR end "aggItemInSelect"

	// $ANTLR start "aggCallSite"
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:317:1: aggCallSite[AggItem aggItem] : (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN ) | COUNT ( '(*)' ) );
    public final void aggCallSite(AggItem aggItem) throws RecognitionException {
        Token x = null;
        String p = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:2: (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN ) | COUNT ( '(*)' ) )
            int alt112 = 2;
            int LA112_0 = input.LA(1);
            if ((LA112_0 == DOUBLE_SUM || LA112_0 == JAVASCRIPT || LA112_0 == LONG_SUM || (LA112_0 >= MAX && LA112_0 <= MIN) || LA112_0 == UNIQUE)) {
                alt112 = 1;
            } else if ((LA112_0 == COUNT)) {
                alt112 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 112, 0, input);
                throw nvae;
            }

            switch (alt112) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:4: p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN )
                {
                    pushFollow(FOLLOW_aggFunc_in_aggCallSite1925);
                    p = aggFunc();
                    state._fsp--;

                    aggItem.setAggType(p);
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:39: ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:40: ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:40: ( WS )?
                        int alt109 = 2;
                        int LA109_0 = input.LA(1);
                        if ((LA109_0 == WS)) {
                            alt109 = 1;
                        }
                        switch (alt109) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:40: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite1930);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_aggCallSite1933);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:51: ( WS )?
                        int alt110 = 2;
                        int LA110_0 = input.LA(1);
                        if ((LA110_0 == WS)) {
                            alt110 = 1;
                        }
                        switch (alt110) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:51: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite1935);
                            }
                            break;

                        }

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:55: (x= ID )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:57: x= ID
                        {
                            x = (Token) match(input, ID, FOLLOW_ID_in_aggCallSite1942);
                            aggItem.setFieldName((x != null ? x.getText() : null));
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:96: ( WS )?
                        int alt111 = 2;
                        int LA111_0 = input.LA(1);
                        if ((LA111_0 == WS)) {
                            alt111 = 1;
                        }
                        switch (alt111) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:96: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite1947);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_aggCallSite1950);
                    }

                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:319:4: COUNT ( '(*)' )
                {
                    match(input, COUNT, FOLLOW_COUNT_in_aggCallSite1957);
                    aggItem.setAggType("count");
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:319:41: ( '(*)' )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:319:42: '(*)'
                    {
                        match(input, 70, FOLLOW_70_in_aggCallSite1962);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:322:1: aggFunc returns [String name] : ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT );
    public final String aggFunc() throws RecognitionException {
        String name = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:323:2: ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT )
            int alt113 = 6;
            switch (input.LA(1)) {
                case LONG_SUM: {
                    alt113 = 1;
                }
                break;
                case DOUBLE_SUM: {
                    alt113 = 2;
                }
                break;
                case UNIQUE: {
                    alt113 = 3;
                }
                break;
                case MIN: {
                    alt113 = 4;
                }
                break;
                case MAX: {
                    alt113 = 5;
                }
                break;
                case JAVASCRIPT: {
                    alt113 = 6;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 113, 0, input);
                    throw nvae;
            }
            switch (alt113) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:323:4: LONG_SUM
                {
                    match(input, LONG_SUM, FOLLOW_LONG_SUM_in_aggFunc1980);
                    name = "longSum";
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:4: DOUBLE_SUM
                {
                    match(input, DOUBLE_SUM, FOLLOW_DOUBLE_SUM_in_aggFunc1987);
                    name = "doubleSum";
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:325:4: UNIQUE
                {
                    match(input, UNIQUE, FOLLOW_UNIQUE_in_aggFunc1994);
                    name = "hyperUnique";
                }
                break;
                case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:326:4: MIN
                {
                    match(input, MIN, FOLLOW_MIN_in_aggFunc2001);
                    name = "min";
                }
                break;
                case 5: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:327:4: MAX
                {
                    match(input, MAX, FOLLOW_MAX_in_aggFunc2008);
                    name = "max";
                }
                break;
                case 6: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:328:4: JAVASCRIPT
                {
                    match(input, JAVASCRIPT, FOLLOW_JAVASCRIPT_in_aggFunc2015);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:334:1: postAggItem returns [PostAggItem postAggItem] : ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) );
    public final PostAggItem postAggItem() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem a = null;
        PostAggItem b = null;

        postAggItem = new PostAggItem("arithmetic");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:2: ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) )
            int alt123 = 2;
            int LA123_0 = input.LA(1);
            if ((LA123_0 == FLOAT || LA123_0 == ID || LA123_0 == JAVASCRIPT || LA123_0 == LONG || LA123_0 == UNIQUE)) {
                alt123 = 1;
            } else if ((LA123_0 == LPARAN)) {
                alt123 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 123, 0, input);
                throw nvae;
            }

            switch (alt123) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:5: a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                    {
                        pushFollow(FOLLOW_simpleArith_in_postAggItem2043);
                        a = simpleArith();
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:20: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                        int alt116 = 2;
                        int LA116_0 = input.LA(1);
                        if ((LA116_0 == WS)) {
                            int LA116_1 = input.LA(2);
                            if ((LA116_1 == ARITH_OPER)) {
                                alt116 = 1;
                            }
                        } else if ((LA116_0 == ARITH_OPER)) {
                            alt116 = 1;
                        }
                        switch (alt116) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:21: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:21: ( WS )?
                                int alt114 = 2;
                                int LA114_0 = input.LA(1);
                                if ((LA114_0 == WS)) {
                                    alt114 = 1;
                                }
                                switch (alt114) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:21: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2047);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggArithOper_in_postAggItem2050);
                                postAggArithOper(postAggItem);
                                state._fsp--;

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:55: ( WS )?
                                int alt115 = 2;
                                int LA115_0 = input.LA(1);
                                if ((LA115_0 == WS)) {
                                    alt115 = 1;
                                }
                                switch (alt115) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:336:55: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2053);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggItem_in_postAggItem2058);
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
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:6: LPARAN ( WS )? a= postAggItem ( WS )? RPARAN
                        {
                            match(input, LPARAN, FOLLOW_LPARAN_in_postAggItem2076);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:13: ( WS )?
                            int alt117 = 2;
                            int LA117_0 = input.LA(1);
                            if ((LA117_0 == WS)) {
                                alt117 = 1;
                            }
                            switch (alt117) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:13: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_postAggItem2078);
                                }
                                break;

                            }

                            pushFollow(FOLLOW_postAggItem_in_postAggItem2083);
                            a = postAggItem();
                            state._fsp--;

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:31: ( WS )?
                            int alt118 = 2;
                            int LA118_0 = input.LA(1);
                            if ((LA118_0 == WS)) {
                                alt118 = 1;
                            }
                            switch (alt118) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:31: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_postAggItem2085);
                                }
                                break;

                            }

                            match(input, RPARAN, FOLLOW_RPARAN_in_postAggItem2088);
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:43: ( postAggLabel[postAggItem] )?
                        int alt119 = 2;
                        int LA119_0 = input.LA(1);
                        if ((LA119_0 == AS)) {
                            alt119 = 1;
                        }
                        switch (alt119) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:44: postAggLabel[postAggItem]
                            {
                                pushFollow(FOLLOW_postAggLabel_in_postAggItem2092);
                                postAggLabel(postAggItem);
                                state._fsp--;

                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:72: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                        int alt122 = 2;
                        int LA122_0 = input.LA(1);
                        if ((LA122_0 == WS)) {
                            int LA122_1 = input.LA(2);
                            if ((LA122_1 == ARITH_OPER)) {
                                alt122 = 1;
                            }
                        } else if ((LA122_0 == ARITH_OPER)) {
                            alt122 = 1;
                        }
                        switch (alt122) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:73: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:73: ( WS )?
                                int alt120 = 2;
                                int LA120_0 = input.LA(1);
                                if ((LA120_0 == WS)) {
                                    alt120 = 1;
                                }
                                switch (alt120) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:73: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2098);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggArithOper_in_postAggItem2101);
                                postAggArithOper(postAggItem);
                                state._fsp--;

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:107: ( WS )?
                                int alt121 = 2;
                                int LA121_0 = input.LA(1);
                                if ((LA121_0 == WS)) {
                                    alt121 = 1;
                                }
                                switch (alt121) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:343:107: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2104);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggItem_in_postAggItem2109);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:354:1: simpleArith returns [PostAggItem postAggItem] : (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? ;
    public final PostAggItem simpleArith() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem a = null;
        PostAggItem b = null;

        postAggItem = new PostAggItem("arithmetic");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:2: ( (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:4: (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:4: (a= simplePostAggAccess )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:5: a= simplePostAggAccess
                {
                    pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2145);
                    a = simplePostAggAccess();
                    state._fsp--;

                    postAggItem = a;
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
                int alt126 = 2;
                alt126 = dfa126.predict(input);
                switch (alt126) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:46: ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:46: ( WS )?
                        int alt124 = 2;
                        int LA124_0 = input.LA(1);
                        if ((LA124_0 == WS)) {
                            alt124 = 1;
                        }
                        switch (alt124) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:46: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleArith2151);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_postAggArithOper_in_simpleArith2154);
                        postAggArithOper(postAggItem);
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:80: ( WS )?
                        int alt125 = 2;
                        int LA125_0 = input.LA(1);
                        if ((LA125_0 == WS)) {
                            alt125 = 1;
                        }
                        switch (alt125) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:80: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleArith2157);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2162);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:368:1: simplePostAggAccess returns [PostAggItem postAggItem] : (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef );
    public final PostAggItem simplePostAggAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem c = null;
        PostAggItem f = null;
        PostAggItem h = null;
        PostAggItem js = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:369:2: (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef )
            int alt127 = 4;
            switch (input.LA(1)) {
                case FLOAT:
                case LONG: {
                    alt127 = 1;
                }
                break;
                case ID: {
                    alt127 = 2;
                }
                break;
                case UNIQUE: {
                    alt127 = 3;
                }
                break;
                case JAVASCRIPT: {
                    alt127 = 4;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 127, 0, input);
                    throw nvae;
            }
            switch (alt127) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:369:4: c= constantAccess
                {
                    pushFollow(FOLLOW_constantAccess_in_simplePostAggAccess2191);
                    c = constantAccess();
                    state._fsp--;

                    postAggItem = c;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:370:4: f= fieldAccess
                {
                    pushFollow(FOLLOW_fieldAccess_in_simplePostAggAccess2208);
                    f = fieldAccess();
                    state._fsp--;

                    postAggItem = f;
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:371:4: h= hyperUniqueCardinality
                {
                    pushFollow(FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2221);
                    h = hyperUniqueCardinality();
                    state._fsp--;

                    postAggItem = h;
                }
                break;
                case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:372:4: js= postAggJavascriptDef
                {
                    pushFollow(FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2230);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:377:1: constantAccess returns [PostAggItem postAggItem] : ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) ;
    public final PostAggItem constantAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("constant");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:2: ( ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:5: (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )?
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:5: (a= FLOAT |a= LONG )
                    int alt128 = 2;
                    int LA128_0 = input.LA(1);
                    if ((LA128_0 == FLOAT)) {
                        alt128 = 1;
                    } else if ((LA128_0 == LONG)) {
                        alt128 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 128, 0, input);
                        throw nvae;
                    }

                    switch (alt128) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:6: a= FLOAT
                        {
                            a = (Token) match(input, FLOAT, FOLLOW_FLOAT_in_constantAccess2260);
                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:16: a= LONG
                        {
                            a = (Token) match(input, LONG, FOLLOW_LONG_in_constantAccess2266);
                        }
                        break;

                    }

                    postAggItem.constantValue = Double.valueOf((a != null ? a.getText() : null));
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:5: ( WS postAggLabel[postAggItem] )?
                    int alt129 = 2;
                    int LA129_0 = input.LA(1);
                    if ((LA129_0 == WS)) {
                        int LA129_1 = input.LA(2);
                        if ((LA129_1 == AS)) {
                            alt129 = 1;
                        }
                    }
                    switch (alt129) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:6: WS postAggLabel[postAggItem]
                        {
                            match(input, WS, FOLLOW_WS_in_constantAccess2279);
                            pushFollow(FOLLOW_postAggLabel_in_constantAccess2281);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:384:1: fieldAccess returns [PostAggItem postAggItem] : (a= ID ( WS postAggLabel[postAggItem] )? ) ;
    public final PostAggItem fieldAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("fieldAccess");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:2: ( (a= ID ( WS postAggLabel[postAggItem] )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:4: (a= ID ( WS postAggLabel[postAggItem] )? )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:4: (a= ID ( WS postAggLabel[postAggItem] )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:5: a= ID ( WS postAggLabel[postAggItem] )?
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_fieldAccess2309);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:10: ( WS postAggLabel[postAggItem] )?
                    int alt130 = 2;
                    int LA130_0 = input.LA(1);
                    if ((LA130_0 == WS)) {
                        int LA130_1 = input.LA(2);
                        if ((LA130_1 == AS)) {
                            alt130 = 1;
                        }
                    }
                    switch (alt130) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:11: WS postAggLabel[postAggItem]
                        {
                            match(input, WS, FOLLOW_WS_in_fieldAccess2312);
                            pushFollow(FOLLOW_postAggLabel_in_fieldAccess2314);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:389:1: hyperUniqueCardinality returns [PostAggItem postAggItem] : ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) ;
    public final PostAggItem hyperUniqueCardinality() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("hyperUniqueCardinality");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:2: ( ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:5: UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN
                {
                    match(input, UNIQUE, FOLLOW_UNIQUE_in_hyperUniqueCardinality2343);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:12: ( WS )?
                    int alt131 = 2;
                    int LA131_0 = input.LA(1);
                    if ((LA131_0 == WS)) {
                        alt131 = 1;
                    }
                    switch (alt131) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:12: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality2345);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_hyperUniqueCardinality2348);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:23: ( WS )?
                    int alt132 = 2;
                    int LA132_0 = input.LA(1);
                    if ((LA132_0 == WS)) {
                        alt132 = 1;
                    }
                    switch (alt132) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:23: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality2350);
                        }
                        break;

                    }

                    a = (Token) match(input, ID, FOLLOW_ID_in_hyperUniqueCardinality2355);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:32: ( WS )?
                    int alt133 = 2;
                    int LA133_0 = input.LA(1);
                    if ((LA133_0 == WS)) {
                        alt133 = 1;
                    }
                    switch (alt133) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:32: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality2357);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_hyperUniqueCardinality2360);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:396:1: postAggJavascriptDef returns [PostAggItem postAggItem] : JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING ;
    public final PostAggItem postAggJavascriptDef() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token str = null;

        postAggItem = new PostAggItem("javascript");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:2: ( JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:4: JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING
            {
                match(input, JAVASCRIPT, FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2386);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:15: ( WS )?
                int alt134 = 2;
                int LA134_0 = input.LA(1);
                if ((LA134_0 == WS)) {
                    alt134 = 1;
                }
                switch (alt134) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:398:15: WS
                    {
                        match(input, WS, FOLLOW_WS_in_postAggJavascriptDef2388);
                    }
                    break;

                }

                str = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2393);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:401:1: postAggLabel[PostAggItem postAggItem] : ( AS WS id= ID ) ;
    public final void postAggLabel(PostAggItem postAggItem) throws RecognitionException {
        Token id = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:2: ( ( AS WS id= ID ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:4: ( AS WS id= ID )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:4: ( AS WS id= ID )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:5: AS WS id= ID
                {
                    match(input, AS, FOLLOW_AS_in_postAggLabel2409);
                    match(input, WS, FOLLOW_WS_in_postAggLabel2411);
                    id = (Token) match(input, ID, FOLLOW_ID_in_postAggLabel2415);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:405:1: postAggArithOper[PostAggItem postAggItem] : arith= ARITH_OPER ;
    public final void postAggArithOper(PostAggItem postAggItem) throws RecognitionException {
        Token arith = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:406:2: (arith= ARITH_OPER )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:406:3: arith= ARITH_OPER
            {
                arith = (Token) match(input, ARITH_OPER, FOLLOW_ARITH_OPER_in_postAggArithOper2431);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:411:1: isoTime returns [String date] : (d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ );
    public final druidGParser.isoTime_return isoTime() throws RecognitionException {
        druidGParser.isoTime_return retval = new druidGParser.isoTime_return();
        retval.start = input.LT(1);

        Token d = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:412:2: (d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ )
            int alt135 = 7;
            switch (input.LA(1)) {
                case DATE: {
                    alt135 = 1;
                }
                break;
                case DATE_HOUR: {
                    alt135 = 2;
                }
                break;
                case DATE_HOUR_MIN: {
                    alt135 = 3;
                }
                break;
                case DATE_HOUR_MIN_SEC: {
                    alt135 = 4;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB: {
                    alt135 = 5;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB_TZ: {
                    alt135 = 6;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB_UTC_TZ: {
                    alt135 = 7;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 135, 0, input);
                    throw nvae;
            }
            switch (alt135) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:412:3: d= DATE
                {
                    d = (Token) match(input, DATE, FOLLOW_DATE_in_isoTime2450);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:413:3: d= DATE_HOUR
                {
                    d = (Token) match(input, DATE_HOUR, FOLLOW_DATE_HOUR_in_isoTime2458);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:414:3: d= DATE_HOUR_MIN
                {
                    d = (Token) match(input, DATE_HOUR_MIN, FOLLOW_DATE_HOUR_MIN_in_isoTime2466);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:415:3: d= DATE_HOUR_MIN_SEC
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC, FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2474);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 5: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:416:3: d= DATE_HOUR_MIN_SEC_SUB
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB, FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2482);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 6: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:417:3: d= DATE_HOUR_MIN_SEC_SUB_TZ
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB_TZ, FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2490);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 7: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:418:3: d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB_UTC_TZ, FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2498);
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
    protected DFA96 dfa96 = new DFA96(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA126 dfa126 = new DFA126(this);
    static final String DFA96_eotS
            = "\176\uffff";
    static final String DFA96_eofS
            = "\12\uffff\1\24\1\uffff\1\24\2\uffff\1\24\1\uffff\3\24\3\uffff\2\24\5\uffff"
            + "\2\24\3\uffff\2\24\3\uffff\1\24\15\uffff\1\24\17\uffff\1\24\67\uffff";
    static final String DFA96_minS
            = "\1\41\1\13\1\105\1\13\2\33\1\41\3\33\1\64\1\33\1\64\1\13\1\33\1\64\1\33"
            + "\2\64\1\4\3\uffff\1\64\1\4\3\uffff\1\13\1\33\1\64\1\4\3\uffff\1\64\1\4"
            + "\3\uffff\1\4\15\uffff\1\4\15\uffff\2\33\1\64\67\uffff";
    static final String DFA96_maxS
            = "\1\60\2\105\1\30\2\105\1\41\2\105\1\51\1\105\1\75\2\105\1\51\1\105\1\75"
            + "\2\105\1\104\3\uffff\1\105\1\104\3\uffff\1\13\2\105\1\104\3\uffff\1\105"
            + "\1\104\3\uffff\1\104\15\uffff\1\104\15\uffff\1\105\1\51\1\105\67\uffff";
    static final String DFA96_acceptS
            = "\24\uffff\1\1\35\uffff\1\2\24\uffff\1\1\15\uffff\1\1\41\uffff\4\1\3\uffff";
    static final String DFA96_specialS
            = "\176\uffff}>";
    static final String[] DFA96_transitionS = {
        "\1\1\16\uffff\1\2",
        "\1\4\14\uffff\1\5\54\uffff\1\3",
        "\1\6",
        "\1\7\14\uffff\1\10",
        "\1\12\15\uffff\1\12\33\uffff\1\11",
        "\1\14\15\uffff\1\14\23\uffff\1\14\7\uffff\1\13",
        "\1\15",
        "\1\17\15\uffff\1\17\33\uffff\1\16",
        "\1\21\15\uffff\1\21\23\uffff\1\21\7\uffff\1\20",
        "\1\22\15\uffff\1\22",
        "\1\24\5\uffff\1\24\12\uffff\1\23",
        "\1\27\15\uffff\1\27\23\uffff\1\27",
        "\1\24\5\uffff\1\24\12\uffff\1\30",
        "\1\35\71\uffff\1\34",
        "\1\36\15\uffff\1\36",
        "\1\24\5\uffff\1\24\12\uffff\1\37",
        "\1\43\15\uffff\1\43\23\uffff\1\43",
        "\1\24\5\uffff\1\24\12\uffff\1\44",
        "\1\24\5\uffff\1\24\12\uffff\1\50",
        "\1\62\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\13\uffff"
        + "\1\24\1\62\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "",
        "",
        "\1\24\5\uffff\1\24\12\uffff\1\66",
        "\1\62\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\13\uffff"
        + "\1\24\1\62\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "",
        "",
        "\1\104",
        "\1\106\15\uffff\1\106\33\uffff\1\105",
        "\1\24\5\uffff\1\24\12\uffff\1\107",
        "\1\62\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\13\uffff"
        + "\1\24\1\62\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "",
        "",
        "\1\24\5\uffff\1\24\12\uffff\1\125",
        "\1\62\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\13\uffff"
        + "\1\24\1\62\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "",
        "",
        "\1\62\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\13\uffff"
        + "\1\24\1\62\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\62\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\13\uffff"
        + "\1\24\1\62\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\170\15\uffff\1\170\33\uffff\1\167",
        "\1\171\15\uffff\1\171",
        "\1\24\5\uffff\1\24\12\uffff\1\172",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
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

    static final short[] DFA96_eot = DFA.unpackEncodedString(DFA96_eotS);
    static final short[] DFA96_eof = DFA.unpackEncodedString(DFA96_eofS);
    static final char[] DFA96_min = DFA.unpackEncodedStringToUnsignedChars(DFA96_minS);
    static final char[] DFA96_max = DFA.unpackEncodedStringToUnsignedChars(DFA96_maxS);
    static final short[] DFA96_accept = DFA.unpackEncodedString(DFA96_acceptS);
    static final short[] DFA96_special = DFA.unpackEncodedString(DFA96_specialS);
    static final short[][] DFA96_transition;

    static {
        int numStates = DFA96_transitionS.length;
        DFA96_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA96_transition[i] = DFA.unpackEncodedString(DFA96_transitionS[i]);
        }
    }

    protected class DFA96 extends DFA {

        public DFA96(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 96;
            this.eot = DFA96_eot;
            this.eof = DFA96_eof;
            this.min = DFA96_min;
            this.max = DFA96_max;
            this.accept = DFA96_accept;
            this.special = DFA96_special;
            this.transition = DFA96_transition;
        }

        @Override
        public String getDescription() {
            return "250:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );";
        }
    }

    static final String DFA106_eotS
            = "\164\uffff";
    static final String DFA106_eofS
            = "\15\uffff\1\30\7\uffff\3\30\11\uffff\3\30\3\uffff\1\30\30\uffff\1\30\63"
            + "\uffff";
    static final String DFA106_minS
            = "\1\41\1\30\1\41\1\uffff\1\30\1\33\1\41\1\30\2\uffff\1\105\2\33\1\64\1"
            + "\30\2\uffff\1\30\1\33\1\75\1\33\2\64\1\4\3\uffff\1\30\1\33\1\105\2\33"
            + "\1\72\2\64\1\4\3\uffff\1\4\3\uffff\1\105\13\uffff\1\105\2\33\1\72\1\75"
            + "\1\33\2\72\1\4\1\64\63\uffff";
    static final String DFA106_maxS
            = "\1\60\2\105\1\uffff\1\47\1\105\1\60\1\105\2\uffff\2\105\1\75\2\105\2\uffff"
            + "\1\47\1\105\2\75\2\105\1\104\3\uffff\1\47\3\105\1\75\3\105\1\104\3\uffff"
            + "\1\104\3\uffff\1\105\13\uffff\2\105\1\75\1\105\2\75\2\105\1\72\1\105\63"
            + "\uffff";
    static final String DFA106_acceptS
            = "\3\uffff\1\2\24\uffff\1\1\50\uffff\1\1\3\uffff\1\1\3\uffff\1\1\13\uffff"
            + "\1\1\13\uffff\15\1\1\uffff\2\1\3\uffff";
    static final String DFA106_specialS
            = "\164\uffff}>";
    static final String[] DFA106_transitionS = {
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
        "\1\30\5\uffff\1\30\12\uffff\1\27",
        "\1\34\54\uffff\1\33",
        "",
        "",
        "\1\36\16\uffff\1\35",
        "\1\40\15\uffff\1\40\23\uffff\1\40\7\uffff\1\37",
        "\1\41",
        "\1\42\15\uffff\1\42\23\uffff\1\42",
        "\1\30\5\uffff\1\30\12\uffff\1\43",
        "\1\30\5\uffff\1\30\12\uffff\1\47",
        "\1\53\4\uffff\1\30\23\uffff\1\30\2\uffff\1\30\3\uffff\1\30\1\uffff\1"
        + "\30\1\uffff\1\30\13\uffff\1\30\1\53\1\30\2\uffff\2\30\5\uffff\1\30\3"
        + "\uffff\1\30",
        "",
        "",
        "",
        "\1\70\16\uffff\1\67",
        "\1\72\15\uffff\1\72\23\uffff\1\72\7\uffff\1\71",
        "\1\73",
        "\1\75\15\uffff\1\75\23\uffff\1\75\7\uffff\1\74",
        "\1\76\15\uffff\1\76\23\uffff\1\76",
        "\1\100\12\uffff\1\77",
        "\1\30\5\uffff\1\30\12\uffff\1\101",
        "\1\30\5\uffff\1\30\12\uffff\1\105",
        "\1\111\4\uffff\1\30\23\uffff\1\30\2\uffff\1\30\3\uffff\1\30\1\uffff"
        + "\1\30\1\uffff\1\30\13\uffff\1\30\1\111\1\30\2\uffff\2\30\5\uffff\1\30"
        + "\3\uffff\1\30",
        "",
        "",
        "",
        "\1\125\4\uffff\1\30\23\uffff\1\30\2\uffff\1\30\3\uffff\1\30\1\uffff"
        + "\1\30\1\uffff\1\30\13\uffff\1\30\1\125\1\30\2\uffff\2\30\5\uffff\1\30"
        + "\3\uffff\1\30",
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
        "\1\144\15\uffff\1\144\23\uffff\1\144\7\uffff\1\143",
        "\1\145\15\uffff\1\145\23\uffff\1\145",
        "\1\147\12\uffff\1\146",
        "\1\150",
        "\1\151\15\uffff\1\151\23\uffff\1\151",
        "\1\153\12\uffff\1\152",
        "\1\155\12\uffff\1\154",
        "\1\3\60\uffff\1\3\4\uffff\1\157",
        "\1\30\5\uffff\1\30\12\uffff\1\160",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
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

    static final short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static final short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static final char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static final char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static final short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static final short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static final short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    protected class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }

        @Override
        public String getDescription() {
            return "302:4: (a= simpleFilter |a= simpleLogicalFilter )";
        }
    }

    static final String DFA126_eotS
            = "\134\uffff";
    static final String DFA126_eofS
            = "\2\3\132\uffff";
    static final String DFA126_minS
            = "\2\5\1\33\6\uffff\1\33\3\uffff\1\33\3\uffff\1\53\1\75\1\uffff\1\33\3\uffff"
            + "\1\53\1\75\4\uffff\1\53\1\75\1\uffff\1\53\1\41\1\75\4\uffff\1\53\1\75"
            + "\1\uffff\1\53\1\41\1\75\1\uffff\1\53\1\41\1\75\1\uffff\2\41\1\72\1\uffff"
            + "\1\53\1\41\1\75\1\uffff\2\41\1\72\1\uffff\2\41\1\72\1\uffff\1\41\3\72"
            + "\25\uffff";
    static final String DFA126_maxS
            = "\1\105\1\104\1\105\6\uffff\1\105\3\uffff\1\102\3\uffff\2\105\1\uffff\1"
            + "\102\3\uffff\2\105\4\uffff\2\105\1\uffff\1\53\1\105\1\75\4\uffff\2\105"
            + "\1\uffff\1\53\1\105\1\75\1\uffff\1\53\1\105\1\75\1\uffff\1\105\1\41\1"
            + "\105\1\uffff\1\53\1\105\1\75\1\uffff\1\105\1\41\1\105\1\uffff\1\105\1"
            + "\41\1\105\1\uffff\1\41\2\105\1\72\25\uffff";
    static final String DFA126_acceptS
            = "\3\uffff\1\2\12\uffff\3\1\4\uffff\3\1\3\uffff\3\1\6\uffff\4\1\6\uffff"
            + "\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\4\uffff"
            + "\25\1";
    static final String DFA126_specialS
            = "\134\uffff}>";
    static final String[] DFA126_transitionS = {
        "\1\2\56\uffff\1\3\5\uffff\1\3\12\uffff\1\1",
        "\1\11\32\uffff\1\3\3\uffff\1\3\1\uffff\1\3\15\uffff\1\3\4\uffff\2\3"
        + "\11\uffff\1\3",
        "\1\16\5\uffff\1\20\1\uffff\1\22\5\uffff\1\17\1\uffff\1\3\26\uffff\1"
        + "\21\2\uffff\1\15",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\25\5\uffff\1\27\1\uffff\1\31\5\uffff\1\26\1\uffff\1\3\26\uffff\1"
        + "\30\2\uffff\1\24",
        "",
        "",
        "",
        "\1\33\5\uffff\1\35\1\uffff\1\37\5\uffff\1\34\1\uffff\1\3\26\uffff\1"
        + "\36",
        "",
        "",
        "",
        "\1\42\31\uffff\1\41",
        "\1\44\7\uffff\1\43",
        "",
        "\1\45\5\uffff\1\47\1\uffff\1\51\5\uffff\1\46\1\uffff\1\3\26\uffff\1"
        + "\50",
        "",
        "",
        "",
        "\1\54\31\uffff\1\53",
        "\1\56\7\uffff\1\55",
        "",
        "",
        "",
        "",
        "\1\60\31\uffff\1\57",
        "\1\62\7\uffff\1\61",
        "",
        "\1\63",
        "\1\65\43\uffff\1\64",
        "\1\66",
        "",
        "",
        "",
        "",
        "\1\70\31\uffff\1\67",
        "\1\72\7\uffff\1\71",
        "",
        "\1\73",
        "\1\75\43\uffff\1\74",
        "\1\76",
        "",
        "\1\77",
        "\1\101\43\uffff\1\100",
        "\1\102",
        "",
        "\1\104\43\uffff\1\103",
        "\1\105",
        "\1\107\12\uffff\1\106",
        "",
        "\1\110",
        "\1\112\43\uffff\1\111",
        "\1\113",
        "",
        "\1\115\43\uffff\1\114",
        "\1\116",
        "\1\120\12\uffff\1\117",
        "",
        "\1\122\43\uffff\1\121",
        "\1\123",
        "\1\125\12\uffff\1\124",
        "",
        "\1\126",
        "\1\130\12\uffff\1\127",
        "\1\132\12\uffff\1\131",
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
        for (int i = 0; i < numStates; i++) {
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
            return "356:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?";
        }
    }

    public static final BitSet FOLLOW_statement_in_program42 = new BitSet(new long[]{0x0010000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program52 = new BitSet(new long[]{0x0200005000000000L});
    public static final BitSet FOLLOW_set_in_program56 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program77 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_program80 = new BitSet(new long[]{0x1000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program82 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_statement_in_program88 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program93 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_program96 = new BitSet(new long[]{0x0008000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program98 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ON_in_program101 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program108 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_program111 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program113 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_program119 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_program124 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_program127 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program129 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_program134 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_program140 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_program143 = new BitSet(new long[]{0x0010000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program162 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OPT_SEMI_COLON_in_program165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_statement191 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement219 = new BitSet(new long[]{0x0000640A00402000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_selectItems_in_statement221 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement225 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_statement228 = new BitSet(new long[]{0x0000640A00402000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_statement230 = new BitSet(new long[]{0x0000640A00402000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_selectItems_in_statement233 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement264 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_statement266 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement281 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FROM_in_statement283 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement285 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement289 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement305 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_statement307 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement309 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000200L});
    public static final BitSet FOLLOW_whereClause_in_statement311 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement328 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BREAK_in_statement330 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement332 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_statement334 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement336 = new BitSet(new long[]{0x2080000000800000L});
    public static final BitSet FOLLOW_granularityClause_in_statement338 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement349 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GROUP_in_statement351 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement353 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_statement355 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement357 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement383 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement415 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_statement418 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement420 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement425 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement482 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAVING_in_statement484 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement486 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_havingClause_in_statement490 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement534 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ORDER_in_statement536 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement538 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_statement540 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement542 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement547 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement580 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_set_in_statement584 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement634 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LIMIT_in_statement636 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement638 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LONG_in_statement643 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement681 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_THEN_in_statement683 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement685 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_statement689 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement704 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000010L});
    public static final BitSet FOLLOW_WHICH_in_statement706 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement708 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CONTAINS_in_statement710 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement714 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_statement717 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement719 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement725 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement729 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_statement732 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement734 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement739 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement746 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_statement749 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement755 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SORT_in_statement757 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement759 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_statement762 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement764 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement770 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement775 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_statement778 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement790 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_HINT_in_statement792 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement794 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_statement797 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement799 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement804 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement808 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_statement811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggItemInSelect_in_selectItems842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleDim_in_selectItems850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleDim866 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleDim869 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_simpleDim871 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleDim873 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_simpleDim877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intervalClause_in_whereClause898 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_whereClause902 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_whereClause904 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_whereClause906 = new BitSet(new long[]{0x0001080200000000L});
    public static final BitSet FOLLOW_grandFilter_in_whereClause910 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_intervalClause929 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause931 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BETWEEN_in_intervalClause933 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause935 = new BitSet(new long[]{0x20000800001FC000L});
    public static final BitSet FOLLOW_isoTime_in_intervalClause955 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause962 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause966 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_intervalClause968 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause970 = new BitSet(new long[]{0x20000000001FC000L});
    public static final BitSet FOLLOW_isoTime_in_intervalClause975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_intervalClause1007 = new BitSet(new long[]{0x0000100000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause1009 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairString_in_intervalClause1014 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_intervalClause1026 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_intervalClause1029 = new BitSet(new long[]{0x0000100000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause1031 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairString_in_intervalClause1036 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_intervalClause1042 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_intervalClause1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getEquals1068 = new BitSet(new long[]{0x0000000001000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_getEquals1070 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EQUALS_in_getEquals1073 = new BitSet(new long[]{0x2000020008000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_getEquals1075 = new BitSet(new long[]{0x2000020008000000L});
    public static final BitSet FOLLOW_set_in_getEquals1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_granularityClause1143 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1147 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityClause1150 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1152 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1157 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1161 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityClause1165 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1167 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1172 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1179 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_granularityClause1182 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1184 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_granularityInclude_in_granularityClause1187 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1190 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_granularityClause1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_granularityClause1214 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1218 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityClause1221 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1223 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1228 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1232 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityClause1236 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1238 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1243 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1249 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityClause1253 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1255 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1260 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1267 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_granularityClause1270 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1272 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_granularityInclude_in_granularityClause1275 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1278 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_granularityClause1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1305 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INCLUDE_in_granularityInclude1307 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1309 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityInclude1312 = new BitSet(new long[]{0x0000100000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1314 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairNums_in_granularityInclude1320 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityInclude1325 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairNums_in_granularityInclude1329 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1336 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_granularityInclude1339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_pairNums1358 = new BitSet(new long[]{0x0000020000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairNums1360 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LONG_in_pairNums1365 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_pairNums1368 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_pairNums1371 = new BitSet(new long[]{0x0000020000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairNums1373 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LONG_in_pairNums1378 = new BitSet(new long[]{0x0800000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairNums1380 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_pairNums1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_pairString1403 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairString1405 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1410 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_pairString1413 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_pairString1416 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairString1418 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1423 = new BitSet(new long[]{0x0800000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairString1425 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_pairString1428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexHaving_in_havingClause1453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleHaving1474 = new BitSet(new long[]{0x0000000000000800L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1476 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1481 = new BitSet(new long[]{0x0000020008000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1483 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_set_in_simpleHaving1488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getEquals_in_simpleHaving1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_simpleHaving1516 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1518 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_simpleHaving1522 = new BitSet(new long[]{0x0000000000000800L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1524 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1529 = new BitSet(new long[]{0x0000020008000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1531 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_set_in_simpleHaving1536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleHaving_in_complexHaving1564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleHaving_in_complexHaving1575 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_complexHaving1577 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_complexHaving1581 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_complexHaving1587 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_complexHaving_in_complexHaving1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getEquals_in_selectorFilter1628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_regexFilter1657 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_regexFilter1659 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LIKE_in_regexFilter1661 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_regexFilter1663 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectorFilter_in_simpleFilter1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexFilter_in_simpleFilter1700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_simpleFilter1710 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleFilter1712 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_selectorFilter_in_simpleFilter1718 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_regexFilter_in_simpleFilter1724 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleFilter1727 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_simpleFilter1730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1751 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1753 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_simpleLogicalFilter1757 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1763 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_simpleLogicalFilter1775 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1777 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_simpleLogicalFilter1794 = new BitSet(new long[]{0x0001080200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1796 = new BitSet(new long[]{0x0001080200000000L});
    public static final BitSet FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter1801 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1803 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_simpleLogicalFilter1806 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleFilter_in_grandFilter1830 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_simpleLogicalFilter_in_grandFilter1836 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_grandFilter1843 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_grandFilter1847 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_grandFilter1853 = new BitSet(new long[]{0x0001080200000000L});
    public static final BitSet FOLLOW_grandFilter_in_grandFilter1857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggCallSite_in_aggItemInSelect1894 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggItemInSelect1898 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_aggItemInSelect1900 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggItemInSelect1902 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_aggItemInSelect1906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggFunc_in_aggCallSite1925 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggCallSite1930 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_aggCallSite1933 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggCallSite1935 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_aggCallSite1942 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggCallSite1947 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_aggCallSite1950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_aggCallSite1957 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_aggCallSite1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_SUM_in_aggFunc1980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_SUM_in_aggFunc1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_aggFunc1994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_aggFunc2001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_aggFunc2008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JAVASCRIPT_in_aggFunc2015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleArith_in_postAggItem2043 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggItem2047 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_postAggItem2050 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_postAggItem2053 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_postAggItem2076 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_postAggItem2078 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem2083 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggItem2085 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_postAggItem2088 = new BitSet(new long[]{0x0000000000000062L, 0x0000000000000020L});
    public static final BitSet FOLLOW_postAggLabel_in_postAggItem2092 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggItem2098 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_postAggItem2101 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_postAggItem2104 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem2109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2145 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleArith2151 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_simpleArith2154 = new BitSet(new long[]{0x0000020A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_simpleArith2157 = new BitSet(new long[]{0x0000020A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantAccess_in_simplePostAggAccess2191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_simplePostAggAccess2208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constantAccess2260 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_LONG_in_constantAccess2266 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_constantAccess2279 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_postAggLabel_in_constantAccess2281 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fieldAccess2309 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_fieldAccess2312 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_postAggLabel_in_fieldAccess2314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_hyperUniqueCardinality2343 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2345 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_hyperUniqueCardinality2348 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2350 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_hyperUniqueCardinality2355 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2357 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_hyperUniqueCardinality2360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2386 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggJavascriptDef2388 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_postAggLabel2409 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggLabel2411 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_postAggLabel2415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_OPER_in_postAggArithOper2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_isoTime2450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_in_isoTime2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_in_isoTime2466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2498 = new BitSet(new long[]{0x0000000000000002L});
}
