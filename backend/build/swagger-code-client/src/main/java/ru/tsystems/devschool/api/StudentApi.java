package ru.tsystems.devschool.api;

import ru.tsystems.devschool.invoker.ApiClient;

import ru.tsystems.devschool.model.ErrorDto;
import ru.tsystems.devschool.model.SearchStudentsDto;
import ru.tsystems.devschool.model.StudentDto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-09-02T08:39:58.518+03:00")
@Component("ru.tsystems.devschool.api.StudentApi")
public class StudentApi {
    private ApiClient apiClient;

    public StudentApi() {
        this(new ApiClient());
    }

    @Autowired
    public StudentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Studen
     * API for creating a new Studen
     * <p><b>201</b> - Successfully created
     * <p><b>400</b> - Bad request
     * <p><b>409</b> - Conflict
     * <p><b>500</b> - Internal server error
     * @param studentDto StudentDto
     * @return StudentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StudentDto createStudent(StudentDto studentDto) throws RestClientException {
        Object postBody = studentDto;
        
        // verify the required parameter 'studentDto' is set
        if (studentDto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'studentDto' when calling createStudent");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/student").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<StudentDto> returnType = new ParameterizedTypeReference<StudentDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Get Student by id
     * API for getting Student by id
     * <p><b>200</b> - Successfully found
     * <p><b>400</b> - Bad request
     * <p><b>404</b> - Not found
     * <p><b>500</b> - Internal server error
     * @param id The id parameter
     * @return StudentDto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StudentDto getStudent(Long id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getStudent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = UriComponentsBuilder.fromPath("/api/student/{id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<StudentDto> returnType = new ParameterizedTypeReference<StudentDto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Gets list of Students by criteria
     * API for searching Students by criteria
     * <p><b>200</b> - Successfully get
     * <p><b>400</b> - Bad request
     * <p><b>500</b> - Internal server error
     * @param body SearchStudentsDto
     * @return List&lt;StudentDto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StudentDto> getStudentsByCriteria(SearchStudentsDto body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling getStudentsByCriteria");
        }
        
        String path = UriComponentsBuilder.fromPath("/api/student/search").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<StudentDto>> returnType = new ParameterizedTypeReference<List<StudentDto>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
