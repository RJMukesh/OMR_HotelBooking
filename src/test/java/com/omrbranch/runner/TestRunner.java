package com.omrbranch.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.omrbranch.report.Report;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@Modify9",stepNotifications = true,publish = true,dryRun = false,monochrome = true,plugin = {"pretty","json:target//index.json"},snippets = SnippetType.CAMELCASE,glue = "com.omrbranch.stepdefinition", features = "src\\test\\resources")
public class TestRunner {
	
	@AfterClass
	public static void afterclass() {

		Report.jvmReport("C:\\Users\\LENOVO\\eclipse-workspace\\OMRBranchHotelAutomationProject\\target\\index.json","Screenshot");
	}
	
	

}
