package com.cimb.rma.stepdefs;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.cimb.rma.common.CommonMethods;
import com.cimb.utils.PropertyStream;
import com.cimb.utils.TestContext;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	public static Scenario scenario;
	private WebDriver driver;
	private TestContext testContext;

	public Hooks(TestContext context) {
		testContext = context;
	}

	@Before
	public void before(Scenario scenario) {
		Hooks.scenario = scenario;
		driver = testContext.getDriverManager().getDriver();
	}

	@AfterStep
	public void afterStep(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.attach(CommonMethods.takeScreenshot(driver), "image/png", "");
			ExtentCucumberAdapter.getCurrentStep().fail("Screenshot for failure step");
		}
	}

	@After
	public void after() {
		PropertyStream.setProperty("FullName", "");
		PropertyStream.setProperty("NRIC", "");
		driver.quit();
	}

}
