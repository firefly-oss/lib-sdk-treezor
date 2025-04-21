package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.ImportMdcMidListCodesRequest;
import com.sdk.treezor.model.MerchantIdList;
import com.sdk.treezor.model.MerchantIdLists;
import com.sdk.treezor.model.PostMdcMidListRequest;
import java.util.UUID;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-14T09:49:28.273669400+02:00[Europe/Paris]", comments = "Generator version: 7.12.0")
public class MidListsMdcApi {
    private ApiClient apiClient;

    public MidListsMdcApi() {
        this(new ApiClient());
    }

    @Autowired
    public MidListsMdcApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Add MID to MID List
     * Add the MID in the Merchant Id list.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MerchantId added to list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addMdcMidListCodeRequestCreation(UUID id, String mid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling addMdcMidListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mid' is set
        if (mid == null) {
            throw new WebClientResponseException("Missing the required parameter 'mid' when calling addMdcMidListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("mid", mid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/mdc/midLists/{id}/merchantIds/{mid}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add MID to MID List
     * Add the MID in the Merchant Id list.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MerchantId added to list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> addMdcMidListCode(UUID id, String mid) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return addMdcMidListCodeRequestCreation(id, mid).bodyToMono(localVarReturnType);
    }

    /**
     * Add MID to MID List
     * Add the MID in the Merchant Id list.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MerchantId added to list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> addMdcMidListCodeWithHttpInfo(UUID id, String mid) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return addMdcMidListCodeRequestCreation(id, mid).toEntity(localVarReturnType);
    }

    /**
     * Add MID to MID List
     * Add the MID in the Merchant Id list.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MerchantId added to list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addMdcMidListCodeWithResponseSpec(UUID id, String mid) throws WebClientResponseException {
        return addMdcMidListCodeRequestCreation(id, mid);
    }

    /**
     * Check MID Presence
     * Check in the MCC is included in the MCC List.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - The MerchantId is in the list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec checkMdcMidListCodeRequestCreation(UUID id, String mid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling checkMdcMidListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mid' is set
        if (mid == null) {
            throw new WebClientResponseException("Missing the required parameter 'mid' when calling checkMdcMidListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("mid", mid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/mdc/midLists/{id}/merchantIds/{mid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check MID Presence
     * Check in the MCC is included in the MCC List.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - The MerchantId is in the list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> checkMdcMidListCode(UUID id, String mid) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return checkMdcMidListCodeRequestCreation(id, mid).bodyToMono(localVarReturnType);
    }

    /**
     * Check MID Presence
     * Check in the MCC is included in the MCC List.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - The MerchantId is in the list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> checkMdcMidListCodeWithHttpInfo(UUID id, String mid) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return checkMdcMidListCodeRequestCreation(id, mid).toEntity(localVarReturnType);
    }

    /**
     * Check MID Presence
     * Check in the MCC is included in the MCC List.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - The MerchantId is in the list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec checkMdcMidListCodeWithResponseSpec(UUID id, String mid) throws WebClientResponseException {
        return checkMdcMidListCodeRequestCreation(id, mid);
    }

    /**
     * Delete MerchantId List
     * Delete a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - List successfully removed
     * @param id The unique identifier of the MID List.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteMdcMidListRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteMdcMidList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/mdc/midLists/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete MerchantId List
     * Delete a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - List successfully removed
     * @param id The unique identifier of the MID List.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteMdcMidList(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteMdcMidListRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete MerchantId List
     * Delete a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - List successfully removed
     * @param id The unique identifier of the MID List.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> deleteMdcMidListWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteMdcMidListRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete MerchantId List
     * Delete a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - List successfully removed
     * @param id The unique identifier of the MID List.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteMdcMidListWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteMdcMidListRequestCreation(id);
    }

    /**
     * Get all MID Lists
     * Retrieve all the Merchant Id Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>200</b> - Success
     * @param nextPageToken The pagination cursor to use as a query parameter to get to the next page of results.
     * @return MerchantIdLists
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMdcMidListsRequestCreation(String nextPageToken) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nextPageToken", nextPageToken));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<MerchantIdLists> localVarReturnType = new ParameterizedTypeReference<MerchantIdLists>() {};
        return apiClient.invokeAPI("/v1/mdc/midLists", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all MID Lists
     * Retrieve all the Merchant Id Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>200</b> - Success
     * @param nextPageToken The pagination cursor to use as a query parameter to get to the next page of results.
     * @return MerchantIdLists
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdLists> getMdcMidLists(String nextPageToken) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdLists> localVarReturnType = new ParameterizedTypeReference<MerchantIdLists>() {};
        return getMdcMidListsRequestCreation(nextPageToken).bodyToMono(localVarReturnType);
    }

    /**
     * Get all MID Lists
     * Retrieve all the Merchant Id Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>200</b> - Success
     * @param nextPageToken The pagination cursor to use as a query parameter to get to the next page of results.
     * @return ResponseEntity&lt;MerchantIdLists&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdLists>> getMdcMidListsWithHttpInfo(String nextPageToken) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdLists> localVarReturnType = new ParameterizedTypeReference<MerchantIdLists>() {};
        return getMdcMidListsRequestCreation(nextPageToken).toEntity(localVarReturnType);
    }

    /**
     * Get all MID Lists
     * Retrieve all the Merchant Id Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>200</b> - Success
     * @param nextPageToken The pagination cursor to use as a query parameter to get to the next page of results.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMdcMidListsWithResponseSpec(String nextPageToken) throws WebClientResponseException {
        return getMdcMidListsRequestCreation(nextPageToken);
    }

    /**
     * Get MID List
     * Retrieve a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - Success
     * @param id The unique identifier of the MID List.
     * @return MerchantIdList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMidMccListRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getMidMccList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<MerchantIdList> localVarReturnType = new ParameterizedTypeReference<MerchantIdList>() {};
        return apiClient.invokeAPI("/v1/mdc/midLists/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get MID List
     * Retrieve a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - Success
     * @param id The unique identifier of the MID List.
     * @return MerchantIdList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdList> getMidMccList(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdList> localVarReturnType = new ParameterizedTypeReference<MerchantIdList>() {};
        return getMidMccListRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get MID List
     * Retrieve a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - Success
     * @param id The unique identifier of the MID List.
     * @return ResponseEntity&lt;MerchantIdList&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdList>> getMidMccListWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdList> localVarReturnType = new ParameterizedTypeReference<MerchantIdList>() {};
        return getMidMccListRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get MID List
     * Retrieve a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - Success
     * @param id The unique identifier of the MID List.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMidMccListWithResponseSpec(UUID id) throws WebClientResponseException {
        return getMidMccListRequestCreation(id);
    }

    /**
     * Import MIDs
     * Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>202</b> - Import in progress
     * @param id The unique identifier of the MID List.
     * @param importMdcMidListCodesRequest The importMdcMidListCodesRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec importMdcMidListCodesRequestCreation(UUID id, ImportMdcMidListCodesRequest importMdcMidListCodesRequest) throws WebClientResponseException {
        Object postBody = importMdcMidListCodesRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling importMdcMidListCodes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'importMdcMidListCodesRequest' is set
        if (importMdcMidListCodesRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'importMdcMidListCodesRequest' when calling importMdcMidListCodes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/mdc/midLists/{id}/merchantIds", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Import MIDs
     * Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>202</b> - Import in progress
     * @param id The unique identifier of the MID List.
     * @param importMdcMidListCodesRequest The importMdcMidListCodesRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> importMdcMidListCodes(UUID id, ImportMdcMidListCodesRequest importMdcMidListCodesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return importMdcMidListCodesRequestCreation(id, importMdcMidListCodesRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Import MIDs
     * Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>202</b> - Import in progress
     * @param id The unique identifier of the MID List.
     * @param importMdcMidListCodesRequest The importMdcMidListCodesRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> importMdcMidListCodesWithHttpInfo(UUID id, ImportMdcMidListCodesRequest importMdcMidListCodesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return importMdcMidListCodesRequestCreation(id, importMdcMidListCodesRequest).toEntity(localVarReturnType);
    }

    /**
     * Import MIDs
     * Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>202</b> - Import in progress
     * @param id The unique identifier of the MID List.
     * @param importMdcMidListCodesRequest The importMdcMidListCodesRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec importMdcMidListCodesWithResponseSpec(UUID id, ImportMdcMidListCodesRequest importMdcMidListCodesRequest) throws WebClientResponseException {
        return importMdcMidListCodesRequestCreation(id, importMdcMidListCodesRequest);
    }

    /**
     * Create Merchant Id List
     * Create a list of Merchant Ids for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>201</b> - MerchantId List Created
     * <p><b>400</b> - Bad Request
     * @param postMdcMidListRequest The postMdcMidListRequest parameter
     * @return MerchantIdList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postMdcMidListRequestCreation(PostMdcMidListRequest postMdcMidListRequest) throws WebClientResponseException {
        Object postBody = postMdcMidListRequest;
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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<MerchantIdList> localVarReturnType = new ParameterizedTypeReference<MerchantIdList>() {};
        return apiClient.invokeAPI("/v1/mdc/midLists", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Merchant Id List
     * Create a list of Merchant Ids for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>201</b> - MerchantId List Created
     * <p><b>400</b> - Bad Request
     * @param postMdcMidListRequest The postMdcMidListRequest parameter
     * @return MerchantIdList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdList> postMdcMidList(PostMdcMidListRequest postMdcMidListRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdList> localVarReturnType = new ParameterizedTypeReference<MerchantIdList>() {};
        return postMdcMidListRequestCreation(postMdcMidListRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Merchant Id List
     * Create a list of Merchant Ids for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>201</b> - MerchantId List Created
     * <p><b>400</b> - Bad Request
     * @param postMdcMidListRequest The postMdcMidListRequest parameter
     * @return ResponseEntity&lt;MerchantIdList&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdList>> postMdcMidListWithHttpInfo(PostMdcMidListRequest postMdcMidListRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdList> localVarReturnType = new ParameterizedTypeReference<MerchantIdList>() {};
        return postMdcMidListRequestCreation(postMdcMidListRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Merchant Id List
     * Create a list of Merchant Ids for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>201</b> - MerchantId List Created
     * <p><b>400</b> - Bad Request
     * @param postMdcMidListRequest The postMdcMidListRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postMdcMidListWithResponseSpec(PostMdcMidListRequest postMdcMidListRequest) throws WebClientResponseException {
        return postMdcMidListRequestCreation(postMdcMidListRequest);
    }

    /**
     * Remove MCC from List
     * Remove the MID from the MID List.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MerchantId removed from list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec removeMdcMidListCodeRequestCreation(UUID id, String mid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling removeMdcMidListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mid' is set
        if (mid == null) {
            throw new WebClientResponseException("Missing the required parameter 'mid' when calling removeMdcMidListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("mid", mid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/v1/mdc/midLists/{id}/merchantIds/{mid}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove MCC from List
     * Remove the MID from the MID List.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MerchantId removed from list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> removeMdcMidListCode(UUID id, String mid) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return removeMdcMidListCodeRequestCreation(id, mid).bodyToMono(localVarReturnType);
    }

    /**
     * Remove MCC from List
     * Remove the MID from the MID List.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MerchantId removed from list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> removeMdcMidListCodeWithHttpInfo(UUID id, String mid) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return removeMdcMidListCodeRequestCreation(id, mid).toEntity(localVarReturnType);
    }

    /**
     * Remove MCC from List
     * Remove the MID from the MID List.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MerchantId removed from list
     * @param id The unique identifier of the MID List.
     * @param mid The merchant id.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeMdcMidListCodeWithResponseSpec(UUID id, String mid) throws WebClientResponseException {
        return removeMdcMidListCodeRequestCreation(id, mid);
    }

    /**
     * Update MerchantId List
     * Update a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - a MerchantIdList
     * @param id The unique identifier of the MID List.
     * @param postMdcMidListRequest The postMdcMidListRequest parameter
     * @return MerchantIdList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateMdcMidListRequestCreation(UUID id, PostMdcMidListRequest postMdcMidListRequest) throws WebClientResponseException {
        Object postBody = postMdcMidListRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateMdcMidList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'postMdcMidListRequest' is set
        if (postMdcMidListRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'postMdcMidListRequest' when calling updateMdcMidList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<MerchantIdList> localVarReturnType = new ParameterizedTypeReference<MerchantIdList>() {};
        return apiClient.invokeAPI("/v1/mdc/midLists/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update MerchantId List
     * Update a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - a MerchantIdList
     * @param id The unique identifier of the MID List.
     * @param postMdcMidListRequest The postMdcMidListRequest parameter
     * @return MerchantIdList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdList> updateMdcMidList(UUID id, PostMdcMidListRequest postMdcMidListRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdList> localVarReturnType = new ParameterizedTypeReference<MerchantIdList>() {};
        return updateMdcMidListRequestCreation(id, postMdcMidListRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update MerchantId List
     * Update a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - a MerchantIdList
     * @param id The unique identifier of the MID List.
     * @param postMdcMidListRequest The postMdcMidListRequest parameter
     * @return ResponseEntity&lt;MerchantIdList&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdList>> updateMdcMidListWithHttpInfo(UUID id, PostMdcMidListRequest postMdcMidListRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdList> localVarReturnType = new ParameterizedTypeReference<MerchantIdList>() {};
        return updateMdcMidListRequestCreation(id, postMdcMidListRequest).toEntity(localVarReturnType);
    }

    /**
     * Update MerchantId List
     * Update a Merchant Id List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - a MerchantIdList
     * @param id The unique identifier of the MID List.
     * @param postMdcMidListRequest The postMdcMidListRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateMdcMidListWithResponseSpec(UUID id, PostMdcMidListRequest postMdcMidListRequest) throws WebClientResponseException {
        return updateMdcMidListRequestCreation(id, postMdcMidListRequest);
    }
}
