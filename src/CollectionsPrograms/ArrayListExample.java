package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> list=new ArrayList<String>();
		
		list.add("Nidhi");
		list.add("Harshini");
		list.add("Bharath");
		list.add("Ruthu");
		list.add("Arbind");
		list.add("Bharath");
		
		Iterator it=list.iterator();
		while(it.hasNext())
		{
		   System.out.println(it.next());	
		}
		
		

	}

}
