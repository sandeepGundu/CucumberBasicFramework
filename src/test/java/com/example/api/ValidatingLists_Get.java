package com.example.api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class ValidatingLists_Get
{
    public static void main(String[] args) {
        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        // GET Request to validate a list
        given()
                .log().all()
                .when()
                .get("/posts")
                .then()
                .log().all()
                .statusCode(200)
                .body("userId", hasItem(1))// Validate that userId 1 exists in the response
                .log().all();
    }
}
