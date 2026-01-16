package javaProgram;

public class EnumVariableClass {
	  enum Level {
	    LOW,MEDIUM,HIGH  
	}

	  public static void main(String[] args) 
	{  
	  Level myVar = Level.MEDIUM; 
	    System.out.println(myVar); 
	    for(Level l:Level.values())
	    {
	    	System.out.println(l);
	    }
	    
	 }
	}