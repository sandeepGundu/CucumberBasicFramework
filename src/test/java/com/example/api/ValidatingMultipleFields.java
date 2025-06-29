package com.example.api;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ValidatingMultipleFields
{
    public static void main(String[] args) {
        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        // GET Request with multiple validations
        given()
                .when()
                .get("/posts/1")
                .then()
                .body("userId", equalTo(1))
                .body("id", equalTo(1))
                .body("title", notNullValue())
                .log().all();

    }
}
