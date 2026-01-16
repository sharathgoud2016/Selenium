package javaProgram;

import java.util.ArrayList;
import java.util.List;

public class Nov29thSecondProgram {

	public static void main(String[] args) {
		String str = "I am XYZ";
		String rev="";
		String[] split=str.split(" ");
		List<Integer> list=new ArrayList();
		for(String eachsplit:split)
		{
			
			list.add(eachsplit.length());
			
		}
		System.out.println(list);
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
      System.out.println(rev);		
 
	}

}
