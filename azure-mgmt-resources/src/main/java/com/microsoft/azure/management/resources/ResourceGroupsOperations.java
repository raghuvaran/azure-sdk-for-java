/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.resources.models.GenericResource;
import com.microsoft.azure.management.resources.models.GenericResourceFilter;
import com.microsoft.azure.management.resources.models.PageImpl;
import com.microsoft.azure.management.resources.models.ResourceGroup;
import com.microsoft.azure.management.resources.models.ResourceGroupFilter;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.HEAD;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.PATCH;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;
import retrofit.http.Url;

/**
 * An instance of this class provides access to all the operations defined
 * in ResourceGroupsOperations.
 */
public interface ResourceGroupsOperations {
    /**
     * The interface defining all the services for ResourceGroupsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ResourceGroupsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/resources")
        Call<ResponseBody> listResources(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HEAD("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        Call<Void> checkExistence(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        Call<ResponseBody> createOrUpdate(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Body ResourceGroup parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}", method = "DELETE", hasBody = true)
        Call<ResponseBody> delete(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        Call<ResponseBody> get(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PATCH("subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}")
        Call<ResponseBody> patch(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Body ResourceGroup parameters, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourcegroups")
        Call<ResponseBody> list(@Path("subscriptionId") String subscriptionId, @Query("$filter") String filter, @Query("$top") Integer top, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listResourcesNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET
        Call<ResponseBody> listNext(@Url String nextPageLink, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Get all of the resources under a subscription.
     *
     * @param resourceGroupName Query parameters. If null is passed returns all resource groups.
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;GenericResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<GenericResource>> listResources(String resourceGroupName, GenericResourceFilter filter, Integer top) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all of the resources under a subscription.
     *
     * @param resourceGroupName Query parameters. If null is passed returns all resource groups.
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listResourcesAsync(String resourceGroupName, GenericResourceFilter filter, Integer top, final ServiceCallback<PageImpl<GenericResource>> serviceCallback);

    /**
     * Checks whether resource group exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Boolean object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Boolean> checkExistence(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Checks whether resource group exists.
     *
     * @param resourceGroupName The name of the resource group to check. The name is case insensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<Void> checkExistenceAsync(String resourceGroupName, final ServiceCallback<Boolean> serviceCallback);

    /**
     * Create a resource group.
     *
     * @param resourceGroupName The name of the resource group to be created or updated.
     * @param parameters Parameters supplied to the create or update resource group service operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceGroup object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ResourceGroup> createOrUpdate(String resourceGroupName, ResourceGroup parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Create a resource group.
     *
     * @param resourceGroupName The name of the resource group to be created or updated.
     * @param parameters Parameters supplied to the create or update resource group service operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateAsync(String resourceGroupName, ResourceGroup parameters, final ServiceCallback<ResourceGroup> serviceCallback);

    /**
     * Begin deleting resource group.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param resourceGroupName The name of the resource group to be deleted. The name is case insensitive.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the ServiceResponse object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Begin deleting resource group.To determine whether the operation has finished processing the request, call GetLongRunningOperationStatus.
     *
     * @param resourceGroupName The name of the resource group to be deleted. The name is case insensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteAsync(String resourceGroupName, final ServiceCallback<Void> serviceCallback);

    /**
     * Get a resource group.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceGroup object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ResourceGroup> get(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get a resource group.
     *
     * @param resourceGroupName The name of the resource group to get. The name is case insensitive.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getAsync(String resourceGroupName, final ServiceCallback<ResourceGroup> serviceCallback);

    /**
     * Resource groups can be updated through a simple PATCH operation to a group address. The format of the request is the same as that for creating a resource groups, though if a field is unspecified current value will be carried over.
     *
     * @param resourceGroupName The name of the resource group to be created or updated. The name is case insensitive.
     * @param parameters Parameters supplied to the update state resource group service operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ResourceGroup object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ResourceGroup> patch(String resourceGroupName, ResourceGroup parameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Resource groups can be updated through a simple PATCH operation to a group address. The format of the request is the same as that for creating a resource groups, though if a field is unspecified current value will be carried over.
     *
     * @param resourceGroupName The name of the resource group to be created or updated. The name is case insensitive.
     * @param parameters Parameters supplied to the update state resource group service operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> patchAsync(String resourceGroupName, ResourceGroup parameters, final ServiceCallback<ResourceGroup> serviceCallback);

    /**
     * Gets a collection of resource groups.
     *
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ResourceGroup&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ResourceGroup>> list(ResourceGroupFilter filter, Integer top) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a collection of resource groups.
     *
     * @param filter The filter to apply on the operation.
     * @param top Query parameters. If null is passed returns all resource groups.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listAsync(ResourceGroupFilter filter, Integer top, final ServiceCallback<PageImpl<ResourceGroup>> serviceCallback);

    /**
     * Get all of the resources under a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;GenericResource&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<GenericResource>> listResourcesNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all of the resources under a subscription.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listResourcesNextAsync(String nextPageLink, final ServiceCallback<PageImpl<GenericResource>> serviceCallback);

    /**
     * Gets a collection of resource groups.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the PageImpl&lt;ResourceGroup&gt; object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<PageImpl<ResourceGroup>> listNext(String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets a collection of resource groups.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listNextAsync(String nextPageLink, final ServiceCallback<PageImpl<ResourceGroup>> serviceCallback);

}
