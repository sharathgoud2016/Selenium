package com.cimb.rma.stepdefs;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.cimb.rma.pages.BasePage;
import com.cimb.rma.pages.HomePage;
import com.cimb.rma.pages.RMALoginPageWRA137Page;
import com.cimb.utils.TestContext;
import com.cimb.utils.random.Leads;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RMALoginPageStepDef {

	private Leads lead;
	private HomePage land;
	private RMALoginPageWRA137Page loginpage;
	protected TestContext testContext;
	
	

	public RMALoginPageStepDef(TestContext context) throws IOException {
		land = context.getPageObjectManager().getHomePage();
		loginpage=context.getPageObjectManager().getLoginandLandingPage();
		lead = new Leads();
		testContext = context;
	
	}

	@Given("I am on login page")
	public void launch_web_page() throws IOException {
		
		String envURL = BasePage.configFile("envURL");
		System.out.println("envURL"+envURL);
		String url = land.getURL(envURL);
		System.setProperty("url", url);

		land.launchApp(url);
		ExtentCucumberAdapter
				.addTestStepLog("LOG: Launched " + envURL + " landing page successfully with url: " + url);
	}
	
		
	
	@When("The User Successfully able to access RMA application")
	public void access_RMA_application()
	{
	
		loginpage.validateURL();
	
		
	}
	//Login Username 05
	@When("User inputs a valid LAN user id and Password")
    public void loginRMAApplication() throws Exception
    {
		
		String username = BasePage.configFile("username");
		String pwd = BasePage.configFile("password");
		loginpage.rmaLogin(username,pwd);
    }
	//Login Username One
	@When("user inputs a valid LAN {string} and {string}")
    public void facebookLogin(String username,String password) throws Exception
    {
		
	    System.out.println("userName"+username+password);
		loginpage.facebookLogin(username,password);
		
		
    }
	
	//Login username 02
	@When("Verify user is on Customer A profile page.")
    public void noRecordLogin() throws Exception
    {
		
		String username = BasePage.configFile("usernamenoRecord");
		String pwd = BasePage.configFile("password");
		loginpage.rmaLogin(username,pwd);
    }
	
	/*@When("User inputs a valid LAN user id {string} and {string} Password in second session")
    public void loginIncog(String lanID,String password) throws Exception
    {
		
		loginpage.loginIncog(lanID,password);
    }*/
	
	@Then("The User Successfully Logged into RMA system")
    public void valid_Login() throws InterruptedException
    {
		
		loginpage.dashboardPage();
		
    }
	
	@And("User should land on RMA dashboard page.")
    public void dashboardPage() throws InterruptedException
    {
		
		loginpage.dashboardPage();
		
    }
	
	
	
/*	@When("User inputs a invalid LAN user id {string} and {string} Password")
	public void invalidLogin(String lanID,String password) throws Exception
    {
		
		loginpage.rmaInvalidLogin(lanID, password);
				
		
    }*/
	
	@Then("User should able to see LAN ID and password is invalid.Please try again.")
	public void validateErrorMsg() throws Exception
    {
		
		loginpage.errorMsgInvalidLogin();
				
		
    }
	
	@When("User should able to see a confirmation pop up which consists of cancel and continue buttons")
	public void verifyCancelandContinueBtn() throws Exception
	{
	
		loginpage.continueBtnExist();
		loginpage.cancelBtnExist();
	
		
	}
	
	@And("User should click on Cancel Button")
	public void cancelButton() throws Exception
    {
		
		loginpage.cancelBtn();
		
		
    }
	
	@And("User click on logout button in RMA Application")
	public void logoutRMA() throws Exception
    {
			
		
		loginpage.logoutApplication();
		
		
    }
	
	@And("User should click on Continue Button")
	public void continueButton() throws Exception
    {
		
		loginpage.continueBtn();
		
		
    }
	
	@When("RM lands on dashboard user did not perform any activity for five minutes")
	public void inActiveFiveMin() throws Exception
	{
	
		loginpage.inActivitySessionWait();
	
		
	}
	@Then("User should see the Session Inactivity popup displays with message")
	public void sessionInactiveVerify() throws Exception{
	
		loginpage.sessionInactiveVerify();
	
		
	}
	@And("User click on logout button in Session Inactivity popup.")
	public void logoutInactiveSessionClick() throws Exception{
	
		loginpage.logoutInactiveSessionClick();
	
		
	}
	@When("User click on Continue Session button from session inactivity prompt window in dashboard section.")
	public void continueInactiveSessionClick() throws Exception
	{
	
		loginpage.continueInactiveSessionClick();
	
		
	}
	
	
	
	
}