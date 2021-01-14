/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01.implementation;

import com.microsoft.azure.management.network.v2020_07_01.ProvisioningState;
import java.util.List;
import com.microsoft.azure.SubResource;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * The IpGroups resource information.
 */
@JsonFlatten
@SkipParentValidation
public class IpGroupInner extends Resource {
    /**
     * The provisioning state of the IpGroups resource. Possible values
     * include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * IpAddresses/IpAddressPrefixes in the IpGroups resource.
     */
    @JsonProperty(value = "properties.ipAddresses")
    private List<String> ipAddresses;

    /**
     * List of references to Firewall resources that this IpGroups is
     * associated with.
     */
    @JsonProperty(value = "properties.firewalls", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> firewalls;

    /**
     * List of references to Firewall Policies resources that this IpGroups is
     * associated with.
     */
    @JsonProperty(value = "properties.firewallPolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubResource> firewallPolicies;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the provisioning state of the IpGroups resource. Possible values include: 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get ipAddresses/IpAddressPrefixes in the IpGroups resource.
     *
     * @return the ipAddresses value
     */
    public List<String> ipAddresses() {
        return this.ipAddresses;
    }

    /**
     * Set ipAddresses/IpAddressPrefixes in the IpGroups resource.
     *
     * @param ipAddresses the ipAddresses value to set
     * @return the IpGroupInner object itself.
     */
    public IpGroupInner withIpAddresses(List<String> ipAddresses) {
        this.ipAddresses = ipAddresses;
        return this;
    }

    /**
     * Get list of references to Firewall resources that this IpGroups is associated with.
     *
     * @return the firewalls value
     */
    public List<SubResource> firewalls() {
        return this.firewalls;
    }

    /**
     * Get list of references to Firewall Policies resources that this IpGroups is associated with.
     *
     * @return the firewallPolicies value
     */
    public List<SubResource> firewallPolicies() {
        return this.firewallPolicies;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get resource ID.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set resource ID.
     *
     * @param id the id value to set
     * @return the IpGroupInner object itself.
     */
    public IpGroupInner withId(String id) {
        this.id = id;
        return this;
    }

}
