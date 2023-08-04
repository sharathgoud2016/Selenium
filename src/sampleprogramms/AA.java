package sampleprogramms;

 interface AAA {
	
	public void add();

	
	 
	 }

class AA implements AAA
{
	public void add()
	{
		System.out.println("print add");
	}

	
	public static void main(String[]args)
	{
		AA object = new AA();
		
		object.add();
	}
}
