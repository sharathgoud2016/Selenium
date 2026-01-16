package com.cimb.rma.common;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CommonMethods {

	public static byte[] takeScreenshot(WebDriver driver) {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);

		return screenshot;
	}

	public static boolean isNumeric(String string) {
		return string.matches("^-?\\d+$");
	}
}
