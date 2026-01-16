package com.cimb.utils;

import org.openqa.selenium.WebDriver;

public class TestContext {
	private final DriverManager manager;
	private final PageObjectManager po;

	public TestContext() {

		manager = new DriverManager();
		WebDriver d = manager.getDriver();

		if (d == null || d.toString().contains("(null)"))
			po = new PageObjectManager(manager.getBrowserDriver(TestConfig.TEST_BROWSER, false));
		else
			po = new PageObjectManager(manager.getDriver());
	}

	public PageObjectManager getPageObjectManager() {
		return po;
	}

	public DriverManager getDriverManager() {
		return manager;
	}
}
