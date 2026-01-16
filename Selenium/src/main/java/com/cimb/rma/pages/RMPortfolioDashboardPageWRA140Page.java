package com.cimb.rma.pages;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Month;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.cimb.rma.common.CommonMethods;

public class RMPortfolioDashboardPageWRA140Page extends BasePage {

	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
	private WebElement yearDropdown;
	
	@FindBy(xpath = "//span[contains(text(),'2021')]")
	private WebElement yearSelection;
	
	@FindBy(xpath = "//h2[contains(text(),'Total Subscription Transactions - 2021')]")
	private WebElement yearDisplay;
	
	@FindBy(xpath = "//span[contains(text(),'MYR')]")
	private WebElement transactionsAmount;
	
	@FindBy(xpath = "//body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[2]")
	private WebElement chartYearChanging;
	
	@FindBy(xpath = "//body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[2]")
	private WebElement chartDisplay;
	
	@FindBy(xpath = "//p[contains(text(),'New Transaction')]")
	private WebElement NewTransandExistingTranlink;
	
	@FindBy(xpath = "//h2[contains(text(),'Application Status')]")
	private WebElement applicationStatustext;
	
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[2]/mat-cell[2]")
	private WebElement customerName;
	
	
	@FindBy(xpath = "//span[contains(text(),'Subscribe')]")
	private WebElement subscribeOption;
	
	@FindBy(xpath = "//span[contains(text(),'Bundle')]")
	private WebElement bundleOption;
	
	@FindBy(xpath = "//span[contains(text(),'Redeem')]")
	private WebElement redeemOption;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[2]/mat-cell[4]")
	private WebElement refID;
	
	@FindBy(xpath = "//span[contains(text(),'Draft')]")
	private WebElement draftStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Pending Approval')]")
	private WebElement pendingApprovalStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Confirmed')]")
	private WebElement confirmedStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Rejected')]")
	private WebElement rejectedStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Approved')]")
	private WebElement approvedStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Completed')]")
	private WebElement completedStatus;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[2]/mat-cell[1]")
	private WebElement createdDatetext;
	
	@FindBy(xpath = "//*[contains(text(),'Last 1 Month')]")
    private WebElement createonSecondValue;

    @FindBy(xpath = "//*[contains(text(),'Last 7 Days')]")
    private WebElement createonFirstValue;

    @FindBy(xpath = "//*[contains(text(),'Last 3 Months')]")
    private WebElement createonThirdValue;
    
    @FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[3]/mat-card[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[1]/span[1]/span[1]")
    private WebElement createonAll;
    
    @FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[2]/div[1]/h2[1]/span[2]")
    private WebElement subScriptionAmountTotal;
    
    @FindBy(xpath = "//p[contains(text(),'Last updated on 31 Dec 2021')]")
    private WebElement totSubTransyear;
    
    @FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[2]/div[1]/p[1]")
    private WebElement dateFormatDisplay;
    
    @FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[3]/mat-card[1]")
    private WebElement unitTrustTrans;
    
    @FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[3]/mat-card[1]/div[2]/h2[1]/span[3]")
    private WebElement monthToDate;
    
    @FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[3]/mat-card[1]/div[2]/h2[1]/span[1]")
    private WebElement monthMYR;
    
    @FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[3]/mat-card[1]/div[1]/div[1]/p[2]")
    private WebElement percentageGrowth;
    
    @FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[3]/mat-card[1]/div[1]/div[1]")
    private WebElement momPercentVer;
    
    @FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[3]/mat-card[1]/div[1]/div[1]/mat-icon[1]")
    private WebElement greenArrow;
    
    @FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]/mat-select[1]/div[1]/div[2]")
    private WebElement totalSubTransArrow;
    
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[3]/span[1]")
    private WebElement currentYear;
    
    @FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[2]/div[1]/p[1]")
    private WebElement lastUpdatedDate;
    
    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
    private WebElement lastYear2021;
    
