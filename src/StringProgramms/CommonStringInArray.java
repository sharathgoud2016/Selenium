package StringProgramms;

public class CommonStringInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="welcome to java program1";
		String str2="welcome to java program2";
		
	//	String array[]= {"welcome","to","java,program1"};
		//String array1[]=
				
		String[] str1split=str1.split(" ");
		String[] str2split=str2.split(" ");
		
		for(int i=0;i<str1split.length;i++)
		{
			for(int j =0;j<str2split.length;j++)
			{
				if((str1split[i]).equals(str2split[j]))
				{
					System.out.println("Common Elements in two arrays is "+ str2split[j]);
				}
			}
		}
	}

}
