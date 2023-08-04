package CollectionsPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class CommonSet {

	public static void main(String[] args) {
		
		Set<String> s1=new HashSet<>();
		
        s1.add("ABC");
        s1.add("Ram");
        s1.add("Sita");
        
        List<String> s2=new ArrayList<>();
        s2.add("Sita");
        s2.add("geet");
        s2.add("laks");
        s2.add("sita");
        
        Iterator ir=s2.iterator();
         while(ir.hasNext())
         
        	 System.out.println("using itrator "+ir.next());
         
         
         for(String i:s2)
         
        	 System.out.println("for each loop "+i);
         
         
         for(int i =0;i<s2.size();i++)
         
        	 System.out.println("using get method "+s2.get(i));
         
         }
      
	}


