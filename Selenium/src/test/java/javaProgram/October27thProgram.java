package javaProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class October27thProgram {

	public static void main(String[] args) {

		String paw = "Password";

		char[] ch = paw.toCharArray();
	//	WebDriver driver=new ChromeDriver();
	//	driver.findElement(By.className("")).click();

		Map<Character, Integer> map = new HashMap();

		for (Character c : ch) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		for (Entry<Character, Integer> keyValues : map.entrySet()) {
			System.out.println(" Char " + keyValues.getKey() + " Count " + keyValues.getValue());
		}

		/*
		 * Response res="";
		 * 
		 * List<Map<String,String>>list=res.jsonPath().getList("Authors");
		 * 
		 * for(Entry<String>) { System.out.println("Authoriss"+auth); }
		 */
		String pop = "xXHelloNaveenxXXAutomationXxXLabsXXxXJava";
		String p[] = pop.split("xX");
		System.out.print(p[0] + ":" + p[0].length());


	}

}
