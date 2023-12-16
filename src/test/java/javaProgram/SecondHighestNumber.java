package javaProgram;

import java.util.TreeSet;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int[] a= {10,10,3,5,6,7,9};
		int highestnumber=Integer.MIN_VALUE;
		int secondhighest=Integer.MIN_VALUE;
		TreeSet<Integer> set=new TreeSet();
		
		for(int t:a)
		{
			set.add(t);
		}
		
		
		System.out.println(set);
        set.remove(set.last());
        System.out.println(set.last());
	
	
          for(int j:a)
          {
        	if(j>highestnumber)
        	{
        		secondhighest=highestnumber;
        		highestnumber=j;
        	}
        	
          else
        	  if(j>secondhighest && j<highestnumber)
        	  {
        		  secondhighest=j;
        	  }
          
}
          System.out.println("without sort second highest  "+secondhighest);
	}
}