package APIRestAssured;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ListRestAssured {

	public static void main(String[] args) {
		
		int maxId=0;

		Response response = given().when().get("https://reqres.in/api/users?page=2");

		JsonPath jp = response.jsonPath();

		// Get entire data array
		List<Map<String, Object>> users = jp.getList("data");

		// First user
		Map<String, Object> firstUser = users.get(0);

		System.out.println(firstUser.get("id"));
		System.out.println(firstUser.get("email"));
		System.out.println(firstUser.get("first_name"));
		//System.out.println(response.asString());
		//System.out.println(response.prettyPrint());
		Response res=given().when().get("https://reqres.in/api/users?page=2");
		JsonPath jsonPath=res.jsonPath();
		List<Map<String,Object>> map=jsonPath.getList("data");
	
		for(Map<String,Object> ids:map)
		{
			int id=(Integer)ids.get("id");
			if(id>maxId)
			{
				maxId=id;
				
			}
			
		}
		
		System.out.println(maxId);
		List<Integer> list=response.jsonPath().getList("data.id");
		System.out.println("Using Collections  "+Collections.max(list));

	}

}
