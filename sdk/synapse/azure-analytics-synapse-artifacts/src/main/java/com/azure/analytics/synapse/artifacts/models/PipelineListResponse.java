// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A list of pipeline resources. */
@Fluent
public final class PipelineListResponse {
    /*
     * List of pipelines.
     */
    @JsonProperty(value = "value", required = true)
    private List<PipelineResource> value;

    /*
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: List of pipelines.
     *
     * @return the value value.
     */
    public List<PipelineResource> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of pipelines.
     *
     * @param value the value value to set.
     * @return the PipelineListResponse object itself.
     */
    public PipelineListResponse setValue(List<PipelineResource> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value.
     */
    public String getNextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of results, if any remaining results exist.
     *
     * @param nextLink the nextLink value to set.
     * @return the PipelineListResponse object itself.
     */
    public PipelineListResponse setNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }
}
