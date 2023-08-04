package StringProgramms;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String name="Nidhi Patel 1234";
 
 String[] afterspli=name.split(" ");
 
 System.out.println("String type of display  "+afterspli[2]);
 
   int i=Integer.parseInt(afterspli[2]);
   
   System.out.println("Convereted string to Integer using parseInt() method "+i);
   String s2=String.valueOf(i);
 
   System.out.println("Value of s2 converted integer into string using valueof() method  "+s2);
   
  String s1=Integer.toString(i);
   
   
   System.out.println("value of s1 converted integer into string using tostring()method  "+s1);
	}

}
