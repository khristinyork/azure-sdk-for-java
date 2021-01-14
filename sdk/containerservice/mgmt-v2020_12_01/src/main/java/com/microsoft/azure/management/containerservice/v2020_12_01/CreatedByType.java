/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for CreatedByType.
 */
public final class CreatedByType extends ExpandableStringEnum<CreatedByType> {
    /** Static value User for CreatedByType. */
    public static final CreatedByType USER = fromString("User");

    /** Static value Application for CreatedByType. */
    public static final CreatedByType APPLICATION = fromString("Application");

    /** Static value ManagedIdentity for CreatedByType. */
    public static final CreatedByType MANAGED_IDENTITY = fromString("ManagedIdentity");

    /** Static value Key for CreatedByType. */
    public static final CreatedByType KEY = fromString("Key");

    /**
     * Creates or finds a CreatedByType from its string representation.
     * @param name a name to look for
     * @return the corresponding CreatedByType
     */
    @JsonCreator
    public static CreatedByType fromString(String name) {
        return fromString(name, CreatedByType.class);
    }

    /**
     * @return known CreatedByType values
     */
    public static Collection<CreatedByType> values() {
        return values(CreatedByType.class);
    }
}
