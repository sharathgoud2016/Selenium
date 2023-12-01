package javaProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;



public class SeleniumClass {
	
	public static void main(String[] args) throws InterruptedException
	{
	ChromeOptions ffo=new ChromeOptions();
	ffo.setBrowserVersion("Beta");
	WebDriver driver=new ChromeDriver(ffo);
	driver.get("https://www.google.com");
	Thread.sleep(5000);
	
	
	}
}
