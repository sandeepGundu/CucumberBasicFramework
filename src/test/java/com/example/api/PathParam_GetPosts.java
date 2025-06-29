package com.example.api;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PathParam_GetPosts
{
    public static void main(String[] args) {

        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        given().pathParams("id", 1)
                .when()
                .get("/posts/{id}")
                .then()
                .statusCode(200)
                .body("id", equalTo(1))
                .log().all();
    }
}
