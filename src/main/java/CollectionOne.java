import java.util.HashMap;

public class CollectionOne {
	
	public static void main(String[] args)
	{
		String a="today Sharath is being interviewed";
		char[] b=a.toCharArray();
		
		int l=a.length();
		HashMap<Integer,Character> hm=new HashMap<>();
		for(int i=0;i<=l;i++)
		{
		
		hm.put(0,b[i]);
		}
	}

}
