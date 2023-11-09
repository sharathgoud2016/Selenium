package JavaProgram;

import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;

import com.aventstack.extentreports.util.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ReqResOneExample {

	public static void main(String[] args) {

        Root root=new Root();
        root.setName("morpheus");
        root.setJob("leader");
		RestAssured.baseURI="https://reqres.in/";
         
         Response res=RestAssured.given().when().get("api/users?page=2");
         List list=res.jsonPath().getList("data");
         System.out.println(list.size());
         String str=res.jsonPath().getString("data[0].email");
         System.out.println(str);
         Response resPost=RestAssured.given().body(root).when().post("api/users");
         int statusCodePost=resPost.getStatusCode();
         System.out.println(statusCodePost);
         List<Map<String,Object>> listMap=res.jsonPath().getList("data");
         int legth=listMap.size();
         for(Map<String,Object> map:listMap)
         { 
        	 	 
				
				  String idString=map.get("id").toString();
				  Integer id=Integer.valueOf(idString);
				  System.out.println(id);
						 
         }
    //     res.then().assertThat().body(legth, Matchers.hasItem(null));
         for(int i=0;i<legth;i++)
         {
        	 ValidatableResponse vres=res.then().assertThat().body("data["+i+"].email",Matchers.instanceOf(String.class));
        	 System.out.println(res.then().assertThat().body("data["+i+"].email",Matchers.equalTo("michael.lawson@reqres.in")));
         System.out.println(res.then().assertThat().body("data["+i+"].email",Matchers.instanceOf(String.class)));
         }
         

	}

}
