package com.cimb.rma.stepdefs;

import com.cimb.rma.pages.HomePage;
import com.cimb.rma.pages.RMTransactionApplicationWRA146Page;
import com.cimb.utils.TestContext;
import com.cimb.utils.random.Leads;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RMTransactionApplicationStepDef {

	private Leads lead;
	private HomePage land;
	private RMTransactionApplicationWRA146Page TransactionApplication;

	protected TestContext testContext;

	public RMTransactionApplicationStepDef(TestContext context) {
		land = context.getPageObjectManager().getHomePage();
		TransactionApplication = context.getPageObjectManager().getRMTransactionApplication();
		lead = new Leads();
		testContext = context;
	 }
	
	 @When("RM user selects customer name.")
	 public void selectCuctomerName() throws Exception {

		TransactionApplication.custProfileSearch();
		TransactionApplication.selectCustProfile();
		
	 }
	 @Then("RM user able to see customer profile page.")
	 public void customerProfilePageVerify() throws Exception {

		TransactionApplication.customerProfilePageVerify();
	
	 }
	 @When("RM user clicks on new transaction under customer profile page.")
	 public void TransactionButtonClick() throws Exception {

		TransactionApplication.TransactionButtonClick();
		
	 }
	 @Then("User able to see transaction application page.")
	 public void transactionPageVerify() throws Exception {

		TransactionApplication.transactionPageVerify();
	
	 }
	 @When("RM user search fund section.")
	 public void searchFundClick() throws Exception {

		TransactionApplication.searchFundClick();
		TransactionApplication.selectFundClick();
		
	 }
	 @Then("User able to see default filters ALL risk categories, ALL asset classes, ALL fund types and Local currency funds.")
	 public void defaultFilterVerify() throws Exception {

		TransactionApplication.defaultFilterVerify();
	
	 }
	 @When("Click on Filter Fund under transaction page.")
	 public void searchFilterClick() throws Exception {

		TransactionApplication.searchFilterClick();
		
	 }
	 @Then("User able to see local currency fund tag.")
	 public void localCurrencyFunTagVerify() throws Exception {

		TransactionApplication.localCurrencyFunTagVerify();
	
	 }
	 @And("Tick box is defaulted at search filter.")
	 public void isElementSelected() throws Exception {

		TransactionApplication.isElementSelected();
	
	 }
	 @And("User unable to untick the local currency.")
	 public void isElementDisSelected() throws Exception {

		TransactionApplication.isElementDisSelected();
	
	 }
	 @When("RM user able to see risk Category, asset class, fund type.")
	 public void searchFilterVerify() throws Exception {

		TransactionApplication.searchFilterVerify();
		
		
	 }
	 @Then("User selects multiple criteria under transaction page.")
	 public void applySelectedFilter() throws Exception {

		TransactionApplication.searchFilterclick();
		TransactionApplication.applySelectedFilter();
		TransactionApplication.clickOnClose();
		
	 }
	 @Then("User able to see funds on selected multiple criteria.")
	 public void selectedFundVerify() throws Exception {

		TransactionApplication.selectedFundVerify();
	
	 }
	 @When("User verifies by clicking on the 'x' button on the filter tag at search filters.")
	 public void crossMarkClick() throws Exception {

		TransactionApplication.crossMarkClick();
		
	 }
	 @Then("It should remove filter or selection at filter search.")
	 public void removedFundVerify() throws Exception {

		TransactionApplication.selectedFundVerify();
	
	 }
	 @When("User selected or ticked even criteria at search filter.")
	 public void selectCriteria() throws Exception {

	    TransactionApplication.searchFilterclick();
		TransactionApplication.selectCriteria();
		
	 }
	 @Then("User able to see reset button should be enabled at search filter.")
	 public void resetBtnEnableVerify() throws Exception {

		TransactionApplication.resetBtnEnableVerify();
	
	 }
	 @Then("User able to apply selected filter.")
	 public void applyselectedFilter() throws Exception {

		TransactionApplication.selectCriteria();
		TransactionApplication.clickOnClose();
	    
	 }
	 @When("RM user select one or more asset classes under transaction page.")
	 public void selectMultiAssetClass() throws Exception {

	    TransactionApplication.searchFilterclick();
		TransactionApplication.selectMultipleCriteria();
		TransactionApplication.clickOnClose();
		
	 }
	 @Then("User able to see funds related to selected asset class.")
	 public void selectedfundVerify() throws Exception {

		TransactionApplication.selectedFundVerify();
	
	 }
	 @Then("User able to see only selected assets as filter tags")
	 public void selectedFundverify() throws Exception {

		TransactionApplication.selectedFundVerify();
	
	 }
	 @When("User verifies by clicking on the 'x' button on the filter tag at search filters for asset class.")
	 public void crossClickingAsset() throws Exception {

		
		TransactionApplication.searchFilterclick();
		TransactionApplication.selectMultipleCriteria();
		TransactionApplication.removeFilterAssetClass();
		
	 }
	 @Then("It should remove filter or selection at filter search for asset class.")
	 public void removeFilterAssetClass() throws Exception {

		TransactionApplication.selectedFundVerify();
	
	 }
	 

	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
