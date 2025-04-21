package com.sdk.treezor.api;

import com.sdk.treezor.ApiClient;

import com.sdk.treezor.model.DefaultError;
import com.sdk.treezor.model.GetTemplate200Response;
import com.sdk.treezor.model.GetTemplateExample200Response;
import com.sdk.treezor.model.GetTemplateVariables200Response;
import com.sdk.treezor.model.GetTemplates200Response;
import com.sdk.treezor.model.PutTemplateUploadRequest;

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
public class ApiTemplatesApi {
    private ApiClient apiClient;

    public ApiTemplatesApi() {
        this(new ApiClient());
    }

    @Autowired
    public ApiTemplatesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    
    /**
     * Delete Template
     * Delete a Template.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec deleteTemplateRequestCreation(String templateName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new WebClientResponseException("Missing the required parameter 'templateName' when calling deleteTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("templateName", templateName);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "OAuth2" };

        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI("/customization/templates/{templateName}", HttpMethod.DELETE, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Delete Template
     * Delete a Template.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> deleteTemplate(String templateName) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteTemplateRequestCreation(templateName).bodyToMono(localVarReturnType);
    }

    /**
     * Delete Template
     * Delete a Template.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> deleteTemplateWithHttpInfo(String templateName) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return deleteTemplateRequestCreation(templateName).toEntity(localVarReturnType);
    }

    /**
     * Delete Template
     * Delete a Template.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec deleteTemplateWithResponseSpec(String templateName) throws WebClientResponseException {
        return deleteTemplateRequestCreation(templateName);
    }

    /**
     * Get Template
     * Retrieve the currently configured template.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return GetTemplate200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTemplateRequestCreation(String templateName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new WebClientResponseException("Missing the required parameter 'templateName' when calling getTemplate", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("templateName", templateName);

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

        ParameterizedTypeReference<GetTemplate200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplate200Response>() {};
        return apiClient.invokeAPI("/customization/templates/{templateName}/template", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Template
     * Retrieve the currently configured template.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return GetTemplate200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetTemplate200Response> getTemplate(String templateName) throws WebClientResponseException {
        ParameterizedTypeReference<GetTemplate200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplate200Response>() {};
        return getTemplateRequestCreation(templateName).bodyToMono(localVarReturnType);
    }

    /**
     * Get Template
     * Retrieve the currently configured template.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return ResponseEntity&lt;GetTemplate200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetTemplate200Response>> getTemplateWithHttpInfo(String templateName) throws WebClientResponseException {
        ParameterizedTypeReference<GetTemplate200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplate200Response>() {};
        return getTemplateRequestCreation(templateName).toEntity(localVarReturnType);
    }

    /**
     * Get Template
     * Retrieve the currently configured template.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTemplateWithResponseSpec(String templateName) throws WebClientResponseException {
        return getTemplateRequestCreation(templateName);
    }

    /**
     * Build Template Example
     * Test your template by building one with dummy values.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return GetTemplateExample200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTemplateExampleRequestCreation(String templateName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new WebClientResponseException("Missing the required parameter 'templateName' when calling getTemplateExample", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("templateName", templateName);

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

        ParameterizedTypeReference<GetTemplateExample200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplateExample200Response>() {};
        return apiClient.invokeAPI("/customization/templates/{templateName}/example", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Build Template Example
     * Test your template by building one with dummy values.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return GetTemplateExample200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetTemplateExample200Response> getTemplateExample(String templateName) throws WebClientResponseException {
        ParameterizedTypeReference<GetTemplateExample200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplateExample200Response>() {};
        return getTemplateExampleRequestCreation(templateName).bodyToMono(localVarReturnType);
    }

    /**
     * Build Template Example
     * Test your template by building one with dummy values.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return ResponseEntity&lt;GetTemplateExample200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetTemplateExample200Response>> getTemplateExampleWithHttpInfo(String templateName) throws WebClientResponseException {
        ParameterizedTypeReference<GetTemplateExample200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplateExample200Response>() {};
        return getTemplateExampleRequestCreation(templateName).toEntity(localVarReturnType);
    }

    /**
     * Build Template Example
     * Test your template by building one with dummy values.
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTemplateExampleWithResponseSpec(String templateName) throws WebClientResponseException {
        return getTemplateExampleRequestCreation(templateName);
    }

    /**
     * Get Template Variables
     * Retrieve the list of variables for the given template
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return GetTemplateVariables200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTemplateVariablesRequestCreation(String templateName) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new WebClientResponseException("Missing the required parameter 'templateName' when calling getTemplateVariables", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("templateName", templateName);

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

        ParameterizedTypeReference<GetTemplateVariables200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplateVariables200Response>() {};
        return apiClient.invokeAPI("/customization/templates/{templateName}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Template Variables
     * Retrieve the list of variables for the given template
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return GetTemplateVariables200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetTemplateVariables200Response> getTemplateVariables(String templateName) throws WebClientResponseException {
        ParameterizedTypeReference<GetTemplateVariables200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplateVariables200Response>() {};
        return getTemplateVariablesRequestCreation(templateName).bodyToMono(localVarReturnType);
    }

    /**
     * Get Template Variables
     * Retrieve the list of variables for the given template
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return ResponseEntity&lt;GetTemplateVariables200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetTemplateVariables200Response>> getTemplateVariablesWithHttpInfo(String templateName) throws WebClientResponseException {
        ParameterizedTypeReference<GetTemplateVariables200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplateVariables200Response>() {};
        return getTemplateVariablesRequestCreation(templateName).toEntity(localVarReturnType);
    }

    /**
     * Get Template Variables
     * Retrieve the list of variables for the given template
     * <p><b>200</b> - OK
     * @param templateName The name of the Template.
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTemplateVariablesWithResponseSpec(String templateName) throws WebClientResponseException {
        return getTemplateVariablesRequestCreation(templateName);
    }

    /**
     * Get Available Templates
     * Retrieve the list of templates.
     * <p><b>200</b> - OK
     * @return GetTemplates200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getTemplatesRequestCreation() throws WebClientResponseException {
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

        ParameterizedTypeReference<GetTemplates200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplates200Response>() {};
        return apiClient.invokeAPI("/customization/templates", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Available Templates
     * Retrieve the list of templates.
     * <p><b>200</b> - OK
     * @return GetTemplates200Response
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<GetTemplates200Response> getTemplates() throws WebClientResponseException {
        ParameterizedTypeReference<GetTemplates200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplates200Response>() {};
        return getTemplatesRequestCreation().bodyToMono(localVarReturnType);
    }

    /**
     * Get Available Templates
     * Retrieve the list of templates.
     * <p><b>200</b> - OK
     * @return ResponseEntity&lt;GetTemplates200Response&gt;
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<GetTemplates200Response>> getTemplatesWithHttpInfo() throws WebClientResponseException {
        ParameterizedTypeReference<GetTemplates200Response> localVarReturnType = new ParameterizedTypeReference<GetTemplates200Response>() {};
        return getTemplatesRequestCreation().toEntity(localVarReturnType);
    }

    /**
     * Get Available Templates
     * Retrieve the list of templates.
     * <p><b>200</b> - OK
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec getTemplatesWithResponseSpec() throws WebClientResponseException {
        return getTemplatesRequestCreation();
    }

    /**
     * Upload Template
     * Upload a replacement for an existing Template.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param templateName The name of the Template.
     * @param putTemplateUploadRequest The putTemplateUploadRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec putTemplateUploadRequestCreation(String templateName, PutTemplateUploadRequest putTemplateUploadRequest) throws WebClientResponseException {
        Object postBody = putTemplateUploadRequest;
        // verify the required parameter 'templateName' is set
        if (templateName == null) {
            throw new WebClientResponseException("Missing the required parameter 'templateName' when calling putTemplateUpload", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("templateName", templateName);

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
        return apiClient.invokeAPI("/customization/templates/{templateName}/template", HttpMethod.PUT, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Upload Template
     * Upload a replacement for an existing Template.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param templateName The name of the Template.
     * @param putTemplateUploadRequest The putTemplateUploadRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> putTemplateUpload(String templateName, PutTemplateUploadRequest putTemplateUploadRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return putTemplateUploadRequestCreation(templateName, putTemplateUploadRequest).bodyToMono(localVarReturnType);
    }

    /**
     * Upload Template
     * Upload a replacement for an existing Template.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param templateName The name of the Template.
     * @param putTemplateUploadRequest The putTemplateUploadRequest parameter
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<ResponseEntity<Void>> putTemplateUploadWithHttpInfo(String templateName, PutTemplateUploadRequest putTemplateUploadRequest) throws WebClientResponseException {
        ParameterizedTypeReference<Void> localVarReturnType = new ParameterizedTypeReference<Void>() {};
        return putTemplateUploadRequestCreation(templateName, putTemplateUploadRequest).toEntity(localVarReturnType);
    }

    /**
     * Upload Template
     * Upload a replacement for an existing Template.
     * <p><b>201</b> - Created
     * <p><b>400</b> - Bad Request
     * @param templateName The name of the Template.
     * @param putTemplateUploadRequest The putTemplateUploadRequest parameter
     * @return ResponseSpec
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public ResponseSpec putTemplateUploadWithResponseSpec(String templateName, PutTemplateUploadRequest putTemplateUploadRequest) throws WebClientResponseException {
        return putTemplateUploadRequestCreation(templateName, putTemplateUploadRequest);
    }
}
