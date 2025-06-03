package utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class ApiUtils
{
    private RequestSpecification request;

    public ApiUtils() {
        // Initialize the RestAssured request specification
        request = RestAssured.given();
    }

    // Set base URI
    public void setBaseUri(String baseUri) {
        RestAssured.baseURI = baseUri;
    }

    // Add headers to the request
    public void addHeaders(Map<String, String> headers) {
        request.headers(headers);
    }

    // Add query parameters to the request
    public void addQueryParams(Map<String, String> queryParams) {
        request.queryParams(queryParams);
    }

    // Add body to the request
    public void addBody(Object body) {
        request.body(body);
    }

    // Send GET request
    public Response sendGet(String endpoint) {
        return request.get(endpoint);
    }

    // Send POST request
    public Response sendPost(String endpoint) {
        return request.post(endpoint);
    }

    // Send PUT request
    public Response sendPut(String endpoint) {
        return request.put(endpoint);
    }

    // Send DELETE request
    public Response sendDelete(String endpoint) {
        return request.delete(endpoint);
    }
}
