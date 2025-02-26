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

package org.apache.shardingsphere.infra.binder.segment.select.projection;

import org.apache.shardingsphere.sql.parser.sql.common.value.identifier.IdentifierValue;

import java.util.Optional;

/**
 * Projection interface.
 */
public interface Projection {
    
    /**
     * Get expression.
     * 
     * @return expression
     */
    String getExpression();
    
    /**
     * Get alias.
     * 
     * @return alias
     */
    Optional<String> getAlias();
    
    /**
     * Get columnLabel.
     *
     * @return columnLabel
     */
    String getColumnLabel();
    
    /**
     * Transform subquery projection.
     * 
     * @param subqueryTableAlias subquery table alias
     * @param originalOwner original owner
     * @param originalName original name
     * @return new projection
     */
    Projection transformSubqueryProjection(IdentifierValue subqueryTableAlias, IdentifierValue originalOwner, IdentifierValue originalName);
}
