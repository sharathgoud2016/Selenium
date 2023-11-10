package JavaProgram;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Multiset.Entry;

public class Nov10thProgramSecond {

	public static void main(String[] args) {

     String str="India is a big country India";
     String[] split=str.split(" ");
     
     Map<String,Integer> map=new HashMap();
     
     for(String s:split)
     {
    	 map.put(s,map.getOrDefault(s,0)+1);
     }
     
     for(Map.Entry<String,Integer> keyValues:map.entrySet())
     {
    	if(keyValues.getKey().equals("India")) 
    	{
    		System.out.println(keyValues.getValue());
    	}
     }

	}

}
