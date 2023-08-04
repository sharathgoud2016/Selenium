package HelloPackage;

 interface A {
	
	String carname="fait";
	
	public void car();
	}
 interface C 
 {
	 String bike = "jupiter";
	 
	 void bike();
 }
 
 abstract class D implements A,C
 {
	 public abstract  void bird();
	 
	 D(int a , int b){
		 
		 int c= a+b;
		 
		 System.out.println("constract can create in abstractclass  " +c);
	 }
	  
	 public void sparrow() 
	 {
		 System.out.println("sparrow is chip chip");
		 }
	 }
 
 
 
public class B extends D 
{
	 B() {
		 super(5,10);
		 
		 	}
public static void main(String[]args)
{
	
	D b=new B();
	//D d =new D();
	b.car();
	b.bike();
	b.bird();
	b.sparrow();
  
	
}
	public void car()
	{
		System.out.println("My car is "+carname);
	}
	
	public void bike()
	{
		System.out.println("My bike name s "+bike);
	}
	
	public void bird() {
		System.out.println("birds is flaying");
	}
}




