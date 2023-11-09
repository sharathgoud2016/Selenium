package com.cimb.utils;

import org.openqa.selenium.WebDriver;

import com.cimb.rma.pages.HomePage;
import com.cimb.rma.pages.RMPortfolioDashboardPageWRA140Page;
import com.cimb.rma.pages.RMTransSetupWRA160Page;
import com.cimb.rma.pages.RMTransactionApplicationWRA146Page;
import com.cimb.rma.pages.RMALoginPageWRA137Page;
import com.cimb.rma.pages.RMApplicationDashboardWRA141Page;
import com.cimb.rma.pages.RMCustomerProfileWRA142Page;

public class PageObjectManager {

	private final WebDriver driver;
	private HomePage homePage;
	private RMALoginPageWRA137Page landingPage;
	private RMPortfolioDashboardPageWRA140Page portfolioDashboardPage;
	private RMCustomerProfileWRA142Page cusomerProfile;
	private RMApplicationDashboardWRA141Page applicationDashboard;
	private RMTransactionApplicationWRA146Page transactionApplication;
	private RMTransSetupWRA160Page transSetup;
	

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (homePage == null) ? homePage = new HomePage(driver) : homePage;
	}

	public RMALoginPageWRA137Page getLoginandLandingPage() {
		return (landingPage == null) ? landingPage = new RMALoginPageWRA137Page(driver) : landingPage;
	}
	
	
public RMPortfolioDashboardPageWRA140Page getRMAPortfolioDashboardPage() {		
	return (portfolioDashboardPage == null) ? portfolioDashboardPage = new RMPortfolioDashboardPageWRA140Page(driver) : portfolioDashboardPage;
}

public RMApplicationDashboardWRA141Page getRMAapplicationDashboard() {		
	return (applicationDashboard == null) ? applicationDashboard = new RMApplicationDashboardWRA141Page(driver) : applicationDashboard;
}

public RMCustomerProfileWRA142Page getRMACustomerProfile() {		
	return (cusomerProfile == null) ? cusomerProfile = new RMCustomerProfileWRA142Page(driver) : cusomerProfile;
}

public RMTransactionApplicationWRA146Page getRMTransactionApplication() {		
	return (transactionApplication == null) ? transactionApplication = new RMTransactionApplicationWRA146Page(driver) : transactionApplication;
}


public RMTransSetupWRA160Page getRMTransSetup() {		
	return (transSetup == null) ? transSetup = new RMTransSetupWRA160Page(driver) : transSetup;
}




	
}
