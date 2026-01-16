package javaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nov30ProgramOne {

	public static void main(String[] args) {
		String s="1100100001010100";
		List<Character> list=new ArrayList();
		char[] c=s.toCharArray();
		for(char t:c)
		{
			list.add(t);
		}
		Collections.sort(list);
		System.out.println(list);
		StringBuffer sb1=new StringBuffer();
		StringBuffer sb2=new StringBuffer();
		for(char p:c)
		{
			if(p=='0')
			{
				sb1.append(p);
				
			} else
				if(p=='1')
				{
					sb2.append(p);	
			
			
		}
			
			

	}
		System.out.println(sb1.toString()+sb2.toString());
}
	}
