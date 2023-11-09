package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithoutForLoop {

	public static void main(String[] args) {
		int[] i= {1,2,3,4,5,6,7,8,9,10};
		List<Integer> list=new ArrayList<>();// TODO Auto-generated method stub
		
		//System.out.println(Arrays.stream(i).count());
        int sum=countNumbers(i,0);
        System.out.println(sum);
	}
	
	static int countNumbers(int[] in,int index)
	{
	if (index == in.length - 1) {
        return in[index];
    } else {
	
		return in[index]+countNumbers(in,index+1);
	}
}
	
	}
