package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.BeneficiaryObject;
import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.PostBeneficiaryRequest;
import com.sdk.treezor.model.PutBeneficiaryRequest;

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
public class BeneficiariesApi {
    private ApiClient apiClient;

    public BeneficiariesApi() {
        this(new ApiClient());
    }

    @Autowired
    public BeneficiariesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Search Beneficiaries
     * Retrieve Beneficiary bank accounts that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s).  Filterable fields are:  - id  - tag  - userId  - isActive (1 for yes, 0 for no)  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  - createdDate  - modifiedDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;.  Where:  - fieldName: the name of a filterable field of this object.  - expression: the values to be included or excluded (see the table below for more information)  - criterion: a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param id The unique identifier of the Beneficiary.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return BeneficiaryObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getBeneficiariesRequestCreation(String accessTag, List<String> fields, String filter, Integer id, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
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
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
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

        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return apiClient.invokeAPI("/v1/beneficiaries", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Beneficiaries
     * Retrieve Beneficiary bank accounts that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s).  Filterable fields are:  - id  - tag  - userId  - isActive (1 for yes, 0 for no)  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  - createdDate  - modifiedDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;.  Where:  - fieldName: the name of a filterable field of this object.  - expression: the values to be included or excluded (see the table below for more information)  - criterion: a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param id The unique identifier of the Beneficiary.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return BeneficiaryObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BeneficiaryObject> getBeneficiaries(String accessTag, List<String> fields, String filter, Integer id, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return getBeneficiariesRequestCreation(accessTag, fields, filter, id, pageNumber, pageCount, sortBy, sortOrder).bodyToMono(localVarReturnType);
    }

    /**
     * Search Beneficiaries
     * Retrieve Beneficiary bank accounts that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s).  Filterable fields are:  - id  - tag  - userId  - isActive (1 for yes, 0 for no)  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  - createdDate  - modifiedDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;.  Where:  - fieldName: the name of a filterable field of this object.  - expression: the values to be included or excluded (see the table below for more information)  - criterion: a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param id The unique identifier of the Beneficiary.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return ResponseEntity&lt;BeneficiaryObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BeneficiaryObject>> getBeneficiariesWithHttpInfo(String accessTag, List<String> fields, String filter, Integer id, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return getBeneficiariesRequestCreation(accessTag, fields, filter, id, pageNumber, pageCount, sortBy, sortOrder).toEntity(localVarReturnType);
    }

    /**
     * Search Beneficiaries
     * Retrieve Beneficiary bank accounts that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @param filter You can filter the API response by using filter(s).  Filterable fields are:  - id  - tag  - userId  - isActive (1 for yes, 0 for no)  - nickName  - address  - iban (encrypted IBAN)  - IbanInClear  - bic  - sepaCreditorIdentifier  - usableForSct  - createdDate  - modifiedDate  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: FILTER1;FILTER2;FILTER3.  A single filter has the following syntax : \&quot;fieldName criterion expression\&quot;.  Where:  - fieldName: the name of a filterable field of this object.  - expression: the values to be included or excluded (see the table below for more information)  - criterion: a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @param id The unique identifier of the Beneficiary.
     * @param pageNumber The page number, only available on /v1/ endpoints  
     * @param pageCount The number of items per page, only available on /v1/ endpoints   
     * @param sortBy The transaction element you want to sort the list with. 
     * @param sortOrder The order you want to sort the list. * **DESC** for descending. * **ASC** for ascending. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getBeneficiariesWithResponseSpec(String accessTag, List<String> fields, String filter, Integer id, Integer pageNumber, Integer pageCount, String sortBy, String sortOrder) throws WebClientResponseException {
        return getBeneficiariesRequestCreation(accessTag, fields, filter, id, pageNumber, pageCount, sortBy, sortOrder);
    }

    /**
     * Get Beneficiary
     * Retrieve a Beneficiary bank account based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param beneficiaryId The unique identifier of the Beneficiary.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return BeneficiaryObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getBeneficiaryRequestCreation(UUID beneficiaryId, List<String> fields) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'beneficiaryId' is set
        if (beneficiaryId == null) {
            throw new WebClientResponseException("Missing the required parameter 'beneficiaryId' when calling getBeneficiary", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("beneficiaryId", beneficiaryId);

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

        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return apiClient.invokeAPI("/v1/beneficiaries/{beneficiaryId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Beneficiary
     * Retrieve a Beneficiary bank account based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param beneficiaryId The unique identifier of the Beneficiary.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return BeneficiaryObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BeneficiaryObject> getBeneficiary(UUID beneficiaryId, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return getBeneficiaryRequestCreation(beneficiaryId, fields).bodyToMono(localVarReturnType);
    }

    /**
     * Get Beneficiary
     * Retrieve a Beneficiary bank account based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param beneficiaryId The unique identifier of the Beneficiary.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseEntity&lt;BeneficiaryObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BeneficiaryObject>> getBeneficiaryWithHttpInfo(UUID beneficiaryId, List<String> fields) throws WebClientResponseException {
        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return getBeneficiaryRequestCreation(beneficiaryId, fields).toEntity(localVarReturnType);
    }

    /**
     * Get Beneficiary
     * Retrieve a Beneficiary bank account based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param beneficiaryId The unique identifier of the Beneficiary.
     * @param fields List of the object properties to be returned, allowing you to filter the response payload.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getBeneficiaryWithResponseSpec(UUID beneficiaryId, List<String> fields) throws WebClientResponseException {
        return getBeneficiaryRequestCreation(beneficiaryId, fields);
    }

    /**
     * Create Beneficiary
     * Create a new benefeciary bank account. This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postBeneficiaryRequest The postBeneficiaryRequest parameter
     * @return BeneficiaryObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postBeneficiaryRequestCreation(PostBeneficiaryRequest postBeneficiaryRequest) throws WebClientResponseException {
        Object postBody = postBeneficiaryRequest;
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

        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return apiClient.invokeAPI("/v1/beneficiaries", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Beneficiary
     * Create a new benefeciary bank account. This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postBeneficiaryRequest The postBeneficiaryRequest parameter
     * @return BeneficiaryObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BeneficiaryObject> postBeneficiary(PostBeneficiaryRequest postBeneficiaryRequest) throws WebClientResponseException {
        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return postBeneficiaryRequestCreation(postBeneficiaryRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Beneficiary
     * Create a new benefeciary bank account. This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postBeneficiaryRequest The postBeneficiaryRequest parameter
     * @return ResponseEntity&lt;BeneficiaryObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BeneficiaryObject>> postBeneficiaryWithHttpInfo(PostBeneficiaryRequest postBeneficiaryRequest) throws WebClientResponseException {
        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return postBeneficiaryRequestCreation(postBeneficiaryRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Beneficiary
     * Create a new benefeciary bank account. This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>400</b> - Bad Request
     * <p><b>0</b> - Unexpected error
     * @param postBeneficiaryRequest The postBeneficiaryRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postBeneficiaryWithResponseSpec(PostBeneficiaryRequest postBeneficiaryRequest) throws WebClientResponseException {
        return postBeneficiaryRequestCreation(postBeneficiaryRequest);
    }

    /**
     * Update Beneficiary
     * Modify a benefeciary bank account information.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param beneficiaryId The unique identifier of the Beneficiary.
     * @param putBeneficiaryRequest The putBeneficiaryRequest parameter
     * @return BeneficiaryObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putBeneficiaryRequestCreation(Integer beneficiaryId, PutBeneficiaryRequest putBeneficiaryRequest) throws WebClientResponseException {
        Object postBody = putBeneficiaryRequest;
        // verify the required parameter 'beneficiaryId' is set
        if (beneficiaryId == null) {
            throw new WebClientResponseException("Missing the required parameter 'beneficiaryId' when calling putBeneficiary", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("beneficiaryId", beneficiaryId);

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

        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return apiClient.invokeAPI("/v1/beneficiaries/{beneficiaryId}", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Update Beneficiary
     * Modify a benefeciary bank account information.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param beneficiaryId The unique identifier of the Beneficiary.
     * @param putBeneficiaryRequest The putBeneficiaryRequest parameter
     * @return BeneficiaryObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BeneficiaryObject> putBeneficiary(Integer beneficiaryId, PutBeneficiaryRequest putBeneficiaryRequest) throws WebClientResponseException {
        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return putBeneficiaryRequestCreation(beneficiaryId, putBeneficiaryRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Update Beneficiary
     * Modify a benefeciary bank account information.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param beneficiaryId The unique identifier of the Beneficiary.
     * @param putBeneficiaryRequest The putBeneficiaryRequest parameter
     * @return ResponseEntity&lt;BeneficiaryObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<BeneficiaryObject>> putBeneficiaryWithHttpInfo(Integer beneficiaryId, PutBeneficiaryRequest putBeneficiaryRequest) throws WebClientResponseException {
        ParameterizedTypeReference<BeneficiaryObject> localVarReturnType = new ParameterizedTypeReference<BeneficiaryObject>() {};
        return putBeneficiaryRequestCreation(beneficiaryId, putBeneficiaryRequest).toEntity(localVarReturnType);
    }

    /**
     * Update Beneficiary
     * Modify a benefeciary bank account information.  This endpoint requires per-operation [SCA](/guide/strong-customer-authentication/introduction.html). 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param beneficiaryId The unique identifier of the Beneficiary.
     * @param putBeneficiaryRequest The putBeneficiaryRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putBeneficiaryWithResponseSpec(Integer beneficiaryId, PutBeneficiaryRequest putBeneficiaryRequest) throws WebClientResponseException {
        return putBeneficiaryRequestCreation(beneficiaryId, putBeneficiaryRequest);
    }
}
