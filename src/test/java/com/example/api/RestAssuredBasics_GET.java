package com.example.api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class RestAssuredBasics_GET
{
    public static void main(String[] args) {
        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        //GET Request
        given().when().get("/posts/1").then().statusCode(200) // Validate status code
                .body("id", equalTo(1))// Validate response body
                .body("title", notNullValue())// Validate title is not null
                .log().all();// Log the response
    }
}
