/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.collections.set;

import java.util.Set;

import org.apache.commons.collections.map.HashedMap;

/**
 * JUnit test.
 *
 * @since Commons Collections 3.1
 * @version $Revision$ $Date$
 *
 * @author Stephen Colebourne
 */
public class TestMapBackedSet<E> extends AbstractTestSet<E> {

    public TestMapBackedSet(String testName) {
        super(testName);
    }

    @Override
    public Set<E> makeObject() {
        return MapBackedSet.decorate(new HashedMap<E, Object>());
    }

    @Override
    public String getCompatibilityVersion() {
        return "3.1";
    }

//    public void testCreate() throws Exception {
//        resetEmpty();
//        writeExternalFormToDisk((java.io.Serializable) collection, "D:/dev/collections/data/test/MapBackedSet.emptyCollection.version3.1.obj");
//        resetFull();
//        writeExternalFormToDisk((java.io.Serializable) collection, "D:/dev/collections/data/test/MapBackedSet.fullCollection.version3.1.obj");
//    }

}