    @FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]/div[2]/div[1]/p[1]")
    private WebElement lastYearDateVerify;
    
    @FindBy(tagName = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[2]/mat-card[1]")
   	private WebElement DataValuesTSTsection;
	
    @FindBy(tagName = "circle")
	private WebElement loader;
	
	CommonMethods cm=new CommonMethods();

	public RMPortfolioDashboardPageWRA140Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public void clickYearDropdown() throws Exception
	{
		
		click(yearDropdown);
		click(yearSelection);
		
	}
	
		
	public void validateYear() throws Exception
	{
		
		boolean continueBtnPresent=isElementPresent(yearDisplay,40);
		Assert.assertEquals(continueBtnPresent,true);
		String yearValidation=yearDisplay.getText();
		System.out.println("yearValidation   "+yearValidation);
		cm.takeScreenshot(driver);
		
	}
	
	public void transactionsAmountVerify() throws Exception
	{
		
		boolean transactionsAmtVerify=isElementPresent(transactionsAmount,40);
		Assert.assertEquals(transactionsAmtVerify,true);
		String transactionsAmountValue=transactionsAmount.getText();
		System.out.println("transactionsAmount   "+transactionsAmountValue);
		
	}
	
	public void chartYearVerify() throws Exception
	{
		
		boolean chartYear=isElementPresent(chartYearChanging,40);
		Assert.assertEquals(chartYear,true);
		
	}
	
	
	public void chartDisplay() throws Exception
	{
		
		boolean chartDisplayValidation=isElementPresent(chartDisplay,40);
		Assert.assertEquals(chartDisplayValidation,true);
				
	}
	
	public void newTransandExistinglink() throws Exception
	{
		
		boolean newTransandExisting=isElementPresent(NewTransandExistingTranlink,40);
		Assert.assertEquals(newTransandExisting,true);
		String newtransactionslinktext=NewTransandExistingTranlink.getText();
		System.out.println("newtransactionslinktext   "+newtransactionslinktext);
				
	}
	
	
	public void applicationStatusText() throws Exception
	{
		
		boolean applicationStatus=isElementPresent(applicationStatustext,40);
		Assert.assertEquals(applicationStatus,true);
				
	}
	
	public void customerNameText() throws Exception
	{
		
		boolean customerNameText=isElementPresent(customerName,40);
		Assert.assertEquals(customerNameText,true);
				
	}
	
	
	public void statusOptions() throws Exception
	{
		
		boolean subscribeOptionText=isElementPresent(subscribeOption,40);
		Assert.assertEquals(subscribeOptionText,true);
		
		boolean bundleOptionText=isElementPresent(bundleOption,40);
		Assert.assertEquals(bundleOptionText,true);
		
		boolean redeemOptionText=isElementPresent(redeemOption,40);
		Assert.assertEquals(redeemOptionText,true);
				
	}
	
	public void refIDVerify() throws Exception
	{
		
		boolean refIDValue=isElementPresent(refID,40);
		Assert.assertEquals(refIDValue,true);		
					
	}
	
	public void createdDateVerify() throws Exception
	{
		
		boolean createdDateValue=isElementPresent(createdDatetext,40);
		Assert.assertEquals(createdDateValue,true);		
					
	}
	
	
	public void applicationStatusVerify() throws Exception
	{
		
		boolean draftStatusOption=isElementPresent(draftStatus,40);
		Assert.assertEquals(draftStatusOption,true);
		
		boolean rejectedStatusOption=isElementPresent(rejectedStatus,40);
		Assert.assertEquals(rejectedStatusOption,true);
		
		boolean confirmedStatusOption=isElementPresent(confirmedStatus,40);
		Assert.assertEquals(confirmedStatusOption,true);
		
	
		boolean pendingApprovalStatusOption=isElementPresent(pendingApprovalStatus,40);
		Assert.assertEquals(pendingApprovalStatusOption,true);
		
		boolean approvedStatusOption=isElementPresent(approvedStatus,40);
		Assert.assertEquals(approvedStatusOption,true);
		
		boolean completedStatusOption=isElementPresent(completedStatus,40);
		Assert.assertEquals(completedStatusOption,true);
					
	}
	
	public void totalSubAmountVerify() throws Exception
	{
		
		
		waitUntilElementIsVisible(subScriptionAmountTotal);
		String subScriptionAmountTotaltext=subScriptionAmountTotal.getText();
		System.out.println("subScriptionAmountTotaltext   "+subScriptionAmountTotaltext);
		boolean subScriptionAmountTotalValue=isElementPresent(subScriptionAmountTotal,40);
		Assert.assertEquals(subScriptionAmountTotalValue,true,subScriptionAmountTotaltext);
					
	}
	
	
	public void titleYearVerify() throws Exception
	{
		
		
		waitUntilElementIsVisible(totSubTransyear);
		String totSubTransyeartext=totSubTransyear.getText();
		System.out.println("totSubTransyear   "+totSubTransyeartext);
		boolean subScriptionAmountTotalValue=isElementPresent(totSubTransyear,40);
		Assert.assertEquals(subScriptionAmountTotalValue,true,totSubTransyeartext);
		waitUntilElementIsVisible(yearDisplay);
		String yearDisplaytext=yearDisplay.getText();
		System.out.println("yearDisplay   "+yearDisplaytext);
		boolean yearDisplayValue=isElementPresent(totSubTransyear,40);
		Assert.assertEquals(yearDisplayValue,true,yearDisplaytext);
		
					
	}
	
	
	public void dateTextDisplay() throws Exception
	{
		
		
		waitUntilElementIsVisible(dateFormatDisplay);
		String dateFormatDisplaytext=dateFormatDisplay.getText();
		System.out.println("dateFormatDisplay   "+dateFormatDisplaytext);
		boolean dateFormatDisplayValue=isElementPresent(dateFormatDisplay,40);
		Assert.assertEquals(dateFormatDisplayValue,true,dateFormatDisplaytext);
					
	}
	
	
	public void dateTextVerify() throws Exception
	{
		
		
		waitUntilElementIsVisible(dateFormatDisplay);
		String dateFormatDisplaytext=dateFormatDisplay.getText();
		System.out.println("dateFormatDisplay   "+dateFormatDisplaytext);
		String[] arrOfStr = dateFormatDisplaytext.split(" ");
		System.out.println("Date   "+arrOfStr[3]);
//		System.out.println(java.time.LocalDate.now());
	    LocalDate currentDate=java.time.LocalDate.now();
	    int todayDate=currentDate.getDayOfMonth();
	    String stringDate=Integer.toString(todayDate);
	    System.out.println("currentDate  "+todayDate);
		Assert.assertEquals(arrOfStr[3],stringDate);
					
	}
	public void unitTrustVerify() throws Exception
	{
		
		boolean unitTrust=isElementPresent(unitTrustTrans,40);
		Assert.assertEquals(unitTrust,true);
	
	}	
	public void monthToDateVerify() throws Exception
	{
		
		boolean monthToDateVer=isElementPresent(monthToDate,40);
		Assert.assertEquals(monthToDateVer,true);
	
	}	
	public void monthMYRverify() throws Exception
	{
		
		boolean monthMYRver=isElementPresent(monthMYR,40);
		Assert.assertEquals(monthMYRver,true);
	
	}	
	public void percentGrowthVerify() throws Exception
	{
		
		boolean percentGrowth=isElementPresent(percentageGrowth,40);
		Assert.assertEquals(percentGrowth,true);
	
	}	
	public void momPercentVerify() throws Exception
	{
		
		boolean momPercent=isElementPresent(momPercentVer,40);
		Assert.assertEquals(momPercent,true);
	
	}	
	public void greenArrowVerify() throws Exception
	{
		
		boolean green=isElementPresent(greenArrow,40);
		Assert.assertEquals(green,true);
	
	}
	public void currentYearDropdownClick() throws Exception {

		waitUntilElementIsVisible(totalSubTransArrow);
		click(totalSubTransArrow);
		
	}
	public void currentYearClick() throws Exception {

		waitUntilElementIsVisible(currentYear);
		click(currentYear);
		
	}
	public void lastUpdatedDateVerify() throws Exception{
		
		boolean lastUpdateDate=isElementPresent(lastUpdatedDate,40);
		Assert.assertEquals(lastUpdateDate,true);
	
	}	
	public void lastYearClick() throws Exception {

		waitUntilElementIsVisible(lastYear2021);
		click(lastYear2021);
		
	}
    public void lastYearDateVerify() throws Exception{
		
		boolean lastYearDate=isElementPresent(lastYearDateVerify,40);
		Assert.assertEquals(lastYearDate,true);
	
	}	
    public void dataValuesVerify() throws Exception{
		
		boolean dataValues=isElementPresent(DataValuesTSTsection,40);
		Assert.assertEquals(dataValues,true);
	
	}	
    public void monthTodateVerify() throws Exception{
		
		boolean monthDateVer=isElementPresent(monthToDate,40);
		Assert.assertEquals(monthDateVer,true);
	
	}	
	
	
	
	
	
	
	
	
}