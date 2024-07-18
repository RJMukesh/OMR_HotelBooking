package com.omrbranch.stepdefinition;



import org.junit.Assert;

import com.omrbranch.page.SelectHotelPage;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_BookHotel {

	PageObjectManager pom = new PageObjectManager();

	@When("User save the first hotel name and price")
	public void userSaveTheFirstHotelNameAndPrice() {

		pom.getSelectHotelPage().verifyFirstHotelName();
		pom.getSelectHotelPage().verifyFirstHotelPrice();
	}

	@When("User accept the booking  alert message")
	public void userAcceptTheBookingAlertMessage() {

		pom.getSelectHotelPage().clickFirstHotelContinueBtn();

	}

	@Then("User should verify after the success message {string}")
	public void userShouldVerifyAfterTheSuccessMessage(String expsuccessmsg) {

		Assert.assertTrue("verify the success message",
				pom.getBookHotelPage().verifySuccessBookHotelMsg().contains(expsuccessmsg));

	}

	@When("User add Guest Details  {string},{string},{string},{string} and {string}")
	public void userAddGuestDetailsAnd(String selectSalutation, String firstName, String lateName, String mobileNo,
			String email) throws InterruptedException {

		pom.getBookHotelPage().addGuestDetails(selectSalutation, firstName, lateName, mobileNo, email);

	}

	@When("User add GST Details {string},{string} and {string}")
	public void userAddGSTDetailsAnd(String registrationNo, String companyName, String companyAddress)
			throws InterruptedException {

		pom.getBookHotelPage().addGstDetails(registrationNo, companyName, companyAddress);

	}

	@When("User add Special request {string}")
	public void userAddSpecialRequest(String specialrequest) throws InterruptedException {

		pom.getBookHotelPage().addSpecialRequest(specialrequest);

	}

	@When("User add Payment Details,Processed with card type {string}")
	public void userAddPaymentDetailsProcessedWithCardType(String paymentType, io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {

		pom.getBookHotelPage().addPaymentDetails(paymentType, dataTable);


	}

	@Then("User should verify after hotel booking success message {string} and save the order ID")
	public void userShouldVerifyAfterHotelBookingSuccessMessageAndSaveTheOrderID(String expsuccessbooking) {

		Assert.assertTrue("verify the booking success message",
				pom.getBookingConfirmPage().bookedhoteltxt().contains(expsuccessbooking));
		pom.getBookingConfirmPage().orderid();
	}

	@Then("User should verify selected hotel and booked hotel is same or not")
	public void userShouldVerifySelectedHotelAndBookedHotelIsSameOrNot() {
	
	Assert.assertTrue("verify the select hotel is booked or not",SelectHotelPage.hotelName.contains(pom.getBookingConfirmPage().confirmedhotel()));	

	}
	

	@When("User click the next button")
	public void userClickTheNextButton() {

		pom.getBookHotelPage().clickrequestNextbtn();
	
	}



	@When("User click the GST next button")
	public void userClickTheGSTNextButton() {

		pom.getBookHotelPage().clickGSTNextntn();
	
	}
	

	@When("User click Credit card")
	public void userClickCreditCard() {

	pom.getBookHotelPage().clickCard();
	
	}
	@When("User click Submit button without entering any Card details")
	public void userClickSubmitButtonWithoutEnteringAnyCardDetails() {

	pom.getBookHotelPage().clickSubmitbtn();
	
	}

	@Then("User should verify the Error message after click the Submit button {string},{string},{string},{string},{string}, and {string}")
	public void userShouldVerifyTheErrorMessageAfterClickTheSubmitButtonAnd(String paymentType, String cardType, String cardNo, String cardName, String expirMonth, String cardCVV) {

		Assert.assertEquals("verify the Payment Type Error Message",pom.getBookHotelPage().paymenttypeErrormsg(),paymentType);
		Assert.assertEquals("verify the Payment Type Error Message",pom.getBookHotelPage().cardtypeErrormsg(),cardType);
		Assert.assertEquals("verify the Payment Type Error Message",pom.getBookHotelPage().cardnoErrormsg(),cardNo);
		Assert.assertEquals("verify the Payment Type Error Message",pom.getBookHotelPage().cardnameErrormsg(),cardName);
		Assert.assertEquals("verify the Payment Type Error Message",pom.getBookHotelPage().cardexpirydateErrormsg(),expirMonth);
		Assert.assertEquals("verify the Payment Type Error Message",pom.getBookHotelPage().cardcvvErrormsg(),cardCVV);		
	
	}

	@When("User add UPI details {string}")
	public void userAddUPIDetails(String upiID) {

		pom.getBookHotelPage().enterupiID(upiID);
	
	}
	
	@When("User click UPI")
	public void userClickUPI() {

		pom.getBookHotelPage().clickUPI();
	
	}
	
	@When("User cick Submit button")
	public void userCickSubmitButton() {

	pom.getBookHotelPage().clickSubmitbtn();
	
	}

	@Then("User should verify Error message after click the Submit button of UPI {string}")
	public void userShouldVerifyErrorMessageAfterClickTheSubmitButtonOfUPI(String expErrormsg) {

	Assert.assertEquals("verify the UPI Error Message",pom.getBookHotelPage().upiErrortext(),expErrormsg);
	
	}











}
