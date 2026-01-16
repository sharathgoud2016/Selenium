package javaProgram;

public class TriaglePatternOne {

	public static void main(String[] args) {
		int row=5,x,y;
		
		for(x=0;x<row;x++)
		{
			for(y=row-x;y>=1;y--)
			{
				System.out.print(" ");
			}
			for(y=0;y<=x;y++)
			{
				System.out.print("x ");	
			}
			System.out.println();
		}
		
		

	}

}
