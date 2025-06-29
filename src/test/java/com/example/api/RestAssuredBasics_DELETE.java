package com.example.api;

import static io.restassured.RestAssured.*;

public class RestAssuredBasics_DELETE
{
    public static void main(String[] args) {

        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        //DELETE Request
        given()
                .when()
                .delete("posts/1")
                .then()
                .statusCode(200)// Validate status code
                .log().all();
    }
}
