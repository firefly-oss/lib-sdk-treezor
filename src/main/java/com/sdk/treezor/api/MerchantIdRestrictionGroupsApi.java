package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.MerchantIdGroupObject;
import com.sdk.treezor.model.PostMerchantIdRestrictionGroupRequest;
import com.sdk.treezor.model.PutMerchandidrestrictiongroupsDeltaupdateRequest;
import com.sdk.treezor.model.PutMerchantIdRestrictionGroupsRequest;
import com.sdk.treezor.model.PutMidrestrictiongroupsRequest;

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
public class MerchantIdRestrictionGroupsApi {
    private ApiClient apiClient;

    public MerchantIdRestrictionGroupsApi() {
        this(new ApiClient());
    }

    @Autowired
    public MerchantIdRestrictionGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Cancel MID Restriction Group
     * Cancel a merchant id restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteMerchantIdRestrictionGroupsRequestCreation(UUID id, List<String> fields) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteMerchantIdRestrictionGroups", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return apiClient.invokeAPI("/v1/merchantIdRestrictionGroup/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Cancel MID Restriction Group
     * Cancel a merchant id restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdGroupObject> deleteMerchantIdRestrictionGroups(UUID id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return deleteMerchantIdRestrictionGroupsRequestCreation(id, fields).bodyToMono(localVarReturnType);
    }

