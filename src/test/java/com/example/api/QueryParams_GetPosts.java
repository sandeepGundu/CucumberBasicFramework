package com.example.api;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class QueryParams_GetPosts
{
    public static void main(String[] args) {

        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        given().queryParams("userId", 1)
                .when()
                .get("/posts")
                .then()
                .statusCode(200)
                .log().all();
    }
}
