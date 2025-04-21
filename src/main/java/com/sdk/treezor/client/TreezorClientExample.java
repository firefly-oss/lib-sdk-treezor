package com.sdk.treezor.client;

import com.sdk.treezor.model.PostAuth200Response;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;

/**
 * Example usage of the TreezorClient for authentication.
 * This class demonstrates how to use the TreezorClient to authenticate with the Treezor API.
 */
public class TreezorClientExample {

    /**
     * Example of how to authenticate with the Treezor API using the TreezorClient.
     */
    public static void main(String[] args) {
        // Create a client with a specific base URL
        TreezorClient client = TreezorClientFactory.createClient("https://signatureventures.sandbox.treezor.co");

        // Authentication parameters
        String clientId = "a841d127-a2b7-4772-b182-223a7002afc0";
        String clientSecret = "M0TugFaOVy3MvIOO0qZxg";
        String username = null;
        String password = null;
        String scope = null; // Optional scope

        // Authenticate with the API
        Mono<ResponseEntity<PostAuth200Response>> authResponse = client.authenticate(
                clientId,
                clientSecret,
                username,
                password,
                scope
        );

        // Subscribe to the response
        authResponse.subscribe(
                response -> {
                    // Handle successful response
                    System.out.println("Authentication successful!");
                    PostAuth200Response authData = response.getBody();
                    if (authData != null) {
                        System.out.println("Access Token: " + authData.getAccessToken());
                        System.out.println("Token Type: " + authData.getTokenType());
                        System.out.println("Expires In: " + authData.getExpiresIn() + " seconds");
                        System.out.println("Refresh Token: " + authData.getRefreshToken());

                        // Store the tokens for future use
                        // ...

                        // Example of refreshing the token
                        refreshTokenExample(client, clientId, clientSecret, authData.getRefreshToken());
                    }
                },
                error -> {
                    // Handle error
                    System.err.println("Authentication failed: " + error.getMessage());
                    error.printStackTrace();
                }
        );

        // Block the main thread to wait for the response (only for demonstration purposes)
        // In a real application, you would typically use the reactive programming model
        // and not block the thread
        System.out.println("ACCESS TOKEN RETRIEVED: " + authResponse.block().getBody().getAccessToken());
        authResponse.block();
    }

    /**
     * Example of how to refresh an access token using the TreezorClient.
     */
    private static void refreshTokenExample(TreezorClient client, String clientId, String clientSecret, String refreshToken) {
        System.out.println("\nRefreshing token...");

        // Refresh the token
        Mono<ResponseEntity<PostAuth200Response>> refreshResponse = client.refreshToken(
                clientId,
                clientSecret,
                refreshToken
        );

        // Subscribe to the response
        refreshResponse.subscribe(
                response -> {
                    // Handle successful response
                    System.out.println("Token refresh successful!");
                    PostAuth200Response refreshData = response.getBody();
                    if (refreshData != null) {
                        System.out.println("New Access Token: " + refreshData.getAccessToken());
                        System.out.println("New Token Type: " + refreshData.getTokenType());
                        System.out.println("New Expires In: " + refreshData.getExpiresIn() + " seconds");
                        System.out.println("New Refresh Token: " + refreshData.getRefreshToken());

                        // Store the new tokens for future use
                        // ...
                    }
                },
                error -> {
                    // Handle error
                    System.err.println("Token refresh failed: " + error.getMessage());
                    error.printStackTrace();
                }
        );

        // Block the main thread to wait for the response (only for demonstration purposes)
        refreshResponse.block();
    }
}
