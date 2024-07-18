package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.page.BookingConfirmPage;
import com.omrbranch.page.SelectHotelPage;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC6_MyBooking {
	
	PageObjectManager pom = new PageObjectManager();
	

	@When("User navigate to the My Booking page")
	public void userNavigateToTheMyBookingPage() {
		
		pom.getBookingConfirmPage().myBookingbtn();

	}
	@Then("User should verify after the Success message {string}")
	public void userShouldVerifyAfterTheSuccessMessage(String expmessage) {
	
		Assert.assertTrue("verify the Bookings success message",pom.getMyBookingPage().bookingsSuccessmsgtxt().contains(expmessage));
	
	}
	@When
	("User search the OrderID")
	public void userSearchTheOrderID() {

		pom.getMyBookingPage().searchOrderId();
	
	}
	@Then("User should verify after the search OrderID")
	public void userShouldVerifyAfterTheSearchOrderID() {

		Assert.assertEquals("verify the search OrderID",BookingConfirmPage.orderID,pom.getMyBookingPage().verifyOrderID());

		
	}
	@Then("User should verify the Hotel name")
	public void userShouldVerifyTheHotelName() {

		Assert.assertEquals("verify the Hotel name",SelectHotelPage.hotelName,pom.getMyBookingPage().verifyhotelname());
	
		
	}
	@Then("User should verify the Hotel price")
	public void userShouldVerifyTheHotelPrice() {

		Assert.assertTrue("verify the Hotel price",SelectHotelPage.hotelPrice.contains(pom.getMyBookingPage().verifyhotleprice()));
	
	}
	@When("User Modify the check-In date {string}")
	public void userModifyTheCheckInDate(String modifyDate) throws InterruptedException {

	pom.getMyBookingPage().dateModify(modifyDate);
	
	}
	@Then("User should verify after Success message {string}")
	public void userShouldVerifyAfterSuccessMessage(String expSuccessmsg) {

		Assert.assertEquals("verify the Success Message",pom.getMyBookingPage().alertSuccessmsgTxt(),expSuccessmsg);
	
	}
	
	@When("User click Cancle button and accept the Cancle booking alert message")
	public void userClickCancleButtonAndAcceptTheCancleBookingAlertMessage() {

		pom.getMyBookingPage().cancelBookingalert();
	
	}
	@Then("User should verify after Cancel Success message {string}")
	public void userShouldVerifyAfterCancelSuccessMessage(String expalertmessage) {

	Assert.assertEquals("verify the Booking alert Message",pom.getMyBookingPage().verifyCancleBookingMsg(),expalertmessage);
		
	}







}
