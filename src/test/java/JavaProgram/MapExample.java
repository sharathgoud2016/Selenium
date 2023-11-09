package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		String str="Babu";
		Map<Character,Integer> map=new HashMap<>();
		char[] c=str.toCharArray();
		for(char ch:c)
		{
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet())
		{
		System.out.println(" Character "+entry.getKey()+" count "+entry.getValue());
		}

	}

}
