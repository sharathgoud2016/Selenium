package com.cimb.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	private WebDriver driver;

	public WebDriver getBrowserDriver(String browser, boolean isHeadless) {
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = getChromeOptions(isHeadless);
			driver = new ChromeDriver(options);

			break;
			
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions FFoption = getFirefoxOptions(isHeadless);
			driver = new FirefoxDriver(FFoption);

			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

			break;

		default:
			throw new RuntimeException("Unable to locate browser: " + browser);
		}

		driver.manage().window().maximize();

		return driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

	private ChromeOptions getChromeOptions(boolean isHeadless) {
		ChromeOptions options = new ChromeOptions();

		if (isHeadless)
			options.addArguments("--headless");

		options.addArguments("--disable-infobars");
		options.addArguments("--window-size=1920,1080");
		options.addArguments("--use-fake-ui-for-media-stream");
		options.addArguments("--use-fake-device-for-media-stream");
		options.addArguments("--disable-extensions");
		// options.addArguments("--incognito");
		options.addArguments("--user-agent='Mock-Agent'");
		options.addArguments("--proxy-server='direct://'");
		options.addArguments("--proxy-bypass-list=*");
		options.addArguments("--start-maximized");
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
		options.addArguments("--ignore-certificate-errors");

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);

		return options;
	}

	
	  private FirefoxOptions getFirefoxOptions(boolean isHeadless) { FirefoxOptions
	  options = new FirefoxOptions();
	  
	  if(isHeadless) options.addArguments("--headless");
	  
	  options.addArguments("--disable-infobars");
	  options.addArguments("--window-size=1920,1080");
	  options.addArguments("--use-fake-ui-for-media-stream");
	  options.addArguments("--use-fake-device-for-media-stream");
	  options.addArguments("--disable-extensions");
	  options.addArguments("--incognito");
	  options.addArguments("--user-agent='Mock-Agent'");
	  options.addArguments("--proxy-server='direct://'");
	  options.addArguments("--proxy-bypass-list=*");
	  options.addArguments("--start-maximized");
	  options.addArguments("--disable-gpu");
	  options.addArguments("--disable-dev-shm-usage");
	  options.addArguments("--no-sandbox");
	  options.addArguments("--ignore-certificate-errors");
	  
	 
	  DesiredCapabilities capabilities = new DesiredCapabilities();
	  capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
	  options.merge(capabilities);
	  
	  return options; }
	 
}
