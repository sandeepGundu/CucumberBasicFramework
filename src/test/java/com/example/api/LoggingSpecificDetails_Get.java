package com.example.api;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;


public class LoggingSpecificDetails_Get
{
    public static void main(String[] args) {
        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        // GET Request with specific logging
        given()
                .log().headers()// Log only headers
                .when()
                .get("/posts/1")
                .then()
                .log().body() // Log only the response body
                .statusCode(200);
    }
}
