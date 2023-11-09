package com.cimb.rma.stepdefs;

import com.cimb.rma.pages.HomePage;
import com.cimb.rma.pages.RMApplicationDashboardWRA141Page;
import com.cimb.utils.TestContext;
import com.cimb.utils.random.Leads;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RMApplicationDashboardStepDef {

	private Leads lead;
	private HomePage land;
	private RMApplicationDashboardWRA141Page applicationDashboard;

	protected TestContext testContext;

	public RMApplicationDashboardStepDef(TestContext context) {
		land = context.getPageObjectManager().getHomePage();
		applicationDashboard = context.getPageObjectManager().getRMAapplicationDashboard();
		lead = new Leads();
		testContext = context;
	}
	
	@When("User verify the application status in RMA dashboard section.")
	public void applicationstatusVerify() throws Exception {

		applicationDashboard.appstatusVerify();
		
		
	}
	@Then("User should able to see the UT product as highlighted as Red color as per the wire attached.")
	public void unittrustTabVerify() throws Exception {

		applicationDashboard.unittrustTabVerify();

	}
	@When("User selects other wealth product type under Application status section.")
	public void searchUSNB() throws Exception {

		applicationDashboard.asnbTabVerify();
		
	}
	
	@Then("User should able to to see ASNB list of applications for selected products.")
	public void asnbVerify() throws Exception {

		applicationDashboard.asnbClick();
	
	}
	@When("User click on creation date under Application status section.")
	public void createdOnDropdown() throws Exception {

		applicationDashboard.createdondropdownVerify();
	}
	
	@Then("User Should able to see a dropdown selection to a select desired transaction records.")
	public void dropdownClick() throws Exception {

		//applicationDashboard.dropdownArrowClick();
		applicationDashboard.createonThirdValueClick();
		applicationDashboard.tableLayoutVerify();
		applicationDashboard.tabClick();
		
		
	}
	
	@When("User click on filter button for selected desire time period under Application Status section.")
	public void dropdownArrowClick() throws Exception {

		applicationDashboard.dropdownArrowClick();
		
	}
	@Then("User should able to see drop down will disappear.")
	public void createonfirstValueClick() throws Exception {

		applicationDashboard.createonfirstValueClick();
		
	}
	@And("User see the list of all transactions platform displayed between the period selected.")
	public void createonfirstValueVerify() throws Exception {

			applicationDashboard.createonfirstValueVerify();
			
	}	
	@When("User verify Result under Application Status section.")
	public void filterbytypeclick() throws Exception {

		applicationDashboard.dropdownArrowClick();
		applicationDashboard.createonThirdValueClick();
		applicationDashboard.tabClick();
		applicationDashboard.filterByTypeClick();
		applicationDashboard.filterByTypeBundleClick();
		applicationDashboard.tabClick();
		applicationDashboard.filterByStatusClick();
		applicationDashboard.filterByStatusRejClick();
		applicationDashboard.tabClick();
		
	}
	@Then("User should able to see NO Results Found as per the wire frame.")
	public void noResultFound() throws Exception {

		applicationDashboard.messageVerify();
	}
	@When("User Click on Subscribe from filter by type under Application Status section.")
	public void filterByTypeClick() throws Exception {

		applicationDashboard.filterByTypeClick();
		
	}
	@Then("User Should only see the subscribe transactions are displayed.")
	public void filterByTypeSubClick() throws Exception {

		applicationDashboard.filterByTypeSubscribeClick();
		applicationDashboard.tabClick();
		applicationDashboard.filterByTypeSubVerify();
		
	}
	@When("User Click on Redeem from filter by type under Application Status section.")
	public void filterByTyperedeemClick() throws Exception {

		applicationDashboard.filterByTypeClick();
		
	}
	@Then("User Should only see the Redeem transactions are displayed.")
	public void filterByTypeRedClick() throws Exception {

		applicationDashboard.filterByTypeRedeemClick();
		applicationDashboard.tabClick();
		applicationDashboard.filterByTypeRedeemVerify();	
	
	}
	@When("User Click on Switch from filter by type under Application Status section.")
	public void filterByTypeswitchClick() throws Exception {

		applicationDashboard.filterByTypeClick();
	
	}
	@Then("User Should only see the Switch transactions are displayed.")
	public void filterByTypeSwitchClick() throws Exception {

		applicationDashboard.filterByTypeSwitchClick();
		applicationDashboard.tabClick();
			
	}
	@When("User Click on Bundle from filter by type under Application Status section.")
	public void filterByTypebundleClick() throws Exception {

		applicationDashboard.filterByTypeClick();
	
	}
	@Then("User Should only see the Bundle transactions are displayed.")
	public void filterByTypeBundleClick() throws Exception {

		applicationDashboard.filterByTypeBundleClick();
		applicationDashboard.tabClick();
			
	}
	@When("User Click on Risk profile update from filter by type under Application Status.")
	public void filterByTypeRpqClick() throws Exception {

		applicationDashboard.filterByTypeClick();
	
	}
	@Then("User Should only see then Risk profile update transactions are displayed.")
	public void filterByTypeRPQClick() throws Exception {

		applicationDashboard.filterByTypeRPQClick();
		applicationDashboard.tabClick();
			
	}
	@When("User Click on All from filter by type under Application Status section.")
	public void filterByTypeArrowClick() throws Exception {

		applicationDashboard.filterByTypeClick();
	
	}
	@Then("User Should see multiple types of transactions displayed All respective transaction types accordingly.")
	public void filterByTypeAllClick() throws Exception {

		applicationDashboard.filterByTypeAllClick();
		applicationDashboard.tabClick();
			
	}
	@When("User clicked one or more filter criteria for Customer application under application status section.")
	public void filterByTypeclick() throws Exception {

		applicationDashboard.filterByTypeClick();
		
	}
	@Then("User should able to see the selected funds that meet the criteria.")
	public void filterByTypeSubBunClick() throws Exception {

		applicationDashboard.filterByTypeSubscribeClick();
		applicationDashboard.filterByTypeBundleClick();
		applicationDashboard.tabClick();
		
	}
	@When("User click on filter for no records under application status section.")
	public void filterByTypeFirstclick() throws Exception {

		applicationDashboard.dropdownArrowClick();
		applicationDashboard.createonThirdValueClick();
		applicationDashboard.tabClick();
		applicationDashboard.filterByTypeClick();
		applicationDashboard.filterByTypeBundleClick();
		applicationDashboard.tabClick();
		applicationDashboard.filterByStatusClick();
		applicationDashboard.filterByStatusRejClick();
		applicationDashboard.tabClick();
		
	}
	@Then("User should able to see no results found and can see appropriate message as per the wire frames.")
	public void createonthirdValueClick() throws Exception {

		applicationDashboard.messageVerify();
		
	}
	@When("User clicks on Completed from filter by status under application status section.")
	public void filterBystatusClick() throws Exception {

		applicationDashboard.filterByStatusClick();
		
	}
	@Then("User should able to see only the selected filter Completed status.")
	public void filterByStatusCompClick() throws Exception {

		applicationDashboard.filterByStatusCompClick();
		applicationDashboard.tabClick();
		
	}
	@When("User clicks on Pending approval from filter by status under application status section.")
	public void filterbyStatClick() throws Exception {

		applicationDashboard.filterByStatusClick();
		
	}
	@Then("User should able to see only the selected filter as Pending approval status.")
	public void filterBystatusPAclick() throws Exception {

		applicationDashboard.filterByStatusPAClick();
		applicationDashboard.tabClick();
		
	}	
	@When("User clicks on Rejected from filter by status under application status section.")
	public void filterbystatusclick() throws Exception {

		applicationDashboard.filterByStatusClick();
		
	}
	@Then("User should able to see only the selected filter as Rejected status.")
	public void filterBystatusRejClick() throws Exception {

		applicationDashboard.filterByStatusRejClick();
		applicationDashboard.tabClick();
		
	}	
	@When("User selects All from filter by status under Application status section")
	public void filterByStatusArrowClick() throws Exception {

		applicationDashboard.filterByStatusClick();
		
	}
	@Then("User should able to see multiple status to the respective transaction status accordingly.")
	public void filterByStatusAllClick() throws Exception {

		applicationDashboard.filterByStatusAllClick();
		applicationDashboard.tabClick();
		
	}	
	@When("User clicks on Processing from filter by status under application status section.")
	public void filterbySTATUSClick() throws Exception {

		applicationDashboard.filterByStatusClick();
		
	}
	@Then("User should able to see only the selected filter as Processing status.")
	public void filterBystatusProClick() throws Exception {

		applicationDashboard.filterByStatusProClick();
		applicationDashboard.tabClick();
		
	}	
	@When("User search for Result.")
	public void filterbyTypeclick() throws Exception {

		applicationDashboard.dropdownArrowClick();
		applicationDashboard.createonThirdValueClick();
		applicationDashboard.tabClick();
		applicationDashboard.filterByTypeClick();
		applicationDashboard.filterByTypeBundleClick();
		applicationDashboard.tabClick();
		applicationDashboard.filterByStatusClick();
		applicationDashboard.filterByStatusRejClick();
		applicationDashboard.tabClick();
		
	}
	@Then("User should able to see the Empty result as per the wire frame.")
	public void emptyResultFound() throws Exception {

		applicationDashboard.messageVerify();
	}
	@When("User applied NO values in filter under Applications status section.")
	public void resetButtonClick() throws Exception {

		applicationDashboard.resetClick();
		
	}
	@Then("User should able to see Reset button is disabled.")
	public void resetButtonVerify() throws Exception {

		applicationDashboard.isResetDisable();
		
	}	
	@When("User clicks on next page under Application Status Section.")
	public void nextPageArrowClick() throws Exception {

		applicationDashboard.nextPageArrowClick();
		
	}
	@Then("User able to see the application status listed in Next Page.")
	public void nextPageArrowVerify() throws Exception {

		applicationDashboard.nextPageArrowVerify();
		
	}	
	@When("User clicks on Previous page under Application Status Section.")
	public void previousPageArrowClick() throws Exception {

		applicationDashboard.firstPageArrowClick();
		
	}
	@Then("User able to see the application status listed in Previous page.")
	public void previousPageArrowVerify() throws Exception {

		applicationDashboard.firstPageArrowVerify();
		
	}	
	@When("Verify user can move directly to the first and last page.")
	public void nextPageArrowclick() throws Exception {

		applicationDashboard.nextPageArrowClick();
		applicationDashboard.firstPageArrowClick();
		
	}
	@Then("User able to see the first and last page directly.")
	public void previousPageArrowverify() throws Exception {

		applicationDashboard.nextPageArrowVerify();
		applicationDashboard.firstPageArrowVerify();
		
	}
	@When("User Verify Redeem in the transaction record under Application Status section.")
	public void clickFilterByType() throws Exception {

		applicationDashboard.filterByTypeAllClick();
		
	}
	@Then("User should be able to see the Redeem transaction type.")
	public void clickOnRedeem() throws Exception {

		applicationDashboard.filterByTypeRedeemClick();
		applicationDashboard.redeemButtonVerify();
		applicationDashboard.tabClick();
		
	}
	@And("User able to see all Redeem attributes values as per listed in story as per layout design.")
	public void redeemResultVerify() throws Exception {

		applicationDashboard.filterByTypeRedeemVerify();
		
	}
	@When("User Verify Switch in the transaction record under Application Status section.")
	public void switchButtonVerify() throws Exception {

		applicationDashboard.filterByTypeAllClick();
		
	}
	@Then("User should able to see the switch transaction type .")
	public void clickOnSwitch() throws Exception {

		applicationDashboard.filterByTypeSwitchClick();
		applicationDashboard.tabClick();
		
	}
	@And("User able to see all Switch attributes values as per listed in story as per layout design.")
	public void switchResultVerify() throws Exception {

		applicationDashboard.switchResultVerify();
		
	}
	@When("User Verify Bundle in the transaction record under Application Status section.")
	public void bundleButtonVerify() throws Exception {

		applicationDashboard.filterByTypeAllClick();
		
	}
	@Then("User Should able to see all the Bundle transaction type.")
	public void clickOnBundle() throws Exception {

		applicationDashboard.filterByTypeBundleClick();
		applicationDashboard.tabClick();
		
	}
	@And("User able to see Bundle attributes values as per listed in story as per layout design.")
	public void bundleResultVerify() throws Exception {

		applicationDashboard.bundleResultVerify();
		
	}
	@When("User Verify RPQ update in the transaction record under Application Status section.")
	public void rpqUpdateButtonVerify() throws Exception {

		applicationDashboard.filterByTypeAllClick();
		
	}
	@Then("User Should able to see RPQ update transaction type.")
	public void clickOnRPQupdate() throws Exception {

		applicationDashboard.filterByTypeRPQClick();
		applicationDashboard.tabClick();
		
	}
	@And("User able to see the all RPQ attributes values as per listed in story as per layout design.")
	public void rpqUpdateResultVerify() throws Exception {

		applicationDashboard.rpqResultVerify();
	}	
	@When("User View at the transaction record under Application Status.")
	public void unittrustclick() throws Exception {

		applicationDashboard.unitTrustClick();
		
	}
	@Then("User able to see all the attributes values as per listed in story.")
	public void attributesVerify() throws Exception {

		applicationDashboard.createdOnVerify();
		applicationDashboard.customerNameVerify();
		applicationDashboard.transactiontypeVerify();
		applicationDashboard.filterByTypeSubVerify();
		applicationDashboard.referenceIDverify();
		applicationDashboard.applicationStatVerify();
		
	}
	@And("see the layout as per design.")
	public void tableLayoutVerify() throws Exception {

		applicationDashboard.tableLayoutVerify();
		
	}
	@When("Verify Customer is on first page under Application Status section.")
	public void firstPageClick() throws Exception {

		applicationDashboard.firstPageArrowClick();
		
	}
	@Then("User able to see the Previous page is Disable as per the wire.")
	public void previousPgArrowVerify() throws Exception {

		applicationDashboard.previosPgArrowVerify();
		
	}
	@When("Verify Customer is on last page under Application Status section.")
	public void nextPageClick() throws Exception {

		applicationDashboard.nextPageArrowClick();
		
	}
	
	
	@Then("User able to see the Next page is Disable as per the wire.")
	public void lastPgArrowVerify() throws Exception {

		applicationDashboard.lastPgArrowVerify();
		
	}
	@When("User verify number of funds per page.")
	public void tableVerify() throws Exception {

		applicationDashboard.tableLayoutVerify();
		
	}
	@Then("User able to see the funds per page is 10 as per the wire.")
	public void rowCount() throws Exception {

		applicationDashboard.pageRecordVerify();
		
	}
	@And("User can see the total number of records for the page is 1-10 of 23 records as per the wire.")
	public void pageRecordVerify() throws Exception {

		applicationDashboard.pageRecordVerify();
		
	}
	@When("User lands on the RMA application for first time.")
	public void firstTimeOnRMAapp() throws Exception {

		applicationDashboard.firstTimeOnRMAapp();
		
	}
	@Then("User should not see any data in the application in RMA dashboard as per the design.")
	public void noDataInAppVerify() throws Exception {

		applicationDashboard.noDataInAppVerify();
		
	}
	@And("User able to see the Application dashboard should remain empty until RM created their first application thru RMA Portal as per the wire frame.")
	public void noDataInDashboardVerify() throws Exception {

		applicationDashboard.noDataInDashboardVerify();
		
	}
	
	@When("Verify Customer Asc and Dec order after click on Customer Column")
	public void customerColumnSortingVerify() throws Exception {

		applicationDashboard.sortingWebtableCustomer();
		
	}
	
	@When("Verify Transaction date should display latest to newest date on top by default")
	public void createdONColumnDefaultVerify() throws Exception {

		applicationDashboard.sortingWTTrasactionDateDefault();
		
	}
	
	@When("Verify transaction records when clicks on created on, under application status.")
	public void createdONColumnSortingVerify() throws Exception {

		applicationDashboard.sortingWebtableTrasactionDate();
		
	}
	@When("User verifies at top page on dashboard.")
	public void dashboardPageVerify() throws Exception {

		applicationDashboard.dashboardVerify();
		
	}
	
//	@When("User should see wealth dropdown portion is removed from all the screens on dashboard page.")
//	public void () throws Exception {
//
//		applicationDashboard
//		
//	}
	@When("User select Customer ID number under RMA dashboard section")
	public void searchForCustomerID() throws Exception {

		applicationDashboard.searchForCustomerID();
		applicationDashboard.customerIDclick();
		
	}
	@Then("User land on customer profile page")
	public void customerPageVerify() throws Exception {

		applicationDashboard.customerPageVerify();
		
	}
	@When("User select Transaction Type Filter from application status on customer profile page")
	public void transactionStatusClick() throws Exception {

		applicationDashboard.transactionStatusclick();
		
	}
	@Then("User can't see the new account type from transaction type filter")
	public void transactionDropDownClick() throws Exception {

		applicationDashboard.transactionDropDownClick();
		applicationDashboard.newAccountTypeVerify();
	}
	@When("User Selecting All will not auto-select all selection in filter bar on application status section.")
	public void filterBytypeAllClick() throws Exception {

		applicationDashboard.filterByTypeClick();
		applicationDashboard.filterByTypeAllClick();
		
	}
//	@And("Click anywhere outside of filter area.")
//	public void tabclick() throws Exception {
//
//		applicationDashboard.tabClick();
//		
//	}
	@Then("User able to see only display ‘All’ in the filter bar on application status section.")
	public void filterByTypeAllVerify() throws Exception {

		applicationDashboard.filetrBytypeAllVerify();
		
	}
	@When("user select other selection not All selection and check on the checkbox.")
	public void filterByTypeSubscribeClick() throws Exception {

		applicationDashboard.filterByTypeClick();
		applicationDashboard.filterByTypeSubscribeClick();
		
	}
//	@Then(" “All” option will be unchecked in filter list.")
//	public void () throws Exception {
//
//		applicationDashboard
//		
//	}
	@When("User select customer name in RMA Dashboard.")
	public void searchforcustomerID() throws Exception {

		applicationDashboard.searchForCustomerID();
		applicationDashboard.customerIDclick();
	}
	@Then("User Should land on the customer Profile page")
	public void customerPageverify() throws Exception {

		applicationDashboard.customerPageVerify();
	
		
	}
	@When("User Selecting All will not auto-select all selection in filter bar on application status section on CP.")
	public void applicationStatCPClick() throws Exception {

		applicationDashboard.applicationStatCP();
		applicationDashboard.filetrByTypeAllCP();
		applicationDashboard.selectAllCP();
		
	}
	@And("Click anywhere outside of filter area.")
	public void tabClick() throws Exception {

		applicationDashboard.tabClick();
		
	}
	@Then("User able to see only display All in the filter bar on application status section.")
	public void allTransTypeCPVerify() throws Exception {

		applicationDashboard.allTransTypeCPVerify();
	
		
	}
	@When("user select other selection not All selection and check on the checkbox in CP.")
	public void subscribeClickOnCP() throws Exception {

		applicationDashboard.filetrByTypeAllCP();
		applicationDashboard.subscribeClickOnCP();
		
	}
//	@Then("“All” option will be unchecked in filter list.")
//	public void () throws Exception {
//
//		applicationDashboard
//	
//		
//	}
	@When("User select last 3 months in Filter by creation date in application status section on RMA Dashboard.")
	public void createOnArrowclick() throws Exception {

		applicationDashboard.createOnArrowClick();
		applicationDashboard.createonThirdValueClick();
		
	}
	@Then("User able to see Application history should only available for the last 3 months or last 93 days from today’s date.")
	public void tablelayoutVerify() throws Exception {

		applicationDashboard.tableLayoutVerify();
		
	}
//	@When("User select customer name in RMA Dashboard.")
//	public void searchforCustomerID() throws Exception {
//
//		applicationDashboard.searchForCustomerID();
//		applicationDashboard.customerIDclick();
//		
//	}
	@Then("User Should land on the Customer profile page")
	public void customerpageVerify() throws Exception {

		applicationDashboard.customerPageVerify();
		
	}
	@When("User select filter by creation date and select last 3 month in application status section.")
	public void filterByCreationDate() throws Exception {

		applicationDashboard.transactionStatusclick();
		applicationDashboard.createdOnDropdownCP();
		applicationDashboard.lastThreeMonthsCPclick();
		
		
	}
	@Then("User should able to see all transactions within the last 3 months.")
	public void tableVerifyCP() throws Exception {

		applicationDashboard.tableVerifyCP();
		
	}
	
	
	
	
	
}
