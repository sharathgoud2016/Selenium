package com.cimb.rma.pages;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SecondHighestNumber {

	public static void main(String[] args) {
		Integer[] a= {16,4,8,13,13,7};
	    int max=0;
     
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			//	secondmax=a[i-1];
			}
		}
          
		System.out.println(max); 
	   
	    List<Integer> list=Arrays.asList(a);
	    Collections.sort(list);
	 //   System.out.println(list.get(list.size()-2));
	
	}

}
