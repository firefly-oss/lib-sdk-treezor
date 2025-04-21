package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetComputedWalletAccountDetail200Response;
import com.sdk.treezor.model.GetRawWalletAccountDetail200Response;

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
public class AccountDetailsApi {
    private ApiClient apiClient;

    public AccountDetailsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccountDetailsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get PDF Account Details
     * Retrieve a Wallet RIB and IBAN in PDF format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @return GetComputedWalletAccountDetail200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getComputedWalletAccountDetailRequestCreation(String walletId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling getComputedWalletAccountDetail", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("walletId", walletId);

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

        ParameterizedTypeReference<GetComputedWalletAccountDetail200Response> localVarReturnType = new ParameterizedTypeReference<GetComputedWalletAccountDetail200Response>() {};
        return apiClient.invokeAPI("/core-connect/account-details/{walletId}/computed", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get PDF Account Details
     * Retrieve a Wallet RIB and IBAN in PDF format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @return GetComputedWalletAccountDetail200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetComputedWalletAccountDetail200Response> getComputedWalletAccountDetail(String walletId) throws WebClientResponseException {
        ParameterizedTypeReference<GetComputedWalletAccountDetail200Response> localVarReturnType = new ParameterizedTypeReference<GetComputedWalletAccountDetail200Response>() {};
        return getComputedWalletAccountDetailRequestCreation(walletId).bodyToMono(localVarReturnType);
    }

    /**
     * Get PDF Account Details
     * Retrieve a Wallet RIB and IBAN in PDF format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @return ResponseEntity&lt;GetComputedWalletAccountDetail200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetComputedWalletAccountDetail200Response>> getComputedWalletAccountDetailWithHttpInfo(String walletId) throws WebClientResponseException {
        ParameterizedTypeReference<GetComputedWalletAccountDetail200Response> localVarReturnType = new ParameterizedTypeReference<GetComputedWalletAccountDetail200Response>() {};
        return getComputedWalletAccountDetailRequestCreation(walletId).toEntity(localVarReturnType);
    }

    /**
     * Get PDF Account Details
     * Retrieve a Wallet RIB and IBAN in PDF format.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getComputedWalletAccountDetailWithResponseSpec(String walletId) throws WebClientResponseException {
        return getComputedWalletAccountDetailRequestCreation(walletId);
    }

    /**
     * Get JSON Account Details
     * Retrieve the necessary data (JSON) to generate the Account Details of a given Wallet.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @return GetRawWalletAccountDetail200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getRawWalletAccountDetailRequestCreation(String walletId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling getRawWalletAccountDetail", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("walletId", walletId);

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

        ParameterizedTypeReference<GetRawWalletAccountDetail200Response> localVarReturnType = new ParameterizedTypeReference<GetRawWalletAccountDetail200Response>() {};
        return apiClient.invokeAPI("/core-connect/account-details/{walletId}/raw", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get JSON Account Details
     * Retrieve the necessary data (JSON) to generate the Account Details of a given Wallet.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @return GetRawWalletAccountDetail200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetRawWalletAccountDetail200Response> getRawWalletAccountDetail(String walletId) throws WebClientResponseException {
        ParameterizedTypeReference<GetRawWalletAccountDetail200Response> localVarReturnType = new ParameterizedTypeReference<GetRawWalletAccountDetail200Response>() {};
        return getRawWalletAccountDetailRequestCreation(walletId).bodyToMono(localVarReturnType);
    }

    /**
     * Get JSON Account Details
     * Retrieve the necessary data (JSON) to generate the Account Details of a given Wallet.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @return ResponseEntity&lt;GetRawWalletAccountDetail200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetRawWalletAccountDetail200Response>> getRawWalletAccountDetailWithHttpInfo(String walletId) throws WebClientResponseException {
        ParameterizedTypeReference<GetRawWalletAccountDetail200Response> localVarReturnType = new ParameterizedTypeReference<GetRawWalletAccountDetail200Response>() {};
        return getRawWalletAccountDetailRequestCreation(walletId).toEntity(localVarReturnType);
    }

    /**
     * Get JSON Account Details
     * Retrieve the necessary data (JSON) to generate the Account Details of a given Wallet.  This endpoint requires per-session [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param walletId The unique identifier of the Wallet.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getRawWalletAccountDetailWithResponseSpec(String walletId) throws WebClientResponseException {
        return getRawWalletAccountDetailRequestCreation(walletId);
    }
}
