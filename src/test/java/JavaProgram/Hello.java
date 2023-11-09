package JavaProgram;

import java.util.ArrayList;
import java.util.List;

class Hello {
	  public static void main(String[] args) {
		    
		    System.out.println("Hello Codiva");
		    System.out.println("Hello");
		    List<String> list=new ArrayList<>();
		    list.add("sharath");
		    System.out.println(list.get(0));
		    String str=new String("Sharath Goud");
		    System.out.println(str.concat("Hanumantha"));
		    System.out.println(str);
		    
		    StringBuilder sb=new StringBuilder("Sharath Goud");
		    System.out.println(sb.append("Hanumantha"));
		    System.out.println(sb.toString());
		    String s=sb.toString();
		    System.out.println(s.concat("TechM"));
		    
		    
		  }
		}
