package javaProgram;

import java.util.HashSet;
import java.util.Set;

public class Dec07thJavaProgramtwo {

	public static void main(String[] args) {
		int[]  i= {13, 2, 8, 7, 11, 4, 10, 5, 13, 2};
		
		Set<Integer> setone=new HashSet();
		Set<Integer> settwo=new HashSet();
		
		for(int t:i)
		{
			if(!setone.add(t))
			{
				settwo.add(t);
			}
			
			setone.removeAll(settwo);
		}
		
       System.out.println("Non duplicate Values"+setone);
	}

}
