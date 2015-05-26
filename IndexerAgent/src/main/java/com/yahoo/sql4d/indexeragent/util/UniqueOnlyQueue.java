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
package com.yahoo.sql4d.indexeragent.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * A Queue that disallows duplicates. Thread safe.
 *
 * @author srikalyan
 * @param <T>
 */
public class UniqueOnlyQueue<T> extends LinkedHashSet<T> {

    private final Lock modifyLock = new ReentrantLock();

    @Override
    public boolean add(T e) {        
        try {
            modifyLock.lock();
            return super.add(e);
        } finally {
            modifyLock.unlock();
        }                
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        try {
            modifyLock.lock();
            return super.addAll(c);
        } finally {
            modifyLock.unlock();
        }        
    }

    @Override
    public boolean remove(Object o) {
        try {
            modifyLock.lock();
            return super.remove(o);
        } finally {
            modifyLock.unlock();
        }
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        try {
            modifyLock.lock();
            return super.removeAll(c);
        } finally {
            modifyLock.unlock();
        }
    }

    /**
     * Special method that removes head element.
     * @return 
     */
    public T removeFirst() {
        try {
            modifyLock.lock();
            Iterator<T> it = iterator();
            if (it.hasNext()) {
                T item = it.next();
                it.remove();
                return item;
            }
        } finally {
            modifyLock.unlock();
        }
        return null;
    }
    
    /**
     * This method zips together all the lists. For ex: 
     * [[x1, x2, x3] [y1, y2] [z1] [d1, d2, d3]] -> [x1, y1, z1, d1, x2, y2, d2, x3, d3]
     * Assuming each list is per datasource and are sorted by id(latest on top) then
     * by zipping we are picking one latest from each data source.
     * @param kLists 
     */
    public void mergeKLists(List<List<T>> kLists) {
        try {
            // Beauty of reentrant locks. The same thread is going to acquire the 
            // same lock again multiple times during add.
            modifyLock.lock();
            clear();
            List<Iterator<T>> kListIters = new ArrayList<>();
            for (List<T> kThList:kLists) {
                kListIters.add(kThList.iterator());
            }
            boolean hasNone = false;
            while (!hasNone) {
                hasNone = true;
                List<Iterator<T>> markedForRemoval = new ArrayList<>();
                for (Iterator<T> kThListIter:kListIters) {
                    if (kThListIter.hasNext()) {
                        hasNone = false;
                        add(kThListIter.next());
                    } else {
                        markedForRemoval.add(kThListIter);
                    }
                }
                kListIters.removeAll(markedForRemoval);
            }
        } finally {
            modifyLock.unlock();
        }
    }
    
}
