package JavaProgram;

import org.openqa.selenium.By;

public class NewClass {

	public static void main(String[] args) {

        String palindrome="aaa";
        
        char a[]=palindrome.toCharArray();
        int j=a.length;
   StringBuilder sb=new StringBuilder();
        try {
        for(int i=j-1;i>=0;i-- )
        {
           sb.append(palindrome.charAt(i));
           
        }
        
        System.out.println(sb.toString());
        }
        catch(NullPointerException e)
        {
        	System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	
        }

	}

}






