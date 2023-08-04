package StringProgramms;

public class StringBuilderOne {

	public static void main(String[] args) {
		
		String s = "Patel Nidhi";
		String s4="";
		
		String[] splits=s.split(" ");
		
		//System.out.println(splits[0]);
		
		for(int i=0;i<=splits.length-1;i++)
		{
			String s3="";	
			String s2=splits[i];
			
			
		for(int j=s2.length()-1;j>=0;j--)
			{
				s3=s3+s2.charAt(j);
			}
		s4=s4+s3+" ";
		
		}
		System.out.println(s4);
		
	}

}
