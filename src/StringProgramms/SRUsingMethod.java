package StringProgramms;

public class SRUsingMethod {

public String reverse(String s)
{
	String s2="";
	for(int i=s.length()-1;i>=0;i--)
	{
		s2=s2+s.charAt(i);
	}
	return s2;
	
	}
 public static void main(String[] args)
{
	 SRUsingMethod r=new SRUsingMethod();
	
	String reversed=r.reverse("Hello World");
	System.out.println(reversed);
	}

}
