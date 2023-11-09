package JavaProgram;

public class ReverseWithSpecial {
	
	    public static void main(String[] args) {
	      
	        String output = reverseString("abcp#klp&bhij");
	        System.out.println(output);
	    }

	    public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = str.length() - 1; i >= 0; i--) {
	            char c = str.charAt(i);
	            if (Character.isLetter(c)) {
	                sb.append(c);
	            } else {
	                sb.insert(sb.indexOf("#") + 1, c);
	            }
	        }
	        return sb.toString();
	    }
	}


