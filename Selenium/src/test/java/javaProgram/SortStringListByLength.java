package javaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortStringListByLength {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");
        strings.add("date");
        strings.add("elderberry");

        // Sort the list based on string length
        Collections.sort(strings, Comparator.comparing(String::length).reversed());

        // Print the sorted list
        System.out.println("Sorted list based on string length:");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
