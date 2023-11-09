package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String sha="Sharath Goud Bharath Goud";
               char c[]=sha.toCharArray();
               Map<Character,Integer> map=new HashMap<>();
               for(int i=0;i<c.length;i++)
               {
            	   map.put(c[i], map.getOrDefault(c[i], 0)+1);
            	   
               }
               
               for(Map.Entry<Character,Integer> mapEntery:map.entrySet())
               {
            	   System.out.println("Char  "+mapEntery.getKey()+"  Map Count"+mapEntery.getValue());
               }

	}

}
