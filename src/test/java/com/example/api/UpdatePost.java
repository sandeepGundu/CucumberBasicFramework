package com.example.api;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

public class UpdatePost
{
    public static void main(String[] args) {

        baseURI = "https://jsonplaceholder.typicode.com";

        //JSON Payload
        JSONObject requestBody = new JSONObject();
        requestBody.put("id", 1);
        requestBody.put("title", "Monday");
        requestBody.put("body", "Monday is a first working of the week");
        requestBody.put("userId", 1);

        //PUT Request
        given()
                .headers("Content-Type", "application/json")
                .body(requestBody.toString())
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200)// Validate status code
                .body("title", equalTo("Monday"))// Validate response body
                .body("body", equalTo("Monday is a first working of the week"))
                .log().all();
    }
}
