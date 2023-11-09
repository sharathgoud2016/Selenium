package JavaProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EncoraLoop {

	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://www.google.com/");
      driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("theater in the city");
      List<WebElement> links=driver.findElements(By.tagName("a"));
      int size=links.size();
      System.out.println(links.get(size-1).getText());
      for(WebElement k:links)
      {
    	  if(k.getText().equals("xyz"))
    		  
    	   {
    		 k.click();
    	  }
      }
		

	}

}
