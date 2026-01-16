package javaProgram;

import java.util.HashMap;
import java.util.Map;

class SampleOne {
    public static void main(String[] args) {
        
        String s="Sharath G H";
        char[] c=s.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(Character d:c)
        {
            map.put(d,map.getOrDefault(d,0)+1);
        }
        
        for(Map.Entry<Character,Integer> k:map.entrySet())
        {
         System.out.println("Char  "+k.getKey()+"  Count "+k.getValue());   
        }
        
    }
}
