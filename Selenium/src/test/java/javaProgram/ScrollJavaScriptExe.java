package javaProgram;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.JavascriptExecutor;

public class ScrollJavaScriptExe {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.get("https://www.browserstack.com");
		/*js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		js.executeScript("document.getElementById('user_password').value='password';");
		js.executeScript("document.getElementById('user_submit').click();");
		js.executeScript("alert('enter correct login credentials to continue');");*/
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		driver.switchTo().newWindow(WindowType.TAB); // OPENS NEW TAB
		Thread.sleep(4000);
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.WINDOW); // OPENS NEW TAB
		Thread.sleep(4000);
		driver.get("https://www.facebook.com");
		Thread.sleep(4000);
		FileInputStream fs=new FileInputStream("");
		XSSFWorkbook wb=new XSSFWorkbook();
		driver.close();
		

	}

}
