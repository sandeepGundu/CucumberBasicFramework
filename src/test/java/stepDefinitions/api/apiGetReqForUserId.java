package stepDefinitions.api;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.poi.hssf.record.pivottable.StreamIDRecord;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.codehaus.groovy.runtime.InvokerHelper.asList;

public class apiGetReqForUserId
{
    @Given("the following user IDs:")
    public void the_following_user_ids(DataTable dataTable) {
        // Transform DataTable to List<String>
       List<String> userIds = dataTable.asList(String.class);
        //List<Integer> userIds = dataTable.asList(Integer.class);
        System.out.println("User IDs: " + userIds);

        // Example: Iterate through the list
        for (String userId : userIds) {
            System.out.println("Processing user ID: " + userId);
        }
    }

    /*@Given("the following user IDs:")
    public void the_following_user_ids(DataTable dataTable) {
        // Transform DataTable to List<Integer>
        List<Integer> userIds = dataTable.asList(Integer.class);
        System.out.println("User IDs: " + userIds);

        // Example: Iterate through the list
        for (Integer userId : userIds) {
            System.out.println("Processing user ID: " + userId);
        }
    }*/

    /*@Given("the following user IDs:")
    public void the_following_user_ids(DataTable dataTable) {
        List<Integer> userIds = dataTable.asList(Integer.class); // Convert DataTable to List
        System.out.println("User IDs: " + userIds);
    }*/

    @When("I send a GET request for each user ID")
    public void i_send_a_get_request_for_each_user_id(DataTable dataTable) {
        List<String> userIds = dataTable.asList(String.class);

        for (String userId : userIds) {
            given()
                    .when()
                    .get("https://jsonplaceholder.typicode.com/users/" + userId)
                    .then()
                    .statusCode(200)
                    .log().all();
        }
    }
}



