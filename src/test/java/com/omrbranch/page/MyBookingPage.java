package com.omrbranch.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class MyBookingPage extends BaseClass {
	
	public MyBookingPage() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//div[@class='col-md-5']")
	private WebElement txtBookingsPage;
	
	@FindBy(name="search")
	private WebElement txtSearch;
	
	@FindBy(xpath="(//div[@class='room-code']//span)[1]")
	private WebElement txtBookingIdSearch;
	
	@FindBy(xpath = "//h5[text()='Hyatt Regency Chennai Deluxe']")
	private WebElement txtBookingHotelSearch;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement txtBookingPrice;
	
	@FindBy(xpath="//button[text()='Edit']")
	private WebElement btnEdit;
	
	@FindBy(name="check_in")
	private WebElement dropdownCheckInModify;
	
	@FindBy(xpath="//a[text()='30']")
	private WebElement txtCheckInDateModify;
	
	@FindBy(xpath="//button[text()='Confirm']")
	private WebElement btnConfirm;
	
	@FindBy(xpath="//li[@class='alertMsg']")
	private WebElement alertMsg;
	
	@FindBy(xpath="//div[@class='col-md-5']")
	private WebElement txtBookingsPage1;
	
	@FindBy(name="search")
	private WebElement txtSearch1;
	
	@FindBy(xpath="//div[@class='room-code']")
	private WebElement txtBookingIdSearch1;
	
	@FindBy(xpath="//h5[text()='Hyatt Regency Chennai Deluxe']")
	private WebElement txtBookingHotelSearch1;
	
	@FindBy(xpath="//strong[@class='total-prize']")
	private WebElement txtBookingPrice1;
	
	@FindBy(xpath="//a[@class='cancle btn filter_btn']")
	private WebElement btnCancel;
	
	@FindBy(xpath="//li[@class='alertMsg']")
	private WebElement alertMsg1;

	

	public WebElement getTxtBookingsPage() {
		return txtBookingsPage;
	}

	public WebElement getTxtSearch() {
		return txtSearch;
	}

	public WebElement getTxtBookingIdSearch() {
		return txtBookingIdSearch;
	}

	public WebElement getTxtBookingHotelSearch() {
		return txtBookingHotelSearch;
	}

	public WebElement getTxtBookingPrice() {
		return txtBookingPrice;
	}

	public WebElement getBtnEdit() {
		return btnEdit;
	}

	public WebElement getDropdownCheckInModify() {
		return dropdownCheckInModify;
	}

	public WebElement getTxtCheckInDateModify() {
		return txtCheckInDateModify;
	}

	public WebElement getBtnConfirm() {
		return btnConfirm;
	}

	public WebElement getAlertMsg() {
		return alertMsg;
	}

	public WebElement getTxtBookingsPage1() {
		return txtBookingsPage1;
	}

	public WebElement getTxtSearch1() {
		return txtSearch1;
	}

	public WebElement getTxtBookingIdSearch1() {
		return txtBookingIdSearch1;
	}

	public WebElement getTxtBookingHotelSearch1() {
		return txtBookingHotelSearch1;
	}

	public WebElement getTxtBookingPrice1() {
		return txtBookingPrice1;
	}

	public WebElement getBtnCancel() {
		return btnCancel;
	}

	public WebElement getAlertMsg1() {
		return alertMsg1;
	}
	
	public String bookingsSuccessmsgtxt() {

	return	 elementGetText(txtBookingsPage);
	
	}
	
	public void searchOrderId() {

		elementSendKeysEnter(txtSearch,BookingConfirmPage.orderID);
		
	}
	
	public String verifyOrderID() {

		return elementGetText(txtBookingIdSearch);
	}
	

	public String verifyhotelname() {

		return elementGetText(txtBookingHotelSearch);
	}
	
	public String verifyhotleprice() {

		 String e = elementGetText(txtBookingPrice);
		 
		 String substring2 = e.substring(3);
		return substring2;
	}
	
	public void dateModify(String modifyDate) throws InterruptedException {

		elementClick(btnEdit);
		elementSendKeysJs(dropdownCheckInModify, modifyDate);
		elementClick(btnConfirm);
	}
	
	public String alertSuccessmsgTxt() {
		
		return elementGetText(alertMsg);

		
		
	}
	
	public void cancelBookingalert() {

		elementClick(btnCancel);
		
		okAlert();
	}
	
	public String verifyCancleBookingMsg() {

	return elementGetText(alertMsg1);
		
	}
	
	
}
