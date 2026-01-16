package javaProgram;

import java.util.HashMap;
import java.util.Map;

public class CignitiMapProgram {
	
	public static void main(String[] args)
	{
	
		Map<Character, Integer> mapvalue=countOccurance("SharathGoudBharath");
		
		for(Map.Entry<Character, Integer> entry:mapvalue.entrySet())
		 
			System.out.println(" Keys  "+entry.getKey()+" occurnace  "+entry.getValue());
		
		
	}

	public static Map<Character, Integer> countOccurance(String str)
	{
		
		char[] ch=str.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<ch.length;i++)
		{
			map.put(ch[i], map.getOrDefault(ch[i],0)+1);
		}
		
		return map;
				
	}
	
}
