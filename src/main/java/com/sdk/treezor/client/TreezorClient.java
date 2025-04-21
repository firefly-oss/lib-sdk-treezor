package com.sdk.treezor.client;

import com.sdk.treezor.ApiClient;
import com.sdk.treezor.Configuration;
import com.sdk.treezor.api.AuthenticationApi;
import com.sdk.treezor.model.PostAuth200Response;

import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * Client for Treezor API that provides simplified access to API endpoints.
 * This client wraps the generated API classes to provide a more user-friendly interface.
 */
public class TreezorClient {
    private final ApiClient apiClient;
    private final AuthenticationApi authenticationApi;

    /**
     * Creates a new TreezorClient with default configuration.
     */
    public TreezorClient() {
        this.apiClient = Configuration.getDefaultApiClient();
        this.authenticationApi = new AuthenticationApi(apiClient);
    }

    /**
     * Creates a new TreezorClient with the specified base URL.
     *
     * @param baseUrl the base URL for the API
     */
    public TreezorClient(String baseUrl) {
        this.apiClient = Configuration.getDefaultApiClient();
        this.apiClient.setBasePath(baseUrl);
        this.authenticationApi = new AuthenticationApi(apiClient);
    }

    /**
     * Creates a new TreezorClient with the specified ApiClient.
     *
     * @param apiClient the ApiClient to use
     */
    public TreezorClient(ApiClient apiClient) {
        this.apiClient = apiClient;
        this.authenticationApi = new AuthenticationApi(apiClient);
    }

    /**
     * Gets the ApiClient used by this TreezorClient.
     *
     * @return the ApiClient
     */
    public ApiClient getApiClient() {
        return apiClient;
    }

    /**
     * Authenticates with the Treezor API and returns an access token.
     * This method uses the client credentials grant type to obtain an access token.
     *
     * @param clientId the client ID
     * @param clientSecret the client secret
     * @param username the username (used only for password grant type)
     * @param password the password (used only for password grant type)
     * @param scope the scope (optional)
     * @return a Mono that emits the authentication response
     */
    public Mono<ResponseEntity<PostAuth200Response>> authenticate(
            String clientId, 
            String clientSecret, 
            String username, 
            String password, 
            String scope) {

        // Determine the grant type based on whether username and password are provided
        String grantType = (username != null && password != null) ? "password" : "client_credentials";

        return authenticationApi.postAuthWithHttpInfo(
                grantType,
                clientId,
                clientSecret,
                scope,
                username,
                password,
                null // no refresh token for initial authentication
        );
    }

    /**
     * Refreshes an access token using a refresh token.
     *
     * @param clientId the client ID
     * @param clientSecret the client secret
     * @param refreshToken the refresh token
     * @return a Mono that emits the authentication response
     */
    public Mono<ResponseEntity<PostAuth200Response>> refreshToken(
            String clientId,
            String clientSecret,
            String refreshToken) {

        return authenticationApi.postAuthWithHttpInfo(
                "refresh_token", // grant type for refresh token flow
                clientId,
                clientSecret,
                null, // scope not needed for refresh
                null, // username not needed for refresh
                null, // password not needed for refresh
                refreshToken
        );
    }
}
