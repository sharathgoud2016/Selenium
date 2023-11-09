package APIRestAssured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Map;

public class RestAssuredExample {

    
    public static void main(String[] args) {
        // Define the base URL for your API
        RestAssured.baseURI = "https://reqres.in"; // Replace with your actual base URL

        // Send a GET request
        Response response = RestAssured
                .given()
                .when()
                .get("/api/users?page=2"); // Specify the endpoint you want to access

        // Validate the response status code
        response.then().statusCode(200);

        // Extract the JSON response as a map
        Map<String, Object> jsonResponse = response.jsonPath().getMap("");
        System.out.println(jsonResponse);     
        // Extract the "data" array
        List<Map<String, Object>> dataArray = (List<Map<String, Object>>) jsonResponse.get("data");

        // Iterate through the array and access individual elements
        for (Map<String, Object> item : dataArray) {
            System.out.println("ID: " + item.get("id"));
            System.out.println("Email: " + item.get("email"));
            System.out.println("First Name: " + item.get("first_name"));
            System.out.println("Last Name: " + item.get("last_name"));
            System.out.println("Avatar URL: " + item.get("avatar"));
            System.out.println();
        }
    }
}

