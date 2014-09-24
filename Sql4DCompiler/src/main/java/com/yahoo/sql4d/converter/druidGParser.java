// $ANTLR 3.5 /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2014-09-23 19:14:59
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:36:1: program returns [Program program] : (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? ) ( OPT_SEMI_COLON )? ;
    public final Program program() throws RecognitionException {
        Program program = null;

        Token j = null;
        Token a = null;
        QueryMeta s1 = null;
        QueryMeta s2 = null;

        program = new Program();
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:2: ( (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? ) ( OPT_SEMI_COLON )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:4: (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? ) ( OPT_SEMI_COLON )?
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:4: (s1= statement )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:5: s1= statement
                {
                    pushFollow(FOLLOW_statement_in_program42);
                    s1 = statement();
                    state._fsp--;

                }

                program.listOfQueries.add(s1);
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:4: ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:5: WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )?
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
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:86: ( WS )?
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == WS)) {
                        alt1 = 1;
                    }
                    switch (alt1) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:86: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program66);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_program69);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:97: ( WS )?
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if ((LA2_0 == WS)) {
                        alt2 = 1;
                    }
                    switch (alt2) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:97: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program71);
                        }
                        break;

                    }

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:101: (s2= statement )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:102: s2= statement
                    {
                        pushFollow(FOLLOW_statement_in_program77);
                        s2 = statement();
                        state._fsp--;

                    }

                    program.listOfQueries.add(s2);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:149: ( WS )?
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);
                    if ((LA3_0 == WS)) {
                        alt3 = 1;
                    }
                    switch (alt3) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:149: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program82);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_program85);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:160: ( WS )?
                    int alt4 = 2;
                    int LA4_0 = input.LA(1);
                    if ((LA4_0 == WS)) {
                        alt4 = 1;
                    }
                    switch (alt4) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:160: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program87);
                        }
                        break;

                    }

                    match(input, ON, FOLLOW_ON_in_program90);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:167: ( WS )?
                    int alt5 = 2;
                    int LA5_0 = input.LA(1);
                    if ((LA5_0 == WS)) {
                        alt5 = 1;
                    }
                    switch (alt5) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:167: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program92);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_program95);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:178: ( WS )?
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);
                    if ((LA6_0 == WS)) {
                        alt6 = 1;
                    }
                    switch (alt6) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:178: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program97);
                        }
                        break;

                    }

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:182: (a= ID )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:183: a= ID
                    {
                        a = (Token) match(input, ID, FOLLOW_ID_in_program103);
                        program.primaryJoinableHooks.add((a != null ? a.getText() : null));
                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:235: ( ( WS )? ',' ( WS )? a= ID )*
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
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:236: ( WS )? ',' ( WS )? a= ID
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:236: ( WS )?
                                int alt7 = 2;
                                int LA7_0 = input.LA(1);
                                if ((LA7_0 == WS)) {
                                    alt7 = 1;
                                }
                                switch (alt7) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:236: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_program108);
                                    }
                                    break;

                                }

                                match(input, 72, FOLLOW_72_in_program111);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:244: ( WS )?
                                int alt8 = 2;
                                int LA8_0 = input.LA(1);
                                if ((LA8_0 == WS)) {
                                    alt8 = 1;
                                }
                                switch (alt8) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:244: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_program113);
                                    }
                                    break;

                                }

                                a = (Token) match(input, ID, FOLLOW_ID_in_program118);
                                program.primaryJoinableHooks.add((a != null ? a.getText() : null));
                            }
                            break;

                            default:
                                break loop9;
                        }
                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:302: ( WS )?
                    int alt10 = 2;
                    int LA10_0 = input.LA(1);
                    if ((LA10_0 == WS)) {
                        alt10 = 1;
                    }
                    switch (alt10) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:302: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program124);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_program127);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:313: ( WS )?
                    int alt11 = 2;
                    int LA11_0 = input.LA(1);
                    if ((LA11_0 == WS)) {
                        alt11 = 1;
                    }
                    switch (alt11) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:313: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program129);
                        }
                        break;

                    }

                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:319: ( OPT_SEMI_COLON )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);
                if ((LA12_0 == OPT_SEMI_COLON)) {
                    alt12 = 1;
                }
                switch (alt12) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:39:319: OPT_SEMI_COLON
                    {
                        match(input, OPT_SEMI_COLON, FOLLOW_OPT_SEMI_COLON_in_program134);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:44:1: statement returns [QueryMeta qMeta] : SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? ;
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
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:2: ( SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:4: SELECT ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )? WS FROM WS id= ID ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
            {
                match(input, SELECT, FOLLOW_SELECT_in_statement160);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:7: ( ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( WS '*' ) )?
                int alt16 = 3;
                int LA16_0 = input.LA(1);
                if ((LA16_0 == WS)) {
                    int LA16_1 = input.LA(2);
                    if ((LA16_1 == 71)) {
                        alt16 = 2;
                    } else if ((LA16_1 == COUNT || LA16_1 == DOUBLE_SUM || LA16_1 == ID || LA16_1 == JAVASCRIPT || LA16_1 == LONG_SUM || (LA16_1 >= MAX && LA16_1 <= MIN) || LA16_1 == UNIQUE)) {
                        alt16 = 1;
                    }
                }
                switch (alt16) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:8: ( WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:52:9: WS selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
                        {
                            match(input, WS, FOLLOW_WS_in_statement188);
                            pushFollow(FOLLOW_selectItems_in_statement190);
                            selectItems(qMeta);
                            state._fsp--;

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:52:31: ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
                            loop15:
                            while (true) {
                                int alt15 = 2;
                                int LA15_0 = input.LA(1);
                                if ((LA15_0 == WS)) {
                                    int LA15_1 = input.LA(2);
                                    if ((LA15_1 == 72)) {
                                        alt15 = 1;
                                    }

                                } else if ((LA15_0 == 72)) {
                                    alt15 = 1;
                                }

                                switch (alt15) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:52:32: ( WS )? ',' ( WS )? selectItems[qMeta]
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:52:32: ( WS )?
                                        int alt13 = 2;
                                        int LA13_0 = input.LA(1);
                                        if ((LA13_0 == WS)) {
                                            alt13 = 1;
                                        }
                                        switch (alt13) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:52:32: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_statement194);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_statement197);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:52:40: ( WS )?
                                        int alt14 = 2;
                                        int LA14_0 = input.LA(1);
                                        if ((LA14_0 == WS)) {
                                            alt14 = 1;
                                        }
                                        switch (alt14) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:52:40: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_statement199);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_selectItems_in_statement202);
                                        selectItems(qMeta);
                                        state._fsp--;

                                    }
                                    break;

                                    default:
                                        break loop15;
                                }
                            }

                        }

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:8: ( WS '*' )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:8: ( WS '*' )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:55:9: WS '*'
                        {
                            match(input, WS, FOLLOW_WS_in_statement233);
                            match(input, 71, FOLLOW_71_in_statement235);
                        }

                    }
                    break;

                }

                match(input, WS, FOLLOW_WS_in_statement250);
                match(input, FROM, FOLLOW_FROM_in_statement252);
                match(input, WS, FOLLOW_WS_in_statement254);
                id = (Token) match(input, ID, FOLLOW_ID_in_statement258);

                qMeta.dataSource = (id != null ? id.getText() : null);
                if (((BaseAggQueryMeta) qMeta).aggregations.isEmpty()) {
                    qMeta = SelectQueryMeta.promote(qMeta);
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:64:2: ( WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )?
                int alt41 = 2;
                int LA41_0 = input.LA(1);
                if ((LA41_0 == WS)) {
                    int LA41_1 = input.LA(2);
                    if ((LA41_1 == WHERE)) {
                        alt41 = 1;
                    }
                }
                switch (alt41) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:4: WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
                    {
                        match(input, WS, FOLLOW_WS_in_statement274);
                        match(input, WHERE, FOLLOW_WHERE_in_statement276);
                        match(input, WS, FOLLOW_WS_in_statement278);
                        pushFollow(FOLLOW_whereClause_in_statement280);
                        whereClause(qMeta);
                        state._fsp--;

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:66:4: ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:5: ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )?
                        {
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:5: ( WS BREAK WS BY WS granularityClause[qMeta] )?
                            int alt17 = 2;
                            int LA17_0 = input.LA(1);
                            if ((LA17_0 == WS)) {
                                int LA17_1 = input.LA(2);
                                if ((LA17_1 == BREAK)) {
                                    alt17 = 1;
                                }
                            }
                            switch (alt17) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:6: WS BREAK WS BY WS granularityClause[qMeta]
                                {
                                    match(input, WS, FOLLOW_WS_in_statement297);
                                    match(input, BREAK, FOLLOW_BREAK_in_statement299);
                                    match(input, WS, FOLLOW_WS_in_statement301);
                                    match(input, BY, FOLLOW_BY_in_statement303);
                                    match(input, WS, FOLLOW_WS_in_statement305);
                                    pushFollow(FOLLOW_granularityClause_in_statement307);
                                    granularityClause(qMeta);
                                    state._fsp--;

                                }
                                break;

                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:5: ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )?
                            int alt22 = 2;
                            int LA22_0 = input.LA(1);
                            if ((LA22_0 == WS)) {
                                int LA22_1 = input.LA(2);
                                if ((LA22_1 == GROUP)) {
                                    alt22 = 1;
                                }
                            }
                            switch (alt22) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:68:6: WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )?
                                {
                                    match(input, WS, FOLLOW_WS_in_statement318);
                                    match(input, GROUP, FOLLOW_GROUP_in_statement320);
                                    match(input, WS, FOLLOW_WS_in_statement322);
                                    match(input, BY, FOLLOW_BY_in_statement324);
                                    match(input, WS, FOLLOW_WS_in_statement326);

                                    qMeta = GroupByQueryMeta.promote(qMeta);
                                    if (((GroupByQueryMeta) qMeta).fetchDimensions == null) {
                                        System.err.println("No dimensions !! ");
                                    }

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:75:10: (id= ID ( ( WS )? ',' ( WS )? id= ID )* )
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:75:11: id= ID ( ( WS )? ',' ( WS )? id= ID )*
                                    {
                                        id = (Token) match(input, ID, FOLLOW_ID_in_statement352);

                                        if (!((GroupByQueryMeta) qMeta).checkDimOrAlias((id != null ? id.getText() : null))) {
                                            System.err.println("Dimension/Alias " + (id != null ? id.getText() : null) + " not valid..");
                                        }

                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:81:14: ( ( WS )? ',' ( WS )? id= ID )*
                                        loop20:
                                        while (true) {
                                            int alt20 = 2;
                                            int LA20_0 = input.LA(1);
                                            if ((LA20_0 == WS)) {
                                                int LA20_1 = input.LA(2);
                                                if ((LA20_1 == 72)) {
                                                    alt20 = 1;
                                                }

                                            } else if ((LA20_0 == 72)) {
                                                alt20 = 1;
                                            }

                                            switch (alt20) {
                                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:81:15: ( WS )? ',' ( WS )? id= ID
                                                {
                                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:81:15: ( WS )?
                                                    int alt18 = 2;
                                                    int LA18_0 = input.LA(1);
                                                    if ((LA18_0 == WS)) {
                                                        alt18 = 1;
                                                    }
                                                    switch (alt18) {
                                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:81:15: WS
                                                        {
                                                            match(input, WS, FOLLOW_WS_in_statement384);
                                                        }
                                                        break;

                                                    }

                                                    match(input, 72, FOLLOW_72_in_statement387);
                                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:81:23: ( WS )?
                                                    int alt19 = 2;
                                                    int LA19_0 = input.LA(1);
                                                    if ((LA19_0 == WS)) {
                                                        alt19 = 1;
                                                    }
                                                    switch (alt19) {
                                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:81:23: WS
                                                        {
                                                            match(input, WS, FOLLOW_WS_in_statement389);
                                                        }
                                                        break;

                                                    }

                                                    id = (Token) match(input, ID, FOLLOW_ID_in_statement394);

                                                    if (!((GroupByQueryMeta) qMeta).checkDimOrAlias((id != null ? id.getText() : null))) {
                                                        System.err.println("Dimension/Alias " + (id != null ? id.getText() : null) + " not valid..");
                                                    }

                                                }
                                                break;

                                                default:
                                                    break loop20;
                                            }
                                        }

                                    }

                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:10: ( WS HAVING WS h= havingClause )?
                                    int alt21 = 2;
                                    int LA21_0 = input.LA(1);
                                    if ((LA21_0 == WS)) {
                                        int LA21_1 = input.LA(2);
                                        if ((LA21_1 == HAVING)) {
                                            alt21 = 1;
                                        }
                                    }
                                    switch (alt21) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:89:11: WS HAVING WS h= havingClause
                                        {
                                            match(input, WS, FOLLOW_WS_in_statement451);
                                            match(input, HAVING, FOLLOW_HAVING_in_statement453);
                                            match(input, WS, FOLLOW_WS_in_statement455);
                                            pushFollow(FOLLOW_havingClause_in_statement459);
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
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:93:5: ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )?
                            int alt24 = 2;
                            int LA24_0 = input.LA(1);
                            if ((LA24_0 == WS)) {
                                int LA24_1 = input.LA(2);
                                if ((LA24_1 == ORDER)) {
                                    alt24 = 1;
                                }
                            }
                            switch (alt24) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:93:6: WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )?
                                {
                                    match(input, WS, FOLLOW_WS_in_statement503);
                                    match(input, ORDER, FOLLOW_ORDER_in_statement505);
                                    match(input, WS, FOLLOW_WS_in_statement507);
                                    match(input, BY, FOLLOW_BY_in_statement509);
                                    match(input, WS, FOLLOW_WS_in_statement511);
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:93:24: (id= ID )
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:93:25: id= ID
                                    {
                                        id = (Token) match(input, ID, FOLLOW_ID_in_statement516);
                                    }

                                    if (((PlainDimQueryMeta) qMeta).fetchDimensions.size() != 1) {
                                        ((GroupByQueryMeta) qMeta).limitSpec = new LimitSpec();

                                    } else {// If fetchDimensions = 1 then TopN is more optimal.
                                        qMeta = TopNQueryMeta.promote(qMeta);
                                        ((TopNQueryMeta) qMeta).metric = (id != null ? id.getText() : null);
                                    }

                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:104:9: ( WS dir= ( ASC | DESC ) )?
                                    int alt23 = 2;
                                    int LA23_0 = input.LA(1);
                                    if ((LA23_0 == WS)) {
                                        int LA23_1 = input.LA(2);
                                        if ((LA23_1 == ASC || LA23_1 == DESC)) {
                                            alt23 = 1;
                                        }
                                    }
                                    switch (alt23) {
                                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:104:10: WS dir= ( ASC | DESC )
                                        {
                                            match(input, WS, FOLLOW_WS_in_statement549);
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

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:5: ( WS LIMIT WS (l= LONG ) )?
                            int alt25 = 2;
                            int LA25_0 = input.LA(1);
                            if ((LA25_0 == WS)) {
                                int LA25_1 = input.LA(2);
                                if ((LA25_1 == LIMIT)) {
                                    alt25 = 1;
                                }
                            }
                            switch (alt25) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:126:6: WS LIMIT WS (l= LONG )
                                {
                                    match(input, WS, FOLLOW_WS_in_statement603);
                                    match(input, LIMIT, FOLLOW_LIMIT_in_statement605);
                                    match(input, WS, FOLLOW_WS_in_statement607);
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:126:18: (l= LONG )
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:126:19: l= LONG
                                    {
                                        l = (Token) match(input, LONG, FOLLOW_LONG_in_statement612);
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

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:138:7: ( WS THEN WS p= postAggItem )?
                            int alt26 = 2;
                            int LA26_0 = input.LA(1);
                            if ((LA26_0 == WS)) {
                                int LA26_1 = input.LA(2);
                                if ((LA26_1 == THEN)) {
                                    alt26 = 1;
                                }
                            }
                            switch (alt26) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:138:8: WS THEN WS p= postAggItem
                                {
                                    match(input, WS, FOLLOW_WS_in_statement650);
                                    match(input, THEN, FOLLOW_THEN_in_statement652);
                                    match(input, WS, FOLLOW_WS_in_statement654);
                                    pushFollow(FOLLOW_postAggItem_in_statement658);
                                    p = postAggItem();
                                    state._fsp--;

                                    QueryUtils.setPostAggregation(qMeta, p);
                                }
                                break;

                            }

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:4: ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )?
                        int alt36 = 2;
                        int LA36_0 = input.LA(1);
                        if ((LA36_0 == WS)) {
                            int LA36_1 = input.LA(2);
                            if ((LA36_1 == WHICH)) {
                                alt36 = 1;
                            }
                        }
                        switch (alt36) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:5: WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN
                            {
                                match(input, WS, FOLLOW_WS_in_statement673);
                                match(input, WHICH, FOLLOW_WHICH_in_statement675);
                                match(input, WS, FOLLOW_WS_in_statement677);
                                match(input, CONTAINS, FOLLOW_CONTAINS_in_statement679);
                                qMeta = SearchQueryMeta.promote(qMeta);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:68: ( WS )?
                                int alt27 = 2;
                                int LA27_0 = input.LA(1);
                                if ((LA27_0 == WS)) {
                                    alt27 = 1;
                                }
                                switch (alt27) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:68: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement683);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_statement686);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:79: ( WS )?
                                int alt28 = 2;
                                int LA28_0 = input.LA(1);
                                if ((LA28_0 == WS)) {
                                    alt28 = 1;
                                }
                                switch (alt28) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:79: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement688);
                                    }
                                    break;

                                }

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:83: (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* )
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:84: s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
                                {
                                    s1 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement694);
                                    ((SearchQueryMeta) qMeta).type = "insensitive_contains";
                                    ((SearchQueryMeta) qMeta).addValue((s1 != null ? s1.getText() : null));
                                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:208: ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
                                    loop31:
                                    while (true) {
                                        int alt31 = 2;
                                        int LA31_0 = input.LA(1);
                                        if ((LA31_0 == WS)) {
                                            int LA31_1 = input.LA(2);
                                            if ((LA31_1 == 72)) {
                                                alt31 = 1;
                                            }

                                        } else if ((LA31_0 == 72)) {
                                            alt31 = 1;
                                        }

                                        switch (alt31) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:209: ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING
                                            {
                                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:209: ( WS )?
                                                int alt29 = 2;
                                                int LA29_0 = input.LA(1);
                                                if ((LA29_0 == WS)) {
                                                    alt29 = 1;
                                                }
                                                switch (alt29) {
                                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:209: WS
                                                    {
                                                        match(input, WS, FOLLOW_WS_in_statement698);
                                                    }
                                                    break;

                                                }

                                                match(input, 72, FOLLOW_72_in_statement701);
                                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:217: ( WS )?
                                                int alt30 = 2;
                                                int LA30_0 = input.LA(1);
                                                if ((LA30_0 == WS)) {
                                                    alt30 = 1;
                                                }
                                                switch (alt30) {
                                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:217: WS
                                                    {
                                                        match(input, WS, FOLLOW_WS_in_statement703);
                                                    }
                                                    break;

                                                }

                                                s2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement708);
                                                ((SearchQueryMeta) qMeta).type = "fragment";
                                                ((SearchQueryMeta) qMeta).addValue((s2 != null ? s2.getText() : null));
                                            }
                                            break;

                                            default:
                                                break loop31;
                                        }
                                    }

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:337: ( WS )?
                                int alt32 = 2;
                                int LA32_0 = input.LA(1);
                                if ((LA32_0 == WS)) {
                                    alt32 = 1;
                                }
                                switch (alt32) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:337: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement715);
                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_statement718);
                                match(input, WS, FOLLOW_WS_in_statement724);
                                match(input, SORT, FOLLOW_SORT_in_statement726);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:13: ( WS )?
                                int alt33 = 2;
                                int LA33_0 = input.LA(1);
                                if ((LA33_0 == WS)) {
                                    alt33 = 1;
                                }
                                switch (alt33) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:13: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement728);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_statement731);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:24: ( WS )?
                                int alt34 = 2;
                                int LA34_0 = input.LA(1);
                                if ((LA34_0 == WS)) {
                                    alt34 = 1;
                                }
                                switch (alt34) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:24: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement733);
                                    }
                                    break;

                                }

							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:28: (s= SINGLE_QUOTE_STRING )
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:29: s= SINGLE_QUOTE_STRING
                                {
                                    s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement739);
                                }

                                ((SearchQueryMeta) qMeta).setSort((s != null ? s.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:97: ( WS )?
                                int alt35 = 2;
                                int LA35_0 = input.LA(1);
                                if ((LA35_0 == WS)) {
                                    alt35 = 1;
                                }
                                switch (alt35) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:141:97: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement744);
                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_statement747);
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:4: ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
                        int alt40 = 2;
                        int LA40_0 = input.LA(1);
                        if ((LA40_0 == WS)) {
                            int LA40_1 = input.LA(2);
                            if ((LA40_1 == HINT)) {
                                alt40 = 1;
                            }
                        }
                        switch (alt40) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:5: WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN
                            {
                                match(input, WS, FOLLOW_WS_in_statement759);
                                match(input, HINT, FOLLOW_HINT_in_statement761);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:13: ( WS )?
                                int alt37 = 2;
                                int LA37_0 = input.LA(1);
                                if ((LA37_0 == WS)) {
                                    alt37 = 1;
                                }
                                switch (alt37) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:13: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement763);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_statement766);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:24: ( WS )?
                                int alt38 = 2;
                                int LA38_0 = input.LA(1);
                                if ((LA38_0 == WS)) {
                                    alt38 = 1;
                                }
                                switch (alt38) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:24: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement768);
                                    }
                                    break;

                                }

                                s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement773);
                                qMeta = HintProcessor.process(qMeta, (s != null ? s.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:99: ( WS )?
                                int alt39 = 2;
                                int LA39_0 = input.LA(1);
                                if ((LA39_0 == WS)) {
                                    alt39 = 1;
                                }
                                switch (alt39) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:143:99: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_statement777);
                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_statement780);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:152:1: selectItems[QueryMeta qMeta] : (sI1= aggItemInSelect | simpleDim[qMeta] );
    public final void selectItems(QueryMeta qMeta) throws RecognitionException {
        AggItem sI1 = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:2: (sI1= aggItemInSelect | simpleDim[qMeta] )
            int alt42 = 2;
            int LA42_0 = input.LA(1);
            if ((LA42_0 == COUNT || LA42_0 == DOUBLE_SUM || LA42_0 == JAVASCRIPT || LA42_0 == LONG_SUM || (LA42_0 >= MAX && LA42_0 <= MIN) || LA42_0 == UNIQUE)) {
                alt42 = 1;
            } else if ((LA42_0 == ID)) {
                alt42 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 42, 0, input);
                throw nvae;
            }

            switch (alt42) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:153:5: sI1= aggItemInSelect
                {
                    pushFollow(FOLLOW_aggItemInSelect_in_selectItems811);
                    sI1 = aggItemInSelect();
                    state._fsp--;

                    ((BaseAggQueryMeta) qMeta).aggregations.add(sI1);
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:154:5: simpleDim[qMeta]
                {
                    pushFollow(FOLLOW_simpleDim_in_selectItems819);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:157:1: simpleDim[QueryMeta qMeta] : (a= ID ( WS AS WS b= ID )? ) ;
    public final void simpleDim(QueryMeta qMeta) throws RecognitionException {
        Token a = null;
        Token b = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:2: ( (a= ID ( WS AS WS b= ID )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:4: (a= ID ( WS AS WS b= ID )? )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:4: (a= ID ( WS AS WS b= ID )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:5: a= ID ( WS AS WS b= ID )?
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_simpleDim835);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:10: ( WS AS WS b= ID )?
                    int alt43 = 2;
                    int LA43_0 = input.LA(1);
                    if ((LA43_0 == WS)) {
                        int LA43_1 = input.LA(2);
                        if ((LA43_1 == AS)) {
                            alt43 = 1;
                        }
                    }
                    switch (alt43) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:158:11: WS AS WS b= ID
                        {
                            match(input, WS, FOLLOW_WS_in_simpleDim838);
                            match(input, AS, FOLLOW_AS_in_simpleDim840);
                            match(input, WS, FOLLOW_WS_in_simpleDim842);
                            b = (Token) match(input, ID, FOLLOW_ID_in_simpleDim846);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:169:1: whereClause[QueryMeta qMeta] : intervalClause[qMeta] ( WS AND WS f= grandFilter )? ;
    public final void whereClause(QueryMeta qMeta) throws RecognitionException {
        Filter f = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:170:2: ( intervalClause[qMeta] ( WS AND WS f= grandFilter )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:170:3: intervalClause[qMeta] ( WS AND WS f= grandFilter )?
            {
                pushFollow(FOLLOW_intervalClause_in_whereClause867);
                intervalClause(qMeta);
                state._fsp--;

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:170:25: ( WS AND WS f= grandFilter )?
                int alt44 = 2;
                int LA44_0 = input.LA(1);
                if ((LA44_0 == WS)) {
                    int LA44_1 = input.LA(2);
                    if ((LA44_1 == AND)) {
                        alt44 = 1;
                    }
                }
                switch (alt44) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:170:26: WS AND WS f= grandFilter
                    {
                        match(input, WS, FOLLOW_WS_in_whereClause871);
                        match(input, AND, FOLLOW_AND_in_whereClause873);
                        match(input, WS, FOLLOW_WS_in_whereClause875);
                        pushFollow(FOLLOW_grandFilter_in_whereClause879);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:174:1: intervalClause[QueryMeta qMeta] : 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) ;
    public final void intervalClause(QueryMeta qMeta) throws RecognitionException {
        Token st2 = null;
        Token et2 = null;
        ParserRuleReturnScope st = null;
        ParserRuleReturnScope et = null;
        Pair<String> p1 = null;
        Pair<String> p2 = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:2: ( 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:175:4: 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
            {
                match(input, 73, FOLLOW_73_in_intervalClause898);
                match(input, WS, FOLLOW_WS_in_intervalClause900);
                match(input, BETWEEN, FOLLOW_BETWEEN_in_intervalClause902);
                match(input, WS, FOLLOW_WS_in_intervalClause904);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:176:2: ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
                int alt52 = 2;
                int LA52_0 = input.LA(1);
                if (((LA52_0 >= DATE && LA52_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ) || LA52_0 == SINGLE_QUOTE_STRING)) {
                    alt52 = 1;
                } else if ((LA52_0 == LPARAN)) {
                    alt52 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 52, 0, input);
                    throw nvae;
                }

                switch (alt52) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:177:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
                        {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:7: (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING )
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:7: (st= isoTime |st2= SINGLE_QUOTE_STRING )
                                int alt45 = 2;
                                int LA45_0 = input.LA(1);
                                if (((LA45_0 >= DATE && LA45_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ))) {
                                    alt45 = 1;
                                } else if ((LA45_0 == SINGLE_QUOTE_STRING)) {
                                    alt45 = 2;
                                } else {
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 45, 0, input);
                                    throw nvae;
                                }

                                switch (alt45) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:8: st= isoTime
                                    {
                                        pushFollow(FOLLOW_isoTime_in_intervalClause924);
                                        st = isoTime();
                                        state._fsp--;

                                    }
                                    break;
                                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:22: st2= SINGLE_QUOTE_STRING
                                    {
                                        st2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause931);
                                    }
                                    break;

                                }

                                match(input, WS, FOLLOW_WS_in_intervalClause935);
                                match(input, AND, FOLLOW_AND_in_intervalClause937);
                                match(input, WS, FOLLOW_WS_in_intervalClause939);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:58: (et= isoTime |et2= SINGLE_QUOTE_STRING )
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
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:59: et= isoTime
                                    {
                                        pushFollow(FOLLOW_isoTime_in_intervalClause944);
                                        et = isoTime();
                                        state._fsp--;

                                    }
                                    break;
                                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:178:73: et2= SINGLE_QUOTE_STRING
                                    {
                                        et2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause951);
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
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:5: LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN
                        {
                            match(input, LPARAN, FOLLOW_LPARAN_in_intervalClause976);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:12: ( WS )?
                            int alt47 = 2;
                            int LA47_0 = input.LA(1);
                            if ((LA47_0 == WS)) {
                                alt47 = 1;
                            }
                            switch (alt47) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:12: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_intervalClause978);
                                }
                                break;

                            }

                            pushFollow(FOLLOW_pairString_in_intervalClause983);
                            p1 = pairString();
                            state._fsp--;

                            qMeta.intervals.add(new Interval(p1.a, p1.b));
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:196:7: ( ( WS )? ',' ( WS )? p2= pairString )*
                            loop50:
                            while (true) {
                                int alt50 = 2;
                                int LA50_0 = input.LA(1);
                                if ((LA50_0 == WS)) {
                                    int LA50_1 = input.LA(2);
                                    if ((LA50_1 == 72)) {
                                        alt50 = 1;
                                    }

                                } else if ((LA50_0 == 72)) {
                                    alt50 = 1;
                                }

                                switch (alt50) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:196:8: ( WS )? ',' ( WS )? p2= pairString
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:196:8: ( WS )?
                                        int alt48 = 2;
                                        int LA48_0 = input.LA(1);
                                        if ((LA48_0 == WS)) {
                                            alt48 = 1;
                                        }
                                        switch (alt48) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:196:8: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_intervalClause995);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_intervalClause998);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:196:16: ( WS )?
                                        int alt49 = 2;
                                        int LA49_0 = input.LA(1);
                                        if ((LA49_0 == WS)) {
                                            alt49 = 1;
                                        }
                                        switch (alt49) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:196:16: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_intervalClause1000);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_pairString_in_intervalClause1005);
                                        p2 = pairString();
                                        state._fsp--;

                                        qMeta.intervals.add(new Interval(p2.a, p2.b));
                                    }
                                    break;

                                    default:
                                        break loop50;
                                }
                            }

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:196:85: ( WS )?
                            int alt51 = 2;
                            int LA51_0 = input.LA(1);
                            if ((LA51_0 == WS)) {
                                alt51 = 1;
                            }
                            switch (alt51) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:196:85: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_intervalClause1011);
                                }
                                break;

                            }

                            match(input, RPARAN, FOLLOW_RPARAN_in_intervalClause1014);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:201:1: getEquals returns [EqualsToHolder holder] : (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) ;
    public final EqualsToHolder getEquals() throws RecognitionException {
        EqualsToHolder holder = null;

        Token a = null;
        Token b = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:2: ( (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:5: a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG )
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_getEquals1037);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:10: ( WS )?
                    int alt53 = 2;
                    int LA53_0 = input.LA(1);
                    if ((LA53_0 == WS)) {
                        alt53 = 1;
                    }
                    switch (alt53) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:10: WS
                        {
                            match(input, WS, FOLLOW_WS_in_getEquals1039);
                        }
                        break;

                    }

                    match(input, EQUALS, FOLLOW_EQUALS_in_getEquals1042);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:21: ( WS )?
                    int alt54 = 2;
                    int LA54_0 = input.LA(1);
                    if ((LA54_0 == WS)) {
                        alt54 = 1;
                    }
                    switch (alt54) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:21: WS
                        {
                            match(input, WS, FOLLOW_WS_in_getEquals1044);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:1: granularityClause[QueryMeta qMeta] : ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) ) );
    public final void granularityClause(QueryMeta qMeta) throws RecognitionException {
        Token s = null;
        Token dur = null;
        Token orig = null;
        Token per = null;
        Token tz = null;

        qMeta.granularity = new Granularity();
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:2: ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) ) )
            int alt77 = 2;
            int LA77_0 = input.LA(1);
            if ((LA77_0 == SINGLE_QUOTE_STRING)) {
                alt77 = 1;
            } else if ((LA77_0 == DURATION || LA77_0 == PERIOD)) {
                alt77 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 77, 0, input);
                throw nvae;
            }

            switch (alt77) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:3: ( (s= SINGLE_QUOTE_STRING ) )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:3: ( (s= SINGLE_QUOTE_STRING ) )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:4: (s= SINGLE_QUOTE_STRING )
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:4: (s= SINGLE_QUOTE_STRING )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:209:5: s= SINGLE_QUOTE_STRING
                        {
                            s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1088);
                        }

                        qMeta.granularity = new Granularity((s != null ? s.getText() : null));
                    }

                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:211:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:211:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) )
                    int alt76 = 2;
                    int LA76_0 = input.LA(1);
                    if ((LA76_0 == DURATION)) {
                        alt76 = 1;
                    } else if ((LA76_0 == PERIOD)) {
                        alt76 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 76, 0, input);
                        throw nvae;
                    }

                    switch (alt76) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                        {
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:7: DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN
                            {
                                match(input, DURATION, FOLLOW_DURATION_in_granularityClause1112);
                                qMeta.granularity.type = "duration";
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:55: ( WS )?
                                int alt55 = 2;
                                int LA55_0 = input.LA(1);
                                if ((LA55_0 == WS)) {
                                    alt55 = 1;
                                }
                                switch (alt55) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:55: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1116);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_granularityClause1119);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:66: ( WS )?
                                int alt56 = 2;
                                int LA56_0 = input.LA(1);
                                if ((LA56_0 == WS)) {
                                    alt56 = 1;
                                }
                                switch (alt56) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:66: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1121);
                                    }
                                    break;

                                }

                                dur = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1126);
                                qMeta.granularity.setDuration((dur != null ? dur.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:138: ( WS )?
                                int alt57 = 2;
                                int LA57_0 = input.LA(1);
                                if ((LA57_0 == WS)) {
                                    alt57 = 1;
                                }
                                switch (alt57) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:138: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1130);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:142: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
                                int alt59 = 2;
                                int LA59_0 = input.LA(1);
                                if ((LA59_0 == 72)) {
                                    int LA59_1 = input.LA(2);
                                    if ((LA59_1 == WS)) {
                                        int LA59_4 = input.LA(3);
                                        if ((LA59_4 == SINGLE_QUOTE_STRING)) {
                                            alt59 = 1;
                                        }
                                    } else if ((LA59_1 == SINGLE_QUOTE_STRING)) {
                                        alt59 = 1;
                                    }
                                }
                                switch (alt59) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:143: ',' ( WS )? orig= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 72, FOLLOW_72_in_granularityClause1134);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:147: ( WS )?
                                        int alt58 = 2;
                                        int LA58_0 = input.LA(1);
                                        if ((LA58_0 == WS)) {
                                            alt58 = 1;
                                        }
                                        switch (alt58) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:147: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1136);
                                            }
                                            break;

                                        }

                                        orig = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1141);
                                        qMeta.granularity.setOrigin((orig != null ? orig.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:221: ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )?
                                int alt63 = 2;
                                int LA63_0 = input.LA(1);
                                if ((LA63_0 == WS || LA63_0 == 72)) {
                                    alt63 = 1;
                                }
                                switch (alt63) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:222: ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )?
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:222: ( WS )?
                                        int alt60 = 2;
                                        int LA60_0 = input.LA(1);
                                        if ((LA60_0 == WS)) {
                                            alt60 = 1;
                                        }
                                        switch (alt60) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:222: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1148);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_granularityClause1151);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:230: ( WS )?
                                        int alt61 = 2;
                                        int LA61_0 = input.LA(1);
                                        if ((LA61_0 == WS)) {
                                            int LA61_1 = input.LA(2);
                                            if ((LA61_1 == WS)) {
                                                alt61 = 1;
                                            }
                                        }
                                        switch (alt61) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:230: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1153);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_granularityInclude_in_granularityClause1156);
                                        granularityInclude(qMeta);
                                        state._fsp--;

                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:260: ( WS )?
                                        int alt62 = 2;
                                        int LA62_0 = input.LA(1);
                                        if ((LA62_0 == WS)) {
                                            alt62 = 1;
                                        }
                                        switch (alt62) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:260: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1159);
                                            }
                                            break;

                                        }

                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_granularityClause1164);
                            }

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                        {
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:7: PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN
                            {
                                match(input, PERIOD, FOLLOW_PERIOD_in_granularityClause1183);
                                qMeta.granularity.type = "period";
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:51: ( WS )?
                                int alt64 = 2;
                                int LA64_0 = input.LA(1);
                                if ((LA64_0 == WS)) {
                                    alt64 = 1;
                                }
                                switch (alt64) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:51: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1187);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_granularityClause1190);
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:62: ( WS )?
                                int alt65 = 2;
                                int LA65_0 = input.LA(1);
                                if ((LA65_0 == WS)) {
                                    alt65 = 1;
                                }
                                switch (alt65) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:62: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1192);
                                    }
                                    break;

                                }

                                per = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1197);
                                qMeta.granularity.setPeriod((per != null ? per.getText() : null));
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:132: ( WS )?
                                int alt66 = 2;
                                int LA66_0 = input.LA(1);
                                if ((LA66_0 == WS)) {
                                    alt66 = 1;
                                }
                                switch (alt66) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:132: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1201);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:136: ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )?
                                int alt68 = 2;
                                int LA68_0 = input.LA(1);
                                if ((LA68_0 == 72)) {
                                    int LA68_1 = input.LA(2);
                                    if ((LA68_1 == WS)) {
                                        int LA68_4 = input.LA(3);
                                        if ((LA68_4 == SINGLE_QUOTE_STRING)) {
                                            alt68 = 1;
                                        }
                                    } else if ((LA68_1 == SINGLE_QUOTE_STRING)) {
                                        alt68 = 1;
                                    }
                                }
                                switch (alt68) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:137: ',' ( WS )? tz= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 72, FOLLOW_72_in_granularityClause1205);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:141: ( WS )?
                                        int alt67 = 2;
                                        int LA67_0 = input.LA(1);
                                        if ((LA67_0 == WS)) {
                                            alt67 = 1;
                                        }
                                        switch (alt67) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:141: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1207);
                                            }
                                            break;

                                        }

                                        tz = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1212);
                                        qMeta.granularity.setTimeZone((tz != null ? tz.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:213: ( WS )?
                                int alt69 = 2;
                                int LA69_0 = input.LA(1);
                                if ((LA69_0 == WS)) {
                                    alt69 = 1;
                                }
                                switch (alt69) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:213: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1218);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:217: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
                                int alt71 = 2;
                                int LA71_0 = input.LA(1);
                                if ((LA71_0 == 72)) {
                                    int LA71_1 = input.LA(2);
                                    if ((LA71_1 == WS)) {
                                        int LA71_4 = input.LA(3);
                                        if ((LA71_4 == SINGLE_QUOTE_STRING)) {
                                            alt71 = 1;
                                        }
                                    } else if ((LA71_1 == SINGLE_QUOTE_STRING)) {
                                        alt71 = 1;
                                    }
                                }
                                switch (alt71) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:218: ',' ( WS )? orig= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 72, FOLLOW_72_in_granularityClause1222);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:222: ( WS )?
                                        int alt70 = 2;
                                        int LA70_0 = input.LA(1);
                                        if ((LA70_0 == WS)) {
                                            alt70 = 1;
                                        }
                                        switch (alt70) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:222: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1224);
                                            }
                                            break;

                                        }

                                        orig = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1229);
                                        qMeta.granularity.setOrigin((orig != null ? orig.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:296: ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )?
                                int alt75 = 2;
                                int LA75_0 = input.LA(1);
                                if ((LA75_0 == WS || LA75_0 == 72)) {
                                    alt75 = 1;
                                }
                                switch (alt75) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:297: ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )?
                                    {
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:297: ( WS )?
                                        int alt72 = 2;
                                        int LA72_0 = input.LA(1);
                                        if ((LA72_0 == WS)) {
                                            alt72 = 1;
                                        }
                                        switch (alt72) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:297: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1236);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_granularityClause1239);
                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:305: ( WS )?
                                        int alt73 = 2;
                                        int LA73_0 = input.LA(1);
                                        if ((LA73_0 == WS)) {
                                            int LA73_1 = input.LA(2);
                                            if ((LA73_1 == WS)) {
                                                alt73 = 1;
                                            }
                                        }
                                        switch (alt73) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:305: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1241);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_granularityInclude_in_granularityClause1244);
                                        granularityInclude(qMeta);
                                        state._fsp--;

                                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:335: ( WS )?
                                        int alt74 = 2;
                                        int LA74_0 = input.LA(1);
                                        if ((LA74_0 == WS)) {
                                            alt74 = 1;
                                        }
                                        switch (alt74) {
                                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:214:335: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1247);
                                            }
                                            break;

                                        }

                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_granularityClause1252);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:218:1: granularityInclude[QueryMeta qMeta] : ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) ;
    public final void granularityInclude(QueryMeta qMeta) throws RecognitionException {
        Pair<Integer> p1 = null;
        Pair<Integer> p2 = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:219:2: ( ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:4: WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN
                {
                    match(input, WS, FOLLOW_WS_in_granularityInclude1274);
                    match(input, INCLUDE, FOLLOW_INCLUDE_in_granularityInclude1276);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:15: ( WS )?
                    int alt78 = 2;
                    int LA78_0 = input.LA(1);
                    if ((LA78_0 == WS)) {
                        alt78 = 1;
                    }
                    switch (alt78) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:15: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude1278);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_granularityInclude1281);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:26: ( WS )?
                    int alt79 = 2;
                    int LA79_0 = input.LA(1);
                    if ((LA79_0 == WS)) {
                        alt79 = 1;
                    }
                    switch (alt79) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:26: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude1283);
                        }
                        break;

                    }

			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:30: (p1= pairNums ( ',' p2= pairNums )* )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:31: p1= pairNums ( ',' p2= pairNums )*
                    {
                        pushFollow(FOLLOW_pairNums_in_granularityInclude1289);
                        p1 = pairNums();
                        state._fsp--;

                        qMeta.microIntervals.add(p1);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:75: ( ',' p2= pairNums )*
                        loop80:
                        while (true) {
                            int alt80 = 2;
                            int LA80_0 = input.LA(1);
                            if ((LA80_0 == 72)) {
                                alt80 = 1;
                            }

                            switch (alt80) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:76: ',' p2= pairNums
                                {
                                    match(input, 72, FOLLOW_72_in_granularityInclude1294);
                                    pushFollow(FOLLOW_pairNums_in_granularityInclude1298);
                                    p2 = pairNums();
                                    state._fsp--;

                                    qMeta.microIntervals.add(p2);
                                }
                                break;

                                default:
                                    break loop80;
                            }
                        }

                    }

                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:127: ( WS )?
                    int alt81 = 2;
                    int LA81_0 = input.LA(1);
                    if ((LA81_0 == WS)) {
                        alt81 = 1;
                    }
                    switch (alt81) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:127: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude1305);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_granularityInclude1308);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:223:1: pairNums returns [Pair<Integer> pair] : ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) ;
    public final Pair<Integer> pairNums() throws RecognitionException {
        Pair<Integer> pair = null;

        Token i = null;
        Token j = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:2: ( ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:5: LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE
                {
                    match(input, LSQUARE, FOLLOW_LSQUARE_in_pairNums1327);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:13: ( WS )?
                    int alt82 = 2;
                    int LA82_0 = input.LA(1);
                    if ((LA82_0 == WS)) {
                        alt82 = 1;
                    }
                    switch (alt82) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:13: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1329);
                        }
                        break;

                    }

                    i = (Token) match(input, LONG, FOLLOW_LONG_in_pairNums1334);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:25: ( WS )?
                    int alt83 = 2;
                    int LA83_0 = input.LA(1);
                    if ((LA83_0 == WS)) {
                        alt83 = 1;
                    }
                    switch (alt83) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:25: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1337);
                        }
                        break;

                    }

                    match(input, 72, FOLLOW_72_in_pairNums1340);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:33: ( WS )?
                    int alt84 = 2;
                    int LA84_0 = input.LA(1);
                    if ((LA84_0 == WS)) {
                        alt84 = 1;
                    }
                    switch (alt84) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:33: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1342);
                        }
                        break;

                    }

                    j = (Token) match(input, LONG, FOLLOW_LONG_in_pairNums1347);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:44: ( WS )?
                    int alt85 = 2;
                    int LA85_0 = input.LA(1);
                    if ((LA85_0 == WS)) {
                        alt85 = 1;
                    }
                    switch (alt85) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:224:44: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1349);
                        }
                        break;

                    }

                    match(input, RSQUARE, FOLLOW_RSQUARE_in_pairNums1352);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:227:1: pairString returns [Pair<String> pair] : ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) ;
    public final Pair<String> pairString() throws RecognitionException {
        Pair<String> pair = null;

        Token i = null;
        Token j = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:2: ( ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:5: LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE
                {
                    match(input, LSQUARE, FOLLOW_LSQUARE_in_pairString1372);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:13: ( WS )?
                    int alt86 = 2;
                    int LA86_0 = input.LA(1);
                    if ((LA86_0 == WS)) {
                        alt86 = 1;
                    }
                    switch (alt86) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:13: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1374);
                        }
                        break;

                    }

                    i = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_pairString1379);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:40: ( WS )?
                    int alt87 = 2;
                    int LA87_0 = input.LA(1);
                    if ((LA87_0 == WS)) {
                        alt87 = 1;
                    }
                    switch (alt87) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:40: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1382);
                        }
                        break;

                    }

                    match(input, 72, FOLLOW_72_in_pairString1385);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:48: ( WS )?
                    int alt88 = 2;
                    int LA88_0 = input.LA(1);
                    if ((LA88_0 == WS)) {
                        alt88 = 1;
                    }
                    switch (alt88) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:48: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1387);
                        }
                        break;

                    }

                    j = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_pairString1392);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:74: ( WS )?
                    int alt89 = 2;
                    int LA89_0 = input.LA(1);
                    if ((LA89_0 == WS)) {
                        alt89 = 1;
                    }
                    switch (alt89) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:74: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1394);
                        }
                        break;

                    }

                    match(input, RSQUARE, FOLLOW_RSQUARE_in_pairString1397);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:235:1: havingClause returns [Having having] : h= complexHaving ;
    public final Having havingClause() throws RecognitionException {
        Having having = null;

        Having h = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:236:2: (h= complexHaving )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:236:4: h= complexHaving
            {
                pushFollow(FOLLOW_complexHaving_in_havingClause1422);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:239:1: simpleHaving returns [Having having] : ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) );
    public final Having simpleHaving() throws RecognitionException {
        Having having = null;

        Token a = null;
        Token t = null;
        Token v = null;
        Token n = null;
        EqualsToHolder e = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:2: ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) )
            int alt94 = 3;
            int LA94_0 = input.LA(1);
            if ((LA94_0 == ID)) {
                switch (input.LA(2)) {
                    case WS: {
                        int LA94_3 = input.LA(3);
                        if ((LA94_3 == COMPARE_OPER)) {
                            alt94 = 1;
                        } else if ((LA94_3 == EQUALS)) {
                            alt94 = 2;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 94, 3, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case COMPARE_OPER: {
                        alt94 = 1;
                    }
                    break;
                    case EQUALS: {
                        alt94 = 2;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 94, 1, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else if ((LA94_0 == NOT)) {
                alt94 = 3;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 94, 0, input);
                throw nvae;
            }

            switch (alt94) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:5: a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
                    {
                        a = (Token) match(input, ID, FOLLOW_ID_in_simpleHaving1443);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:10: ( WS )?
                        int alt90 = 2;
                        int LA90_0 = input.LA(1);
                        if ((LA90_0 == WS)) {
                            alt90 = 1;
                        }
                        switch (alt90) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:10: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1445);
                            }
                            break;

                        }

                        t = (Token) match(input, COMPARE_OPER, FOLLOW_COMPARE_OPER_in_simpleHaving1450);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:29: ( WS )?
                        int alt91 = 2;
                        int LA91_0 = input.LA(1);
                        if ((LA91_0 == WS)) {
                            alt91 = 1;
                        }
                        switch (alt91) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:29: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1452);
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
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:4: (e= getEquals )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:4: (e= getEquals )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:241:5: e= getEquals
                    {
                        pushFollow(FOLLOW_getEquals_in_simpleHaving1474);
                        e = getEquals();
                        state._fsp--;

                    }

                    having = new Having("=", e.name, e.value);
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:5: n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
                    {
                        n = (Token) match(input, NOT, FOLLOW_NOT_in_simpleHaving1485);
                        match(input, WS, FOLLOW_WS_in_simpleHaving1487);
                        a = (Token) match(input, ID, FOLLOW_ID_in_simpleHaving1491);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:19: ( WS )?
                        int alt92 = 2;
                        int LA92_0 = input.LA(1);
                        if ((LA92_0 == WS)) {
                            alt92 = 1;
                        }
                        switch (alt92) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:19: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1493);
                            }
                            break;

                        }

                        t = (Token) match(input, COMPARE_OPER, FOLLOW_COMPARE_OPER_in_simpleHaving1498);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:38: ( WS )?
                        int alt93 = 2;
                        int LA93_0 = input.LA(1);
                        if ((LA93_0 == WS)) {
                            alt93 = 1;
                        }
                        switch (alt93) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:242:38: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1500);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:245:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );
    public final Having complexHaving() throws RecognitionException {
        Having having = null;

        Token o = null;
        Having s = null;
        Having a = null;
        Having b = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:2: ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) )
            int alt95 = 2;
            alt95 = dfa95.predict(input);
            switch (alt95) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:4: (s= simpleHaving )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:4: (s= simpleHaving )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:246:5: s= simpleHaving
                    {
                        pushFollow(FOLLOW_simpleHaving_in_complexHaving1533);
                        s = simpleHaving();
                        state._fsp--;

                    }

                    having = s;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:247:5: a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving
                    {
                        pushFollow(FOLLOW_simpleHaving_in_complexHaving1544);
                        a = simpleHaving();
                        state._fsp--;

                        match(input, WS, FOLLOW_WS_in_complexHaving1546);
                        o = input.LT(1);
                        if (input.LA(1) == AND || input.LA(1) == OR) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        match(input, WS, FOLLOW_WS_in_complexHaving1556);
                        pushFollow(FOLLOW_complexHaving_in_complexHaving1560);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:255:1: selectorFilter returns [Filter filter] : e= getEquals ;
    public final Filter selectorFilter() throws RecognitionException {
        Filter filter = null;

        EqualsToHolder e = null;

        filter = new Filter("selector");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:2: (e= getEquals )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:257:4: e= getEquals
            {
                pushFollow(FOLLOW_getEquals_in_selectorFilter1597);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:266:1: regexFilter returns [Filter filter] : (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) ;
    public final Filter regexFilter() throws RecognitionException {
        Filter filter = null;

        Token a = null;
        Token b = null;

        filter = new Filter("regex");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:2: ( (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:5: a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING )
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_regexFilter1626);
                    match(input, WS, FOLLOW_WS_in_regexFilter1628);
                    match(input, LIKE, FOLLOW_LIKE_in_regexFilter1630);
                    match(input, WS, FOLLOW_WS_in_regexFilter1632);
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:24: ( SINGLE_QUOTE_STRING )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:268:25: SINGLE_QUOTE_STRING
                    {
                        b = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1638);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:277:1: simpleFilter returns [Filter filter] : ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) );
    public final Filter simpleFilter() throws RecognitionException {
        Filter filter = null;

        Filter a = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:278:2: ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) )
            int alt100 = 2;
            int LA100_0 = input.LA(1);
            if ((LA100_0 == ID)) {
                alt100 = 1;
            } else if ((LA100_0 == LPARAN)) {
                alt100 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 100, 0, input);
                throw nvae;
            }

            switch (alt100) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:278:4: (a= selectorFilter |a= regexFilter )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:278:4: (a= selectorFilter |a= regexFilter )
                    int alt96 = 2;
                    int LA96_0 = input.LA(1);
                    if ((LA96_0 == ID)) {
                        int LA96_1 = input.LA(2);
                        if ((LA96_1 == WS)) {
                            int LA96_2 = input.LA(3);
                            if ((LA96_2 == LIKE)) {
                                alt96 = 2;
                            } else if ((LA96_2 == EQUALS)) {
                                alt96 = 1;
                            } else {
                                int nvaeMark = input.mark();
                                try {
                                    for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                        input.consume();
                                    }
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 96, 2, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA96_1 == EQUALS)) {
                            alt96 = 1;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                input.consume();
                                NoViableAltException nvae
                                        = new NoViableAltException("", 96, 1, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 96, 0, input);
                        throw nvae;
                    }

                    switch (alt96) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:278:5: a= selectorFilter
                        {
                            pushFollow(FOLLOW_selectorFilter_in_simpleFilter1663);
                            a = selectorFilter();
                            state._fsp--;

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:278:24: a= regexFilter
                        {
                            pushFollow(FOLLOW_regexFilter_in_simpleFilter1669);
                            a = regexFilter();
                            state._fsp--;

                        }
                        break;

                    }

                    filter = a;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:6: LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN
                    {
                        match(input, LPARAN, FOLLOW_LPARAN_in_simpleFilter1679);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:13: ( WS )?
                        int alt97 = 2;
                        int LA97_0 = input.LA(1);
                        if ((LA97_0 == WS)) {
                            alt97 = 1;
                        }
                        switch (alt97) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:13: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleFilter1681);
                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:17: (a= selectorFilter |a= regexFilter )
                        int alt98 = 2;
                        int LA98_0 = input.LA(1);
                        if ((LA98_0 == ID)) {
                            int LA98_1 = input.LA(2);
                            if ((LA98_1 == WS)) {
                                int LA98_2 = input.LA(3);
                                if ((LA98_2 == LIKE)) {
                                    alt98 = 2;
                                } else if ((LA98_2 == EQUALS)) {
                                    alt98 = 1;
                                } else {
                                    int nvaeMark = input.mark();
                                    try {
                                        for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                            input.consume();
                                        }
                                        NoViableAltException nvae
                                                = new NoViableAltException("", 98, 2, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA98_1 == EQUALS)) {
                                alt98 = 1;
                            } else {
                                int nvaeMark = input.mark();
                                try {
                                    input.consume();
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 98, 1, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else {
                            NoViableAltException nvae
                                    = new NoViableAltException("", 98, 0, input);
                            throw nvae;
                        }

                        switch (alt98) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:18: a= selectorFilter
                            {
                                pushFollow(FOLLOW_selectorFilter_in_simpleFilter1687);
                                a = selectorFilter();
                                state._fsp--;

                            }
                            break;
                            case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:37: a= regexFilter
                            {
                                pushFollow(FOLLOW_regexFilter_in_simpleFilter1693);
                                a = regexFilter();
                                state._fsp--;

                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:52: ( WS )?
                        int alt99 = 2;
                        int LA99_0 = input.LA(1);
                        if ((LA99_0 == WS)) {
                            alt99 = 1;
                        }
                        switch (alt99) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:279:52: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleFilter1696);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_simpleFilter1699);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:282:1: simpleLogicalFilter returns [Filter filter] : ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) );
    public final Filter simpleLogicalFilter() throws RecognitionException {
        Filter filter = null;

        Token o = null;
        Filter a = null;
        Filter b = null;
        Filter s = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:2: ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) )
            int alt104 = 2;
            int LA104_0 = input.LA(1);
            if ((LA104_0 == ID || LA104_0 == NOT)) {
                alt104 = 1;
            } else if ((LA104_0 == LPARAN)) {
                switch (input.LA(2)) {
                    case WS: {
                        int LA104_4 = input.LA(3);
                        if ((LA104_4 == ID)) {
                            int LA104_8 = input.LA(4);
                            if ((LA104_8 == WS)) {
                                int LA104_13 = input.LA(5);
                                if ((LA104_13 == LIKE)) {
                                    int LA104_19 = input.LA(6);
                                    if ((LA104_19 == WS)) {
                                        alt104 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 104, 19, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA104_13 == EQUALS)) {
                                    int LA104_20 = input.LA(6);
                                    if ((LA104_20 == WS)) {
                                        alt104 = 1;
                                    } else if ((LA104_20 == FLOAT || LA104_20 == LONG || LA104_20 == SINGLE_QUOTE_STRING)) {
                                        alt104 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 104, 20, input);
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
                                                = new NoViableAltException("", 104, 13, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA104_8 == EQUALS)) {
                                int LA104_14 = input.LA(5);
                                if ((LA104_14 == WS)) {
                                    int LA104_21 = input.LA(6);
                                    if ((LA104_21 == FLOAT || LA104_21 == LONG || LA104_21 == SINGLE_QUOTE_STRING)) {
                                        alt104 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 104, 21, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA104_14 == FLOAT || LA104_14 == LONG || LA104_14 == SINGLE_QUOTE_STRING)) {
                                    int LA104_22 = input.LA(6);
                                    if ((LA104_22 == WS)) {
                                        alt104 = 1;
                                    } else if ((LA104_22 == RPARAN)) {
                                        alt104 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 104, 22, input);
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
                                                = new NoViableAltException("", 104, 14, input);
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
                                            = new NoViableAltException("", 104, 8, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA104_4 == LPARAN || LA104_4 == NOT)) {
                            alt104 = 2;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 104, 4, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case ID: {
                        int LA104_5 = input.LA(3);
                        if ((LA104_5 == WS)) {
                            int LA104_11 = input.LA(4);
                            if ((LA104_11 == LIKE)) {
                                int LA104_15 = input.LA(5);
                                if ((LA104_15 == WS)) {
                                    int LA104_23 = input.LA(6);
                                    if ((LA104_23 == SINGLE_QUOTE_STRING)) {
                                        alt104 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 104, 23, input);
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
                                                = new NoViableAltException("", 104, 15, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA104_11 == EQUALS)) {
                                int LA104_16 = input.LA(5);
                                if ((LA104_16 == WS)) {
                                    int LA104_24 = input.LA(6);
                                    if ((LA104_24 == FLOAT || LA104_24 == LONG || LA104_24 == SINGLE_QUOTE_STRING)) {
                                        alt104 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 104, 24, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA104_16 == FLOAT || LA104_16 == LONG || LA104_16 == SINGLE_QUOTE_STRING)) {
                                    int LA104_25 = input.LA(6);
                                    if ((LA104_25 == WS)) {
                                        alt104 = 1;
                                    } else if ((LA104_25 == RPARAN)) {
                                        alt104 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 104, 25, input);
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
                                                = new NoViableAltException("", 104, 16, input);
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
                                            = new NoViableAltException("", 104, 11, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA104_5 == EQUALS)) {
                            int LA104_12 = input.LA(4);
                            if ((LA104_12 == WS)) {
                                int LA104_17 = input.LA(5);
                                if ((LA104_17 == FLOAT || LA104_17 == LONG || LA104_17 == SINGLE_QUOTE_STRING)) {
                                    int LA104_26 = input.LA(6);
                                    if ((LA104_26 == WS)) {
                                        alt104 = 1;
                                    } else if ((LA104_26 == RPARAN)) {
                                        alt104 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 104, 26, input);
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
                                                = new NoViableAltException("", 104, 17, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA104_12 == FLOAT || LA104_12 == LONG || LA104_12 == SINGLE_QUOTE_STRING)) {
                                int LA104_18 = input.LA(5);
                                if ((LA104_18 == WS)) {
                                    int LA104_27 = input.LA(6);
                                    if ((LA104_27 == AND || LA104_27 == OR)) {
                                        alt104 = 2;
                                    } else if ((LA104_27 == RPARAN)) {
                                        alt104 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 104, 27, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA104_18 == RPARAN)) {
                                    alt104 = 1;
                                } else {
                                    int nvaeMark = input.mark();
                                    try {
                                        for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
                                            input.consume();
                                        }
                                        NoViableAltException nvae
                                                = new NoViableAltException("", 104, 18, input);
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
                                            = new NoViableAltException("", 104, 12, input);
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
                                        = new NoViableAltException("", 104, 5, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case LPARAN:
                    case NOT: {
                        alt104 = 2;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 104, 2, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 104, 0, input);
                throw nvae;
            }

            switch (alt104) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
                    int alt101 = 2;
                    int LA101_0 = input.LA(1);
                    if ((LA101_0 == ID || LA101_0 == LPARAN)) {
                        alt101 = 1;
                    } else if ((LA101_0 == NOT)) {
                        alt101 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 101, 0, input);
                        throw nvae;
                    }

                    switch (alt101) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
                        {
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:5: a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter
                            {
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1720);
                                a = simpleFilter();
                                state._fsp--;

                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1722);
                                o = input.LT(1);
                                if (input.LA(1) == AND || input.LA(1) == OR) {
                                    input.consume();
                                    state.errorRecovery = false;
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    throw mse;
                                }
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1732);
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1736);
                                b = simpleFilter();
                                state._fsp--;

                            }

                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:55: (o= NOT WS b= simpleFilter )
                        {
							// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:55: (o= NOT WS b= simpleFilter )
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:283:56: o= NOT WS b= simpleFilter
                            {
                                o = (Token) match(input, NOT, FOLLOW_NOT_in_simpleLogicalFilter1744);
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1746);
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1750);
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
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:291:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:291:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:291:5: LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN
                    {
                        match(input, LPARAN, FOLLOW_LPARAN_in_simpleLogicalFilter1763);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:291:12: ( WS )?
                        int alt102 = 2;
                        int LA102_0 = input.LA(1);
                        if ((LA102_0 == WS)) {
                            alt102 = 1;
                        }
                        switch (alt102) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:291:12: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1765);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter1770);
                        s = simpleLogicalFilter();
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:291:38: ( WS )?
                        int alt103 = 2;
                        int LA103_0 = input.LA(1);
                        if ((LA103_0 == WS)) {
                            alt103 = 1;
                        }
                        switch (alt103) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:291:38: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1772);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_simpleLogicalFilter1775);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:296:1: grandFilter returns [Filter filter] : (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? ;
    public final Filter grandFilter() throws RecognitionException {
        Filter filter = null;

        Token o = null;
        Filter a = null;
        Filter b = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:2: ( (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:4: (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )?
            {
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:4: (a= simpleFilter |a= simpleLogicalFilter )
                int alt105 = 2;
                alt105 = dfa105.predict(input);
                switch (alt105) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:5: a= simpleFilter
                    {
                        pushFollow(FOLLOW_simpleFilter_in_grandFilter1799);
                        a = simpleFilter();
                        state._fsp--;

                    }
                    break;
                    case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:22: a= simpleLogicalFilter
                    {
                        pushFollow(FOLLOW_simpleLogicalFilter_in_grandFilter1805);
                        a = simpleLogicalFilter();
                        state._fsp--;

                    }
                    break;

                }

                filter = a;
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:60: ( WS o= ( AND | OR ) WS b= grandFilter )?
                int alt106 = 2;
                int LA106_0 = input.LA(1);
                if ((LA106_0 == WS)) {
                    int LA106_1 = input.LA(2);
                    if ((LA106_1 == AND || LA106_1 == OR)) {
                        alt106 = 1;
                    }
                }
                switch (alt106) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:297:61: WS o= ( AND | OR ) WS b= grandFilter
                    {
                        match(input, WS, FOLLOW_WS_in_grandFilter1812);
                        o = input.LT(1);
                        if (input.LA(1) == AND || input.LA(1) == OR) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        match(input, WS, FOLLOW_WS_in_grandFilter1822);
                        pushFollow(FOLLOW_grandFilter_in_grandFilter1826);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:308:1: aggItemInSelect returns [AggItem aggItem] : aggCallSite[aggItem] ( WS AS WS x= ID )? ;
    public final AggItem aggItemInSelect() throws RecognitionException {
        AggItem aggItem = null;

        Token x = null;

        aggItem = new AggItem();
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:310:2: ( aggCallSite[aggItem] ( WS AS WS x= ID )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:310:4: aggCallSite[aggItem] ( WS AS WS x= ID )?
            {
                pushFollow(FOLLOW_aggCallSite_in_aggItemInSelect1863);
                aggCallSite(aggItem);
                state._fsp--;

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:310:25: ( WS AS WS x= ID )?
                int alt107 = 2;
                int LA107_0 = input.LA(1);
                if ((LA107_0 == WS)) {
                    int LA107_1 = input.LA(2);
                    if ((LA107_1 == AS)) {
                        alt107 = 1;
                    }
                }
                switch (alt107) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:310:26: WS AS WS x= ID
                    {
                        match(input, WS, FOLLOW_WS_in_aggItemInSelect1867);
                        match(input, AS, FOLLOW_AS_in_aggItemInSelect1869);
                        match(input, WS, FOLLOW_WS_in_aggItemInSelect1871);
                        x = (Token) match(input, ID, FOLLOW_ID_in_aggItemInSelect1875);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:312:1: aggCallSite[AggItem aggItem] : (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN ) | COUNT ( '(*)' ) );
    public final void aggCallSite(AggItem aggItem) throws RecognitionException {
        Token x = null;
        String p = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:2: (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN ) | COUNT ( '(*)' ) )
            int alt111 = 2;
            int LA111_0 = input.LA(1);
            if ((LA111_0 == DOUBLE_SUM || LA111_0 == JAVASCRIPT || LA111_0 == LONG_SUM || (LA111_0 >= MAX && LA111_0 <= MIN) || LA111_0 == UNIQUE)) {
                alt111 = 1;
            } else if ((LA111_0 == COUNT)) {
                alt111 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 111, 0, input);
                throw nvae;
            }

            switch (alt111) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:4: p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN )
                {
                    pushFollow(FOLLOW_aggFunc_in_aggCallSite1894);
                    p = aggFunc();
                    state._fsp--;

                    aggItem.setAggType(p);
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:39: ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:40: ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:40: ( WS )?
                        int alt108 = 2;
                        int LA108_0 = input.LA(1);
                        if ((LA108_0 == WS)) {
                            alt108 = 1;
                        }
                        switch (alt108) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:40: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite1899);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_aggCallSite1902);
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:51: ( WS )?
                        int alt109 = 2;
                        int LA109_0 = input.LA(1);
                        if ((LA109_0 == WS)) {
                            alt109 = 1;
                        }
                        switch (alt109) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:51: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite1904);
                            }
                            break;

                        }

					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:55: (x= ID )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:57: x= ID
                        {
                            x = (Token) match(input, ID, FOLLOW_ID_in_aggCallSite1911);
                            aggItem.setFieldName((x != null ? x.getText() : null));
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:96: ( WS )?
                        int alt110 = 2;
                        int LA110_0 = input.LA(1);
                        if ((LA110_0 == WS)) {
                            alt110 = 1;
                        }
                        switch (alt110) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:96: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite1916);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_aggCallSite1919);
                    }

                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:4: COUNT ( '(*)' )
                {
                    match(input, COUNT, FOLLOW_COUNT_in_aggCallSite1926);
                    aggItem.setAggType("count");
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:41: ( '(*)' )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:42: '(*)'
                    {
                        match(input, 70, FOLLOW_70_in_aggCallSite1931);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:317:1: aggFunc returns [String name] : ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT );
    public final String aggFunc() throws RecognitionException {
        String name = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:2: ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT )
            int alt112 = 6;
            switch (input.LA(1)) {
                case LONG_SUM: {
                    alt112 = 1;
                }
                break;
                case DOUBLE_SUM: {
                    alt112 = 2;
                }
                break;
                case UNIQUE: {
                    alt112 = 3;
                }
                break;
                case MIN: {
                    alt112 = 4;
                }
                break;
                case MAX: {
                    alt112 = 5;
                }
                break;
                case JAVASCRIPT: {
                    alt112 = 6;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 112, 0, input);
                    throw nvae;
            }
            switch (alt112) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:318:4: LONG_SUM
                {
                    match(input, LONG_SUM, FOLLOW_LONG_SUM_in_aggFunc1949);
                    name = "longSum";
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:319:4: DOUBLE_SUM
                {
                    match(input, DOUBLE_SUM, FOLLOW_DOUBLE_SUM_in_aggFunc1956);
                    name = "doubleSum";
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:320:4: UNIQUE
                {
                    match(input, UNIQUE, FOLLOW_UNIQUE_in_aggFunc1963);
                    name = "hyperUnique";
                }
                break;
                case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:321:4: MIN
                {
                    match(input, MIN, FOLLOW_MIN_in_aggFunc1970);
                    name = "min";
                }
                break;
                case 5: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:322:4: MAX
                {
                    match(input, MAX, FOLLOW_MAX_in_aggFunc1977);
                    name = "max";
                }
                break;
                case 6: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:323:4: JAVASCRIPT
                {
                    match(input, JAVASCRIPT, FOLLOW_JAVASCRIPT_in_aggFunc1984);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:329:1: postAggItem returns [PostAggItem postAggItem] : ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) );
    public final PostAggItem postAggItem() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem a = null;
        PostAggItem b = null;

        postAggItem = new PostAggItem("arithmetic");
        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:2: ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) )
            int alt122 = 2;
            int LA122_0 = input.LA(1);
            if ((LA122_0 == FLOAT || LA122_0 == ID || LA122_0 == JAVASCRIPT || LA122_0 == LONG || LA122_0 == UNIQUE)) {
                alt122 = 1;
            } else if ((LA122_0 == LPARAN)) {
                alt122 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 122, 0, input);
                throw nvae;
            }

            switch (alt122) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:5: a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                    {
                        pushFollow(FOLLOW_simpleArith_in_postAggItem2012);
                        a = simpleArith();
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:20: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                        int alt115 = 2;
                        int LA115_0 = input.LA(1);
                        if ((LA115_0 == WS)) {
                            int LA115_1 = input.LA(2);
                            if ((LA115_1 == ARITH_OPER)) {
                                alt115 = 1;
                            }
                        } else if ((LA115_0 == ARITH_OPER)) {
                            alt115 = 1;
                        }
                        switch (alt115) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:21: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:21: ( WS )?
                                int alt113 = 2;
                                int LA113_0 = input.LA(1);
                                if ((LA113_0 == WS)) {
                                    alt113 = 1;
                                }
                                switch (alt113) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:21: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2016);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggArithOper_in_postAggItem2019);
                                postAggArithOper(postAggItem);
                                state._fsp--;

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:55: ( WS )?
                                int alt114 = 2;
                                int LA114_0 = input.LA(1);
                                if ((LA114_0 == WS)) {
                                    alt114 = 1;
                                }
                                switch (alt114) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:55: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2022);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggItem_in_postAggItem2027);
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
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                    {
					// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN )
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:6: LPARAN ( WS )? a= postAggItem ( WS )? RPARAN
                        {
                            match(input, LPARAN, FOLLOW_LPARAN_in_postAggItem2045);
                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:13: ( WS )?
                            int alt116 = 2;
                            int LA116_0 = input.LA(1);
                            if ((LA116_0 == WS)) {
                                alt116 = 1;
                            }
                            switch (alt116) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:13: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_postAggItem2047);
                                }
                                break;

                            }

                            pushFollow(FOLLOW_postAggItem_in_postAggItem2052);
                            a = postAggItem();
                            state._fsp--;

                            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:31: ( WS )?
                            int alt117 = 2;
                            int LA117_0 = input.LA(1);
                            if ((LA117_0 == WS)) {
                                alt117 = 1;
                            }
                            switch (alt117) {
                                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:31: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_postAggItem2054);
                                }
                                break;

                            }

                            match(input, RPARAN, FOLLOW_RPARAN_in_postAggItem2057);
                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:43: ( postAggLabel[postAggItem] )?
                        int alt118 = 2;
                        int LA118_0 = input.LA(1);
                        if ((LA118_0 == AS)) {
                            alt118 = 1;
                        }
                        switch (alt118) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:44: postAggLabel[postAggItem]
                            {
                                pushFollow(FOLLOW_postAggLabel_in_postAggItem2061);
                                postAggLabel(postAggItem);
                                state._fsp--;

                            }
                            break;

                        }

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:72: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                        int alt121 = 2;
                        int LA121_0 = input.LA(1);
                        if ((LA121_0 == WS)) {
                            int LA121_1 = input.LA(2);
                            if ((LA121_1 == ARITH_OPER)) {
                                alt121 = 1;
                            }
                        } else if ((LA121_0 == ARITH_OPER)) {
                            alt121 = 1;
                        }
                        switch (alt121) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:73: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
                            {
                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:73: ( WS )?
                                int alt119 = 2;
                                int LA119_0 = input.LA(1);
                                if ((LA119_0 == WS)) {
                                    alt119 = 1;
                                }
                                switch (alt119) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:73: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2067);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggArithOper_in_postAggItem2070);
                                postAggArithOper(postAggItem);
                                state._fsp--;

                                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:107: ( WS )?
                                int alt120 = 2;
                                int LA120_0 = input.LA(1);
                                if ((LA120_0 == WS)) {
                                    alt120 = 1;
                                }
                                switch (alt120) {
                                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:338:107: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2073);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggItem_in_postAggItem2078);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:349:1: simpleArith returns [PostAggItem postAggItem] : (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? ;
    public final PostAggItem simpleArith() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem a = null;
        PostAggItem b = null;

        postAggItem = new PostAggItem("arithmetic");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:2: ( (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:4: (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:4: (a= simplePostAggAccess )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:5: a= simplePostAggAccess
                {
                    pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2114);
                    a = simplePostAggAccess();
                    state._fsp--;

                    postAggItem = a;
                }

                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
                int alt125 = 2;
                alt125 = dfa125.predict(input);
                switch (alt125) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:46: ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess
                    {
                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:46: ( WS )?
                        int alt123 = 2;
                        int LA123_0 = input.LA(1);
                        if ((LA123_0 == WS)) {
                            alt123 = 1;
                        }
                        switch (alt123) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:46: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleArith2120);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_postAggArithOper_in_simpleArith2123);
                        postAggArithOper(postAggItem);
                        state._fsp--;

                        // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:80: ( WS )?
                        int alt124 = 2;
                        int LA124_0 = input.LA(1);
                        if ((LA124_0 == WS)) {
                            alt124 = 1;
                        }
                        switch (alt124) {
                            case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:351:80: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleArith2126);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2131);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:363:1: simplePostAggAccess returns [PostAggItem postAggItem] : (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef );
    public final PostAggItem simplePostAggAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem c = null;
        PostAggItem f = null;
        PostAggItem h = null;
        PostAggItem js = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:2: (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef )
            int alt126 = 4;
            switch (input.LA(1)) {
                case FLOAT:
                case LONG: {
                    alt126 = 1;
                }
                break;
                case ID: {
                    alt126 = 2;
                }
                break;
                case UNIQUE: {
                    alt126 = 3;
                }
                break;
                case JAVASCRIPT: {
                    alt126 = 4;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 126, 0, input);
                    throw nvae;
            }
            switch (alt126) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:364:4: c= constantAccess
                {
                    pushFollow(FOLLOW_constantAccess_in_simplePostAggAccess2160);
                    c = constantAccess();
                    state._fsp--;

                    postAggItem = c;
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:4: f= fieldAccess
                {
                    pushFollow(FOLLOW_fieldAccess_in_simplePostAggAccess2177);
                    f = fieldAccess();
                    state._fsp--;

                    postAggItem = f;
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:366:4: h= hyperUniqueCardinality
                {
                    pushFollow(FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2190);
                    h = hyperUniqueCardinality();
                    state._fsp--;

                    postAggItem = h;
                }
                break;
                case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:4: js= postAggJavascriptDef
                {
                    pushFollow(FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2199);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:372:1: constantAccess returns [PostAggItem postAggItem] : ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) ;
    public final PostAggItem constantAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("constant");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:2: ( ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:5: (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )?
                {
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:5: (a= FLOAT |a= LONG )
                    int alt127 = 2;
                    int LA127_0 = input.LA(1);
                    if ((LA127_0 == FLOAT)) {
                        alt127 = 1;
                    } else if ((LA127_0 == LONG)) {
                        alt127 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 127, 0, input);
                        throw nvae;
                    }

                    switch (alt127) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:6: a= FLOAT
                        {
                            a = (Token) match(input, FLOAT, FOLLOW_FLOAT_in_constantAccess2229);
                        }
                        break;
                        case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:16: a= LONG
                        {
                            a = (Token) match(input, LONG, FOLLOW_LONG_in_constantAccess2235);
                        }
                        break;

                    }

                    postAggItem.constantValue = Double.valueOf((a != null ? a.getText() : null));
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:5: ( WS postAggLabel[postAggItem] )?
                    int alt128 = 2;
                    int LA128_0 = input.LA(1);
                    if ((LA128_0 == WS)) {
                        int LA128_1 = input.LA(2);
                        if ((LA128_1 == AS)) {
                            alt128 = 1;
                        }
                    }
                    switch (alt128) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:376:6: WS postAggLabel[postAggItem]
                        {
                            match(input, WS, FOLLOW_WS_in_constantAccess2248);
                            pushFollow(FOLLOW_postAggLabel_in_constantAccess2250);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:1: fieldAccess returns [PostAggItem postAggItem] : (a= ID ( WS postAggLabel[postAggItem] )? ) ;
    public final PostAggItem fieldAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("fieldAccess");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:2: ( (a= ID ( WS postAggLabel[postAggItem] )? ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:4: (a= ID ( WS postAggLabel[postAggItem] )? )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:4: (a= ID ( WS postAggLabel[postAggItem] )? )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:5: a= ID ( WS postAggLabel[postAggItem] )?
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_fieldAccess2278);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:10: ( WS postAggLabel[postAggItem] )?
                    int alt129 = 2;
                    int LA129_0 = input.LA(1);
                    if ((LA129_0 == WS)) {
                        int LA129_1 = input.LA(2);
                        if ((LA129_1 == AS)) {
                            alt129 = 1;
                        }
                    }
                    switch (alt129) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:381:11: WS postAggLabel[postAggItem]
                        {
                            match(input, WS, FOLLOW_WS_in_fieldAccess2281);
                            pushFollow(FOLLOW_postAggLabel_in_fieldAccess2283);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:384:1: hyperUniqueCardinality returns [PostAggItem postAggItem] : ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) ;
    public final PostAggItem hyperUniqueCardinality() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("hyperUniqueCardinality");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:2: ( ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:5: UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN
                {
                    match(input, UNIQUE, FOLLOW_UNIQUE_in_hyperUniqueCardinality2312);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:12: ( WS )?
                    int alt130 = 2;
                    int LA130_0 = input.LA(1);
                    if ((LA130_0 == WS)) {
                        alt130 = 1;
                    }
                    switch (alt130) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:12: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality2314);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_hyperUniqueCardinality2317);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:23: ( WS )?
                    int alt131 = 2;
                    int LA131_0 = input.LA(1);
                    if ((LA131_0 == WS)) {
                        alt131 = 1;
                    }
                    switch (alt131) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:23: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality2319);
                        }
                        break;

                    }

                    a = (Token) match(input, ID, FOLLOW_ID_in_hyperUniqueCardinality2324);
                    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:32: ( WS )?
                    int alt132 = 2;
                    int LA132_0 = input.LA(1);
                    if ((LA132_0 == WS)) {
                        alt132 = 1;
                    }
                    switch (alt132) {
                        case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:32: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality2326);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_hyperUniqueCardinality2329);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:391:1: postAggJavascriptDef returns [PostAggItem postAggItem] : JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING ;
    public final PostAggItem postAggJavascriptDef() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token str = null;

        postAggItem = new PostAggItem("javascript");
        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:2: ( JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:4: JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING
            {
                match(input, JAVASCRIPT, FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2355);
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:15: ( WS )?
                int alt133 = 2;
                int LA133_0 = input.LA(1);
                if ((LA133_0 == WS)) {
                    alt133 = 1;
                }
                switch (alt133) {
                    case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:15: WS
                    {
                        match(input, WS, FOLLOW_WS_in_postAggJavascriptDef2357);
                    }
                    break;

                }

                str = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2362);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:396:1: postAggLabel[PostAggItem postAggItem] : ( AS WS id= ID ) ;
    public final void postAggLabel(PostAggItem postAggItem) throws RecognitionException {
        Token id = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:2: ( ( AS WS id= ID ) )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:4: ( AS WS id= ID )
            {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:4: ( AS WS id= ID )
                // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:397:5: AS WS id= ID
                {
                    match(input, AS, FOLLOW_AS_in_postAggLabel2378);
                    match(input, WS, FOLLOW_WS_in_postAggLabel2380);
                    id = (Token) match(input, ID, FOLLOW_ID_in_postAggLabel2384);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:400:1: postAggArithOper[PostAggItem postAggItem] : arith= ARITH_OPER ;
    public final void postAggArithOper(PostAggItem postAggItem) throws RecognitionException {
        Token arith = null;

        try {
			// /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:401:2: (arith= ARITH_OPER )
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:401:3: arith= ARITH_OPER
            {
                arith = (Token) match(input, ARITH_OPER, FOLLOW_ARITH_OPER_in_postAggArithOper2400);
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
    // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:406:1: isoTime returns [String date] : (d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ );
    public final druidGParser.isoTime_return isoTime() throws RecognitionException {
        druidGParser.isoTime_return retval = new druidGParser.isoTime_return();
        retval.start = input.LT(1);

        Token d = null;

        try {
            // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:2: (d= DATE |d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ )
            int alt134 = 7;
            switch (input.LA(1)) {
                case DATE: {
                    alt134 = 1;
                }
                break;
                case DATE_HOUR: {
                    alt134 = 2;
                }
                break;
                case DATE_HOUR_MIN: {
                    alt134 = 3;
                }
                break;
                case DATE_HOUR_MIN_SEC: {
                    alt134 = 4;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB: {
                    alt134 = 5;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB_TZ: {
                    alt134 = 6;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB_UTC_TZ: {
                    alt134 = 7;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 134, 0, input);
                    throw nvae;
            }
            switch (alt134) {
                case 1: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:407:3: d= DATE
                {
                    d = (Token) match(input, DATE, FOLLOW_DATE_in_isoTime2419);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 2: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:408:3: d= DATE_HOUR
                {
                    d = (Token) match(input, DATE_HOUR, FOLLOW_DATE_HOUR_in_isoTime2427);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 3: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:409:3: d= DATE_HOUR_MIN
                {
                    d = (Token) match(input, DATE_HOUR_MIN, FOLLOW_DATE_HOUR_MIN_in_isoTime2435);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 4: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:410:3: d= DATE_HOUR_MIN_SEC
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC, FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2443);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 5: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:411:3: d= DATE_HOUR_MIN_SEC_SUB
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB, FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2451);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 6: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:412:3: d= DATE_HOUR_MIN_SEC_SUB_TZ
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB_TZ, FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2459);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 7: // /Users/srikalyan/publicSql4D/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:413:3: d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB_UTC_TZ, FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2467);
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
    protected DFA95 dfa95 = new DFA95(this);
    protected DFA105 dfa105 = new DFA105(this);
    protected DFA125 dfa125 = new DFA125(this);
    static final String DFA95_eotS
            = "\140\uffff";
    static final String DFA95_eofS
            = "\140\uffff";
    static final String DFA95_minS
            = "\1\41\1\13\1\105\1\13\2\33\1\41\3\33\1\72\1\33\1\72\1\13\1\33\1\72\1\33"
            + "\2\72\1\4\1\uffff\1\72\1\4\1\uffff\1\13\1\33\1\72\1\4\1\uffff\1\72\1\4"
            + "\1\uffff\1\4\11\uffff\1\4\11\uffff\2\33\1\72\51\uffff";
    static final String DFA95_maxS
            = "\1\60\2\105\1\30\2\105\1\41\2\105\1\51\1\105\1\75\2\105\1\51\1\105\1\75"
            + "\2\105\1\104\1\uffff\1\105\1\104\1\uffff\1\13\2\105\1\104\1\uffff\1\105"
            + "\1\104\1\uffff\1\104\11\uffff\1\104\11\uffff\1\105\1\51\1\105\51\uffff";
    static final String DFA95_acceptS
            = "\24\uffff\1\1\23\uffff\1\2\16\uffff\1\1\11\uffff\1\1\31\uffff\4\1\1\uffff";
    static final String DFA95_specialS
            = "\140\uffff}>";
    static final String[] DFA95_transitionS = {
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
        "\1\24\12\uffff\1\23",
        "\1\25\15\uffff\1\25\23\uffff\1\25",
        "\1\24\12\uffff\1\26",
        "\1\31\71\uffff\1\30",
        "\1\32\15\uffff\1\32",
        "\1\24\12\uffff\1\33",
        "\1\35\15\uffff\1\35\23\uffff\1\35",
        "\1\24\12\uffff\1\36",
        "\1\24\12\uffff\1\40",
        "\1\50\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"
        + "\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "\1\24\12\uffff\1\52",
        "\1\50\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"
        + "\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "\1\64",
        "\1\66\15\uffff\1\66\33\uffff\1\65",
        "\1\24\12\uffff\1\67",
        "\1\50\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"
        + "\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "\1\24\12\uffff\1\101",
        "\1\50\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"
        + "\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "\1\50\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"
        + "\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        "\1\50\33\uffff\1\24\3\uffff\1\24\1\uffff\1\24\1\uffff\1\24\14\uffff"
        + "\1\50\1\24\2\uffff\2\24\5\uffff\1\24\3\uffff\1\24",
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

    static final short[] DFA95_eot = DFA.unpackEncodedString(DFA95_eotS);
    static final short[] DFA95_eof = DFA.unpackEncodedString(DFA95_eofS);
    static final char[] DFA95_min = DFA.unpackEncodedStringToUnsignedChars(DFA95_minS);
    static final char[] DFA95_max = DFA.unpackEncodedStringToUnsignedChars(DFA95_maxS);
    static final short[] DFA95_accept = DFA.unpackEncodedString(DFA95_acceptS);
    static final short[] DFA95_special = DFA.unpackEncodedString(DFA95_specialS);
    static final short[][] DFA95_transition;

    static {
        int numStates = DFA95_transitionS.length;
        DFA95_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA95_transition[i] = DFA.unpackEncodedString(DFA95_transitionS[i]);
        }
    }

    protected class DFA95 extends DFA {

        public DFA95(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 95;
            this.eot = DFA95_eot;
            this.eof = DFA95_eof;
            this.min = DFA95_min;
            this.max = DFA95_max;
            this.accept = DFA95_accept;
            this.special = DFA95_special;
            this.transition = DFA95_transition;
        }

        @Override
        public String getDescription() {
            return "245:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );";
        }
    }

    static final String DFA105_eotS
            = "\142\uffff";
    static final String DFA105_eofS
            = "\142\uffff";
    static final String DFA105_minS
            = "\1\41\1\30\1\41\1\uffff\1\30\1\33\1\41\1\30\2\uffff\1\105\2\33\1\72\1"
            + "\30\2\uffff\1\30\1\33\1\75\1\33\2\72\1\4\1\uffff\1\30\1\33\1\105\2\33"
            + "\3\72\1\4\1\uffff\1\4\1\uffff\1\105\11\uffff\1\105\2\33\1\72\1\75\1\33"
            + "\2\72\1\4\1\72\51\uffff";
    static final String DFA105_maxS
            = "\1\60\2\105\1\uffff\1\47\1\105\1\60\1\105\2\uffff\2\105\1\75\2\105\2\uffff"
            + "\1\47\1\105\2\75\2\105\1\104\1\uffff\1\47\3\105\1\75\3\105\1\104\1\uffff"
            + "\1\104\1\uffff\1\105\11\uffff\2\105\1\75\1\105\2\75\2\105\1\72\1\105\51"
            + "\uffff";
    static final String DFA105_acceptS
            = "\3\uffff\1\2\24\uffff\1\1\40\uffff\1\1\1\uffff\1\1\1\uffff\1\1\11\uffff"
            + "\1\1\11\uffff\15\1\1\uffff\2\1\1\uffff";
    static final String DFA105_specialS
            = "\142\uffff}>";
    static final String[] DFA105_transitionS = {
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
        "\1\45\4\uffff\1\30\23\uffff\1\30\2\uffff\1\30\3\uffff\1\30\1\uffff\1"
        + "\30\1\uffff\1\30\14\uffff\1\45\1\30\2\uffff\2\30\5\uffff\1\30\3\uffff"
        + "\1\30",
        "",
        "\1\60\16\uffff\1\57",
        "\1\62\15\uffff\1\62\23\uffff\1\62\7\uffff\1\61",
        "\1\63",
        "\1\65\15\uffff\1\65\23\uffff\1\65\7\uffff\1\64",
        "\1\66\15\uffff\1\66\23\uffff\1\66",
        "\1\70\12\uffff\1\67",
        "\1\30\12\uffff\1\71",
        "\1\30\12\uffff\1\73",
        "\1\75\4\uffff\1\30\23\uffff\1\30\2\uffff\1\30\3\uffff\1\30\1\uffff\1"
        + "\30\1\uffff\1\30\14\uffff\1\75\1\30\2\uffff\2\30\5\uffff\1\30\3\uffff"
        + "\1\30",
        "",
        "\1\107\4\uffff\1\30\23\uffff\1\30\2\uffff\1\30\3\uffff\1\30\1\uffff"
        + "\1\30\1\uffff\1\30\14\uffff\1\107\1\30\2\uffff\2\30\5\uffff\1\30\3\uffff"
        + "\1\30",
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
        "\1\3\60\uffff\1\3\4\uffff\1\137",
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

    static final short[] DFA105_eot = DFA.unpackEncodedString(DFA105_eotS);
    static final short[] DFA105_eof = DFA.unpackEncodedString(DFA105_eofS);
    static final char[] DFA105_min = DFA.unpackEncodedStringToUnsignedChars(DFA105_minS);
    static final char[] DFA105_max = DFA.unpackEncodedStringToUnsignedChars(DFA105_maxS);
    static final short[] DFA105_accept = DFA.unpackEncodedString(DFA105_acceptS);
    static final short[] DFA105_special = DFA.unpackEncodedString(DFA105_specialS);
    static final short[][] DFA105_transition;

    static {
        int numStates = DFA105_transitionS.length;
        DFA105_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA105_transition[i] = DFA.unpackEncodedString(DFA105_transitionS[i]);
        }
    }

    protected class DFA105 extends DFA {

        public DFA105(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 105;
            this.eot = DFA105_eot;
            this.eof = DFA105_eof;
            this.min = DFA105_min;
            this.max = DFA105_max;
            this.accept = DFA105_accept;
            this.special = DFA105_special;
            this.transition = DFA105_transition;
        }

        @Override
        public String getDescription() {
            return "297:4: (a= simpleFilter |a= simpleLogicalFilter )";
        }
    }

    static final String DFA125_eotS
            = "\130\uffff";
    static final String DFA125_eofS
            = "\130\uffff";
    static final String DFA125_minS
            = "\2\5\1\33\4\uffff\1\33\1\uffff\1\33\3\uffff\1\53\1\75\1\uffff\1\33\3\uffff"
            + "\1\53\1\75\4\uffff\1\53\1\75\1\uffff\1\53\1\41\1\75\4\uffff\1\53\1\75"
            + "\1\uffff\1\53\1\41\1\75\1\uffff\1\53\1\41\1\75\1\uffff\2\41\1\72\1\uffff"
            + "\1\53\1\41\1\75\1\uffff\2\41\1\72\1\uffff\2\41\1\72\1\uffff\1\41\3\72"
            + "\25\uffff";
    static final String DFA125_maxS
            = "\1\105\1\104\1\105\4\uffff\1\105\1\uffff\1\102\3\uffff\2\105\1\uffff\1"
            + "\102\3\uffff\2\105\4\uffff\2\105\1\uffff\1\53\1\105\1\75\4\uffff\2\105"
            + "\1\uffff\1\53\1\105\1\75\1\uffff\1\53\1\105\1\75\1\uffff\1\105\1\41\1"
            + "\105\1\uffff\1\53\1\105\1\75\1\uffff\1\105\1\41\1\105\1\uffff\1\105\1"
            + "\41\1\105\1\uffff\1\41\2\105\1\72\25\uffff";
    static final String DFA125_acceptS
            = "\3\uffff\1\2\6\uffff\3\1\4\uffff\3\1\3\uffff\3\1\6\uffff\4\1\6\uffff\1"
            + "\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\4\uffff"
            + "\25\1";
    static final String DFA125_specialS
            = "\130\uffff}>";
    static final String[] DFA125_transitionS = {
        "\1\2\64\uffff\1\3\12\uffff\1\1",
        "\1\7\32\uffff\1\3\3\uffff\1\3\1\uffff\1\3\22\uffff\2\3\11\uffff\1\3",
        "\1\12\5\uffff\1\14\1\uffff\1\16\5\uffff\1\13\1\uffff\1\3\26\uffff\1"
        + "\15\2\uffff\1\11",
        "",
        "",
        "",
        "",
        "\1\21\5\uffff\1\23\1\uffff\1\25\5\uffff\1\22\1\uffff\1\3\26\uffff\1"
        + "\24\2\uffff\1\20",
        "",
        "\1\27\5\uffff\1\31\1\uffff\1\33\5\uffff\1\30\1\uffff\1\3\26\uffff\1"
        + "\32",
        "",
        "",
        "",
        "\1\36\31\uffff\1\35",
        "\1\40\7\uffff\1\37",
        "",
        "\1\41\5\uffff\1\43\1\uffff\1\45\5\uffff\1\42\1\uffff\1\3\26\uffff\1"
        + "\44",
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

    static final short[] DFA125_eot = DFA.unpackEncodedString(DFA125_eotS);
    static final short[] DFA125_eof = DFA.unpackEncodedString(DFA125_eofS);
    static final char[] DFA125_min = DFA.unpackEncodedStringToUnsignedChars(DFA125_minS);
    static final char[] DFA125_max = DFA.unpackEncodedStringToUnsignedChars(DFA125_maxS);
    static final short[] DFA125_accept = DFA.unpackEncodedString(DFA125_acceptS);
    static final short[] DFA125_special = DFA.unpackEncodedString(DFA125_specialS);
    static final short[][] DFA125_transition;

    static {
        int numStates = DFA125_transitionS.length;
        DFA125_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA125_transition[i] = DFA.unpackEncodedString(DFA125_transitionS[i]);
        }
    }

    protected class DFA125 extends DFA {

        public DFA125(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 125;
            this.eot = DFA125_eot;
            this.eof = DFA125_eof;
            this.min = DFA125_min;
            this.max = DFA125_max;
            this.accept = DFA125_accept;
            this.special = DFA125_special;
            this.transition = DFA125_transition;
        }

        @Override
        public String getDescription() {
            return "351:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?";
        }
    }

    public static final BitSet FOLLOW_statement_in_program42 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program52 = new BitSet(new long[]{0x0200005000000000L});
    public static final BitSet FOLLOW_set_in_program56 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program66 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_program69 = new BitSet(new long[]{0x1000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program71 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_statement_in_program77 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program82 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_program85 = new BitSet(new long[]{0x0008000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program87 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_ON_in_program90 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program92 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_program95 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program97 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_program103 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_program108 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_program111 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program113 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_program118 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_program124 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_program127 = new BitSet(new long[]{0x0010000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_program129 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_OPT_SEMI_COLON_in_program134 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_statement160 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement188 = new BitSet(new long[]{0x0000640A00402000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_selectItems_in_statement190 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement194 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_statement197 = new BitSet(new long[]{0x0000640A00402000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_statement199 = new BitSet(new long[]{0x0000640A00402000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_selectItems_in_statement202 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement233 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_statement235 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement250 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FROM_in_statement252 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement254 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement258 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement274 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_statement276 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement278 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000200L});
    public static final BitSet FOLLOW_whereClause_in_statement280 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement297 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BREAK_in_statement299 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement301 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_statement303 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement305 = new BitSet(new long[]{0x2080000000800000L});
    public static final BitSet FOLLOW_granularityClause_in_statement307 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement318 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GROUP_in_statement320 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement322 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_statement324 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement326 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement352 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement384 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_statement387 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement389 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement394 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement451 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAVING_in_statement453 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement455 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_havingClause_in_statement459 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement503 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ORDER_in_statement505 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement507 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_statement509 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement511 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement516 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement549 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_set_in_statement553 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement603 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LIMIT_in_statement605 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement607 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LONG_in_statement612 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement650 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_THEN_in_statement652 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement654 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_statement658 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement673 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000010L});
    public static final BitSet FOLLOW_WHICH_in_statement675 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement677 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CONTAINS_in_statement679 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement683 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_statement686 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement688 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement694 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement698 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_statement701 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement703 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement708 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement715 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_statement718 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement724 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SORT_in_statement726 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement728 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_statement731 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement733 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement739 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement744 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_statement747 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement759 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_HINT_in_statement761 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement763 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_statement766 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement768 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement773 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement777 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_statement780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggItemInSelect_in_selectItems811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleDim_in_selectItems819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleDim835 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleDim838 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_simpleDim840 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleDim842 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_simpleDim846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intervalClause_in_whereClause867 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_whereClause871 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_whereClause873 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_whereClause875 = new BitSet(new long[]{0x0001080200000000L});
    public static final BitSet FOLLOW_grandFilter_in_whereClause879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_intervalClause898 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause900 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BETWEEN_in_intervalClause902 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause904 = new BitSet(new long[]{0x20000800001FC000L});
    public static final BitSet FOLLOW_isoTime_in_intervalClause924 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause931 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause935 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_intervalClause937 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause939 = new BitSet(new long[]{0x20000000001FC000L});
    public static final BitSet FOLLOW_isoTime_in_intervalClause944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_intervalClause976 = new BitSet(new long[]{0x0000100000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause978 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairString_in_intervalClause983 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_intervalClause995 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_intervalClause998 = new BitSet(new long[]{0x0000100000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause1000 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairString_in_intervalClause1005 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_intervalClause1011 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_intervalClause1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getEquals1037 = new BitSet(new long[]{0x0000000001000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_getEquals1039 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EQUALS_in_getEquals1042 = new BitSet(new long[]{0x2000020008000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_getEquals1044 = new BitSet(new long[]{0x2000020008000000L});
    public static final BitSet FOLLOW_set_in_getEquals1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_granularityClause1112 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1116 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityClause1119 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1121 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1126 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1130 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityClause1134 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1136 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1141 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1148 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_granularityClause1151 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1153 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_granularityInclude_in_granularityClause1156 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1159 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_granularityClause1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_granularityClause1183 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1187 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityClause1190 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1192 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1197 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1201 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityClause1205 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1207 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1212 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1218 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityClause1222 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1224 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1229 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1236 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_granularityClause1239 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1241 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_granularityInclude_in_granularityClause1244 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1247 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_granularityClause1252 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1274 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INCLUDE_in_granularityInclude1276 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1278 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityInclude1281 = new BitSet(new long[]{0x0000100000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1283 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairNums_in_granularityInclude1289 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityInclude1294 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairNums_in_granularityInclude1298 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1305 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_granularityInclude1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_pairNums1327 = new BitSet(new long[]{0x0000020000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairNums1329 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LONG_in_pairNums1334 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_pairNums1337 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_pairNums1340 = new BitSet(new long[]{0x0000020000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairNums1342 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LONG_in_pairNums1347 = new BitSet(new long[]{0x0800000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairNums1349 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_pairNums1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_pairString1372 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairString1374 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1379 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_pairString1382 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_pairString1385 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairString1387 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1392 = new BitSet(new long[]{0x0800000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairString1394 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_pairString1397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexHaving_in_havingClause1422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleHaving1443 = new BitSet(new long[]{0x0000000000000800L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1445 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1450 = new BitSet(new long[]{0x0000020008000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1452 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_set_in_simpleHaving1457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getEquals_in_simpleHaving1474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_simpleHaving1485 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1487 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_simpleHaving1491 = new BitSet(new long[]{0x0000000000000800L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1493 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1498 = new BitSet(new long[]{0x0000020008000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1500 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_set_in_simpleHaving1505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleHaving_in_complexHaving1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleHaving_in_complexHaving1544 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_complexHaving1546 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_complexHaving1550 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_complexHaving1556 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_complexHaving_in_complexHaving1560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getEquals_in_selectorFilter1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_regexFilter1626 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_regexFilter1628 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LIKE_in_regexFilter1630 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_regexFilter1632 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectorFilter_in_simpleFilter1663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexFilter_in_simpleFilter1669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_simpleFilter1679 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleFilter1681 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_selectorFilter_in_simpleFilter1687 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_regexFilter_in_simpleFilter1693 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleFilter1696 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_simpleFilter1699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1720 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1722 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_simpleLogicalFilter1726 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1732 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_simpleLogicalFilter1744 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1746 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_simpleLogicalFilter1763 = new BitSet(new long[]{0x0001080200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1765 = new BitSet(new long[]{0x0001080200000000L});
    public static final BitSet FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter1770 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1772 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_simpleLogicalFilter1775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleFilter_in_grandFilter1799 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_simpleLogicalFilter_in_grandFilter1805 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_grandFilter1812 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_grandFilter1816 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_grandFilter1822 = new BitSet(new long[]{0x0001080200000000L});
    public static final BitSet FOLLOW_grandFilter_in_grandFilter1826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggCallSite_in_aggItemInSelect1863 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggItemInSelect1867 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_aggItemInSelect1869 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggItemInSelect1871 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_aggItemInSelect1875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggFunc_in_aggCallSite1894 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggCallSite1899 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_aggCallSite1902 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggCallSite1904 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_aggCallSite1911 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggCallSite1916 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_aggCallSite1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_aggCallSite1926 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_aggCallSite1931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_SUM_in_aggFunc1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_SUM_in_aggFunc1956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_aggFunc1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_aggFunc1970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_aggFunc1977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JAVASCRIPT_in_aggFunc1984 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleArith_in_postAggItem2012 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggItem2016 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_postAggItem2019 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_postAggItem2022 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem2027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_postAggItem2045 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_postAggItem2047 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem2052 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggItem2054 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_postAggItem2057 = new BitSet(new long[]{0x0000000000000062L, 0x0000000000000020L});
    public static final BitSet FOLLOW_postAggLabel_in_postAggItem2061 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggItem2067 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_postAggItem2070 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_postAggItem2073 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem2078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2114 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleArith2120 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_simpleArith2123 = new BitSet(new long[]{0x0000020A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_simpleArith2126 = new BitSet(new long[]{0x0000020A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantAccess_in_simplePostAggAccess2160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_simplePostAggAccess2177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constantAccess2229 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_LONG_in_constantAccess2235 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_constantAccess2248 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_postAggLabel_in_constantAccess2250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fieldAccess2278 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_fieldAccess2281 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_postAggLabel_in_fieldAccess2283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_hyperUniqueCardinality2312 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2314 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_hyperUniqueCardinality2317 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2319 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_hyperUniqueCardinality2324 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2326 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_hyperUniqueCardinality2329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2355 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggJavascriptDef2357 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_postAggLabel2378 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggLabel2380 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_postAggLabel2384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_OPER_in_postAggArithOper2400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_in_isoTime2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_in_isoTime2427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_in_isoTime2435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2467 = new BitSet(new long[]{0x0000000000000002L});
}
