package sampleprogramms;

class Vehicle
{
	String d;
	
	public void drive()
	{
		System.out.println("i m driving vehicle");
	}
	
}

class Car extends Vehicle
{
	public void stering()
	{
		System.out.println("i am rotating stering  "+d);
	}
}


  class House {

	public static void main(String[] args) {
		
		Car a = new Car();
		
		a.d="tire";
		a.drive();
		a.stering();
		
	}

	
}
