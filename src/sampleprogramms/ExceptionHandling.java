package sampleprogramms;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 try {
		int  i = 50/0;
		
		System.out.println(i);
 } catch(Exception e)
 {
	 System.out.println(e.getMessage());
	 
 }
		System.out.println("Hello");
	}


}
