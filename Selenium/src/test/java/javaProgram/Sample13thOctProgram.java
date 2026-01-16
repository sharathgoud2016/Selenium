package javaProgram;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample13thOctProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Heloo");
      int[] a= {2,3,4};
     System.out.println(a[a.length-2]);
     String s="Hello World";
     char[] c=s.toCharArray();
     String rev="";
     for(int i=c.length-1;i>=0;i--)
     {
    	rev=rev+c[i]; 
     }
     System.out.println(" String Reverse "+rev);
	}
	
	
	
	

	
	

}
