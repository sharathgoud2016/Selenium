package javaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class JavaScriptExe {
    public static void main(String args[])
    {
        WebDriverManager.edgedriver().setup();
       
        // Instantiate a Driver class.
        WebDriver driver = new EdgeDriver();
       
        // Maximize the browser
        driver.manage().window().maximize();
       
        // Launch Website
        driver.get("https://www.geeksforgeeks.org/");
       
        WebElement java = driver.findElement(By.xpath(""));
       
        // Create a reference
        JavascriptExecutor js = (JavascriptExecutor)driver;
       
        // Call the JavascriptExecutor methods
        js.executeScript("arguments[0].click();", java);
        driver.close();
    }
}
