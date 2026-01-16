package com.cimb.rma.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RMTransSetupWRA160Page extends BasePage {


	/***************** PERSONAL DETAILS ******************/
	
	@FindBy(xpath = "//input[@id='mat-input-2']")
	private WebElement refCode;
	
	@FindBy(xpath = "//input[@id='mat-input-3']")
	private WebElement refName;

	@FindBy(xpath = "//input[@id='mat-input-4']")
	private WebElement refBranch;
	
	@FindBy(xpath = "//span[contains(text(),'Add Referral')]")
	private WebElement clickAddRefSection;
	
	@FindBy(xpath = "//span[contains(text(),'Home')]")
	private WebElement homePage;
	
	@FindBy(xpath = "//div[@role='listbox']")
	private WebElement options;
	
	String refBranchDropdown="//div[@role='listbox']";

	  public RMTransSetupWRA160Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	  }
	  
	  public void refFieldsVerify() throws Exception{
			
		    waitUntilElementIsVisible(clickAddRefSection);
		    click(clickAddRefSection);
		    Thread.sleep(3000);
		    boolean refCodeVerify=isElementPresent(refCode,40);
			Assert.assertEquals(refCodeVerify,true);
			boolean refNameVerify=isElementPresent(refName,40);
			Assert.assertEquals(refNameVerify,true);
			boolean refBranchVerify=isElementPresent(refBranch,40);
			Assert.assertEquals(refBranchVerify,true);
			
	  }
	  public void enterReferralValues() throws Exception{
			
			waitUntilElementIsVisible(refCode);
			enterValue(refCode,"123456");
			
			waitUntilElementIsVisible(refCode);
			enterValue(refName,"CIMB");
			

			waitUntilElementIsVisible(refCode);
			enterValue(refBranch,"1414 - Sri Petaling");
			refBranch.sendKeys(Keys.DOWN, Keys.RETURN);
			
	  }
	 
	  public void sortingOrderRefBranch() throws Exception{
			
			waitUntilElementIsVisible(refCode);
			enterValue(refCode,"123456");
			
			waitUntilElementIsVisible(refCode);
			enterValue(refName,"CIMB");
			

			waitUntilElementIsVisible(refCode);
			click(refBranch);
			sortingDropdown(refBranchDropdown);
			enterValue(refBranch,"1414 - Sri Petaling");
			refBranch.sendKeys(Keys.DOWN, Keys.RETURN);
			
	  }
	 
	  public void homePageClick() throws Exception{
			
		  tabClick();
		  tabClick();
		  Thread.sleep(4000);
		   JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("scroll(0,-250);");
	       Thread.sleep(2000);
		  click(homePage);
		  Thread.sleep(2000);
		  
			
	  }
			
			
	  }
	  
	  
	  
	  
	  
	  
	  
	  

	