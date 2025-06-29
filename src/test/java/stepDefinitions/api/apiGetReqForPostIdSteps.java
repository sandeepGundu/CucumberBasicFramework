package stepDefinitions.api;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class apiGetReqForPostIdSteps
{
    private String endpoint;

    @Given("the API endpoint is {string}")
    public void the_api_endpoint_is(String endpointURL)
    {
        endpoint = endpointURL;
    }

    @When("I send a GET request")
    public void i_send_a_get_request()
    {
        given()
                .queryParams("userId", 1)
                .when()
                .get(endpoint)
                .then()
                //.statusCode(200)
                .log().all();
    }

    @When("I send a GET request with userId value {int}")
    public void i_send_a_get_request_with_userId_value(Integer userIdVal)
    {
        given()
                .queryParams("userId", 1)
                .when()
                .get(endpoint)
                .then()
                //.statusCode(200)
                .log().all();
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(int statusCode)
    {
        given()
                .when()
                .get(endpoint)
                .then()
                .statusCode(statusCode);
    }

    @Then("the response body should contain {string} as {int}")
    public void the_response_body_should_contain_as(String key, int value)
    {
        given()
                .when()
                .get(endpoint)
                .then()
                .body(key, equalTo(value));
    }

    @Then("the response body should contain {string} as {string}")
    public void the_response_body_should_contain_as(String key, String value)
    {
        given()
                .when()
                .get(endpoint)
                .then()
                .body(key, equalTo(value))
                .log().all();
    }

    /*@Then("the response should contain the following {}")
    public void the_response_should_contain_the_following(DataTable dataTable)
    {
        List<Integer> expectedUserIds = dataTable.asList(Integer.class);

        given()
                .when()
                .get(endpoint)
                .then()
                .body("userId", hasItems(expectedUserIds.toArray())); // Validate list of userIds
    }*/

    @Then("the response should contain the following userId value {int}")
    public void the_response_should_contain_the_following_user_id_value(Integer int1) {
        Response response = given()
                .queryParams("userId", int1)
                .when()
                .get(endpoint)
                .then()
                .statusCode(200)
                .extract().response();

        // Parse the response as a list of maps (each item is a map of key-value pairs)
        List<Map<String, Object>> responseList = response.jsonPath().getList("$");

        // Get the total number of items in the list
        int totalItems = responseList.size();
        System.out.println("Total number of items in the response: " + totalItems);

        // Iterate over the list and validate each item
        for (int i = 0; i < totalItems; i++) {
            // Fetch one item at a time
            Map<String, Object> item = responseList.get(i);

            // Extract the userId value from the item
            int actualUserId = (int) item.get("userId");

            // Verify if the userId matches the expected value
            if (actualUserId == int1) {
                // If userId matches, skip the item
                System.out.println("Item " + (i + 1) + " is valid. Skipping...");
            } else {
                // If userId does not match, display an assertion message with item details
                System.out.println("Assertion failed for item: " + item);
                assertThat("UserId in the item does not match the expected value!",
                        actualUserId, equalTo(int1));
            }
        }
    }

    /*@Then("the response should contain the following userId value {int}")
    public void the_response_should_contain_the_following_userId_value(Integer userIdVal)
    {

        Response response = given()
                .queryParams("userId", userIdVal)
                .when()
                .get(endpoint)
                .then()
                .statusCode(200)
                .extract().response();

        // Parse the response as a list of maps (each item is a map of key-value pairs)
        List<Map<String, Object>> responseList = response.jsonPath().getList("$");

        // Get the total number of items in the list
        int totalItems = responseList.size();
        System.out.println("Total number of items in the response: " + totalItems);

        // Iterate over the list and validate each item
        for (int i = 0; i < totalItems; i++) {
            // Fetch one item at a time
            Map<String, Object> item = responseList.get(i);

            // Extract the userId value from the item
            int actualUserId = (int) item.get("userId");

            // Verify if the userId matches the expected value
            if (actualUserId == userIdVal) {
                // If userId matches, skip the item
                System.out.println("Item " + (i + 1) + " is valid. Skipping...");
            } else {
                // If userId does not match, display an assertion message with item details
                System.out.println("Assertion failed for item: " + item);
                assertThat("UserId in the item does not match the expected value!",
                        actualUserId, equalTo(userIdVal));
            }
        }
    }*/
}
