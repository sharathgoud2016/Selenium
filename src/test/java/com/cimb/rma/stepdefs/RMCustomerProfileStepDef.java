package com.cimb.rma.stepdefs;

import com.cimb.rma.pages.HomePage;
import com.cimb.rma.pages.RMCustomerProfileWRA142Page;
import com.cimb.utils.TestContext;
import com.cimb.utils.random.Leads;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RMCustomerProfileStepDef {

	private Leads lead;
	private HomePage land;
	private RMCustomerProfileWRA142Page customerProfile;


	protected TestContext testContext;

	public RMCustomerProfileStepDef(TestContext context) {
		land = context.getPageObjectManager().getHomePage();
		customerProfile = context.getPageObjectManager().getRMACustomerProfile();
		lead = new Leads();
		testContext = context;
		
	}
	
	
	@When("User search for the existing customer details under RMA dashboard section.")
	public void searchCustomer() throws Exception
	{
	
		customerProfile.custProfieSearch();
		customerProfile.selectCustProfile();
		
		
	}
	
	@When("User search for the existing customer details under RMA dashboard section with Button Enabled.")
	public void buttonsEnabledCustomer() throws Exception
	{
	
		customerProfile.custProfieSearch();
		customerProfile.searchCustomerValidRPQ();
		
		
	}
	@When("User search for the existing second customer details under RMA dashboard section.")
	public void searchCustomertwo() throws Exception
	{
	
		customerProfile.custProfieSearch();
		customerProfile.searchCustomerValidRPQ();
		
		
	}
	
	
	@When("User should be to view the Customer details from customer profile page.")
	public void CustomerProfPage() throws Exception
	{
	
		customerProfile.customerProfilePageVerify();
		
		
	}

	@Then("User should be  able to see all the  customer Investment details from Cust Invt Prf page FullName and IDNumber.")
	public void fullnameIDNumberVerify() throws Exception
	{
	
		customerProfile.fullnameTextVerify();
		customerProfile.idnumberTextVerify();
		
		
	}
	
	
	@And("Buttons for New Account & New Transaction")
	public void newAcctNewTransactionTextVerify() throws Exception
	{
	
		customerProfile.newAccountTextVerify();
		customerProfile.newtransactionTextVerify();
		
		
	}
	
	@And("Risk Profile Aggressive, Balanced, Moderate, Growth")
	public void riskProfileVerify() throws Exception
	{
	
		customerProfile.riskprofileTextVerify();
		
		
		
	}
	
	@And("Customer Details Personal Details Contact Information Other Personal Details Address Mailing Address Employment Details.")
	public void customerProfilePage() throws Exception
	{
	
		customerProfile.expandCustProfDetails();
		customerProfile.addressTextVerify();
		customerProfile.applicationStatusTextVerify();
		customerProfile.contactInformationTextVerify();
		customerProfile.customerDetailsTextVerify();
		customerProfile.customerHoldingsTextVerify();
		customerProfile.employmentDetailsTextVerify();
		customerProfile.otherPersonalDtsTextVerify();
		customerProfile.personalDetailsTextVerify();
		
		
	}
	
	

	@When("User verify for Total Portfolio under Customer profile section")
	public void totalPortfolioVerify() throws Exception
	{
	
		customerProfile.totalPortfolioVerify();
				
		
	}
	
	@Then("User able to see Over wealth Pie chart Savings Fixed deposit Investments Expenses Loan and Financing.")
	public void tpContentVerify() throws Exception
	{
	
		customerProfile.tpContentsVerify();
				
	}
	
	

	@Then("User should able to see product selection filter UT is selected by default  highlighted in red color.")
	public void utSelectionVerify() throws Exception
	{
	
		customerProfile.utTabVerify();
				
		
	}
	
		
	@When("User click on application status tab under Customer profile section")
	public void appStatusTabVerify() throws Exception
	{
	
		
			customerProfile.applicationTabVerify();	
		
	}
	@Then("User able to see Filter Section like Creation date Transaction type Application status.")
	public void appStatusFilterSecVerify() throws Exception
	{
	
	  customerProfile.filtersectionVerify();
				
		
	}
	
	
	@And("User able to see All attributes values Application creation date Tran type App ref ID App status.")
	public void appStatusAllAttributeVerify() throws Exception
	{
	
		customerProfile.allAttributesVerify();
				
		
	}
	
	@And("User should see Created on have a sorting icon up & down arrow.")
	public void sortIconVerify() throws Exception
	{
	
		
		customerProfile.creationDateArrowVerify();
		
	}
	
	@And("User should see Arrow link to see application details.")
	public void arrowlinkVerify() throws Exception
	{
	
		customerProfile.recordArrowVerify();
				
		
	}
	
	@And("Pagination setting verify")
	public void paginationVerify() throws Exception
	{
	
		customerProfile.customerProfilePageVerify();
				
		
	}
	
	@When("User unable to see the transactions that are done by other RMsstaff for Customer A.")
	public void filterByTypeFirstclick() throws Exception {
		
		customerProfile.noInvestMadeVerify();

		
		
	}
	
	@When("User able to see fund name by ascending alphabetical order by default under customer holdings section.")
	public void fundNameSortVerify() throws Exception {
		
		customerProfile.fundNameSortDefaultVerify();
		
	}
	
	@When("Transaction records should be display descending alphabetical order.")
	public void fundNameAscSortVerify() throws Exception {
		
		customerProfile.fundNameSortDscVerify();
		
	}
	
	@When("Transaction records  should be sorted by ascending alphabetical order.")
	public void fundNameDscSortVerify() throws Exception {
		
		customerProfile.fundNameSortAscVerify();
		
	}
	
	
	@When("User clicks on NAV(MYR) under customer holdings section.")
	public void clickNAV() throws Exception {
		
		customerProfile.clickonNAV();
		
	}
	
	
	@When("The result should return to lowest to highest NAV and Transaction records should be sorted highest to lowest.")
	public void sortingNAVVerify() throws Exception {
		
		customerProfile.sortingNAV();
		
	}
	
	
	@When("The result should return to lowest to highest ROI and Transaction records should be sorted highest to lowest.")
	public void sortingROIVerify() throws Exception {
		
		customerProfile.sortingROI();
		
	}
	
	@When("User clicks on  next page under customer holdings section.")
	public void customHoldingPageNxtclick() throws Exception {
		
		customerProfile.customerProfNextPagination();
		
	}
	
	@When("User able to see the customer holdings listed in Next Page.")
	public void customHoldingPageNext() throws Exception {
		
		customerProfile.customerProfNextPagination();
		
	}
	
	
	@When("User able to see the customer holdings listed in Previous Page.")
	public void customHoldingPagePrevious() throws Exception {
		
		customerProfile.customerProfPreviousPagination();
		
	}
	
	
	@When("User able to see the first and last page directly")
	public void firstandLastPageVerify() throws Exception {
		
		customerProfile.firstandLastPageVerify();
		
	}
	
	@When("Verify Customer is on last page under customer holdings section")
	public void nextPageClick() throws Exception {

		customerProfile.lastPageArrowClick();
		
	}
	
	
	@Then("User able to see the Next page is Disable as per the wire in Customer Holdings")
	public void lastPgArrowVerify() throws Exception {

		customerProfile.nextPageArrowVerify();
		
	}
	
	
	@Then("User can see the total number of records for the page is 1-05 of 05 records as per the wire")
	public void numberOfRecordsVerify() throws Exception {

		customerProfile.noOfRecordsVerify();
		
	}
	@Then("User clicks on New Transaction under customer profile section")
	public void newTransactonbtnClick() throws Exception {

		customerProfile.newTransBtn();
		
	}
	

   @Then("User verify inactive fund in search fund listing  under  transaction application page.")
      public void inactiveFundList() throws Exception {

	customerProfile.inactFundList();
	
}
   
   @Then("User should able to see Fund holiday label.")
   public void fundHolidayLabel() throws Exception {

   	customerProfile.fundHolidayLabelVerify();
   	
   }
   
   
   @Then("Customer has  no valid risk Profile under customer profile section.")
	public void noValidRiskProfile() throws Exception {

	   customerProfile.custProfieSearch();
	   customerProfile.noValidRiskProfileCustomer();
		
	}
   
   @Then("User should able to see New Account and New Transaction button will be disabled.")
  	public void newAccountDisable() throws Exception {

  		customerProfile.newbtnDisableVerify();
  		
  	}
   
   
   @Then("User should able to see New Account and New Transaction button will be enabled.")
 	public void newAccountEnabled() throws Exception {

 		customerProfile.newbtnEnableVerify();
 		
 	}
	
   @Then("User able to perform fund redemption even without a valid risk profile")
	public void redeembtnVerify() throws Exception {

		customerProfile.redeemBtnEnableVerify();
		
	}

	
	
	
    
    
	
	
	 
	 
	
	
	
	

}