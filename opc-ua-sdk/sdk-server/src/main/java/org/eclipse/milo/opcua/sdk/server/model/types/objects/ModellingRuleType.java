/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.sdk.server.model.types.objects;

import org.eclipse.milo.opcua.sdk.core.model.BasicProperty;
import org.eclipse.milo.opcua.sdk.core.model.Property;
import org.eclipse.milo.opcua.sdk.server.model.types.variables.PropertyType;
import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;
import org.eclipse.milo.opcua.stack.core.types.builtin.QualifiedName;
import org.eclipse.milo.opcua.stack.core.types.enumerated.NamingRuleType;

public interface ModellingRuleType extends BaseObjectType {

    Property<NamingRuleType> NAMING_RULE = new BasicProperty<>(
        QualifiedName.parse("0:NamingRule"),
        NodeId.parse("ns=0;i=120"),
        -1,
        NamingRuleType.class
    );

    NamingRuleType getNamingRule();

    PropertyType getNamingRuleNode();

    void setNamingRule(NamingRuleType value);
}
