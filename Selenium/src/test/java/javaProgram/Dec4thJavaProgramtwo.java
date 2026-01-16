package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class Dec4thJavaProgramtwo {

	public static void main(String[] args) {
		String s1 = "Applee";
		char[] cone=s1.toCharArray();
		String s2 = "Mpple";
		char[] ctwo=s2.toCharArray();
		
		Set<Character> setone=new HashSet();
		Set<Character>  settwo=new HashSet();
		
		for(Character t1:cone)
		{
			setone.add(t1);
		}
		
		for(Character t2:ctwo)
		{
			settwo.add(t2);
		}
		
           if(setone.containsAll(settwo))
           {
        	   System.out.println("Is Anagram");
           }else
        	   System.out.println("String is not Anagram");  
	}

}
