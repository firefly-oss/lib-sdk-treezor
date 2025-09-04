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
import com.sdk.treezor.model.PutKycreview400Response;
import com.sdk.treezor.model.PutKycreview403Response;
import com.sdk.treezor.model.UserObject;

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
public class UserKycReviewApi {
    private ApiClient apiClient;

    public UserKycReviewApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserKycReviewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Request KYC Review
     * Request a KYC review for a given user and its children to Treezor. Learn more in the [KYC Request](/guide/user-verification/kyc-request.html) article. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - forbidden
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putKycreviewRequestCreation(Integer userId, String accessTag) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling putKycreview", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

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

        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return apiClient.invokeAPI("/v1/users/{userId}/Kycreview", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Request KYC Review
     * Request a KYC review for a given user and its children to Treezor. Learn more in the [KYC Request](/guide/user-verification/kyc-request.html) article. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - forbidden
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return UserObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UserObject> putKycreview(Integer userId, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return putKycreviewRequestCreation(userId, accessTag).bodyToMono(localVarReturnType);
    }

    /**
     * Request KYC Review
     * Request a KYC review for a given user and its children to Treezor. Learn more in the [KYC Request](/guide/user-verification/kyc-request.html) article. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - forbidden
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseEntity&lt;UserObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UserObject>> putKycreviewWithHttpInfo(Integer userId, String accessTag) throws WebClientResponseException {
        ParameterizedTypeReference<UserObject> localVarReturnType = new ParameterizedTypeReference<UserObject>() {};
        return putKycreviewRequestCreation(userId, accessTag).toEntity(localVarReturnType);
    }

    /**
     * Request KYC Review
     * Request a KYC review for a given user and its children to Treezor. Learn more in the [KYC Request](/guide/user-verification/kyc-request.html) article. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - forbidden
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putKycreviewWithResponseSpec(Integer userId, String accessTag) throws WebClientResponseException {
        return putKycreviewRequestCreation(userId, accessTag);
    }
}
