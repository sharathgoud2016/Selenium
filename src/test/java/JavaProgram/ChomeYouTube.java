package JavaProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChomeYouTube {

	public static void main(String[] args) throws InterruptedException {


WebDriverManager.edgedriver().setup();

WebDriver driver=new EdgeDriver();
driver.manage().window().maximize();
driver.get("https://www.youtube.com/watch?v=WEQRH39xLNI");
Thread.sleep(5000);
Actions act=new Actions(driver);
WebElement comment_input = driver.findElement(By.cssSelector("#contenteditable-root"));
act.scrollToElement(comment_input);
/*driver.findElement(By.xpath("//div[@id='contenteditable-root']")).click();
driver.findElement(By.xpath("//div[@id='simplebox-placeholder']")).sendKeys("Sharath");
Thread.sleep(5000);
driver.findElement(By.xpath("//ytd-comments-header-renderer/div[@id='simple-box']/ytd-comment-simplebox-renderer[1]/div[3]/ytd-comment-dialog-renderer[1]/ytd-commentbox[1]/div[2]/div[1]/div[4]/div[5]/ytd-button-renderer[2]/yt-button-shape[1]/button[1]/yt-touch-feedback-shape[1]/div[1]/div[2]")).click();*/

String comment = "This is my automated comment.";
comment_input.sendKeys(comment);

//# Submit the comment by pressing Enter
comment_input.sendKeys(Keys.ENTER);

//# Wait for a few seconds to ensure the comment is posted (you can adjust the sleep duration)
Thread.sleep(5000);

//# Close the browser
driver.quit();

	}

}
