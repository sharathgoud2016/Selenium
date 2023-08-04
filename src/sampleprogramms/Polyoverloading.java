package sampleprogramms;

public class Polyoverloading {
	
	  static String s1 = "Hello add1";
	  
	  String s2 = "hello add2";
	
	public Polyoverloading()
	{
		System.out.println(s2+"from add");
		
	}
	
	
   public Polyoverloading(int a, int b)
   {
	   int c = 10+30;
	   
	    System.out.println(c);
	  
   }
	public static void main(String[]args)
	{
		Polyoverloading loading = new Polyoverloading(10,30);
		
		Polyoverloading loading1 = new Polyoverloading();
		
		
	//loading.Polyoverloading();
		
		//String s = "Hello add";		
		//System.out.println(s1 + " "+ loading.Polyoverloading(10, 20));
		
		
	}

}
