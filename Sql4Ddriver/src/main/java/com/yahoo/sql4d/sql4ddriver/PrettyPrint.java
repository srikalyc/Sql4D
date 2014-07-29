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
package com.yahoo.sql4d.sql4ddriver;


import static java.lang.String.format;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Partial code modified from a publication here
 * http://stackoverflow.com/questions/11383070/pretty-print-2d-array-in-java
 * @author srikalyan
 */
public final class PrettyPrint {

    private static final char BORDER_KNOT = '+';
    private static final char HORIZONTAL_BORDER = '-';
    private static final char VERTICAL_BORDER = '|';

    private static final String asNull = "(NULL)";

    public static void print(Mapper4All mapper4All) {
        int rowsSize = mapper4All.baseAllRows.size() + 1;// +1 for headers
        String[][] table = new String[rowsSize][];
        table[0] = mapper4All.baseFieldNames.toArray(new String[0]);
        int index = 1;
        for (List<Object> row: mapper4All.baseAllRows) {
            table[index] = new String[row.size()];
            int i = 0;
            for (Object col:row) {
                table[index][i++] = col.toString();
            }
            index++;
        }
        print(table);
    }

    public static void print(Joiner4All joiner4All) {
        int rowsSize = joiner4All.baseAllRows.size() + 1;// +1 for headers
        String[][] table = new String[rowsSize][];
        table[0] = joiner4All.baseFieldNames.toArray(new String[0]);
        int index = 1;
        for (List<Object> row: joiner4All.baseAllRows.values()) {
            table[index] = new String[row.size()];
            int i = 0;
            for (Object col:row) {
                table[index][i++] = col.toString();
            }
            index++;
        }
        print(table);
    }

    public static void print(String[][] table) {
        if ( table == null ) {
            throw new IllegalArgumentException("No tabular data provided");
        }
        if ( table.length == 0 ) {
            return;
        }
        final int[] widths = new int[getMaxColumns(table)];
        adjustColumnWidths(table, widths);
        printPreparedTable(table, widths, getHorizontalBorder(widths));
    }

    private static void printPreparedTable(String[][] table, int widths[], String horizontalBorder) {
        final int lineLength = horizontalBorder.length();
        Util.println(horizontalBorder);
        for ( final String[] row : table ) {
            if (row != null) {
                Util.println(getRow(row, widths, lineLength));
                Util.println(horizontalBorder);
            }
        }
    }

    private static String getRow(String[] row, int[] widths, int lineLength) {
        final StringBuilder builder = new StringBuilder(lineLength).append(VERTICAL_BORDER);
        final int maxWidths = widths.length;
        for ( int i = 0; i < maxWidths; i++ ) {
            builder.append(padRight(getCellValue(safeGet(row, i, null)), widths[i])).append(VERTICAL_BORDER);
        }
        return builder.toString();
    }

    private static int getMaxColumns(String[][] rows) {
        int max = 0;
        for ( final String[] row : rows ) {
            if ( row != null && row.length > max ) {
                max = row.length;
            }
        }
        return max;
    }
    
    private static String getHorizontalBorder(int[] widths) {
        final StringBuilder builder = new StringBuilder(256);
        builder.append(BORDER_KNOT);
        for ( final int w : widths ) {
            for ( int i = 0; i < w; i++ ) {
                builder.append(HORIZONTAL_BORDER);
            }
            builder.append(BORDER_KNOT);
        }
        return builder.toString();
    }
    
    private static void adjustColumnWidths(String[][] rows, int[] widths) {
        for ( final String[] row : rows ) {
            if ( row != null ) {
                for ( int c = 0; c < widths.length; c++ ) {
                    final String cv = getCellValue(safeGet(row, c, asNull));
                    final int l = cv.length();
                    if ( widths[c] < l ) {
                        widths[c] = l;
                    }
                }
            }
        }
    }

    private static String safeGet(String[] array, int index, String defaultValue) {
        return index < array.length ? array[index] : defaultValue;
    }

    private static String getCellValue(Object value) {
        return value == null ? asNull : value.toString();
    }
/////////// Bean based input for pretty printing ///////////////
    public static <T> void print(List<T> table) {
        if (table == null ) {
            throw new IllegalArgumentException("No tabular data provided");
        }
        if (table.isEmpty()) {
            return;
        }
        final int[] widths = new int[getMaxColumns(table)];
        adjustColumnWidths(table, widths);
        printPreparedTable(table, widths, getHorizontalBorder(widths));
    }

    private static <T> void printPreparedTable(List<T> table, int widths[], String horizontalBorder) {
        final int lineLength = horizontalBorder.length();
        Util.println(horizontalBorder);
        boolean makeCall = false;
        for (final T row : table) {
            if (row != null) {
                Util.println(getRow(row, widths, lineLength, makeCall));
                Util.println(horizontalBorder);
                if (!makeCall) {
                    makeCall = true;
                    // Print again because though 1st row has data we only printed the header.
                    Util.println(getRow(row, widths, lineLength, makeCall));
                    Util.println(horizontalBorder);
                } 
            }
        }
    }

    private static <T> String getRow(T row, int[] widths, int lineLength, boolean makeCall) {
        final StringBuilder builder = new StringBuilder(lineLength).append(VERTICAL_BORDER);
        final int maxWidths = widths.length;
        for (int i = 0; i < maxWidths; i++ ) {
            builder.append(padRight(getCellValue(safeGet(row, i, null, makeCall)), widths[i])).append(VERTICAL_BORDER);
        }
        return builder.toString();
    }

    private static <T> int getMaxColumns(List<T> table) {
        if (table != null && !table.isEmpty()) {
            return Util.getAllGetters(table.get(0).getClass()).size();
        }
        return 0;
    }
    
    private static <T> void adjustColumnWidths(List<T> rows, int[] widths) {
        boolean makeCall = false;
        for (final T row : rows ) {
            if (row != null ) {
                for (int c = 0; c < widths.length; c++ ) {
                    final String cv = getCellValue(safeGet(row, c, asNull, makeCall));
                    final int l = cv.length();
                    if (widths[c] < l ) {
                        widths[c] = l;
                    }
                }
            }
            if (!makeCall) {
                makeCall = true;
            } 
        }
    }

    private static String padRight(String s, int n) {
        return format("%1$-" + n + "s", s);
    }

    private static <T> String safeGet(T bean, int index, String defaultValue, boolean makeCall) {
        List<Method> getters = Util.getAllGetters(bean.getClass());
        if (index < getters.size()) {
            try {
                if (!makeCall) {
                    return getters.get(index).getName().substring(3);
                }
                Object value = getters.get(index).invoke(bean);
                if (value != null) {
                    return value.toString();
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(PrettyPrint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return defaultValue;
    }

}