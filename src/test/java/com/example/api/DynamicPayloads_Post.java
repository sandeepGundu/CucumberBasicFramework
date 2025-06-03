package com.example.api;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class DynamicPayloads_Post
{
    public static void main(String[] args) {
        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        // Dynamic JSON Payload using Map
        Map<String, Object> requestBody = new HashMap<>();
        requestBody.put("title", "foo");
        requestBody.put("body", "bar");
        requestBody.put("userId", 1);

        //POST Request
        given().header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().all();
    }
}
