package javaProgram;

import static io.restassured.RestAssured.*;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import static org.hamcrest.Matchers.*;

import java.util.List;

public class SampleProgram {

	public static void main(String[] args) {

		RestAssured.baseURI = "https://reqres.in/api"; // Base URI of the Reqres API
		Response response = given().when().get("/users?page=2").then().statusCode(200).assertThat().body("data[0].email",equalTo("michael.lawson@reqres.in")).extract().response();
        JsonPath jspath=response.jsonPath();
        String total=jspath.getString("data[0].email");
        System.out.println("sharath"+total);
        List<String> jsa=jspath.getList("data.first_name");
        System.out.println(jsa.size());
        for(int i=0;i<jsa.size();i++)
        {
        	System.out.println(jsa.get(i));
        }
		String res = response.asString();
		System.out.println(res);
		JSONObject js = new JSONObject(res);
		JSONArray jsArray = js.getJSONArray("data");
		for (int i = 0; i < jsArray.length(); i++) {

			String lastname = jsArray.getJSONObject(i).getString("last_name");
			System.out.println("LastName " + lastname);
		}

		System.out.println(jsArray.get(1));
		System.out.println("Total number of data entries on page 1: " + jsArray.length());
	}
}
