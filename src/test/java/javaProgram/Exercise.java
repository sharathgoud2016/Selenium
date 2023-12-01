package javaProgram;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Exercise {

    public static List<Integer> findDuplicates(List<Integer> integers, int numberOfDuplicates) {
       // throw new UnsupportedOperationException(/*TODO*/);

        Set<Integer> setone=new HashSet();
        Set<Integer> settwo=new HashSet();
        List<Integer> reList=new ArrayList();

        for(Integer i:integers)
        {
            if(!setone.add(i))
            {
                settwo.add(i);
            }
        }

  
        for(Integer j:settwo)
    {
        reList.add(j);
    }

        System.out.println(settwo.size());

        return reList;


    }
    public static void main(String[] args)
    {

    Integer[] k={-1,1,3,2,3,2,5,6,-1,3,6};    
    List<Integer> listreturn;
	
		listreturn = findDuplicates(Arrays.asList(k),2);
		System.out.println("Dulipcates"+listreturn);
	
	}
    
    }






