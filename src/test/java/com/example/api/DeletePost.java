package com.example.api;

import static io.restassured.RestAssured.*;

public class DeletePost
{
    public static void main(String[] args) {

        //Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        given().when().delete("/posts/1")
                .then()
                .statusCode(200);

    }
}
