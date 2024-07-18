package com.omrbranch.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookingConfirmPage extends BaseClass {
	
	public static String orderID;
	
	
	public BookingConfirmPage() {

		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath = "//h2[@name='booking-code']//strong")
	private WebElement bookingIdtxt;
	
	@FindBy(name = "booking-code")
	private WebElement txtbooking;
	
	@FindBy(xpath = "//strong[text()='Hyatt Regency Chennai']")
	private WebElement txtBookingHotel;
	
	@FindBy(xpath = "//button[text()='My Booking']")
	private WebElement btnMyBooking;

	public WebElement getTxtbooking() {
		return txtbooking;
	}

	public WebElement getBookingIdtxt() {
		return bookingIdtxt;
	}

	public WebElement getTxtBookingHotel() {
		return txtBookingHotel;
	}

	public WebElement getBtnMyBooking() {
		return btnMyBooking;
	}
	
	
	public String orderid() {

		return orderID = elementGetText(bookingIdtxt);
	}

	
	public String bookedhoteltxt() {

		String s = elementGetText(txtbooking);
		return s;
	}
	
	public String confirmedhotel() {

		String elementGetText = elementGetText(txtBookingHotel);
		return elementGetText;
	}
	
	public void myBookingbtn() {

		elementClick(btnMyBooking);
	}
	
}
