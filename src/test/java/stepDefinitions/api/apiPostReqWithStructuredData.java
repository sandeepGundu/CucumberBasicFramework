package stepDefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.json.JSONObject;
import utils.ScenarioContext;

import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import io.restassured.response.Response;

public class apiPostReqWithStructuredData
{
    private String requestBody; // Declare requestBody as a class-level variable
    ScenarioContext scenarioContext = new ScenarioContext();
    private Response response;

    @Given("the request body is:")
    public void the_request_body_is(io.cucumber.datatable.DataTable dataTable) {
        // Convert DataTable to a Map
        Map<String, String> requestBodyMap = dataTable.asMap(String.class, String.class);

        // Create a JSON payload using the Map
        JSONObject jsonPayload = new JSONObject(requestBodyMap);

        // Assign the JSON payload to the class-level variable
        this.requestBody = jsonPayload.toString();
    }

    @When("I send a POST request")
    public void i_send_a_post_request()
    {
        // Base URI
        baseURI = "https://jsonplaceholder.typicode.com";

        // Send POST request using the requestBody
        response = given()
                .header("Content-Type", "application/json")
                .body(requestBody) // Use the class-level variable
                .when()
                .post("/posts")
                .then()
                .statusCode(201) // Validate status code
                .body("title", equalTo("foo"))
                .log().all() // Log the response
                .extract().response();
    }

    /*@Given("the request body is:")
    public void the_request_body_is(io.cucumber.datatable.DataTable dataTable) {
        Map<String, String> requestBodyMap = dataTable.asMap(String.class, String.class);
        JSONObject jsonPayload = new JSONObject(requestBodyMap);
        scenarioContext.set("requestBody", jsonPayload.toString());
    }

    @When("I send a POST request")
    public void i_send_a_post_request() {
        String requestBody = (String) scenarioContext.get("requestBody");
        System.out.println(requestBody);
        given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/posts")
                .then()
                .statusCode(201)
                .log().all();
    }*/
}
