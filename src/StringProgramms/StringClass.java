package StringProgramms;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstname = "Nidhi patil";
		 System.out.println(firstname.charAt(1));
		 
		 
		 System.out.println("compareto 	"+firstname.compareTo("nidhi")); 
		 
		 
		 
		 System.out.println("equals		" + firstname.equals("Nidhi2"));
		 
		 System.out.println("compareToIgnoreCase	"+firstname.compareToIgnoreCase("NIDHI"));
		 
		 System.out.println("concat	"+firstname.concat( " " +"patel"));
		 
		 System.out.println("contains	"+firstname.contains("p"));
		 
		 System.out.println("indexof	"+firstname.indexOf("i"));
		 
		 System.out.println("indexof	"+firstname.indexOf("i", 2));
		 
		 System.out.println("indexof	"+firstname.indexOf(0,2));
		 
		 System.out.println("length	"+firstname.length());
		 
		 System.out.println("replace	"+firstname.replaceAll("i", "e"));
		 
		System.out.println("replaceall	"+firstname.substring(2));
		
		System.out.println("substring	"+firstname.substring(2, 8));
        
		System.out.println("TOLOWERCASE	"+firstname.toLowerCase());
		
		// System.out.println("Split	"+firstname.split(" "));
		
		splitMeth();
		
	}
	
	public static void splitMeth() 
	{
		String sp= "split Method Class interface";
		String[] aftersplit = sp.split(" ");
		//System.out.println(aftersplit[2]);
		
		for(String i:aftersplit)
		{
			System.out.println(i);
		}
		
		int len=aftersplit.length;
		try {
		for(int i =0; i<len+1;i++)
		{
			System.out.println(aftersplit[i]);
		}
		} catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		 System.out.println("Hello");
		
	}
		

		 	 
		 
		

	}


