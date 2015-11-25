/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.13.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.compute.models.VirtualMachineSizeListResult;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceException;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in VirtualMachineSizesOperations.
 */
public interface VirtualMachineSizesOperations {
    /**
     * The interface defining all the services for VirtualMachineSizesOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface VirtualMachineSizesService {
        @GET("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/vmSizes")
        Call<ResponseBody> list(@Path("location") String location, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Lists virtual-machine-sizes available in a location for a subscription.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineSizeListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineSizeListResult> list(String location) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Lists virtual-machine-sizes available in a location for a subscription.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(String location, final ServiceCallback<VirtualMachineSizeListResult> serviceCallback);

    /**
     * Lists virtual-machine-sizes available in a location for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws ServiceException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the VirtualMachineSizeListResult object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<VirtualMachineSizeListResult> listNext(String nextPageLink) throws ServiceException, IOException, IllegalArgumentException;

    /**
     * Lists virtual-machine-sizes available in a location for a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<VirtualMachineSizeListResult> serviceCallback);

}
