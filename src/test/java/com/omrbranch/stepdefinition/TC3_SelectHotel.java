package com.omrbranch.stepdefinition;




import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC3_SelectHotel extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	@When("User save the first Hotel Name")
	public void userSaveTheFirstHotelName() {

		pom.getSelectHotelPage().verifyFirstHotelName();
	
		
	}
	@When("User save the first Hotel Price")
	public void userSaveTheFirstHotelPrice() {

		pom.getSelectHotelPage().verifyFirstHotelPrice();
	
	}
	@When("User should accept the booking alert message")
	public void userShouldAcceptTheBookingAlertMessage() {

		pom.getSelectHotelPage().clickFirstHotelContinueBtn();
	
	}
	@Then("User should verify success message after the select hotel {string}")
	public void userShouldVerifySuccessMessageAfterTheSelectHotel(String expbookhotelmsg) {

		Assert.assertTrue("verify the success message",
				pom.getBookHotelPage().verifySuccessBookHotelMsg().contains(expbookhotelmsg));

	}
	
	@When("User save the last Hotel Name")
	public void userSaveTheLastHotelName() {

		pom.getSelectHotelPage().lasthotelname();
	
	}
	@When("User save the last Hotel Price")
	public void userSaveTheLastHotelPrice() {

		pom.getSelectHotelPage().lasthotelprice();
	
	}
	@When("User should canceling the booking alert message")
	public void userShouldCancelingTheBookingAlertMessage() {

		pom.getSelectHotelPage().cancelalert();
	
	}
	@Then("User should verify select hotel message after the canceling the alert {string}")
	public void userShouldVerifySelectHotelMessageAfterTheCancelingTheAlert(String expselecthotlemsg) {

		Assert.assertEquals("verify the select hotel message", pom.getSearchHotelPage().verifySearchHotelMessage(),expselecthotlemsg);
	
	}







}
