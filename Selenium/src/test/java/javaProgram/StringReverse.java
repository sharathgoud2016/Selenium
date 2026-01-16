package javaProgram;

public class StringReverse {

	public static void main(String[] args) {
		String s="tea";
		
		char[] c=s.toCharArray();
		String rev="";
		for(int i=c.length-1;i>=0;i--)
		{
			rev+=c[i];
			
		}
		System.out.println(rev);

	}

}
