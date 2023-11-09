package JavaProgram;

public class ProgramSep29th {

	public static void main(String[] args) {

String s="My Name is Sharath";
String[] split=s.split(" ");
String rev="";
for(String sp:split)
{
StringBuffer sb=new StringBuffer(sp);

rev=sb.reverse()+" "+rev;

}
System.out.println(rev);

	}

}
