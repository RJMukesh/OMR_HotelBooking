package com.omrbranch.pagemanager;

import com.omrbranch.page.BookHotelPage;
import com.omrbranch.page.BookingConfirmPage;
import com.omrbranch.page.LoginPage;
import com.omrbranch.page.MyBookingPage;
import com.omrbranch.page.SearchHotelPage;
import com.omrbranch.page.SelectHotelPage;

public class PageObjectManager {

	private LoginPage loginPage;
	
	private SearchHotelPage searchHotelPage;
	
	private SelectHotelPage selectHotelPage;
	
	private BookHotelPage bookHotelPage;
	
	private BookingConfirmPage bookingConfirmPage;
	
	private MyBookingPage myBookingPage;

	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage = new LoginPage():loginPage;
	}

	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)?searchHotelPage = new SearchHotelPage():searchHotelPage;
	}

	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage = new SelectHotelPage():selectHotelPage;
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage = new BookHotelPage():bookHotelPage;
	}

	public BookingConfirmPage getBookingConfirmPage() {
		return (bookingConfirmPage==null)?bookingConfirmPage = new BookingConfirmPage():bookingConfirmPage;
	}

	public MyBookingPage getMyBookingPage() {
		return (myBookingPage==null)?myBookingPage = new MyBookingPage():myBookingPage;
	}
	
	 
}
