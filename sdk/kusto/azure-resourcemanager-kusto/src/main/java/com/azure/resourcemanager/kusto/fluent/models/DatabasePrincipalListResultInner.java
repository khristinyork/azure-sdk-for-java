// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The list Kusto database principals operation response. */
@Fluent
public final class DatabasePrincipalListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabasePrincipalListResultInner.class);

    /*
     * The list of Kusto database principals.
     */
    @JsonProperty(value = "value")
    private List<DatabasePrincipalInner> value;

    /**
     * Get the value property: The list of Kusto database principals.
     *
     * @return the value value.
     */
    public List<DatabasePrincipalInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of Kusto database principals.
     *
     * @param value the value value to set.
     * @return the DatabasePrincipalListResultInner object itself.
     */
    public DatabasePrincipalListResultInner withValue(List<DatabasePrincipalInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
