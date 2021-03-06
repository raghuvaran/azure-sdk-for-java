/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.netapp.v2019_07_01;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.netapp.v2019_07_01.implementation.VolumesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Volumes.
 */
public interface Volumes extends SupportsCreating<Volume.DefinitionStages.Blank>, HasInner<VolumesInner> {
    /**
     * Describe a volume.
     * Get the details of the specified volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Volume> getAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Describe all volumes.
     * List all volumes within the capacity pool.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Volume> listAsync(String resourceGroupName, String accountName, String poolName);

    /**
     * Delete a volume.
     * Delete the specified volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account
     * @param poolName The name of the capacity pool
     * @param volumeName The name of the volume
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String accountName, String poolName, String volumeName);

}
