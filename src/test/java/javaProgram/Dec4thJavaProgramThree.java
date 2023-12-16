package javaProgram;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Dec4thJavaProgramThree {

	public static void main(String[] args) {
		RestAssured.baseURI="Baseuri";
		String s="{\r\n"
				+ "    \"firstName\": \"John\",\r\n"
				+ "    \"lastName\": \"doe\",\r\n"
				+ "    \"executiveSummary\": \"Below, you will find a proposal, etc. etc.\",\r\n"
				+ "    \"products\": [\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"test product\",\r\n"
				+ "            \"quantity\": 5,\r\n"
				+ "            \"price\": 10,\r\n"
				+ "            \"total\": 50\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		
		Response res=RestAssured.given().header("","").body(s).when().post("endpoint");
		ValidatableResponse statuscode=res.then().statusCode(200);
		String str=res.jsonPath().getString("firstName");
		

	}

}
