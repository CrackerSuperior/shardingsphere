/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.shardingsphere.sharding.spring.namespace.tag;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * Key generate algorithm bean definition tag.
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class KeyGenerateAlgorithmBeanDefinitionTag {
    
    public static final String ALGORITHM_TAG = "key-generate-algorithm";
    
    public static final String TYPE_ATTRIBUTE = "type";
    
    public static final String PROPS_TAG = "props";
    
    public static final String STRATEGY_REF_ATTRIBUTE = "key-generate-strategy-ref";
    
    public static final String STRATEGY_TAG = "key-generate-strategy";
    
    public static final String COLUMN_ATTRIBUTE = "column";
    
    public static final String ALGORITHM_REF_TAG = "algorithm-ref";
}
