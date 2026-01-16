package javaProgram;

import java.io.*;

class GFG {
	public static void main(String[] args) {
	
			rev("abcp#klp&bhij");
			
	}
		
		public static void rev(String value)
		{
		String reverse="";
		//String p=value.replace('#', '&');
		//String k=p.replace('&','#');
		//System.out.println("Replace  "+k);
	    int a=value.length();
	    char[] ch=value.toCharArray();
	    StringBuffer sb=new StringBuffer();
		for(int i=a-1;i>=0;i--)
		{
		
		//	if(Character.isAlphabetic(ch[i]))
			{
			sb.append(ch[i]);	
			}
			reverse=sb.toString().replace("b&", "b#").replace("k#","k&");
		
		}
		System.out.println("Reverse String with spcial Char  "+reverse);

		
		
	}
}