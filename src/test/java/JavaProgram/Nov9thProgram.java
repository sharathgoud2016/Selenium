package JavaProgram;

import java.util.HashSet;
import java.util.Set;

public class Nov9thProgram {

	public static void main(String[] args) {
		String str="iii aaammm wwwooorrrrkkkiiiinnngg";
		char t=0;
		StringBuffer sb=new StringBuffer();
		for(char c:str.toCharArray())
		{
			if(c!=t)
			{
				sb.append(c);
			}
				t=c;
		}
          System.out.println(sb.toString());
	Set<Integer> setone=new HashSet();
	Set<Integer> settwo=new HashSet();
	
	int[] array= {2,3,4,5,6,6,7,7};
	for(int i:array)
	{
		if(!setone.contains(i))
		{
			setone.add(i);
		}else
			settwo.add(i);
	}
	System.out.println(setone);
	System.out.println(settwo);
	
	}
	
	

}
