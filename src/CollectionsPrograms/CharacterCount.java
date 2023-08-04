package CollectionsPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
	
	
	public static Map<Character, Integer> countcharacters(String str)
	{
		Map<Character, Integer>map=new HashMap<>();
		
		str=str.toLowerCase();
		
		for(char c:str.toCharArray())
		{
			if(c !=' ')
			
				map.put(c, map.getOrDefault(str, 0)+1);
			
		}
		return map;
	}

	public static void main(String[] args) {
		
		String str = "Hello mapinterface";
		
		Map<Character, Integer>count= countcharacters(str);
		
		
		
		

	}

	
}
