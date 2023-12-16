package javaProgram;

import java.util.HashMap;
import java.util.Map;

public class Dec7thJavaProgram {

	public static void main(String[] args) {


		 Map<String,Integer> map=new HashMap();
		 Map<String,Integer> maptwo=new HashMap();
		 
		 map.put("Sharath",9867553);
		 map.put("Sharath", 9867553);
		 
		 System.out.println(map.get("Sharath"));
		 
		 String s="Sharath";
		 String p="Sharath";
		 
		 if(!s.equals(p))
		 {
			map.put(s, 986755); 
		 }else
			 maptwo.put(s, 986744);
		 
		 System.out.println(maptwo);

	}

}
