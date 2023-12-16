package javaProgram;

import java.util.Arrays;

import org.asynchttpclient.Response;

import io.restassured.RestAssured;

public class Dec8thJavaProgramRA {
	
	public static void main(String[] args)
	{

	String abc="Pack my box with five dozen liquor jugs";
	String lowercase=abc.toLowerCase();
	char[] c=lowercase.toCharArray();
	int len=c.length;
	//Set<Character> set=new Hash
	System.out.println("length"+len);
	if(len==26)
	{
		System.out.println("Not a palangram");
	}
	
	Arrays.sort(c);
	System.out.println(c);
	}

}
