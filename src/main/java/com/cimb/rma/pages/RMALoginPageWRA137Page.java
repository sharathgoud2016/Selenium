package com.cimb.rma.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RMALoginPageWRA137Page extends BasePage {

	@FindBy(id = "mat-input-0")
	private WebElement txtBoxlanID;
	
	@FindBy(id = "mat-input-1")
	private WebElement txtBoxPwd;

	@FindBy(className = "mat-button-wrapper")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//span[contains(text(),'Unit Trust')]")
	private WebElement txtUTDashboard;
	
	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement btnLogout;
	
	@FindBy(xpath = "//span[contains(text(),'Continue')]")
	private WebElement btnContinue;
	
	@FindBy(xpath = "//span[contains(text(),'Cancel')]")
	private WebElement btnCancel;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/cimb-office-dialog-alert[1]/div[1]/div[1]/div[1]")
	private WebElement sessionInactive;

	@FindBy(xpath = "//p[contains(text(),'LAN ID and/or password is invalid. Please try again')]")
	private WebElement msgInvaidLogin;
	
	@FindBy(xpath = "//body/div[2]/div[4]/div[1]/mat-dialog-container[1]/cimb-office-dialog-alert[1]/div[1]/div[1]/mat-dialog-actions[1]/button[2]/span[1]")
	private WebElement btnContinueSession;
	
	@FindBy(xpath = "//body/div[2]/div[4]/div[1]/mat-dialog-container[1]/cimb-office-dialog-alert[1]/div[1]/div[1]/mat-dialog-actions[1]/button[1]/span[1]")
    private WebElement btnlogoutSessionInact;
	
	@FindBy(xpath = "//body/div[2]/div[120]/div[1]/mat-dialog-container[1]/cimb-office-dialog-alert[1]/div[1]/div[1]/mat-dialog-actions[1]/button[1]")
	private WebElement btnOkay;
	
	@FindBy(tagName = "/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/cimb-office-dialog-alert[1]/div[1]/div[1]/mat-dialog-actions[1]/button[1]")
	private WebElement logoutInactiveSess;
	
	@FindBy(tagName = "//span[contains(text(),'Continue Session')]")
	private WebElement continueInactiveSess;
		
	@FindBy(tagName = "circle")
	private WebElement loader;
	
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/article[1]/div[1]/div[1]/div[2]/div[1]/div[1]/ul[1]")
	private List<WebElement> testing;
	
	WebDriver drivercog;

	public RMALoginPageWRA137Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}


	public void waitUntilLoaderVisible() throws Exception {
		waitUntilElementIsVisible(txtUTDashboard, 40);
	}
	
	public void waitUntilLoaderinvalidLogin() throws Exception {
		waitUntilElementIsVisible(msgInvaidLogin, 40);
	}
	
public void validateURL() {
		
		String currenturl=driver.getCurrentUrl();
		Assert.assertEquals(currenturl,"https://wlt01.apps.tcjteam.tech/api/sso/login");
		
	}
	
	public void rmaLogin(String lanID,String password) throws Exception
	{
		
		enterValue(txtBoxlanID,lanID);
		enterValue(txtBoxPwd,password);
		click(btnLogin);
		waitUntilLoaderVisible();
		
	}
	
	public void rmaInvalidLogin(String lanID,String password) throws Exception
	{
		
		enterValue(txtBoxlanID,lanID);
		enterValue(txtBoxPwd,password);
		click(btnLogin);
		waitUntilLoaderinvalidLogin();
		String invalidLoginMsg=msgInvaidLogin.getText();
		System.out.println("ErrorMsg  "+invalidLoginMsg);
		Assert.assertEquals(invalidLoginMsg,"LAN ID and/or password is invalid. Please try again.");
		//boolean verifyErrorMsg= invalidLoginMsg.equals("LAN ID and/or password is invalid. Please try again.");
		//return verifyErrorMsg;		
	
	}
	
	public void errorMsgInvalidLogin() throws Exception
	{
		
		String invalidLoginMsg=msgInvaidLogin.getText();
		System.out.println("ErrorMsg  "+invalidLoginMsg);
		Assert.assertEquals(invalidLoginMsg,"LAN ID and/or password is invalid. Please try again.");
		
	}
	

	
	public void dashboardPage() throws InterruptedException
	{
		
		Thread.sleep(4000);
		String dashboardText=txtUTDashboard.getText();
		Assert.assertEquals(dashboardText,"Unit Trust");
		
	
	}
	
	public void logoutApplication() throws Exception
	{
		
		waitUntilLoaderVisible();
		tabClick();
		click(btnLogout);
		
		
		
	}
	public void continueBtn() throws Exception
	{
		
		click(btnContinue);
	
		
		
	}
	
	public void cancelBtn() throws Exception
	{
		
		click(btnCancel);
		
		
		
	}
	
	public void launchAppIncognitoMode(String url) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		drivercog = new ChromeDriver(options);
		drivercog.get(url);
		Thread.sleep(5000);
		
	}
	
	public void loginIncog(String landID,String pwd) {
		
		drivercog.findElement(By.id("mat-input-0")).sendKeys(landID);
		drivercog.findElement(By.id("mat-input-1")).sendKeys(pwd);
		drivercog.findElement(By.className("mat-button-wrapper")).click();
		
	}
	
	public void continueBtnExist() throws Exception
	{
		
		boolean continueBtnPresent=isElementPresent(btnContinue,40);
		Assert.assertEquals(continueBtnPresent,true);
		
	}
	
	public void cancelBtnExist() throws Exception
	{
		
		boolean cancelBtnPresent=isElementPresent(btnCancel,40);
		Assert.assertEquals(cancelBtnPresent,true);
		
		
		
	}
	
	 public void inActivitySessionWait()
	    
	    {
	    	waitUntilElementIsVisible(sessionInactive, 330);
	    }

    public void sessionInactiveVerify() throws Exception
		{
			
			boolean sessionInactivity=isElementPresent(sessionInactive,40);
			Assert.assertEquals(sessionInactivity,true);
			
					
		}
			
		public void continueSessionBtnExist() throws Exception
		{
			
			boolean continueSessionBtnPresent=isElementPresent(btnContinueSession,40);
			Assert.assertEquals(continueSessionBtnPresent,true);
			
		}
		
		public void logoutBtnExistSsnInactivity() throws Exception
		{
			
			boolean logoutBtnPresent=isElementPresent(btnlogoutSessionInact,40);
			Assert.assertEquals(logoutBtnPresent,true);
			
					
		}
		public void logoutInactiveSessionClick() throws Exception {

			waitUntilElementIsVisible(logoutInactiveSess);
			click(logoutInactiveSess);
			
		}
		public void continueInactiveSessionClick() throws Exception {

			waitUntilElementIsVisible(continueInactiveSess,400);
			click(continueInactiveSess);
			
		}
		
		public void valideTab() throws Exception
		{
			List<WebElement> allOptions=testing;
			for(int i=0; i<allOptions.size(); i++) {
				System.out.println(allOptions.get(i).getText());
			}
		}
			public void facebookLogin(String username,String password) throws Exception
			{
				driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);

		        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);

		        Thread.sleep(5000);

		        driver.findElement(By.xpath("//button[@id='loginbutton']")).click();

		        Thread.sleep(5000);
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
			
			
		}
}