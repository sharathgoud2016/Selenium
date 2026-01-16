package javaProgram;

import java.util.Scanner;

import org.openqa.selenium.By;

public class NewClass {

	public static void main(String[] args) {
        System.out.println("Enter Values");
		Scanner scr=new Scanner(System.in);
        String pali=scr.next();
        
        String palindrome=pali;
        StringBuilder sb=new StringBuilder();
        try {
        for(int i=palindrome.toCharArray().length-1;i>=0;i-- )
        {
           sb.append(palindrome.charAt(i));
           
        }
        
        System.out.println(sb.toString().equals(palindrome));
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






