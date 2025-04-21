package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.NotificationSimulationAuthorizationResponse;
import com.sdk.treezor.model.NotificationSimulationAuthorizations;
import com.sdk.treezor.model.NotificationSimulationChargebackResponse;
import com.sdk.treezor.model.NotificationSimulationChargebacks;
import com.sdk.treezor.model.NotificationSimulationPayinResponse;
import com.sdk.treezor.model.NotificationSimulationPayinsCardPaymentMethod;
import com.sdk.treezor.model.NotificationSimulationRefundResponse;
import com.sdk.treezor.model.NotificationSimulationRefunds;
import com.sdk.treezor.model.SimulateAcquiringPayinRequest;

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
public class AcquiringSimulationApi {
    private ApiClient apiClient;

    public AcquiringSimulationApi() {
        this(new ApiClient());
    }

    @Autowired
    public AcquiringSimulationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Simulate HiPay authorization notification
     * Mocks an HiPay authorization notification provided the minimal set of parameters to generate a refund notification. 
     * <p><b>200</b> - Authorization notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationAuthorizations The notificationSimulationAuthorizations parameter
     * @return NotificationSimulationAuthorizationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec acquiringv2TopupCardsSimulationNotificationAutorizationRequestCreation(NotificationSimulationAuthorizations notificationSimulationAuthorizations) throws WebClientResponseException {
        Object postBody = notificationSimulationAuthorizations;
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

        ParameterizedTypeReference<NotificationSimulationAuthorizationResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationAuthorizationResponse>() {};
        return apiClient.invokeAPI("/simulation/topups/cards/notification/authorizations", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate HiPay authorization notification
     * Mocks an HiPay authorization notification provided the minimal set of parameters to generate a refund notification. 
     * <p><b>200</b> - Authorization notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationAuthorizations The notificationSimulationAuthorizations parameter
     * @return NotificationSimulationAuthorizationResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<NotificationSimulationAuthorizationResponse> acquiringv2TopupCardsSimulationNotificationAutorization(NotificationSimulationAuthorizations notificationSimulationAuthorizations) throws WebClientResponseException {
        ParameterizedTypeReference<NotificationSimulationAuthorizationResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationAuthorizationResponse>() {};
        return acquiringv2TopupCardsSimulationNotificationAutorizationRequestCreation(notificationSimulationAuthorizations).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate HiPay authorization notification
     * Mocks an HiPay authorization notification provided the minimal set of parameters to generate a refund notification. 
     * <p><b>200</b> - Authorization notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationAuthorizations The notificationSimulationAuthorizations parameter
     * @return ResponseEntity&lt;NotificationSimulationAuthorizationResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<NotificationSimulationAuthorizationResponse>> acquiringv2TopupCardsSimulationNotificationAutorizationWithHttpInfo(NotificationSimulationAuthorizations notificationSimulationAuthorizations) throws WebClientResponseException {
        ParameterizedTypeReference<NotificationSimulationAuthorizationResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationAuthorizationResponse>() {};
        return acquiringv2TopupCardsSimulationNotificationAutorizationRequestCreation(notificationSimulationAuthorizations).toEntity(localVarReturnType);
    }

    /**
     * Simulate HiPay authorization notification
     * Mocks an HiPay authorization notification provided the minimal set of parameters to generate a refund notification. 
     * <p><b>200</b> - Authorization notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationAuthorizations The notificationSimulationAuthorizations parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec acquiringv2TopupCardsSimulationNotificationAutorizationWithResponseSpec(NotificationSimulationAuthorizations notificationSimulationAuthorizations) throws WebClientResponseException {
        return acquiringv2TopupCardsSimulationNotificationAutorizationRequestCreation(notificationSimulationAuthorizations);
    }

    /**
     * Simulate HiPay chargeback notification
     * Mocks an HiPay chargeback notification providing the minimal set of parameters to generate a chargeback notification. 
     * <p><b>200</b> - Chargeback notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationChargebacks The notificationSimulationChargebacks parameter
     * @return NotificationSimulationChargebackResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec acquiringv2TopupCardsSimulationNotificationChargebacksRequestCreation(NotificationSimulationChargebacks notificationSimulationChargebacks) throws WebClientResponseException {
        Object postBody = notificationSimulationChargebacks;
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

        ParameterizedTypeReference<NotificationSimulationChargebackResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationChargebackResponse>() {};
        return apiClient.invokeAPI("/simulation/topups/cards/notification/chargebacks", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate HiPay chargeback notification
     * Mocks an HiPay chargeback notification providing the minimal set of parameters to generate a chargeback notification. 
     * <p><b>200</b> - Chargeback notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationChargebacks The notificationSimulationChargebacks parameter
     * @return NotificationSimulationChargebackResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<NotificationSimulationChargebackResponse> acquiringv2TopupCardsSimulationNotificationChargebacks(NotificationSimulationChargebacks notificationSimulationChargebacks) throws WebClientResponseException {
        ParameterizedTypeReference<NotificationSimulationChargebackResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationChargebackResponse>() {};
        return acquiringv2TopupCardsSimulationNotificationChargebacksRequestCreation(notificationSimulationChargebacks).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate HiPay chargeback notification
     * Mocks an HiPay chargeback notification providing the minimal set of parameters to generate a chargeback notification. 
     * <p><b>200</b> - Chargeback notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationChargebacks The notificationSimulationChargebacks parameter
     * @return ResponseEntity&lt;NotificationSimulationChargebackResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<NotificationSimulationChargebackResponse>> acquiringv2TopupCardsSimulationNotificationChargebacksWithHttpInfo(NotificationSimulationChargebacks notificationSimulationChargebacks) throws WebClientResponseException {
        ParameterizedTypeReference<NotificationSimulationChargebackResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationChargebackResponse>() {};
        return acquiringv2TopupCardsSimulationNotificationChargebacksRequestCreation(notificationSimulationChargebacks).toEntity(localVarReturnType);
    }

    /**
     * Simulate HiPay chargeback notification
     * Mocks an HiPay chargeback notification providing the minimal set of parameters to generate a chargeback notification. 
     * <p><b>200</b> - Chargeback notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationChargebacks The notificationSimulationChargebacks parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec acquiringv2TopupCardsSimulationNotificationChargebacksWithResponseSpec(NotificationSimulationChargebacks notificationSimulationChargebacks) throws WebClientResponseException {
        return acquiringv2TopupCardsSimulationNotificationChargebacksRequestCreation(notificationSimulationChargebacks);
    }

    /**
     * Simulate HiPay payin notification
     * Mocks an HiPay payin notification providing the minimal set of parameters to generate a payin notification. 
     * <p><b>200</b> - Payin notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param walletId Identifier of the wallet to be credited
     * @param amount Payin amount
     * @param currency Base currency for this payin  This three-character currency code must comply with ISO-4217
     * @param userId Identifier of the user on behalf of which the simulated payin should be executed 
     * @param status The status code of the simulated notification
     * @param transactionReference The reference of the transaction
     * @param cardPaymentMethod The cardPaymentMethod parameter
     * @param profile HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation. 
     * @return NotificationSimulationPayinResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec acquiringv2TopupCardsSimulationNotificationPayinsRequestCreation(String walletId, Float amount, String currency, String userId, Integer status, String transactionReference, NotificationSimulationPayinsCardPaymentMethod cardPaymentMethod, String profile) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'walletId' is set
        if (walletId == null) {
            throw new WebClientResponseException("Missing the required parameter 'walletId' when calling acquiringv2TopupCardsSimulationNotificationPayins", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'amount' is set
        if (amount == null) {
            throw new WebClientResponseException("Missing the required parameter 'amount' when calling acquiringv2TopupCardsSimulationNotificationPayins", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'currency' is set
        if (currency == null) {
            throw new WebClientResponseException("Missing the required parameter 'currency' when calling acquiringv2TopupCardsSimulationNotificationPayins", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (userId != null)
            formParams.add("userId", userId);
        if (walletId != null)
            formParams.add("walletId", walletId);
        if (amount != null)
            formParams.add("amount", amount);
        if (currency != null)
            formParams.add("currency", currency);
        if (status != null)
            formParams.add("status", status);
        if (transactionReference != null)
            formParams.add("transactionReference", transactionReference);
        if (cardPaymentMethod != null)
            formParams.add("cardPaymentMethod", cardPaymentMethod);
        if (profile != null)
            formParams.add("profile", profile);

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded", "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<NotificationSimulationPayinResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationPayinResponse>() {};
        return apiClient.invokeAPI("/simulation/topups/cards/notification/payins", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate HiPay payin notification
     * Mocks an HiPay payin notification providing the minimal set of parameters to generate a payin notification. 
     * <p><b>200</b> - Payin notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param walletId Identifier of the wallet to be credited
     * @param amount Payin amount
     * @param currency Base currency for this payin  This three-character currency code must comply with ISO-4217
     * @param userId Identifier of the user on behalf of which the simulated payin should be executed 
     * @param status The status code of the simulated notification
     * @param transactionReference The reference of the transaction
     * @param cardPaymentMethod The cardPaymentMethod parameter
     * @param profile HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation. 
     * @return NotificationSimulationPayinResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<NotificationSimulationPayinResponse> acquiringv2TopupCardsSimulationNotificationPayins(String walletId, Float amount, String currency, String userId, Integer status, String transactionReference, NotificationSimulationPayinsCardPaymentMethod cardPaymentMethod, String profile) throws WebClientResponseException {
        ParameterizedTypeReference<NotificationSimulationPayinResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationPayinResponse>() {};
        return acquiringv2TopupCardsSimulationNotificationPayinsRequestCreation(walletId, amount, currency, userId, status, transactionReference, cardPaymentMethod, profile).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate HiPay payin notification
     * Mocks an HiPay payin notification providing the minimal set of parameters to generate a payin notification. 
     * <p><b>200</b> - Payin notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param walletId Identifier of the wallet to be credited
     * @param amount Payin amount
     * @param currency Base currency for this payin  This three-character currency code must comply with ISO-4217
     * @param userId Identifier of the user on behalf of which the simulated payin should be executed 
     * @param status The status code of the simulated notification
     * @param transactionReference The reference of the transaction
     * @param cardPaymentMethod The cardPaymentMethod parameter
     * @param profile HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation. 
     * @return ResponseEntity&lt;NotificationSimulationPayinResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<NotificationSimulationPayinResponse>> acquiringv2TopupCardsSimulationNotificationPayinsWithHttpInfo(String walletId, Float amount, String currency, String userId, Integer status, String transactionReference, NotificationSimulationPayinsCardPaymentMethod cardPaymentMethod, String profile) throws WebClientResponseException {
        ParameterizedTypeReference<NotificationSimulationPayinResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationPayinResponse>() {};
        return acquiringv2TopupCardsSimulationNotificationPayinsRequestCreation(walletId, amount, currency, userId, status, transactionReference, cardPaymentMethod, profile).toEntity(localVarReturnType);
    }

    /**
     * Simulate HiPay payin notification
     * Mocks an HiPay payin notification providing the minimal set of parameters to generate a payin notification. 
     * <p><b>200</b> - Payin notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param walletId Identifier of the wallet to be credited
     * @param amount Payin amount
     * @param currency Base currency for this payin  This three-character currency code must comply with ISO-4217
     * @param userId Identifier of the user on behalf of which the simulated payin should be executed 
     * @param status The status code of the simulated notification
     * @param transactionReference The reference of the transaction
     * @param cardPaymentMethod The cardPaymentMethod parameter
     * @param profile HiPay merchant identifier (mid) to be used for the operation. Required if the client has multiple merchant identifiers associated. If only one mid is associated, then that one is used for the operation. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec acquiringv2TopupCardsSimulationNotificationPayinsWithResponseSpec(String walletId, Float amount, String currency, String userId, Integer status, String transactionReference, NotificationSimulationPayinsCardPaymentMethod cardPaymentMethod, String profile) throws WebClientResponseException {
        return acquiringv2TopupCardsSimulationNotificationPayinsRequestCreation(walletId, amount, currency, userId, status, transactionReference, cardPaymentMethod, profile);
    }

    /**
     * Simulate HiPay refund notification
     * Mocks an HiPay refund notification providing the minimal set of parameters to generate a refund notification. 
     * <p><b>200</b> - Refund notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationRefunds The notificationSimulationRefunds parameter
     * @return NotificationSimulationRefundResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec acquiringv2TopupCardsSimulationNotificationRefundsRequestCreation(NotificationSimulationRefunds notificationSimulationRefunds) throws WebClientResponseException {
        Object postBody = notificationSimulationRefunds;
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

        ParameterizedTypeReference<NotificationSimulationRefundResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationRefundResponse>() {};
        return apiClient.invokeAPI("/simulation/topups/cards/notification/refunds", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate HiPay refund notification
     * Mocks an HiPay refund notification providing the minimal set of parameters to generate a refund notification. 
     * <p><b>200</b> - Refund notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationRefunds The notificationSimulationRefunds parameter
     * @return NotificationSimulationRefundResponse
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<NotificationSimulationRefundResponse> acquiringv2TopupCardsSimulationNotificationRefunds(NotificationSimulationRefunds notificationSimulationRefunds) throws WebClientResponseException {
        ParameterizedTypeReference<NotificationSimulationRefundResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationRefundResponse>() {};
        return acquiringv2TopupCardsSimulationNotificationRefundsRequestCreation(notificationSimulationRefunds).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate HiPay refund notification
     * Mocks an HiPay refund notification providing the minimal set of parameters to generate a refund notification. 
     * <p><b>200</b> - Refund notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationRefunds The notificationSimulationRefunds parameter
     * @return ResponseEntity&lt;NotificationSimulationRefundResponse&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<NotificationSimulationRefundResponse>> acquiringv2TopupCardsSimulationNotificationRefundsWithHttpInfo(NotificationSimulationRefunds notificationSimulationRefunds) throws WebClientResponseException {
        ParameterizedTypeReference<NotificationSimulationRefundResponse> localVarReturnType = new ParameterizedTypeReference<NotificationSimulationRefundResponse>() {};
        return acquiringv2TopupCardsSimulationNotificationRefundsRequestCreation(notificationSimulationRefunds).toEntity(localVarReturnType);
    }

    /**
     * Simulate HiPay refund notification
     * Mocks an HiPay refund notification providing the minimal set of parameters to generate a refund notification. 
     * <p><b>200</b> - Refund notification successfully created
     * <p><b>400</b> - Bad Request
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param notificationSimulationRefunds The notificationSimulationRefunds parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec acquiringv2TopupCardsSimulationNotificationRefundsWithResponseSpec(NotificationSimulationRefunds notificationSimulationRefunds) throws WebClientResponseException {
        return acquiringv2TopupCardsSimulationNotificationRefundsRequestCreation(notificationSimulationRefunds);
    }

    /**
     * Simulate Acquiring Payin
     * Simulate operations resulting from the card acquisition feature.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateAcquiringPayinRequest The simulateAcquiringPayinRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec simulateAcquiringPayinRequestCreation(SimulateAcquiringPayinRequest simulateAcquiringPayinRequest) throws WebClientResponseException {
        Object postBody = simulateAcquiringPayinRequest;
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

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/simulation/acquiring/payin", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Simulate Acquiring Payin
     * Simulate operations resulting from the card acquisition feature.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateAcquiringPayinRequest The simulateAcquiringPayinRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> simulateAcquiringPayin(SimulateAcquiringPayinRequest simulateAcquiringPayinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return simulateAcquiringPayinRequestCreation(simulateAcquiringPayinRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Simulate Acquiring Payin
     * Simulate operations resulting from the card acquisition feature.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateAcquiringPayinRequest The simulateAcquiringPayinRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> simulateAcquiringPayinWithHttpInfo(SimulateAcquiringPayinRequest simulateAcquiringPayinRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return simulateAcquiringPayinRequestCreation(simulateAcquiringPayinRequest).toEntity(localVarReturnType);
    }

    /**
     * Simulate Acquiring Payin
     * Simulate operations resulting from the card acquisition feature.
     * <p><b>204</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param simulateAcquiringPayinRequest The simulateAcquiringPayinRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec simulateAcquiringPayinWithResponseSpec(SimulateAcquiringPayinRequest simulateAcquiringPayinRequest) throws WebClientResponseException {
        return simulateAcquiringPayinRequestCreation(simulateAcquiringPayinRequest);
    }
}
