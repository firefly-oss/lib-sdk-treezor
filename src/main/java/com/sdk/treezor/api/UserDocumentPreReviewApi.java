package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetKYCDocuments200ResponseInner;
import com.sdk.treezor.model.GetPreSignedKycForm200Response;
import com.sdk.treezor.model.GetPreSignedKycFormRequest;
import com.sdk.treezor.model.GetPresignedUrlDocument200Response;
import java.util.UUID;
import com.sdk.treezor.model.UpdateDocument200Response;
import com.sdk.treezor.model.UpdateDocumentRequest;

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
public class UserDocumentPreReviewApi {
    private ApiClient apiClient;

    public UserDocumentPreReviewApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserDocumentPreReviewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Delete Pre-review Document
     * Delete a pre-review document.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @return UpdateDocument200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteKYCDocumentcumentRequestCreation(UUID documentId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'documentId' when calling deleteKYCDocumentcument", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("documentId", documentId);

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

        ParameterizedTypeReference<UpdateDocument200Response> localVarReturnType = new ParameterizedTypeReference<UpdateDocument200Response>() {};
        return apiClient.invokeAPI("/core-connect/kyc/documents/{documentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Pre-review Document
     * Delete a pre-review document.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @return UpdateDocument200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateDocument200Response> deleteKYCDocumentcument(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocument200Response> localVarReturnType = new ParameterizedTypeReference<UpdateDocument200Response>() {};
        return deleteKYCDocumentcumentRequestCreation(documentId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Pre-review Document
     * Delete a pre-review document.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @return ResponseEntity&lt;UpdateDocument200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UpdateDocument200Response>> deleteKYCDocumentcumentWithHttpInfo(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocument200Response> localVarReturnType = new ParameterizedTypeReference<UpdateDocument200Response>() {};
        return deleteKYCDocumentcumentRequestCreation(documentId).toEntity(localVarReturnType);
    }

    /**
     * Delete Pre-review Document
     * Delete a pre-review document.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteKYCDocumentcumentWithResponseSpec(UUID documentId) throws WebClientResponseException {
        return deleteKYCDocumentcumentRequestCreation(documentId);
    }

    /**
     * Search Pre-review Documents
     * Retrieve all pre-review documents for given user
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @return List&lt;GetKYCDocuments200ResponseInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getKYCDocumentsRequestCreation(Integer userId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling getKYCDocuments", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

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

        ParameterizedTypeReference<GetKYCDocuments200ResponseInner> localVarReturnType = new ParameterizedTypeReference<GetKYCDocuments200ResponseInner>() {};
        return apiClient.invokeAPI("/core-connect/users/{userId}/kyc/document", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Pre-review Documents
     * Retrieve all pre-review documents for given user
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @return List&lt;GetKYCDocuments200ResponseInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<GetKYCDocuments200ResponseInner> getKYCDocuments(Integer userId) throws WebClientResponseException {
        ParameterizedTypeReference<GetKYCDocuments200ResponseInner> localVarReturnType = new ParameterizedTypeReference<GetKYCDocuments200ResponseInner>() {};
        return getKYCDocumentsRequestCreation(userId).bodyToFlux(localVarReturnType);
    }

    /**
     * Search Pre-review Documents
     * Retrieve all pre-review documents for given user
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @return ResponseEntity&lt;List&lt;GetKYCDocuments200ResponseInner&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<GetKYCDocuments200ResponseInner>>> getKYCDocumentsWithHttpInfo(Integer userId) throws WebClientResponseException {
        ParameterizedTypeReference<GetKYCDocuments200ResponseInner> localVarReturnType = new ParameterizedTypeReference<GetKYCDocuments200ResponseInner>() {};
        return getKYCDocumentsRequestCreation(userId).toEntityList(localVarReturnType);
    }

    /**
     * Search Pre-review Documents
     * Retrieve all pre-review documents for given user
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getKYCDocumentsWithResponseSpec(Integer userId) throws WebClientResponseException {
        return getKYCDocumentsRequestCreation(userId);
    }

    /**
     * Search Documents to pre-review
     * Retrieve all pre-review documents to review. This endpoint is for [Onboarded Users](/api-reference/api-endpoints.html#tag/User%20Onboarding) only. 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @return List&lt;UpdateDocument200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getKYCDocumentsToReviewRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<UpdateDocument200Response> localVarReturnType = new ParameterizedTypeReference<UpdateDocument200Response>() {};
        return apiClient.invokeAPI("/core-connect/kyc/documents/need-review", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Documents to pre-review
     * Retrieve all pre-review documents to review. This endpoint is for [Onboarded Users](/api-reference/api-endpoints.html#tag/User%20Onboarding) only. 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @return List&lt;UpdateDocument200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<UpdateDocument200Response> getKYCDocumentsToReview() throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocument200Response> localVarReturnType = new ParameterizedTypeReference<UpdateDocument200Response>() {};
        return getKYCDocumentsToReviewRequestCreation().bodyToFlux(localVarReturnType);
    }

    /**
     * Search Documents to pre-review
     * Retrieve all pre-review documents to review. This endpoint is for [Onboarded Users](/api-reference/api-endpoints.html#tag/User%20Onboarding) only. 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @return ResponseEntity&lt;List&lt;UpdateDocument200Response&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<UpdateDocument200Response>>> getKYCDocumentsToReviewWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocument200Response> localVarReturnType = new ParameterizedTypeReference<UpdateDocument200Response>() {};
        return getKYCDocumentsToReviewRequestCreation().toEntityList(localVarReturnType);
    }

    /**
     * Search Documents to pre-review
     * Retrieve all pre-review documents to review. This endpoint is for [Onboarded Users](/api-reference/api-endpoints.html#tag/User%20Onboarding) only. 
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getKYCDocumentsToReviewWithResponseSpec() throws WebClientResponseException {
        return getKYCDocumentsToReviewRequestCreation();
    }

    /**
     * Create Upload Document Form
     * Generate a pre-signed form to upload documents for pre-review. Expires after 5 minutes.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param getPreSignedKycFormRequest The getPreSignedKycFormRequest parameter
     * @return GetPreSignedKycForm200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPreSignedKycFormRequestCreation(String userId, GetPreSignedKycFormRequest getPreSignedKycFormRequest) throws WebClientResponseException {
        Object postBody = getPreSignedKycFormRequest;
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new WebClientResponseException("Missing the required parameter 'userId' when calling getPreSignedKycForm", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("userId", userId);

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

        ParameterizedTypeReference<GetPreSignedKycForm200Response> localVarReturnType = new ParameterizedTypeReference<GetPreSignedKycForm200Response>() {};
        return apiClient.invokeAPI("/core-connect/users/{userId}/kyc/document", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Upload Document Form
     * Generate a pre-signed form to upload documents for pre-review. Expires after 5 minutes.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param getPreSignedKycFormRequest The getPreSignedKycFormRequest parameter
     * @return GetPreSignedKycForm200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPreSignedKycForm200Response> getPreSignedKycForm(String userId, GetPreSignedKycFormRequest getPreSignedKycFormRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetPreSignedKycForm200Response> localVarReturnType = new ParameterizedTypeReference<GetPreSignedKycForm200Response>() {};
        return getPreSignedKycFormRequestCreation(userId, getPreSignedKycFormRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Upload Document Form
     * Generate a pre-signed form to upload documents for pre-review. Expires after 5 minutes.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param getPreSignedKycFormRequest The getPreSignedKycFormRequest parameter
     * @return ResponseEntity&lt;GetPreSignedKycForm200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetPreSignedKycForm200Response>> getPreSignedKycFormWithHttpInfo(String userId, GetPreSignedKycFormRequest getPreSignedKycFormRequest) throws WebClientResponseException {
        ParameterizedTypeReference<GetPreSignedKycForm200Response> localVarReturnType = new ParameterizedTypeReference<GetPreSignedKycForm200Response>() {};
        return getPreSignedKycFormRequestCreation(userId, getPreSignedKycFormRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Upload Document Form
     * Generate a pre-signed form to upload documents for pre-review. Expires after 5 minutes.
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param userId The unique identifier of the User.
     * @param getPreSignedKycFormRequest The getPreSignedKycFormRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPreSignedKycFormWithResponseSpec(String userId, GetPreSignedKycFormRequest getPreSignedKycFormRequest) throws WebClientResponseException {
        return getPreSignedKycFormRequestCreation(userId, getPreSignedKycFormRequest);
    }

    /**
     * Get Download URL
     * Retrieve the pre-signed URL to download the pre-review document.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @return GetPresignedUrlDocument200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getPresignedUrlDocumentRequestCreation(UUID documentId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'documentId' when calling getPresignedUrlDocument", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("documentId", documentId);

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

        ParameterizedTypeReference<GetPresignedUrlDocument200Response> localVarReturnType = new ParameterizedTypeReference<GetPresignedUrlDocument200Response>() {};
        return apiClient.invokeAPI("/core-connect/kyc/documents/{documentId}/preview", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Download URL
     * Retrieve the pre-signed URL to download the pre-review document.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @return GetPresignedUrlDocument200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetPresignedUrlDocument200Response> getPresignedUrlDocument(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<GetPresignedUrlDocument200Response> localVarReturnType = new ParameterizedTypeReference<GetPresignedUrlDocument200Response>() {};
        return getPresignedUrlDocumentRequestCreation(documentId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Download URL
     * Retrieve the pre-signed URL to download the pre-review document.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @return ResponseEntity&lt;GetPresignedUrlDocument200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetPresignedUrlDocument200Response>> getPresignedUrlDocumentWithHttpInfo(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<GetPresignedUrlDocument200Response> localVarReturnType = new ParameterizedTypeReference<GetPresignedUrlDocument200Response>() {};
        return getPresignedUrlDocumentRequestCreation(documentId).toEntity(localVarReturnType);
    }

    /**
     * Get Download URL
     * Retrieve the pre-signed URL to download the pre-review document.
     * <p><b>200</b> - OK
     * <p><b>403</b> - Forbidden
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getPresignedUrlDocumentWithResponseSpec(UUID documentId) throws WebClientResponseException {
        return getPresignedUrlDocumentRequestCreation(documentId);
    }

    /**
     * Pre-review Document
     * Update the pre-review status and comment of the document.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @param updateDocumentRequest The updateDocumentRequest parameter
     * @return UpdateDocument200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec updateDocumentRequestCreation(UUID documentId, UpdateDocumentRequest updateDocumentRequest) throws WebClientResponseException {
        Object postBody = updateDocumentRequest;
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'documentId' when calling updateDocument", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("documentId", documentId);

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

        ParameterizedTypeReference<UpdateDocument200Response> localVarReturnType = new ParameterizedTypeReference<UpdateDocument200Response>() {};
        return apiClient.invokeAPI("/core-connect/kyc/documents/{documentId}/status", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Pre-review Document
     * Update the pre-review status and comment of the document.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @param updateDocumentRequest The updateDocumentRequest parameter
     * @return UpdateDocument200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<UpdateDocument200Response> updateDocument(UUID documentId, UpdateDocumentRequest updateDocumentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocument200Response> localVarReturnType = new ParameterizedTypeReference<UpdateDocument200Response>() {};
        return updateDocumentRequestCreation(documentId, updateDocumentRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Pre-review Document
     * Update the pre-review status and comment of the document.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @param updateDocumentRequest The updateDocumentRequest parameter
     * @return ResponseEntity&lt;UpdateDocument200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<UpdateDocument200Response>> updateDocumentWithHttpInfo(UUID documentId, UpdateDocumentRequest updateDocumentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<UpdateDocument200Response> localVarReturnType = new ParameterizedTypeReference<UpdateDocument200Response>() {};
        return updateDocumentRequestCreation(documentId, updateDocumentRequest).toEntity(localVarReturnType);
    }

    /**
     * Pre-review Document
     * Update the pre-review status and comment of the document.
     * <p><b>200</b> - OK
     * <p><b>404</b> - Not Found
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document (UUID).
     * @param updateDocumentRequest The updateDocumentRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec updateDocumentWithResponseSpec(UUID documentId, UpdateDocumentRequest updateDocumentRequest) throws WebClientResponseException {
        return updateDocumentRequestCreation(documentId, updateDocumentRequest);
    }
}
