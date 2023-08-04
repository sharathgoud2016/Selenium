package StringProgramms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Patel";
		
		String reverse ="";
		
		int len=str.length();
					
		for(int i=len-1;i>=0;i--)
			
		{
			reverse = reverse+str.charAt(i);
		}
		System.out.println(reverse);

		
	}

}
