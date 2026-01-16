package com.cimb.rma.stepdefs;

import org.openqa.selenium.WebDriver;

import com.cimb.rma.pages.HomePage;
import com.cimb.rma.pages.RMPortfolioDashboardPageWRA140Page;
import com.cimb.utils.TestContext;
import com.cimb.utils.random.Leads;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RMPortfolioDashboardStepDef {

	private Leads lead;
	private HomePage land;
	private RMPortfolioDashboardPageWRA140Page portfolioDashboard;


	protected TestContext testContext;

	public RMPortfolioDashboardStepDef(TestContext context) {
		land = context.getPageObjectManager().getHomePage();
		portfolioDashboard = context.getPageObjectManager().getRMAPortfolioDashboardPage();
		

		lead = new Leads();
		testContext = context;
	}

	
	@When("User select the particular year from the total subscription transactions drop down list under RMA dashboard section.")
	public void totalSubcriptinAmt() throws Exception
	{
	
		portfolioDashboard.clickYearDropdown();
	
		
	}
	
	@Then("User should able to see the selected year 20XX from the drop down list of total subscription. transactions.")
	public void yearDropdown() throws Exception
	{
	
		portfolioDashboard.validateYear();
		
		
	}
	
	@When("User verify Total Subscription Amount for the selected year from total subscription transaction section")
	public void subcriptionYear() throws Exception
	{
	
		portfolioDashboard.clickYearDropdown();
		
	}
	
	
	@Then("User should able to see the change in total Subscription Amount for the last 3 years")
	public void subcriptionAmountChange() throws Exception
	{
		
		portfolioDashboard.transactionsAmountVerify();
	}
	
	@Then("User should able to see the chart details for the selected year.")
	public void verifChart() throws Exception
	{
		
		portfolioDashboard.chartDisplay();
	}
	
	@Then("Details will change accordingly to the year user which is selected.")
	public void verifDetailsChart() throws Exception
	{
		
		portfolioDashboard.chartYearVerify();
	}
	
	@Then("New Account and New Transaction CTA hyperlink exists.")
	public void newTransandExtlinkVerfiy() throws Exception
	{
		
		portfolioDashboard.newTransandExistinglink();
	}
	
	@Then("User is on Application Status under RMA dashboard section.")
	public void applicationStatus() throws Exception
	{
		
		portfolioDashboard.applicationStatusText();
	}
	
	
	@And("User should able to see Created On ddmmyyyy time")
	public void dateVerfiy() throws Exception
	{
		
		portfolioDashboard.createdDateVerify();
	}
	
	
	@And("Customer Name should be displayed")
	public void customerName() throws Exception
	{
		
		portfolioDashboard.customerNameText();
	}
	
	
	@And("Type Bundle Subscribe Redeem New Account displayed")
	public void statusTypeVeriy() throws Exception
	{
		
		portfolioDashboard.statusOptions();
	}
	
	@And("Reference ID number or Passport Number displayed")
	public void refIDPassportNumVerify() throws Exception
	{
		
		portfolioDashboard.refIDVerify();
	
	}
	
	
	@And("Status Rejected Confirmed Pending Approval Draft should be displayed")
	public void statusVerify() throws Exception
	{
		
		portfolioDashboard.applicationStatusVerify();
		
		
	}
	

	@And("Amount should be displayed on the left side of the chart MYR amount")
	public void totalSubAmountDispay() throws Exception
	{
		
		portfolioDashboard.totalSubAmountVerify();
		
		
	}
	
	
	@And("User should able to see the year displayed on the title should be dynamic as per the Selected year.")
	public void titleYear() throws Exception
	{
		
		portfolioDashboard.titleYearVerify();
		
		
	}
	
	@When("User verify Total Subscription amount  under RMA dashboard section.")
	public void totalSubAmtVerify() throws Exception
	{
		
		portfolioDashboard.transactionsAmountVerify();
		
		
	}
	
	@When("User verify  the  last updated date and time from total subscription transaction section.")
	public void dateformatDisplay() throws Exception
	{
		
		portfolioDashboard.dateTextDisplay();
		
		
	}
	
	@When("User should able to view the last updated date and time below the total amount as per the wire frame.")
	public void dateformatVerify() throws Exception
	{
		
		portfolioDashboard.dateTextVerify();
		
		
	}
	@When("User verify UT transaction under total subscription transactions section.")
	public void unitTrustVerify() throws Exception
	{
		
		portfolioDashboard.unitTrustVerify();
		
		
	}
	@Then("User should able to see the Total month to date for UT transaction in the grey box on the left.")
	public void monthToDateVerify() throws Exception
	{
		
		portfolioDashboard.monthToDateVerify();
		
		
	}
	@And("The amount should be MYR month.")
	public void monthMYRverify() throws Exception
	{
		
		portfolioDashboard.monthMYRverify();
		
		
	}
	@When("User verify growth in percentage for Unit Trust amount under total subscription transaction section.")
	public void percentGrowthVerify() throws Exception
	{
		
		portfolioDashboard.percentGrowthVerify();
		
		
	}
	@Then("User able to see the current M.O.M and growth in percentage month to date.")
	public void momPercentVerify() throws Exception
	{
		
		portfolioDashboard.momPercentVerify();
		portfolioDashboard.monthMYRverify();
		
		
	}
	@When("User verify month-to-date transaction growth for UT under Total subscription transaction section.")
	public void verifyMonthDate() throws Exception
	{
		
		portfolioDashboard.monthToDateVerify();
		
		
	}
	@Then("User able to see the Increase arrow in Green color.")
	public void greenArrowVerify() throws Exception
	{
		
		portfolioDashboard.greenArrowVerify();
		
		
	}
	@When("User verifies current year at the total subscription transactions section.")
	public void currentYearVerify() throws Exception
	{
		
		portfolioDashboard.currentYearDropdownClick();
		portfolioDashboard.currentYearClick();
		
	}
	@Then("User should be view the last updated date on total subscription transactions section.")
	public void UpdatedDateVerify() throws Exception
	{
		
		portfolioDashboard.lastUpdatedDateVerify();
		
		
	}
	@When("User select the 2021 year from the drop down list under total subscription transactions section.")
	public void lastYearDataVerify() throws Exception
	{
		
		portfolioDashboard.currentYearDropdownClick();
		portfolioDashboard.lastYearClick();
		
	}
	@Then("User should be shown the year to date transaction made by the RM under the total subscription transactions section on dashboard page.")
	public void lastYearDateVerify() throws Exception
	{
		
		portfolioDashboard.lastYearDateVerify();
		
		
	}
	@When("User see the data and values under the total subscription transactions section.")
	public void dataValuesVerify() throws Exception
	{
		
		portfolioDashboard.monthTodateVerify();
		
	}
	@Then("It should be displayed as month to date e.g. Last updated on 23 Jun 2022, 8:01 PM")
	public void monthTodateVerify() throws Exception
	{
		
		portfolioDashboard.monthTodateVerify();
		
		
	}
	@When("User verifies the past years according to the data and values.")
	public void lastYearDataverify() throws Exception
	{
		
		portfolioDashboard.currentYearDropdownClick();
		portfolioDashboard.lastYearClick();
		
	}
	@Then("User should able to view last updated date under the total subscription transactions section.")
	public void lastYearDateverify() throws Exception
	{
		
		portfolioDashboard.lastYearDateVerify();
		
		
	}

	
}