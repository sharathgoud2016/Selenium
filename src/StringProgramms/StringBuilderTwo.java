package StringProgramms;

public class StringBuilderTwo {

		
	public String str2(String s)
	{
		String reverse="";
		String[] split=s.split(" ");
		 		
		for(String i:split)
		{
			StringBuilder sb=new StringBuilder(i);
			
			reverse=reverse+sb.reverse().toString()+" ";
			
		}
		return reverse;
	}
	public static void main(String[] args) {
		
		StringBuilderTwo sb1=new StringBuilderTwo();
		
		String rve =sb1.str2("Nidhi Patel");
        
		System.out.println(rve);
	}

}
