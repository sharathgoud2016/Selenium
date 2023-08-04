package StringProgramms;

public class SRUsingmethodSplit {
	public String reve(String str)
	{
		String s5="";
		String[] split=str.split(" ");
		
		for(int i=0;i<split.length;i++)
	{	
			String s3="";

			String s2=split[i];
			
			for(int j=s2.length()-1;j>=0;j--)
			{
				s3=s3+s2.charAt(j);
				
			}
					
			s5=s5+s3+" ";
		}
		return s5;
	}

	public static void main(String[] args) {
		
		SRUsingmethodSplit sr=new SRUsingmethodSplit();
		String s4=sr.reve("String Reverse in  Java using method");
		System.out.println(s4);
		

	}

}
