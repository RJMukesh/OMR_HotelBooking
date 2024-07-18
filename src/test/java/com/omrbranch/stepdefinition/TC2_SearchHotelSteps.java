package com.omrbranch.stepdefinition;

import org.junit.Assert;

import com.omrbranch.baseclass.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelSteps extends BaseClass {
	
	PageObjectManager pom = new PageObjectManager();

	@When("User select hotel {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_select_hotel_and(String state, String city, String roomType, String checkIn, String checkout, String noOfRooms, String noOfAdults, String noOfChildern) throws InterruptedException {

	  pom.getSearchHotelPage().searchHotelwithAllFields(state, city, roomType, checkIn, checkout, noOfRooms, noOfAdults, noOfChildern);
	  pom.getSearchHotelPage().clickSearchbutton();
		
	}
	@Then("User should verify after search hotel Success message {string}")
	public void user_should_verify_after_search_hotel_success_message(String expSearchHotelMsg) {

		Assert.assertEquals(expSearchHotelMsg, pom.getSearchHotelPage().verifySearchHotelMessage());
	
	}

	@When("User select hotel {string},{string},{string},{string},{string} and {string}")
	public void user_select_hotel_and(String state, String city, String checkIn, String checkout, String noofRooms, String noofAdults) {

		pom.getSearchHotelPage().searchHotelwithMandatoryFields(state, city, checkIn, checkout, noofRooms, noofAdults);
		pom.getSearchHotelPage().clickSearchbutton();
	
	}
	
	@When("User click Search button")
	public void user_click_search_button() {
		
		pom.getSearchHotelPage().clickSearchbutton();

	}
	

	@Then("User should verify error message after click the Search button {string},{string},{string},{string},{string} and {string}")
	public void userShouldVerifyErrorMessageAfterClickTheSearchButtonAnd(String stateError, String cityError, String checkInError, String checkoutError, String noofRoomsError, String noofAdultsError) {

		Assert.assertEquals("verfying the state error message",stateError,pom.getSearchHotelPage().stateErrorMsg());
		Assert.assertEquals("verfying the city error message",cityError,pom.getSearchHotelPage().cityErrorMsg());
		Assert.assertEquals("verfying the checkin error message",checkInError,pom.getSearchHotelPage().checkInErrorMsg());
		Assert.assertEquals("verfying the checkout error message",checkoutError,pom.getSearchHotelPage().checkoutErrorMsg());
		Assert.assertEquals("verfying the no of Rooms error message",noofRoomsError,pom.getSearchHotelPage().noOfRoomsErrorMsg());
		Assert.assertEquals("verfying the no of Adults error message",noofAdultsError,pom.getSearchHotelPage().noOfAdultsErrorMsg());
	
	}

	@When("User click sort button from Low to High")
	public void userClickSortButtonFromLowToHigh() throws InterruptedException {
		
		pom.getSelectHotelPage().clickPriceLowtoHigh();

	}
	@Then("User should verify after the sorting price listed from Low to High")
	public void userShouldVerifyAfterTheSortingPriceListedFromLowToHigh() {

			Assert.assertTrue("verify the sorting price from low to high",pom.getSelectHotelPage().verifyPriceLowtoHigh());
	
	}
	
	@When("User click sort button from High to Low")
	public void userClickSortButtonFromHighToLow() throws InterruptedException {
	
		pom.getSelectHotelPage().clickPriceHightoLow();
	}
	@Then("User should verify after the sorting price listed from High to Low")
	public void userShouldVerifyAfterTheSortingPriceListedFromHighToLow() {

		Assert.assertTrue("verify the sorting price from high to low",pom.getSelectHotelPage().verifyPriceHightoLow());
	
	}

	@When("User click sort button from Ascending order")
	public void userClickSortButtonFromAscendingOrder() throws InterruptedException {

		pom.getSelectHotelPage().clickNameAscending();
	
	}
	@Then("User should verify after the sorting names listed in Ascending order")
	public void userShouldVerifyAfterTheSortingNamesListedInAscendingOrder() {

	
		Assert.assertTrue("verify the hotel names in Ascending order",pom.getSelectHotelPage().verifyHotelNamesinAscendingorder());
		
	}
	
	@When("User click sort button from Descending order")
	public void userClickSortButtonFromDescendingOrder() throws InterruptedException {

		pom.getSelectHotelPage().clickNameDescending();
	
	}
	@Then("User should verify after the sorting names listed in Descending order")
	public void userShouldVerifyAfterTheSortingNamesListedInDescendingOrder() {
		
		Assert.assertTrue("verify the hotel names in Descending order",pom.getSelectHotelPage().verifyHotelNamesinDescendingorder());

	
	}


	@Then("User should verify Room Types present in header after search hotel {string}")
	public void userShouldVerifyRoomTypesPresentInHeaderAfterSearchHotel(String exproomtypes) {

	Assert.assertEquals("verify Selected Room Types",pom.getSelectHotelPage().verifyselectRoomtypes(),exproomtypes);
	
	}


	@Then("User should verify Select Room Type is ends with Displayed Hotle name {string}")
	public void userShouldVerifySelectRoomTypeIsEndsWithDisplayedHotleName(String exproomtype) {

	Assert.assertFalse("verify the Selected Room Types",pom.getSelectHotelPage().allhotelnamesRoomtype(exproomtype));
	
	}


























}
