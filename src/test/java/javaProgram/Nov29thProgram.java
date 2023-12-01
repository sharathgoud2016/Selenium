package javaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Nov29thProgram {

	public static void main(String[] args) {


		//List<String> list=new ArrayList();
		Map<String,String> map=new HashMap();
		Map<String,Object> maptwo=new HashMap();
		
		map.put("firstName", "John");
		map.put("lastName", "doe");
		maptwo.put("employee",map);
		
		Response res=RestAssured.given().when().put(maptwo.toString()).then().extract().response();
		
		
		

		
		

	}

}
