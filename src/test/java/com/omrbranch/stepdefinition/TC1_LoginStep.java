package com.omrbranch.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User is on the OMR Branch hotel page")
	public void userIsOnTheOMRBranchHotelPage() throws FileNotFoundException, IOException {

		
	}

	@When("User login {string},{string}")
	public void userLogin(String name, String pass) {

		pom.getLoginPage().login(name, pass);

	}

	@Then("User should verify Success message after login {string}")
	public void userShouldVerifySuccessMessageAfterLogin(String expLoginSuccessmsg) {

		Assert.assertEquals(expLoginSuccessmsg, pom.getSearchHotelPage().getLoginSuccessMsgText());

	}

	@When("User login {string},{string} with Enter key")
	public void user_login_with_enter_key(String name, String pass) throws AWTException {

		pom.getLoginPage().login(name, pass);
		keyBordaction();

	}

	@Then("User should verify error message after login {string}")
	public void user_should_verify_error_message_after_login(String expLoginErrormsg) {

		Assert.assertTrue("Verifying the Error Message", pom.getLoginPage().expectedErrorMessage().contains(expLoginErrormsg));

	}

}
