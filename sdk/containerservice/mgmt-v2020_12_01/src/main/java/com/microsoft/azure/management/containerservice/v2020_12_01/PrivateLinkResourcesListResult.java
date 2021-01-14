/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2020_12_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.containerservice.v2020_12_01.implementation.ContainerServiceManager;
import com.microsoft.azure.management.containerservice.v2020_12_01.implementation.PrivateLinkResourcesListResultInner;
import com.microsoft.azure.management.containerservice.v2020_12_01.implementation.PrivateLinkResourceInner;
import java.util.List;

/**
 * Type representing PrivateLinkResourcesListResult.
 */
public interface PrivateLinkResourcesListResult extends HasInner<PrivateLinkResourcesListResultInner>, HasManager<ContainerServiceManager> {
    /**
     * @return the value value.
     */
    List<PrivateLinkResourceInner> value();

}
