package JavaProgram;

class HelloWorldTwo {
    public static void main(String[] args) {
       arrayValue();
        String s="Sharath Goud";
        char[] ch=s.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--)
        {
            rev+=ch[i];
        }
        
        System.out.println("Hello, World!  "+rev);
    }
    
    public static void arrayValue()
    {
        String ar[]={"Rama","Ravi"};
        System.out.println("Array Value  "+ar[1]); 
        String revStr="";
        for(String s:ar)
        {
            StringBuilder sb=new StringBuilder(s);
            revStr+=sb.reverse()+" ";
        }
         System.out.println("Array Value  "+revStr); 
    }
    
    
}
