package javaProgram;

import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;

public class JsonObject {

	public static void main(String[] args) {
		JSONObject json=new JSONObject();
		Integer[] a= {2,3,4,5,6};
		json.put("key",a);
WebDriver sd=new ChromeDriver();

//RestAssured.given().get().then()

	}

}
