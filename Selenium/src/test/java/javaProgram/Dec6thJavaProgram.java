package javaProgram;

import java.util.ArrayList;
import java.util.List;

public class Dec6thJavaProgram {

	public static void main(String[] args) {
    
    int j=2;
    int p=0;
    List<Integer> list=new ArrayList();
    for(int i=10;i>=1;i--)
    {
    	if(i%j==0)
    	{
    	  list.add(0);	
    	}else
    		list.add(1);
    }
      
       System.out.println(list);
	}

}
