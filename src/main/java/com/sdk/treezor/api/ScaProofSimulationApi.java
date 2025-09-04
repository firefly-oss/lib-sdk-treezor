/*
 * Copyright 2025 Firefly Software Solutions Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.PostScaProof200Response;
import com.sdk.treezor.model.PostScaProofRequest;

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
public class ScaProofSimulationApi {
    private ApiClient apiClient;

    public ScaProofSimulationApi() {
        this(new ApiClient());
    }

    @Autowired
    public ScaProofSimulationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Simulate SCA Proof
     * Create an &#x60;scaProof&#x60; for testing SCA authentication flows without a dedicated frontend. Use the &#x60;scaProof&#x60; to secure end user flow with a &#x60;delegated_end_user&#x60; JWT in &#x60;sandbox&#x60;.   See the [Simulate SCA Proof](/guide/strong-customer-authentication/faking-operations.html#simulate-sca-proof) article for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postScaProofRequest The postScaProofRequest parameter
     * @return PostScaProof200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postScaProofRequestCreation(PostScaProofRequest postScaProofRequest) throws WebClientResponseException {
        Object postBody = postScaProofRequest;
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

        ParameterizedTypeReference<PostScaProof200Response> localVarReturnType = new ParameterizedTypeReference<PostScaProof200Response>() {};
        return apiClient.invokeAPI("/simulation/scaProof", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate SCA Proof
     * Create an &#x60;scaProof&#x60; for testing SCA authentication flows without a dedicated frontend. Use the &#x60;scaProof&#x60; to secure end user flow with a &#x60;delegated_end_user&#x60; JWT in &#x60;sandbox&#x60;.   See the [Simulate SCA Proof](/guide/strong-customer-authentication/faking-operations.html#simulate-sca-proof) article for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postScaProofRequest The postScaProofRequest parameter
     * @return PostScaProof200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostScaProof200Response> postScaProof(PostScaProofRequest postScaProofRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostScaProof200Response> localVarReturnType = new ParameterizedTypeReference<PostScaProof200Response>() {};
        return postScaProofRequestCreation(postScaProofRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate SCA Proof
     * Create an &#x60;scaProof&#x60; for testing SCA authentication flows without a dedicated frontend. Use the &#x60;scaProof&#x60; to secure end user flow with a &#x60;delegated_end_user&#x60; JWT in &#x60;sandbox&#x60;.   See the [Simulate SCA Proof](/guide/strong-customer-authentication/faking-operations.html#simulate-sca-proof) article for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postScaProofRequest The postScaProofRequest parameter
     * @return ResponseEntity&lt;PostScaProof200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostScaProof200Response>> postScaProofWithHttpInfo(PostScaProofRequest postScaProofRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostScaProof200Response> localVarReturnType = new ParameterizedTypeReference<PostScaProof200Response>() {};
        return postScaProofRequestCreation(postScaProofRequest).toEntity(localVarReturnType);
    }

    /**
     * Simulate SCA Proof
     * Create an &#x60;scaProof&#x60; for testing SCA authentication flows without a dedicated frontend. Use the &#x60;scaProof&#x60; to secure end user flow with a &#x60;delegated_end_user&#x60; JWT in &#x60;sandbox&#x60;.   See the [Simulate SCA Proof](/guide/strong-customer-authentication/faking-operations.html#simulate-sca-proof) article for more information. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postScaProofRequest The postScaProofRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postScaProofWithResponseSpec(PostScaProofRequest postScaProofRequest) throws WebClientResponseException {
        return postScaProofRequestCreation(postScaProofRequest);
    }
}
