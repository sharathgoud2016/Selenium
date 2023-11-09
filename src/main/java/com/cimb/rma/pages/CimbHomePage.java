package com.cimb.rma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CimbHomePage extends BasePage {

	@FindBy(css = "header h1")
	private WebElement headerNearestCIMB;

	@FindBy(tagName = "body")
	private WebElement body;

	/*********************************
	 * CONSTANTS
	 ************************************/

	public static final String PERSONAL_BANKING__PAGE_TITLE = "Personal Banking | Savings, Credit Cards and Loans | CIMB";
	public static final String FIND_BRANCHES_TITLE = "Locate Us | Branches | CIMB";
	public static final String CLICKS_PAGE_TITLE = "Welcome to CIMB Clicks Malaysia";
	public static final String HEADER_NEAREST_CIMB = "Find me the nearest CIMB in";

	public CimbHomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public String getBodyText() {
		return body.getText();
	}

	public String getNearestBranchHeader() {
		return getTextMessage(headerNearestCIMB);
	}

}
