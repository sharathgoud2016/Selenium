package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class InfosysSampleExampleOne 
	{
		public static void main(String[] args)
		{
		
	String abc="Twenty20 (T20) is a shortened game format of cricket. At the professional level, it was introduced by the England and Wales Cricket Board (ECB) in 2003 for the inter-county competition.[1] In a Twenty20 game, the two teams have a single innings each, which is restricted to a maximum of twenty overs. Together with first-class and List A cricket, Twenty20 is one of the three current forms of cricket recognised by the International Cricket Council (ICC) as being at the highest international or domestic level.\r\n"
			+ "\r\n"
			+ "A typical Twenty20 game is completed in about two and a half hours, with each innings lasting around 70 minutes and an official 10-minute break between the innings. This is much shorter than previous forms of the game, and is closer to the timespan of other popular team sports. It was introduced to create a fast-paced game that would be attractive to spectators at the ground and viewers on television.\r\n"
			+ "\r\n"
			+ "The game has succeeded in spreading around the cricket world. On most international tours there is at least one Twenty20 match and all Test-playing nations have a domestic cup competition.";
	String[] charArrray=abc.split(" ");
	
	Map<String,Integer> map=new TreeMap<>();
	for(String c:charArrray)
	{
		map.put(c, map.getOrDefault(c,0)+1);
	}
	
	for(Entry<String, Integer> count:map.entrySet())
	{
		System.out.println(count.getKey()+"  "+count.getValue());
	}
		
		
	/*	  // Extract the keys (words) and sort them
        List<String> sortedWords = new ArrayList<>(map.keySet());
        Collections.sort(sortedWords);

        // Print the sorted words
        for (String word : sortedWords) {
            System.out.println(word + "  " + map.get(word));
        }*/
		}
}
