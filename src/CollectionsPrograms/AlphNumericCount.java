package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class AlphNumericCount {
	
	
	
	
	public static void main(String[] args) {
		
		String[] str1={"Bangalore", "Mysore", "Mangalore", "Bangalore"};
		
		String[] str2={"Bangalore", "Mysore", "Mang"};
		
		Set<String> list1=new TreeSet<>(Arrays.asList(str1));
		Set<String> list2=new TreeSet<>(Arrays.asList(str2));
		
		
		list1.retainAll(list2);
		
	List<String> lt= new ArrayList<>(list1);
		
		Collections.sort(lt,Collections.reverseOrder());
		for(String s:lt)
		
		
		System.out.println(s);
		
		
		

	}

}
