package CollectionsPrograms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NumberOfCharacters {

	public static void main(String[] args) {

		int n = 112233;

		Map<Character, Integer> map = countNumber(n);

		Set set = map.entrySet();

		Iterator it = set.iterator();

		while (it.hasNext()) {

			Map.Entry entery = (Map.Entry) it.next();

			System.out.println("Keys " + entery.getKey() + " Values " + entery.getValue());
		}
	}

	public static Map<Character, Integer> countNumber(int n)

	{
		Map<Character, Integer> countch = new HashMap<>();
		
		 String numberstring =String.valueOf(n);

		for (char c : numberstring.toCharArray()) {
			
			if(Character.isDigit(c))
				
				countch.put(c, countch.getOrDefault(c, 0) + 1);

		}
		return countch;

	}
}
