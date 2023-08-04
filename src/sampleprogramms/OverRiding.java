package sampleprogramms;

class ClassA {
	
	public void add1(int a , int b) {
		
		int c = a+b;
		
		System.out.println("Sum of a and b of classA "+ c);
	}

}
	
	 class ClassB extends ClassA
	{
		public int add1(int a , int b ,int c) {
			
			int d = a+b+c;
			
			System.out.println("Sum of a and b of classB "+ d);
			
			return d;
		}
	}
		
	public class OverRiding
	{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassB riding = new ClassB();
				
			int g=	riding.add1(10, 20,30);
			
			System.out.println(g);
		
		
	}
	}
	



