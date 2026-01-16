package javaProgram;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.File;

import io.restassured.module.jsv.JsonSchemaValidator;

public class SchemaValidationExample {

    public static void main(String[] args) {
        RestAssured.baseURI = "https://reqres.in"; // Replace with your API base URI

        Response response = given()
            .when()
                .get("/api/users?page=2") // Replace with your API endpoint
            .then()
                .statusCode(200)
                .assertThat()
                .body(JsonSchemaValidator.matchesJsonSchema(new File("D:\\Selenium_workspace\\rma-qa\\src\\test\\resources\\response-schema.json"))) // Perform schema validation
                .extract()
                .response();
        
      
        

        // Perform further assertions or processing on the response
    }
}
