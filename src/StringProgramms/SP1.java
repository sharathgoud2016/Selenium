package StringProgramms;

public class SP1 {

	public static void main(String[] args) 
	{
		
		String s="Nidhi";
		String[] sp=s.split(" ");
		//System.out.println(sp[0]);
		String s4="";
		
		for(int i=0;i<sp.length;i++)
		{		
			String s3="";
	
			String s2=sp[i];
			
			for(int j=s2.length()-1;j>=0;j--)
			{
				
				s3=s3+s2.charAt(j);
			
				
			}
		System.out.println(s3);
		//	s4=s4+s3+"";
		
	}
		//System.out.println(s3);
			
		}
		

	}


