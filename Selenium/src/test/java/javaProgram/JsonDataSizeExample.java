package javaProgram;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;

import java.util.Arrays;
import java.util.List;

public class JsonDataSizeExample {

    public static void main(String[] args) {
        // Define the base URL of your REST API
        RestAssured.baseURI = "https://reqres.in";

        // Perform an HTTP GET request to get the JSON response
        Response response = given()
                .get("/api/users?page=2"); // Replace with your resource path

        // Parse the JSON response into a JSONObject
        JSONObject jsonResponse = new JSONObject(response.getBody().asString());

        // Access the "data" array and get its size
        JSONArray dataArray = jsonResponse.getJSONArray("data");
        int dataSize = dataArray.length();
        // Print the size of the "data" array
        System.out.println("Size of 'data' array: " + dataSize);
       for(int k=0;k<dataSize;k++)
       {
    	   String s=dataArray.get(k).toString();
    	   System.out.println(s);
       }
        
    }
}