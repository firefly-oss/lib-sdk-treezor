package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.GetBusinessInfo200Response;
import com.sdk.treezor.model.SearchBusiness200ResponseInner;
import com.sdk.treezor.model.SearchBusinessDefaultResponse;

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
public class BusinessesApi {
    private ApiClient apiClient;

    public BusinessesApi() {
        this(new ApiClient());
    }

    @Autowired
    public BusinessesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Get Business Information
     * The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 
     * <p><b>200</b> - A business information response
     * <p><b>0</b> - Unexpected error
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param externalId Unique business external id, as given in businesssearch reponse.
     * @param registrationNumber Unique business registration number.
     * @param vatNumber Unique business VAT number.
     * @return GetBusinessInfo200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getBusinessInfoRequestCreation(String country, String accessTag, String externalId, String registrationNumber, String vatNumber) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new WebClientResponseException("Missing the required parameter 'country' when calling getBusinessInfo", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country", country));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "externalId", externalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrationNumber", registrationNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "vatNumber", vatNumber));
        
        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<GetBusinessInfo200Response> localVarReturnType = new ParameterizedTypeReference<GetBusinessInfo200Response>() {};
        return apiClient.invokeAPI("/v1/businessinformations", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Business Information
     * The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 
     * <p><b>200</b> - A business information response
     * <p><b>0</b> - Unexpected error
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param externalId Unique business external id, as given in businesssearch reponse.
     * @param registrationNumber Unique business registration number.
     * @param vatNumber Unique business VAT number.
     * @return GetBusinessInfo200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetBusinessInfo200Response> getBusinessInfo(String country, String accessTag, String externalId, String registrationNumber, String vatNumber) throws WebClientResponseException {
        ParameterizedTypeReference<GetBusinessInfo200Response> localVarReturnType = new ParameterizedTypeReference<GetBusinessInfo200Response>() {};
        return getBusinessInfoRequestCreation(country, accessTag, externalId, registrationNumber, vatNumber).bodyToMono(localVarReturnType);
    }

    /**
     * Get Business Information
     * The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 
     * <p><b>200</b> - A business information response
     * <p><b>0</b> - Unexpected error
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param externalId Unique business external id, as given in businesssearch reponse.
     * @param registrationNumber Unique business registration number.
     * @param vatNumber Unique business VAT number.
     * @return ResponseEntity&lt;GetBusinessInfo200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetBusinessInfo200Response>> getBusinessInfoWithHttpInfo(String country, String accessTag, String externalId, String registrationNumber, String vatNumber) throws WebClientResponseException {
        ParameterizedTypeReference<GetBusinessInfo200Response> localVarReturnType = new ParameterizedTypeReference<GetBusinessInfo200Response>() {};
        return getBusinessInfoRequestCreation(country, accessTag, externalId, registrationNumber, vatNumber).toEntity(localVarReturnType);
    }

    /**
     * Get Business Information
     * The get business information endpoint returns all already known business information. End user will have then to verify/correct it. 
     * <p><b>200</b> - A business information response
     * <p><b>0</b> - Unexpected error
     * @param country In which country to search. Format [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param externalId Unique business external id, as given in businesssearch reponse.
     * @param registrationNumber Unique business registration number.
     * @param vatNumber Unique business VAT number.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getBusinessInfoWithResponseSpec(String country, String accessTag, String externalId, String registrationNumber, String vatNumber) throws WebClientResponseException {
        return getBusinessInfoRequestCreation(country, accessTag, externalId, registrationNumber, vatNumber);
    }

    /**
     * Search Businesses
     * Check information regarding a legal entity. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param country In which country to search. Format: [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param nameExact Business exact name. Exclusive with &#x60;nameMatchBeginning&#x60; and &#x60;nameClosestKeywords&#x60;. 
     * @param nameMatchBeginning Business names begin with. Exclusive with &#x60;nameExact&#x60; and &#x60;nameClosestKeywords&#x60;. 
     * @param nameClosestKeywords Business names closed to keywords. Exclusive with &#x60;nameExact&#x60; and &#x60;nameMatchBeginning&#x60;. 
     * @param registrationNumber Business registration number. Required if the &#x60;vatNumber&#x60; isn&#39;t provided. 
     * @param vatNumber Business VAT number. Required if the &#x60;registrationNumber&#x60; isn&#39;t provided. 
     * @param phoneNumber Business phone number.
     * @param addressStreet Business&#39; street address.
     * @param addressCity Business&#39; city address.
     * @param addressPostalCode Business&#39; postal code address.
     * @return List&lt;SearchBusiness200ResponseInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec searchBusinessRequestCreation(String country, String accessTag, String nameExact, String nameMatchBeginning, String nameClosestKeywords, String registrationNumber, String vatNumber, String phoneNumber, String addressStreet, String addressCity, String addressPostalCode) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'country' is set
        if (country == null) {
            throw new WebClientResponseException("Missing the required parameter 'country' when calling searchBusiness", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "accessTag", accessTag));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "country", country));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameExact", nameExact));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameMatchBeginning", nameMatchBeginning));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "nameClosestKeywords", nameClosestKeywords));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "registrationNumber", registrationNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "vatNumber", vatNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "phoneNumber", phoneNumber));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addressStreet", addressStreet));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addressCity", addressCity));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "addressPostalCode", addressPostalCode));
        
        final String[] localVarAccepts = { 
            "application/json", "*/*"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<SearchBusiness200ResponseInner> localVarReturnType = new ParameterizedTypeReference<SearchBusiness200ResponseInner>() {};
        return apiClient.invokeAPI("/v1/businesssearchs", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Search Businesses
     * Check information regarding a legal entity. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param country In which country to search. Format: [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param nameExact Business exact name. Exclusive with &#x60;nameMatchBeginning&#x60; and &#x60;nameClosestKeywords&#x60;. 
     * @param nameMatchBeginning Business names begin with. Exclusive with &#x60;nameExact&#x60; and &#x60;nameClosestKeywords&#x60;. 
     * @param nameClosestKeywords Business names closed to keywords. Exclusive with &#x60;nameExact&#x60; and &#x60;nameMatchBeginning&#x60;. 
     * @param registrationNumber Business registration number. Required if the &#x60;vatNumber&#x60; isn&#39;t provided. 
     * @param vatNumber Business VAT number. Required if the &#x60;registrationNumber&#x60; isn&#39;t provided. 
     * @param phoneNumber Business phone number.
     * @param addressStreet Business&#39; street address.
     * @param addressCity Business&#39; city address.
     * @param addressPostalCode Business&#39; postal code address.
     * @return List&lt;SearchBusiness200ResponseInner&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Flux<SearchBusiness200ResponseInner> searchBusiness(String country, String accessTag, String nameExact, String nameMatchBeginning, String nameClosestKeywords, String registrationNumber, String vatNumber, String phoneNumber, String addressStreet, String addressCity, String addressPostalCode) throws WebClientResponseException {
        ParameterizedTypeReference<SearchBusiness200ResponseInner> localVarReturnType = new ParameterizedTypeReference<SearchBusiness200ResponseInner>() {};
        return searchBusinessRequestCreation(country, accessTag, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode).bodyToFlux(localVarReturnType);
    }

    /**
     * Search Businesses
     * Check information regarding a legal entity. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param country In which country to search. Format: [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param nameExact Business exact name. Exclusive with &#x60;nameMatchBeginning&#x60; and &#x60;nameClosestKeywords&#x60;. 
     * @param nameMatchBeginning Business names begin with. Exclusive with &#x60;nameExact&#x60; and &#x60;nameClosestKeywords&#x60;. 
     * @param nameClosestKeywords Business names closed to keywords. Exclusive with &#x60;nameExact&#x60; and &#x60;nameMatchBeginning&#x60;. 
     * @param registrationNumber Business registration number. Required if the &#x60;vatNumber&#x60; isn&#39;t provided. 
     * @param vatNumber Business VAT number. Required if the &#x60;registrationNumber&#x60; isn&#39;t provided. 
     * @param phoneNumber Business phone number.
     * @param addressStreet Business&#39; street address.
     * @param addressCity Business&#39; city address.
     * @param addressPostalCode Business&#39; postal code address.
     * @return ResponseEntity&lt;List&lt;SearchBusiness200ResponseInner&gt;&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<List<SearchBusiness200ResponseInner>>> searchBusinessWithHttpInfo(String country, String accessTag, String nameExact, String nameMatchBeginning, String nameClosestKeywords, String registrationNumber, String vatNumber, String phoneNumber, String addressStreet, String addressCity, String addressPostalCode) throws WebClientResponseException {
        ParameterizedTypeReference<SearchBusiness200ResponseInner> localVarReturnType = new ParameterizedTypeReference<SearchBusiness200ResponseInner>() {};
        return searchBusinessRequestCreation(country, accessTag, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode).toEntityList(localVarReturnType);
    }

    /**
     * Search Businesses
     * Check information regarding a legal entity. 
     * <p><b>200</b> - OK
     * <p><b>0</b> - Unexpected error
     * @param country In which country to search. Format: [ISO 3166-1 alpha-2](/guide/api-basics/data-format.html#countries) 
     * @param accessTag A unique identifier used to enforce [Idempotency](/guide/api-basics/idempotency.html). 
     * @param nameExact Business exact name. Exclusive with &#x60;nameMatchBeginning&#x60; and &#x60;nameClosestKeywords&#x60;. 
     * @param nameMatchBeginning Business names begin with. Exclusive with &#x60;nameExact&#x60; and &#x60;nameClosestKeywords&#x60;. 
     * @param nameClosestKeywords Business names closed to keywords. Exclusive with &#x60;nameExact&#x60; and &#x60;nameMatchBeginning&#x60;. 
     * @param registrationNumber Business registration number. Required if the &#x60;vatNumber&#x60; isn&#39;t provided. 
     * @param vatNumber Business VAT number. Required if the &#x60;registrationNumber&#x60; isn&#39;t provided. 
     * @param phoneNumber Business phone number.
     * @param addressStreet Business&#39; street address.
     * @param addressCity Business&#39; city address.
     * @param addressPostalCode Business&#39; postal code address.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec searchBusinessWithResponseSpec(String country, String accessTag, String nameExact, String nameMatchBeginning, String nameClosestKeywords, String registrationNumber, String vatNumber, String phoneNumber, String addressStreet, String addressCity, String addressPostalCode) throws WebClientResponseException {
        return searchBusinessRequestCreation(country, accessTag, nameExact, nameMatchBeginning, nameClosestKeywords, registrationNumber, vatNumber, phoneNumber, addressStreet, addressCity, addressPostalCode);
    }
}
