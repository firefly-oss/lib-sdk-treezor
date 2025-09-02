package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.MandateObject;
import com.sdk.treezor.model.PostMandatesRequest;

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
public class MandatesApi {
    private ApiClient apiClient;

    public MandatesApi() {
        this(new ApiClient());
    }

    @Autowired
    public MandatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Revoke Mandate
     * Change the Mandate status to &#x60;CANCELED&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param mandateId The unique identifier of the Mandate.
     * @param origin The origin of the request for revoking the Mandate. 
     * @return MandateObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteMandateRequestCreation(Integer mandateId, String origin) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'mandateId' is set
        if (mandateId == null) {
            throw new WebClientResponseException("Missing the required parameter 'mandateId' when calling deleteMandate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // verify the required parameter 'origin' is set
        if (origin == null) {
            throw new WebClientResponseException("Missing the required parameter 'origin' when calling deleteMandate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("mandateId", mandateId);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "origin", origin));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return apiClient.invokeAPI("/v1/mandates/{mandateId}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Revoke Mandate
     * Change the Mandate status to &#x60;CANCELED&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param mandateId The unique identifier of the Mandate.
     * @param origin The origin of the request for revoking the Mandate. 
     * @return MandateObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MandateObject> deleteMandate(Integer mandateId, String origin) throws WebClientResponseException {
        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return deleteMandateRequestCreation(mandateId, origin).bodyToMono(localVarReturnType);
    }

    /**
     * Revoke Mandate
     * Change the Mandate status to &#x60;CANCELED&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param mandateId The unique identifier of the Mandate.
     * @param origin The origin of the request for revoking the Mandate. 
     * @return ResponseEntity&lt;MandateObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MandateObject>> deleteMandateWithHttpInfo(Integer mandateId, String origin) throws WebClientResponseException {
        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return deleteMandateRequestCreation(mandateId, origin).toEntity(localVarReturnType);
    }

    /**
     * Revoke Mandate
     * Change the Mandate status to &#x60;CANCELED&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param mandateId The unique identifier of the Mandate.
     * @param origin The origin of the request for revoking the Mandate. 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteMandateWithResponseSpec(Integer mandateId, String origin) throws WebClientResponseException {
        return deleteMandateRequestCreation(mandateId, origin);
    }

    /**
     * Get Mandate
     * Retrieve a Mandate based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param mandateId The unique identifier of the Mandate.
     * @return MandateObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMandateRequestCreation(UUID mandateId) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'mandateId' is set
        if (mandateId == null) {
            throw new WebClientResponseException("Missing the required parameter 'mandateId' when calling getMandate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("mandateId", mandateId);

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

        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return apiClient.invokeAPI("/v1/mandates/{mandateId}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Mandate
     * Retrieve a Mandate based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param mandateId The unique identifier of the Mandate.
     * @return MandateObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MandateObject> getMandate(UUID mandateId) throws WebClientResponseException {
        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return getMandateRequestCreation(mandateId).bodyToMono(localVarReturnType);
    }

    /**
     * Get Mandate
     * Retrieve a Mandate based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param mandateId The unique identifier of the Mandate.
     * @return ResponseEntity&lt;MandateObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MandateObject>> getMandateWithHttpInfo(UUID mandateId) throws WebClientResponseException {
        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return getMandateRequestCreation(mandateId).toEntity(localVarReturnType);
    }

    /**
     * Get Mandate
     * Retrieve a Mandate based on its &#x60;id&#x60;.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param mandateId The unique identifier of the Mandate.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMandateWithResponseSpec(UUID mandateId) throws WebClientResponseException {
        return getMandateRequestCreation(mandateId);
    }

    /**
     * Search Mandates
     * Retrieve Mandates that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param mandateId The unique identifier of the Mandate.
     * @param userId The unique identifier of the User who initiates the Mandate request.
     * @param uniqueMandateReference The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary.                 See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information. 
     * @param mandateStatus The status of the Mandate. 
     * @param filter You can filter the API response by using filter(s).  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: &#x60;FILTER1;FILTER2;FILTER3&#x60;  A single filter has the following syntax : \&quot;fieldName criterionexpression\&quot;.  Where: * fieldName – the name of a filterable field of this object. * expression – the values to be included or excluded (see the table below for more information) * criterion – a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @return MandateObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getMandatesRequestCreation(String accessTag, Integer mandateId, Integer userId, String uniqueMandateReference, String mandateStatus, String filter) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mandateId", mandateId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "userId", userId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "uniqueMandateReference", uniqueMandateReference));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "mandateStatus", mandateStatus));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter", filter));
        
        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return apiClient.invokeAPI("/v1/mandates", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Mandates
     * Retrieve Mandates that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param mandateId The unique identifier of the Mandate.
     * @param userId The unique identifier of the User who initiates the Mandate request.
     * @param uniqueMandateReference The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary.                 See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information. 
     * @param mandateStatus The status of the Mandate. 
     * @param filter You can filter the API response by using filter(s).  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: &#x60;FILTER1;FILTER2;FILTER3&#x60;  A single filter has the following syntax : \&quot;fieldName criterionexpression\&quot;.  Where: * fieldName – the name of a filterable field of this object. * expression – the values to be included or excluded (see the table below for more information) * criterion – a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @return MandateObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MandateObject> getMandates(String accessTag, Integer mandateId, Integer userId, String uniqueMandateReference, String mandateStatus, String filter) throws WebClientResponseException {
        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return getMandatesRequestCreation(accessTag, mandateId, userId, uniqueMandateReference, mandateStatus, filter).bodyToMono(localVarReturnType);
    }

    /**
     * Search Mandates
     * Retrieve Mandates that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param mandateId The unique identifier of the Mandate.
     * @param userId The unique identifier of the User who initiates the Mandate request.
     * @param uniqueMandateReference The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary.                 See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information. 
     * @param mandateStatus The status of the Mandate. 
     * @param filter You can filter the API response by using filter(s).  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: &#x60;FILTER1;FILTER2;FILTER3&#x60;  A single filter has the following syntax : \&quot;fieldName criterionexpression\&quot;.  Where: * fieldName – the name of a filterable field of this object. * expression – the values to be included or excluded (see the table below for more information) * criterion – a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @return ResponseEntity&lt;MandateObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MandateObject>> getMandatesWithHttpInfo(String accessTag, Integer mandateId, Integer userId, String uniqueMandateReference, String mandateStatus, String filter) throws WebClientResponseException {
        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return getMandatesRequestCreation(accessTag, mandateId, userId, uniqueMandateReference, mandateStatus, filter).toEntity(localVarReturnType);
    }

    /**
     * Search Mandates
     * Retrieve Mandates that match search criteria.
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param mandateId The unique identifier of the Mandate.
     * @param userId The unique identifier of the User who initiates the Mandate request.
     * @param uniqueMandateReference The unique reference that unambiguiously identify a mandate signed between the user and the beneficiary.                 See the [Unique Mandate Reference (UMR)](/guide/overview/glossary.html#unique-mandate-reference-umr) article for more information. 
     * @param mandateStatus The status of the Mandate. 
     * @param filter You can filter the API response by using filter(s).  Filters should be separated by a \&quot;;\&quot;. Example for 3 filters: &#x60;FILTER1;FILTER2;FILTER3&#x60;  A single filter has the following syntax : \&quot;fieldName criterionexpression\&quot;.  Where: * fieldName – the name of a filterable field of this object. * expression – the values to be included or excluded (see the table below for more information) * criterion – a filter criterion.  Here are the possible values for criterion:   | Criteria |         Description    |                   Type                   | Expression Example |  |----------|------------------------|------------------------------------------|--------------------|  |     &gt;    |      greater than      |            alphanumeric string           |         100        |  |    &gt;&#x3D;    | greater or equal than  |            alphanumeric string           |         100        |  |     &lt;    |        less than       |            alphanumeric string           |         100        |  |    &lt;&#x3D;    |   less or equal than   |            alphanumeric string           |         100        |  |    !&#x3D;    |      not equal to      |            alphanumeric string           |         100        |  |   like   |          like          |            alphanumeric string           |         100        |  |    in    |           in           | alphanumeric strings separated by commas |      100,30,25     |  |    &#x3D;&#x3D;    |         equals         |            alphanumeric string           |         100        | 
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getMandatesWithResponseSpec(String accessTag, Integer mandateId, Integer userId, String uniqueMandateReference, String mandateStatus, String filter) throws WebClientResponseException {
        return getMandatesRequestCreation(accessTag, mandateId, userId, uniqueMandateReference, mandateStatus, filter);
    }

    /**
     * Create Mandate
     * Create a new mandate. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postMandatesRequest The postMandatesRequest parameter
     * @return MandateObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec postMandatesRequestCreation(PostMandatesRequest postMandatesRequest) throws WebClientResponseException {
        Object postBody = postMandatesRequest;
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

        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return apiClient.invokeAPI("/v1/mandates", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Mandate
     * Create a new mandate. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postMandatesRequest The postMandatesRequest parameter
     * @return MandateObject
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<MandateObject> postMandates(PostMandatesRequest postMandatesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return postMandatesRequestCreation(postMandatesRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Create Mandate
     * Create a new mandate. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postMandatesRequest The postMandatesRequest parameter
     * @return ResponseEntity&lt;MandateObject&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<MandateObject>> postMandatesWithHttpInfo(PostMandatesRequest postMandatesRequest) throws WebClientResponseException {
        ParameterizedTypeReference<MandateObject> localVarReturnType = new ParameterizedTypeReference<MandateObject>() {};
        return postMandatesRequestCreation(postMandatesRequest).toEntity(localVarReturnType);
    }

    /**
     * Create Mandate
     * Create a new mandate. 
     * <p><b>200</b> - OK
     * <p><b>405</b> - Method Not Allowed
     * <p><b>0</b> - Unexpected error
     * @param postMandatesRequest The postMandatesRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec postMandatesWithResponseSpec(PostMandatesRequest postMandatesRequest) throws WebClientResponseException {
        return postMandatesRequestCreation(postMandatesRequest);
    }
}
