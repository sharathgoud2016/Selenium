package com.cimb.rma.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RMCustomerProfileWRA142Page extends BasePage {

	@FindBy(xpath = "//input[@id='mat-input-0']")
	private WebElement customerProfileSearch;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]/div[2]/div[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/cimb-office-customer-holding[1]/div[2]/mat-table[1]/tr[2]/mat-cell[1]/div[1]/mat-checkbox[1]/label[1]/span[1]")
	private WebElement selectFirstCheckboxCH;
	
	@FindBy(xpath = "//span[contains(text(),'Redeem')]")
	private WebElement redeemBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Switch')]")
	private WebElement switchBtn;
	
	
	@FindBy(xpath = "//div[contains(text(),'Ilene Hicks')]")
	private WebElement selectCustomerProfile;
	
	@FindBy(xpath = "//div[contains(text(),'Hoffman Haney')]")
	private WebElement selectCustomertwo;
	
	@FindBy(xpath = "//div[contains(text(),'Stephenson Wilson')]")
	private WebElement noValidRiskProfile;
	
	@FindBy(xpath = "//h3[contains(text(),'customer profile')]")
	private WebElement customerprofilePage;
	
	@FindBy(xpath = "//mat-expansion-panel-header/span[2]")
	private WebElement expandPage;	
		
	@FindBy(xpath = "//h5[contains(text(),'address')]")
	private WebElement addressText;
	
	@FindBy(xpath = "//p[contains(text(),'full name')]")
	private WebElement fullnameText;
	
	@FindBy(xpath = "//mat-expansion-panel-header/span[1]/mat-panel-description[1]/div[1]/div[1]/div[1]/div[2]/div[1]/p[1]")
	private WebElement idnumberText;
	
	@FindBy(xpath = "//mat-card[contains(text(),'new account')]")
	private WebElement newAccountText;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]/div[1]/cimb-home[1]/mat-card[1]/mat-card-content[1]/a[1]")
	private WebElement newAccountBtn;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]/div[1]/cimb-home[1]/mat-card[1]/mat-card-content[1]/a[2]")
	private WebElement newTransBtn;
	
	
	@FindBy(xpath = "//mat-card[contains(text(),'New Transaction')]")
	private WebElement newtransactionText;
	
	@FindBy(xpath = "//mat-card[contains(text(),'risk profile')]")
	private WebElement riskprofileText;
	
	@FindBy(xpath = "//p[contains(text(),'aggressive')]")
	private WebElement aggressiveText;
	
	@FindBy(xpath = "//h3[contains(text(),'Customer Details')]")
	private WebElement customerDetailsText;
	
	@FindBy(xpath = "//mat-expansion-panel-header/span[1]/mat-panel-description[1]/div[1]/div[1]/div[1]/h5[1]")
	private WebElement personalDetailsText;
	
	@FindBy(xpath = "//h5[contains(text(),'contact information')]")
	private WebElement contactInformationText;
	
	@FindBy(xpath = "//h5[contains(text(),'other personal details')]")
	private WebElement otherPersonalDtsText;
	
	@FindBy(xpath = "//h5[contains(text(),'employment details')]")
	private WebElement employmentDetailsText;
	
	@FindBy(xpath = "//div[contains(text(),'Customer Holdings')]")
	private WebElement customerHoldingsText;
	
	@FindBy(xpath = "//div[contains(text(),'Application Status')]")
	private WebElement applicationStatusText;
	
	@FindBy(xpath = "//mat-card-title[contains(text(),'total portfolio')]")
	private WebElement totalPortfolioText;
	
	@FindBy(xpath = "//h5[contains(text(),'savings')]")
	private WebElement savingText;
	
	@FindBy(xpath = "//p[contains(text(),'current & savings account')]")
	private WebElement currentSavingText;
	
	@FindBy(xpath = "//p[contains(text(),'fixed deposit')]")
	private WebElement fdText;
	
	@FindBy(xpath = "//h5[contains(text(),'investments')]")
	private WebElement investmentText;
	

	@FindBy(xpath = "//p[contains(text(),'credit card')]")
	private WebElement creditcardText;
	
	@FindBy(xpath = "//p[contains(text(),'loan / financing')]")
	private WebElement loanFinText;
	
	@FindBy(xpath = "//h5[contains(text(),'expenses')]")
	private WebElement expensesText;
	
	@FindBy(xpath = "//div[contains(text(),'Application Status')]")
	private WebElement appStatusTab;
	
	@FindBy(xpath = "//span[contains(text(),'Unit Trust')]")
	private WebElement utBtn;
	
	@FindBy(xpath = "//mat-label[contains(text(),'CREATION DATE')]")
	private WebElement creationDateText;
	
	@FindBy(xpath = "//mat-label[contains(text(),'TRANSACTION TYPE')]")
	private WebElement tranTypeText;
	
	@FindBy(xpath = "//mat-label[contains(text(),'STATUS')]")
	private WebElement statusText;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement creationDateAll;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[2]/mat-form-field[1]/div[1]/div[1]/div[3]")
	private WebElement tranTypeAll;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[1]/div[1]/div[2]/div[3]/mat-form-field[1]/div[1]/div[1]")
	private WebElement statusAll;
	
	@FindBy(xpath = "//body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]/div[2]/div[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[1]/mat-header-cell[1]/div[1]/div[2]")
	private WebElement creationDateArrow;
	
	@FindBy(xpath = "//body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]/div[2]/div[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[1]/mat-header-cell[4]/div[1]/div[2]")
	private WebElement statusArrow;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-table[1]/tr[2]/mat-cell[5]/mat-icon[1]")
	private WebElement recordArrow;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-app-status[1]/cimb-office-application-status-table[1]/div[2]/div[1]/mat-paginator[1]/div[1]/div[1]/div[1]")
	private WebElement appStatusPagination;
	
	@FindBy(xpath = "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[7]/span[1]")
	private WebElement rpqUdateValue;
	
	@FindBy(xpath = "//span[contains(text(),'Last 7 Days')]")
	private WebElement lastSevenDaysValue;
	
	@FindBy(xpath = "//mat-label[contains(text(),'CREATION DATE')]")
	private WebElement creationDateSec;
	
	@FindBy(xpath = "//mat-label[contains(text(),'TRANSACTION TYPE')]")
	private WebElement transTypeSec;
	
	@FindBy(xpath = "//mat-label[contains(text(),'STATUS')]")
	private WebElement statusSec;
	
	@FindBy(xpath = "//div[contains(text(),'No Investments Made')]")
	private WebElement noInvestMade;
	
	@FindBy(xpath = "//div[contains(text(),'FUND NAME')]")
	private WebElement fundNameCustProfile;
	
	
	@FindBy(xpath="/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]/div[2]/div[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/cimb-office-customer-holding[1]/div[2]/mat-table[1]/tr/mat-cell[1]/div[1]/div[1]")
	private List<WebElement> fundNameCustProColumn;
	
	@FindBy(xpath = "//div[contains(text(),'NAV (MYR)')]")
	private WebElement navColumnCustProfile;
	
	@FindBy(xpath="/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]/div[2]/div[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/cimb-office-customer-holding[1]/div[2]/mat-table[1]/tr/mat-cell[4]/div[1]")
	private List<WebElement> navCustProColumn;
	
	@FindBy(xpath = "//div[contains(text(),'ROI')]")
	private WebElement roiColumnCustProfile;
	
	@FindBy(xpath="/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-profile[1]/div[1]/div[2]/div[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/cimb-office-customer-holding[1]/div[2]/mat-table[1]/tr/mat-cell[6]/div[1]")
	private List<WebElement> roiCustProColumn;
	
	@FindBy(xpath="//mat-tab-body/div[1]/cimb-office-customer-holding[1]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]")
	private WebElement customerProfilePagination;
	
	@FindBy(xpath="//mat-tab-body/div[1]/cimb-office-customer-holding[1]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/button[3]/span[1]/*[1]")
	private WebElement customerProfileNextPage;
	
	@FindBy(xpath="//mat-tab-body/div[1]/cimb-office-customer-holding[1]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/button[2]/span[1]/*[1]")
	private WebElement customerProfilepreviousPage;	
	
	@FindBy(xpath="//mat-tab-body/div[1]/cimb-office-customer-holding[1]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/button[1]/span[1]/*[1]")
	private WebElement customerProfileFirstPage;
	
	@FindBy(xpath="//mat-tab-body/div[1]/cimb-office-customer-holding[1]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/button[4]/span[1]/*[1]")
	private WebElement customerProfileLastPage;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/cimb-office-customer-holding[1]/div[2]/mat-paginator[1]/div[1]/div[1]/div[1]/button[4]/span[1]/*[1]")
	private WebElement nextPageArrow;
	
	@FindBy(xpath = "//div[contains(text(),'1 – 5')]")
	private WebElement numOfPages;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'search')]")
	private WebElement searchBtn;
	
	@FindBy(xpath = "//div[contains(text(),'Fund Holiday')]")
	private WebElement fundHoliday;
	
	
	public RMCustomerProfileWRA142Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void custProfieSearch() throws Exception
	{
		
		waitUntilElementIsVisible(customerProfileSearch);
		click(customerProfileSearch);
		
	}
	
	public void selectCustProfile() throws Exception
	{
		
		waitUntilElementIsVisible(selectCustomerProfile);
		click(selectCustomerProfile);
		
	}
	public void searchCustomerValidRPQ() throws Exception
	{
		
		waitUntilElementIsVisible(selectCustomertwo);
		click(selectCustomertwo);
		
	}
	
	public void expandCustProfDetails() throws Exception
	{
		
		waitUntilElementIsVisible(expandPage);
		click(expandPage);
		
	}
	
	
	
	public void customerProfilePageVerify() throws Exception
	{
		
		boolean customerProfilePageVerify=isElementPresent(customerprofilePage,40);
		Assert.assertEquals(customerProfilePageVerify,true);
		String customerProfilePageValue=customerprofilePage.getText();
		System.out.println("customerprofilePage   "+customerProfilePageValue);
		
	}
	
	public void addressTextVerify() throws Exception
	{
		
		boolean addressTextVerify=isElementPresent(addressText,40);
		Assert.assertEquals(addressTextVerify,true);
		String addressTextValue=addressText.getText();
		System.out.println("addressText   "+addressTextValue);
		
	}
	
	
	public void fullnameTextVerify() throws Exception
	{
		
		boolean fullnameTextVerify=isElementPresent(fullnameText,40);
		Assert.assertEquals(fullnameTextVerify,true);
		String addressTextValue=fullnameText.getText();
		System.out.println("fullnameTextVerify   "+addressTextValue);
		
	}
	
	
	public void idnumberTextVerify() throws Exception
	{
		
		boolean idnumberTextVerify=isElementPresent(idnumberText,40);
		Assert.assertEquals(idnumberTextVerify,true);
		String idnumberTextValue=idnumberText.getText();
		System.out.println("idnumberTextValueVerify   "+idnumberTextValue);
		
	}
	
	public void newAccountTextVerify() throws Exception
	{
		
		boolean newAccountTextVerify=isElementPresent(newAccountText,40);
		Assert.assertEquals(newAccountTextVerify,true);
		String newAccountTextValue=newAccountText.getText();
		System.out.println("newAccountTextVerify   "+newAccountTextValue);
		
	}
	
	public void newtransactionTextVerify() throws Exception
	{
		
		boolean newtransactionTextVerify=isElementPresent(newtransactionText,40);
		Assert.assertEquals(newtransactionTextVerify,true);
		String newtransactionTextValue=newAccountText.getText();
		System.out.println("newtransactionTextVerify   "+newtransactionTextValue);
		
	}
	
	public void riskprofileTextVerify() throws Exception
	{
		
		boolean riskprofileTextVerify=isElementPresent(riskprofileText,40);
		Assert.assertEquals(riskprofileTextVerify,true);
		String riskprofileTextValue=riskprofileText.getText();
		System.out.println("riskprofileTextVerify   "+riskprofileTextValue);
		
	}
	
	public void aggressiveTextVerify() throws Exception
	{
		
		boolean aggressiveTextVerify=isElementPresent(aggressiveText,40);
		Assert.assertEquals(aggressiveTextVerify,true);
		String aggressiveTextValue=aggressiveText.getText();
		System.out.println("aggressiveTextVerify   "+aggressiveTextValue);
		
	}
	
	public void customerDetailsTextVerify() throws Exception
	{
		
		boolean customerDetailsTextVerify=isElementPresent(customerDetailsText,40);
		Assert.assertEquals(customerDetailsTextVerify,true);
		String customerDetailsTextValue=customerDetailsText.getText();
		System.out.println("customerDetailsTextVerify   "+customerDetailsTextValue);
		
	}
	
	public void personalDetailsTextVerify() throws Exception
	{
		
		boolean personalDetailsTextVerify=isElementPresent(personalDetailsText,40);
		Assert.assertEquals(personalDetailsTextVerify,true);
		String personalDetailsTextValue=personalDetailsText.getText();
		System.out.println("personalDetailsTextVerify   "+personalDetailsTextValue);
		
	}
	
	public void contactInformationTextVerify() throws Exception
	{
		
		boolean contactInformationTextVerify=isElementPresent(contactInformationText,40);
		Assert.assertEquals(contactInformationTextVerify,true);
		String contactInformationTextValue=contactInformationText.getText();
		System.out.println("contactInformationTextVerify   "+contactInformationTextValue);
		
	}
	
	public void otherPersonalDtsTextVerify() throws Exception
	{
		
		boolean otherPersonalDtsTextVerify=isElementPresent(otherPersonalDtsText,40);
		Assert.assertEquals(otherPersonalDtsTextVerify,true);
		String otherPersonalDtsTextValue=otherPersonalDtsText.getText();
		System.out.println("otherPersonalDtsTextVerify   "+otherPersonalDtsTextValue);
		
	}
	
	public void employmentDetailsTextVerify() throws Exception
	{
		
		boolean employmentDetailsTextVerify=isElementPresent(employmentDetailsText,40);
		Assert.assertEquals(employmentDetailsTextVerify,true);
		String employmentDetailsTextValue=employmentDetailsText.getText();
		System.out.println("employmentDetailsTextVerify   "+employmentDetailsTextValue);
		
	}
	
	public void customerHoldingsTextVerify() throws Exception
	{
		
		boolean customerHoldingsTextVerify=isElementPresent(customerHoldingsText,40);
		Assert.assertEquals(customerHoldingsTextVerify,true);
		String customerHoldingsTextValue=customerHoldingsText.getText();
		System.out.println("customerHoldingsTextVerify   "+customerHoldingsTextValue);
		
	}
	
	
	public void applicationStatusTextVerify() throws Exception
	{
		
		boolean applicationStatusTextVerify=isElementPresent(applicationStatusText,40);
		Assert.assertEquals(applicationStatusTextVerify,true);
		String applicationStatusTextValue=applicationStatusText.getText();
		System.out.println("applicationStatusTextVerify   "+applicationStatusTextValue);
		
	}
	
	
	public void totalPortfolioTextVerify() throws Exception
	{
		
		boolean totalPortfolioTextVerify=isElementPresent(totalPortfolioText,40);
		Assert.assertEquals(totalPortfolioTextVerify,true);
		String totalPortfolioTextValue=totalPortfolioText.getText();
		System.out.println("totalPortfolioTextVerify   "+totalPortfolioTextValue);
		
	}
	
	
	public void totalPortfolioVerify() throws Exception
	{
		
		waitUntilElementIsVisible(totalPortfolioText);
		boolean totalPortfolioTextVerify=isElementPresent(totalPortfolioText,40);
		Assert.assertEquals(totalPortfolioTextVerify,true);
		String totalPortfolioTextValue=totalPortfolioText.getText();
		System.out.println("totalPortfolioTextVerify   "+totalPortfolioTextValue);
		
	}
	
	//tp means total port
	public void tpContentsVerify() throws Exception
	{
		
		boolean savingTextVerify=isElementPresent(savingText,40);
		Assert.assertEquals(savingTextVerify,true);
		boolean currentSavingTextVerify=isElementPresent(currentSavingText,40);
		Assert.assertEquals(currentSavingTextVerify,true);
		boolean fdTextVerify=isElementPresent(fdText,40);
		Assert.assertEquals(fdTextVerify,true);
		boolean investmentTextVerify=isElementPresent(investmentText,40);
		Assert.assertEquals(investmentTextVerify,true);
		boolean creditcardTextVerify=isElementPresent(creditcardText,40);
		Assert.assertEquals(creditcardTextVerify,true);
		boolean loanFinTextVerify=isElementPresent(loanFinText,40);
		Assert.assertEquals(loanFinTextVerify,true);
		boolean expensesTextVerify=isElementPresent(expensesText,40);
		Assert.assertEquals(expensesTextVerify,true);
		
	}
	
	//tp means total port
		public void customerAppListandStatusVerify() throws Exception
		{
			
			boolean savingTextVerify=isElementPresent(savingText,40);
			Assert.assertEquals(savingTextVerify,true);
			boolean currentSavingTextVerify=isElementPresent(currentSavingText,40);
			Assert.assertEquals(currentSavingTextVerify,true);
			boolean fdTextVerify=isElementPresent(fdText,40);
			Assert.assertEquals(fdTextVerify,true);
			boolean investmentTextVerify=isElementPresent(investmentText,40);
			Assert.assertEquals(investmentTextVerify,true);
			boolean creditcardTextVerify=isElementPresent(creditcardText,40);
			Assert.assertEquals(creditcardTextVerify,true);
			boolean loanFinTextVerify=isElementPresent(loanFinText,40);
			Assert.assertEquals(loanFinTextVerify,true);
			boolean expensesTextVerify=isElementPresent(expensesText,40);
			Assert.assertEquals(expensesTextVerify,true);
			
		}
	
		
		public void utTabVerify() throws Exception
		{
			
			waitUntilElementIsVisible(utBtn);
			boolean utBtnVerify=isElementPresent(utBtn,40);
			Assert.assertEquals(utBtnVerify,true);
			String utBtnTextValue=utBtn.getText();
			System.out.println("utBtnTextValue   "+utBtnTextValue);
			
		}
		
		
		public void applicationTabVerify() throws Exception
		{
			
			waitUntilElementIsVisible(applicationStatusText);
			boolean applicationStatusTextVerify=isElementPresent(applicationStatusText,40);
			Assert.assertEquals(applicationStatusTextVerify,true);
			click(applicationStatusText);
			String applicationStatusTextValue=applicationStatusText.getText();
			System.out.println("applicationStatusTextValue   "+applicationStatusTextValue);
			
		}
		
		
		
	
		public void appStatusPagVerify() throws Exception
		{
			
			waitUntilElementIsVisible(applicationStatusText);
			boolean applicationStatusTextVerify=isElementPresent(applicationStatusText,40);
			Assert.assertEquals(applicationStatusTextVerify,true);
			String applicationStatusTextValue=applicationStatusText.getText();
			System.out.println("applicationStatusTextValue   "+applicationStatusTextValue);
			
		}
	
		
		
		public void recordArrowVerify() throws Exception
		{
			
			waitUntilElementIsVisible(recordArrow);
			boolean recordArrowVerify=isElementPresent(recordArrow,40);
			Assert.assertEquals(recordArrowVerify,true);
						
		}
		
		public void creationDateArrowVerify() throws Exception
		{
			
			waitUntilElementIsVisible(creationDateArrow);
			boolean creationDateArrowVerify=isElementPresent(creationDateArrow,40);
			Assert.assertEquals(creationDateArrowVerify,true);
						
		}
		
		public void allAttributesVerify() throws Exception
		{
			
			waitUntilElementIsVisible(creationDateAll);
			boolean creationDateAllVerify=isElementPresent(creationDateAll,40);
			Assert.assertEquals(creationDateAllVerify,true);
			
			waitUntilElementIsVisible(tranTypeAll);
			boolean tranTypeAllVerify=isElementPresent(tranTypeAll,40);
			Assert.assertEquals(tranTypeAllVerify,true);
			
			waitUntilElementIsVisible(statusAll);
			boolean statusAllVerify=isElementPresent(statusAll,40);
			Assert.assertEquals(statusAllVerify,true);
			
		
						
		}
		
		public void filtersectionVerify() throws Exception
		{
			
			waitUntilElementIsVisible(creationDateSec);
			boolean creationDateSecVerify=isElementPresent(creationDateSec,40);
			Assert.assertEquals(creationDateSecVerify,true);
			
			waitUntilElementIsVisible(tranTypeAll);
			boolean tranTypeAllVerify=isElementPresent(tranTypeAll,40);
			Assert.assertEquals(tranTypeAllVerify,true);
			
			waitUntilElementIsVisible(statusAll);
			boolean statusAllVerify=isElementPresent(statusAll,40);
			Assert.assertEquals(statusAllVerify,true);
			
						
		}
		
		public void noInvestMadeVerify() throws Exception
		{
			
			waitUntilElementIsVisible(noInvestMade);
			boolean noInvestMadeVerify=isElementPresent(noInvestMade,40);
			Assert.assertEquals(noInvestMadeVerify,true);
			String noInvestMadeTextValue=noInvestMade.getText();
			System.out.println("noInvestMadeTextValue   "+noInvestMadeTextValue);
										
		}
		
		
		 public void fundNameSortDefaultVerify() throws InterruptedException
		 {

			 sortingWebtableDefault(fundNameCustProColumn);
			 sortingWebtableDsc(fundNameCustProColumn,fundNameCustProfile);
		 
		 }	
		 
		 public void fundNameSortDscVerify() throws InterruptedException
		 {

			 sortingWebtableDsc(fundNameCustProColumn,fundNameCustProfile);
		 
		 }	
	
		 public void fundNameSortAscVerify() throws InterruptedException
		 {

			 sortingWebtableAsc(fundNameCustProColumn,fundNameCustProfile);
		 
		 }	
		 
		 public void clickonNAV() throws InterruptedException
		 {

			 click(navColumnCustProfile);
		 
		 }	
		 
		 
		 public void sortingNAV() throws InterruptedException
		 {

			 sortingWebtableAsc(navCustProColumn,navColumnCustProfile);
			 sortingWebtableDsc(navCustProColumn,navColumnCustProfile);
			 
		 
		 }	
	
		 
		 public void sortingROI() throws InterruptedException
		 {

			 click(roiColumnCustProfile);
			 click(roiColumnCustProfile);
				 
		 }	
	
		 
		 public void customerProfNextPagination() throws InterruptedException
		 {

			    waitUntilElementIsVisible(customerProfilePagination);
				boolean custProfPagination=isElementPresent(customerProfilePagination,40);
				Assert.assertEquals(custProfPagination,true);
				
				waitUntilElementIsVisible(customerProfileNextPage);
				boolean cusProfileNextPage=isElementPresent(customerProfileNextPage,40);
				Assert.assertEquals(cusProfileNextPage,true);
				
				waitUntilElementIsVisible(customerProfilepreviousPage);
				boolean custProfilepreviousPage=isElementPresent(customerProfileNextPage,40);
				Assert.assertEquals(custProfilepreviousPage,true);
				  
				
				
				
		 }	
		 
		 
		 public void customerProfPreviousPagination() throws InterruptedException
		 {

			   				
				waitUntilElementIsVisible(customerProfilepreviousPage);
				boolean custProfilepreviousPage=isElementPresent(customerProfileNextPage,40);
				Assert.assertEquals(custProfilepreviousPage,true);
		
				
		 }	
		 
		 public void firstandLastPageVerify() throws InterruptedException
		 {

			   				
				waitUntilElementIsVisible(customerProfileFirstPage);
				boolean custProfileFirstPage=isElementPresent(customerProfileFirstPage,40);
				Assert.assertEquals(custProfileFirstPage,true);
				boolean custProfileLastPage=isElementPresent(customerProfileLastPage,40);
				Assert.assertEquals(custProfileLastPage,true);
		
				
		 }	
		 
		 public void lastPageArrowClick() throws Exception {

				waitUntilElementIsVisible(nextPageArrow);
				click(nextPageArrow);
			}
		 
		 public void nextPageArrowVerify() throws Exception {

				waitUntilElementIsVisible(nextPageArrow);
				boolean nextPageDisable=isElementDisable(nextPageArrow);
				Assert.assertEquals(nextPageDisable,false);
				
				
			}
		 
		 public void noOfRecordsVerify() throws Exception {

				Thread.sleep(3000);
			    waitUntilElementIsVisible(numOfPages);
				boolean numberOfPages=isElementPresent(numOfPages);
				Assert.assertEquals(numberOfPages,true);
				
				
			}
		 
		 public void newTransBtn() throws Exception {

				Thread.sleep(2000);
			    waitUntilElementIsVisible(newtransactionText);
			    click(newtransactionText);
				
				
			}
		 
		 public void inactFundList() throws Exception {

				Thread.sleep(2000);
				click(searchBtn);
			    				
			}
		 
		 public void fundHolidayLabelVerify() throws Exception {

				Thread.sleep(2000);
			    waitUntilElementIsVisible(fundHoliday);
				boolean fundHolidayTag=isElementPresent(fundHoliday);
				Assert.assertEquals(fundHolidayTag,true);
				String fundHolidayTextValue=fundHoliday.getText();
				System.out.println("fundHolidayTextValue   "+fundHolidayTextValue);
				
				
			}
		 
		 public void noValidRiskProfileCustomer() throws Exception {

				Thread.sleep(2000);
			    waitUntilElementIsVisible(noValidRiskProfile);
			    click(noValidRiskProfile);
				
				
			}
		 
		 
		 public void newbtnDisableVerify() throws Exception {

					    
			    Thread.sleep(5000);
			    waitUntilElementIsVisible(newAccountBtn,40);
				boolean newbtnDisable=isElementDisable(newAccountBtn);
				Assert.assertEquals(newbtnDisable,false);
			    waitUntilElementIsVisible(newTransBtn);
				boolean newtransactionTextDisable=isElementDisable(newTransBtn);
				Assert.assertEquals(newtransactionTextDisable,false);
				
				
			}
		 
		 
		 
		 public void newbtnEnableVerify() throws Exception {

					    
			    Thread.sleep(5000);
			    waitUntilElementIsVisible(newAccountBtn,40);
			    String accountbtnColor= btnEnabledORDisabledColor(newAccountText);
				 Assert.assertEquals(accountbtnColor,"rgba(255, 0, 0, 1)");
				 waitUntilElementIsVisible(newTransBtn);
			    String newTrabtnColor= btnEnabledORDisabledColor(newtransactionText);
				Assert.assertEquals(newTrabtnColor,"rgba(255, 0, 0, 1)");
				
			}
		 
		 public void redeemBtnEnableVerify() throws Exception {

			    
			 Thread.sleep(3000);
			 waitUntilElementIsVisible(selectFirstCheckboxCH,40);  
			 click(selectFirstCheckboxCH);
			 Thread.sleep(3000);
			 waitUntilElementIsVisible(switchBtn,40);  
			 String btnColor= btnEnabledORDisabledColor(redeemBtn);
			 Assert.assertEquals(btnColor,"rgba(244, 67, 54, 1)");
			 
				
			}
		 
		 
		 
	
	
	
				
}
