package StringProgramms;

public class MaxIntArrayr {

	
		public static void main(String[] args) {
		// TODO Auto-generated method stub

			int[] arr= {8,9,7,6,5,4,3,1,4,20,20};
			
			int tempvalue=arr[0];
			
			for(int i =0;i<arr.length;i++)
			{
				if(arr[i]>tempvalue)
				{
					tempvalue=arr[i];
				}
						
			}
			
			System.out.println("the maximum number in array is given "+tempvalue);
	}

}
