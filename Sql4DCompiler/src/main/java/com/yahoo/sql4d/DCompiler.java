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
package com.yahoo.sql4d;

import com.yahoo.sql4d.converter.druidGLexer;
import com.yahoo.sql4d.converter.druidGParser;
import com.yahoo.sql4d.query.Program;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

/**
 * A rudimentary compiler for Druid Dql -> Druid Json.
 * @author srikalyan
 */
public class DCompiler {
    /**
     * To avoid instantiation.
     */
    private DCompiler() {
    }
    /**
     * Sql->Json.
     * @param query
     * @return 
     */
    public static Program compileSql(String query) {
        try {
            ANTLRStringStream in = new ANTLRStringStream(query);
            druidGLexer lexer = new druidGLexer(in);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            druidGParser parser = new druidGParser(tokens);
            Program pgm = parser.program();
            return pgm;
        } catch (RecognitionException ex) {
            Logger.getLogger(DCompiler.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
