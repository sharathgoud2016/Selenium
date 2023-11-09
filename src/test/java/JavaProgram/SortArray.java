package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortArray {

	public static void main(String[] args) {

		
		Integer[] act={6,4,8,3,0,5,11,1,7};
		
		List<Integer> list=new ArrayList<>((Arrays.asList(act)));
		
		
		Collections.rotate(list, 3);
		Integer[] exp=list.toArray(new Integer[list.size()]);
		System.out.println(Arrays.toString(exp));
		
	


	}

}
