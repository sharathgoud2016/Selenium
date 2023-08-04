package StringProgramms;

public class ExamplString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Example for concatination using + symbol
		
		String firstname = "Nidhi";
		String lastname = "Patel";
		
		String fullname = firstname + " " + lastname;
				
				System.out.println(fullname);
	
	//Example for length method
				
	int length = fullname.length();
	
	System.out.println(length);
	
	// Example for substring method of string
	
	String substring = fullname.substring(5);
	
	System.out.println(substring);
	
	//Example for searching method for string
	
	boolean containpatel = fullname.contains(lastname);
	
   System.out.println(containpatel);
	}
	
	//Example for case converstion of string
	
	//String uppercase = fullname.toUpperCase();

}
