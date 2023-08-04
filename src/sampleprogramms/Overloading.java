package sampleprogramms;

public class Overloading {
	
	
	public int add(int a, int b)
	{
		int c=a+b;
		//System.out.println("Sum of two numbers is "+ c);
		return c;
	}
	
	public float add(float a, float b, float c)
	{
		float d=a+b+c;
		//System.out.println("Sum of two numbers is "+ d);
		
		return d;
		
	}
	
	//constructor overloading examples
	
	public Overloading(int a, int b) {
		
		int c= a+b;
		
		System.out.println("Sum of two numbers is "+ c);
	}
	
	
	public Overloading(int a, int b, int c)
	{
		float d=a+b+c;
		
		System.out.println("Sum of two numbers is "+ d);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Overloading p =new Overloading(10,40,50);
		
	   
		
		int q=p.add(20, 40);
		System.out.println(q);
		
		float r=p.add(10, 20, 30);
		System.out.println(r);
		
		 Overloading s=new Overloading(50,50); 
	}

}
