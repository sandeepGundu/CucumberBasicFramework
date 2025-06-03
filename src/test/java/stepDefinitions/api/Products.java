package stepDefinitions.api;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

public class Products
{
    public Response response;
    public int ResponseCode;
    public ResponseBody responseBody;

    @Given("I hit the url of get products api endpoint")
    public void i_hit_the_url_of_get_products_api_endpoint()
    {
        baseURI = "https://fakestoreapi.com";
    }

    @When("I pass the url of products in the request")
    public void i_pass_the_url_of_products_in_the_request()
    {
        response = given()
                .get("/products");
    }

    @Then("I receive the response code as {int}")
    public void i_receive_the_response_code_as(int responseCode)
    {
        ResponseCode = response.getStatusCode();
        assertEquals(ResponseCode, responseCode);
    }

    @Then("I verify that the rate of the first product is {}")
    public void i_verify_that_the_rate_of_the_first_product_is()
    {
        responseBody = response.getBody();

        //Convert response body to string
        String body = responseBody.asString();

        //JSON Representation from Response body
        JsonPath jsonPath = response.jsonPath();

        String s = jsonPath.getJsonObject("rating[0]/rate").toString();

    }

}
