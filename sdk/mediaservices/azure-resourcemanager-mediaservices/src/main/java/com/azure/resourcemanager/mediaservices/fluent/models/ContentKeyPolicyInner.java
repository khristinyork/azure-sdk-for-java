// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.management.ProxyResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mediaservices.models.ContentKeyPolicyOption;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

/** A Content Key Policy resource. */
@JsonFlatten
@Fluent
public class ContentKeyPolicyInner extends ProxyResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ContentKeyPolicyInner.class);

    /*
     * The legacy Policy ID.
     */
    @JsonProperty(value = "properties.policyId", access = JsonProperty.Access.WRITE_ONLY)
    private UUID policyId;

    /*
     * The creation date of the Policy
     */
    @JsonProperty(value = "properties.created", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime created;

    /*
     * The last modified date of the Policy
     */
    @JsonProperty(value = "properties.lastModified", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastModified;

    /*
     * A description for the Policy.
     */
    @JsonProperty(value = "properties.description")
    private String description;

    /*
     * The Key Policy options.
     */
    @JsonProperty(value = "properties.options")
    private List<ContentKeyPolicyOption> options;

    /**
     * Get the policyId property: The legacy Policy ID.
     *
     * @return the policyId value.
     */
    public UUID policyId() {
        return this.policyId;
    }

    /**
     * Get the created property: The creation date of the Policy.
     *
     * @return the created value.
     */
    public OffsetDateTime created() {
        return this.created;
    }

    /**
     * Get the lastModified property: The last modified date of the Policy.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        return this.lastModified;
    }

    /**
     * Get the description property: A description for the Policy.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: A description for the Policy.
     *
     * @param description the description value to set.
     * @return the ContentKeyPolicyInner object itself.
     */
    public ContentKeyPolicyInner withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the options property: The Key Policy options.
     *
     * @return the options value.
     */
    public List<ContentKeyPolicyOption> options() {
        return this.options;
    }

    /**
     * Set the options property: The Key Policy options.
     *
     * @param options the options value to set.
     * @return the ContentKeyPolicyInner object itself.
     */
    public ContentKeyPolicyInner withOptions(List<ContentKeyPolicyOption> options) {
        this.options = options;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (options() != null) {
            options().forEach(e -> e.validate());
        }
    }
}
