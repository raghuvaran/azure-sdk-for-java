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

import com.microsoft.azure.management.website.models.TldLegalAgreementCollection;
import com.microsoft.azure.management.website.models.TopLevelDomain;
import com.microsoft.azure.management.website.models.TopLevelDomainAgreementOption;
import com.microsoft.azure.management.website.models.TopLevelDomainCollection;
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
import retrofit.http.Path;
import retrofit.http.POST;
import retrofit.http.Query;

/**
 * An instance of this class provides access to all the operations defined
 * in TopLevelDomainsOperations.
 */
public interface TopLevelDomainsOperations {
    /**
     * The interface defining all the services for TopLevelDomainsOperations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TopLevelDomainsService {
        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains")
        Call<ResponseBody> getGetTopLevelDomains(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}")
        Call<ResponseBody> getTopLevelDomain(@Path("name") String name, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

        @Headers("Content-Type: application/json; charset=utf-8")
        @POST("subscriptions/{subscriptionId}/providers/Microsoft.DomainRegistration/topLevelDomains/{name}/listAgreements")
        Call<ResponseBody> listTopLevelDomainAgreements(@Path("name") String name, @Path("subscriptionId") String subscriptionId, @Body TopLevelDomainAgreementOption agreementOption, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage);

    }
    /**
     * Lists all top level domains supported for registration.
     *
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the TopLevelDomainCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<TopLevelDomainCollection> getGetTopLevelDomains() throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists all top level domains supported for registration.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getGetTopLevelDomainsAsync(final ServiceCallback<TopLevelDomainCollection> serviceCallback);

    /**
     * Gets details of a top level domain.
     *
     * @param name Name of the top level domain
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the TopLevelDomain object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<TopLevelDomain> getTopLevelDomain(String name) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Gets details of a top level domain.
     *
     * @param name Name of the top level domain
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> getTopLevelDomainAsync(String name, final ServiceCallback<TopLevelDomain> serviceCallback);

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain
     * @param agreementOption Domain agreement options
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the TldLegalAgreementCollection object wrapped in ServiceResponse if successful.
     */
    ServiceResponse<TldLegalAgreementCollection> listTopLevelDomainAgreements(String name, TopLevelDomainAgreementOption agreementOption) throws CloudException, IOException, IllegalArgumentException;

    /**
     * Lists legal agreements that user needs to accept before purchasing domain.
     *
     * @param name Name of the top level domain
     * @param agreementOption Domain agreement options
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link Call} object
     */
    Call<ResponseBody> listTopLevelDomainAgreementsAsync(String name, TopLevelDomainAgreementOption agreementOption, final ServiceCallback<TldLegalAgreementCollection> serviceCallback);

}
