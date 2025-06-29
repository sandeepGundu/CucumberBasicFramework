package com.example.api;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class GetUsers
{
    public static void main(String[] args) {

        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        given().when().get("/users")
                .then()
                .statusCode(200)
                .log().all();
    }
}
