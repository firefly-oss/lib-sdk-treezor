package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.DeleteMccRestrictionGroups200Response;
import com.sdk.treezor.model.GetMccRestrictionGroups200Response;
import com.sdk.treezor.model.GetMccRestrictionGroupsId200Response;
import com.sdk.treezor.model.PostMccRestrictionGroup200Response;
import com.sdk.treezor.model.PostMccRestrictionGroupRequest;
import com.sdk.treezor.model.PutMccRestrictionGroups200Response;
import com.sdk.treezor.model.PutMccRestrictionGroupsRequest;

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
public class MccRestrictionGroupsApi {
    private ApiClient apiClient;

    public MccRestrictionGroupsApi() {
        this(new ApiClient());
    }

    @Autowired
    public MccRestrictionGroupsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Cancel MCC Restriction Group
     * Cancel a MCC restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC restriction Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return DeleteMccRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteMccRestrictionGroupsRequestCreation(Long id, List<String> fields) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling deleteMccRestrictionGroups", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<DeleteMccRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<DeleteMccRestrictionGroups200Response>() {};
        return apiClient.invokeAPI("/v1/mccRestrictionGroups/{id}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Cancel MCC Restriction Group
     * Cancel a MCC restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC restriction Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return DeleteMccRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<DeleteMccRestrictionGroups200Response> deleteMccRestrictionGroups(Long id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<DeleteMccRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<DeleteMccRestrictionGroups200Response>() {};
        return deleteMccRestrictionGroupsRequestCreation(id, fields).bodyToMono(localVarReturnType);
    }

    /**
     * Cancel MCC Restriction Group
     * Cancel a MCC restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC restriction Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseEntity&lt;DeleteMccRestrictionGroups200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<DeleteMccRestrictionGroups200Response>> deleteMccRestrictionGroupsWithHttpInfo(Long id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<DeleteMccRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<DeleteMccRestrictionGroups200Response>() {};
        return deleteMccRestrictionGroupsRequestCreation(id, fields).toEntity(localVarReturnType);
    }

    /**
     * Cancel MCC Restriction Group
     * Cancel a MCC restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC restriction Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteMccRestrictionGroupsWithResponseSpec(Long id, List<String> fields) throws WebClientResponseException {
        return deleteMccRestrictionGroupsRequestCreation(id, fields);
    }

    /**
     * Search MCC Restriction Groups
     * Retrieve MCC Restriction Groups that match search criteria. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: * fieldName: the name of a filterable field of this object. * expression: the values to be included or excluded (see table below) * criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return GetMccRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMccRestrictionGroupsRequestCreation(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
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

        ParameterizedTypeReference<GetMccRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<GetMccRestrictionGroups200Response>() {};
        return apiClient.invokeAPI("/v1/mccRestrictionGroups", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search MCC Restriction Groups
     * Retrieve MCC Restriction Groups that match search criteria. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: * fieldName: the name of a filterable field of this object. * expression: the values to be included or excluded (see table below) * criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return GetMccRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetMccRestrictionGroups200Response> getMccRestrictionGroups(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<GetMccRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<GetMccRestrictionGroups200Response>() {};
        return getMccRestrictionGroupsRequestCreation(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder).bodyToMono(localVarReturnType);
    }

    /**
     * Search MCC Restriction Groups
     * Retrieve MCC Restriction Groups that match search criteria. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: * fieldName: the name of a filterable field of this object. * expression: the values to be included or excluded (see table below) * criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return ResponseEntity&lt;GetMccRestrictionGroups200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetMccRestrictionGroups200Response>> getMccRestrictionGroupsWithHttpInfo(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<GetMccRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<GetMccRestrictionGroups200Response>() {};
        return getMccRestrictionGroupsRequestCreation(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder).toEntity(localVarReturnType);
    }

    /**
     * Search MCC Restriction Groups
     * Retrieve MCC Restriction Groups that match search criteria. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s). Filterable fields are:   - id   - name   - isWhitelist   - status   - startDate   - createdDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax: \&quot;fieldName criterion expression\&quot;, where: * fieldName: the name of a filterable field of this object. * expression: the values to be included or excluded (see table below) * criterion: a filter criterion.  Here are the possible values for criterion:    | Criteria |         Description    |                   Type                   | Expression Example |   |----------|------------------------|------------------------------------------|--------------------|   |     &gt;    |      greater than      |            alphanumeric string           |         100        |   |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |   |     &lt;    |        less than       |            alphanumeric string           |         100        |   |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |   |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |   |   like   |          like          |            alphanumeric string           |         100        |   |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |   |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMccRestrictionGroupsWithResponseSpec(String accessTag, List<String> fields, String filter, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        return getMccRestrictionGroupsRequestCreation(accessTag, fields, filter, pageNumber, pageCount, sortBy, sortOrder);
    }

    /**
     * Get MCC Restriction Group
     * Retrieve a MCC Group based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC Restriction Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return GetMccRestrictionGroupsId200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMccRestrictionGroupsIdRequestCreation(Long id, List<String> fields) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling getMccRestrictionGroupsId", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<GetMccRestrictionGroupsId200Response> localVarReturnType = new ParameterizedTypeReference<GetMccRestrictionGroupsId200Response>() {};
        return apiClient.invokeAPI("/v1/mccRestrictionGroups/{id}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get MCC Restriction Group
     * Retrieve a MCC Group based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC Restriction Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return GetMccRestrictionGroupsId200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetMccRestrictionGroupsId200Response> getMccRestrictionGroupsId(Long id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<GetMccRestrictionGroupsId200Response> localVarReturnType = new ParameterizedTypeReference<GetMccRestrictionGroupsId200Response>() {};
        return getMccRestrictionGroupsIdRequestCreation(id, fields).bodyToMono(localVarReturnType);
    }

    /**
     * Get MCC Restriction Group
     * Retrieve a MCC Group based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC Restriction Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseEntity&lt;GetMccRestrictionGroupsId200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetMccRestrictionGroupsId200Response>> getMccRestrictionGroupsIdWithHttpInfo(Long id, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<GetMccRestrictionGroupsId200Response> localVarReturnType = new ParameterizedTypeReference<GetMccRestrictionGroupsId200Response>() {};
        return getMccRestrictionGroupsIdRequestCreation(id, fields).toEntity(localVarReturnType);
    }

    /**
     * Get MCC Restriction Group
     * Retrieve a MCC Group based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC Restriction Group.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMccRestrictionGroupsIdWithResponseSpec(Long id, List<String> fields) throws WebClientResponseException {
        return getMccRestrictionGroupsIdRequestCreation(id, fields);
    }

    /**
     * Create MCC Restriction Group
     * Create a new Merchant Category Code (MCC) restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param postMccRestrictionGroupRequest The postMccRestrictionGroupRequest parameter
     * @return PostMccRestrictionGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postMccRestrictionGroupRequestCreation(List<String> fields, PostMccRestrictionGroupRequest postMccRestrictionGroupRequest) throws WebClientResponseException {
        Object postBody = postMccRestrictionGroupRequest;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "fields", fields));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<PostMccRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostMccRestrictionGroup200Response>() {};
        return apiClient.invokeAPI("/v1/mccRestrictionGroups", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create MCC Restriction Group
     * Create a new Merchant Category Code (MCC) restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param postMccRestrictionGroupRequest The postMccRestrictionGroupRequest parameter
     * @return PostMccRestrictionGroup200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PostMccRestrictionGroup200Response> postMccRestrictionGroup(List<String> fields, PostMccRestrictionGroupRequest postMccRestrictionGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostMccRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostMccRestrictionGroup200Response>() {};
        return postMccRestrictionGroupRequestCreation(fields, postMccRestrictionGroupRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create MCC Restriction Group
     * Create a new Merchant Category Code (MCC) restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param postMccRestrictionGroupRequest The postMccRestrictionGroupRequest parameter
     * @return ResponseEntity&lt;PostMccRestrictionGroup200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PostMccRestrictionGroup200Response>> postMccRestrictionGroupWithHttpInfo(List<String> fields, PostMccRestrictionGroupRequest postMccRestrictionGroupRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PostMccRestrictionGroup200Response> localVarReturnType = new ParameterizedTypeReference<PostMccRestrictionGroup200Response>() {};
        return postMccRestrictionGroupRequestCreation(fields, postMccRestrictionGroupRequest).toEntity(localVarReturnType);
    }

    /**
     * Create MCC Restriction Group
     * Create a new Merchant Category Code (MCC) restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param postMccRestrictionGroupRequest The postMccRestrictionGroupRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postMccRestrictionGroupWithResponseSpec(List<String> fields, PostMccRestrictionGroupRequest postMccRestrictionGroupRequest) throws WebClientResponseException {
        return postMccRestrictionGroupRequestCreation(fields, postMccRestrictionGroupRequest);
    }

    /**
     * Update MCC Restriction Group
     * Edit a MCC Restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC Restriction Group.
     * @param putMccRestrictionGroupsRequest The putMccRestrictionGroupsRequest parameter
     * @return PutMccRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putMccRestrictionGroupsRequestCreation(Integer id, PutMccRestrictionGroupsRequest putMccRestrictionGroupsRequest) throws WebClientResponseException {
        Object postBody = putMccRestrictionGroupsRequest;
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new WebClientResponseException("Missing the required parameter 'id' when calling putMccRestrictionGroups", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<PutMccRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<PutMccRestrictionGroups200Response>() {};
        return apiClient.invokeAPI("/v1/mccRestrictionGroups/{id}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update MCC Restriction Group
     * Edit a MCC Restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC Restriction Group.
     * @param putMccRestrictionGroupsRequest The putMccRestrictionGroupsRequest parameter
     * @return PutMccRestrictionGroups200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<PutMccRestrictionGroups200Response> putMccRestrictionGroups(Integer id, PutMccRestrictionGroupsRequest putMccRestrictionGroupsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PutMccRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<PutMccRestrictionGroups200Response>() {};
        return putMccRestrictionGroupsRequestCreation(id, putMccRestrictionGroupsRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update MCC Restriction Group
     * Edit a MCC Restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC Restriction Group.
     * @param putMccRestrictionGroupsRequest The putMccRestrictionGroupsRequest parameter
     * @return ResponseEntity&lt;PutMccRestrictionGroups200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<PutMccRestrictionGroups200Response>> putMccRestrictionGroupsWithHttpInfo(Integer id, PutMccRestrictionGroupsRequest putMccRestrictionGroupsRequest) throws WebClientResponseException {
        ParameterizedTypeReference<PutMccRestrictionGroups200Response> localVarReturnType = new ParameterizedTypeReference<PutMccRestrictionGroups200Response>() {};
        return putMccRestrictionGroupsRequestCreation(id, putMccRestrictionGroupsRequest).toEntity(localVarReturnType);
    }

    /**
     * Update MCC Restriction Group
     * Edit a MCC Restriction group.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param id The unique identifier of the MCC Restriction Group.
     * @param putMccRestrictionGroupsRequest The putMccRestrictionGroupsRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putMccRestrictionGroupsWithResponseSpec(Integer id, PutMccRestrictionGroupsRequest putMccRestrictionGroupsRequest) throws WebClientResponseException {
        return putMccRestrictionGroupsRequestCreation(id, putMccRestrictionGroupsRequest);
    }
}
