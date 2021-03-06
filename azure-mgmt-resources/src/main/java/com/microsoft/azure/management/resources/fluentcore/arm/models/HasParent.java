/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.resources.fluentcore.arm.models;

import com.microsoft.azure.management.apigeneration.Fluent;

/**
 * An interface representing a child that has an immediately available parent.
 * @param <ParentT> the parent type
 */
@Fluent
public interface HasParent<ParentT> {
    /**
     * @return the parent of this child object
     */
    ParentT parent();
}
