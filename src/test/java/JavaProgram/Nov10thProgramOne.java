package JavaProgram;

import java.util.Arrays;

public class Nov10thProgramOne {

	public static void main(String[] args) {

      int[] ary={2,-1,8,4,6};
       int secondHighest=findSecondHighest(ary);
       System.out.println(secondHighest);
      	}
	public static int findSecondHighest(int[] arr) {
	    int max = Integer.MIN_VALUE;
	    int secondMax = Integer.MIN_VALUE;

	    for (int num : arr) {
	        if (num > max) {
	            secondMax = max;
	            max = num;
	        } else if (num > secondMax && num != max) {
	            secondMax = num;
	        }
	    }

	    return secondMax;
	}

}
