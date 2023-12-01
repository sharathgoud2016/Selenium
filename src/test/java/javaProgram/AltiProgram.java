package javaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AltiProgram {

	public static void main(String[] args) {
		
		

     Map<Set,Set> map=new HashMap<>();
     Set<String> authorone=new HashSet<>();
     authorone.add("Bookone");
     authorone.add("BookTwo");
     authorone.add("Bookthree");
     
     Set<String> authortwo=new HashSet<>();
     authortwo.add("Bookone1");
     authortwo.add("BookTwo2");
     authortwo.add("Bookthree3");
     
     Set<String> authorthree=new HashSet<>();
     authorthree.add("Bookone4");
     authorthree.add("BookTwo");
     authorthree.add("Bookthree");
     
     map.put(authorone, authorone);
     map.put(authortwo, authortwo);
     map.put(authorthree, authorthree);
     
     for(Entry<Set,Set> books:map.entrySet())
     {
    	 System.out.println("Author"+books.getKey()+"books"+books.getValue());
    	 for(Object t:books.getValue())
    	 {
    		System.out.println(t);
    	 }
    	
     }
     
     int[] s= {3,4,5,6,7,10,1,1};
     
     Arrays.sort(s);
     System.out.println("Second Highest"+s[s.length-2]);

	}

}
