package JavaProgram;

public class IsUpperCase {

	public static void main(String[] args) {
		String str="Geeks Is Going Geeks";
		int len=str.length();
		
		for(int i=0;i<len;i++)
		{
			char c=str.charAt(i);
			if(Character.isUpperCase(c))
			{
				System.out.println("Uppercase char"+c);
			}
		}
			for(int j=0;j<len;j++)
			{
				if(str.charAt(j)>=65 && str.charAt(j)<=90)
				{
					System.out.print(str.charAt(j));
				}
			}
		}

	}


