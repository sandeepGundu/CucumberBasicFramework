package com.example.api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.json.JSONObject;

public class RestAssuredBasics_PUT
{
    public static void main(String[] args) {

        baseURI = "https://jsonplaceholder.typicode.com";

        //JSON Payload
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 1);
        requestBody.put("title", "updated foo");
        requestBody.put("body", "updated bar");
        requestBody.put("userId", 1);

        //PUT Request
        given()
                .headers("Content-Type", "application/json")
                .body(requestBody.toString())
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)// Validate status code
                .body("title", equalTo("updated foo"))// Validate response body
                .log().all();
    }
}
