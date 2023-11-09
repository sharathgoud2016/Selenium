// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.ArrayList;
import java.util.List;

class ReverseString {
	public static void main(String[] args) {
		// replaceCharOne();
		// replaceString();
		fibonacciSeris();
		String name = "Cignity technologies is a QA company";

		String[] splitname = name.split(" ");

		// System.out.println(splitname[0]);
		List<String> lis = new ArrayList<String>();
		for (int i = 0; i < splitname.length; i++) {
			lis.add(splitname[i]);
		}
		// System.out.println(lis);
		for (String a : lis) {
			StringBuilder sb = new StringBuilder(a);
			System.out.print(" " + sb.reverse());

		}
	}

	public static void replaceCharOne() {
		String str = "Hello World";
		char oldChar = 'o';
		char newChar = 'x';
		str = str.replace(oldChar, newChar);
		System.out.println("Modified string: " + str);
	}

	public static void replaceString() {
		String str = "Hello World";
		char[] charArray = str.toCharArray();
		char oldChar = 'o';
		char newChar = 'x';
		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == oldChar) {
				charArray[i] = newChar;
			}
		}
		str = new String(charArray);
		System.out.println("Modified string: " + str);
	}

	public static void fibonacciSeris() {
		System.out.println("Fibonacci Series ");
		int f = 10, firstnum = 0, secondnum = 1, count = 0;
		for (int i = 1; i <= f; i++) {
			System.out.print(firstnum + ",");
			count = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = count;

		}

	}

}
