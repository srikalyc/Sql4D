// $ANTLR 3.5 /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g 2014-09-18 22:22:15
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
        return "/Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g";
    }

	// $ANTLR start "program"
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:35:1: program returns [Program program] : (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? ) ( OPT_SEMI_COLON )? ;
    public final Program program() throws RecognitionException {
        Program program = null;

        Token j = null;
        Token a = null;
        QueryMeta s1 = null;
        QueryMeta s2 = null;

        program = new Program();
        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:2: ( (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? ) ( OPT_SEMI_COLON )? )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:4: (s1= statement ) ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? ) ( OPT_SEMI_COLON )?
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:4: (s1= statement )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:37:5: s1= statement
                {
                    pushFollow(FOLLOW_statement_in_program42);
                    s1 = statement();
                    state._fsp--;

                }

                program.listOfQueries.add(s1);
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:4: ( WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )? )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:5: WS j= ( JOIN | LEFT_JOIN | RIGHT_JOIN ) ( WS )? LPARAN ( WS )? (s2= statement ) ( WS )? RPARAN ( WS )? ON ( WS )? LPARAN ( WS )? (a= ID ) ( ( WS )? ',' ( WS )? a= ID )* ( WS )? RPARAN ( WS )?
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
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:86: ( WS )?
                    int alt1 = 2;
                    int LA1_0 = input.LA(1);
                    if ((LA1_0 == WS)) {
                        alt1 = 1;
                    }
                    switch (alt1) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:86: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program66);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_program69);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:97: ( WS )?
                    int alt2 = 2;
                    int LA2_0 = input.LA(1);
                    if ((LA2_0 == WS)) {
                        alt2 = 1;
                    }
                    switch (alt2) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:97: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program71);
                        }
                        break;

                    }

			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:101: (s2= statement )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:102: s2= statement
                    {
                        pushFollow(FOLLOW_statement_in_program77);
                        s2 = statement();
                        state._fsp--;

                    }

                    program.listOfQueries.add(s2);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:149: ( WS )?
                    int alt3 = 2;
                    int LA3_0 = input.LA(1);
                    if ((LA3_0 == WS)) {
                        alt3 = 1;
                    }
                    switch (alt3) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:149: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program82);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_program85);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:160: ( WS )?
                    int alt4 = 2;
                    int LA4_0 = input.LA(1);
                    if ((LA4_0 == WS)) {
                        alt4 = 1;
                    }
                    switch (alt4) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:160: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program87);
                        }
                        break;

                    }

                    match(input, ON, FOLLOW_ON_in_program90);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:167: ( WS )?
                    int alt5 = 2;
                    int LA5_0 = input.LA(1);
                    if ((LA5_0 == WS)) {
                        alt5 = 1;
                    }
                    switch (alt5) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:167: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program92);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_program95);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:178: ( WS )?
                    int alt6 = 2;
                    int LA6_0 = input.LA(1);
                    if ((LA6_0 == WS)) {
                        alt6 = 1;
                    }
                    switch (alt6) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:178: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program97);
                        }
                        break;

                    }

			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:182: (a= ID )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:183: a= ID
                    {
                        a = (Token) match(input, ID, FOLLOW_ID_in_program103);
                        program.primaryJoinableHooks.add((a != null ? a.getText() : null));
                    }

                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:235: ( ( WS )? ',' ( WS )? a= ID )*
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
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:236: ( WS )? ',' ( WS )? a= ID
                            {
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:236: ( WS )?
                                int alt7 = 2;
                                int LA7_0 = input.LA(1);
                                if ((LA7_0 == WS)) {
                                    alt7 = 1;
                                }
                                switch (alt7) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:236: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_program108);
                                    }
                                    break;

                                }

                                match(input, 72, FOLLOW_72_in_program111);
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:244: ( WS )?
                                int alt8 = 2;
                                int LA8_0 = input.LA(1);
                                if ((LA8_0 == WS)) {
                                    alt8 = 1;
                                }
                                switch (alt8) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:244: WS
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

                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:302: ( WS )?
                    int alt10 = 2;
                    int LA10_0 = input.LA(1);
                    if ((LA10_0 == WS)) {
                        alt10 = 1;
                    }
                    switch (alt10) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:302: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program124);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_program127);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:313: ( WS )?
                    int alt11 = 2;
                    int LA11_0 = input.LA(1);
                    if ((LA11_0 == WS)) {
                        alt11 = 1;
                    }
                    switch (alt11) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:313: WS
                        {
                            match(input, WS, FOLLOW_WS_in_program129);
                        }
                        break;

                    }

                }

                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:319: ( OPT_SEMI_COLON )?
                int alt12 = 2;
                int LA12_0 = input.LA(1);
                if ((LA12_0 == OPT_SEMI_COLON)) {
                    alt12 = 1;
                }
                switch (alt12) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:38:319: OPT_SEMI_COLON
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:43:1: statement returns [QueryMeta qMeta] : SELECT WS ( ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( '*' ) ) WS FROM WS id= ID WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? ;
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
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:2: ( SELECT WS ( ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( '*' ) ) WS FROM WS id= ID WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )? )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:48:4: SELECT WS ( ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( '*' ) ) WS FROM WS id= ID WS WHERE WS whereClause[qMeta] ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? ) ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )? ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
            {
                match(input, SELECT, FOLLOW_SELECT_in_statement160);
                match(input, WS, FOLLOW_WS_in_statement162);
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:49:7: ( ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* ) | ( '*' ) )
                int alt16 = 2;
                int LA16_0 = input.LA(1);
                if ((LA16_0 == COUNT || LA16_0 == DOUBLE_SUM || LA16_0 == ID || LA16_0 == JAVASCRIPT || LA16_0 == LONG_SUM || (LA16_0 >= MAX && LA16_0 <= MIN) || LA16_0 == UNIQUE)) {
                    alt16 = 1;
                } else if ((LA16_0 == 71)) {
                    alt16 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 16, 0, input);
                    throw nvae;
                }

                switch (alt16) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:8: ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
                    {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:50:8: ( selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )* )
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:9: selectItems[qMeta] ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
                        {
                            pushFollow(FOLLOW_selectItems_in_statement189);
                            selectItems(qMeta);
                            state._fsp--;

                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:28: ( ( WS )? ',' ( WS )? selectItems[qMeta] )*
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
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:29: ( WS )? ',' ( WS )? selectItems[qMeta]
                                    {
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:29: ( WS )?
                                        int alt13 = 2;
                                        int LA13_0 = input.LA(1);
                                        if ((LA13_0 == WS)) {
                                            alt13 = 1;
                                        }
                                        switch (alt13) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:29: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_statement193);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_statement196);
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:37: ( WS )?
                                        int alt14 = 2;
                                        int LA14_0 = input.LA(1);
                                        if ((LA14_0 == WS)) {
                                            alt14 = 1;
                                        }
                                        switch (alt14) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:51:37: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_statement198);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_selectItems_in_statement201);
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
                    case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:8: ( '*' )
                    {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:8: ( '*' )
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:54:9: '*'
                        {
                            match(input, 71, FOLLOW_71_in_statement232);
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

                match(input, WS, FOLLOW_WS_in_statement275);
                match(input, WHERE, FOLLOW_WHERE_in_statement277);
                match(input, WS, FOLLOW_WS_in_statement279);
                pushFollow(FOLLOW_whereClause_in_statement281);
                whereClause(qMeta);
                state._fsp--;

			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:65:4: ( ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )? )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:66:5: ( WS BREAK WS BY WS granularityClause[qMeta] )? ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )? ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )? ( WS LIMIT WS (l= LONG ) )? ( WS THEN WS p= postAggItem )?
                {
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:66:5: ( WS BREAK WS BY WS granularityClause[qMeta] )?
                    int alt17 = 2;
                    int LA17_0 = input.LA(1);
                    if ((LA17_0 == WS)) {
                        int LA17_1 = input.LA(2);
                        if ((LA17_1 == BREAK)) {
                            alt17 = 1;
                        }
                    }
                    switch (alt17) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:66:6: WS BREAK WS BY WS granularityClause[qMeta]
                        {
                            match(input, WS, FOLLOW_WS_in_statement298);
                            match(input, BREAK, FOLLOW_BREAK_in_statement300);
                            match(input, WS, FOLLOW_WS_in_statement302);
                            match(input, BY, FOLLOW_BY_in_statement304);
                            match(input, WS, FOLLOW_WS_in_statement306);
                            pushFollow(FOLLOW_granularityClause_in_statement308);
                            granularityClause(qMeta);
                            state._fsp--;

                        }
                        break;

                    }

                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:5: ( WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )? )?
                    int alt22 = 2;
                    int LA22_0 = input.LA(1);
                    if ((LA22_0 == WS)) {
                        int LA22_1 = input.LA(2);
                        if ((LA22_1 == GROUP)) {
                            alt22 = 1;
                        }
                    }
                    switch (alt22) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:67:6: WS GROUP WS BY WS (id= ID ( ( WS )? ',' ( WS )? id= ID )* ) ( WS HAVING WS h= havingClause )?
                        {
                            match(input, WS, FOLLOW_WS_in_statement319);
                            match(input, GROUP, FOLLOW_GROUP_in_statement321);
                            match(input, WS, FOLLOW_WS_in_statement323);
                            match(input, BY, FOLLOW_BY_in_statement325);
                            match(input, WS, FOLLOW_WS_in_statement327);

                            qMeta = GroupByQueryMeta.promote(qMeta);
                            if (((GroupByQueryMeta) qMeta).fetchDimensions == null) {
                                System.err.println("No dimensions !! ");
                            }

					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:74:10: (id= ID ( ( WS )? ',' ( WS )? id= ID )* )
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:74:11: id= ID ( ( WS )? ',' ( WS )? id= ID )*
                            {
                                id = (Token) match(input, ID, FOLLOW_ID_in_statement353);

                                if (!((GroupByQueryMeta) qMeta).checkDimOrAlias((id != null ? id.getText() : null))) {
                                    System.err.println("Dimension/Alias " + (id != null ? id.getText() : null) + " not valid..");
                                }

                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:14: ( ( WS )? ',' ( WS )? id= ID )*
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
                                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:15: ( WS )? ',' ( WS )? id= ID
                                        {
                                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:15: ( WS )?
                                            int alt18 = 2;
                                            int LA18_0 = input.LA(1);
                                            if ((LA18_0 == WS)) {
                                                alt18 = 1;
                                            }
                                            switch (alt18) {
                                                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:15: WS
                                                {
                                                    match(input, WS, FOLLOW_WS_in_statement385);
                                                }
                                                break;

                                            }

                                            match(input, 72, FOLLOW_72_in_statement388);
                                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:23: ( WS )?
                                            int alt19 = 2;
                                            int LA19_0 = input.LA(1);
                                            if ((LA19_0 == WS)) {
                                                alt19 = 1;
                                            }
                                            switch (alt19) {
                                                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:80:23: WS
                                                {
                                                    match(input, WS, FOLLOW_WS_in_statement390);
                                                }
                                                break;

                                            }

                                            id = (Token) match(input, ID, FOLLOW_ID_in_statement395);

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

                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:88:10: ( WS HAVING WS h= havingClause )?
                            int alt21 = 2;
                            int LA21_0 = input.LA(1);
                            if ((LA21_0 == WS)) {
                                int LA21_1 = input.LA(2);
                                if ((LA21_1 == HAVING)) {
                                    alt21 = 1;
                                }
                            }
                            switch (alt21) {
                                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:88:11: WS HAVING WS h= havingClause
                                {
                                    match(input, WS, FOLLOW_WS_in_statement452);
                                    match(input, HAVING, FOLLOW_HAVING_in_statement454);
                                    match(input, WS, FOLLOW_WS_in_statement456);
                                    pushFollow(FOLLOW_havingClause_in_statement460);
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
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:92:5: ( WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )? )?
                    int alt24 = 2;
                    int LA24_0 = input.LA(1);
                    if ((LA24_0 == WS)) {
                        int LA24_1 = input.LA(2);
                        if ((LA24_1 == ORDER)) {
                            alt24 = 1;
                        }
                    }
                    switch (alt24) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:92:6: WS ORDER WS BY WS (id= ID ) ( WS dir= ( ASC | DESC ) )?
                        {
                            match(input, WS, FOLLOW_WS_in_statement504);
                            match(input, ORDER, FOLLOW_ORDER_in_statement506);
                            match(input, WS, FOLLOW_WS_in_statement508);
                            match(input, BY, FOLLOW_BY_in_statement510);
                            match(input, WS, FOLLOW_WS_in_statement512);
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:92:24: (id= ID )
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:92:25: id= ID
                            {
                                id = (Token) match(input, ID, FOLLOW_ID_in_statement517);
                            }

                            if (((PlainDimQueryMeta) qMeta).fetchDimensions.size() != 1) {
                                ((GroupByQueryMeta) qMeta).limitSpec = new LimitSpec();

                            } else {// If fetchDimensions = 1 then TopN is more optimal.
                                qMeta = TopNQueryMeta.promote(qMeta);
                                ((TopNQueryMeta) qMeta).metric = (id != null ? id.getText() : null);
                            }

                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:9: ( WS dir= ( ASC | DESC ) )?
                            int alt23 = 2;
                            int LA23_0 = input.LA(1);
                            if ((LA23_0 == WS)) {
                                int LA23_1 = input.LA(2);
                                if ((LA23_1 == ASC || LA23_1 == DESC)) {
                                    alt23 = 1;
                                }
                            }
                            switch (alt23) {
                                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:103:10: WS dir= ( ASC | DESC )
                                {
                                    match(input, WS, FOLLOW_WS_in_statement550);
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

                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:124:5: ( WS LIMIT WS (l= LONG ) )?
                    int alt25 = 2;
                    int LA25_0 = input.LA(1);
                    if ((LA25_0 == WS)) {
                        int LA25_1 = input.LA(2);
                        if ((LA25_1 == LIMIT)) {
                            alt25 = 1;
                        }
                    }
                    switch (alt25) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:6: WS LIMIT WS (l= LONG )
                        {
                            match(input, WS, FOLLOW_WS_in_statement604);
                            match(input, LIMIT, FOLLOW_LIMIT_in_statement606);
                            match(input, WS, FOLLOW_WS_in_statement608);
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:18: (l= LONG )
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:125:19: l= LONG
                            {
                                l = (Token) match(input, LONG, FOLLOW_LONG_in_statement613);
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

                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:137:7: ( WS THEN WS p= postAggItem )?
                    int alt26 = 2;
                    int LA26_0 = input.LA(1);
                    if ((LA26_0 == WS)) {
                        int LA26_1 = input.LA(2);
                        if ((LA26_1 == THEN)) {
                            alt26 = 1;
                        }
                    }
                    switch (alt26) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:137:8: WS THEN WS p= postAggItem
                        {
                            match(input, WS, FOLLOW_WS_in_statement651);
                            match(input, THEN, FOLLOW_THEN_in_statement653);
                            match(input, WS, FOLLOW_WS_in_statement655);
                            pushFollow(FOLLOW_postAggItem_in_statement659);
                            p = postAggItem();
                            state._fsp--;

                            QueryUtils.setPostAggregation(qMeta, p);
                        }
                        break;

                    }

                }

                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:4: ( WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN )?
                int alt36 = 2;
                int LA36_0 = input.LA(1);
                if ((LA36_0 == WS)) {
                    int LA36_1 = input.LA(2);
                    if ((LA36_1 == WHICH)) {
                        alt36 = 1;
                    }
                }
                switch (alt36) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:5: WS WHICH WS CONTAINS ( WS )? LPARAN ( WS )? (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* ) ( WS )? RPARAN WS SORT ( WS )? LPARAN ( WS )? (s= SINGLE_QUOTE_STRING ) ( WS )? RPARAN
                    {
                        match(input, WS, FOLLOW_WS_in_statement674);
                        match(input, WHICH, FOLLOW_WHICH_in_statement676);
                        match(input, WS, FOLLOW_WS_in_statement678);
                        match(input, CONTAINS, FOLLOW_CONTAINS_in_statement680);
                        qMeta = SearchQueryMeta.promote(qMeta);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:68: ( WS )?
                        int alt27 = 2;
                        int LA27_0 = input.LA(1);
                        if ((LA27_0 == WS)) {
                            alt27 = 1;
                        }
                        switch (alt27) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:68: WS
                            {
                                match(input, WS, FOLLOW_WS_in_statement684);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_statement687);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:79: ( WS )?
                        int alt28 = 2;
                        int LA28_0 = input.LA(1);
                        if ((LA28_0 == WS)) {
                            alt28 = 1;
                        }
                        switch (alt28) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:79: WS
                            {
                                match(input, WS, FOLLOW_WS_in_statement689);
                            }
                            break;

                        }

					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:83: (s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )* )
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:84: s1= SINGLE_QUOTE_STRING ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
                        {
                            s1 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement695);
                            ((SearchQueryMeta) qMeta).type = "insensitive_contains";
                            ((SearchQueryMeta) qMeta).addValue((s1 != null ? s1.getText() : null));
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:208: ( ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING )*
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
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:209: ( WS )? ',' ( WS )? s2= SINGLE_QUOTE_STRING
                                    {
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:209: ( WS )?
                                        int alt29 = 2;
                                        int LA29_0 = input.LA(1);
                                        if ((LA29_0 == WS)) {
                                            alt29 = 1;
                                        }
                                        switch (alt29) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:209: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_statement699);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_statement702);
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:217: ( WS )?
                                        int alt30 = 2;
                                        int LA30_0 = input.LA(1);
                                        if ((LA30_0 == WS)) {
                                            alt30 = 1;
                                        }
                                        switch (alt30) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:217: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_statement704);
                                            }
                                            break;

                                        }

                                        s2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement709);
                                        ((SearchQueryMeta) qMeta).type = "fragment";
                                        ((SearchQueryMeta) qMeta).addValue((s2 != null ? s2.getText() : null));
                                    }
                                    break;

                                    default:
                                        break loop31;
                                }
                            }

                        }

                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:337: ( WS )?
                        int alt32 = 2;
                        int LA32_0 = input.LA(1);
                        if ((LA32_0 == WS)) {
                            alt32 = 1;
                        }
                        switch (alt32) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:139:337: WS
                            {
                                match(input, WS, FOLLOW_WS_in_statement716);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_statement719);
                        match(input, WS, FOLLOW_WS_in_statement725);
                        match(input, SORT, FOLLOW_SORT_in_statement727);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:13: ( WS )?
                        int alt33 = 2;
                        int LA33_0 = input.LA(1);
                        if ((LA33_0 == WS)) {
                            alt33 = 1;
                        }
                        switch (alt33) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:13: WS
                            {
                                match(input, WS, FOLLOW_WS_in_statement729);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_statement732);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:24: ( WS )?
                        int alt34 = 2;
                        int LA34_0 = input.LA(1);
                        if ((LA34_0 == WS)) {
                            alt34 = 1;
                        }
                        switch (alt34) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:24: WS
                            {
                                match(input, WS, FOLLOW_WS_in_statement734);
                            }
                            break;

                        }

					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:28: (s= SINGLE_QUOTE_STRING )
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:29: s= SINGLE_QUOTE_STRING
                        {
                            s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement740);
                        }

                        ((SearchQueryMeta) qMeta).setSort((s != null ? s.getText() : null));
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:97: ( WS )?
                        int alt35 = 2;
                        int LA35_0 = input.LA(1);
                        if ((LA35_0 == WS)) {
                            alt35 = 1;
                        }
                        switch (alt35) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:140:97: WS
                            {
                                match(input, WS, FOLLOW_WS_in_statement745);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_statement748);
                    }
                    break;

                }

                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:4: ( WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN )?
                int alt40 = 2;
                int LA40_0 = input.LA(1);
                if ((LA40_0 == WS)) {
                    int LA40_1 = input.LA(2);
                    if ((LA40_1 == HINT)) {
                        alt40 = 1;
                    }
                }
                switch (alt40) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:5: WS HINT ( WS )? LPARAN ( WS )? s= SINGLE_QUOTE_STRING ( WS )? RPARAN
                    {
                        match(input, WS, FOLLOW_WS_in_statement760);
                        match(input, HINT, FOLLOW_HINT_in_statement762);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:13: ( WS )?
                        int alt37 = 2;
                        int LA37_0 = input.LA(1);
                        if ((LA37_0 == WS)) {
                            alt37 = 1;
                        }
                        switch (alt37) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:13: WS
                            {
                                match(input, WS, FOLLOW_WS_in_statement764);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_statement767);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:24: ( WS )?
                        int alt38 = 2;
                        int LA38_0 = input.LA(1);
                        if ((LA38_0 == WS)) {
                            alt38 = 1;
                        }
                        switch (alt38) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:24: WS
                            {
                                match(input, WS, FOLLOW_WS_in_statement769);
                            }
                            break;

                        }

                        s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_statement774);
                        qMeta = HintProcessor.process(qMeta, (s != null ? s.getText() : null));
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:99: ( WS )?
                        int alt39 = 2;
                        int LA39_0 = input.LA(1);
                        if ((LA39_0 == WS)) {
                            alt39 = 1;
                        }
                        switch (alt39) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:142:99: WS
                            {
                                match(input, WS, FOLLOW_WS_in_statement778);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_statement781);
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
        return qMeta;
    }
	// $ANTLR end "statement"

	// $ANTLR start "selectItems"
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:145:1: selectItems[QueryMeta qMeta] : (sI1= aggItemInSelect | simpleDim[qMeta] );
    public final void selectItems(QueryMeta qMeta) throws RecognitionException {
        AggItem sI1 = null;

        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:2: (sI1= aggItemInSelect | simpleDim[qMeta] )
            int alt41 = 2;
            int LA41_0 = input.LA(1);
            if ((LA41_0 == COUNT || LA41_0 == DOUBLE_SUM || LA41_0 == JAVASCRIPT || LA41_0 == LONG_SUM || (LA41_0 >= MAX && LA41_0 <= MIN) || LA41_0 == UNIQUE)) {
                alt41 = 1;
            } else if ((LA41_0 == ID)) {
                alt41 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 41, 0, input);
                throw nvae;
            }

            switch (alt41) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:146:5: sI1= aggItemInSelect
                {
                    pushFollow(FOLLOW_aggItemInSelect_in_selectItems800);
                    sI1 = aggItemInSelect();
                    state._fsp--;

                    ((BaseAggQueryMeta) qMeta).aggregations.add(sI1);
                }
                break;
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:147:5: simpleDim[qMeta]
                {
                    pushFollow(FOLLOW_simpleDim_in_selectItems808);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:150:1: simpleDim[QueryMeta qMeta] : (a= ID ( WS AS WS b= ID )? ) ;
    public final void simpleDim(QueryMeta qMeta) throws RecognitionException {
        Token a = null;
        Token b = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:151:2: ( (a= ID ( WS AS WS b= ID )? ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:151:4: (a= ID ( WS AS WS b= ID )? )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:151:4: (a= ID ( WS AS WS b= ID )? )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:151:5: a= ID ( WS AS WS b= ID )?
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_simpleDim824);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:151:10: ( WS AS WS b= ID )?
                    int alt42 = 2;
                    int LA42_0 = input.LA(1);
                    if ((LA42_0 == WS)) {
                        int LA42_1 = input.LA(2);
                        if ((LA42_1 == AS)) {
                            alt42 = 1;
                        }
                    }
                    switch (alt42) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:151:11: WS AS WS b= ID
                        {
                            match(input, WS, FOLLOW_WS_in_simpleDim827);
                            match(input, AS, FOLLOW_AS_in_simpleDim829);
                            match(input, WS, FOLLOW_WS_in_simpleDim831);
                            b = (Token) match(input, ID, FOLLOW_ID_in_simpleDim835);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:162:1: whereClause[QueryMeta qMeta] : intervalClause[qMeta] ( WS AND WS f= grandFilter )? ;
    public final void whereClause(QueryMeta qMeta) throws RecognitionException {
        Filter f = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:2: ( intervalClause[qMeta] ( WS AND WS f= grandFilter )? )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:3: intervalClause[qMeta] ( WS AND WS f= grandFilter )?
            {
                pushFollow(FOLLOW_intervalClause_in_whereClause856);
                intervalClause(qMeta);
                state._fsp--;

                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:25: ( WS AND WS f= grandFilter )?
                int alt43 = 2;
                int LA43_0 = input.LA(1);
                if ((LA43_0 == WS)) {
                    int LA43_1 = input.LA(2);
                    if ((LA43_1 == AND)) {
                        alt43 = 1;
                    }
                }
                switch (alt43) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:163:26: WS AND WS f= grandFilter
                    {
                        match(input, WS, FOLLOW_WS_in_whereClause860);
                        match(input, AND, FOLLOW_AND_in_whereClause862);
                        match(input, WS, FOLLOW_WS_in_whereClause864);
                        pushFollow(FOLLOW_grandFilter_in_whereClause868);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:167:1: intervalClause[QueryMeta qMeta] : 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) ;
    public final void intervalClause(QueryMeta qMeta) throws RecognitionException {
        Token st2 = null;
        Token et2 = null;
        ParserRuleReturnScope st = null;
        ParserRuleReturnScope et = null;
        Pair<String> p1 = null;
        Pair<String> p2 = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:168:2: ( 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:168:4: 'interval' WS BETWEEN WS ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
            {
                match(input, 73, FOLLOW_73_in_intervalClause887);
                match(input, WS, FOLLOW_WS_in_intervalClause889);
                match(input, BETWEEN, FOLLOW_BETWEEN_in_intervalClause891);
                match(input, WS, FOLLOW_WS_in_intervalClause893);
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:169:2: ( ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) ) | ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN ) )
                int alt51 = 2;
                int LA51_0 = input.LA(1);
                if (((LA51_0 >= DATE_HOUR && LA51_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ) || LA51_0 == SINGLE_QUOTE_STRING)) {
                    alt51 = 1;
                } else if ((LA51_0 == LPARAN)) {
                    alt51 = 2;
                } else {
                    NoViableAltException nvae
                            = new NoViableAltException("", 51, 0, input);
                    throw nvae;
                }

                switch (alt51) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:170:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
                    {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:170:4: ( ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) ) )
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
                        {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:6: ( (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING ) )
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:7: (st= isoTime |st2= SINGLE_QUOTE_STRING ) WS AND WS (et= isoTime |et2= SINGLE_QUOTE_STRING )
                            {
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:7: (st= isoTime |st2= SINGLE_QUOTE_STRING )
                                int alt44 = 2;
                                int LA44_0 = input.LA(1);
                                if (((LA44_0 >= DATE_HOUR && LA44_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ))) {
                                    alt44 = 1;
                                } else if ((LA44_0 == SINGLE_QUOTE_STRING)) {
                                    alt44 = 2;
                                } else {
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 44, 0, input);
                                    throw nvae;
                                }

                                switch (alt44) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:8: st= isoTime
                                    {
                                        pushFollow(FOLLOW_isoTime_in_intervalClause913);
                                        st = isoTime();
                                        state._fsp--;

                                    }
                                    break;
                                    case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:22: st2= SINGLE_QUOTE_STRING
                                    {
                                        st2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause920);
                                    }
                                    break;

                                }

                                match(input, WS, FOLLOW_WS_in_intervalClause924);
                                match(input, AND, FOLLOW_AND_in_intervalClause926);
                                match(input, WS, FOLLOW_WS_in_intervalClause928);
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:58: (et= isoTime |et2= SINGLE_QUOTE_STRING )
                                int alt45 = 2;
                                int LA45_0 = input.LA(1);
                                if (((LA45_0 >= DATE_HOUR && LA45_0 <= DATE_HOUR_MIN_SEC_SUB_UTC_TZ))) {
                                    alt45 = 1;
                                } else if ((LA45_0 == SINGLE_QUOTE_STRING)) {
                                    alt45 = 2;
                                } else {
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 45, 0, input);
                                    throw nvae;
                                }

                                switch (alt45) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:59: et= isoTime
                                    {
                                        pushFollow(FOLLOW_isoTime_in_intervalClause933);
                                        et = isoTime();
                                        state._fsp--;

                                    }
                                    break;
                                    case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:171:73: et2= SINGLE_QUOTE_STRING
                                    {
                                        et2 = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause940);
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
                    case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:188:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
                    {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:188:4: ( LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN )
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:188:5: LPARAN ( WS )? p1= pairString ( ( WS )? ',' ( WS )? p2= pairString )* ( WS )? RPARAN
                        {
                            match(input, LPARAN, FOLLOW_LPARAN_in_intervalClause965);
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:188:12: ( WS )?
                            int alt46 = 2;
                            int LA46_0 = input.LA(1);
                            if ((LA46_0 == WS)) {
                                alt46 = 1;
                            }
                            switch (alt46) {
                                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:188:12: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_intervalClause967);
                                }
                                break;

                            }

                            pushFollow(FOLLOW_pairString_in_intervalClause972);
                            p1 = pairString();
                            state._fsp--;

                            qMeta.intervals.add(new Interval(p1.a, p1.b));
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:7: ( ( WS )? ',' ( WS )? p2= pairString )*
                            loop49:
                            while (true) {
                                int alt49 = 2;
                                int LA49_0 = input.LA(1);
                                if ((LA49_0 == WS)) {
                                    int LA49_1 = input.LA(2);
                                    if ((LA49_1 == 72)) {
                                        alt49 = 1;
                                    }

                                } else if ((LA49_0 == 72)) {
                                    alt49 = 1;
                                }

                                switch (alt49) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:8: ( WS )? ',' ( WS )? p2= pairString
                                    {
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:8: ( WS )?
                                        int alt47 = 2;
                                        int LA47_0 = input.LA(1);
                                        if ((LA47_0 == WS)) {
                                            alt47 = 1;
                                        }
                                        switch (alt47) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:8: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_intervalClause984);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_intervalClause987);
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:16: ( WS )?
                                        int alt48 = 2;
                                        int LA48_0 = input.LA(1);
                                        if ((LA48_0 == WS)) {
                                            alt48 = 1;
                                        }
                                        switch (alt48) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:16: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_intervalClause989);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_pairString_in_intervalClause994);
                                        p2 = pairString();
                                        state._fsp--;

                                        qMeta.intervals.add(new Interval(p2.a, p2.b));
                                    }
                                    break;

                                    default:
                                        break loop49;
                                }
                            }

                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:85: ( WS )?
                            int alt50 = 2;
                            int LA50_0 = input.LA(1);
                            if ((LA50_0 == WS)) {
                                alt50 = 1;
                            }
                            switch (alt50) {
                                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:189:85: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_intervalClause1000);
                                }
                                break;

                            }

                            match(input, RPARAN, FOLLOW_RPARAN_in_intervalClause1003);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:194:1: getEquals returns [EqualsToHolder holder] : (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) ;
    public final EqualsToHolder getEquals() throws RecognitionException {
        EqualsToHolder holder = null;

        Token a = null;
        Token b = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:2: ( (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:4: (a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG ) )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:5: a= ID ( WS )? EQUALS ( WS )? b= ( SINGLE_QUOTE_STRING | FLOAT | LONG )
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_getEquals1026);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:10: ( WS )?
                    int alt52 = 2;
                    int LA52_0 = input.LA(1);
                    if ((LA52_0 == WS)) {
                        alt52 = 1;
                    }
                    switch (alt52) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:10: WS
                        {
                            match(input, WS, FOLLOW_WS_in_getEquals1028);
                        }
                        break;

                    }

                    match(input, EQUALS, FOLLOW_EQUALS_in_getEquals1031);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:21: ( WS )?
                    int alt53 = 2;
                    int LA53_0 = input.LA(1);
                    if ((LA53_0 == WS)) {
                        alt53 = 1;
                    }
                    switch (alt53) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:195:21: WS
                        {
                            match(input, WS, FOLLOW_WS_in_getEquals1033);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:200:1: granularityClause[QueryMeta qMeta] : ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) ) );
    public final void granularityClause(QueryMeta qMeta) throws RecognitionException {
        Token s = null;
        Token dur = null;
        Token orig = null;
        Token per = null;
        Token tz = null;

        qMeta.granularity = new Granularity();
        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:2: ( ( (s= SINGLE_QUOTE_STRING ) ) | ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) ) )
            int alt76 = 2;
            int LA76_0 = input.LA(1);
            if ((LA76_0 == SINGLE_QUOTE_STRING)) {
                alt76 = 1;
            } else if ((LA76_0 == DURATION || LA76_0 == PERIOD)) {
                alt76 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 76, 0, input);
                throw nvae;
            }

            switch (alt76) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:3: ( (s= SINGLE_QUOTE_STRING ) )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:3: ( (s= SINGLE_QUOTE_STRING ) )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:4: (s= SINGLE_QUOTE_STRING )
                    {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:4: (s= SINGLE_QUOTE_STRING )
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:202:5: s= SINGLE_QUOTE_STRING
                        {
                            s = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1077);
                        }

                        qMeta.granularity = new Granularity((s != null ? s.getText() : null));
                    }

                }
                break;
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:204:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) )
                {
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:204:3: ( ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) | ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN ) )
                    int alt75 = 2;
                    int LA75_0 = input.LA(1);
                    if ((LA75_0 == DURATION)) {
                        alt75 = 1;
                    } else if ((LA75_0 == PERIOD)) {
                        alt75 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 75, 0, input);
                        throw nvae;
                    }

                    switch (alt75) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                        {
							// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:5: ( DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:7: DURATION ( WS )? LPARAN ( WS )? dur= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN
                            {
                                match(input, DURATION, FOLLOW_DURATION_in_granularityClause1101);
                                qMeta.granularity.type = "duration";
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:55: ( WS )?
                                int alt54 = 2;
                                int LA54_0 = input.LA(1);
                                if ((LA54_0 == WS)) {
                                    alt54 = 1;
                                }
                                switch (alt54) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:55: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1105);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_granularityClause1108);
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:66: ( WS )?
                                int alt55 = 2;
                                int LA55_0 = input.LA(1);
                                if ((LA55_0 == WS)) {
                                    alt55 = 1;
                                }
                                switch (alt55) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:66: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1110);
                                    }
                                    break;

                                }

                                dur = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1115);
                                qMeta.granularity.setDuration((dur != null ? dur.getText() : null));
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:138: ( WS )?
                                int alt56 = 2;
                                int LA56_0 = input.LA(1);
                                if ((LA56_0 == WS)) {
                                    alt56 = 1;
                                }
                                switch (alt56) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:138: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1119);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:142: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
                                int alt58 = 2;
                                int LA58_0 = input.LA(1);
                                if ((LA58_0 == 72)) {
                                    int LA58_1 = input.LA(2);
                                    if ((LA58_1 == WS)) {
                                        int LA58_4 = input.LA(3);
                                        if ((LA58_4 == SINGLE_QUOTE_STRING)) {
                                            alt58 = 1;
                                        }
                                    } else if ((LA58_1 == SINGLE_QUOTE_STRING)) {
                                        alt58 = 1;
                                    }
                                }
                                switch (alt58) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:143: ',' ( WS )? orig= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 72, FOLLOW_72_in_granularityClause1123);
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:147: ( WS )?
                                        int alt57 = 2;
                                        int LA57_0 = input.LA(1);
                                        if ((LA57_0 == WS)) {
                                            alt57 = 1;
                                        }
                                        switch (alt57) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:147: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1125);
                                            }
                                            break;

                                        }

                                        orig = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1130);
                                        qMeta.granularity.setOrigin((orig != null ? orig.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:221: ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )?
                                int alt62 = 2;
                                int LA62_0 = input.LA(1);
                                if ((LA62_0 == WS || LA62_0 == 72)) {
                                    alt62 = 1;
                                }
                                switch (alt62) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:222: ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )?
                                    {
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:222: ( WS )?
                                        int alt59 = 2;
                                        int LA59_0 = input.LA(1);
                                        if ((LA59_0 == WS)) {
                                            alt59 = 1;
                                        }
                                        switch (alt59) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:222: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1137);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_granularityClause1140);
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:230: ( WS )?
                                        int alt60 = 2;
                                        int LA60_0 = input.LA(1);
                                        if ((LA60_0 == WS)) {
                                            int LA60_1 = input.LA(2);
                                            if ((LA60_1 == WS)) {
                                                alt60 = 1;
                                            }
                                        }
                                        switch (alt60) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:230: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1142);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_granularityInclude_in_granularityClause1145);
                                        granularityInclude(qMeta);
                                        state._fsp--;

                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:260: ( WS )?
                                        int alt61 = 2;
                                        int LA61_0 = input.LA(1);
                                        if ((LA61_0 == WS)) {
                                            alt61 = 1;
                                        }
                                        switch (alt61) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:205:260: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1148);
                                            }
                                            break;

                                        }

                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_granularityClause1153);
                            }

                        }
                        break;
                        case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                        {
							// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:5: ( PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN )
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:7: PERIOD ( WS )? LPARAN ( WS )? per= SINGLE_QUOTE_STRING ( WS )? ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )? ( WS )? ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )? ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )? RPARAN
                            {
                                match(input, PERIOD, FOLLOW_PERIOD_in_granularityClause1172);
                                qMeta.granularity.type = "period";
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:51: ( WS )?
                                int alt63 = 2;
                                int LA63_0 = input.LA(1);
                                if ((LA63_0 == WS)) {
                                    alt63 = 1;
                                }
                                switch (alt63) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:51: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1176);
                                    }
                                    break;

                                }

                                match(input, LPARAN, FOLLOW_LPARAN_in_granularityClause1179);
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:62: ( WS )?
                                int alt64 = 2;
                                int LA64_0 = input.LA(1);
                                if ((LA64_0 == WS)) {
                                    alt64 = 1;
                                }
                                switch (alt64) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:62: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1181);
                                    }
                                    break;

                                }

                                per = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1186);
                                qMeta.granularity.setPeriod((per != null ? per.getText() : null));
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:132: ( WS )?
                                int alt65 = 2;
                                int LA65_0 = input.LA(1);
                                if ((LA65_0 == WS)) {
                                    alt65 = 1;
                                }
                                switch (alt65) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:132: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1190);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:136: ( ',' ( WS )? tz= SINGLE_QUOTE_STRING )?
                                int alt67 = 2;
                                int LA67_0 = input.LA(1);
                                if ((LA67_0 == 72)) {
                                    int LA67_1 = input.LA(2);
                                    if ((LA67_1 == WS)) {
                                        int LA67_4 = input.LA(3);
                                        if ((LA67_4 == SINGLE_QUOTE_STRING)) {
                                            alt67 = 1;
                                        }
                                    } else if ((LA67_1 == SINGLE_QUOTE_STRING)) {
                                        alt67 = 1;
                                    }
                                }
                                switch (alt67) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:137: ',' ( WS )? tz= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 72, FOLLOW_72_in_granularityClause1194);
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:141: ( WS )?
                                        int alt66 = 2;
                                        int LA66_0 = input.LA(1);
                                        if ((LA66_0 == WS)) {
                                            alt66 = 1;
                                        }
                                        switch (alt66) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:141: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1196);
                                            }
                                            break;

                                        }

                                        tz = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1201);
                                        qMeta.granularity.setTimeZone((tz != null ? tz.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:213: ( WS )?
                                int alt68 = 2;
                                int LA68_0 = input.LA(1);
                                if ((LA68_0 == WS)) {
                                    alt68 = 1;
                                }
                                switch (alt68) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:213: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_granularityClause1207);
                                    }
                                    break;

                                }

                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:217: ( ',' ( WS )? orig= SINGLE_QUOTE_STRING )?
                                int alt70 = 2;
                                int LA70_0 = input.LA(1);
                                if ((LA70_0 == 72)) {
                                    int LA70_1 = input.LA(2);
                                    if ((LA70_1 == WS)) {
                                        int LA70_4 = input.LA(3);
                                        if ((LA70_4 == SINGLE_QUOTE_STRING)) {
                                            alt70 = 1;
                                        }
                                    } else if ((LA70_1 == SINGLE_QUOTE_STRING)) {
                                        alt70 = 1;
                                    }
                                }
                                switch (alt70) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:218: ',' ( WS )? orig= SINGLE_QUOTE_STRING
                                    {
                                        match(input, 72, FOLLOW_72_in_granularityClause1211);
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:222: ( WS )?
                                        int alt69 = 2;
                                        int LA69_0 = input.LA(1);
                                        if ((LA69_0 == WS)) {
                                            alt69 = 1;
                                        }
                                        switch (alt69) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:222: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1213);
                                            }
                                            break;

                                        }

                                        orig = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1218);
                                        qMeta.granularity.setOrigin((orig != null ? orig.getText() : null));
                                    }
                                    break;

                                }

                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:296: ( ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )? )?
                                int alt74 = 2;
                                int LA74_0 = input.LA(1);
                                if ((LA74_0 == WS || LA74_0 == 72)) {
                                    alt74 = 1;
                                }
                                switch (alt74) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:297: ( WS )? ',' ( WS )? granularityInclude[qMeta] ( WS )?
                                    {
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:297: ( WS )?
                                        int alt71 = 2;
                                        int LA71_0 = input.LA(1);
                                        if ((LA71_0 == WS)) {
                                            alt71 = 1;
                                        }
                                        switch (alt71) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:297: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1225);
                                            }
                                            break;

                                        }

                                        match(input, 72, FOLLOW_72_in_granularityClause1228);
                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:305: ( WS )?
                                        int alt72 = 2;
                                        int LA72_0 = input.LA(1);
                                        if ((LA72_0 == WS)) {
                                            int LA72_1 = input.LA(2);
                                            if ((LA72_1 == WS)) {
                                                alt72 = 1;
                                            }
                                        }
                                        switch (alt72) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:305: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1230);
                                            }
                                            break;

                                        }

                                        pushFollow(FOLLOW_granularityInclude_in_granularityClause1233);
                                        granularityInclude(qMeta);
                                        state._fsp--;

                                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:335: ( WS )?
                                        int alt73 = 2;
                                        int LA73_0 = input.LA(1);
                                        if ((LA73_0 == WS)) {
                                            alt73 = 1;
                                        }
                                        switch (alt73) {
                                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:207:335: WS
                                            {
                                                match(input, WS, FOLLOW_WS_in_granularityClause1236);
                                            }
                                            break;

                                        }

                                    }
                                    break;

                                }

                                match(input, RPARAN, FOLLOW_RPARAN_in_granularityClause1241);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:211:1: granularityInclude[QueryMeta qMeta] : ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) ;
    public final void granularityInclude(QueryMeta qMeta) throws RecognitionException {
        Pair<Integer> p1 = null;
        Pair<Integer> p2 = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:212:2: ( ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:2: ( WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:4: WS INCLUDE ( WS )? LPARAN ( WS )? (p1= pairNums ( ',' p2= pairNums )* ) ( WS )? RPARAN
                {
                    match(input, WS, FOLLOW_WS_in_granularityInclude1263);
                    match(input, INCLUDE, FOLLOW_INCLUDE_in_granularityInclude1265);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:15: ( WS )?
                    int alt77 = 2;
                    int LA77_0 = input.LA(1);
                    if ((LA77_0 == WS)) {
                        alt77 = 1;
                    }
                    switch (alt77) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:15: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude1267);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_granularityInclude1270);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:26: ( WS )?
                    int alt78 = 2;
                    int LA78_0 = input.LA(1);
                    if ((LA78_0 == WS)) {
                        alt78 = 1;
                    }
                    switch (alt78) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:26: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude1272);
                        }
                        break;

                    }

			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:30: (p1= pairNums ( ',' p2= pairNums )* )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:31: p1= pairNums ( ',' p2= pairNums )*
                    {
                        pushFollow(FOLLOW_pairNums_in_granularityInclude1278);
                        p1 = pairNums();
                        state._fsp--;

                        qMeta.microIntervals.add(p1);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:75: ( ',' p2= pairNums )*
                        loop79:
                        while (true) {
                            int alt79 = 2;
                            int LA79_0 = input.LA(1);
                            if ((LA79_0 == 72)) {
                                alt79 = 1;
                            }

                            switch (alt79) {
                                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:76: ',' p2= pairNums
                                {
                                    match(input, 72, FOLLOW_72_in_granularityInclude1283);
                                    pushFollow(FOLLOW_pairNums_in_granularityInclude1287);
                                    p2 = pairNums();
                                    state._fsp--;

                                    qMeta.microIntervals.add(p2);
                                }
                                break;

                                default:
                                    break loop79;
                            }
                        }

                    }

                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:127: ( WS )?
                    int alt80 = 2;
                    int LA80_0 = input.LA(1);
                    if ((LA80_0 == WS)) {
                        alt80 = 1;
                    }
                    switch (alt80) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:213:127: WS
                        {
                            match(input, WS, FOLLOW_WS_in_granularityInclude1294);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_granularityInclude1297);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:216:1: pairNums returns [Pair<Integer> pair] : ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) ;
    public final Pair<Integer> pairNums() throws RecognitionException {
        Pair<Integer> pair = null;

        Token i = null;
        Token j = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:2: ( ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:4: ( LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:5: LSQUARE ( WS )? i= LONG ( WS )? ',' ( WS )? j= LONG ( WS )? RSQUARE
                {
                    match(input, LSQUARE, FOLLOW_LSQUARE_in_pairNums1316);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:13: ( WS )?
                    int alt81 = 2;
                    int LA81_0 = input.LA(1);
                    if ((LA81_0 == WS)) {
                        alt81 = 1;
                    }
                    switch (alt81) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:13: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1318);
                        }
                        break;

                    }

                    i = (Token) match(input, LONG, FOLLOW_LONG_in_pairNums1323);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:25: ( WS )?
                    int alt82 = 2;
                    int LA82_0 = input.LA(1);
                    if ((LA82_0 == WS)) {
                        alt82 = 1;
                    }
                    switch (alt82) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:25: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1326);
                        }
                        break;

                    }

                    match(input, 72, FOLLOW_72_in_pairNums1329);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:33: ( WS )?
                    int alt83 = 2;
                    int LA83_0 = input.LA(1);
                    if ((LA83_0 == WS)) {
                        alt83 = 1;
                    }
                    switch (alt83) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:33: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1331);
                        }
                        break;

                    }

                    j = (Token) match(input, LONG, FOLLOW_LONG_in_pairNums1336);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:44: ( WS )?
                    int alt84 = 2;
                    int LA84_0 = input.LA(1);
                    if ((LA84_0 == WS)) {
                        alt84 = 1;
                    }
                    switch (alt84) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:217:44: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairNums1338);
                        }
                        break;

                    }

                    match(input, RSQUARE, FOLLOW_RSQUARE_in_pairNums1341);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:220:1: pairString returns [Pair<String> pair] : ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) ;
    public final Pair<String> pairString() throws RecognitionException {
        Pair<String> pair = null;

        Token i = null;
        Token j = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:2: ( ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:4: ( LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:5: LSQUARE ( WS )? i= SINGLE_QUOTE_STRING ( WS )? ',' ( WS )? j= SINGLE_QUOTE_STRING ( WS )? RSQUARE
                {
                    match(input, LSQUARE, FOLLOW_LSQUARE_in_pairString1361);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:13: ( WS )?
                    int alt85 = 2;
                    int LA85_0 = input.LA(1);
                    if ((LA85_0 == WS)) {
                        alt85 = 1;
                    }
                    switch (alt85) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:13: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1363);
                        }
                        break;

                    }

                    i = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_pairString1368);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:40: ( WS )?
                    int alt86 = 2;
                    int LA86_0 = input.LA(1);
                    if ((LA86_0 == WS)) {
                        alt86 = 1;
                    }
                    switch (alt86) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:40: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1371);
                        }
                        break;

                    }

                    match(input, 72, FOLLOW_72_in_pairString1374);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:48: ( WS )?
                    int alt87 = 2;
                    int LA87_0 = input.LA(1);
                    if ((LA87_0 == WS)) {
                        alt87 = 1;
                    }
                    switch (alt87) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:48: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1376);
                        }
                        break;

                    }

                    j = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_pairString1381);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:74: ( WS )?
                    int alt88 = 2;
                    int LA88_0 = input.LA(1);
                    if ((LA88_0 == WS)) {
                        alt88 = 1;
                    }
                    switch (alt88) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:221:74: WS
                        {
                            match(input, WS, FOLLOW_WS_in_pairString1383);
                        }
                        break;

                    }

                    match(input, RSQUARE, FOLLOW_RSQUARE_in_pairString1386);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:228:1: havingClause returns [Having having] : h= complexHaving ;
    public final Having havingClause() throws RecognitionException {
        Having having = null;

        Having h = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:2: (h= complexHaving )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:229:4: h= complexHaving
            {
                pushFollow(FOLLOW_complexHaving_in_havingClause1411);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:232:1: simpleHaving returns [Having having] : ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) );
    public final Having simpleHaving() throws RecognitionException {
        Having having = null;

        Token a = null;
        Token t = null;
        Token v = null;
        Token n = null;
        EqualsToHolder e = null;

        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:2: ( (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) | (e= getEquals ) | (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) ) )
            int alt93 = 3;
            int LA93_0 = input.LA(1);
            if ((LA93_0 == ID)) {
                switch (input.LA(2)) {
                    case WS: {
                        int LA93_3 = input.LA(3);
                        if ((LA93_3 == COMPARE_OPER)) {
                            alt93 = 1;
                        } else if ((LA93_3 == EQUALS)) {
                            alt93 = 2;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 93, 3, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case COMPARE_OPER: {
                        alt93 = 1;
                    }
                    break;
                    case EQUALS: {
                        alt93 = 2;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 93, 1, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else if ((LA93_0 == NOT)) {
                alt93 = 3;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 93, 0, input);
                throw nvae;
            }

            switch (alt93) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:4: (a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:5: a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
                    {
                        a = (Token) match(input, ID, FOLLOW_ID_in_simpleHaving1432);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:10: ( WS )?
                        int alt89 = 2;
                        int LA89_0 = input.LA(1);
                        if ((LA89_0 == WS)) {
                            alt89 = 1;
                        }
                        switch (alt89) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:10: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1434);
                            }
                            break;

                        }

                        t = (Token) match(input, COMPARE_OPER, FOLLOW_COMPARE_OPER_in_simpleHaving1439);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:29: ( WS )?
                        int alt90 = 2;
                        int LA90_0 = input.LA(1);
                        if ((LA90_0 == WS)) {
                            alt90 = 1;
                        }
                        switch (alt90) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:233:29: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1441);
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
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:234:4: (e= getEquals )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:234:4: (e= getEquals )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:234:5: e= getEquals
                    {
                        pushFollow(FOLLOW_getEquals_in_simpleHaving1463);
                        e = getEquals();
                        state._fsp--;

                    }

                    having = new Having("=", e.name, e.value);
                }
                break;
                case 3: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:235:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:235:4: (n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT ) )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:235:5: n= NOT WS a= ID ( WS )? t= COMPARE_OPER ( WS )? v= ( LONG | FLOAT )
                    {
                        n = (Token) match(input, NOT, FOLLOW_NOT_in_simpleHaving1474);
                        match(input, WS, FOLLOW_WS_in_simpleHaving1476);
                        a = (Token) match(input, ID, FOLLOW_ID_in_simpleHaving1480);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:235:19: ( WS )?
                        int alt91 = 2;
                        int LA91_0 = input.LA(1);
                        if ((LA91_0 == WS)) {
                            alt91 = 1;
                        }
                        switch (alt91) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:235:19: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1482);
                            }
                            break;

                        }

                        t = (Token) match(input, COMPARE_OPER, FOLLOW_COMPARE_OPER_in_simpleHaving1487);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:235:38: ( WS )?
                        int alt92 = 2;
                        int LA92_0 = input.LA(1);
                        if ((LA92_0 == WS)) {
                            alt92 = 1;
                        }
                        switch (alt92) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:235:38: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleHaving1489);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:238:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );
    public final Having complexHaving() throws RecognitionException {
        Having having = null;

        Token o = null;
        Having s = null;
        Having a = null;
        Having b = null;

        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:239:2: ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) )
            int alt94 = 2;
            alt94 = dfa94.predict(input);
            switch (alt94) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:239:4: (s= simpleHaving )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:239:4: (s= simpleHaving )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:239:5: s= simpleHaving
                    {
                        pushFollow(FOLLOW_simpleHaving_in_complexHaving1522);
                        s = simpleHaving();
                        state._fsp--;

                    }

                    having = s;
                }
                break;
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:4: (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:240:5: a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving
                    {
                        pushFollow(FOLLOW_simpleHaving_in_complexHaving1533);
                        a = simpleHaving();
                        state._fsp--;

                        match(input, WS, FOLLOW_WS_in_complexHaving1535);
                        o = input.LT(1);
                        if (input.LA(1) == AND || input.LA(1) == OR) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        match(input, WS, FOLLOW_WS_in_complexHaving1545);
                        pushFollow(FOLLOW_complexHaving_in_complexHaving1549);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:248:1: selectorFilter returns [Filter filter] : e= getEquals ;
    public final Filter selectorFilter() throws RecognitionException {
        Filter filter = null;

        EqualsToHolder e = null;

        filter = new Filter("selector");
        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:2: (e= getEquals )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:250:4: e= getEquals
            {
                pushFollow(FOLLOW_getEquals_in_selectorFilter1586);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:259:1: regexFilter returns [Filter filter] : (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) ;
    public final Filter regexFilter() throws RecognitionException {
        Filter filter = null;

        Token a = null;
        Token b = null;

        filter = new Filter("regex");
        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:261:2: ( (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:261:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:261:4: (a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING ) )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:261:5: a= ID WS LIKE WS b= ( SINGLE_QUOTE_STRING )
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_regexFilter1615);
                    match(input, WS, FOLLOW_WS_in_regexFilter1617);
                    match(input, LIKE, FOLLOW_LIKE_in_regexFilter1619);
                    match(input, WS, FOLLOW_WS_in_regexFilter1621);
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:261:24: ( SINGLE_QUOTE_STRING )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:261:25: SINGLE_QUOTE_STRING
                    {
                        b = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1627);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:270:1: simpleFilter returns [Filter filter] : ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) );
    public final Filter simpleFilter() throws RecognitionException {
        Filter filter = null;

        Filter a = null;

        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:271:2: ( (a= selectorFilter |a= regexFilter ) | ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN ) )
            int alt99 = 2;
            int LA99_0 = input.LA(1);
            if ((LA99_0 == ID)) {
                alt99 = 1;
            } else if ((LA99_0 == LPARAN)) {
                alt99 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 99, 0, input);
                throw nvae;
            }

            switch (alt99) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:271:4: (a= selectorFilter |a= regexFilter )
                {
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:271:4: (a= selectorFilter |a= regexFilter )
                    int alt95 = 2;
                    int LA95_0 = input.LA(1);
                    if ((LA95_0 == ID)) {
                        int LA95_1 = input.LA(2);
                        if ((LA95_1 == WS)) {
                            int LA95_2 = input.LA(3);
                            if ((LA95_2 == LIKE)) {
                                alt95 = 2;
                            } else if ((LA95_2 == EQUALS)) {
                                alt95 = 1;
                            } else {
                                int nvaeMark = input.mark();
                                try {
                                    for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                        input.consume();
                                    }
                                    NoViableAltException nvae
                                            = new NoViableAltException("", 95, 2, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA95_1 == EQUALS)) {
                            alt95 = 1;
                        } else {
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

                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 95, 0, input);
                        throw nvae;
                    }

                    switch (alt95) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:271:5: a= selectorFilter
                        {
                            pushFollow(FOLLOW_selectorFilter_in_simpleFilter1652);
                            a = selectorFilter();
                            state._fsp--;

                        }
                        break;
                        case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:271:24: a= regexFilter
                        {
                            pushFollow(FOLLOW_regexFilter_in_simpleFilter1658);
                            a = regexFilter();
                            state._fsp--;

                        }
                        break;

                    }

                    filter = a;
                }
                break;
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:5: ( LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:6: LPARAN ( WS )? (a= selectorFilter |a= regexFilter ) ( WS )? RPARAN
                    {
                        match(input, LPARAN, FOLLOW_LPARAN_in_simpleFilter1668);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:13: ( WS )?
                        int alt96 = 2;
                        int LA96_0 = input.LA(1);
                        if ((LA96_0 == WS)) {
                            alt96 = 1;
                        }
                        switch (alt96) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:13: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleFilter1670);
                            }
                            break;

                        }

                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:17: (a= selectorFilter |a= regexFilter )
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
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:18: a= selectorFilter
                            {
                                pushFollow(FOLLOW_selectorFilter_in_simpleFilter1676);
                                a = selectorFilter();
                                state._fsp--;

                            }
                            break;
                            case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:37: a= regexFilter
                            {
                                pushFollow(FOLLOW_regexFilter_in_simpleFilter1682);
                                a = regexFilter();
                                state._fsp--;

                            }
                            break;

                        }

                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:52: ( WS )?
                        int alt98 = 2;
                        int LA98_0 = input.LA(1);
                        if ((LA98_0 == WS)) {
                            alt98 = 1;
                        }
                        switch (alt98) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:272:52: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleFilter1685);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_simpleFilter1688);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:275:1: simpleLogicalFilter returns [Filter filter] : ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) );
    public final Filter simpleLogicalFilter() throws RecognitionException {
        Filter filter = null;

        Token o = null;
        Filter a = null;
        Filter b = null;
        Filter s = null;

        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:2: ( ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) ) | ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN ) )
            int alt103 = 2;
            int LA103_0 = input.LA(1);
            if ((LA103_0 == ID || LA103_0 == NOT)) {
                alt103 = 1;
            } else if ((LA103_0 == LPARAN)) {
                switch (input.LA(2)) {
                    case WS: {
                        int LA103_4 = input.LA(3);
                        if ((LA103_4 == ID)) {
                            int LA103_8 = input.LA(4);
                            if ((LA103_8 == WS)) {
                                int LA103_13 = input.LA(5);
                                if ((LA103_13 == LIKE)) {
                                    int LA103_19 = input.LA(6);
                                    if ((LA103_19 == WS)) {
                                        alt103 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 103, 19, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA103_13 == EQUALS)) {
                                    int LA103_20 = input.LA(6);
                                    if ((LA103_20 == WS)) {
                                        alt103 = 1;
                                    } else if ((LA103_20 == FLOAT || LA103_20 == LONG || LA103_20 == SINGLE_QUOTE_STRING)) {
                                        alt103 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 103, 20, input);
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
                                                = new NoViableAltException("", 103, 13, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA103_8 == EQUALS)) {
                                int LA103_14 = input.LA(5);
                                if ((LA103_14 == WS)) {
                                    int LA103_21 = input.LA(6);
                                    if ((LA103_21 == FLOAT || LA103_21 == LONG || LA103_21 == SINGLE_QUOTE_STRING)) {
                                        alt103 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 103, 21, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA103_14 == FLOAT || LA103_14 == LONG || LA103_14 == SINGLE_QUOTE_STRING)) {
                                    int LA103_22 = input.LA(6);
                                    if ((LA103_22 == WS)) {
                                        alt103 = 1;
                                    } else if ((LA103_22 == RPARAN)) {
                                        alt103 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 103, 22, input);
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
                                                = new NoViableAltException("", 103, 14, input);
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
                                            = new NoViableAltException("", 103, 8, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA103_4 == LPARAN || LA103_4 == NOT)) {
                            alt103 = 2;
                        } else {
                            int nvaeMark = input.mark();
                            try {
                                for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
                                    input.consume();
                                }
                                NoViableAltException nvae
                                        = new NoViableAltException("", 103, 4, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case ID: {
                        int LA103_5 = input.LA(3);
                        if ((LA103_5 == WS)) {
                            int LA103_11 = input.LA(4);
                            if ((LA103_11 == LIKE)) {
                                int LA103_15 = input.LA(5);
                                if ((LA103_15 == WS)) {
                                    int LA103_23 = input.LA(6);
                                    if ((LA103_23 == SINGLE_QUOTE_STRING)) {
                                        alt103 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 103, 23, input);
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
                                                = new NoViableAltException("", 103, 15, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA103_11 == EQUALS)) {
                                int LA103_16 = input.LA(5);
                                if ((LA103_16 == WS)) {
                                    int LA103_24 = input.LA(6);
                                    if ((LA103_24 == FLOAT || LA103_24 == LONG || LA103_24 == SINGLE_QUOTE_STRING)) {
                                        alt103 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 103, 24, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA103_16 == FLOAT || LA103_16 == LONG || LA103_16 == SINGLE_QUOTE_STRING)) {
                                    int LA103_25 = input.LA(6);
                                    if ((LA103_25 == WS)) {
                                        alt103 = 1;
                                    } else if ((LA103_25 == RPARAN)) {
                                        alt103 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 103, 25, input);
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
                                                = new NoViableAltException("", 103, 16, input);
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
                                            = new NoViableAltException("", 103, 11, input);
                                    throw nvae;
                                } finally {
                                    input.rewind(nvaeMark);
                                }
                            }

                        } else if ((LA103_5 == EQUALS)) {
                            int LA103_12 = input.LA(4);
                            if ((LA103_12 == WS)) {
                                int LA103_17 = input.LA(5);
                                if ((LA103_17 == FLOAT || LA103_17 == LONG || LA103_17 == SINGLE_QUOTE_STRING)) {
                                    int LA103_26 = input.LA(6);
                                    if ((LA103_26 == WS)) {
                                        alt103 = 1;
                                    } else if ((LA103_26 == RPARAN)) {
                                        alt103 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 103, 26, input);
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
                                                = new NoViableAltException("", 103, 17, input);
                                        throw nvae;
                                    } finally {
                                        input.rewind(nvaeMark);
                                    }
                                }

                            } else if ((LA103_12 == FLOAT || LA103_12 == LONG || LA103_12 == SINGLE_QUOTE_STRING)) {
                                int LA103_18 = input.LA(5);
                                if ((LA103_18 == WS)) {
                                    int LA103_27 = input.LA(6);
                                    if ((LA103_27 == AND || LA103_27 == OR)) {
                                        alt103 = 2;
                                    } else if ((LA103_27 == RPARAN)) {
                                        alt103 = 1;
                                    } else {
                                        int nvaeMark = input.mark();
                                        try {
                                            for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
                                                input.consume();
                                            }
                                            NoViableAltException nvae
                                                    = new NoViableAltException("", 103, 27, input);
                                            throw nvae;
                                        } finally {
                                            input.rewind(nvaeMark);
                                        }
                                    }

                                } else if ((LA103_18 == RPARAN)) {
                                    alt103 = 1;
                                } else {
                                    int nvaeMark = input.mark();
                                    try {
                                        for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
                                            input.consume();
                                        }
                                        NoViableAltException nvae
                                                = new NoViableAltException("", 103, 18, input);
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
                                            = new NoViableAltException("", 103, 12, input);
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
                                        = new NoViableAltException("", 103, 5, input);
                                throw nvae;
                            } finally {
                                input.rewind(nvaeMark);
                            }
                        }

                    }
                    break;
                    case LPARAN:
                    case NOT: {
                        alt103 = 2;
                    }
                    break;
                    default:
                        int nvaeMark = input.mark();
                        try {
                            input.consume();
                            NoViableAltException nvae
                                    = new NoViableAltException("", 103, 2, input);
                            throw nvae;
                        } finally {
                            input.rewind(nvaeMark);
                        }
                }
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 103, 0, input);
                throw nvae;
            }

            switch (alt103) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
                {
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:3: ( (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter ) | (o= NOT WS b= simpleFilter ) )
                    int alt100 = 2;
                    int LA100_0 = input.LA(1);
                    if ((LA100_0 == ID || LA100_0 == LPARAN)) {
                        alt100 = 1;
                    } else if ((LA100_0 == NOT)) {
                        alt100 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 100, 0, input);
                        throw nvae;
                    }

                    switch (alt100) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
                        {
							// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:4: (a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter )
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:5: a= simpleFilter WS o= ( AND | OR ) WS b= simpleFilter
                            {
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1709);
                                a = simpleFilter();
                                state._fsp--;

                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1711);
                                o = input.LT(1);
                                if (input.LA(1) == AND || input.LA(1) == OR) {
                                    input.consume();
                                    state.errorRecovery = false;
                                } else {
                                    MismatchedSetException mse = new MismatchedSetException(null, input);
                                    throw mse;
                                }
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1721);
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1725);
                                b = simpleFilter();
                                state._fsp--;

                            }

                        }
                        break;
                        case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:55: (o= NOT WS b= simpleFilter )
                        {
							// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:55: (o= NOT WS b= simpleFilter )
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:276:56: o= NOT WS b= simpleFilter
                            {
                                o = (Token) match(input, NOT, FOLLOW_NOT_in_simpleLogicalFilter1733);
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1735);
                                pushFollow(FOLLOW_simpleFilter_in_simpleLogicalFilter1739);
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
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:4: ( LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:5: LPARAN ( WS )? s= simpleLogicalFilter ( WS )? RPARAN
                    {
                        match(input, LPARAN, FOLLOW_LPARAN_in_simpleLogicalFilter1752);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:12: ( WS )?
                        int alt101 = 2;
                        int LA101_0 = input.LA(1);
                        if ((LA101_0 == WS)) {
                            alt101 = 1;
                        }
                        switch (alt101) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:12: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1754);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter1759);
                        s = simpleLogicalFilter();
                        state._fsp--;

                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:38: ( WS )?
                        int alt102 = 2;
                        int LA102_0 = input.LA(1);
                        if ((LA102_0 == WS)) {
                            alt102 = 1;
                        }
                        switch (alt102) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:284:38: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleLogicalFilter1761);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_simpleLogicalFilter1764);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:289:1: grandFilter returns [Filter filter] : (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? ;
    public final Filter grandFilter() throws RecognitionException {
        Filter filter = null;

        Token o = null;
        Filter a = null;
        Filter b = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:290:2: ( (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )? )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:290:4: (a= simpleFilter |a= simpleLogicalFilter ) ( WS o= ( AND | OR ) WS b= grandFilter )?
            {
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:290:4: (a= simpleFilter |a= simpleLogicalFilter )
                int alt104 = 2;
                alt104 = dfa104.predict(input);
                switch (alt104) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:290:5: a= simpleFilter
                    {
                        pushFollow(FOLLOW_simpleFilter_in_grandFilter1788);
                        a = simpleFilter();
                        state._fsp--;

                    }
                    break;
                    case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:290:22: a= simpleLogicalFilter
                    {
                        pushFollow(FOLLOW_simpleLogicalFilter_in_grandFilter1794);
                        a = simpleLogicalFilter();
                        state._fsp--;

                    }
                    break;

                }

                filter = a;
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:290:60: ( WS o= ( AND | OR ) WS b= grandFilter )?
                int alt105 = 2;
                int LA105_0 = input.LA(1);
                if ((LA105_0 == WS)) {
                    int LA105_1 = input.LA(2);
                    if ((LA105_1 == AND || LA105_1 == OR)) {
                        alt105 = 1;
                    }
                }
                switch (alt105) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:290:61: WS o= ( AND | OR ) WS b= grandFilter
                    {
                        match(input, WS, FOLLOW_WS_in_grandFilter1801);
                        o = input.LT(1);
                        if (input.LA(1) == AND || input.LA(1) == OR) {
                            input.consume();
                            state.errorRecovery = false;
                        } else {
                            MismatchedSetException mse = new MismatchedSetException(null, input);
                            throw mse;
                        }
                        match(input, WS, FOLLOW_WS_in_grandFilter1811);
                        pushFollow(FOLLOW_grandFilter_in_grandFilter1815);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:301:1: aggItemInSelect returns [AggItem aggItem] : aggCallSite[aggItem] ( WS AS WS x= ID )? ;
    public final AggItem aggItemInSelect() throws RecognitionException {
        AggItem aggItem = null;

        Token x = null;

        aggItem = new AggItem();
        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:303:2: ( aggCallSite[aggItem] ( WS AS WS x= ID )? )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:303:4: aggCallSite[aggItem] ( WS AS WS x= ID )?
            {
                pushFollow(FOLLOW_aggCallSite_in_aggItemInSelect1852);
                aggCallSite(aggItem);
                state._fsp--;

                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:303:25: ( WS AS WS x= ID )?
                int alt106 = 2;
                int LA106_0 = input.LA(1);
                if ((LA106_0 == WS)) {
                    int LA106_1 = input.LA(2);
                    if ((LA106_1 == AS)) {
                        alt106 = 1;
                    }
                }
                switch (alt106) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:303:26: WS AS WS x= ID
                    {
                        match(input, WS, FOLLOW_WS_in_aggItemInSelect1856);
                        match(input, AS, FOLLOW_AS_in_aggItemInSelect1858);
                        match(input, WS, FOLLOW_WS_in_aggItemInSelect1860);
                        x = (Token) match(input, ID, FOLLOW_ID_in_aggItemInSelect1864);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:305:1: aggCallSite[AggItem aggItem] : (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN ) | COUNT ( '(*)' ) );
    public final void aggCallSite(AggItem aggItem) throws RecognitionException {
        Token x = null;
        String p = null;

        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:2: (p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN ) | COUNT ( '(*)' ) )
            int alt110 = 2;
            int LA110_0 = input.LA(1);
            if ((LA110_0 == DOUBLE_SUM || LA110_0 == JAVASCRIPT || LA110_0 == LONG_SUM || (LA110_0 >= MAX && LA110_0 <= MIN) || LA110_0 == UNIQUE)) {
                alt110 = 1;
            } else if ((LA110_0 == COUNT)) {
                alt110 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 110, 0, input);
                throw nvae;
            }

            switch (alt110) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:4: p= aggFunc ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN )
                {
                    pushFollow(FOLLOW_aggFunc_in_aggCallSite1883);
                    p = aggFunc();
                    state._fsp--;

                    aggItem.setAggType(p);
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:39: ( ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:40: ( WS )? LPARAN ( WS )? (x= ID ) ( WS )? RPARAN
                    {
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:40: ( WS )?
                        int alt107 = 2;
                        int LA107_0 = input.LA(1);
                        if ((LA107_0 == WS)) {
                            alt107 = 1;
                        }
                        switch (alt107) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:40: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite1888);
                            }
                            break;

                        }

                        match(input, LPARAN, FOLLOW_LPARAN_in_aggCallSite1891);
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:51: ( WS )?
                        int alt108 = 2;
                        int LA108_0 = input.LA(1);
                        if ((LA108_0 == WS)) {
                            alt108 = 1;
                        }
                        switch (alt108) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:51: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite1893);
                            }
                            break;

                        }

					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:55: (x= ID )
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:57: x= ID
                        {
                            x = (Token) match(input, ID, FOLLOW_ID_in_aggCallSite1900);
                            aggItem.setFieldName((x != null ? x.getText() : null));
                        }

                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:96: ( WS )?
                        int alt109 = 2;
                        int LA109_0 = input.LA(1);
                        if ((LA109_0 == WS)) {
                            alt109 = 1;
                        }
                        switch (alt109) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:306:96: WS
                            {
                                match(input, WS, FOLLOW_WS_in_aggCallSite1905);
                            }
                            break;

                        }

                        match(input, RPARAN, FOLLOW_RPARAN_in_aggCallSite1908);
                    }

                }
                break;
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:307:4: COUNT ( '(*)' )
                {
                    match(input, COUNT, FOLLOW_COUNT_in_aggCallSite1915);
                    aggItem.setAggType("count");
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:307:41: ( '(*)' )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:307:42: '(*)'
                    {
                        match(input, 70, FOLLOW_70_in_aggCallSite1920);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:310:1: aggFunc returns [String name] : ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT );
    public final String aggFunc() throws RecognitionException {
        String name = null;

        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:311:2: ( LONG_SUM | DOUBLE_SUM | UNIQUE | MIN | MAX | JAVASCRIPT )
            int alt111 = 6;
            switch (input.LA(1)) {
                case LONG_SUM: {
                    alt111 = 1;
                }
                break;
                case DOUBLE_SUM: {
                    alt111 = 2;
                }
                break;
                case UNIQUE: {
                    alt111 = 3;
                }
                break;
                case MIN: {
                    alt111 = 4;
                }
                break;
                case MAX: {
                    alt111 = 5;
                }
                break;
                case JAVASCRIPT: {
                    alt111 = 6;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 111, 0, input);
                    throw nvae;
            }
            switch (alt111) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:311:4: LONG_SUM
                {
                    match(input, LONG_SUM, FOLLOW_LONG_SUM_in_aggFunc1938);
                    name = "longSum";
                }
                break;
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:312:4: DOUBLE_SUM
                {
                    match(input, DOUBLE_SUM, FOLLOW_DOUBLE_SUM_in_aggFunc1945);
                    name = "doubleSum";
                }
                break;
                case 3: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:313:4: UNIQUE
                {
                    match(input, UNIQUE, FOLLOW_UNIQUE_in_aggFunc1952);
                    name = "hyperUnique";
                }
                break;
                case 4: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:314:4: MIN
                {
                    match(input, MIN, FOLLOW_MIN_in_aggFunc1959);
                    name = "min";
                }
                break;
                case 5: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:315:4: MAX
                {
                    match(input, MAX, FOLLOW_MAX_in_aggFunc1966);
                    name = "max";
                }
                break;
                case 6: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:316:4: JAVASCRIPT
                {
                    match(input, JAVASCRIPT, FOLLOW_JAVASCRIPT_in_aggFunc1973);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:322:1: postAggItem returns [PostAggItem postAggItem] : ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) );
    public final PostAggItem postAggItem() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem a = null;
        PostAggItem b = null;

        postAggItem = new PostAggItem("arithmetic");
        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:2: ( (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) | ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? ) )
            int alt121 = 2;
            int LA121_0 = input.LA(1);
            if ((LA121_0 == FLOAT || LA121_0 == ID || LA121_0 == JAVASCRIPT || LA121_0 == LONG || LA121_0 == UNIQUE)) {
                alt121 = 1;
            } else if ((LA121_0 == LPARAN)) {
                alt121 = 2;
            } else {
                NoViableAltException nvae
                        = new NoViableAltException("", 121, 0, input);
                throw nvae;
            }

            switch (alt121) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:4: (a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:5: a= simpleArith ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                    {
                        pushFollow(FOLLOW_simpleArith_in_postAggItem2001);
                        a = simpleArith();
                        state._fsp--;

                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:20: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                        int alt114 = 2;
                        int LA114_0 = input.LA(1);
                        if ((LA114_0 == WS)) {
                            int LA114_1 = input.LA(2);
                            if ((LA114_1 == ARITH_OPER)) {
                                alt114 = 1;
                            }
                        } else if ((LA114_0 == ARITH_OPER)) {
                            alt114 = 1;
                        }
                        switch (alt114) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:21: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
                            {
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:21: ( WS )?
                                int alt112 = 2;
                                int LA112_0 = input.LA(1);
                                if ((LA112_0 == WS)) {
                                    alt112 = 1;
                                }
                                switch (alt112) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:21: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2005);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggArithOper_in_postAggItem2008);
                                postAggArithOper(postAggItem);
                                state._fsp--;

                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:55: ( WS )?
                                int alt113 = 2;
                                int LA113_0 = input.LA(1);
                                if ((LA113_0 == WS)) {
                                    alt113 = 1;
                                }
                                switch (alt113) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:324:55: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2011);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggItem_in_postAggItem2016);
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
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:4: ( ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )? )
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN ) ( postAggLabel[postAggItem] )? ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                    {
					// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:5: ( LPARAN ( WS )? a= postAggItem ( WS )? RPARAN )
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:6: LPARAN ( WS )? a= postAggItem ( WS )? RPARAN
                        {
                            match(input, LPARAN, FOLLOW_LPARAN_in_postAggItem2034);
                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:13: ( WS )?
                            int alt115 = 2;
                            int LA115_0 = input.LA(1);
                            if ((LA115_0 == WS)) {
                                alt115 = 1;
                            }
                            switch (alt115) {
                                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:13: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_postAggItem2036);
                                }
                                break;

                            }

                            pushFollow(FOLLOW_postAggItem_in_postAggItem2041);
                            a = postAggItem();
                            state._fsp--;

                            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:31: ( WS )?
                            int alt116 = 2;
                            int LA116_0 = input.LA(1);
                            if ((LA116_0 == WS)) {
                                alt116 = 1;
                            }
                            switch (alt116) {
                                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:31: WS
                                {
                                    match(input, WS, FOLLOW_WS_in_postAggItem2043);
                                }
                                break;

                            }

                            match(input, RPARAN, FOLLOW_RPARAN_in_postAggItem2046);
                        }

                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:43: ( postAggLabel[postAggItem] )?
                        int alt117 = 2;
                        int LA117_0 = input.LA(1);
                        if ((LA117_0 == AS)) {
                            alt117 = 1;
                        }
                        switch (alt117) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:44: postAggLabel[postAggItem]
                            {
                                pushFollow(FOLLOW_postAggLabel_in_postAggItem2050);
                                postAggLabel(postAggItem);
                                state._fsp--;

                            }
                            break;

                        }

                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:72: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem )?
                        int alt120 = 2;
                        int LA120_0 = input.LA(1);
                        if ((LA120_0 == WS)) {
                            int LA120_1 = input.LA(2);
                            if ((LA120_1 == ARITH_OPER)) {
                                alt120 = 1;
                            }
                        } else if ((LA120_0 == ARITH_OPER)) {
                            alt120 = 1;
                        }
                        switch (alt120) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:73: ( WS )? postAggArithOper[postAggItem] ( WS )? b= postAggItem
                            {
                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:73: ( WS )?
                                int alt118 = 2;
                                int LA118_0 = input.LA(1);
                                if ((LA118_0 == WS)) {
                                    alt118 = 1;
                                }
                                switch (alt118) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:73: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2056);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggArithOper_in_postAggItem2059);
                                postAggArithOper(postAggItem);
                                state._fsp--;

                                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:107: ( WS )?
                                int alt119 = 2;
                                int LA119_0 = input.LA(1);
                                if ((LA119_0 == WS)) {
                                    alt119 = 1;
                                }
                                switch (alt119) {
                                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:331:107: WS
                                    {
                                        match(input, WS, FOLLOW_WS_in_postAggItem2062);
                                    }
                                    break;

                                }

                                pushFollow(FOLLOW_postAggItem_in_postAggItem2067);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:342:1: simpleArith returns [PostAggItem postAggItem] : (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? ;
    public final PostAggItem simpleArith() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem a = null;
        PostAggItem b = null;

        postAggItem = new PostAggItem("arithmetic");
        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:2: ( (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )? )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:4: (a= simplePostAggAccess ) ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:4: (a= simplePostAggAccess )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:5: a= simplePostAggAccess
                {
                    pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2103);
                    a = simplePostAggAccess();
                    state._fsp--;

                    postAggItem = a;
                }

                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?
                int alt124 = 2;
                alt124 = dfa124.predict(input);
                switch (alt124) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:46: ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess
                    {
                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:46: ( WS )?
                        int alt122 = 2;
                        int LA122_0 = input.LA(1);
                        if ((LA122_0 == WS)) {
                            alt122 = 1;
                        }
                        switch (alt122) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:46: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleArith2109);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_postAggArithOper_in_simpleArith2112);
                        postAggArithOper(postAggItem);
                        state._fsp--;

                        // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:80: ( WS )?
                        int alt123 = 2;
                        int LA123_0 = input.LA(1);
                        if ((LA123_0 == WS)) {
                            alt123 = 1;
                        }
                        switch (alt123) {
                            case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:344:80: WS
                            {
                                match(input, WS, FOLLOW_WS_in_simpleArith2115);
                            }
                            break;

                        }

                        pushFollow(FOLLOW_simplePostAggAccess_in_simpleArith2120);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:356:1: simplePostAggAccess returns [PostAggItem postAggItem] : (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef );
    public final PostAggItem simplePostAggAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        PostAggItem c = null;
        PostAggItem f = null;
        PostAggItem h = null;
        PostAggItem js = null;

        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:357:2: (c= constantAccess |f= fieldAccess |h= hyperUniqueCardinality |js= postAggJavascriptDef )
            int alt125 = 4;
            switch (input.LA(1)) {
                case FLOAT:
                case LONG: {
                    alt125 = 1;
                }
                break;
                case ID: {
                    alt125 = 2;
                }
                break;
                case UNIQUE: {
                    alt125 = 3;
                }
                break;
                case JAVASCRIPT: {
                    alt125 = 4;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 125, 0, input);
                    throw nvae;
            }
            switch (alt125) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:357:4: c= constantAccess
                {
                    pushFollow(FOLLOW_constantAccess_in_simplePostAggAccess2149);
                    c = constantAccess();
                    state._fsp--;

                    postAggItem = c;
                }
                break;
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:358:4: f= fieldAccess
                {
                    pushFollow(FOLLOW_fieldAccess_in_simplePostAggAccess2166);
                    f = fieldAccess();
                    state._fsp--;

                    postAggItem = f;
                }
                break;
                case 3: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:359:4: h= hyperUniqueCardinality
                {
                    pushFollow(FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2179);
                    h = hyperUniqueCardinality();
                    state._fsp--;

                    postAggItem = h;
                }
                break;
                case 4: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:360:4: js= postAggJavascriptDef
                {
                    pushFollow(FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2188);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:365:1: constantAccess returns [PostAggItem postAggItem] : ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) ;
    public final PostAggItem constantAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("constant");
        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:2: ( ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:4: ( (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )? )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:5: (a= FLOAT |a= LONG ) ( WS postAggLabel[postAggItem] )?
                {
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:5: (a= FLOAT |a= LONG )
                    int alt126 = 2;
                    int LA126_0 = input.LA(1);
                    if ((LA126_0 == FLOAT)) {
                        alt126 = 1;
                    } else if ((LA126_0 == LONG)) {
                        alt126 = 2;
                    } else {
                        NoViableAltException nvae
                                = new NoViableAltException("", 126, 0, input);
                        throw nvae;
                    }

                    switch (alt126) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:6: a= FLOAT
                        {
                            a = (Token) match(input, FLOAT, FOLLOW_FLOAT_in_constantAccess2218);
                        }
                        break;
                        case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:367:16: a= LONG
                        {
                            a = (Token) match(input, LONG, FOLLOW_LONG_in_constantAccess2224);
                        }
                        break;

                    }

                    postAggItem.constantValue = Double.valueOf((a != null ? a.getText() : null));
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:369:5: ( WS postAggLabel[postAggItem] )?
                    int alt127 = 2;
                    int LA127_0 = input.LA(1);
                    if ((LA127_0 == WS)) {
                        int LA127_1 = input.LA(2);
                        if ((LA127_1 == AS)) {
                            alt127 = 1;
                        }
                    }
                    switch (alt127) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:369:6: WS postAggLabel[postAggItem]
                        {
                            match(input, WS, FOLLOW_WS_in_constantAccess2237);
                            pushFollow(FOLLOW_postAggLabel_in_constantAccess2239);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:372:1: fieldAccess returns [PostAggItem postAggItem] : (a= ID ( WS postAggLabel[postAggItem] )? ) ;
    public final PostAggItem fieldAccess() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("fieldAccess");
        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:2: ( (a= ID ( WS postAggLabel[postAggItem] )? ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:4: (a= ID ( WS postAggLabel[postAggItem] )? )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:4: (a= ID ( WS postAggLabel[postAggItem] )? )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:5: a= ID ( WS postAggLabel[postAggItem] )?
                {
                    a = (Token) match(input, ID, FOLLOW_ID_in_fieldAccess2267);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:10: ( WS postAggLabel[postAggItem] )?
                    int alt128 = 2;
                    int LA128_0 = input.LA(1);
                    if ((LA128_0 == WS)) {
                        int LA128_1 = input.LA(2);
                        if ((LA128_1 == AS)) {
                            alt128 = 1;
                        }
                    }
                    switch (alt128) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:374:11: WS postAggLabel[postAggItem]
                        {
                            match(input, WS, FOLLOW_WS_in_fieldAccess2270);
                            pushFollow(FOLLOW_postAggLabel_in_fieldAccess2272);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:377:1: hyperUniqueCardinality returns [PostAggItem postAggItem] : ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) ;
    public final PostAggItem hyperUniqueCardinality() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token a = null;

        postAggItem = new PostAggItem("hyperUniqueCardinality");
        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:2: ( ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:4: ( UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:5: UNIQUE ( WS )? LPARAN ( WS )? a= ID ( WS )? RPARAN
                {
                    match(input, UNIQUE, FOLLOW_UNIQUE_in_hyperUniqueCardinality2301);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:12: ( WS )?
                    int alt129 = 2;
                    int LA129_0 = input.LA(1);
                    if ((LA129_0 == WS)) {
                        alt129 = 1;
                    }
                    switch (alt129) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:12: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality2303);
                        }
                        break;

                    }

                    match(input, LPARAN, FOLLOW_LPARAN_in_hyperUniqueCardinality2306);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:23: ( WS )?
                    int alt130 = 2;
                    int LA130_0 = input.LA(1);
                    if ((LA130_0 == WS)) {
                        alt130 = 1;
                    }
                    switch (alt130) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:23: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality2308);
                        }
                        break;

                    }

                    a = (Token) match(input, ID, FOLLOW_ID_in_hyperUniqueCardinality2313);
                    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:32: ( WS )?
                    int alt131 = 2;
                    int LA131_0 = input.LA(1);
                    if ((LA131_0 == WS)) {
                        alt131 = 1;
                    }
                    switch (alt131) {
                        case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:379:32: WS
                        {
                            match(input, WS, FOLLOW_WS_in_hyperUniqueCardinality2315);
                        }
                        break;

                    }

                    match(input, RPARAN, FOLLOW_RPARAN_in_hyperUniqueCardinality2318);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:384:1: postAggJavascriptDef returns [PostAggItem postAggItem] : JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING ;
    public final PostAggItem postAggJavascriptDef() throws RecognitionException {
        PostAggItem postAggItem = null;

        Token str = null;

        postAggItem = new PostAggItem("javascript");
        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:2: ( JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:4: JAVASCRIPT ( WS )? str= SINGLE_QUOTE_STRING
            {
                match(input, JAVASCRIPT, FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2344);
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:15: ( WS )?
                int alt132 = 2;
                int LA132_0 = input.LA(1);
                if ((LA132_0 == WS)) {
                    alt132 = 1;
                }
                switch (alt132) {
                    case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:386:15: WS
                    {
                        match(input, WS, FOLLOW_WS_in_postAggJavascriptDef2346);
                    }
                    break;

                }

                str = (Token) match(input, SINGLE_QUOTE_STRING, FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2351);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:389:1: postAggLabel[PostAggItem postAggItem] : ( AS WS id= ID ) ;
    public final void postAggLabel(PostAggItem postAggItem) throws RecognitionException {
        Token id = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:2: ( ( AS WS id= ID ) )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:4: ( AS WS id= ID )
            {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:4: ( AS WS id= ID )
                // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:390:5: AS WS id= ID
                {
                    match(input, AS, FOLLOW_AS_in_postAggLabel2367);
                    match(input, WS, FOLLOW_WS_in_postAggLabel2369);
                    id = (Token) match(input, ID, FOLLOW_ID_in_postAggLabel2373);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:393:1: postAggArithOper[PostAggItem postAggItem] : arith= ARITH_OPER ;
    public final void postAggArithOper(PostAggItem postAggItem) throws RecognitionException {
        Token arith = null;

        try {
			// /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:2: (arith= ARITH_OPER )
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:394:3: arith= ARITH_OPER
            {
                arith = (Token) match(input, ARITH_OPER, FOLLOW_ARITH_OPER_in_postAggArithOper2389);
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
    // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:399:1: isoTime returns [String date] : (d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ );
    public final druidGParser.isoTime_return isoTime() throws RecognitionException {
        druidGParser.isoTime_return retval = new druidGParser.isoTime_return();
        retval.start = input.LT(1);

        Token d = null;

        try {
            // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:400:2: (d= DATE_HOUR |d= DATE_HOUR_MIN |d= DATE_HOUR_MIN_SEC |d= DATE_HOUR_MIN_SEC_SUB |d= DATE_HOUR_MIN_SEC_SUB_TZ |d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ )
            int alt133 = 6;
            switch (input.LA(1)) {
                case DATE_HOUR: {
                    alt133 = 1;
                }
                break;
                case DATE_HOUR_MIN: {
                    alt133 = 2;
                }
                break;
                case DATE_HOUR_MIN_SEC: {
                    alt133 = 3;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB: {
                    alt133 = 4;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB_TZ: {
                    alt133 = 5;
                }
                break;
                case DATE_HOUR_MIN_SEC_SUB_UTC_TZ: {
                    alt133 = 6;
                }
                break;
                default:
                    NoViableAltException nvae
                            = new NoViableAltException("", 133, 0, input);
                    throw nvae;
            }
            switch (alt133) {
                case 1: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:400:3: d= DATE_HOUR
                {
                    d = (Token) match(input, DATE_HOUR, FOLLOW_DATE_HOUR_in_isoTime2408);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 2: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:401:3: d= DATE_HOUR_MIN
                {
                    d = (Token) match(input, DATE_HOUR_MIN, FOLLOW_DATE_HOUR_MIN_in_isoTime2416);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 3: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:402:3: d= DATE_HOUR_MIN_SEC
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC, FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2424);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 4: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:403:3: d= DATE_HOUR_MIN_SEC_SUB
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB, FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2432);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 5: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:404:3: d= DATE_HOUR_MIN_SEC_SUB_TZ
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB_TZ, FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2440);
                    retval.date = (d != null ? d.getText() : null);
                }
                break;
                case 6: // /Users/srikalyan/Sql4D/Sql4DCompiler/src/main/java/com/yahoo/sql4d/druidG.g:405:3: d= DATE_HOUR_MIN_SEC_SUB_UTC_TZ
                {
                    d = (Token) match(input, DATE_HOUR_MIN_SEC_SUB_UTC_TZ, FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2448);
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
    protected DFA94 dfa94 = new DFA94(this);
    protected DFA104 dfa104 = new DFA104(this);
    protected DFA124 dfa124 = new DFA124(this);
    static final String DFA94_eotS
            = "\140\uffff";
    static final String DFA94_eofS
            = "\140\uffff";
    static final String DFA94_minS
            = "\1\41\1\13\1\105\1\13\2\33\1\41\3\33\1\72\1\33\1\72\1\13\1\33\1\72\1\33"
            + "\2\72\1\4\1\uffff\1\72\1\4\1\uffff\1\13\1\33\1\72\1\4\1\uffff\1\72\1\4"
            + "\1\uffff\1\4\11\uffff\1\4\11\uffff\2\33\1\72\51\uffff";
    static final String DFA94_maxS
            = "\1\60\2\105\1\30\2\105\1\41\2\105\1\51\1\105\1\75\2\105\1\51\1\105\1\75"
            + "\2\105\1\104\1\uffff\1\105\1\104\1\uffff\1\13\2\105\1\104\1\uffff\1\105"
            + "\1\104\1\uffff\1\104\11\uffff\1\104\11\uffff\1\105\1\51\1\105\51\uffff";
    static final String DFA94_acceptS
            = "\24\uffff\1\1\23\uffff\1\2\16\uffff\1\1\11\uffff\1\1\31\uffff\4\1\1\uffff";
    static final String DFA94_specialS
            = "\140\uffff}>";
    static final String[] DFA94_transitionS = {
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

    static final short[] DFA94_eot = DFA.unpackEncodedString(DFA94_eotS);
    static final short[] DFA94_eof = DFA.unpackEncodedString(DFA94_eofS);
    static final char[] DFA94_min = DFA.unpackEncodedStringToUnsignedChars(DFA94_minS);
    static final char[] DFA94_max = DFA.unpackEncodedStringToUnsignedChars(DFA94_maxS);
    static final short[] DFA94_accept = DFA.unpackEncodedString(DFA94_acceptS);
    static final short[] DFA94_special = DFA.unpackEncodedString(DFA94_specialS);
    static final short[][] DFA94_transition;

    static {
        int numStates = DFA94_transitionS.length;
        DFA94_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA94_transition[i] = DFA.unpackEncodedString(DFA94_transitionS[i]);
        }
    }

    protected class DFA94 extends DFA {

        public DFA94(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 94;
            this.eot = DFA94_eot;
            this.eof = DFA94_eof;
            this.min = DFA94_min;
            this.max = DFA94_max;
            this.accept = DFA94_accept;
            this.special = DFA94_special;
            this.transition = DFA94_transition;
        }

        @Override
        public String getDescription() {
            return "238:1: complexHaving returns [Having having] : ( (s= simpleHaving ) | (a= simpleHaving WS o= ( AND | OR ) WS b= complexHaving ) );";
        }
    }

    static final String DFA104_eotS
            = "\142\uffff";
    static final String DFA104_eofS
            = "\142\uffff";
    static final String DFA104_minS
            = "\1\41\1\30\1\41\1\uffff\1\30\1\33\1\41\1\30\2\uffff\1\105\2\33\1\72\1"
            + "\30\2\uffff\1\30\1\33\1\75\1\33\2\72\1\4\1\uffff\1\30\1\33\1\105\2\33"
            + "\3\72\1\4\1\uffff\1\4\1\uffff\1\105\11\uffff\1\105\2\33\1\72\1\75\1\33"
            + "\2\72\1\4\1\72\51\uffff";
    static final String DFA104_maxS
            = "\1\60\2\105\1\uffff\1\47\1\105\1\60\1\105\2\uffff\2\105\1\75\2\105\2\uffff"
            + "\1\47\1\105\2\75\2\105\1\104\1\uffff\1\47\3\105\1\75\3\105\1\104\1\uffff"
            + "\1\104\1\uffff\1\105\11\uffff\2\105\1\75\1\105\2\75\2\105\1\72\1\105\51"
            + "\uffff";
    static final String DFA104_acceptS
            = "\3\uffff\1\2\24\uffff\1\1\40\uffff\1\1\1\uffff\1\1\1\uffff\1\1\11\uffff"
            + "\1\1\11\uffff\15\1\1\uffff\2\1\1\uffff";
    static final String DFA104_specialS
            = "\142\uffff}>";
    static final String[] DFA104_transitionS = {
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

    static final short[] DFA104_eot = DFA.unpackEncodedString(DFA104_eotS);
    static final short[] DFA104_eof = DFA.unpackEncodedString(DFA104_eofS);
    static final char[] DFA104_min = DFA.unpackEncodedStringToUnsignedChars(DFA104_minS);
    static final char[] DFA104_max = DFA.unpackEncodedStringToUnsignedChars(DFA104_maxS);
    static final short[] DFA104_accept = DFA.unpackEncodedString(DFA104_acceptS);
    static final short[] DFA104_special = DFA.unpackEncodedString(DFA104_specialS);
    static final short[][] DFA104_transition;

    static {
        int numStates = DFA104_transitionS.length;
        DFA104_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA104_transition[i] = DFA.unpackEncodedString(DFA104_transitionS[i]);
        }
    }

    protected class DFA104 extends DFA {

        public DFA104(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 104;
            this.eot = DFA104_eot;
            this.eof = DFA104_eof;
            this.min = DFA104_min;
            this.max = DFA104_max;
            this.accept = DFA104_accept;
            this.special = DFA104_special;
            this.transition = DFA104_transition;
        }

        @Override
        public String getDescription() {
            return "290:4: (a= simpleFilter |a= simpleLogicalFilter )";
        }
    }

    static final String DFA124_eotS
            = "\130\uffff";
    static final String DFA124_eofS
            = "\130\uffff";
    static final String DFA124_minS
            = "\2\5\1\33\4\uffff\1\33\1\uffff\1\33\3\uffff\1\53\1\75\1\uffff\1\33\3\uffff"
            + "\1\53\1\75\4\uffff\1\53\1\75\1\uffff\1\53\1\41\1\75\4\uffff\1\53\1\75"
            + "\1\uffff\1\53\1\41\1\75\1\uffff\1\53\1\41\1\75\1\uffff\2\41\1\72\1\uffff"
            + "\1\53\1\41\1\75\1\uffff\2\41\1\72\1\uffff\2\41\1\72\1\uffff\1\41\3\72"
            + "\25\uffff";
    static final String DFA124_maxS
            = "\1\105\1\104\1\105\4\uffff\1\105\1\uffff\1\102\3\uffff\2\105\1\uffff\1"
            + "\102\3\uffff\2\105\4\uffff\2\105\1\uffff\1\53\1\105\1\75\4\uffff\2\105"
            + "\1\uffff\1\53\1\105\1\75\1\uffff\1\53\1\105\1\75\1\uffff\1\105\1\41\1"
            + "\105\1\uffff\1\53\1\105\1\75\1\uffff\1\105\1\41\1\105\1\uffff\1\105\1"
            + "\41\1\105\1\uffff\1\41\2\105\1\72\25\uffff";
    static final String DFA124_acceptS
            = "\3\uffff\1\2\6\uffff\3\1\4\uffff\3\1\3\uffff\3\1\6\uffff\4\1\6\uffff\1"
            + "\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\3\uffff\1\1\4\uffff"
            + "\25\1";
    static final String DFA124_specialS
            = "\130\uffff}>";
    static final String[] DFA124_transitionS = {
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

    static final short[] DFA124_eot = DFA.unpackEncodedString(DFA124_eotS);
    static final short[] DFA124_eof = DFA.unpackEncodedString(DFA124_eofS);
    static final char[] DFA124_min = DFA.unpackEncodedStringToUnsignedChars(DFA124_minS);
    static final char[] DFA124_max = DFA.unpackEncodedStringToUnsignedChars(DFA124_maxS);
    static final short[] DFA124_accept = DFA.unpackEncodedString(DFA124_acceptS);
    static final short[] DFA124_special = DFA.unpackEncodedString(DFA124_specialS);
    static final short[][] DFA124_transition;

    static {
        int numStates = DFA124_transitionS.length;
        DFA124_transition = new short[numStates][];
        for (int i = 0; i < numStates; i++) {
            DFA124_transition[i] = DFA.unpackEncodedString(DFA124_transitionS[i]);
        }
    }

    protected class DFA124 extends DFA {

        public DFA124(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 124;
            this.eot = DFA124_eot;
            this.eof = DFA124_eof;
            this.min = DFA124_min;
            this.max = DFA124_max;
            this.accept = DFA124_accept;
            this.special = DFA124_special;
            this.transition = DFA124_transition;
        }

        @Override
        public String getDescription() {
            return "344:45: ( ( WS )? postAggArithOper[postAggItem] ( WS )? b= simplePostAggAccess )?";
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
    public static final BitSet FOLLOW_WS_in_statement162 = new BitSet(new long[]{0x0000640A00402000L, 0x0000000000000084L});
    public static final BitSet FOLLOW_selectItems_in_statement189 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement193 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_statement196 = new BitSet(new long[]{0x0000640A00402000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_statement198 = new BitSet(new long[]{0x0000640A00402000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_selectItems_in_statement201 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_71_in_statement232 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement250 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FROM_in_statement252 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement254 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement258 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement275 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_in_statement277 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement279 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000200L});
    public static final BitSet FOLLOW_whereClause_in_statement281 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement298 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_BREAK_in_statement300 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement302 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_statement304 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement306 = new BitSet(new long[]{0x2080000000800000L});
    public static final BitSet FOLLOW_granularityClause_in_statement308 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement319 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_GROUP_in_statement321 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement323 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_statement325 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement327 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement353 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement385 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_statement388 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement390 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement395 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement452 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_HAVING_in_statement454 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement456 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_havingClause_in_statement460 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement504 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_ORDER_in_statement506 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement508 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_BY_in_statement510 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement512 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_statement517 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement550 = new BitSet(new long[]{0x0000000000200080L});
    public static final BitSet FOLLOW_set_in_statement554 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement604 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_LIMIT_in_statement606 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement608 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LONG_in_statement613 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement651 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000001L});
    public static final BitSet FOLLOW_THEN_in_statement653 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement655 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_statement659 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement674 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000010L});
    public static final BitSet FOLLOW_WHICH_in_statement676 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement678 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_CONTAINS_in_statement680 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement684 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_statement687 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement689 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement695 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement699 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_statement702 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement704 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement709 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_statement716 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_statement719 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement725 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_SORT_in_statement727 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement729 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_statement732 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement734 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement740 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement745 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_statement748 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement760 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_HINT_in_statement762 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement764 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_statement767 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement769 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_statement774 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_statement778 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_statement781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggItemInSelect_in_selectItems800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleDim_in_selectItems808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleDim824 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleDim827 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_simpleDim829 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleDim831 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_simpleDim835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_intervalClause_in_whereClause856 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_whereClause860 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_whereClause862 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_whereClause864 = new BitSet(new long[]{0x0001080200000000L});
    public static final BitSet FOLLOW_grandFilter_in_whereClause868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_intervalClause887 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause889 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_BETWEEN_in_intervalClause891 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause893 = new BitSet(new long[]{0x20000800001F8000L});
    public static final BitSet FOLLOW_isoTime_in_intervalClause913 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause920 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause924 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AND_in_intervalClause926 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause928 = new BitSet(new long[]{0x20000000001F8000L});
    public static final BitSet FOLLOW_isoTime_in_intervalClause933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_intervalClause940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_intervalClause965 = new BitSet(new long[]{0x0000100000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause967 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairString_in_intervalClause972 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_intervalClause984 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_intervalClause987 = new BitSet(new long[]{0x0000100000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_intervalClause989 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairString_in_intervalClause994 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_intervalClause1000 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_intervalClause1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_getEquals1026 = new BitSet(new long[]{0x0000000001000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_getEquals1028 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_EQUALS_in_getEquals1031 = new BitSet(new long[]{0x2000020008000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_getEquals1033 = new BitSet(new long[]{0x2000020008000000L});
    public static final BitSet FOLLOW_set_in_getEquals1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DURATION_in_granularityClause1101 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1105 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityClause1108 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1110 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1115 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1119 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityClause1123 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1125 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1130 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1137 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_granularityClause1140 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1142 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_granularityInclude_in_granularityClause1145 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1148 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_granularityClause1153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PERIOD_in_granularityClause1172 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1176 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityClause1179 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1181 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1186 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1190 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityClause1194 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1196 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1201 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1207 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityClause1211 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1213 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_granularityClause1218 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityClause1225 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_granularityClause1228 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1230 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_granularityInclude_in_granularityClause1233 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityClause1236 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_granularityClause1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1263 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_INCLUDE_in_granularityInclude1265 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1267 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_granularityInclude1270 = new BitSet(new long[]{0x0000100000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1272 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairNums_in_granularityInclude1278 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_72_in_granularityInclude1283 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_pairNums_in_granularityInclude1287 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_granularityInclude1294 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_granularityInclude1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_pairNums1316 = new BitSet(new long[]{0x0000020000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairNums1318 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LONG_in_pairNums1323 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_pairNums1326 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_pairNums1329 = new BitSet(new long[]{0x0000020000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairNums1331 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_LONG_in_pairNums1336 = new BitSet(new long[]{0x0800000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairNums1338 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_pairNums1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LSQUARE_in_pairString1361 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairString1363 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1368 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000120L});
    public static final BitSet FOLLOW_WS_in_pairString1371 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_pairString1374 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairString1376 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_pairString1381 = new BitSet(new long[]{0x0800000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_pairString1383 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_RSQUARE_in_pairString1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complexHaving_in_havingClause1411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_simpleHaving1432 = new BitSet(new long[]{0x0000000000000800L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1434 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1439 = new BitSet(new long[]{0x0000020008000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1441 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_set_in_simpleHaving1446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getEquals_in_simpleHaving1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_simpleHaving1474 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1476 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_simpleHaving1480 = new BitSet(new long[]{0x0000000000000800L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1482 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_COMPARE_OPER_in_simpleHaving1487 = new BitSet(new long[]{0x0000020008000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleHaving1489 = new BitSet(new long[]{0x0000020008000000L});
    public static final BitSet FOLLOW_set_in_simpleHaving1494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleHaving_in_complexHaving1522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleHaving_in_complexHaving1533 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_complexHaving1535 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_complexHaving1539 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_complexHaving1545 = new BitSet(new long[]{0x0001000200000000L});
    public static final BitSet FOLLOW_complexHaving_in_complexHaving1549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_getEquals_in_selectorFilter1586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_regexFilter1615 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_regexFilter1617 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_LIKE_in_regexFilter1619 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_regexFilter1621 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_regexFilter1627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectorFilter_in_simpleFilter1652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_regexFilter_in_simpleFilter1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_simpleFilter1668 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleFilter1670 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_selectorFilter_in_simpleFilter1676 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_regexFilter_in_simpleFilter1682 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleFilter1685 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_simpleFilter1688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1709 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1711 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_simpleLogicalFilter1715 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1721 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_simpleLogicalFilter1733 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1735 = new BitSet(new long[]{0x0000080200000000L});
    public static final BitSet FOLLOW_simpleFilter_in_simpleLogicalFilter1739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_simpleLogicalFilter1752 = new BitSet(new long[]{0x0001080200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1754 = new BitSet(new long[]{0x0001080200000000L});
    public static final BitSet FOLLOW_simpleLogicalFilter_in_simpleLogicalFilter1759 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleLogicalFilter1761 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_simpleLogicalFilter1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleFilter_in_grandFilter1788 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_simpleLogicalFilter_in_grandFilter1794 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_grandFilter1801 = new BitSet(new long[]{0x0020000000000010L});
    public static final BitSet FOLLOW_set_in_grandFilter1805 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_grandFilter1811 = new BitSet(new long[]{0x0001080200000000L});
    public static final BitSet FOLLOW_grandFilter_in_grandFilter1815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggCallSite_in_aggItemInSelect1852 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggItemInSelect1856 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_AS_in_aggItemInSelect1858 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggItemInSelect1860 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_aggItemInSelect1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_aggFunc_in_aggCallSite1883 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggCallSite1888 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_aggCallSite1891 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggCallSite1893 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_aggCallSite1900 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_aggCallSite1905 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_aggCallSite1908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_aggCallSite1915 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_aggCallSite1920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LONG_SUM_in_aggFunc1938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_SUM_in_aggFunc1945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_aggFunc1952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_aggFunc1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_aggFunc1966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JAVASCRIPT_in_aggFunc1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simpleArith_in_postAggItem2001 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggItem2005 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_postAggItem2008 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_postAggItem2011 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem2016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPARAN_in_postAggItem2034 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_postAggItem2036 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem2041 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggItem2043 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_postAggItem2046 = new BitSet(new long[]{0x0000000000000062L, 0x0000000000000020L});
    public static final BitSet FOLLOW_postAggLabel_in_postAggItem2050 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggItem2056 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_postAggItem2059 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_postAggItem2062 = new BitSet(new long[]{0x00000A0A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_postAggItem_in_postAggItem2067 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2103 = new BitSet(new long[]{0x0000000000000022L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_simpleArith2109 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_postAggArithOper_in_simpleArith2112 = new BitSet(new long[]{0x0000020A08000000L, 0x0000000000000024L});
    public static final BitSet FOLLOW_WS_in_simpleArith2115 = new BitSet(new long[]{0x0000020A08000000L, 0x0000000000000004L});
    public static final BitSet FOLLOW_simplePostAggAccess_in_simpleArith2120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantAccess_in_simplePostAggAccess2149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_fieldAccess_in_simplePostAggAccess2166 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hyperUniqueCardinality_in_simplePostAggAccess2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_postAggJavascriptDef_in_simplePostAggAccess2188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_constantAccess2218 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_LONG_in_constantAccess2224 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_constantAccess2237 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_postAggLabel_in_constantAccess2239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fieldAccess2267 = new BitSet(new long[]{0x0000000000000002L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_fieldAccess2270 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_postAggLabel_in_fieldAccess2272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNIQUE_in_hyperUniqueCardinality2301 = new BitSet(new long[]{0x0000080000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2303 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_LPARAN_in_hyperUniqueCardinality2306 = new BitSet(new long[]{0x0000000200000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2308 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_hyperUniqueCardinality2313 = new BitSet(new long[]{0x0400000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_hyperUniqueCardinality2315 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_RPARAN_in_hyperUniqueCardinality2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_JAVASCRIPT_in_postAggJavascriptDef2344 = new BitSet(new long[]{0x2000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggJavascriptDef2346 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_SINGLE_QUOTE_STRING_in_postAggJavascriptDef2351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AS_in_postAggLabel2367 = new BitSet(new long[]{0x0000000000000000L, 0x0000000000000020L});
    public static final BitSet FOLLOW_WS_in_postAggLabel2369 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_ID_in_postAggLabel2373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ARITH_OPER_in_postAggArithOper2389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_in_isoTime2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_in_isoTime2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_in_isoTime2424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_in_isoTime2432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_TZ_in_isoTime2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATE_HOUR_MIN_SEC_SUB_UTC_TZ_in_isoTime2448 = new BitSet(new long[]{0x0000000000000002L});
}
