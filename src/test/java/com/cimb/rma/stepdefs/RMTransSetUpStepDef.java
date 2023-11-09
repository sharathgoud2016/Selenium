package com.cimb.rma.stepdefs;

import com.cimb.rma.pages.HomePage;
import com.cimb.rma.pages.RMTransSetupWRA160Page;
import com.cimb.rma.pages.RMTransactionApplicationWRA146Page;
import com.cimb.utils.TestContext;
import com.cimb.utils.random.Leads;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RMTransSetUpStepDef {

	private Leads lead;
	private HomePage land;
	private RMTransSetupWRA160Page transSetup;

	protected TestContext testContext;

	public RMTransSetUpStepDef(TestContext context) {
		land = context.getPageObjectManager().getHomePage();
		transSetup = context.getPageObjectManager().getRMTransSetup();
		lead = new Leads();
		testContext = context;
	 }
	
	 @When("User want to put in Referral details under transaction Application.")
	 public void selectCuctomerName() throws Exception {

		transSetup.refFieldsVerify();
	
		
	 }
	
	 @Then("User should able to see key in Referral code Referrer Name Referrer Branch")
	 public void refValuesVerify() throws Exception {

		transSetup.enterReferralValues();
	
		
	 }
	 
	 @Then("User should able to see all the branches alphabetically or according to branch code in a drop down.")
	 public void refBranchSortingVerify() throws Exception {

		transSetup.sortingOrderRefBranch();
	
		
	 }
	 
	 
	 @Then("User click on Home link to navigate to Home page")
	 public void navigatetoHomePage() throws Exception {

		transSetup.homePageClick();
	
		
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
