package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetRecallRs200Response;
import com.sdk.treezor.model.GetRecallSctInst200Response;
import com.sdk.treezor.model.GetRecallSctInst404Response;
import com.sdk.treezor.model.PutRecallRRequest;
import com.sdk.treezor.model.PutRecallSctInst201Response;
import com.sdk.treezor.model.PutRecallSctInst409Response;
import com.sdk.treezor.model.PutRecallSctInstRequest;
import com.sdk.treezor.model.SimulateSctInstRecall201Response;
import com.sdk.treezor.model.SimulateSctInstRecallRequest;

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
public class RecallsApi {
    private ApiClient apiClient;

    public RecallsApi() {
        this(new ApiClient());
    }

    @Autowired
    public RecallsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Recall or RRO
     * Retrieve a given recall or RRO.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized credentials
     * <p><b>403</b> - Forbidden action
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param recallId The unique identifier of the recall. 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param pageCount The number of items per page, only available on /v1/ endpoints 
     * @param pageNumber The page number, only available on /v1/ endpoints 
     * @return GetRecallRs200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRecallRRequestCreation(String recallId, String accessTag, Integer pageCount, Integer pageNumber) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'recallId' is set
        if (recallId == null) {
            throw new WebClientResponseException("Missing the required parameter 'recallId' when calling getRecallR", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("recallId", recallId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetRecallRs200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallRs200Response>() {};
        return apiClient.invokeAPI("/v1/recallRs/{recallId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Recall or RRO
     * Retrieve a given recall or RRO.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized credentials
     * <p><b>403</b> - Forbidden action
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param recallId The unique identifier of the recall. 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param pageCount The number of items per page, only available on /v1/ endpoints 
     * @param pageNumber The page number, only available on /v1/ endpoints 
     * @return GetRecallRs200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRecallRs200Response> getRecallR(String recallId, String accessTag, Integer pageCount, Integer pageNumber) throws WebClientResponseException {
        ParameterizedTypeReference<GetRecallRs200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallRs200Response>() {};
        return getRecallRRequestCreation(recallId, accessTag, pageCount, pageNumber).bodyToMono(localVarReturnType);
    }

    /**
     * Get Recall or RRO
     * Retrieve a given recall or RRO.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized credentials
     * <p><b>403</b> - Forbidden action
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param recallId The unique identifier of the recall. 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param pageCount The number of items per page, only available on /v1/ endpoints 
     * @param pageNumber The page number, only available on /v1/ endpoints 
     * @return ResponseEntity&lt;GetRecallRs200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRecallRs200Response>> getRecallRWithHttpInfo(String recallId, String accessTag, Integer pageCount, Integer pageNumber) throws WebClientResponseException {
        ParameterizedTypeReference<GetRecallRs200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallRs200Response>() {};
        return getRecallRRequestCreation(recallId, accessTag, pageCount, pageNumber).toEntity(localVarReturnType);
    }

    /**
     * Get Recall or RRO
     * Retrieve a given recall or RRO.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized credentials
     * <p><b>403</b> - Forbidden action
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param recallId The unique identifier of the recall. 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param pageCount The number of items per page, only available on /v1/ endpoints 
     * @param pageNumber The page number, only available on /v1/ endpoints 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRecallRWithResponseSpec(String recallId, String accessTag, Integer pageCount, Integer pageNumber) throws WebClientResponseException {
        return getRecallRRequestCreation(recallId, accessTag, pageCount, pageNumber);
    }

    /**
     * Get Recalls or RRO
     * Retrieve recalls or RROs
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized credentials
     * <p><b>403</b> - Forbidden action
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param pageCount The number of items per page, only available on /v1/ endpoints 
     * @param pageNumber The page number, only available on /v1/ endpoints 
     * @param filter List of available filters: - id - recallRSepaMessageId - cxlId - statusId - reasonCode - clientId - userId - walletId - sctrId - receivedDate - frozenWalletFollowingRecallr - createdDate - inError 
     * @return GetRecallRs200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRecallRsRequestCreation(String accessTag, Integer pageCount, Integer pageNumber, String filter) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetRecallRs200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallRs200Response>() {};
        return apiClient.invokeAPI("/v1/recallRs", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Recalls or RRO
     * Retrieve recalls or RROs
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized credentials
     * <p><b>403</b> - Forbidden action
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param pageCount The number of items per page, only available on /v1/ endpoints 
     * @param pageNumber The page number, only available on /v1/ endpoints 
     * @param filter List of available filters: - id - recallRSepaMessageId - cxlId - statusId - reasonCode - clientId - userId - walletId - sctrId - receivedDate - frozenWalletFollowingRecallr - createdDate - inError 
     * @return GetRecallRs200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRecallRs200Response> getRecallRs(String accessTag, Integer pageCount, Integer pageNumber, String filter) throws WebClientResponseException {
        ParameterizedTypeReference<GetRecallRs200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallRs200Response>() {};
        return getRecallRsRequestCreation(accessTag, pageCount, pageNumber, filter).bodyToMono(localVarReturnType);
    }

    /**
     * Get Recalls or RRO
     * Retrieve recalls or RROs
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized credentials
     * <p><b>403</b> - Forbidden action
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param pageCount The number of items per page, only available on /v1/ endpoints 
     * @param pageNumber The page number, only available on /v1/ endpoints 
     * @param filter List of available filters: - id - recallRSepaMessageId - cxlId - statusId - reasonCode - clientId - userId - walletId - sctrId - receivedDate - frozenWalletFollowingRecallr - createdDate - inError 
     * @return ResponseEntity&lt;GetRecallRs200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRecallRs200Response>> getRecallRsWithHttpInfo(String accessTag, Integer pageCount, Integer pageNumber, String filter) throws WebClientResponseException {
        ParameterizedTypeReference<GetRecallRs200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallRs200Response>() {};
        return getRecallRsRequestCreation(accessTag, pageCount, pageNumber, filter).toEntity(localVarReturnType);
    }

    /**
     * Get Recalls or RRO
     * Retrieve recalls or RROs
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized credentials
     * <p><b>403</b> - Forbidden action
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param pageCount The number of items per page, only available on /v1/ endpoints 
     * @param pageNumber The page number, only available on /v1/ endpoints 
     * @param filter List of available filters: - id - recallRSepaMessageId - cxlId - statusId - reasonCode - clientId - userId - walletId - sctrId - receivedDate - frozenWalletFollowingRecallr - createdDate - inError 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRecallRsWithResponseSpec(String accessTag, Integer pageCount, Integer pageNumber, String filter) throws WebClientResponseException {
        return getRecallRsRequestCreation(accessTag, pageCount, pageNumber, filter);
    }

    /**
     * Get SCT Inst Recall
     * Retrieve an SCT Inst Recall.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param sctInstId The unique identifier of the initial SCT Inst.
     * @param recallId The unique identifier of the recall.
     * @return GetRecallSctInst200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRecallSctInstRequestCreation(String sctInstId, String recallId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'sctInstId' is set
        if (sctInstId == null) {
            throw new WebClientResponseException("Missing the required parameter 'sctInstId' when calling getRecallSctInst", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'recallId' is set
        if (recallId == null) {
            throw new WebClientResponseException("Missing the required parameter 'recallId' when calling getRecallSctInst", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("sctInstId", sctInstId);
        pathParams.put("recallId", recallId);

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

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetRecallSctInst200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallSctInst200Response>() {};
        return apiClient.invokeAPI("/v1/recall-sct-inst/{sctInstId}/{recallId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get SCT Inst Recall
     * Retrieve an SCT Inst Recall.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param sctInstId The unique identifier of the initial SCT Inst.
     * @param recallId The unique identifier of the recall.
     * @return GetRecallSctInst200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRecallSctInst200Response> getRecallSctInst(String sctInstId, String recallId) throws WebClientResponseException {
        ParameterizedTypeReference<GetRecallSctInst200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallSctInst200Response>() {};
        return getRecallSctInstRequestCreation(sctInstId, recallId).bodyToMono(localVarReturnType);
    }

    /**
     * Get SCT Inst Recall
     * Retrieve an SCT Inst Recall.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param sctInstId The unique identifier of the initial SCT Inst.
     * @param recallId The unique identifier of the recall.
     * @return ResponseEntity&lt;GetRecallSctInst200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRecallSctInst200Response>> getRecallSctInstWithHttpInfo(String sctInstId, String recallId) throws WebClientResponseException {
        ParameterizedTypeReference<GetRecallSctInst200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallSctInst200Response>() {};
        return getRecallSctInstRequestCreation(sctInstId, recallId).toEntity(localVarReturnType);
    }

    /**
     * Get SCT Inst Recall
     * Retrieve an SCT Inst Recall.
     * <p><b>200</b> - OK
     * <p><b>401</b> - Unauthorized
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not found
     * <p><b>405</b> - Method Not Allowed
     * <p><b>500</b> - Internal error
     * <p><b>0</b> - Unexpected error
     * @param sctInstId The unique identifier of the initial SCT Inst.
     * @param recallId The unique identifier of the recall.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRecallSctInstWithResponseSpec(String sctInstId, String recallId) throws WebClientResponseException {
        return getRecallSctInstRequestCreation(sctInstId, recallId);
    }

    /**
     * Respond to Recall or RRO
     * Respond to a Recall or a RRO.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param recallId The unique identifier of the recall.
     * @param putRecallRRequest The putRecallRRequest parameter
     * @return GetRecallRs200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putRecallRRequestCreation(UUID recallId, PutRecallRRequest putRecallRRequest) throws WebClientResponseException {
        Object postBody = putRecallRRequest;
        // verify the required parameter 'recallId' is set
        if (recallId == null) {
            throw new WebClientResponseException("Missing the required parameter 'recallId' when calling putRecallR", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("recallId", recallId);

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

        ParameterizedTypeReference<GetRecallRs200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallRs200Response>() {};
        return apiClient.invokeAPI("/v1/recallRs/{recallId}/response", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Respond to Recall or RRO
     * Respond to a Recall or a RRO.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param recallId The unique identifier of the recall.
     * @param putRecallRRequest The putRecallRRequest parameter
     * @return GetRecallRs200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRecallRs200Response> putRecallR(UUID recallId, PutRecallRRequest putRecallRRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetRecallRs200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallRs200Response>() {};
        return putRecallRRequestCreation(recallId, putRecallRRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Respond to Recall or RRO
     * Respond to a Recall or a RRO.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param recallId The unique identifier of the recall.
     * @param putRecallRRequest The putRecallRRequest parameter
     * @return ResponseEntity&lt;GetRecallRs200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRecallRs200Response>> putRecallRWithHttpInfo(UUID recallId, PutRecallRRequest putRecallRRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetRecallRs200Response> localVarReturnType = new ParameterizedTypeReference<GetRecallRs200Response>() {};
        return putRecallRRequestCreation(recallId, putRecallRRequest).toEntity(localVarReturnType);
    }

    /**
     * Respond to Recall or RRO
     * Respond to a Recall or a RRO.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param recallId The unique identifier of the recall.
     * @param putRecallRRequest The putRecallRRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putRecallRWithResponseSpec(UUID recallId, PutRecallRRequest putRecallRRequest) throws WebClientResponseException {
        return putRecallRRequestCreation(recallId, putRecallRRequest);
    }

    /**
     * Respond to SCT Inst Recall
     * Provide your decision following an SCT Inst Recall.
     * <p><b>201</b> - Created
     * <p><b>405</b> - Method Not Allowed
     * <p><b>409</b> - Conflict
     * <p><b>0</b> - Unexpected error
     * @param sctInstId The unique identifier of the initial SCT Inst.
     * @param recallId The unique identifier of the recall.
     * @param putRecallSctInstRequest The putRecallSctInstRequest parameter
     * @return PutRecallSctInst201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putRecallSctInstRequestCreation(String sctInstId, String recallId, PutRecallSctInstRequest putRecallSctInstRequest) throws WebClientResponseException {
        Object postBody = putRecallSctInstRequest;
        // verify the required parameter 'sctInstId' is set
        if (sctInstId == null) {
            throw new WebClientResponseException("Missing the required parameter 'sctInstId' when calling putRecallSctInst", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'recallId' is set
        if (recallId == null) {
            throw new WebClientResponseException("Missing the required parameter 'recallId' when calling putRecallSctInst", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("sctInstId", sctInstId);
        pathParams.put("recallId", recallId);

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

        ParameterizedTypeReference<PutRecallSctInst201Response> localVarReturnType = new ParameterizedTypeReference<PutRecallSctInst201Response>() {};
        return apiClient.invokeAPI("/v1/recall-sct-inst/{sctInstId}/{recallId}/response", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Respond to SCT Inst Recall
     * Provide your decision following an SCT Inst Recall.
     * <p><b>201</b> - Created
     * <p><b>405</b> - Method Not Allowed
     * <p><b>409</b> - Conflict
     * <p><b>0</b> - Unexpected error
     * @param sctInstId The unique identifier of the initial SCT Inst.
     * @param recallId The unique identifier of the recall.
     * @param putRecallSctInstRequest The putRecallSctInstRequest parameter
     * @return PutRecallSctInst201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PutRecallSctInst201Response> putRecallSctInst(String sctInstId, String recallId, PutRecallSctInstRequest putRecallSctInstRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PutRecallSctInst201Response> localVarReturnType = new ParameterizedTypeReference<PutRecallSctInst201Response>() {};
        return putRecallSctInstRequestCreation(sctInstId, recallId, putRecallSctInstRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Respond to SCT Inst Recall
     * Provide your decision following an SCT Inst Recall.
     * <p><b>201</b> - Created
     * <p><b>405</b> - Method Not Allowed
     * <p><b>409</b> - Conflict
     * <p><b>0</b> - Unexpected error
     * @param sctInstId The unique identifier of the initial SCT Inst.
     * @param recallId The unique identifier of the recall.
     * @param putRecallSctInstRequest The putRecallSctInstRequest parameter
     * @return ResponseEntity&lt;PutRecallSctInst201Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PutRecallSctInst201Response>> putRecallSctInstWithHttpInfo(String sctInstId, String recallId, PutRecallSctInstRequest putRecallSctInstRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PutRecallSctInst201Response> localVarReturnType = new ParameterizedTypeReference<PutRecallSctInst201Response>() {};
        return putRecallSctInstRequestCreation(sctInstId, recallId, putRecallSctInstRequest).toEntity(localVarReturnType);
    }

    /**
     * Respond to SCT Inst Recall
     * Provide your decision following an SCT Inst Recall.
     * <p><b>201</b> - Created
     * <p><b>405</b> - Method Not Allowed
     * <p><b>409</b> - Conflict
     * <p><b>0</b> - Unexpected error
     * @param sctInstId The unique identifier of the initial SCT Inst.
     * @param recallId The unique identifier of the recall.
     * @param putRecallSctInstRequest The putRecallSctInstRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putRecallSctInstWithResponseSpec(String sctInstId, String recallId, PutRecallSctInstRequest putRecallSctInstRequest) throws WebClientResponseException {
        return putRecallSctInstRequestCreation(sctInstId, recallId, putRecallSctInstRequest);
    }

    /**
     * Simulate SCT Inst recall
     * Simulate a recall for an instantaneous SEPA Credit Transfer.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateSctInstRecallRequest The simulateSctInstRecallRequest parameter
     * @return SimulateSctInstRecall201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec simulateSctInstRecallRequestCreation(SimulateSctInstRecallRequest simulateSctInstRecallRequest) throws WebClientResponseException {
        Object postBody = simulateSctInstRecallRequest;
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

        ParameterizedTypeReference<SimulateSctInstRecall201Response> localVarReturnType = new ParameterizedTypeReference<SimulateSctInstRecall201Response>() {};
        return apiClient.invokeAPI("/simulation/sct-inst/recall", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate SCT Inst recall
     * Simulate a recall for an instantaneous SEPA Credit Transfer.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateSctInstRecallRequest The simulateSctInstRecallRequest parameter
     * @return SimulateSctInstRecall201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<SimulateSctInstRecall201Response> simulateSctInstRecall(SimulateSctInstRecallRequest simulateSctInstRecallRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SimulateSctInstRecall201Response> localVarReturnType = new ParameterizedTypeReference<SimulateSctInstRecall201Response>() {};
        return simulateSctInstRecallRequestCreation(simulateSctInstRecallRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate SCT Inst recall
     * Simulate a recall for an instantaneous SEPA Credit Transfer.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateSctInstRecallRequest The simulateSctInstRecallRequest parameter
     * @return ResponseEntity&lt;SimulateSctInstRecall201Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<SimulateSctInstRecall201Response>> simulateSctInstRecallWithHttpInfo(SimulateSctInstRecallRequest simulateSctInstRecallRequest) throws WebClientResponseException {
        ParameterizedTypeReference<SimulateSctInstRecall201Response> localVarReturnType = new ParameterizedTypeReference<SimulateSctInstRecall201Response>() {};
        return simulateSctInstRecallRequestCreation(simulateSctInstRecallRequest).toEntity(localVarReturnType);
    }

    /**
     * Simulate SCT Inst recall
     * Simulate a recall for an instantaneous SEPA Credit Transfer.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateSctInstRecallRequest The simulateSctInstRecallRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec simulateSctInstRecallWithResponseSpec(SimulateSctInstRecallRequest simulateSctInstRecallRequest) throws WebClientResponseException {
        return simulateSctInstRecallRequestCreation(simulateSctInstRecallRequest);
    }
}
