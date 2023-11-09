package JavaProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CollectionClass2 {
	
	int[] k= {10,10,10,20,30,30,40};
	
	public static void main(String args[])
	{
	
		CollectionClass2 cc=new CollectionClass2();
	//	cc.duplicateElements();
	//	cc.removeDuplicates();	
	//	numofOccurance();
	//	duplicateArray() ;
	//	CollectionClass2.reverseString("Sharath");
	//	evenOROddNumber();
		primeNum();
		
	}
	 public  void removeDuplicates() {
		 Set<Integer> set = new HashSet<>();
		 
		 
	        for (int i : k) {
	            set.add(i);
	            
	            
	            	            
	        }
	        List<Integer> arr = new ArrayList<>(set); 
	        Collections.sort(arr);
	        System.out.println(arr);
	        System.out.println(arr.size());
	     
	        }

	 public void duplicateElements()
	 {
		 int count=0;
		 for(int i=0; i<k.length; i++)
		    {
		        for(int j=i+1; j<k.length; j++)
		        {
		            /* If duplicate found then increment count by 1 */
		            if (k[i] == k[j])
		            {
		            	
		                count++;
		               System.out.println("Number repeated"+k[j]+"with num of times"+count);  
		               break;
		              
		            }
		            
	 }        
		        
	 	        
		    }
		  System.out.println(k.length);  
	        
	 }
	 public static void numofOccurance()
	 {
	 int n, x, count = 0, i = 0;
     Scanner s = new Scanner(System.in);
     System.out.print("Enter no. of elements you want in array:");
     n = s.nextInt();
     int a[] = new int[n];
     System.out.println("Enter all the elements:");
     for(i = 0; i < n; i++)
     {
         a[i] = s.nextInt();
     }
     System.out.print("Enter the element of which you want to count number of occurrences:");
     x = s.nextInt();
     for(i = 0; i < n; i++)
     {
         if(a[i] == x)
         {
             count++;
         }
     }
     System.out.println("Number of Occurrence of the Element:"+count);
     
	 }
	 
	 
	 
		
		public static void duplicateArray() {
			int Size, i, j, dup_count = 0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("\nPlease Enter the Duplicate Array size  : ");
			Size = sc.nextInt();
			
			int[] Dup_Count_arr = new int[Size];
			
			System.out.format("\nEnter Duplicate Array %d elements : ", Size);
			for(i = 0; i < Size; i++) 
			{
				Dup_Count_arr[i] = sc.nextInt();
			}
			
			for(i = 0; i < Size; i++) 
			{
				for(j = i + 1; j < Size; j++)
				{
					if(Dup_Count_arr[i] == Dup_Count_arr[j]) {
						dup_count++;
						break;
					}
				}
			}
			System.out.println("\nThe Total Number of Duplicates  = " + dup_count);
		}
		
		public static String reverseString(String input) {
		    StringBuilder reversed = new StringBuilder();
		    for (int i = input.length() - 1; i >= 0; i--) {
		        reversed.append(input.charAt(i));
		    }
		    System.out.println(reversed);
		    return reversed.toString();
		}
		
		
		    public static void evenOROddNumber() {
		        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		        for (int number : numbers) {
		            if (number % 2 == 0) {
		                System.out.println(number + " is an even number");
		            } else {
		                System.out.println(number + " is an odd number");
		            }
		        }
		    }
		    
		    public static void primeNum() {
		        int n = 20;
		        for (int i = 2; i <= n; i++) {
		            boolean isPrime = true;
		            for (int j = 2; j < i; j++) {
		                if (i % j == 0) {
		                    isPrime = false;
		                    break;
		                }
		            }
		            if (isPrime) {
		                System.out.println(i + " is a prime number");
		            }
		        }
		    }
		}




