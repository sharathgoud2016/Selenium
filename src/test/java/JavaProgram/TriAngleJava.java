package JavaProgram;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TriAngleJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.get("https://automatenow.io/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	WebElement we=driver.findElement(By.xpath("//*[contains(text(),'Training')]"));
	File srcfile=we.getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(srcfile,new File("./screenshotone.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.close();
	int row=5,x,y;
		for(x=0;x<row;x++)
		{
		for(y=row-x;y>=1;y--)
		{
			System.out.print(" ");
		}	
			for(y=0;y<=x;y++)
			{
				System.out.print("x");
			}
			
			System.out.println();
		}
		
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("y");
			}
			System.out.println();
		}
		 

	}

}
