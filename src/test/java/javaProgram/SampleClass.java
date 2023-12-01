package javaProgram;

import java.util.Arrays;
import java.util.HashSet;

public class SampleClass {

	public static void main(String[] args) {
		// Find duplicate elements from this array

		int[] arr = {2,3,4,2,3,5,6,3};
		
		
		HashSet<Integer> s1=new HashSet<>();
		HashSet<Integer> s2=new HashSet<>();
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					s1.add(arr[i]);
				}
					
				
			}
			
			
			
		}
		System.out.println(s1);
		
		for(int k:arr)
		{
			if(s1.add(k)==false)
			{
				s2.add(k);
			}
		}
		System.out.println(s2);  
	}
	
	

}
