package javaProgram;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.util.HashMap;
import java.util.Map;

import org.apache.poi.util.SystemOutLogger;
public class SampleProgExample {

	public static void main(String[] args) {
		
		RestAssured.baseURI="https://reqres.in";
		Response res=given().when().get("api/users?page=2").then().extract().response();
	    int a=res.jsonPath().getList("data").size();
	    System.out.println("Size of Data array "+a);
		System.out.println(res.asString());
		System.out.println(res.asString());
		Map<String,Object> map=new HashMap();
		map.put("Phone", 123456);
		map.put("Name", "hello");
		JsonPath jsontoString=new JsonPath(res.asString());
		System.out.println(jsontoString.getString("page"));
		
		

	}

}
