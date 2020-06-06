// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.resourcemanager.authorization;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.authorization.implementation.GraphRbacManager;
import com.azure.resourcemanager.authorization.models.GroupsInner;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingById;
import com.azure.resourcemanager.resources.fluentcore.arm.collection.SupportsGettingByName;
import com.azure.resourcemanager.resources.fluentcore.arm.models.HasManager;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsCreating;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsDeletingById;
import com.azure.resourcemanager.resources.fluentcore.collection.SupportsListing;
import com.azure.resourcemanager.resources.fluentcore.model.HasInner;

/** Entry point to AD group management API. */
@Fluent
public interface ActiveDirectoryGroups
    extends SupportsListing<ActiveDirectoryGroup>,
        SupportsGettingById<ActiveDirectoryGroup>,
        SupportsGettingByName<ActiveDirectoryGroup>,
        SupportsCreating<ActiveDirectoryGroup.DefinitionStages.Blank>,
        SupportsDeletingById,
        HasManager<GraphRbacManager>,
        HasInner<GroupsInner> {
}