package com.cimb.rma.pages;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import com.cimb.rma.constant.LandingPage;
import com.cimb.utils.TestConfig;

public class HomePage extends BasePage {
	
	WebDriver drivercog;

	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}

	public String getURL(String pageName) {
		String url = "";
		String browser = System.getProperty("browser", "");
		String env = System.getProperty("env", "");
		String ver = System.getProperty("version", "");

		if (browser.isEmpty())
			browser = TestConfig.TEST_BROWSER;
		if (env.isEmpty())
			env = TestConfig.TEST_ENV;
		if (ver.isEmpty())
			ver = TestConfig.TEST_ENV_VERSION;

		if (pageName.equalsIgnoreCase(LandingPage.PRODUCT_PAGE.getPageName()))
			url = LandingPage.PRODUCT_PAGE.getPartialUrl();

		else if (pageName.equalsIgnoreCase(LandingPage.RESUME_APPLICATION.getPageName()))
			url = LandingPage.RESUME_APPLICATION.getPartialUrl();

		else if (pageName.equalsIgnoreCase(LandingPage.ONBOARD.getPageName()))
			url = LandingPage.ONBOARD.getPartialUrl();

		url = url.replace("{env}", env + ver);

		return url;
	}

	public void launchApp(String url) {
		driver.get(url);
	}
	
	
	public void launchAppIncognitoMode(String url) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		drivercog = new ChromeDriver(options);
		drivercog.get(url);
		
	}
	
	public void quit() {
		driver.quit();
	}
}
