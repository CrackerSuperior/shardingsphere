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

package org.apache.shardingsphere.mask.metadata.nodepath;

import org.apache.shardingsphere.infra.metadata.nodepath.RuleNodePath;
import org.apache.shardingsphere.mode.spi.RuleNodePathProvider;

import java.util.Arrays;
import java.util.Collections;

/**
 * Mask rule node path provider.
 */
public final class MaskRuleNodePathProvider implements RuleNodePathProvider {
    
    public static final String RULE_TYPE = "mask";
    
    public static final String TABLES = "tables";
    
    public static final String ALGORITHMS = "algorithms";
    
    private static final RuleNodePath INSTANCE = new RuleNodePath(RULE_TYPE, Arrays.asList(TABLES, ALGORITHMS), Collections.emptyList());
    
    @Override
    public RuleNodePath getRuleNodePath() {
        return INSTANCE;
    }
}
