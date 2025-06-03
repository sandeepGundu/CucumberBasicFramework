package com.example.api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;

public class RestAssuredBasics_POST
{
    public static void main(String[] args) {

        baseURI = "https://jsonplaceholder.typicode.com";

        //JSON Payload
        JSONObject requestBody = new JSONObject();
        requestBody.put("title", "foo");
        requestBody.put("body", "bar");
        requestBody.put("userId", 1);

        //POST Request
        given().headers("Content-Type", "application/json")// Set header
                .body(requestBody.toString())// Attach payload
                .when().post("/posts")
                .then()
                .statusCode(201)// Validate status code
                .body("title", equalTo("foo"))// Validate response body
                .log().all();// Log the response
    }
}
