package JavaProgram;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		int[] a= {3,5,6,7,7,8,8,12};
		int[] b= {3,5,5,10,8,12};
		String s="Sharath Goud";
		char[] c=s.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		int count=0;
		Set<Integer> list=new HashSet<>();
		Set<Integer> repeated=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			if(!list.add(a[i]))
			{
				repeated.add(a[i]);
			}
	
		}
		
		for(int j:repeated)
		{
         
			 System.out.println("Using Enhaced For loop "+j);
	
		}
		
		List<Integer> listdup=new ArrayList<>(repeated);
		
		for(int k=0;k<repeated.size();k++)
		{
			System.out.println("Using Set to List Converstion "+listdup.get(k));
		}
		
		Iterator itr=repeated.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("Using Iterator "+itr.next());
		}
		
		for(char ch:c)
		{
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		
		Iterator<Entry<Character,Integer>>  it=map.entrySet().iterator();
		
			while(it.hasNext())
			{
				Entry<Character,Integer> p=it.next();
				System.out.println("Iterator with Map Character "+p.getKey()+" Char Count "+p.getValue());
			}
			
			for(Entry<Character, Integer> forMap:map.entrySet())
			{
				System.out.println("MapEnhacedForLoop "+forMap.getKey()+"  "+forMap.getValue());
			}
			
			Set<Integer> set1=new HashSet<>();
			Set<Integer> set2=new HashSet<>();
			List<Integer> set3=new ArrayList<>();
			for(int aa:a)
			{
				set1.add(aa);
			}
			
			for(int bb:b)
			{
				set2.add(bb);
			}
			
			Iterator<Integer> ir=set1.iterator();
			while(ir.hasNext())
			{
				System.out.println("Set1 "+ir.next());
				
				
			}
			for(Integer bb:b)
			{
			if(set1.contains(bb))
			{
			set3.add(bb);
			}
			}
			System.out.println("Similar in Set3  "+set3);
			set1.retainAll(set2);
			System.out.println(set2);
	}

}