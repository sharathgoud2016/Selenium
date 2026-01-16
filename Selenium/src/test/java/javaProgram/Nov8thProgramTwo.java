package javaProgram;

public class Nov8thProgramTwo {

	public static void main(String[] args) {
    
		String mystr = "iiiiii aammmm wwwooorrrkiiinnggg";
		StringBuffer sb=new StringBuffer();
		char prev=0;
		for(char c:mystr.toCharArray())
		{
				if(c!=prev)
				{
					sb.append(c);
				}
				prev=c;
				
			}
			System.out.println(sb.toString());
		}

	}


