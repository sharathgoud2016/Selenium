package javaProgram;

import java.util.ArrayList;
import java.util.List;

public class StringFilter {
    public static void main(String[] args) {
        List<Object> inputList = new ArrayList<>();
        inputList.add('a');
        inputList.add('b');
        inputList.add('c');
        inputList.add('1');
        inputList.add('2');
        inputList.add(3);
        inputList.add(4);
        System.out.println("Input: " + inputList); 
        List<String> outputList = filterStrings(inputList);

        System.out.println("Output: " + outputList);
    }

    public static List filterStrings(List<Object> inputList) {
        List<Object> outputList = new ArrayList<>();

        for (Object element : inputList) {
            if (element instanceof Character) {
                outputList.add(element);
            }
        }

        return outputList;
    }
}
