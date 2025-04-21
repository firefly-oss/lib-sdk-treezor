package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetBulkCard200Response;
import com.sdk.treezor.model.GetCardBulkReport200Response;
import com.sdk.treezor.model.PostBulkCard201Response;
import com.sdk.treezor.model.PostBulkCardRequest;
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
public class CardsBulkCreationApi {
    private ApiClient apiClient;

    public CardsBulkCreationApi() {
        this(new ApiClient());
    }

    @Autowired
    public CardsBulkCreationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Bulk Card Order
     * Search bulk card orders.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @return GetBulkCard200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getBulkCardRequestCreation() throws WebClientResponseException {
        Object postBody = null;
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
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetBulkCard200Response> localVarReturnType = new ParameterizedTypeReference<GetBulkCard200Response>() {};
        return apiClient.invokeAPI("/core-connect/card/bulk", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Bulk Card Order
     * Search bulk card orders.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @return GetBulkCard200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetBulkCard200Response> getBulkCard() throws WebClientResponseException {
        ParameterizedTypeReference<GetBulkCard200Response> localVarReturnType = new ParameterizedTypeReference<GetBulkCard200Response>() {};
        return getBulkCardRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get Bulk Card Order
     * Search bulk card orders.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @return ResponseEntity&lt;GetBulkCard200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetBulkCard200Response>> getBulkCardWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetBulkCard200Response> localVarReturnType = new ParameterizedTypeReference<GetBulkCard200Response>() {};
        return getBulkCardRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get Bulk Card Order
     * Search bulk card orders.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getBulkCardWithResponseSpec() throws WebClientResponseException {
        return getBulkCardRequestCreation();
    }

    /**
     * Get Report
     * Get a link to download the bulk card creation report.  The link expires after 5 minutes. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the card bulk creation.
     * @return GetCardBulkReport200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getCardBulkReportRequestCreation(UUID id) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getCardBulkReport", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetCardBulkReport200Response> localVarReturnType = new ParameterizedTypeReference<GetCardBulkReport200Response>() {};
        return apiClient.invokeAPI("/core-connect/card/bulk/{id}/report", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Report
     * Get a link to download the bulk card creation report.  The link expires after 5 minutes. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the card bulk creation.
     * @return GetCardBulkReport200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetCardBulkReport200Response> getCardBulkReport(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<GetCardBulkReport200Response> localVarReturnType = new ParameterizedTypeReference<GetCardBulkReport200Response>() {};
        return getCardBulkReportRequestCreation(id).bodyToMono(localVarReturnType);
    }

    /**
     * Get Report
     * Get a link to download the bulk card creation report.  The link expires after 5 minutes. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the card bulk creation.
     * @return ResponseEntity&lt;GetCardBulkReport200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetCardBulkReport200Response>> getCardBulkReportWithHttpInfo(UUID id) throws WebClientResponseException {
        ParameterizedTypeReference<GetCardBulkReport200Response> localVarReturnType = new ParameterizedTypeReference<GetCardBulkReport200Response>() {};
        return getCardBulkReportRequestCreation(id).toEntity(localVarReturnType);
    }

    /**
     * Get Report
     * Get a link to download the bulk card creation report.  The link expires after 5 minutes. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the card bulk creation.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getCardBulkReportWithResponseSpec(UUID id) throws WebClientResponseException {
        return getCardBulkReportRequestCreation(id);
    }

    /**
     * Create Bulk Card Order
     * Create a Bulk Card order to create multiple cards at once.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>201</b> - Created
     * <p><b>0</b> - Unexpected error
     * @param postBulkCardRequest The postBulkCardRequest parameter
     * @return PostBulkCard201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postBulkCardRequestCreation(PostBulkCardRequest postBulkCardRequest) throws WebClientResponseException {
        Object postBody = postBulkCardRequest;
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

        ParameterizedTypeReference<PostBulkCard201Response> localVarReturnType = new ParameterizedTypeReference<PostBulkCard201Response>() {};
        return apiClient.invokeAPI("/core-connect/card/bulk", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Bulk Card Order
     * Create a Bulk Card order to create multiple cards at once.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>201</b> - Created
     * <p><b>0</b> - Unexpected error
     * @param postBulkCardRequest The postBulkCardRequest parameter
     * @return PostBulkCard201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostBulkCard201Response> postBulkCard(PostBulkCardRequest postBulkCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostBulkCard201Response> localVarReturnType = new ParameterizedTypeReference<PostBulkCard201Response>() {};
        return postBulkCardRequestCreation(postBulkCardRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Bulk Card Order
     * Create a Bulk Card order to create multiple cards at once.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>201</b> - Created
     * <p><b>0</b> - Unexpected error
     * @param postBulkCardRequest The postBulkCardRequest parameter
     * @return ResponseEntity&lt;PostBulkCard201Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostBulkCard201Response>> postBulkCardWithHttpInfo(PostBulkCardRequest postBulkCardRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostBulkCard201Response> localVarReturnType = new ParameterizedTypeReference<PostBulkCard201Response>() {};
        return postBulkCardRequestCreation(postBulkCardRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Bulk Card Order
     * Create a Bulk Card order to create multiple cards at once.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>201</b> - Created
     * <p><b>0</b> - Unexpected error
     * @param postBulkCardRequest The postBulkCardRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postBulkCardWithResponseSpec(PostBulkCardRequest postBulkCardRequest) throws WebClientResponseException {
        return postBulkCardRequestCreation(postBulkCardRequest);
    }
}
