package com.example.api;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import org.json.JSONObject;

public class AddAPost
{
    public static void main(String[] args) {

        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        //JSON Payload
        JSONObject requestBody = new JSONObject();

        requestBody.put("title", "Sunday");
        requestBody.put("body", "Sunday is a holiday");
        requestBody.put("userId", 1);

        given().headers("Content-Type", "application/json")
                .body(requestBody.toString())
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .body("userId", equalTo(1))
                .body("title", equalTo("Sunday"))
                .body("body", equalTo("Sunday is a holiday"))
                .log().all();
    }
}
