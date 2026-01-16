package javaProgram;

import java.util.*;


class Solution {

    public static void main(String[] args) {
    int[] ipArray={2,5,1,0,9,0,8,7,0,5,4,3,3,4,6,5,7,9,4,2,6};
// output:
//int[] op1={9,8,7,6,5,4,3,2,1,0}
       // System.out.print(ans);
Set<Integer> setone=new TreeSet();
Set<Integer> settwo=new TreeSet();
Set<Integer> setthree=new HashSet();
List<Integer> list=new ArrayList();
for(int i:ipArray)
{
	if(!setone.add(i))
	{
		settwo.add(i);
	}
	
	
}
System.out.println(settwo);
for(int j:settwo)
{
	list.add(j);
}
for(int k:setone)
{
	list.add(k);
}
Collections.sort(list,Collections.reverseOrder());
System.out.println(list);
for(int l:list)
{
	setthree.add(l);
}
System.out.println(setthree);

    }
    
}