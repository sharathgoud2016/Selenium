package CollectionsPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionProgram {

	public static void main(String[] args) {
		List<String> tr=new ArrayList();
		
		tr.add("Sita");
		tr.add("Anitha");
		tr.add(""); 
		tr.add("");
		tr.add("Mita");
		tr.add("Bavita");
		tr.set(0, "Rama");
		
	/*	Iterator it=tr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			//it.next();
		}
		
		for(String it1:tr)
		{
			//System.out.println(it1);
		}
		
*/
		for(int i=0;i<tr.size();i++) {
			
			System.out.println(tr.get(i));
		}
	}

}
