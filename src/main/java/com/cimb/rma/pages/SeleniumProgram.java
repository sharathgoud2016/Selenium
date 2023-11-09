package com.cimb.rma.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumProgram {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
        // Setup ChromeDriver using WebDriverManager
        
    //System.setProperty("webdriver.edge.driver", "D:\\SeleniumWorkSpace\\Selenium_ Project\\msedgedriver");





       WebDriverManager.chromiumdriver().setup();
        
       // Create a new instance of the ChromeDriver
        
        WebDriver driver = new ChromeDriver();
      //  Thread.sleep(10000);
        
        // Your test automation code here...
        
        driver.get("https://www.facebook.com/login");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gowris036@gmail.com");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Bangalore@123");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
        Thread.sleep(5000);
      /*  String currentwindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();
        Iterator<String> i = allWindows.iterator();
        while(i.hasNext()){
           String childwindow = i.next();
           if(!childwindow.equalsIgnoreCase(currentwindow)){
              driver.switchTo().window(childwindow);
              System.out.println("The child window is "+childwindow);
           } else {
              System.out.println("There are no children");
           }
        WebElement closeButton = driver.findElement(By.xpath("//button[@class='close-button']"));

        // Click the close button to dismiss the notification
        if (closeButton.isDisplayed()) {
            closeButton.click();
        }*/
       // Robot rb=new Robot();
       // rb.keyPress(KeyEvent.VK_ESCAPE);
        try {

        	   // Check the presence of alert
        	   Alert alert = driver.switchTo().alert();

        	   // if present consume the alert
        	   alert.dismiss();

        	  } catch (NoAlertPresentException ex) {
        	     //code to do if not exist.
        	  }
        Actions act = new Actions(driver);
        act.sendKeys(Keys.ESCAPE).build().perform();
        act.click(driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]"))).build().perform();
      //  driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[5]/div[1]/span[1]/div[1]/div[1]/div[1]/svg[1]/g[1]/image[1]")).click();
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        driver.findElement(By.xpath("//span[contains(text(),'Log out')]")).click();
        // Close the browser
        driver.quit();
    }
	}


