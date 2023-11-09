package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoArrayDuplicate {

	public static void main(String[] args) {
		
		Integer i[]= {2,3,4,5,6};
		Integer j[]= {5,3,7,5,8};
		// TODO Auto-generated method stub
        List<Integer> a=new ArrayList<>(Arrays.asList(i));
        List<Integer> b=new ArrayList<>(Arrays.asList(j)); 
        b.retainAll(a);
        Set<Integer> set=new HashSet<>(b);
        
        
        for(int p:set)
        {
        	System.out.println(p);
        }
	}

}
