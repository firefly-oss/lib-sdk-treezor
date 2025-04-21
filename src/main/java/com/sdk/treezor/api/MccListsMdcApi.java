package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.ImportMdcMccListCodesRequest;
import com.sdk.treezor.model.MccList;
import com.sdk.treezor.model.MccLists;
import com.sdk.treezor.model.PostMdcMccListRequest;
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
public class MccListsMdcApi {
    private ApiClient apiClient;

    public MccListsMdcApi() {
        this(new ApiClient());
    }

    @Autowired
    public MccListsMdcApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Add MCC to MCC List
     * Add the MCC in the Merchant Category Code list.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MCC added to list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec addMdcMccListCodeRequestCreation(UUID id, String mcc) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling addMdcMccListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mcc' is set
        if (mcc == null) {
            throw new WebClientResponseException("Missing the required parameter 'mcc' when calling addMdcMccListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("mcc", mcc);

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
        return apiClient.invokeAPI("/v1/mdc/mccLists/{id}/codes/{mcc}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Add MCC to MCC List
     * Add the MCC in the Merchant Category Code list.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MCC added to list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> addMdcMccListCode(UUID id, String mcc) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return addMdcMccListCodeRequestCreation(id, mcc).bodyToMono(localVarReturnType);
    }

    /**
     * Add MCC to MCC List
     * Add the MCC in the Merchant Category Code list.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MCC added to list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> addMdcMccListCodeWithHttpInfo(UUID id, String mcc) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return addMdcMccListCodeRequestCreation(id, mcc).toEntity(localVarReturnType);
    }

    /**
     * Add MCC to MCC List
     * Add the MCC in the Merchant Category Code list.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MCC added to list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec addMdcMccListCodeWithResponseSpec(UUID id, String mcc) throws WebClientResponseException {
        return addMdcMccListCodeRequestCreation(id, mcc);
    }

    /**
     * Check MCC Presence
     * Check in the MCC is included in the MCC List. If not, the API returns an HTTP 404 error.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - The MCC is in the list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec checkMdcMccListCodeRequestCreation(UUID id, String mcc) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling checkMdcMccListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mcc' is set
        if (mcc == null) {
            throw new WebClientResponseException("Missing the required parameter 'mcc' when calling checkMdcMccListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("mcc", mcc);

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
        return apiClient.invokeAPI("/v1/mdc/mccLists/{id}/codes/{mcc}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check MCC Presence
     * Check in the MCC is included in the MCC List. If not, the API returns an HTTP 404 error.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - The MCC is in the list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> checkMdcMccListCode(UUID id, String mcc) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return checkMdcMccListCodeRequestCreation(id, mcc).bodyToMono(localVarReturnType);
    }

    /**
     * Check MCC Presence
     * Check in the MCC is included in the MCC List. If not, the API returns an HTTP 404 error.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - The MCC is in the list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> checkMdcMccListCodeWithHttpInfo(UUID id, String mcc) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return checkMdcMccListCodeRequestCreation(id, mcc).toEntity(localVarReturnType);
    }

    /**
     * Check MCC Presence
     * Check in the MCC is included in the MCC List. If not, the API returns an HTTP 404 error.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - The MCC is in the list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec checkMdcMccListCodeWithResponseSpec(UUID id, String mcc) throws WebClientResponseException {
        return checkMdcMccListCodeRequestCreation(id, mcc);
    }

    /**
     * Delete MCC List
     * Delete a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - List successfully removed
     * @param id The unique identifier of the MCC List.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteMdcMccListRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteMdcMccList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/v1/mdc/mccLists/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete MCC List
     * Delete a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - List successfully removed
     * @param id The unique identifier of the MCC List.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteMdcMccList(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteMdcMccListRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Delete MCC List
     * Delete a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - List successfully removed
     * @param id The unique identifier of the MCC List.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> deleteMdcMccListWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteMdcMccListRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Delete MCC List
     * Delete a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - List successfully removed
     * @param id The unique identifier of the MCC List.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteMdcMccListWithResponseSpec(UUID id) throws WebClientResponseException {
        return deleteMdcMccListRequestCreation(id);
    }

    /**
     * Get MCC List
     * Retrieve a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 
     * <p><b>400</b> - Not Found
     * <p><b>200</b> - Success
     * @param id The unique identifier of the MCC List.
     * @return MccList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMdcMccListRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getMdcMccList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<MccList> localVarReturnType = new ParameterizedTypeReference<MccList>() {};
        return apiClient.invokeAPI("/v1/mdc/mccLists/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get MCC List
     * Retrieve a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 
     * <p><b>400</b> - Not Found
     * <p><b>200</b> - Success
     * @param id The unique identifier of the MCC List.
     * @return MccList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MccList> getMdcMccList(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<MccList> localVarReturnType = new ParameterizedTypeReference<MccList>() {};
        return getMdcMccListRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get MCC List
     * Retrieve a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 
     * <p><b>400</b> - Not Found
     * <p><b>200</b> - Success
     * @param id The unique identifier of the MCC List.
     * @return ResponseEntity&lt;MccList&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MccList>> getMdcMccListWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<MccList> localVarReturnType = new ParameterizedTypeReference<MccList>() {};
        return getMdcMccListRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get MCC List
     * Retrieve a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature based on its &#x60;id&#x60;. 
     * <p><b>400</b> - Not Found
     * <p><b>200</b> - Success
     * @param id The unique identifier of the MCC List.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMdcMccListWithResponseSpec(UUID id) throws WebClientResponseException {
        return getMdcMccListRequestCreation(id);
    }

    /**
     * Get all MCC Lists
     * Retrieve all the Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>200</b> - Success
     * <p><b>0</b> - Unexpected error
     * @param nextPageToken The pagination cursor to use as a query parameter to get to the next page of results.
     * @return MccLists
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMdcMccListsRequestCreation(String nextPageToken) throws WebClientResponseException {
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

        ParameterizedTypeReference<MccLists> localVarReturnType = new ParameterizedTypeReference<MccLists>() {};
        return apiClient.invokeAPI("/v1/mdc/mccLists", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all MCC Lists
     * Retrieve all the Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>200</b> - Success
     * <p><b>0</b> - Unexpected error
     * @param nextPageToken The pagination cursor to use as a query parameter to get to the next page of results.
     * @return MccLists
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MccLists> getMdcMccLists(String nextPageToken) throws WebClientResponseException {
        ParameterizedTypeReference<MccLists> localVarReturnType = new ParameterizedTypeReference<MccLists>() {};
        return getMdcMccListsRequestCreation(nextPageToken).bodyToMono(localVarReturnType);
    }

    /**
     * Get all MCC Lists
     * Retrieve all the Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>200</b> - Success
     * <p><b>0</b> - Unexpected error
     * @param nextPageToken The pagination cursor to use as a query parameter to get to the next page of results.
     * @return ResponseEntity&lt;MccLists&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MccLists>> getMdcMccListsWithHttpInfo(String nextPageToken) throws WebClientResponseException {
        ParameterizedTypeReference<MccLists> localVarReturnType = new ParameterizedTypeReference<MccLists>() {};
        return getMdcMccListsRequestCreation(nextPageToken).toEntity(localVarReturnType);
    }

    /**
     * Get all MCC Lists
     * Retrieve all the Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>200</b> - Success
     * <p><b>0</b> - Unexpected error
     * @param nextPageToken The pagination cursor to use as a query parameter to get to the next page of results.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMdcMccListsWithResponseSpec(String nextPageToken) throws WebClientResponseException {
        return getMdcMccListsRequestCreation(nextPageToken);
    }

    /**
     * Import MCCs
     * Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>202</b> - Import in progress
     * @param id The unique identifier of the mccList.
     * @param importMdcMccListCodesRequest The importMdcMccListCodesRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec importMdcMccListCodesRequestCreation(UUID id, ImportMdcMccListCodesRequest importMdcMccListCodesRequest) throws WebClientResponseException {
        Object postBody = importMdcMccListCodesRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling importMdcMccListCodes", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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
        return apiClient.invokeAPI("/v1/mdc/mccLists/{id}/codes", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Import MCCs
     * Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>202</b> - Import in progress
     * @param id The unique identifier of the mccList.
     * @param importMdcMccListCodesRequest The importMdcMccListCodesRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> importMdcMccListCodes(UUID id, ImportMdcMccListCodesRequest importMdcMccListCodesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return importMdcMccListCodesRequestCreation(id, importMdcMccListCodesRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Import MCCs
     * Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>202</b> - Import in progress
     * @param id The unique identifier of the mccList.
     * @param importMdcMccListCodesRequest The importMdcMccListCodesRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> importMdcMccListCodesWithHttpInfo(UUID id, ImportMdcMccListCodesRequest importMdcMccListCodesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return importMdcMccListCodesRequestCreation(id, importMdcMccListCodesRequest).toEntity(localVarReturnType);
    }

    /**
     * Import MCCs
     * Import MCC values asynchronously into a Merchant Category Code Lists for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>202</b> - Import in progress
     * @param id The unique identifier of the mccList.
     * @param importMdcMccListCodesRequest The importMdcMccListCodesRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec importMdcMccListCodesWithResponseSpec(UUID id, ImportMdcMccListCodesRequest importMdcMccListCodesRequest) throws WebClientResponseException {
        return importMdcMccListCodesRequestCreation(id, importMdcMccListCodesRequest);
    }

    /**
     * Create MCC List
     * Create a list of Merchant Category Codes for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>201</b> - MCC List Created
     * <p><b>400</b> - Bad Request
     * @param postMdcMccListRequest The postMdcMccListRequest parameter
     * @return MccList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postMdcMccListRequestCreation(PostMdcMccListRequest postMdcMccListRequest) throws WebClientResponseException {
        Object postBody = postMdcMccListRequest;
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

        ParameterizedTypeReference<MccList> localVarReturnType = new ParameterizedTypeReference<MccList>() {};
        return apiClient.invokeAPI("/v1/mdc/mccLists", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create MCC List
     * Create a list of Merchant Category Codes for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>201</b> - MCC List Created
     * <p><b>400</b> - Bad Request
     * @param postMdcMccListRequest The postMdcMccListRequest parameter
     * @return MccList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MccList> postMdcMccList(PostMdcMccListRequest postMdcMccListRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MccList> localVarReturnType = new ParameterizedTypeReference<MccList>() {};
        return postMdcMccListRequestCreation(postMdcMccListRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create MCC List
     * Create a list of Merchant Category Codes for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>201</b> - MCC List Created
     * <p><b>400</b> - Bad Request
     * @param postMdcMccListRequest The postMdcMccListRequest parameter
     * @return ResponseEntity&lt;MccList&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MccList>> postMdcMccListWithHttpInfo(PostMdcMccListRequest postMdcMccListRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MccList> localVarReturnType = new ParameterizedTypeReference<MccList>() {};
        return postMdcMccListRequestCreation(postMdcMccListRequest).toEntity(localVarReturnType);
    }

    /**
     * Create MCC List
     * Create a list of Merchant Category Codes for the [Multi-Criteria Dynamic Card (MDC)](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>201</b> - MCC List Created
     * <p><b>400</b> - Bad Request
     * @param postMdcMccListRequest The postMdcMccListRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postMdcMccListWithResponseSpec(PostMdcMccListRequest postMdcMccListRequest) throws WebClientResponseException {
        return postMdcMccListRequestCreation(postMdcMccListRequest);
    }

    /**
     * Remove MCC from List
     * Remove the MCC from the MCC List. If the code isn&#39;t in the list, the API returns an HTTP 404 error.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MCC removed from list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec removeMdcMccListCodeRequestCreation(UUID id, String mcc) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling removeMdcMccListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'mcc' is set
        if (mcc == null) {
            throw new WebClientResponseException("Missing the required parameter 'mcc' when calling removeMdcMccListCode", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);
        pathParams.put("mcc", mcc);

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
        return apiClient.invokeAPI("/v1/mdc/mccLists/{id}/codes/{mcc}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Remove MCC from List
     * Remove the MCC from the MCC List. If the code isn&#39;t in the list, the API returns an HTTP 404 error.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MCC removed from list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> removeMdcMccListCode(UUID id, String mcc) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return removeMdcMccListCodeRequestCreation(id, mcc).bodyToMono(localVarReturnType);
    }

    /**
     * Remove MCC from List
     * Remove the MCC from the MCC List. If the code isn&#39;t in the list, the API returns an HTTP 404 error.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MCC removed from list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> removeMdcMccListCodeWithHttpInfo(UUID id, String mcc) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return removeMdcMccListCodeRequestCreation(id, mcc).toEntity(localVarReturnType);
    }

    /**
     * Remove MCC from List
     * Remove the MCC from the MCC List. If the code isn&#39;t in the list, the API returns an HTTP 404 error.
     * <p><b>404</b> - Not Found
     * <p><b>204</b> - MCC removed from list
     * @param id The unique identifier of the MCC List.
     * @param mcc The merchant category code.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec removeMdcMccListCodeWithResponseSpec(UUID id, String mcc) throws WebClientResponseException {
        return removeMdcMccListCodeRequestCreation(id, mcc);
    }

    /**
     * Update MCC List
     * Update a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - a MCCList
     * @param id The unique identifier of the MCC List.
     * @param postMdcMccListRequest The postMdcMccListRequest parameter
     * @return MccList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateMdcMccListRequestCreation(UUID id, PostMdcMccListRequest postMdcMccListRequest) throws WebClientResponseException {
        Object postBody = postMdcMccListRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling updateMdcMccList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'postMdcMccListRequest' is set
        if (postMdcMccListRequest == null) {
            throw new WebClientResponseException("Missing the required parameter 'postMdcMccListRequest' when calling updateMdcMccList", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<MccList> localVarReturnType = new ParameterizedTypeReference<MccList>() {};
        return apiClient.invokeAPI("/v1/mdc/mccLists/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update MCC List
     * Update a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - a MCCList
     * @param id The unique identifier of the MCC List.
     * @param postMdcMccListRequest The postMdcMccListRequest parameter
     * @return MccList
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MccList> updateMdcMccList(UUID id, PostMdcMccListRequest postMdcMccListRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MccList> localVarReturnType = new ParameterizedTypeReference<MccList>() {};
        return updateMdcMccListRequestCreation(id, postMdcMccListRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update MCC List
     * Update a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - a MCCList
     * @param id The unique identifier of the MCC List.
     * @param postMdcMccListRequest The postMdcMccListRequest parameter
     * @return ResponseEntity&lt;MccList&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MccList>> updateMdcMccListWithHttpInfo(UUID id, PostMdcMccListRequest postMdcMccListRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MccList> localVarReturnType = new ParameterizedTypeReference<MccList>() {};
        return updateMdcMccListRequestCreation(id, postMdcMccListRequest).toEntity(localVarReturnType);
    }

    /**
     * Update MCC List
     * Update a Merchant Category Code List for the [Multi-Criteria Dynamic Card](/guide/cards/transactions-rules-engine.html) feature. 
     * <p><b>404</b> - Not Found
     * <p><b>200</b> - a MCCList
     * @param id The unique identifier of the MCC List.
     * @param postMdcMccListRequest The postMdcMccListRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateMdcMccListWithResponseSpec(UUID id, PostMdcMccListRequest postMdcMccListRequest) throws WebClientResponseException {
        return updateMdcMccListRequestCreation(id, postMdcMccListRequest);
    }
}
