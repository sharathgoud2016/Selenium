package StringProgramms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String words = "Nidhi Patel";
		String reverse="";
		String[] aftersplit=words.split(" ");
		//System.out.println(aftersplit[0]);
				
		for( int i=0;i<aftersplit.length;i++)
		{
			String reverseWord="";

			String s2=aftersplit[i];
			
		for(int j=s2.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+s2.charAt(j);
				
			}
		reverse=reverse+reverseWord+" ";
		}
		
		System.out.println(reverse);
	}
	

}
