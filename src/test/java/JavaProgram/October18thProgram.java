package JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class October18thProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestAssured.baseURI="url";
		
		String s="{\r\n"
				+ "    \"username\": \"test@user.com\",\r\n"
				+ "    \"notes\": \"this is a note from QA\",\r\n"
				+ "    \"payments\": [\r\n"
				+ "        {\r\n"
				+ "            \"companyId\": 1234567,\r\n"
				+ "            \"detailId\": 12222\r\n"
				+ "        }\r\n"
				+ "    ]\r\n"
				+ "}";
		JsonPath js=new JsonPath(s);
		
		String username=js.getString("username");
		
		System.out.println(username);
		
		int p=js.getInt("payments[0].companyId");
		System.out.println(p);
		
		List<Map<String,Object>> companyID=js.getList("payments");
	    for(Map<String,Object> entry:companyID)	
	    {
	    	
	    	
	    	int i=Integer.parseInt(entry.get("companyId").toString());
	    	System.out.println(i+10);
	    	
	    	String q=String.valueOf(i);
	    	System.out.println(q);
	    	
	    }
	 
		List<Map<String,Integer>> list=new ArrayList();
		Map<String,Integer> map2=new LinkedHashMap();
	
		map2.put("Sharath10",123);
		map2.put("Sharath5",123);
	    list.add(map2);
		for(Map<String,Integer> m:list)
		{
			Integer it=m.get("Sharath5");
			System.out.println(it);
			System.out.println(m);
		}

	}

}
