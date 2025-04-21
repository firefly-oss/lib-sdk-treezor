package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetAllMidMetadataBYyGroup200Response;
import com.sdk.treezor.model.PostMidMetadata201Response;
import com.sdk.treezor.model.PutMidMetadataRequestInner;

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
public class MerchantIdMetadataApi {
    private ApiClient apiClient;

    public MerchantIdMetadataApi() {
        this(new ApiClient());
    }

    @Autowired
    public MerchantIdMetadataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get all MID metadata
     * Retrieve all MID metadata.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAllMidMetadataRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/core-connect/mid/metadata", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all MID metadata
     * Retrieve all MID metadata.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> getAllMidMetadata() throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return getAllMidMetadataRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get all MID metadata
     * Retrieve all MID metadata.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return ResponseEntity&lt;Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Object>> getAllMidMetadataWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return getAllMidMetadataRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get all MID metadata
     * Retrieve all MID metadata.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAllMidMetadataWithResponseSpec() throws WebClientResponseException {
        return getAllMidMetadataRequestCreation();
    }

    /**
     * Get all MID with metadata
     * Retrieve all Merchant Ids with metadata.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param groupId group Id
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param pageSize Number of results per page.
     * @return GetAllMidMetadataBYyGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAllMidMetadataBYyGroupRequestCreation(Integer groupId, String cursor, Integer pageSize) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'groupId' is set
        if (groupId == null) {
            throw new WebClientResponseException("Missing the required parameter 'groupId' when calling getAllMidMetadataBYyGroup", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("groupId", groupId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cursor", cursor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetAllMidMetadataBYyGroup200Response> localVarReturnType = new ParameterizedTypeReference<GetAllMidMetadataBYyGroup200Response>() {};
        return apiClient.invokeAPI("/core-connect/merchantIdRestrictionGroups/{groupId}/mid/metadata", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get all MID with metadata
     * Retrieve all Merchant Ids with metadata.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param groupId group Id
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param pageSize Number of results per page.
     * @return GetAllMidMetadataBYyGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetAllMidMetadataBYyGroup200Response> getAllMidMetadataBYyGroup(Integer groupId, String cursor, Integer pageSize) throws WebClientResponseException {
        ParameterizedTypeReference<GetAllMidMetadataBYyGroup200Response> localVarReturnType = new ParameterizedTypeReference<GetAllMidMetadataBYyGroup200Response>() {};
        return getAllMidMetadataBYyGroupRequestCreation(groupId, cursor, pageSize).bodyToMono(localVarReturnType);
    }

    /**
     * Get all MID with metadata
     * Retrieve all Merchant Ids with metadata.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param groupId group Id
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param pageSize Number of results per page.
     * @return ResponseEntity&lt;GetAllMidMetadataBYyGroup200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetAllMidMetadataBYyGroup200Response>> getAllMidMetadataBYyGroupWithHttpInfo(Integer groupId, String cursor, Integer pageSize) throws WebClientResponseException {
        ParameterizedTypeReference<GetAllMidMetadataBYyGroup200Response> localVarReturnType = new ParameterizedTypeReference<GetAllMidMetadataBYyGroup200Response>() {};
        return getAllMidMetadataBYyGroupRequestCreation(groupId, cursor, pageSize).toEntity(localVarReturnType);
    }

    /**
     * Get all MID with metadata
     * Retrieve all Merchant Ids with metadata.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * @param groupId group Id
     * @param cursor Pagination cursor, if you don&#39;t pass a cursor, result will start at the first page.
     * @param pageSize Number of results per page.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getAllMidMetadataBYyGroupWithResponseSpec(Integer groupId, String cursor, Integer pageSize) throws WebClientResponseException {
        return getAllMidMetadataBYyGroupRequestCreation(groupId, cursor, pageSize);
    }

    /**
     * Get MID Metadata
     * Retrieve metadata for a Merchant Id.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mid Mid
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMidMetadataRequestCreation(Integer mid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'mid' is set
        if (mid == null) {
            throw new WebClientResponseException("Missing the required parameter 'mid' when calling getMidMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("mid", mid);

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

        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI("/core-connect/mid/{mid}/metadata", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get MID Metadata
     * Retrieve metadata for a Merchant Id.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mid Mid
     * @return Object
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Object> getMidMetadata(Integer mid) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return getMidMetadataRequestCreation(mid).bodyToMono(localVarReturnType);
    }

    /**
     * Get MID Metadata
     * Retrieve metadata for a Merchant Id.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mid Mid
     * @return ResponseEntity&lt;Object&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Object>> getMidMetadataWithHttpInfo(Integer mid) throws WebClientResponseException {
        ParameterizedTypeReference<Object> localVarReturnType = new ParameterizedTypeReference<Object>() {};
        return getMidMetadataRequestCreation(mid).toEntity(localVarReturnType);
    }

    /**
     * Get MID Metadata
     * Retrieve metadata for a Merchant Id.
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mid Mid
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMidMetadataWithResponseSpec(Integer mid) throws WebClientResponseException {
        return getMidMetadataRequestCreation(mid);
    }

    /**
     * Store MID Metadata
     * Store metadata for a Merchant Id.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mid Mid
     * @param body The body parameter
     * @return PostMidMetadata201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postMidMetadataRequestCreation(Integer mid, Object body) throws WebClientResponseException {
        Object postBody = body;
        // verify the required parameter 'mid' is set
        if (mid == null) {
            throw new WebClientResponseException("Missing the required parameter 'mid' when calling postMidMetadata", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("mid", mid);

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

        ParameterizedTypeReference<PostMidMetadata201Response> localVarReturnType = new ParameterizedTypeReference<PostMidMetadata201Response>() {};
        return apiClient.invokeAPI("/core-connect/mid/{mid}/metadata", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Store MID Metadata
     * Store metadata for a Merchant Id.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mid Mid
     * @param body The body parameter
     * @return PostMidMetadata201Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostMidMetadata201Response> postMidMetadata(Integer mid, Object body) throws WebClientResponseException {
        ParameterizedTypeReference<PostMidMetadata201Response> localVarReturnType = new ParameterizedTypeReference<PostMidMetadata201Response>() {};
        return postMidMetadataRequestCreation(mid, body).bodyToMono(localVarReturnType);
    }

    /**
     * Store MID Metadata
     * Store metadata for a Merchant Id.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mid Mid
     * @param body The body parameter
     * @return ResponseEntity&lt;PostMidMetadata201Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostMidMetadata201Response>> postMidMetadataWithHttpInfo(Integer mid, Object body) throws WebClientResponseException {
        ParameterizedTypeReference<PostMidMetadata201Response> localVarReturnType = new ParameterizedTypeReference<PostMidMetadata201Response>() {};
        return postMidMetadataRequestCreation(mid, body).toEntity(localVarReturnType);
    }

    /**
     * Store MID Metadata
     * Store metadata for a Merchant Id.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * <p><b>404</b> - Not Found
     * @param mid Mid
     * @param body The body parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postMidMetadataWithResponseSpec(Integer mid, Object body) throws WebClientResponseException {
        return postMidMetadataRequestCreation(mid, body);
    }

    /**
     * Put Bulk metadata
     * Create or update bulk metadata
     * <p><b>204</b> - The resource was updated successfully.
     * <p><b>0</b> - Unexpected error
     * @param putMidMetadataRequestInner The putMidMetadataRequestInner parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putMidMetadataRequestCreation(List<PutMidMetadataRequestInner> putMidMetadataRequestInner) throws WebClientResponseException {
        Object postBody = putMidMetadataRequestInner;
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
        return apiClient.invokeAPI("/core-connect/mid/metadata", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Put Bulk metadata
     * Create or update bulk metadata
     * <p><b>204</b> - The resource was updated successfully.
     * <p><b>0</b> - Unexpected error
     * @param putMidMetadataRequestInner The putMidMetadataRequestInner parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> putMidMetadata(List<PutMidMetadataRequestInner> putMidMetadataRequestInner) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return putMidMetadataRequestCreation(putMidMetadataRequestInner).bodyToMono(localVarReturnType);
    }

    /**
     * Put Bulk metadata
     * Create or update bulk metadata
     * <p><b>204</b> - The resource was updated successfully.
     * <p><b>0</b> - Unexpected error
     * @param putMidMetadataRequestInner The putMidMetadataRequestInner parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> putMidMetadataWithHttpInfo(List<PutMidMetadataRequestInner> putMidMetadataRequestInner) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return putMidMetadataRequestCreation(putMidMetadataRequestInner).toEntity(localVarReturnType);
    }

    /**
     * Put Bulk metadata
     * Create or update bulk metadata
     * <p><b>204</b> - The resource was updated successfully.
     * <p><b>0</b> - Unexpected error
     * @param putMidMetadataRequestInner The putMidMetadataRequestInner parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putMidMetadataWithResponseSpec(List<PutMidMetadataRequestInner> putMidMetadataRequestInner) throws WebClientResponseException {
        return putMidMetadataRequestCreation(putMidMetadataRequestInner);
    }
}
