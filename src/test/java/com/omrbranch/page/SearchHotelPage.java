package com.omrbranch.page;

import java.util.Iterator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[@data-testid='username']")
	private WebElement loginsuccessmsgtxt;

	@FindBy(name = "state")
	private WebElement statedropdown;

	@FindBy(id = "city")
	private WebElement citydropdown;

	@FindBy(id = "room_type")
	private WebElement roomtypedropdown;

	@FindBy(name = "check_in")
	private WebElement checkindate;

	@FindBy(name = "check_out")
	private WebElement checkoutdate;

	@FindBy(id = "no_rooms")
	private WebElement noroomsdropdown;

	@FindBy(id = "no_adults")
	private WebElement noadultdropdown;

	@FindBy(id = "no_child")
	private WebElement nochilddropdown;

	@FindBy(xpath = "//button[text()='Search']")
	private WebElement searchbtn;

	@FindBy(xpath = "//h5[@class='font35 font-weight-bold mb-4']")
	private WebElement searchHotelmsgtxt;

	@FindBy(id = "invalid-state")
	private WebElement txtstateErrormsg;

	@FindBy(id = "invalid-city")
	private WebElement txtcityErrormsg;

	@FindBy(id = "invalid-check_in")
	private WebElement txtcheckinErrormsg;

	@FindBy(id = "invalid-check_out")
	private WebElement txtcheckoutErrormsg;

	@FindBy(id = "invalid-no_rooms")
	private WebElement txtNoRoomsErrormsg;

	@FindBy(id = "invalid-no_adults")
	private WebElement txtNoAdultsErrormsg;

	public WebElement getTxtstateErrormsg() {
		return txtstateErrormsg;
	}

	public WebElement getTxtcityErrormsg() {
		return txtcityErrormsg;
	}

	public WebElement getTxtcheckinErrormsg() {
		return txtcheckinErrormsg;
	}

	public WebElement getTxtcheckoutErrormsg() {
		return txtcheckoutErrormsg;
	}

	public WebElement getTxtNoRoomsErrormsg() {
		return txtNoRoomsErrormsg;
	}

	public WebElement getTxtNoAdultsErrormsg() {
		return txtNoAdultsErrormsg;
	}

	public WebElement getSearchHotelmsgtxt() {
		return searchHotelmsgtxt;
	}

	public WebElement getLoginsuccessmsgtxt() {
		return loginsuccessmsgtxt;
	}

	public WebElement getStatedropdown() {
		return statedropdown;
	}

	public WebElement getCitydropdown() {
		return citydropdown;
	}

	public WebElement getRoomtypedropdown() {
		return roomtypedropdown;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getNoroomsdropdown() {
		return noroomsdropdown;
	}

	public WebElement getNoadultdropdown() {
		return noadultdropdown;
	}

	public WebElement getNochilddropdown() {
		return nochilddropdown;
	}

	public WebElement getSearchbtn() {
		return searchbtn;
	}

	public String getLoginSuccessMsgText() {

		return elementGetText(loginsuccessmsgtxt);

	}

	public void searchHotelwithAllFields(String state, String city, String roomType, String checkIn, String checkout,
			String noOfRooms, String noOfAdults, String noOfChildern) throws InterruptedException {

		selectOptionByText(statedropdown, state);
		selectOptionByText(citydropdown, city);
//		selectOptionByText(roomtypedropdown, roomType);
    	selectroom(roomType);
		elementSendKeysJs(checkindate, checkIn);
		elementSendKeysJs(checkoutdate, checkout);
		selectOptionByText(noroomsdropdown, noOfRooms);
		selectOptionByText(noadultdropdown, noOfAdults);
		elementSendKeys(nochilddropdown, noOfChildern);

	}

	public void clickSearchbutton() {

		switchFrameId("hotelsearch_iframe");

		elementClick(searchbtn);

		switchcontrolto();
	}

	public String verifySearchHotelMessage() {

		return elementGetText(searchHotelmsgtxt);

	}

	public void searchHotelwithMandatoryFields(String state, String city, String checkIn, String checkout,
			String noofRooms, String noofAdults) {

		selectOptionByText(statedropdown, state);
		selectOptionByText(citydropdown, city);
		elementSendKeysJs(checkindate, checkIn);
		elementSendKeysJs(checkoutdate, checkout);
		selectOptionByText(noroomsdropdown, noofRooms);
		selectOptionByText(noadultdropdown, noofAdults);

	}

	public String stateErrorMsg() {

		return elementGetText(txtstateErrormsg);

	}

	public String cityErrorMsg() {

		return elementGetText(txtcityErrormsg);

	}

	public String checkInErrorMsg() {

		return elementGetText(txtcheckinErrormsg);

	}

	public String checkoutErrorMsg() {

		return elementGetText(txtcheckoutErrormsg);

	}

	public String noOfRoomsErrorMsg() {

		return elementGetText(txtNoRoomsErrormsg);

	}

	public String noOfAdultsErrorMsg() {

		return elementGetText(txtNoAdultsErrormsg);

	}

	public void selectroom(String roomtypes) {

		String[] k = roomtypes.split("/");
		for (String v : k) {
			selectOptionByText(roomtypedropdown, v);

		}

	}

}
