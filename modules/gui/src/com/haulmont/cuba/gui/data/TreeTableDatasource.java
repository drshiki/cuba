/*
 * Copyright (c) 2008-2016 Haulmont.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.haulmont.cuba.gui.data;

import com.haulmont.cuba.core.entity.Entity;

/**
 * HierarchicalDatasource which supports highlighting some items as captions 
 * @param <T> type of entity
 * @param <K> type of entity ID
 *
 */
public interface TreeTableDatasource <T extends Entity<K>, K>
        extends HierarchicalDatasource<T, K> {

    boolean isCaption(K itemId);

    String getCaption(K itemId);
}