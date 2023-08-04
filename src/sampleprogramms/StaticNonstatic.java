package sampleprogramms;

public class StaticNonstatic {

	static void car()
	{
		System.out.println("from car");
	}
	

	public void car1()
	{
		System.out.println("from car1");
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     car();
     StaticNonstatic obj = new StaticNonstatic();
     
     obj.car1();
     
	}

}
