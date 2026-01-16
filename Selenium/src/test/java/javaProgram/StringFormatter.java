package javaProgram;

public class StringFormatter {  
	
	 public static void main(String[] args)
	    {
	      String wordrev=reverseWord("Sharat Goud");
	      System.out.print(wordrev);
	      intRev();
	    }
public static String reverseWord(String str){  
    String words[]=str.split("\\s");  
    String reverseWord="";  
    for(String w:words){  
        StringBuilder sb=new StringBuilder(w);  
        sb.reverse();  
        reverseWord+=sb.toString()+" ";  
    }  
    return reverseWord.trim();  
}  

public static void intRev()
{
    int i=123;
    String k="345";
    String revInt="";
    String s=String.valueOf(i);
    System.out.println(s);
    System.out.println(Integer.parseInt(k)+5);
    for(int j=s.length()-1;j>=0;j--)
    {
     revInt+=s.charAt(j);   
    }
    System.out.println(Integer.parseInt(revInt)+2);
}
} 