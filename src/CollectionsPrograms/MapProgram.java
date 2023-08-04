package CollectionsPrograms;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapProgram {

	public static void main(String[] args) {
		Map<Integer, String> mp = new LinkedHashMap<>();

		mp.put(1, "Banaglore");
		mp.put(2, "Mysore");
		mp.put(3, "Managalore");
		mp.put(4, "Mandya");
		mp.put(5, "Kanakapur");
		mp.replace(1, "Managalore");
		
		 System.out.println(mp.size());

		
		
 System.out.println(mp.get(1));
 
 Set set=mp.entrySet();
 
 Iterator it=set.iterator();
 while(it.hasNext())
 {
	 Map.Entry entery=(Map.Entry) it.next();
	 
	 System.out.println("Keys "+entery.getKey()+" Values "+entery.getValue());
 }
	}

}
