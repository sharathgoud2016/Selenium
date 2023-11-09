package JavaProgram;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static  io.restassured.RestAssured.given;

import java.time.Duration;

import org.hamcrest.Matchers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RestAssuredExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	WebDriver driver=new ChromeDriver();
	//.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		Response res=given().body("").when().post("/todos/1").then().extract().response();
	    boolean completed=res.asString().matches("completed");
	    System.out.println(res.asString());
		System.out.println(completed);
		res.then().assertThat().statusCode(200);
		res.then().assertThat().body("title", Matchers.equalTo("delectus aut autem"));

	}

}
