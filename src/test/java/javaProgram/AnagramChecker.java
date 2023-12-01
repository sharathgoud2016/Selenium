package javaProgram;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String a, String b) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are the same
        if (a.length() != b.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] aArray = a.toCharArray();
        char[] bArray = b.toCharArray();

        // Sort the character arrays
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        // Compare the sorted arrays
        return Arrays.equals(aArray, bArray);
    }

    public static void main(String[] args) {
        String a = "welcome";
        String b = "emowecl";

        if (areAnagrams(a, b)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }
}
