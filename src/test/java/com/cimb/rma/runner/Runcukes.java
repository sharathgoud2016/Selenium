package com.cimb.rma.runner;

import org.testng.annotations.BeforeSuite;
import com.cimb.utils.PropertyStream;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/features", glue = {
		"com.cimb.rma.stepdefs" }, tags = "@gowri03", plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class Runcukes extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void setup() throws Exception {
		PropertyStream.loadProperty("testData.properties");

	}

}