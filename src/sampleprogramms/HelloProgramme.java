package sampleprogramms;

public class HelloProgramme {
	
	static String s="Welcome to java programme";
	
	static int a=10, b=20;
	
	static int add(int d,int e) {
		
		int f=d+e;
		
		return f;
		//System.out.println(p);
	}

	public HelloProgramme(int p,int q) {
		
		int k=p+q;
		
		System.out.println(k);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(s+" "+a);
HelloProgramme add1 = new HelloProgramme(a, b);

//add1.HelloProgramme(b, a);



int p = add1.add(10,30);

System.out.println(p);




	}

}
