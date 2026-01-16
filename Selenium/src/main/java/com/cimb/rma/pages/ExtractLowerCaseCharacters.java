package com.cimb.rma.pages;

public class ExtractLowerCaseCharacters {
    public static void main(String[] args) {
        String input = "Hello123 World!";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c >= '0' && c <= '9') {
                result.append(c);
            }
        }

        String lowercaseCharacters = result.toString();
        System.out.println("Lowercase characters in the string: " + lowercaseCharacters);
        int b=Integer.parseInt(lowercaseCharacters);
        System.out.println(b+123);
        String s=String.valueOf(b);
        System.out.println(s.concat("Goud"));
        System.out.println(s);
    }
    
}
