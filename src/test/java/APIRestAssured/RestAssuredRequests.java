package APIRestAssured;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Assertions;

import com.aventstack.extentreports.util.Assert;

import static io.restassured.RestAssured.given;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RestAssuredRequests {

	public static void main(String[] args)
	{
   
   
        RestAssured.baseURI = "https://reqres.in";
    

   
        Response response = given()
                .header("Content-type", "application/json").when()
                .get("/api/users?page=2")
                .then()
                .extract().response();
        System.out.println(response.asString());
        System.out.println("Get Status Code"+response.statusCode());
        System.out.println("Page Value"+response.jsonPath().getInt("page"));
        System.out.println(response.asString());
        System.out.println(response.jsonPath().getList("data").size());
        System.out.println(response.jsonPath().getList("data").get(1).toString());
       // List<Map<String,Object>> list=response.jsonPath().getList("data.id");
      
        List<String> list=response.jsonPath().getList("data.email"); 
        for(String str:list)
        {
        	System.out.println(str);
        	
        }
        System.out.println(response.jsonPath().getInt("data[0].id"));
        List<String> listOne=response.jsonPath().getList("data");
        for(int k=0;k<listOne.size();k++)
        {
            int p=response.jsonPath().getInt("data["+k+"].id");
            System.out.println(p);
            if(p>0)
            {
            	System.out.println("Valid");
            }
        }
        
      //  JsonObject jsobj=new JsonObject();
        
    }
}