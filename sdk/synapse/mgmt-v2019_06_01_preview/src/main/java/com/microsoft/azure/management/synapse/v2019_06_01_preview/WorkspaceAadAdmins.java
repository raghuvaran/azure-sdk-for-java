/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.synapse.v2019_06_01_preview;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.WorkspaceAadAdminInfoInner;
import com.microsoft.azure.management.synapse.v2019_06_01_preview.implementation.WorkspaceAadAdminsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing WorkspaceAadAdmins.
 */
public interface WorkspaceAadAdmins extends HasInner<WorkspaceAadAdminsInner> {
    /**
     * Gets a workspace active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkspaceAadAdminInfo> getAsync(String resourceGroupName, String workspaceName);

    /**
     * Creates or updates a workspace active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @param aadAdminInfo Workspace active directory administrator properties
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<WorkspaceAadAdminInfo> createOrUpdateAsync(String resourceGroupName, String workspaceName, WorkspaceAadAdminInfoInner aadAdminInfo);

    /**
     * Deletes a workspace active directory admin.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param workspaceName The name of the workspace
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String workspaceName);

}
