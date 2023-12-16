package javaProgram;

import java.util.ArrayList;
import java.util.List;

public class Dec4thJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "India Required 13 runs from 20 balls to win the worldcup";
		char[] c=s.toCharArray();
		List<Character> list=new ArrayList();
	//	List<Integer> listint=new ArrayList();
		for(Character t:c)
		{
			if(Character.isDigit(t))
			{
				list.add(t);
			}
		}
		
		System.out.println(list);
		int p;
		for(Character l:list)
		{
			//p=p+l.getNumericValue(l);
		}
		
	}

}
