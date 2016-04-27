/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network;

import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.network.models.PageImpl;
import com.microsoft.azure.management.network.models.Subnet;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCall;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;

/**
 * An instance of this class provides access to all the operations defined
 * in SubnetsOperations.
 */
public interface SubnetsOperations {
    /**
     * The delete subnet operation deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> delete(String resourceGroupName, String virtualNetworkName, String subnetName) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The delete subnet operation deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall deleteAsync(String resourceGroupName, String virtualNetworkName, String subnetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The delete subnet operation deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the {@link ServiceResponse} object if successful.
     */
    ServiceResponse<Void> beginDelete(String resourceGroupName, String virtualNetworkName, String subnetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The delete subnet operation deletes the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginDeleteAsync(String resourceGroupName, String virtualNetworkName, String subnetName, final ServiceCallback<Void> serviceCallback) throws IllegalArgumentException;

    /**
     * The Get subnet operation retreives information about the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Subnet object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Subnet> get(String resourceGroupName, String virtualNetworkName, String subnetName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get subnet operation retreives information about the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String virtualNetworkName, String subnetName, final ServiceCallback<Subnet> serviceCallback) throws IllegalArgumentException;
    /**
     * The Get subnet operation retreives information about the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand expand references resources.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Subnet object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Subnet> get(String resourceGroupName, String virtualNetworkName, String subnetName, String expand) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Get subnet operation retreives information about the specified subnet.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param expand expand references resources.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall getAsync(String resourceGroupName, String virtualNetworkName, String subnetName, String expand, final ServiceCallback<Subnet> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put Subnet operation creates/updates a subnet in thespecified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create/update Subnet operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @throws InterruptedException exception thrown when long running operation is interrupted
     * @return the Subnet object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Subnet> createOrUpdate(String resourceGroupName, String virtualNetworkName, String subnetName, Subnet subnetParameters) throws CloudException, IOException, IllegalArgumentException, InterruptedException;

    /**
     * The Put Subnet operation creates/updates a subnet in thespecified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create/update Subnet operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall createOrUpdateAsync(String resourceGroupName, String virtualNetworkName, String subnetName, Subnet subnetParameters, final ServiceCallback<Subnet> serviceCallback) throws IllegalArgumentException;

    /**
     * The Put Subnet operation creates/updates a subnet in thespecified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create/update Subnet operation
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the Subnet object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<Subnet> beginCreateOrUpdate(String resourceGroupName, String virtualNetworkName, String subnetName, Subnet subnetParameters) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The Put Subnet operation creates/updates a subnet in thespecified virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param subnetName The name of the subnet.
     * @param subnetParameters Parameters supplied to the create/update Subnet operation
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall beginCreateOrUpdateAsync(String resourceGroupName, String virtualNetworkName, String subnetName, Subnet subnetParameters, final ServiceCallback<Subnet> serviceCallback) throws IllegalArgumentException;

    /**
     * The List subnets opertion retrieves all the subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Subnet&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PagedList<Subnet>> list(final String resourceGroupName, final String virtualNetworkName) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List subnets opertion retrieves all the subnets in a virtual network.
     *
     * @param resourceGroupName The name of the resource group.
     * @param virtualNetworkName The name of the virtual network.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listAsync(final String resourceGroupName, final String virtualNetworkName, final ListOperationCallback<Subnet> serviceCallback) throws IllegalArgumentException;

    /**
     * The List subnets opertion retrieves all the subnets in a virtual network.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws CloudException exception thrown from REST call
     * @throws IOException exception thrown from serialization/deserialization
     * @throws IllegalArgumentException exception thrown from invalid parameters
     * @return the List&lt;Subnet&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    ServiceResponse<PageImpl<Subnet>> listNext(final String nextPageLink) throws CloudException, IOException, IllegalArgumentException;

    /**
     * The List subnets opertion retrieves all the subnets in a virtual network.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceCall the ServiceCall object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if callback is null
     * @return the {@link ServiceCall} object
     */
    ServiceCall listNextAsync(final String nextPageLink, final ServiceCall serviceCall, final ListOperationCallback<Subnet> serviceCallback) throws IllegalArgumentException;

}