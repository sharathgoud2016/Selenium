package javaProgram;

public class Dec06thJavaProgamALT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="bangalore is capital of Karnataka";
		
		char[] c=str.toCharArray();
		String[] split=str.split(" ");
		String rev="";
		for(int j=0;j<=split.length-1;j++)
		{
			StringBuffer sb=new StringBuffer(split[j]);
			rev+=sb.reverse().toString()+" ";
			
		}
		System.out.println(rev);
		
		
		
		

	}

}
