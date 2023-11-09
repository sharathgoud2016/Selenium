package com.cimb.rma.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RMApplicationDashboardWRA141Page extends BasePage {


	/***************** PERSONAL DETAILS ******************/
	
	@FindBy(id = "name_personal_details")
	private WebElement txtFullName;
	
	@FindBy(xpath = "//h2[contains(text(),'Application Status')]")
	private WebElement applicationstatusText;
	
	@FindBy(xpath = "//span[contains(text(),'Unit Trust')]")
	private WebElement unitTrustTab;
	
	@FindBy(xpath = "//span[contains(text(),'ASNB')]")
	private WebElement asnbproduct;
	
	@FindBy(xpath = "//mat-select[@id='mat-select-3']")
	private WebElement createondropdown;
	
	@FindBy(xpath = "//mat-select[@id='mat-select-4']")
	private WebElement filterbytypedropdown;
	
	@FindBy(xpath = "//mat-select[@id='mat-select-6']")
	private WebElement filterbystatusdropdown;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	private WebElement createOnArrow;
	
	@FindBy(xpath = "//*[contains(text(),'Last 1 Month')]")
	private WebElement createonSecondValue;
	
	@FindBy(xpath = "//*[contains(text(),'Last 7 Days')]")
	private WebElement createonFirstValue;
	
	@FindBy(xpath = "//*[contains(text(),'Last 3 Months')]")
	private WebElement createonThirdValue;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
	private WebElement createonAll;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	private WebElement filterByType;
	
	@FindBy(xpath = "//span[contains(text(),'Subscribe')]")
	private WebElement filterByTypeSubscribe;
	
	@FindBy(xpath = "//mat-cell[contains(text(),'Subscribe')]")
	private WebElement subscribeFilterResult;
	
	@FindBy(xpath = "//span[contains(text(),'Redeem')]")
	private WebElement filterByTypeRedeem;
	
	@FindBy(xpath = "//mat-cell[contains(text(),'Redeem')]")
	private WebElement redeemFilterResult;
	
	@FindBy(xpath = "//span[contains(text(),'Switch')]")
	private WebElement filterByTypeSwitch;
	
	@FindBy(xpath = "//mat-cell[contains(text(),'Switch')]")
	private WebElement switchFilterResult;
	
	@FindBy(xpath = "//span[contains(text(),'Bundle')]")
	private WebElement filterByTypeBundle;
	
	@FindBy(xpath = "//span[contains(text(),'RPQ Update')]")
	private WebElement filterByTypeRPQupdate;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")
	private WebElement filterByTypeAll;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[3]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	private WebElement filterByStatus;
	
	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[3]/span[1]")
	private WebElement filterByStatusPA;
	
	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[4]/span[1]")
	private WebElement filterByStatusConf;
	
	@FindBy(xpath = "//div[contains(text(),'No Investments Made')]")
	private WebElement msgVerify;
	
	@FindBy(xpath = "//span[contains(text(),'Reset')]")
	private WebElement resetButton;
	
	@FindBy(xpath = "//span[contains(text(),'Completed')]")
	private WebElement filterByStatuscomp;
	
	@FindBy(xpath = "//span[contains(text(),'Rejected')]")
	private WebElement filterByStatusRej;
	
	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")
	private WebElement filterByStatusAll;
	
	@FindBy(xpath = "//span[contains(text(),'Processing')]")
	private WebElement filterByStatusProcess;
	
	@FindBy(xpath = "//body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[1]/mat-header-cell[2]/div[1]/div[2]")
	private WebElement customerHeaderCell;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-paginator[1]/div[1]/div[1]/div[1]/button[3]/span[1]/*[1]")
	private WebElement nextPageArrow;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-paginator[1]/div[1]/div[1]/div[1]/button[2]/span[1]/*[1]")
	private WebElement firstPageArrow;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-paginator[1]/div[1]/div[1]")
	private WebElement noResultFound;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[1]/mat-header-cell[1]")
	private WebElement createdOnVer;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[1]/mat-header-cell[2]")
	private WebElement customerNameVer;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[1]/mat-header-cell[3]")
	private WebElement transactiontypeVer;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[1]/mat-header-cell[4]")
	private WebElement referenceIDver;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[1]/mat-header-cell[5]")
	private WebElement appStatusVer;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]")
	private WebElement tableLayoutVer;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-paginator[1]/div[1]/div[1]/div[1]/button[1]/span[1]/*[1]")
	private WebElement previousPageArrow;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-paginator[1]/div[1]/div[1]/div[1]/button[4]/span[1]/*[1]")
	private WebElement lastPageArrow;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-paginator[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement pageRecordResult;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]")
	private WebElement landOnRMAapp;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]")
	private WebElement noDataInDashboard;
	
	@FindBy(xpath = "//div[contains(text(),'No Investments Made')]")
	private WebElement noDataInApp;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]")
	private WebElement dashboardAppStatusWebTable;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr/mat-cell[2]")
	private WebElement appStatusRows;
	
	@FindBy(xpath = "//div[contains(text(),'CUSTOMER')]")
	private WebElement appStatusCustomerColumn;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-paginator[1]/div[1]/div[1]/div[1]/div[1]")
	private WebElement appStatusNumberofRows;
	
	@FindBy(xpath="/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr/mat-cell[2]")
	private List<WebElement> appStatusCustomerColumValues;
	
	@FindBy(xpath = "//div[contains(text(),'CREATED ON')]")
	private WebElement appStatusCreatedONColumn;
	
	@FindBy(xpath="/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr/mat-cell[1]")
	private List<WebElement> appStatusCreatedOnColumValues;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]")
	private WebElement dashboardVerify;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[1]/div[1]/cimb-customer-search-bar[1]/div[1]/mat-form-field[1]/div[1]/div[1]")
	private WebElement searchCustomerID;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/mat-option[1]/span[1]/div[1]")
	private WebElement customerID;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]")
	private WebElement customerPageVer;
	

	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]")
	private WebElement verifyAll;
	
	@FindBy(xpath = "//div[@id='mat-tab-label-0-1']")
	private WebElement transactionStatus;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	private WebElement transTypeDropDown;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	private WebElement createdOnDropdownCP;
	
	@FindBy(xpath = "//mat-option[@id='mat-option-36']")
	private WebElement lastThreeMonthsCP;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[2]/div[1]")
	private WebElement tableVerifyCP;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	private WebElement transTypeArrowCP;

	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")
	private WebElement transTypeAllCP;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]/div[2]/div[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]")
	private WebElement displayAll;
	
	@FindBy(xpath = "//mat-option[@id='mat-option-45']")
	private WebElement subscribeClickOnCP;
	
	@FindBy(xpath = "//div[@id='mat-select-value-5']")
	private WebElement filetrBytypeAllVerify;
	
	@FindBy(xpath = "//div[@id='mat-tab-label-0-1']")
	private WebElement applicationStatCP;
	   


	// public static final String OPTIONS_SAME_PERMANENT_ADDRESS = "Same as
	// Permanent Address";

	public RMApplicationDashboardWRA141Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	/******** Toast Message ********/
	public boolean isToastMsgPresent() {
		return isElementPresent(txtFullName);
	}

	public void appstatusVerify() throws Exception {

		waitUntilElementIsVisible(applicationstatusText);
		boolean appstatus = isElementPresent(applicationstatusText, 40);
		Assert.assertEquals(appstatus, true);
	}
	public void unittrustTabVerify() throws Exception {

		waitUntilElementIsVisible(unitTrustTab);
		boolean unittrust = isElementPresent(unitTrustTab, 40);
		Assert.assertEquals(unittrust, true);
	}
	public void unitTrustClick() throws Exception {

		waitUntilElementIsVisible(unitTrustTab);
		click(unitTrustTab);
	}
	public void asnbTabVerify() throws Exception {

		waitUntilElementIsVisible(asnbproduct);
		boolean asnbproductVerify = isElementPresent(asnbproduct, 40);
		Assert.assertEquals(asnbproductVerify, true);
		String asnbproductValue = asnbproduct.getText();
		System.out.println("asnbproductValue   " + asnbproductValue);
	}
	public void asnbClick() throws Exception {

		waitUntilElementIsVisible(asnbproduct);
		click(asnbproduct);
	}
	
	public void createdondropdownVerify() throws Exception {
		
	    click(createonAll);
	    
	    Thread.sleep(5000);
        waitUntilElementIsVisible(createonFirstValue);
		boolean createonFirstVerify = isElementPresent(createonFirstValue, 40);
		Assert.assertEquals(createonFirstVerify, true);
		
        boolean createonSecondVerify = isElementPresent(createonSecondValue, 40);
		Assert.assertEquals(createonSecondVerify, true);
		
		boolean createonThirdVerify = isElementPresent(createonThirdValue, 40);
		Assert.assertEquals(createonThirdVerify, true);
		
        
	}
	public void dropdownArrowClick() throws Exception {

		waitUntilElementIsVisible(createOnArrow);
		click(createOnArrow);
	}
	
	public void createonfirstValueClick() throws Exception {

		waitUntilElementIsVisible(createonFirstValue);
		click(createonFirstValue);
	}
	public void createonfirstValueVerify() throws Exception {

		waitUntilElementIsVisible(createonFirstValue);
		click(createonFirstValue);
	}
	public void filterByTypeClick() throws Exception {

		waitUntilElementIsVisible(filterByType);
		click(filterByType);
	}
	public void filterByTypeSubscribeClick() throws Exception {

		waitUntilElementIsVisible(filterByTypeSubscribe);
		click(filterByTypeSubscribe);
		
	}
	public void filterByTypeSubVerify() throws Exception {

		boolean subVerify = isElementPresent(subscribeFilterResult, 40);
		Assert.assertEquals(subVerify, true);
		String subscribeText= subscribeFilterResult.getText();
		Assert.assertEquals(subscribeText, "Subscribe");
		System.out.println("SubscribeResult    " +subscribeText );
	}
	public void filterByTypeRedClick() throws Exception {

		waitUntilElementIsVisible(filterByType);
		click(filterByType);
	}
	public void filterByTypeRedeemClick() throws Exception {

		waitUntilElementIsVisible(filterByTypeRedeem);
		click(filterByTypeRedeem);
	}
	public void redeemButtonVerify() throws Exception {

		boolean redeemVerify = isElementPresent(filterByTypeRedeem, 40);
		Assert.assertEquals(redeemVerify, true);
		
	}	
	public void filterByTypeRedeemVerify() throws Exception {

		boolean redVerify = isElementPresent(redeemFilterResult, 40);
		Assert.assertEquals(redVerify, true);
		String redeemText= redeemFilterResult.getText();
		Assert.assertEquals(redeemText, "Redeem");
		System.out.println("RedeemResult    " +redeemText );
	}
	public void filterByTypeSwitchClick() throws Exception {

		waitUntilElementIsVisible(filterByTypeSwitch);
		click(filterByTypeSwitch);
	}
	public void filterByTypeBundleClick() throws Exception {

		waitUntilElementIsVisible(filterByTypeBundle);
		click(filterByTypeBundle);
	}
	public void filterByTypeRPQClick() throws Exception {

		waitUntilElementIsVisible(filterByTypeRPQupdate);
		click(filterByTypeRPQupdate);
	}
	public void filterByTypeAllClick() throws Exception {

		waitUntilElementIsVisible(filterByTypeAll);
		click(filterByTypeAll);
		
	}
	public void createonThirdValueClick() throws Exception {

		waitUntilElementIsVisible(createonThirdValue);
		click(createonThirdValue);
	}
	public void filterByStatusClick() throws Exception {

		waitUntilElementIsVisible(filterByStatus);
		click(filterByStatus);
	}
	public void filterByStatusPAClick() throws Exception {

		waitUntilElementIsVisible(filterByStatusPA);
		click(filterByStatusPA);
	}
	public void filterByStatusConfClick() throws Exception {

		waitUntilElementIsVisible(filterByStatusConf);
		click(filterByStatusConf);
	}
	public void messageVerify() throws Exception {

		boolean messageVerify = isElementPresent(msgVerify, 40);
		Assert.assertEquals(messageVerify, true);
	}	
	public void resetClick() throws Exception {

		waitUntilElementIsVisible(resetButton);
		click(resetButton);
	}
	public void filterByStatusCompClick() throws Exception {

		waitUntilElementIsVisible(filterByStatuscomp);
		click(filterByStatuscomp);
	}	
	public void filterByStatusRejClick() throws Exception {

		waitUntilElementIsVisible(filterByStatusRej);
		click(filterByStatusRej);
	}
	public void filterByStatusAllClick() throws Exception {

		waitUntilElementIsVisible(filterByStatusAll);
		click(filterByStatusAll);
	}
	public void filterByStatusProClick() throws Exception {

		waitUntilElementIsVisible(filterByStatusProcess);
		click(filterByStatusProcess);
	}
	public void customerHeaderCellClick() throws Exception {

		waitUntilElementIsVisible(customerHeaderCell);
		click(customerHeaderCell);
	}
	public void isResetDisable() throws Exception {
		Boolean reset =driver.findElement(By.xpath("//span[contains(text(),'Reset')]")).isEnabled();
	    if(reset) {
 	        System.out.println("Yes ! Element is Present");
	    }
        else {
            System.out.println("NO ! Element is not Present");
	     }
	}
	public void nextPageArrowClick() throws Exception {

		waitUntilElementIsVisible(nextPageArrow);
		click(nextPageArrow);
	}
	public void nextPageArrowVerify() throws Exception {

		boolean nextArrowVerify = isElementPresent(nextPageArrow, 40);
		Assert.assertEquals(nextArrowVerify, true);
	}
	public void firstPageArrowClick() throws Exception {

		waitUntilElementIsVisible(firstPageArrow);
		click(firstPageArrow);
	}
	public void firstPageArrowVerify() throws Exception {

		boolean previousArrowVerify = isElementPresent(firstPageArrow, 40);
		Assert.assertEquals(previousArrowVerify, true);
	}
	public void switchResultVerify() throws Exception {

		boolean switchResultVer = isElementPresent(noResultFound, 40);
		Assert.assertEquals(switchResultVer, true);
	}
	public void bundleResultVerify() throws Exception {

		boolean bundleResultVer = isElementPresent(noResultFound, 40);
		Assert.assertEquals(bundleResultVer, true);
	}
	public void rpqResultVerify() throws Exception {

		boolean rpqResultVer = isElementPresent(noResultFound, 40);
		Assert.assertEquals(rpqResultVer, true);
	}
	public void createdOnVerify() throws Exception {

		boolean createdonVer = isElementPresent(createdOnVer, 40);
		Assert.assertEquals(createdonVer, true);
	}
	public void customerNameVerify() throws Exception {

		boolean custNameVer = isElementPresent(customerNameVer, 40);
		Assert.assertEquals(custNameVer, true);
	}
	public void transactiontypeVerify() throws Exception {

		boolean transTypeVer = isElementPresent(transactiontypeVer, 40);
		Assert.assertEquals(transTypeVer, true);
	}
	public void referenceIDverify() throws Exception {

		boolean refIDver = isElementPresent(referenceIDver, 40);
		Assert.assertEquals(refIDver, true);
	}
	public void applicationStatVerify() throws Exception {

		boolean appstatusVer = isElementPresent(appStatusVer, 40);
		Assert.assertEquals(appstatusVer, true);
	}
	public void tableLayoutVerify() throws Exception {

		boolean tableVerify = isElementPresent(tableLayoutVer, 40);
		Assert.assertEquals(tableVerify, true);
	}
	public void previosPgArrowVerify() throws Exception {

		boolean previousPgVer = isElementPresent(previousPageArrow, 40);
		Assert.assertEquals(previousPgVer, true);
	}
	public void lastPgArrowVerify() throws Exception {

		boolean lastPgVer = isElementPresent(lastPageArrow, 40);
		Assert.assertEquals(lastPgVer, true);
	}
	public void pageRecordVerify() throws Exception {

		boolean pageRecord = isElementPresent(pageRecordResult, 40);
		Assert.assertEquals(pageRecord, true);
	}
	 public void firstTimeOnRMAapp() throws Exception {

			boolean  loginFirstTime= isElementPresent(landOnRMAapp, 40);
			Assert.assertEquals(loginFirstTime, true);
			
	} 
	 public void noDataInDashboardVerify() throws Exception {

			boolean  dashboard= isElementPresent(noDataInDashboard, 40);
			Assert.assertEquals(dashboard, true);
			
	} 
	public void noDataInAppVerify() throws Exception {

			boolean  application= isElementPresent(noDataInApp, 40);
			Assert.assertEquals(application, true);
			
	} 
	 
	 public void sortingWebtableCustomer() throws InterruptedException {

		 sortingWebtableAsc(appStatusCustomerColumValues,appStatusCustomerColumn);
		 sortingWebtableDsc(appStatusCustomerColumValues,appStatusCustomerColumn);
	 
	 }	
	 
	 
	 public void sortingWTTrasactionDateDefault() throws InterruptedException
	 {

		 sortingWebtableDefault(appStatusCreatedOnColumValues);
		 
	 }	
	 
	 
	 public void sortingWebtableTrasactionDate() throws InterruptedException
	 {

		 sortingWebtableAsc(appStatusCreatedOnColumValues,appStatusCreatedONColumn);
		 sortingWebtableDsc(appStatusCreatedOnColumValues,appStatusCreatedONColumn);
	 
	 }	
	 public void dashboardVerify() throws Exception {

			boolean  dashboardverify= isElementPresent(dashboardVerify, 40);
			Assert.assertEquals(dashboardverify, true);
			
	 } 
	 public void searchForCustomerID() throws Exception {

			waitUntilElementIsVisible(searchCustomerID);
			click(searchCustomerID);
			
     }
	 public void customerIDclick() throws Exception {

			waitUntilElementIsVisible(customerID);
			click(customerID);
			
     }
	 public void customerPageVerify() throws Exception {

			boolean customePage = isElementPresent(customerPageVer, 40);
			Assert.assertEquals(customePage, true);
			
	 } 
	 public void transactionStatusclick() throws Exception {

		waitUntilElementIsVisible(transactionStatus);
		click(transactionStatus);
		
     }
	 public void transactionDropDownClick() throws Exception {

		waitUntilElementIsVisible(transTypeDropDown);
		click(transTypeDropDown);
		
     }
	 public void newAccountTypeVerify() throws Exception {

			boolean  newAccountverify= isElementPresent(null, 40);
			Assert.assertEquals(newAccountverify, false);
			
	 } 
	 public void createOnArrowClick() throws Exception {

			waitUntilElementIsVisible(createOnArrow);
			click(createOnArrow);
			
	 }
	 public void createdOnDropdownCP() throws Exception {

			waitUntilElementIsVisible(createdOnDropdownCP);
			click(createdOnDropdownCP);
			
	     }
		 public void lastThreeMonthsCPclick() throws Exception {

			waitUntilElementIsVisible(lastThreeMonthsCP);
			click(lastThreeMonthsCP);
			
	     }
		 public void tableVerifyCP() throws Exception {

				boolean tableverifyCP = isElementPresent(tableVerifyCP, 40);
				Assert.assertEquals(tableverifyCP, true);
				
		 } 
		 public void filetrByTypeAllCP() throws Exception {

				waitUntilElementIsVisible(transTypeArrowCP);
				click(transTypeArrowCP);
				
	     }
		 public void selectAllCP() throws Exception {

				waitUntilElementIsVisible(transTypeAllCP);
				click(transTypeAllCP);
				
	     }
		 public void allTransTypeCPVerify() throws Exception {

				boolean displayAllVer = isElementPresent(displayAll, 40);
				Assert.assertEquals(displayAllVer, true);
				
		 } 
		 public void subscribeClickOnCP() throws Exception {

				waitUntilElementIsVisible(subscribeClickOnCP);
				click(subscribeClickOnCP);
				
	     }
		 public void filetrBytypeAllVerify() throws Exception {

				boolean filetrBytypeAllverify = isElementPresent(filetrBytypeAllVerify, 40);
				Assert.assertEquals(filetrBytypeAllverify, true);
				
		 } 
		 public void applicationStatCP() throws Exception {

				waitUntilElementIsVisible(applicationStatCP);
				click(applicationStatCP);
				
	     }
		
		
		
}	
	 
	 
	
	
	

