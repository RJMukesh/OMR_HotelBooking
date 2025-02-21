package com.omrbranch.stepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.omrbranch.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {

		browserLaunch(getPropertyfileValue("browser"));
		enterApplnUrl(getPropertyfileValue("url"));
		maximizeWindow();
		implictWait();

		
	}
	@After
	public void afterScenario(Scenario scenario) {
		
		boolean b = scenario.isFailed();
		
		if (!b) {
			
			scenario.attach(screenshotbyt(),"imaged/png","Passed Scenario");
		}
		
		

		closeallwindow();
		
	}

}
