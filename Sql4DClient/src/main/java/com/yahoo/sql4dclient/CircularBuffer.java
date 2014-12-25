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
package com.yahoo.sql4dclient;

import java.util.Arrays;


/**
 * A general purpose circular buffer whose size is fixed. Any item added will replace
 * the oldest (if any)item. It has utilities using which we can navigate up and down
 * in the list. Each time {@link #add(java.lang.Object)} or {@link #resetNavigator() }
 * is called the navigator is reset which again points to the most recent added 
 * element. There is no way to delete an element except it getting overriden during
 * overflow add. Utilities of this are numerous, for instance if you need to a history
 * tracker, this is very handy.
 * @author srikalyan
 */
public class CircularBuffer<T> {
    
    private int emptyItemIndex = 0;
    private int size = 10;
    boolean wasFullAtleastOnce = false;// This will be set to true when size reaches 10.
    private Object[] items = null;// Because you cannot instantiate generic array.
    
    private int navigator = -1;
    private boolean hasElements = false;
    
    public CircularBuffer(int size) {
        this.size = size;
        items = new Object[size];
    }
    
    /**
     * To exactly get item at index.
     * @param index
     * @return 
     */
    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        if (!wasFullAtleastOnce && index >= emptyItemIndex) {
            return null;
        }
        return (T)(items[index]);
    }

    /**
     * Think of this method conceptually as navigating using down arrow in history 
     * list of commands.
     * @return 
     */
    public T getDown() {
        if (navigator < 0) {// This is true when there are no elements.
            return null;
        }
        if ((wasFullAtleastOnce && navigator == size - 1) || 
                (!wasFullAtleastOnce && navigator == emptyItemIndex - 1)) {
            try {
                return (T)(items[navigator]);
            } finally {
                navigator = 0;
            }
        }
        return (T)(items[navigator++]);
    }
    
    /**
     * Think of this method conceptually as navigating using down up in history 
     * list of commands.
     * @return 
     */
    public T getUp() {
        if (navigator < 0) {
            return null;
        }
        if (navigator == 0) {
            try {
                return (T)(items[navigator]);
            } finally {
                if (wasFullAtleastOnce) {
                    navigator = size - 1;
                } else {
                    navigator = emptyItemIndex - 1;
                }
            }
        }
        return (T)(items[navigator--]);
    }

    /**
     * Navigator should point to most recent added element.
     * @param item 
     */
    public void add(T item) {
        hasElements = true;
        navigator = emptyItemIndex;
        items[emptyItemIndex] = item;
        if (emptyItemIndex == size - 1) {
            wasFullAtleastOnce = true;
        }
        emptyItemIndex = (emptyItemIndex + 1) % size;
    }
    
    /**
     * Call this method if you want to start from the most recently added element.
     */
    public void resetNavigator() {
        if (wasFullAtleastOnce && emptyItemIndex == 0) {
            navigator = size - 1;
            return;
        }
        navigator = emptyItemIndex - 1;
    }
    
    public boolean isEmpty() {
        return !hasElements;
    }

    @Override
    public String toString() {
        StringBuilder buff = new StringBuilder();
        buff.append("Items: ");
        buff.append(Arrays.asList(items));
        
        buff.append("\n");
        
        buff.append("WasFullAtleastOnce: ");
        buff.append(wasFullAtleastOnce);
        
        buff.append("\n");

        buff.append("emptyItemIndex: ");
        buff.append(emptyItemIndex);

        buff.append("\n");

        buff.append("navigator: ");
        buff.append(navigator);
        
        return buff.toString();
    }
    
    
    public static void main(String[] args) {
        CircularBuffer<Integer> cb = new CircularBuffer<>(4);
        cb.add(1);
        cb.add(2);
        cb.add(3);
        cb.add(4);
        System.out.println(cb);
        System.out.println(cb.getUp());
        System.out.println(cb.getUp());
        System.out.println(cb.getUp());
        System.out.println(cb.getUp());
        System.out.println(cb.getUp());
        System.out.println(cb);
        cb.resetNavigator();
        System.out.println(cb);
        System.out.println(cb.getDown());
        System.out.println(cb);
        System.out.println(cb.getDown());
        System.out.println(cb.getDown());
    }
}
