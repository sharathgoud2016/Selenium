package javaProgram;

import java.util.HashMap;
import java.util.Map;

public class Triagle
{
public static void main(String[] args)
{
mapMethod();	
for(int i=1; i<=5;i++)
{

for(int j=1;j<=i; j++)
{

System.out.print("*");
}
System.out.println();
}
}


public static void mapMethod()
{
String s="Sharath goud";
char[] c=s.toCharArray();
int count=0;
for(char t:c)
{
	count++;
}
System.out.println(count );
Map<Character,Integer> map=new HashMap<>();
for(char ca:c)
{
 map.put(ca,map.getOrDefault(ca,0)+1);
}
for(Map.Entry<Character,Integer> entry:map.entrySet())
{
 System.out.println(" Character "+entry.getKey()+" count "+entry.getValue());
	count++;
}
System.out.println(count);
}
}