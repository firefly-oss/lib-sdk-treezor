package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.DeleteWalletRequest;
import java.time.OffsetDateTime;
import com.sdk.treezor.model.PostWalletsRequest;
import com.sdk.treezor.model.PutWalletRequest;
import com.sdk.treezor.model.WalletObject;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import java.util.UUID;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-14T09:49:28.273669400+02:00[Europe/Paris]", comments = "Generator version: 7.12.0")
public class WalletsApi {
    private ApiClient apiClient;

    public WalletsApi() {
        this(new ApiClient());
    }

    @Autowired
    public WalletsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Delete Wallet
     * Change the status of the Wallet to &#x60;CANCELED&#x60;. This action is irreversible.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param deleteWalletRequest The deleteWalletRequest parameter
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteWalletRequestCreation(Integer walletId, DeleteWalletRequest deleteWalletRequest) throws WebClientResponseException {
        Object postBody = deleteWalletRequest;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling deleteWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("walletId", walletId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return apiClient.invokeAPI("/v1/wallets/{walletId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Wallet
     * Change the status of the Wallet to &#x60;CANCELED&#x60;. This action is irreversible.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param deleteWalletRequest The deleteWalletRequest parameter
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WalletObject> deleteWallet(Integer walletId, DeleteWalletRequest deleteWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return deleteWalletRequestCreation(walletId, deleteWalletRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Wallet
     * Change the status of the Wallet to &#x60;CANCELED&#x60;. This action is irreversible.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param deleteWalletRequest The deleteWalletRequest parameter
     * @return ResponseEntity&lt;WalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WalletObject>> deleteWalletWithHttpInfo(Integer walletId, DeleteWalletRequest deleteWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return deleteWalletRequestCreation(walletId, deleteWalletRequest).toEntity(localVarReturnType);
    }

    /**
     * Delete Wallet
     * Change the status of the Wallet to &#x60;CANCELED&#x60;. This action is irreversible.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param deleteWalletRequest The deleteWalletRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteWalletWithResponseSpec(Integer walletId, DeleteWalletRequest deleteWalletRequest) throws WebClientResponseException {
        return deleteWalletRequestCreation(walletId, deleteWalletRequest);
    }

    /**
     * Get Wallet
     * Retrieve a Wallet based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getWalletRequestCreation(UUID walletId, String accessTag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling getWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("walletId", walletId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return apiClient.invokeAPI("/v1/wallets/{walletId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Wallet
     * Retrieve a Wallet based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WalletObject> getWallet(UUID walletId, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return getWalletRequestCreation(walletId, accessTag).bodyToMono(localVarReturnType);
    }

    /**
     * Get Wallet
     * Retrieve a Wallet based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseEntity&lt;WalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WalletObject>> getWalletWithHttpInfo(UUID walletId, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return getWalletRequestCreation(walletId, accessTag).toEntity(localVarReturnType);
    }

    /**
     * Get Wallet
     * Retrieve a Wallet based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWalletWithResponseSpec(UUID walletId, String accessTag) throws WebClientResponseException {
        return getWalletRequestCreation(walletId, accessTag);
    }

    /**
     * Search Wallets
     * Retrieve Wallets that match your search conditions. The request must specify at least one of those fields: &#x60;walletId&#x60;, &#x60;userId&#x60;, or &#x60;walletTypeId&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param walletId The unique identifier of the Wallet.
     * @param walletStatus The status of the Wallet, which can be one of the following: * &#x60;CANCELED&#x60; – The Wallet is deactivated. * &#x60;PENDING&#x60; – The Wallet has just been created. * &#x60;VALIDATED&#x60; – The Wallet is active. 
     * @param userId The unique identifier of the User owning the Wallet.
     * @param parentUserId The unique identifier of the Parent User of the Wallet owner.
     * @param walletTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param walletTypeId The type of Wallet. The following values are allowed: * &#x60;9&#x60; – Electronic Money Wallet * &#x60;10&#x60; – Payment Account Wallet  Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
     * @param walletTypeIdList The list of &#x60;walletTypeId&#x60; to take into account.   Must be associated with the &#x60;userId&#x60; query parameter and is ignored if the &#x60;walletTypeId&#x60; parameter is provided.  Learn more about wallet types in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
     * @param tariffId The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getWalletsRequestCreation(String accessTag, Integer walletId, String walletStatus, Integer userId, Integer parentUserId, String walletTag, Integer walletTypeId, List<Integer> walletTypeIdList, Integer tariffId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletId", walletId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletStatus", walletStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentUserId", parentUserId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletTag", walletTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "walletTypeId", walletTypeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "walletTypeIdList", walletTypeIdList));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tariffId", tariffId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateFrom", createdDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateTo", createdDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateFrom", updatedDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateTo", updatedDateTo));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return apiClient.invokeAPI("/v1/wallets", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Wallets
     * Retrieve Wallets that match your search conditions. The request must specify at least one of those fields: &#x60;walletId&#x60;, &#x60;userId&#x60;, or &#x60;walletTypeId&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param walletId The unique identifier of the Wallet.
     * @param walletStatus The status of the Wallet, which can be one of the following: * &#x60;CANCELED&#x60; – The Wallet is deactivated. * &#x60;PENDING&#x60; – The Wallet has just been created. * &#x60;VALIDATED&#x60; – The Wallet is active. 
     * @param userId The unique identifier of the User owning the Wallet.
     * @param parentUserId The unique identifier of the Parent User of the Wallet owner.
     * @param walletTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param walletTypeId The type of Wallet. The following values are allowed: * &#x60;9&#x60; – Electronic Money Wallet * &#x60;10&#x60; – Payment Account Wallet  Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
     * @param walletTypeIdList The list of &#x60;walletTypeId&#x60; to take into account.   Must be associated with the &#x60;userId&#x60; query parameter and is ignored if the &#x60;walletTypeId&#x60; parameter is provided.  Learn more about wallet types in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
     * @param tariffId The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WalletObject> getWallets(String accessTag, Integer walletId, String walletStatus, Integer userId, Integer parentUserId, String walletTag, Integer walletTypeId, List<Integer> walletTypeIdList, Integer tariffId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return getWalletsRequestCreation(accessTag, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, walletTypeIdList, tariffId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Search Wallets
     * Retrieve Wallets that match your search conditions. The request must specify at least one of those fields: &#x60;walletId&#x60;, &#x60;userId&#x60;, or &#x60;walletTypeId&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param walletId The unique identifier of the Wallet.
     * @param walletStatus The status of the Wallet, which can be one of the following: * &#x60;CANCELED&#x60; – The Wallet is deactivated. * &#x60;PENDING&#x60; – The Wallet has just been created. * &#x60;VALIDATED&#x60; – The Wallet is active. 
     * @param userId The unique identifier of the User owning the Wallet.
     * @param parentUserId The unique identifier of the Parent User of the Wallet owner.
     * @param walletTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param walletTypeId The type of Wallet. The following values are allowed: * &#x60;9&#x60; – Electronic Money Wallet * &#x60;10&#x60; – Payment Account Wallet  Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
     * @param walletTypeIdList The list of &#x60;walletTypeId&#x60; to take into account.   Must be associated with the &#x60;userId&#x60; query parameter and is ignored if the &#x60;walletTypeId&#x60; parameter is provided.  Learn more about wallet types in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
     * @param tariffId The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @return ResponseEntity&lt;WalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WalletObject>> getWalletsWithHttpInfo(String accessTag, Integer walletId, String walletStatus, Integer userId, Integer parentUserId, String walletTag, Integer walletTypeId, List<Integer> walletTypeIdList, Integer tariffId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return getWalletsRequestCreation(accessTag, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, walletTypeIdList, tariffId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).toEntity(localVarReturnType);
    }

    /**
     * Search Wallets
     * Retrieve Wallets that match your search conditions. The request must specify at least one of those fields: &#x60;walletId&#x60;, &#x60;userId&#x60;, or &#x60;walletTypeId&#x60;. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param walletId The unique identifier of the Wallet.
     * @param walletStatus The status of the Wallet, which can be one of the following: * &#x60;CANCELED&#x60; – The Wallet is deactivated. * &#x60;PENDING&#x60; – The Wallet has just been created. * &#x60;VALIDATED&#x60; – The Wallet is active. 
     * @param userId The unique identifier of the User owning the Wallet.
     * @param parentUserId The unique identifier of the Parent User of the Wallet owner.
     * @param walletTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param walletTypeId The type of Wallet. The following values are allowed: * &#x60;9&#x60; – Electronic Money Wallet * &#x60;10&#x60; – Payment Account Wallet  Other types are available but can only be set by Treezor. Learn more in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
     * @param walletTypeIdList The list of &#x60;walletTypeId&#x60; to take into account.   Must be associated with the &#x60;userId&#x60; query parameter and is ignored if the &#x60;walletTypeId&#x60; parameter is provided.  Learn more about wallet types in the [Wallet Types](/guide/wallets/introduction.html#types-of-wallets) documentation. 
     * @param tariffId The fees applied to the Wallet, as defined by your contract with Treezor. Usually required, but may have a default value set by Treezor.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getWalletsWithResponseSpec(String accessTag, Integer walletId, String walletStatus, Integer userId, Integer parentUserId, String walletTag, Integer walletTypeId, List<Integer> walletTypeIdList, Integer tariffId, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        return getWalletsRequestCreation(accessTag, walletId, walletStatus, userId, parentUserId, walletTag, walletTypeId, walletTypeIdList, tariffId, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    }

    /**
     * Create Wallet
     * Create a new Wallet. This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postWalletsRequest The postWalletsRequest parameter
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postWalletsRequestCreation(PostWalletsRequest postWalletsRequest) throws WebClientResponseException {
        Object postBody = postWalletsRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return apiClient.invokeAPI("/v1/wallets", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Wallet
     * Create a new Wallet. This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postWalletsRequest The postWalletsRequest parameter
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WalletObject> postWallets(PostWalletsRequest postWalletsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return postWalletsRequestCreation(postWalletsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Wallet
     * Create a new Wallet. This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postWalletsRequest The postWalletsRequest parameter
     * @return ResponseEntity&lt;WalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WalletObject>> postWalletsWithHttpInfo(PostWalletsRequest postWalletsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return postWalletsRequestCreation(postWalletsRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Wallet
     * Create a new Wallet. This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postWalletsRequest The postWalletsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postWalletsWithResponseSpec(PostWalletsRequest postWalletsRequest) throws WebClientResponseException {
        return postWalletsRequestCreation(postWalletsRequest);
    }

    /**
     * Update Wallet
     * Modifiy a Wallet information
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param putWalletRequest The putWalletRequest parameter
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putWalletRequestCreation(UUID walletId, PutWalletRequest putWalletRequest) throws WebClientResponseException {
        Object postBody = putWalletRequest;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling putWallet", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("walletId", walletId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return apiClient.invokeAPI("/v1/wallets/{walletId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Wallet
     * Modifiy a Wallet information
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param putWalletRequest The putWalletRequest parameter
     * @return WalletObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<WalletObject> putWallet(UUID walletId, PutWalletRequest putWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return putWalletRequestCreation(walletId, putWalletRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Wallet
     * Modifiy a Wallet information
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param putWalletRequest The putWalletRequest parameter
     * @return ResponseEntity&lt;WalletObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<WalletObject>> putWalletWithHttpInfo(UUID walletId, PutWalletRequest putWalletRequest) throws WebClientResponseException {
        ParameterizedTypeReference<WalletObject> localVarReturnType = new ParameterizedTypeReference<WalletObject>() {};
        return putWalletRequestCreation(walletId, putWalletRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Wallet
     * Modifiy a Wallet information
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @param putWalletRequest The putWalletRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putWalletWithResponseSpec(UUID walletId, PutWalletRequest putWalletRequest) throws WebClientResponseException {
        return putWalletRequestCreation(walletId, putWalletRequest);
    }
}
