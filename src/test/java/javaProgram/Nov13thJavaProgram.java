package javaProgram;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Nov13thJavaProgram {

	public static void main(String[] args) throws MalformedURLException {
	System.out.println("Hello");
	 ChromeOptions chromeOptions = new ChromeOptions();
	URL url=new URL("http://localhost:4444/wd/hub");
	RemoteWebDriver driver=new RemoteWebDriver(url,chromeOptions);
	driver.get("https://www.facebook.com/");
	try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	System.out.println("Facebook Title"+driver.getTitle());
	driver.quit();
	
	

	}

}
