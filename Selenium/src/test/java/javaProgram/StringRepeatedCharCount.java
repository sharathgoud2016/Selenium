package javaProgram;

public class StringRepeatedCharCount {

	public static void main(String[] args) {
	//	pyramiddisplay();
	//	primeNumber();
	//	primeNumbersecond();
		 stringCount();
	//	System.out.println(StringRepeatedCharCount.isPalindrome("nitin"));
	//	System.out.println(StringRepeatedCharCount.isPalindrome("jatin"));
	}

	public static void stringCount() {
		String string1 = "babu";
		int count;

		// Converts given string into character array
		char string[] = string1.toCharArray();

		System.out.println("Duplicate characters in a given string: ");
		// Counts each character present in the string
		for (int i = 0; i < string.length; i++) {
			count = 1;
			for (int j = i + 1; j < string.length; j++) {
				if (string[i] == string[j] && string[i] != ' ') {
					count++;
					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
			// A character is considered as duplicate if count is greater than 1
			if (count > 1 && string[i] != '0')
				System.out.println(string[i]);
		}
	}

	public static void pyramiddisplay() {
		int k = 1;

		for (int i = 1; i <= 3; i++) {

			for (int j = 1; j <= i; j++) {

				System.out.print(k);
				k++;

			}
			System.out.println();
		}
	}

	public static boolean isPalindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		sb.reverse();
		String rev = sb.toString();
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	public static void primeNumber() {
		int num = 29;
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");
	}
	
	public static void primeNumbersecond(){  
		  int i,m=0,flag=0;    
		  int n=7;//it is the number to be checked  
		  m=n/2; 
		   System.out.println(m); 
		  if(n==0||n==1){
		   System.out.println(n+" is not prime number");    
		  }else{
		   for(i=2;i<=m;i++){    
		    if(n%i==0){    
		     System.out.println(n+" is not prime number");    
		     flag=1;    
		     break;    
		    }    
		   }    
		   if(flag==0)  { System.out.println(n+" is prime number"); }
		  }//end of else
		}  

}
