package com.cimb.rma.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RMTransactionApplicationWRA146Page extends BasePage {


	/***************** PERSONAL DETAILS ******************/
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-dashboard[1]/div[1]/div[1]/div[1]/cimb-customer-search-bar[1]/div[1]/mat-form-field[1]/div[1]/div[1]")
	private WebElement searchCustomer;
	
	@FindBy(xpath = "//input[@id='mat-input-0']")
	private WebElement customerProfileSearch;
	
	@FindBy(xpath = "//div[contains(text(),'Tonny Stark')]")
	private WebElement selectCustomerProfile;
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/div[1]/mat-option[1]/span[1]/div[1]")
	private WebElement selectCuctomertwo;
	
	@FindBy(xpath = "//h3[contains(text(),'customer profile')]")
	private WebElement customerProfilePage;
	
	@FindBy(xpath = "//mat-card[contains(text(),'New Transaction')]")
	private WebElement newTransactionButton;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[1]/div[2]/div[1]/div[1]")
	private WebElement transactionAppPage;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/div[1]/mat-form-field[1]/div[1]/div[1]")
	private WebElement searchForFund;
	
	@FindBy(xpath = "//body/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
	private WebElement selectFund;
	
	@FindBy(xpath = "//div[contains(text(),'All Risk Categories')]")
	private WebElement allRiskCategory;
	
	@FindBy(xpath = "//div[contains(text(),'All Asset Classes')]")
	private WebElement allAssetClass;
	
	@FindBy(xpath = "//div[contains(text(),'All Fund Types')]")
	private WebElement allFundTypes;
	
	@FindBy(xpath = "//div[contains(text(),'Local Currency')]")
	private WebElement localCurrency;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[1]/button[1]/span[1]")
	private WebElement searchFilter;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[1]/button[1]/span[1]")
	private WebElement searchFilterClick;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[1]/div[2]")
	private WebElement allCategories;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[2]/div[2]")
	private WebElement allClasses;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[3]/div[2]")
	private WebElement allTypes;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[4]/div[1]")
	private WebElement localCurrencyRM;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[4]/div[1]")
	private WebElement localCurrencyFunTag;
	
	@FindBy(xpath = "//div[contains(text(),'risk category')]")
	private WebElement riskCategory;
	
	@FindBy(xpath = "//div[contains(text(),'asset class')]")
	private WebElement assetClass;
	
	@FindBy(xpath = "//div[contains(text(),'fund type')]")
	private WebElement fundType;
	
	@FindBy(xpath = "/html[1]/body[1]/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[1]/div[4]")
	private WebElement defensiveClick;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[2]/div[3]")
	private WebElement alternative;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[3]/div[3]")
	private WebElement conventional;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[1]")
	private WebElement selectedCriteriaDisplay;

	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[2]/div[4]/mat-checkbox[1]/label[1]/span[2]")
	private WebElement localEquity;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[2]/mat-card[1]/div[1]/div[2]/div[8]/mat-checkbox[1]/label[1]/span[2]")
	private WebElement cash;
	
	@FindBy(xpath = "//span[contains(text(),'Close')]")
	private WebElement closeClick;

	@FindBy(xpath = "//mat-icon[contains(text(),'close')]")
	private WebElement crossMark;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[1]/div[1]/div[2]/div[1]/mat-icon[1]")
	private WebElement crossAlternative;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[1]/div[1]/div[3]/div[1]/mat-icon[1]")
	private WebElement crossLocalEquity;
	
	@FindBy(xpath = "//body/cimb-root[1]/cimb-backoffice-layout[1]/div[1]/div[2]/div[1]/cimb-rm-transaction[1]/div[2]/cimb-office-product-transaction[1]/div[1]/form[1]/mat-card[1]/mat-card-content[3]/div[1]/cimb-office-search-funds[1]/cimb-office-search-filter[1]/div[1]/div[1]/div[4]/div[1]/mat-icon[1]")
	private WebElement crossCash;
	
	@FindBy(xpath = "//span[contains(text(),'Reset Filters')]")
	private WebElement resetButtonTA;


	// public static final String OPTIONS_SAME_PERMANENT_ADDRESS = "Same as
	// Permanent Address";

	  public RMTransactionApplicationWRA146Page(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
		
	  }
	  public void custProfileSearch() throws Exception{
			
			waitUntilElementIsVisible(searchCustomer);
			click(searchCustomer);
			
	  }
	  public void selectCustProfile() throws Exception{
			
			waitUntilElementIsVisible(selectCustomerProfile);
			click(selectCustomerProfile);
			
	  }
	  public void selectCustProfiletwo() throws Exception{
			
			waitUntilElementIsVisible(selectCustomerProfile);
			click(selectCustomerProfile);
			
	  }
	  public void customerProfilePageVerify() throws Exception{
			
			boolean customerProfilePageVerify=isElementPresent(customerProfilePage,40);
			Assert.assertEquals(customerProfilePageVerify,true);
			String customerProfilePageValue=customerProfilePage.getText();
			System.out.println("customerProfilePage   "+customerProfilePageValue);
			
	  }
	  public void TransactionButtonClick() throws Exception {

			waitUntilElementIsVisible(newTransactionButton);
			click(newTransactionButton);
			
	  }
	  public void transactionPageVerify() throws Exception{
			
			boolean transactionPageVerify=isElementPresent(transactionAppPage,40);
			Assert.assertEquals(transactionPageVerify,true);
			String transactionAppPageValue=transactionAppPage.getText();
			System.out.println("transactionAppPage   "+transactionAppPageValue);
			
	  }
	  public void searchFundClick() throws Exception {

			waitUntilElementIsVisible(searchForFund);
			click(searchForFund);
			
	  }
	  public void selectFundClick() throws Exception {

			waitUntilElementIsVisible(selectFund);
			click(selectFund);
			
      }
	  public void defaultFilterVerify() throws Exception {

			boolean allRiskCategoryVer = isElementPresent(allRiskCategory, 40);
			Assert.assertEquals(allRiskCategoryVer, true);
			
			boolean allAssetClassVer = isElementPresent(allAssetClass, 40);
			Assert.assertEquals(allAssetClassVer, true);
			
			boolean allFundTypesVer = isElementPresent(allFundTypes, 40);
			Assert.assertEquals(allFundTypesVer, true);

			boolean localCurrencyVer = isElementPresent(localCurrency, 40);
			Assert.assertEquals(localCurrencyVer, true);
			
	  } 
	  public void searchFilterClick() throws Exception {

			waitUntilElementIsVisible(searchFilter);
			click(searchFilter);
			
      }
	  public void searchFilterclick() throws Exception {

			waitUntilElementIsVisible(searchFilterClick);
			click(searchFilterClick);
			
      }
	  public void localCurrencyFunTagVerify() throws Exception {

			boolean currencyTag = isElementDisplayed(localCurrencyFunTag);
			Assert.assertEquals(currencyTag, false);
			
	  } 
	  public void isElementSelected() throws Exception {

			waitUntilElementIsVisible(allCategories);
			boolean allCategoriesSelected=isElementSelected(allCategories);
			Assert.assertEquals(allCategoriesSelected,false);
			
			waitUntilElementIsVisible(allClasses);
			boolean allClassesSelected=isElementSelected(allClasses);
			Assert.assertEquals(allClassesSelected,false);
			
			waitUntilElementIsVisible(allTypes);
			boolean allTypesSelected=isElementSelected(allTypes);
			Assert.assertEquals(allTypesSelected,false);
			
 	  }
	  public void isElementDisSelected() throws Exception {
		  
			waitUntilElementIsVisible(localCurrencyRM);
			boolean localCurrencyRMdisDisSelect=isElementSelected(localCurrencyRM);
			Assert.assertEquals(localCurrencyRMdisDisSelect,false);
			
	  } 
	  public void searchFilterVerify() throws Exception {

			boolean allRiskCategoryVer = isElementPresent(riskCategory, 40);
			Assert.assertEquals(allRiskCategoryVer, true);
			
			boolean allAssetClassVer = isElementPresent(assetClass, 40);
			Assert.assertEquals(allAssetClassVer, true);
			
			boolean allFundTypesVer = isElementPresent(fundType, 40);
			Assert.assertEquals(allFundTypesVer, true);
			
			
	  } 
	  public void applySelectedFilter() throws Exception {

			waitUntilElementIsVisible(defensiveClick);
			click(defensiveClick);
			
			waitUntilElementIsVisible(alternative);
			click(alternative);
			
			waitUntilElementIsVisible(conventional);
			click(conventional);
			
      }
      public void selectedFundVerify() throws Exception{
			
			boolean selectedFundVerify=isElementDisplayed(selectedCriteriaDisplay);
			Assert.assertEquals(selectedFundVerify,false);
			
      }
	  public void clickOnClose() throws Exception {

			waitUntilElementIsVisible(closeClick);
			click(closeClick);
			
      }
	  public void crossMarkClick() throws Exception {

			waitUntilElementIsVisible(searchFilter);
			click(searchFilter);
			
			waitUntilElementIsVisible(conventional);
			click(conventional);
			
			waitUntilElementIsVisible(closeClick);
			click(closeClick);
			
			waitUntilElementIsVisible(crossMark);
			click(crossMark);
				
      }
	  public void selectCriteria() throws Exception {
			
		    Thread.sleep(5000);
			waitUntilElementIsVisible(localEquity);
			click(localEquity);
	  
	  }
	  public void selectMultipleCriteria() throws Exception {
			
		    
			waitUntilElementIsVisible(alternative);
			click(alternative);
			
			waitUntilElementIsVisible(localEquity);
			click(localEquity);
			
			waitUntilElementIsVisible(cash);
			click(cash);
			
			waitUntilElementIsVisible(closeClick);
			click(closeClick);
			
	  }
	  public void resetBtnEnableVerify() throws Exception {

		    
		    Thread.sleep(5000);
		    waitUntilElementIsVisible(resetButtonTA,40);
			boolean resetbtnEnable=isElementEnable(resetButtonTA);
			Assert.assertEquals(resetbtnEnable,true);
			
	  }
	  public void removeFilterAssetClass() throws Exception {
			
		    
			waitUntilElementIsVisible(crossAlternative);
			click(crossAlternative);
			
			waitUntilElementIsVisible(crossLocalEquity);
			click(crossLocalEquity);
			
			waitUntilElementIsVisible(crossCash);
			click(crossCash);
			
			
	  }
	  
	  
	  
	  
	  
	  
	  
	  
}
	