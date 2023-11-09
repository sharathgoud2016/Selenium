package JavaProgram;


import java.util.*;


class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter String");            
        String a=sc.nextLine();
        String b[]=a.split(" ");
        String rev="";
        for(String c:b)
        {
            StringBuilder sb=new StringBuilder(c);
            rev+=sb.reverse()+" ";
        }
        System.out.println(rev);
    }
}
