package javaProgram;

import java.util.*;
import java.util.stream.Collectors;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

class CollectionClass {
 
    // Function to remove duplicate from array
    public static void removeDuplicates(int[] arr)
    {
        LinkedHashSet<Integer> set
            = new LinkedHashSet<Integer>();
 
        // adding elements to LinkedHashSet
        for (int i = 0; i < arr.length; i++)
            set.add(arr[i]);
 
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
 
    // Driver code
    public static void main(String[] args)
    {
       lamda();
    	int arr[] = { 1, 2, 5, 1, 7, 2, 4, 2 };
       
        // Function call
        removeDuplicates(arr);
        mainClass();
        hellopr();
        String str="Sharath";
        String abc=String.valueOf(0);
        sortStringArrayByLength(new String[]{"0ab", "cdef", "ab", "abcdefg"});
        sortStringListByLength(new ArrayList<>(
                Arrays.asList("0ab", "cdef", "ab", "abcdefg")));
    }
    public static void lamda()
    {
    ArrayList<String> list=new ArrayList<>();
    list.add("diamond1");
    list.add("silverSilver");
    list.add("gold");
    
    System.out.println(list.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList()));
 
    }
    public static void mainClass() {
        MyLambdaInterface square = (x) -> x * x;
        int result = square.performOperation(5);
        System.out.println("Result: " + result);
    }
    
    public static void hellopr()
    {
    	   Runnable Sharath=()->System.out.println("Sharath");
    	       Sharath.run();
    	       List<Integer> numbers=new LinkedList<>();
    	       numbers.add(10);
    	       List<Integer> numbersTripled =
    	    		   numbers.stream().map(x -> x*3).collect(Collectors.toList());
    	      System.out.println(numbersTripled.get(0));
    	      
    	      List<Integer> years=new ArrayList<>();
    	      years.add(2022);
    	      years.add(2020);
    	      years.add(2030);
    	      List<Integer> goodYears = years
    	    		  .stream().filter(y -> y != 2022).collect(Collectors.toList());
    	      System.out.println(goodYears);
    	    

    }
    
    private static void sortStringListByLength(List<String> list) {
        System.out.println("-- sorting list of string --");
        Collections.sort(list, Comparator.comparing(String::length));
        list.forEach(System.out::println);
        for(String s:list)
        {
        	System.out.println("For Loop"+s);	
        }
        
    }
    
    private static void sortStringArrayByLength(String[] stringArray) {
        System.out.println("-- sorting array of string --");
        Arrays.sort(stringArray, Comparator.comparing(String::length));
        Arrays.stream(stringArray).forEach(System.out::println);
    }
    
}

interface MyLambdaInterface {
    int performOperation(int x);
}


    


interface myinter
{
	void loo();
}


