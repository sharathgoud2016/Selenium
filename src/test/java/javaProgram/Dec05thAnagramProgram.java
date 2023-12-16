package javaProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class Dec05thAnagramProgram {

	    public static boolean areAnagrams(String str1, String str2) {
	        // Remove spaces and convert to lowercase for case-insensitive comparison
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // Check if the lengths are the same
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Convert strings to char arrays and sort them
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	      //  List<Character> list=Arrays.asList(charArray1);
	      //  Collections.sort(list,Collections.reverseOrder());
	     //   Character[] array = list.toArray(new Character[0]);
	     //   Object sortedCharArray = charArray1.toString();
	     //   System.out.println(sortedCharArray.toString());
	        Arrays.sort(charArray1);
	       
	        Arrays.sort(charArray2);
            
            
	        // Compare sorted char arrays
	        return Arrays.equals(charArray1, charArray2);
	    }

	    public static void main(String[] args) {
	        String word1 = "listen";
	        String word2 = "silent";

	        if (areAnagrams(word1, word2)) {
	            System.out.println(word1 + " and " + word2 + " are anagrams.");
	        } else {
	            System.out.println(word1 + " and " + word2 + " are not anagrams.");
	        }
	    }
	}


