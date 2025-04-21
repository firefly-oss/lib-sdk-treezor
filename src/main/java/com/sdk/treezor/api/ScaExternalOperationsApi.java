package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.GetSCAWalletsDefaultResponseInner;
import com.sdk.treezor.model.PostExtOperation200Response;
import com.sdk.treezor.model.PostExtOperationRequest;
import com.sdk.treezor.model.PutExtOperationRequest;
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
public class ScaExternalOperationsApi {
    private ApiClient apiClient;

    public ScaExternalOperationsApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScaExternalOperationsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Create External Operation declaration
     * Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).
     * <p><b>200</b> - The External Operation was successfully created.
     * <p><b>0</b> - Unexpected error
     * @param postExtOperationRequest The postExtOperationRequest parameter
     * @return PostExtOperation200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postExtOperationRequestCreation(PostExtOperationRequest postExtOperationRequest) throws WebClientResponseException {
        Object postBody = postExtOperationRequest;
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

        ParameterizedTypeReference<PostExtOperation200Response> localVarReturnType = new ParameterizedTypeReference<PostExtOperation200Response>() {};
        return apiClient.invokeAPI("/core-connect/sca/externalOperations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create External Operation declaration
     * Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).
     * <p><b>200</b> - The External Operation was successfully created.
     * <p><b>0</b> - Unexpected error
     * @param postExtOperationRequest The postExtOperationRequest parameter
     * @return PostExtOperation200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostExtOperation200Response> postExtOperation(PostExtOperationRequest postExtOperationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostExtOperation200Response> localVarReturnType = new ParameterizedTypeReference<PostExtOperation200Response>() {};
        return postExtOperationRequestCreation(postExtOperationRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create External Operation declaration
     * Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).
     * <p><b>200</b> - The External Operation was successfully created.
     * <p><b>0</b> - Unexpected error
     * @param postExtOperationRequest The postExtOperationRequest parameter
     * @return ResponseEntity&lt;PostExtOperation200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostExtOperation200Response>> postExtOperationWithHttpInfo(PostExtOperationRequest postExtOperationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostExtOperation200Response> localVarReturnType = new ParameterizedTypeReference<PostExtOperation200Response>() {};
        return postExtOperationRequestCreation(postExtOperationRequest).toEntity(localVarReturnType);
    }

    /**
     * Create External Operation declaration
     * Declare an SCA External Operation (i.e., a sensitive action that was made outside of Treezor services).
     * <p><b>200</b> - The External Operation was successfully created.
     * <p><b>0</b> - Unexpected error
     * @param postExtOperationRequest The postExtOperationRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postExtOperationWithResponseSpec(PostExtOperationRequest postExtOperationRequest) throws WebClientResponseException {
        return postExtOperationRequestCreation(postExtOperationRequest);
    }

    /**
     * Update External Operation declaration
     * Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 
     * <p><b>200</b> - The External Operation was successfully updated.
     * <p><b>0</b> - Unexpected error
     * @param externalOperationId The unique identifier (uiid) of the ExternalOperation.
     * @param putExtOperationRequest The putExtOperationRequest parameter
     * @return PostExtOperation200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putExtOperationRequestCreation(UUID externalOperationId, PutExtOperationRequest putExtOperationRequest) throws WebClientResponseException {
        Object postBody = putExtOperationRequest;
        // verify the required parameter 'externalOperationId' is set
        if (externalOperationId == null) {
            throw new WebClientResponseException("Missing the required parameter 'externalOperationId' when calling putExtOperation", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("externalOperationId", externalOperationId);

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

        ParameterizedTypeReference<PostExtOperation200Response> localVarReturnType = new ParameterizedTypeReference<PostExtOperation200Response>() {};
        return apiClient.invokeAPI("/core-connect/sca/externalOperations/{externalOperationId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update External Operation declaration
     * Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 
     * <p><b>200</b> - The External Operation was successfully updated.
     * <p><b>0</b> - Unexpected error
     * @param externalOperationId The unique identifier (uiid) of the ExternalOperation.
     * @param putExtOperationRequest The putExtOperationRequest parameter
     * @return PostExtOperation200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostExtOperation200Response> putExtOperation(UUID externalOperationId, PutExtOperationRequest putExtOperationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostExtOperation200Response> localVarReturnType = new ParameterizedTypeReference<PostExtOperation200Response>() {};
        return putExtOperationRequestCreation(externalOperationId, putExtOperationRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update External Operation declaration
     * Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 
     * <p><b>200</b> - The External Operation was successfully updated.
     * <p><b>0</b> - Unexpected error
     * @param externalOperationId The unique identifier (uiid) of the ExternalOperation.
     * @param putExtOperationRequest The putExtOperationRequest parameter
     * @return ResponseEntity&lt;PostExtOperation200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostExtOperation200Response>> putExtOperationWithHttpInfo(UUID externalOperationId, PutExtOperationRequest putExtOperationRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostExtOperation200Response> localVarReturnType = new ParameterizedTypeReference<PostExtOperation200Response>() {};
        return putExtOperationRequestCreation(externalOperationId, putExtOperationRequest).toEntity(localVarReturnType);
    }

    /**
     * Update External Operation declaration
     * Modify an SCA External Operation declaration.   This feature is only available for Per Operation operations, in other words for external operations whose action name is: &#x60;externalMassPayoutOrderCreation&#x60;,  &#x60;externalMassTransferOrderCreation&#x60;, &#x60;externalScheduledPayoutOrder&#x60;, or &#x60;externalScheduledTransferOrder&#x60;. 
     * <p><b>200</b> - The External Operation was successfully updated.
     * <p><b>0</b> - Unexpected error
     * @param externalOperationId The unique identifier (uiid) of the ExternalOperation.
     * @param putExtOperationRequest The putExtOperationRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putExtOperationWithResponseSpec(UUID externalOperationId, PutExtOperationRequest putExtOperationRequest) throws WebClientResponseException {
        return putExtOperationRequestCreation(externalOperationId, putExtOperationRequest);
    }
}
