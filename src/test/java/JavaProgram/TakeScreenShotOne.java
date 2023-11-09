package JavaProgram;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TakeScreenShotOne {

	public static void main(String[] args) {
		// TODO Auto-generated method WebDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Actions act=new Actions(driver);
		act.sendKeys(driver.findElement(By.name("click")),Keys.ENTER).build().perform();
		String path="C:\\Users\\\\shara\\Desktop\\Screenshot.png";
		File ts=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(ts, new File((path)));
			
		}catch(Exception e)
		{
			e.getMessage();
		}
		
		driver.close();
	}

}
