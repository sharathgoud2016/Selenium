package javaProgram;

public class TomorrowProgram {
    public static void main(String[] args) {
        String original = "tomorrow";
        String withdoller = "";
        for (int i = 0; i<original.length() - 1; i++) {
        	
        	if(original.charAt(i)=='o')
        	{
        		Character t=original.charAt(i);
        		t='$';
        		withdoller += original.charAt(i);
        	}
        	
        }
        System.out.println(withdoller);
    }
}
