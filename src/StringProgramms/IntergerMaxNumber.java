package StringProgramms;

public class IntergerMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr= {10,20,40,30,50,70,40};
		
		int[] arr1= {10,50,2,8,90,100,40};
		
		//int tempValue=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr1.length;j++)
			{
				
			if(arr[i]==(arr1[j]))
			{
		
				
				System.out.println("Maximum number in given array is "+(arr1[j]));

			}
		}
		}
		
	}
	
	
	

}
