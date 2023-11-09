package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class ArrayReverse {
	
	    
	    public static void main(String[] args) {
	    	arrayToList();
	      Integer arr[]={3,5,2,8,2,4};
	        List<Integer> list=new ArrayList<>();
	        Collections.addAll(list,arr);
	        Collections.reverse(list);
	     //   for(int i=0;i<list.size();i++)
	     //   {
	     //   	arr[i]=list.get(i);
	     //   	System.out.print(list.get(i)+" "+"Array Rev"+arr[i]);
	     //   }
	    //    Integer[] conarray=list.toArray(new Integer[list.size()]);
	        for(int a:list)
	        System.out.print(" "+a);
	       
	    }
	    
	    public static void arrayToList()
	    {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.print("Enter Int");
	    	int a=sc.nextInt();
	    	Integer b[]=new Integer[a];
	    	
	    	System.out.print("Enter Values");
	    	for(int i=0;i<a;i++)
	    	{
	    		b[i]=sc.nextInt();
	    	}
	    	List<Integer> list=new LinkedList<>();
	    	
	    	System.out.println(b.length);
	        for(int j=0;j<b.length;j++)
	        {
	        	System.out.println("index"+b[j]);
	        }
	    	list=Arrays.asList(b);
	    	ListIterator i=list.listIterator();
	    	try {
	    	while(i.hasNext())
	    	{
	    		System.out.println("ArrayList"+i.next());
	    		System.out.println("ArrayList"+i.next());
	    		System.out.println("ArrayList"+i.previous());
	    		System.out.println("ArrayList"+i.next());
	    	}
	    	}catch(Exception e){
	    		System.out.println(e.getMessage());
	    	}
	    	
	    	String abc="123";
	    	Integer g=Integer.parseInt(abc);
	    	System.out.println(g+2);
	    	String t=String.valueOf(g);
	    	System.out.println(t);
	    	
	    	
	    }
	}


