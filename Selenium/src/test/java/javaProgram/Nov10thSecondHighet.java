package javaProgram;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Nov10thSecondHighet {

	public static void main(String[] args) {

      int[] i= {3,2,4,5,6,7,8,7,8,8,10,11};
      TreeSet<Integer> set=new TreeSet();
      int index=0;
      for(int t:i)
      {
    	  set.add(t);
    	index++;  
      }
      System.out.println(set);
      set.remove(set.last());
      System.out.println(set.last());
      Iterator itr=set.descendingIterator();
      while(itr.hasNext())
      {
    	  System.out.print(itr.next());
    	  
      }
      

	}

}
