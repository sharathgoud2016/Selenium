package javaProgram;

public class WithoutusingForloop {

	public static void main(String[] args) {
	count(1);
	mainTwo();
	}
	public static void count(int n)
	{
		if(n<=10)
		{
		System.out.println(n);
		count(n+1);
		n++;
		}
		}
	
	

	    public static void mainTwo() {
	        int n = 6;
	        int sum = (n * (n + 1)) / 2;
	        System.out.println("The sum of numbers from 1 to 10 is: " + sum);
	    }
	

}