    /**
     * Cancel MID Restriction Group
     * Cancel a merchant id restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseEntity&lt;MerchantIdGroupObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdGroupObject>> deleteMerchantIdRestrictionGroupsWithHttpInfo(UUID id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return deleteMerchantIdRestrictionGroupsRequestCreation(id, fields).toEntity(localVarReturnType);
    }

    /**
     * Cancel MID Restriction Group
     * Cancel a merchant id restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteMerchantIdRestrictionGroupsWithResponseSpec(UUID id, List<String> fields) throws WebClientResponseException {
        return deleteMerchantIdRestrictionGroupsRequestCreation(id, fields);
    }

    /**
     * Search MID Restriction Groups
     * Retrieve Merchant ID Restriction Groups that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: - fieldName: the name of a filterable field of this object. - expression: the values to be included or excluded (see the table below for more information) - criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMerchantIdRestrictionGroupRequestCreation(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageNumber", pageNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageCount", pageCount));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortBy", sortBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sortOrder", sortOrder));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return apiClient.invokeAPI("/v1/merchantIdRestrictionGroups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search MID Restriction Groups
     * Retrieve Merchant ID Restriction Groups that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: - fieldName: the name of a filterable field of this object. - expression: the values to be included or excluded (see the table below for more information) - criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdGroupObject> getMerchantIdRestrictionGroup(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return getMerchantIdRestrictionGroupRequestCreation(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder).bodyToMono(localVarReturnType);
    }

    /**
     * Search MID Restriction Groups
     * Retrieve Merchant ID Restriction Groups that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: - fieldName: the name of a filterable field of this object. - expression: the values to be included or excluded (see the table below for more information) - criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return ResponseEntity&lt;MerchantIdGroupObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdGroupObject>> getMerchantIdRestrictionGroupWithHttpInfo(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return getMerchantIdRestrictionGroupRequestCreation(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder).toEntity(localVarReturnType);
    }

    /**
     * Search MID Restriction Groups
     * Retrieve Merchant ID Restriction Groups that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: - fieldName: the name of a filterable field of this object. - expression: the values to be included or excluded (see the table below for more information) - criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMerchantIdRestrictionGroupWithResponseSpec(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        return getMerchantIdRestrictionGroupRequestCreation(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
    }

    /**
     * Create MID Restriction Group
     * Create a new Merchant ID restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postMerchantIdRestrictionGroupRequest The postMerchantIdRestrictionGroupRequest parameter
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postMerchantIdRestrictionGroupRequestCreation(PostMerchantIdRestrictionGroupRequest postMerchantIdRestrictionGroupRequest) throws WebClientResponseException {
        Object postBody = postMerchantIdRestrictionGroupRequest;
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

        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return apiClient.invokeAPI("/v1/merchantIdRestrictionGroups", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create MID Restriction Group
     * Create a new Merchant ID restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postMerchantIdRestrictionGroupRequest The postMerchantIdRestrictionGroupRequest parameter
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdGroupObject> postMerchantIdRestrictionGroup(PostMerchantIdRestrictionGroupRequest postMerchantIdRestrictionGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return postMerchantIdRestrictionGroupRequestCreation(postMerchantIdRestrictionGroupRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create MID Restriction Group
     * Create a new Merchant ID restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postMerchantIdRestrictionGroupRequest The postMerchantIdRestrictionGroupRequest parameter
     * @return ResponseEntity&lt;MerchantIdGroupObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdGroupObject>> postMerchantIdRestrictionGroupWithHttpInfo(PostMerchantIdRestrictionGroupRequest postMerchantIdRestrictionGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return postMerchantIdRestrictionGroupRequestCreation(postMerchantIdRestrictionGroupRequest).toEntity(localVarReturnType);
    }

    /**
     * Create MID Restriction Group
     * Create a new Merchant ID restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postMerchantIdRestrictionGroupRequest The postMerchantIdRestrictionGroupRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postMerchantIdRestrictionGroupWithResponseSpec(PostMerchantIdRestrictionGroupRequest postMerchantIdRestrictionGroupRequest) throws WebClientResponseException {
        return postMerchantIdRestrictionGroupRequestCreation(postMerchantIdRestrictionGroupRequest);
    }

    /**
     * Update MID Restriction Group
     * Update the list of Merchant Ids for a MID Restriction Group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param putMerchandidrestrictiongroupsDeltaupdateRequest The putMerchandidrestrictiongroupsDeltaupdateRequest parameter
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putMerchandidrestrictiongroupsDeltaupdateRequestCreation(Integer id, PutMerchandidrestrictiongroupsDeltaupdateRequest putMerchandidrestrictiongroupsDeltaupdateRequest) throws WebClientResponseException {
        Object postBody = putMerchandidrestrictiongroupsDeltaupdateRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling putMerchandidrestrictiongroupsDeltaupdate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return apiClient.invokeAPI("/v1/merchantIdRestrictionGroups/{id}/DeltaUpdate", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update MID Restriction Group
     * Update the list of Merchant Ids for a MID Restriction Group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param putMerchandidrestrictiongroupsDeltaupdateRequest The putMerchandidrestrictiongroupsDeltaupdateRequest parameter
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdGroupObject> putMerchandidrestrictiongroupsDeltaupdate(Integer id, PutMerchandidrestrictiongroupsDeltaupdateRequest putMerchandidrestrictiongroupsDeltaupdateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return putMerchandidrestrictiongroupsDeltaupdateRequestCreation(id, putMerchandidrestrictiongroupsDeltaupdateRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update MID Restriction Group
     * Update the list of Merchant Ids for a MID Restriction Group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param putMerchandidrestrictiongroupsDeltaupdateRequest The putMerchandidrestrictiongroupsDeltaupdateRequest parameter
     * @return ResponseEntity&lt;MerchantIdGroupObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdGroupObject>> putMerchandidrestrictiongroupsDeltaupdateWithHttpInfo(Integer id, PutMerchandidrestrictiongroupsDeltaupdateRequest putMerchandidrestrictiongroupsDeltaupdateRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return putMerchandidrestrictiongroupsDeltaupdateRequestCreation(id, putMerchandidrestrictiongroupsDeltaupdateRequest).toEntity(localVarReturnType);
    }

    /**
     * Update MID Restriction Group
     * Update the list of Merchant Ids for a MID Restriction Group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param putMerchandidrestrictiongroupsDeltaupdateRequest The putMerchandidrestrictiongroupsDeltaupdateRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putMerchandidrestrictiongroupsDeltaupdateWithResponseSpec(Integer id, PutMerchandidrestrictiongroupsDeltaupdateRequest putMerchandidrestrictiongroupsDeltaupdateRequest) throws WebClientResponseException {
        return putMerchandidrestrictiongroupsDeltaupdateRequestCreation(id, putMerchandidrestrictiongroupsDeltaupdateRequest);
    }

    /**
     * (DEPRECATED) Update MID Restriction Group
     * Deprecated
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant Id restriction group.
     * @param putMerchantIdRestrictionGroupsRequest The putMerchantIdRestrictionGroupsRequest parameter
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putMerchantIdRestrictionGroupsRequestCreation(Integer id, PutMerchantIdRestrictionGroupsRequest putMerchantIdRestrictionGroupsRequest) throws WebClientResponseException {
        Object postBody = putMerchantIdRestrictionGroupsRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling putMerchantIdRestrictionGroups", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return apiClient.invokeAPI("/v1/merchantIdRestrictionGroup/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * (DEPRECATED) Update MID Restriction Group
     * Deprecated
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant Id restriction group.
     * @param putMerchantIdRestrictionGroupsRequest The putMerchantIdRestrictionGroupsRequest parameter
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdGroupObject> putMerchantIdRestrictionGroups(Integer id, PutMerchantIdRestrictionGroupsRequest putMerchantIdRestrictionGroupsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return putMerchantIdRestrictionGroupsRequestCreation(id, putMerchantIdRestrictionGroupsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * (DEPRECATED) Update MID Restriction Group
     * Deprecated
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant Id restriction group.
     * @param putMerchantIdRestrictionGroupsRequest The putMerchantIdRestrictionGroupsRequest parameter
     * @return ResponseEntity&lt;MerchantIdGroupObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdGroupObject>> putMerchantIdRestrictionGroupsWithHttpInfo(Integer id, PutMerchantIdRestrictionGroupsRequest putMerchantIdRestrictionGroupsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return putMerchantIdRestrictionGroupsRequestCreation(id, putMerchantIdRestrictionGroupsRequest).toEntity(localVarReturnType);
    }

    /**
     * (DEPRECATED) Update MID Restriction Group
     * Deprecated
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant Id restriction group.
     * @param putMerchantIdRestrictionGroupsRequest The putMerchantIdRestrictionGroupsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putMerchantIdRestrictionGroupsWithResponseSpec(Integer id, PutMerchantIdRestrictionGroupsRequest putMerchantIdRestrictionGroupsRequest) throws WebClientResponseException {
        return putMerchantIdRestrictionGroupsRequestCreation(id, putMerchantIdRestrictionGroupsRequest);
    }

    /**
     * Check the presence of merchants IDs list for a restriction group
     * Check if Merchant IDs list for a restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param putMidrestrictiongroupsRequest The putMidrestrictiongroupsRequest parameter
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putMidrestrictiongroupsRequestCreation(Integer id, PutMidrestrictiongroupsRequest putMidrestrictiongroupsRequest) throws WebClientResponseException {
        Object postBody = putMidrestrictiongroupsRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling putMidrestrictiongroups", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("id", id);

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

        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return apiClient.invokeAPI("/v1/merchantIdRestrictionGroups/{id}/PresenceCheck", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Check the presence of merchants IDs list for a restriction group
     * Check if Merchant IDs list for a restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param putMidrestrictiongroupsRequest The putMidrestrictiongroupsRequest parameter
     * @return MerchantIdGroupObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MerchantIdGroupObject> putMidrestrictiongroups(Integer id, PutMidrestrictiongroupsRequest putMidrestrictiongroupsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return putMidrestrictiongroupsRequestCreation(id, putMidrestrictiongroupsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Check the presence of merchants IDs list for a restriction group
     * Check if Merchant IDs list for a restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param putMidrestrictiongroupsRequest The putMidrestrictiongroupsRequest parameter
     * @return ResponseEntity&lt;MerchantIdGroupObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MerchantIdGroupObject>> putMidrestrictiongroupsWithHttpInfo(Integer id, PutMidrestrictiongroupsRequest putMidrestrictiongroupsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MerchantIdGroupObject> localVarReturnType = new ParameterizedTypeReference<MerchantIdGroupObject>() {};
        return putMidrestrictiongroupsRequestCreation(id, putMidrestrictiongroupsRequest).toEntity(localVarReturnType);
    }

    /**
     * Check the presence of merchants IDs list for a restriction group
     * Check if Merchant IDs list for a restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the Merchant ID restriction group.
     * @param putMidrestrictiongroupsRequest The putMidrestrictiongroupsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putMidrestrictiongroupsWithResponseSpec(Integer id, PutMidrestrictiongroupsRequest putMidrestrictiongroupsRequest) throws WebClientResponseException {
        return putMidrestrictiongroupsRequestCreation(id, putMidrestrictiongroupsRequest);
    }
}
