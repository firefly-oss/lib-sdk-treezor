package com.sdk.treezor.client;

import com.sdk.treezor.ApiClient;
import com.sdk.treezor.Configuration;

/**
 * Factory class for creating TreezorClient instances.
 * This class provides static methods to create pre-configured clients.
 */
public class TreezorClientFactory {

    /**
     * Creates a new TreezorClient with default configuration.
     *
     * @return a new TreezorClient
     */
    public static TreezorClient createDefaultClient() {
        return new TreezorClient();
    }

    /**
     * Creates a new TreezorClient with the specified base URL.
     *
     * @param baseUrl the base URL for the API
     * @return a new TreezorClient
     */
    public static TreezorClient createClient(String baseUrl) {
        return new TreezorClient(baseUrl);
    }

    /**
     * Creates a new TreezorClient with the specified ApiClient.
     *
     * @param apiClient the ApiClient to use
     * @return a new TreezorClient
     */
    public static TreezorClient createClient(ApiClient apiClient) {
        return new TreezorClient(apiClient);
    }

    /**
     * Creates a new TreezorClient with a custom configuration.
     *
     * @param baseUrl the base URL for the API
     * @param timeout the timeout in milliseconds
     * @return a new TreezorClient
     */
    public static TreezorClient createClientWithTimeout(String baseUrl, int timeout) {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        apiClient.setBasePath(baseUrl);
        // Set timeout if the ApiClient supports it
        // This would need to be implemented based on the actual ApiClient implementation
        return new TreezorClient(apiClient);
    }
}