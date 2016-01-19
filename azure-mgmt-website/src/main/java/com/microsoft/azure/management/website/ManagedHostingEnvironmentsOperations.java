/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 0.14.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.website;

import com.microsoft.azure.management.website.models.AddressResponse;
import com.microsoft.azure.management.website.models.HostingEnvironment;
import com.microsoft.azure.management.website.models.HostingEnvironmentCollection;
import com.microsoft.azure.management.website.models.ManagedHostingEnvironment;
import com.microsoft.azure.management.website.models.ServerFarmCollection;
import com.microsoft.azure.management.website.models.SiteCollection;
import com.microsoft.rest.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.HTTP;
import retrofit.http.Path;
import retrofit.http.PUT;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in ManagedHostingEnvironmentsOperations.
 */
public interface ManagedHostingEnvironmentsOperations {
    /**
     * The interface defining all the services for ManagedHostingEnvironmentsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ManagedHostingEnvironmentsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/managedHostingEnvironments/{name}")
        Call<ResponseBody> getManagedHostingEnvironment(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/managedHostingEnvironments/{name}")
        Call<ResponseBody> createOrUpdateManagedHostingEnvironment(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body HostingEnvironment managedHostingEnvironmentEnvelope, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/managedHostingEnvironments/{name}", method = "DELETE", hasBody = true)
        Call<ResponseBody> deleteManagedHostingEnvironment(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("forceDelete") Boolean forceDelete, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/managedHostingEnvironments")
        Call<ResponseBody> getManagedHostingEnvironments(@Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/managedHostingEnvironments/{name}/capacities/virtualip")
        Call<ResponseBody> getManagedHostingEnvironmentVips(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/managedHostingEnvironments/{name}/operations/{operationId}")
        Call<ResponseBody> getManagedHostingEnvironmentOperation(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("operationId") String operationId, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/managedHostingEnvironments/{name}/sites")
        Call<ResponseBody> getManagedHostingEnvironmentSites(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("propertiesToInclude") String propertiesToInclude, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/managedHostingEnvironments/{name}/webhostingplans")
        Call<ResponseBody> getManagedHostingEnvironmentWebHostingPlans(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Web/managedHostingEnvironments/{name}/serverfarms")
        Call<ResponseBody> getManagedHostingEnvironmentServerFarms(@Path("resourceGroupName") String resourceGroupName, @Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Get properties of a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ManagedHostingEnvironment object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ManagedHostingEnvironment> getManagedHostingEnvironment(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get properties of a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getManagedHostingEnvironmentAsync(String resourceGroupName, String name, final ServiceCallback<ManagedHostingEnvironment> serviceCallback);

    /**
     * Create or update a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param managedHostingEnvironmentEnvelope Properties of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the HostingEnvironment object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<HostingEnvironment> createOrUpdateManagedHostingEnvironment(String resourceGroupName, String name, HostingEnvironment managedHostingEnvironmentEnvelope) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Create or update a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param managedHostingEnvironmentEnvelope Properties of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> createOrUpdateManagedHostingEnvironmentAsync(String resourceGroupName, String name, HostingEnvironment managedHostingEnvironmentEnvelope, final ServiceCallback<HostingEnvironment> serviceCallback);

    /**
     * Delete a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param forceDelete Delete even if the managed hosting environment contains resources
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Object object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Object> deleteManagedHostingEnvironment(String resourceGroupName, String name, Boolean forceDelete) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * Delete a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param forceDelete Delete even if the managed hosting environment contains resources
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> deleteManagedHostingEnvironmentAsync(String resourceGroupName, String name, Boolean forceDelete, final ServiceCallback<Object> serviceCallback);

    /**
     * Get all managed hosting environments in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the HostingEnvironmentCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<HostingEnvironmentCollection> getManagedHostingEnvironments(String resourceGroupName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all managed hosting environments in a resource group.
     *
     * @param resourceGroupName Name of resource group
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getManagedHostingEnvironmentsAsync(String resourceGroupName, final ServiceCallback<HostingEnvironmentCollection> serviceCallback);

    /**
     * Get list of ip addresses assigned to a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the AddressResponse object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<AddressResponse> getManagedHostingEnvironmentVips(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get list of ip addresses assigned to a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getManagedHostingEnvironmentVipsAsync(String resourceGroupName, String name, final ServiceCallback<AddressResponse> serviceCallback);

    /**
     * Get status of an operation on a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param operationId operation identifier GUID
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Object object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<Object> getManagedHostingEnvironmentOperation(String resourceGroupName, String name, String operationId) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get status of an operation on a managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param operationId operation identifier GUID
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getManagedHostingEnvironmentOperationAsync(String resourceGroupName, String name, String operationId, final ServiceCallback<Object> serviceCallback);

    /**
     * Get all sites on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param propertiesToInclude Comma separated list of site properties to include
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the SiteCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<SiteCollection> getManagedHostingEnvironmentSites(String resourceGroupName, String name, String propertiesToInclude) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all sites on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param propertiesToInclude Comma separated list of site properties to include
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getManagedHostingEnvironmentSitesAsync(String resourceGroupName, String name, String propertiesToInclude, final ServiceCallback<SiteCollection> serviceCallback);

    /**
     * Get all serverfarms (App Service Plans) on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ServerFarmCollection> getManagedHostingEnvironmentWebHostingPlans(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getManagedHostingEnvironmentWebHostingPlansAsync(String resourceGroupName, String name, final ServiceCallback<ServerFarmCollection> serviceCallback);

    /**
     * Get all serverfarms (App Service Plans) on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the ServerFarmCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<ServerFarmCollection> getManagedHostingEnvironmentServerFarms(String resourceGroupName, String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Get all serverfarms (App Service Plans) on the managed hosting environment.
     *
     * @param resourceGroupName Name of resource group
     * @param name Name of managed hosting environment
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getManagedHostingEnvironmentServerFarmsAsync(String resourceGroupName, String name, final ServiceCallback<ServerFarmCollection> serviceCallback);

}
