package JavaProgram;

import java.util.*;
import java.lang.*;

	
	public class ClassOne
	
	{
		 static int i=10;
		 public static void main(String[] args) {
		List<Integer> input = Arrays.asList(4, 7, 3, 2, 9, 6, 1);
        List<Integer> output = new ArrayList<>(input);

        int last = input.get(input.size() - 1);
        for (int i = input.size() - 2; i >= 0; i--) {
            int sum = last + input.get(i);
            output.add(sum);
            last = sum;
        }

        System.out.println(output);
String s="Hello";

	}

	}
