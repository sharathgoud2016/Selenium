package javaProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayValues {

	public static void main(String[] args) {
		String a[]= {"Goud","AAA","Sharath","Bangalore"};
		List<String> list=Arrays.asList(a);
		Collections.sort(list,Collections.reverseOrder());
		Collections.sort(list,Comparator.comparing(String::length).reversed());
		for(String b:list)
		{
			System.out.println(b);
		}
		
		Integer arr[]= {2,3,66,333,222};
		List<Integer> intList=Arrays.asList(arr);
		Collections.sort(intList,Collections.reverseOrder());
	//	Collections.sort(intList,Comparator.comparing(Integer::length)));
		for(int  t:intList)
		{
			System.out.println(t);
		}
	}

}
