package APIRestAssured;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import java.util.List;
import java.util.Map;

public class RestAssuredExample {

    
    public static void main(String[] args) {
        // Define the base URL for your API
        RestAssured.baseURI = "https://reqres.in"; // Replace with your actual base URL

        // Send a GET request
        Response response = RestAssured
                .given().header("Content-Type","application/json")
                .when()
                .get("/api/users?page=2"); // Specify the endpoint you want to access

        // Validate the response status code
        response.then().log().all();
        response.then().statusCode(200);
        response.then().header("Content-Type", Matchers.equalTo("application/json; charset=utf-8"));

        // Extract the JSON response as a map
        List<Map<String, Object>> jsonResponse = response.jsonPath().getList("data");
        System.out.println(jsonResponse);     
       

        // Iterate through the array and access individual elements
        for (Map<String, Object> item : jsonResponse) {
            System.out.println("ID: " + item.get("id"));
            System.out.println("Email: " + item.get("email"));
            System.out.println("First Name: " + item.get("first_name"));
            System.out.println("Last Name: " + item.get("last_name"));
            System.out.println("Avatar URL: " + item.get("avatar"));
            System.out.println();
            
           
            
        }
        Headers allHeaders=response.headers();
        for(Header head:allHeaders)
        {
        	System.out.println("All Headers keys "+head.getName()+"All Headers keys "+head.getValue());
        }
    }
}

