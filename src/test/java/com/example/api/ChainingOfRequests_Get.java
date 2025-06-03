package com.example.api;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class ChainingOfRequests_Get
{
    public static void main(String[] args) {

        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        // GET Request to fetch a post
        Response response = given()
                .when()
                .get("/posts/1")
                .then()
                .statusCode(200)
                .extract().response();// Extract the response

        //Extract a value from the response
        int userId = response.jsonPath().getInt("userId");

        // Use the extracted value in another request
        given()
                .queryParam("userId", userId)
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .log().all();

    }
}
