package com.cimb.rma.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.cimb.utils.random.RandomService;

public class BasePage {

	public WebDriver driver;
	protected WebDriverWait wait;
	private RandomService random;
	

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
		this.random = new RandomService();
	}

	/************ ELEMENTS RELATED *****************/

	public boolean isElementPresent(WebElement element) {
		try {
			waitUntilElementIsVisible(element);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isElementPresent(WebElement element, long timeOutInSeconds) {
		try {
			waitUntilElementIsVisible(element, timeOutInSeconds);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean isElementInvisible(WebElement element, long timeOutInSeconds) {
		boolean isPresent = true;

		try {

			int count = 0;

			while (isPresent) {
				isPresent = isElementPresent(element, 1);
				Thread.sleep(500);

				if (count > timeOutInSeconds)
					break;

				count++;
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}

		return !isPresent;

	}

	public void waitUntilElementIsInvisible(WebElement element, long timeOutInSeconds) {
		if (!isElementInvisible(element, timeOutInSeconds))
			throw new RuntimeException(element + " still exists.");
	}

	public void waitUntilElementIsClickable(WebElement element) {
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitUntilElementIsClickable(WebElement element, long timeOutInSeconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void waitUntilElementIsVisible(WebElement element) {
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitUntilElementIsVisible(WebElement element, long timeOutInSeconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void waitUntilAllElementsIsVisible(List<WebElement> element, long timeOutInSeconds) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(timeOutInSeconds));
		wait.until(ExpectedConditions.visibilityOfAllElements(element));
	}

	public String getTextMessage(WebElement element) {
		waitUntilElementIsVisible(element);
		scrollToElement(element);
		String text = element.getText();

		if (text.isEmpty())
			text = element.getAttribute("value");

		return text;
	}

	public String getTextMessage(List<WebElement> elements) {
		String txt = "";
		int size = elements.size();

		for (WebElement element : elements) {
			txt = txt + element.getText();

			if (size > 1)
				txt = txt + ",";

			size--;
		}

		return txt;
	}

	public String getTextMessage(WebElement element, long timeOutInSeconds) {
		waitUntilElementIsVisible(element, timeOutInSeconds);
		scrollToElement(element);
		String text = element.getText();

		if (text.isEmpty())
			text = element.getAttribute("value");

		return text;
	}

	public void selectValueByRandom(List<WebElement> elements) {
		int size = elements.size();

		int rand = random.generateRandomNumber(0, size);
		elements.get(rand).click();
	}

	public void selectValueBySibling(List<WebElement> elements, String valueToSelect, String siblingTagName) {
		String tag = "./following-sibling::" + siblingTagName;

		for (WebElement element : elements) {
			WebElement e = element.findElement(By.xpath(tag));

			if (e.getText().equalsIgnoreCase(valueToSelect)) {
				element.click();
				break;
			}
		}
	}

	public void selectValueByText(String valueToSelect) {
		String path = "//*[contains(text(),'" + valueToSelect + "')]";

		WebElement element = driver.findElement(By.xpath(path));

		moveToClick(element);
	}

	public void selectValueByText(List<WebElement> elements, String valueToSelect) {
		elements.stream().filter(e -> e.getText().equals(valueToSelect)).findFirst().orElse(null).click();
	}

	public void selectValueByText(List<WebElement> elements, String[] valuesToSelect) {
		for (String text : valuesToSelect) {
			for (WebElement element : elements) {
				if (element.getText().equalsIgnoreCase(text)) {
					moveToClick(element);
					break;
				}
			}
		}
	}

	public void selectValueByContainText(List<WebElement> elements, String valueToSelect) {
		for (WebElement element : elements) {
			if (element.getText().contains(valueToSelect)) {
				moveToClick(element);
				break;
			}
		}
	}

	public void selectValueByContainText(List<WebElement> elements, String[] valuesToSelect) {
		for (String text : valuesToSelect) {
			for (WebElement element : elements) {
				if (element.getText().contains(text)) {
					moveToClick(element);
					break;
				}
			}
		}
	}

	public void selectValueByTextAndClass(String valueToSelect, String className) {
		String path = "//*[contains(@class, '" + className + "') and contains(text(),'" + valueToSelect + "')]";

		WebElement element = driver.findElement(By.xpath(path));
		element.click();
	}

	public void enterValue(WebElement element, String value) {
		waitUntilElementIsClickable(element);

		if (element.getAttribute("value").isEmpty()) {
			element.click();
			element.sendKeys(value);
		}
	}

	public void enterValue(WebElement element, String value, long timeOutInSeconds) {
		waitUntilElementIsClickable(element, timeOutInSeconds);

		if (element.getAttribute("value").isEmpty()) {
			element.click();
			element.sendKeys(value);
		}
	}

	public void clearValue(WebElement element) {
		waitUntilElementIsClickable(element);
		element.clear();
	}

	public void click(WebElement element) {
		waitUntilElementIsClickable(element);
		element.click();
	}

	public int click(List<WebElement> elements) {
		waitUntilAllElementsIsVisible(elements, 20);
		int size = elements.size();

		int rand = random.generateRandomNumber(0, size);
		elements.get(rand).click();

		return rand;
	}

	public void click(WebElement element, long timeOutInSeconds) {
		waitUntilElementIsClickable(element, timeOutInSeconds);
		element.click();
	}

	public void moveToClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().perform();
	}

	public void switchFrame(WebElement iframe) {
		waitUntilElementIsVisible(iframe, 40);
		driver.switchTo().frame(iframe);
	}

	public void switchToNextTab() {
		String currentTabHandle = driver.getWindowHandle();
		String newTabHandle = driver.getWindowHandles().stream().filter(handle -> !handle.equals(currentTabHandle))
				.findFirst().get();
		driver.switchTo().window(newTabHandle);
	}

	public void scrollToElement(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element);
		actions.perform();
	}
	
	public void selectdropdownVerify() throws InterruptedException {
	  //  Select select = new Select(element);
	    WebElement options = driver.findElement(By.xpath("//*[contains(text(),'Subscribe')]"));
	    System.out.println("Sharath   " +options.getText());
	    options.click();
	    Thread.sleep(2000);
	    }
	
	public void tabClick() throws AWTException
	{
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
	}
	
	public static String configFile(String key) throws IOException
	{
		String localDir = System.getProperty("user.dir");
		File file = new File(localDir+"/src/test/resources/testConfig.properties");
		System.out.println("Path  "+file);
		InputStream fis = new FileInputStream(file);
	    Properties prop = new Properties();
		 prop.load(fis);		 
		 String value=prop.getProperty(key);  
		 return value;
		
	}
	
		//Default Sorting
	public void sortingWebtableDefault(List<WebElement> tableName) throws InterruptedException

	{

	 List<WebElement> rows1=tableName;
	 System.out.println("Total No of rows are : " + rows1.size());
	 ArrayList<String> obtainedList = new ArrayList<>(); 
		
	
	 for(WebElement we:rows1){
	     
	
		obtainedList.add(we.getText());
		
            
	}
	 display("Default Sorted ",obtainedList);
	ArrayList<String> sortedList = new ArrayList<>();   
	for(String s:obtainedList){
	sortedList.add(s);
	
	
	}
	Collections.sort(sortedList);
	display("Expected Sorted ",sortedList);
	Assert.assertTrue(sortedList.equals(obtainedList));
	
	}
	
	
	public void sortingWebtableAsc(List<WebElement> tableName,WebElement columnName) throws InterruptedException

	{
	 waitUntilElementIsClickable(columnName,50);
	 Thread.sleep(5000);
	 click(columnName);
	 Thread.sleep(3000);
	 List<WebElement> rows=tableName;
	 System.out.println("Total No of rows are : " + rows.size());
	 ArrayList<String> obtainedList = new ArrayList<>(); 
	 for(WebElement we:rows){
	 obtainedList.add(we.getText());
	}
	 display("Application Sorted in Ascending order",obtainedList);
	ArrayList<String> sortedList = new ArrayList<>();   
	for(String s:obtainedList){
	sortedList.add(s);
	}
	Collections.sort(sortedList,String.CASE_INSENSITIVE_ORDER);
	display("Expected Ascending order",sortedList);
	Assert.assertTrue(sortedList.equals(obtainedList));
	Thread.sleep(3000);
	
	}
	
	public void sortingWebtableDsc(List<WebElement> tableName,WebElement columnName) throws InterruptedException

	{
	 waitUntilElementIsClickable(columnName,50);
	 Thread.sleep(3000);
	 click(columnName);
	 Thread.sleep(3000);
	 List<WebElement> rows=tableName;
	 System.out.println("Total No of rows are : " + rows.size());
	 ArrayList<String> obtainedList = new ArrayList<>(); 
	 for(WebElement we:rows){
	 obtainedList.add(we.getText());
	}
	 display("Applcation Descending order",obtainedList);
	ArrayList<String> sortedList = new ArrayList<>();   
	for(String s:obtainedList){
	sortedList.add(s);
	}
	Thread.sleep(3000);
	sortedList.sort(String.CASE_INSENSITIVE_ORDER.reversed());
	display("Expected Descending order",sortedList);
	Assert.assertTrue(sortedList.equals(obtainedList));
	
	
	}
	
	
	public void printSortingOrder(String orderType,String[] ar)
	{
	for(int i=0;i<ar.length;i++)
	System.out.println(orderType+"    "+ar[i]);
	
	}
	
	 public static void display(String msg,ArrayList<String> columnValues) {

		    System.out.print(msg);
		    for(String value : columnValues) {
		      System.out.println(value + ", ");
		    }
		  }
	 
	 public boolean isElementDisable(WebElement element) {
			try {
				waitUntilElementIsVisible(element);
				boolean disable=element.isSelected();
				System.out.print("disable   "+disable);
				return disable;
			} catch (Exception e) {
				return true;
			}
		}
	 
	 public boolean isElementEnable(WebElement element) {
			try {
				waitUntilElementIsVisible(element);
				boolean Enable=element.isEnabled();
				System.out.print("Enable   "+Enable);
				return Enable;
			} catch (Exception e) {
				return false;
			}
		}
	 public boolean isElementDisplayed(WebElement element) {
			try {
				waitUntilElementIsVisible(element);
				boolean displayed=element.isEnabled();
				return displayed;
			} catch (Exception e) {
				return false;
			}
		}
	 
	 public boolean isElementSelected(WebElement element) {
			try {
				waitUntilElementIsVisible(element);
				boolean selected=element.isEnabled();
				return selected;
			} catch (Exception e) {
				return false;
			}
		}
	 
	 public String btnEnabledORDisabledColor(WebElement element) {
			
				waitUntilElementIsVisible(element);
				String elementColor=element.getCssValue("color");
				System.out.println("elementColor   "+elementColor);
				return elementColor;
				
						
			}
	 
	 public void sortingDropdown(String options) throws InterruptedException

	 {
	 Thread.sleep(3000);
	 List<WebElement> dropdownOptions = driver.findElements(By.xpath(options));
	 System.out.println("Total No of Options are : " + dropdownOptions.size());
	 ArrayList<String> obtainedList = new ArrayList<>(); 
	 for(WebElement we:dropdownOptions){
	 obtainedList.add(we.getText());
	}
	 display("Application Sorted in Ascending order",obtainedList);
	ArrayList<String> sortedList = new ArrayList<>();   
	for(String s:obtainedList){
	sortedList.add(s);
	}
	Collections.sort(sortedList,String.CASE_INSENSITIVE_ORDER);
	display("Expected Ascending order",sortedList);
	Assert.assertTrue(sortedList.equals(obtainedList));
	Thread.sleep(3000);
		
	 }
	
	
}	
