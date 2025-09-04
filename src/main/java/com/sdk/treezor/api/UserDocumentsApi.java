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

import com.sdk.treezor.model.CreateDocumentsRequest;
import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.DocumentObject;
import com.sdk.treezor.model.GetDocumentDownloadUrl200Response;
import java.time.OffsetDateTime;
import com.sdk.treezor.model.PutDocumentRequest;

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
import java.util.UUID;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-04-14T09:49:28.273669400+02:00[Europe/Paris]", comments = "Generator version: 7.12.0")
public class UserDocumentsApi {
    private ApiClient apiClient;

    public UserDocumentsApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserDocumentsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Create Document
     * Create a Document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param createDocumentsRequest The createDocumentsRequest parameter
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createDocumentsRequestCreation(CreateDocumentsRequest createDocumentsRequest) throws WebClientResponseException {
        Object postBody = createDocumentsRequest;
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

        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return apiClient.invokeAPI("/v1/documents", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Document
     * Create a Document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param createDocumentsRequest The createDocumentsRequest parameter
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentObject> createDocuments(CreateDocumentsRequest createDocumentsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return createDocumentsRequestCreation(createDocumentsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Document
     * Create a Document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param createDocumentsRequest The createDocumentsRequest parameter
     * @return ResponseEntity&lt;DocumentObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DocumentObject>> createDocumentsWithHttpInfo(CreateDocumentsRequest createDocumentsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return createDocumentsRequestCreation(createDocumentsRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Document
     * Create a Document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param createDocumentsRequest The createDocumentsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec createDocumentsWithResponseSpec(CreateDocumentsRequest createDocumentsRequest) throws WebClientResponseException {
        return createDocumentsRequestCreation(createDocumentsRequest);
    }

    /**
     * Delete Document
     * Remove a document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteDocumentRequestCreation(UUID documentId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'documentId' when calling deleteDocument", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return apiClient.invokeAPI("/v1/documents/{documentId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Document
     * Remove a document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentObject> deleteDocument(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return deleteDocumentRequestCreation(documentId).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Document
     * Remove a document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return ResponseEntity&lt;DocumentObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DocumentObject>> deleteDocumentWithHttpInfo(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return deleteDocumentRequestCreation(documentId).toEntity(localVarReturnType);
    }

    /**
     * Delete Document
     * Remove a document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteDocumentWithResponseSpec(UUID documentId) throws WebClientResponseException {
        return deleteDocumentRequestCreation(documentId);
    }

    /**
     * Get Document
     * Retrieve a Document using its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDocumentRequestCreation(UUID documentId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'documentId' when calling getDocument", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return apiClient.invokeAPI("/v1/documents/{documentId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Document
     * Retrieve a Document using its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentObject> getDocument(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return getDocumentRequestCreation(documentId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Document
     * Retrieve a Document using its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return ResponseEntity&lt;DocumentObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DocumentObject>> getDocumentWithHttpInfo(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return getDocumentRequestCreation(documentId).toEntity(localVarReturnType);
    }

    /**
     * Get Document
     * Retrieve a Document using its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDocumentWithResponseSpec(UUID documentId) throws WebClientResponseException {
        return getDocumentRequestCreation(documentId);
    }

    /**
     * Get Document Download URL
     * Retrieve a Document download URL. You may read [the dedicated documentation for this feature](/guide/user-verification/documents.html#download-documents). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return GetDocumentDownloadUrl200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDocumentDownloadUrlRequestCreation(UUID documentId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'documentId' when calling getDocumentDownloadUrl", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetDocumentDownloadUrl200Response> localVarReturnType = new ParameterizedTypeReference<GetDocumentDownloadUrl200Response>() {};
        return apiClient.invokeAPI("/v1/documents/{documentId}/download", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Document Download URL
     * Retrieve a Document download URL. You may read [the dedicated documentation for this feature](/guide/user-verification/documents.html#download-documents). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return GetDocumentDownloadUrl200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetDocumentDownloadUrl200Response> getDocumentDownloadUrl(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocumentDownloadUrl200Response> localVarReturnType = new ParameterizedTypeReference<GetDocumentDownloadUrl200Response>() {};
        return getDocumentDownloadUrlRequestCreation(documentId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Document Download URL
     * Retrieve a Document download URL. You may read [the dedicated documentation for this feature](/guide/user-verification/documents.html#download-documents). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return ResponseEntity&lt;GetDocumentDownloadUrl200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetDocumentDownloadUrl200Response>> getDocumentDownloadUrlWithHttpInfo(UUID documentId) throws WebClientResponseException {
        ParameterizedTypeReference<GetDocumentDownloadUrl200Response> localVarReturnType = new ParameterizedTypeReference<GetDocumentDownloadUrl200Response>() {};
        return getDocumentDownloadUrlRequestCreation(documentId).toEntity(localVarReturnType);
    }

    /**
     * Get Document Download URL
     * Retrieve a Document download URL. You may read [the dedicated documentation for this feature](/guide/user-verification/documents.html#download-documents). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDocumentDownloadUrlWithResponseSpec(UUID documentId) throws WebClientResponseException {
        return getDocumentDownloadUrlRequestCreation(documentId);
    }

    /**
     * Search Documents
     * Retrieve Documents based on search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param documentId The unique identifier of the Document.
     * @param documentTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param documentStatus The status of the document. See [Status](/guide/user-verification/documents.html#status-documentstatus) for more information. 
     * @param documentTypeId The id of the type of Document.   See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
     * @param documentType The type of the Document.  See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
     * @param userId The unique identifier of the user the Document belongs to.
     * @param userEmail The email of the user the Document belongs to.
     * @param fileName The name of the Document.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getDocumentsRequestCreation(String accessTag, Integer documentId, String documentTag, String documentStatus, Integer documentTypeId, String documentType, Integer userId, String userEmail, String fileName, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "documentId", documentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "documentTag", documentTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "documentStatus", documentStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "documentTypeId", documentTypeId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "documentType", documentType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userEmail", userEmail));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "fileName", fileName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateFrom", createdDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdDateTo", createdDateTo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateFrom", updatedDateFrom));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "updatedDateTo", updatedDateTo));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return apiClient.invokeAPI("/v1/documents", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Documents
     * Retrieve Documents based on search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param documentId The unique identifier of the Document.
     * @param documentTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param documentStatus The status of the document. See [Status](/guide/user-verification/documents.html#status-documentstatus) for more information. 
     * @param documentTypeId The id of the type of Document.   See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
     * @param documentType The type of the Document.  See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
     * @param userId The unique identifier of the user the Document belongs to.
     * @param userEmail The email of the user the Document belongs to.
     * @param fileName The name of the Document.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentObject> getDocuments(String accessTag, Integer documentId, String documentTag, String documentStatus, Integer documentTypeId, String documentType, Integer userId, String userEmail, String fileName, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return getDocumentsRequestCreation(accessTag, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userEmail, fileName, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).bodyToMono(localVarReturnType);
    }

    /**
     * Search Documents
     * Retrieve Documents based on search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param documentId The unique identifier of the Document.
     * @param documentTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param documentStatus The status of the document. See [Status](/guide/user-verification/documents.html#status-documentstatus) for more information. 
     * @param documentTypeId The id of the type of Document.   See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
     * @param documentType The type of the Document.  See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
     * @param userId The unique identifier of the user the Document belongs to.
     * @param userEmail The email of the user the Document belongs to.
     * @param fileName The name of the Document.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return ResponseEntity&lt;DocumentObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DocumentObject>> getDocumentsWithHttpInfo(String accessTag, Integer documentId, String documentTag, String documentStatus, Integer documentTypeId, String documentType, Integer userId, String userEmail, String fileName, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return getDocumentsRequestCreation(accessTag, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userEmail, fileName, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo).toEntity(localVarReturnType);
    }

    /**
     * Search Documents
     * Retrieve Documents based on search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param documentId The unique identifier of the Document.
     * @param documentTag Custom attribute to use as you see fit. Learn more in the [Object tags](/guide/api-basics/objects-tags.html#objects-tags) article.  Format: hc characters and &#x60;/&#x60; &#x60;!&#x60; &#x60;-&#x60; &#x60;_&#x60; &#x60;.&#x60; &#x60;*&#x60; &#x60;&#39;&#x60; &#x60;(&#x60; &#x60;)&#x60; 
     * @param documentStatus The status of the document. See [Status](/guide/user-verification/documents.html#status-documentstatus) for more information. 
     * @param documentTypeId The id of the type of Document.   See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
     * @param documentType The type of the Document.  See [Document types](/guide/user-verification/documents.html#types-documenttypeid) for the list of values. 
     * @param userId The unique identifier of the user the Document belongs to.
     * @param userEmail The email of the user the Document belongs to.
     * @param fileName The name of the Document.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @param createdDateFrom The creation date from which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param createdDateTo The creation date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateFrom The modification date from which you want to filter the request result.   Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @param updatedDateTo The modification date up to which you want to filter the request result.  Format: &#x60;YYYY-MM-DD HH:mm:ss&#x60;.  
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getDocumentsWithResponseSpec(String accessTag, Integer documentId, String documentTag, String documentStatus, Integer documentTypeId, String documentType, Integer userId, String userEmail, String fileName, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder, OffsetDateTime createdDateFrom, OffsetDateTime createdDateTo, OffsetDateTime updatedDateFrom, OffsetDateTime updatedDateTo) throws WebClientResponseException {
        return getDocumentsRequestCreation(accessTag, documentId, documentTag, documentStatus, documentTypeId, documentType, userId, userEmail, fileName, pageNumber, pageCount, sortBy, sortOrder, createdDateFrom, createdDateTo, updatedDateFrom, updatedDateTo);
    }

    /**
     * Update Document
     * Change the &#x60;name&#x60; of a Document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @param putDocumentRequest The putDocumentRequest parameter
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putDocumentRequestCreation(UUID documentId, PutDocumentRequest putDocumentRequest) throws WebClientResponseException {
        Object postBody = putDocumentRequest;
        // verify the required parameter 'documentId' is set
        if (documentId == null) {
            throw new WebClientResponseException("Missing the required parameter 'documentId' when calling putDocument", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return apiClient.invokeAPI("/v1/documents/{documentId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Document
     * Change the &#x60;name&#x60; of a Document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @param putDocumentRequest The putDocumentRequest parameter
     * @return DocumentObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DocumentObject> putDocument(UUID documentId, PutDocumentRequest putDocumentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return putDocumentRequestCreation(documentId, putDocumentRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Document
     * Change the &#x60;name&#x60; of a Document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @param putDocumentRequest The putDocumentRequest parameter
     * @return ResponseEntity&lt;DocumentObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DocumentObject>> putDocumentWithHttpInfo(UUID documentId, PutDocumentRequest putDocumentRequest) throws WebClientResponseException {
        ParameterizedTypeReference<DocumentObject> localVarReturnType = new ParameterizedTypeReference<DocumentObject>() {};
        return putDocumentRequestCreation(documentId, putDocumentRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Document
     * Change the &#x60;name&#x60; of a Document.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param documentId The unique identifier of the Document.
     * @param putDocumentRequest The putDocumentRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putDocumentWithResponseSpec(UUID documentId, PutDocumentRequest putDocumentRequest) throws WebClientResponseException {
        return putDocumentRequestCreation(documentId, putDocumentRequest);
    }
}
