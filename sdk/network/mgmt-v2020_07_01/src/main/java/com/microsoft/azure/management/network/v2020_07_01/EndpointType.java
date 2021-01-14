/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2020_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for EndpointType.
 */
public final class EndpointType extends ExpandableStringEnum<EndpointType> {
    /** Static value AzureVM for EndpointType. */
    public static final EndpointType AZURE_VM = fromString("AzureVM");

    /** Static value AzureVNet for EndpointType. */
    public static final EndpointType AZURE_VNET = fromString("AzureVNet");

    /** Static value AzureSubnet for EndpointType. */
    public static final EndpointType AZURE_SUBNET = fromString("AzureSubnet");

    /** Static value ExternalAddress for EndpointType. */
    public static final EndpointType EXTERNAL_ADDRESS = fromString("ExternalAddress");

    /** Static value MMAWorkspaceMachine for EndpointType. */
    public static final EndpointType MMAWORKSPACE_MACHINE = fromString("MMAWorkspaceMachine");

    /** Static value MMAWorkspaceNetwork for EndpointType. */
    public static final EndpointType MMAWORKSPACE_NETWORK = fromString("MMAWorkspaceNetwork");

    /**
     * Creates or finds a EndpointType from its string representation.
     * @param name a name to look for
     * @return the corresponding EndpointType
     */
    @JsonCreator
    public static EndpointType fromString(String name) {
        return fromString(name, EndpointType.class);
    }

    /**
     * @return known EndpointType values
     */
    public static Collection<EndpointType> values() {
        return values(EndpointType.class);
    }
}
