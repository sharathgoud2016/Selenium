package com.cimb.utils;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class HelloWorld {
    
    public Map repatedChar()
    {
        String a="Hey there, I am Yogesh Gite";
        char[] b=a.toCharArray();
        Map<Character,Integer> m=new HashMap<>();
        for(char d:b)
        {
            m.put(d,m.getOrDefault(d,0)+1);
            
        }
        
        return m;
        
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        HelloWorld hw=new HelloWorld();
       Map<Character,Integer> k= hw.repatedChar();
      for(Map.Entry<Character,Integer> t:k.entrySet())
       System.out.println("  Character "+t.getKey()+"  Repated "+t.getValue());
    }
}