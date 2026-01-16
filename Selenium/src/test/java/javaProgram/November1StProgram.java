package javaProgram;

public class November1StProgram {

	public static void main(String[] args) {
	String s="dsdfsdaf adfs fd35454 dsfd fd$%$#%#$ SDFDSFD46546 ^%%$ SDSDFSDFS";
	StringBuilder sb1=new StringBuilder();
	StringBuilder sb2=new StringBuilder();
	StringBuilder sb3=new StringBuilder();
	char c;
	for(int i=0;i<s.length();i++)
	{
		c=s.charAt(i);
		
		if(Character.isAlphabetic(c))
		{
			sb1.append(c);
		}else
		
		if(Character.isDigit(c))
		{
			sb2.append(c);
		}
		else
			sb3.append(c);
		
		
			
	}
	System.out.println(sb1.toString());
	System.out.println(sb2.toString());
	System.out.println(sb3.toString());
	
	}

}
