package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.PostAuth200Response;

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
public class AuthenticationApi {
    private ApiClient apiClient;

    public AuthenticationApi() {
        this(new ApiClient());
    }

    @Autowired
    public AuthenticationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Obtain Access Token
     * Exchange authorization codes or refresh tokens for access tokens. The response will include the access token and optionally a refresh token, along with their expiration details. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param grantType MUST BE \\\&quot;refresh_token\\\&quot; value for refresh token flow
     * @param clientId The clientId parameter
     * @param clientSecret The clientSecret parameter
     * @param scope space separated
     * @param username The username parameter
     * @param password User password
     * @param refreshToken The refreshToken parameter
     * @return PostAuth200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postAuthRequestCreation(String grantType, String clientId, String clientSecret, String scope, String username, String password, String refreshToken) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (grantType != null)
            formParams.add("grant_type", grantType);
        if (clientId != null)
            formParams.add("client_id", clientId);
        if (clientSecret != null)
            formParams.add("client_secret", clientSecret);
        if (scope != null)
            formParams.add("scope", scope);
        if (username != null)
            formParams.add("username", username);
        if (password != null)
            formParams.add("password", password);
        if (refreshToken != null)
            formParams.add("refresh_token", refreshToken);

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "multipart/form-data"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] {  };

        ParameterizedTypeReference<PostAuth200Response> localVarReturnType = new ParameterizedTypeReference<PostAuth200Response>() {};
        return apiClient.invokeAPI("/oauth/token", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Obtain Access Token
     * Exchange authorization codes or refresh tokens for access tokens. The response will include the access token and optionally a refresh token, along with their expiration details. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param grantType MUST BE \\\&quot;refresh_token\\\&quot; value for refresh token flow
     * @param clientId The clientId parameter
     * @param clientSecret The clientSecret parameter
     * @param scope space separated
     * @param username The username parameter
     * @param password User password
     * @param refreshToken The refreshToken parameter
     * @return PostAuth200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostAuth200Response> postAuth(String grantType, String clientId, String clientSecret, String scope, String username, String password, String refreshToken) throws WebClientResponseException {
        ParameterizedTypeReference<PostAuth200Response> localVarReturnType = new ParameterizedTypeReference<PostAuth200Response>() {};
        return postAuthRequestCreation(grantType, clientId, clientSecret, scope, username, password, refreshToken).bodyToMono(localVarReturnType);
    }

    /**
     * Obtain Access Token
     * Exchange authorization codes or refresh tokens for access tokens. The response will include the access token and optionally a refresh token, along with their expiration details. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param grantType MUST BE \\\&quot;refresh_token\\\&quot; value for refresh token flow
     * @param clientId The clientId parameter
     * @param clientSecret The clientSecret parameter
     * @param scope space separated
     * @param username The username parameter
     * @param password User password
     * @param refreshToken The refreshToken parameter
     * @return ResponseEntity&lt;PostAuth200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostAuth200Response>> postAuthWithHttpInfo(String grantType, String clientId, String clientSecret, String scope, String username, String password, String refreshToken) throws WebClientResponseException {
        ParameterizedTypeReference<PostAuth200Response> localVarReturnType = new ParameterizedTypeReference<PostAuth200Response>() {};
        return postAuthRequestCreation(grantType, clientId, clientSecret, scope, username, password, refreshToken).toEntity(localVarReturnType);
    }

    /**
     * Obtain Access Token
     * Exchange authorization codes or refresh tokens for access tokens. The response will include the access token and optionally a refresh token, along with their expiration details. 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param grantType MUST BE \\\&quot;refresh_token\\\&quot; value for refresh token flow
     * @param clientId The clientId parameter
     * @param clientSecret The clientSecret parameter
     * @param scope space separated
     * @param username The username parameter
     * @param password User password
     * @param refreshToken The refreshToken parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postAuthWithResponseSpec(String grantType, String clientId, String clientSecret, String scope, String username, String password, String refreshToken) throws WebClientResponseException {
        return postAuthRequestCreation(grantType, clientId, clientSecret, scope, username, password, refreshToken);
    }
}
