/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Network Virtual Appliance NIC properties.
 */
public class VirtualApplianceNicProperties {
    /**
     * NIC name.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Public IP address.
     */
    @JsonProperty(value = "publicIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String publicIpAddress;

    /**
     * Private IP address.
     */
    @JsonProperty(value = "privateIpAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String privateIpAddress;

    /**
     * Get nIC name.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get public IP address.
     *
     * @return the publicIpAddress value
     */
    public String publicIpAddress() {
        return this.publicIpAddress;
    }

    /**
     * Get private IP address.
     *
     * @return the privateIpAddress value
     */
    public String privateIpAddress() {
        return this.privateIpAddress;
    }

}
