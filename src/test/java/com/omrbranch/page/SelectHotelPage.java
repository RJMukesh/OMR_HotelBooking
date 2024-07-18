package com.omrbranch.page;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class SelectHotelPage extends BaseClass {
	
	public static String hotelName;
	public static String hotelPrice;
	public static String lastHotelName;
	public static String lastHotelPrice;
	
	public SelectHotelPage() {

		PageFactory.initElements(driver, this);
	
	}
	
	
	@FindBy(xpath = "//label[text()='Price low to high']")
	private WebElement lowtohighRadioBtn;
	
	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> priceAscending;
	
	@FindBy(xpath = "//label[text()='Price High to low']")
	private WebElement hightolowRadioBtn;
	
	@FindBy(xpath = "//strong[@class='total-prize']")
	private List<WebElement> priceDescending;
	
	@FindBy(xpath = "//label[text()='Name Ascending']")
	private WebElement nameAscendingBtn;
	
	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']//child::h5")
	private List<WebElement> nameAscending;
	
	@FindBy(xpath = "//label[text()='Name Descending']")
	private WebElement nameDescendingBtn;
	
	@FindBy(xpath = "//div[@class='col-md-5 hotel-suites']//child::h5")
	private List<WebElement> nameDescending;
	
	@FindBy(xpath = "//h5[@class='font35 font-weight-bold mb-4']")
	private WebElement selecthoteltxt;
	
	@FindBy(xpath = "//h5[text()='Hyatt Regency Chennai Deluxe']")
	private WebElement firsthoteltxt;
	
	@FindBy(xpath = "//strong[@class='total-prize']")
	private WebElement hotelpricetxt;
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement continuebtn;

	@FindBy(xpath = "//a[@id='room_type']")
	private WebElement roomtypestxt;
	
	
	public WebElement getRoomtypestxt() {
		return roomtypestxt;
	}

	public WebElement getNameDescendingBtn() {
		return nameDescendingBtn;
	}

	public List<WebElement> getNameDescending() {
		return nameDescending;
	}

	public WebElement getNameAscendingBtn() {
		return nameAscendingBtn;
	}

	public List<WebElement> getNameAscending() {
		return nameAscending;
	}

	public WebElement getHightolowRadioBtn() {
		return hightolowRadioBtn;
	}

	public List<WebElement> getPriceDescending() {
		return priceDescending;
	}

	public WebElement getLowtohighRadioBtn() {
		return lowtohighRadioBtn;
	}

	public List<WebElement> getPriceAscending() {
		return priceAscending;
	}

	public WebElement getSelecthoteltxt() {
		return selecthoteltxt;
	}

	public WebElement getFirsthoteltxt() {
		return firsthoteltxt;
	}

	public WebElement getHotelpricetxt() {
		return hotelpricetxt;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	public String verifyFirstHotelName() {

		return hotelName = elementGetText(firsthoteltxt);
		
	}
	
	public String verifyFirstHotelPrice() {

		return hotelPrice = elementGetText(hotelpricetxt);
		
	}
	
	
	
	public void clickPriceLowtoHigh() throws InterruptedException {
		
		elementClick(lowtohighRadioBtn);
		Thread.sleep(2000);

	}

	public boolean verifyPriceLowtoHigh() {
		
		
		List<Integer> dev = new ArrayList<>();
		for (WebElement num : priceAscending) {

			String p = num.getText();
			String replace = p.replace("$", "");
			String re = replace.replace(",", "").trim();
			int price = Integer.parseInt(re);
			dev.add(price);
		}
		
		List<Integer>qa = new ArrayList<>();
		qa.addAll(dev);
		
		Collections.sort(qa);
		
		return qa.equals(dev);

	}
	
	public void clickPriceHightoLow() throws InterruptedException {
		
		elementClick(hightolowRadioBtn);
		Thread.sleep(2000);

	}
	
	public boolean verifyPriceHightoLow() {
		
		List<Integer> dev = new ArrayList<>();
		for (WebElement num : priceDescending) {
			
			String p = num.getText();
			String replace = p.replace("$", "");
			String rep = replace.replace(",", "").trim();
			int int1 = Integer.parseInt(rep);
			dev.add(int1);
		}
		
		List<Integer> qa = new ArrayList<>();
		qa.addAll(dev);
		
		Collections.sort(qa);
		Collections.reverse(qa);
		return qa.equals(dev);
		
		

	}
	
	public void clickNameAscending() throws InterruptedException {

		elementClick(nameAscendingBtn);
		Thread.sleep(2000);
	}
	
	
	public boolean verifyHotelNamesinAscendingorder() {
		
		List<String> dev = new ArrayList<>();
		for (WebElement h : nameAscending) {

			String hoteltxt = h.getText();

			dev.add(hoteltxt);
		}
		
		List<String> qa = new ArrayList<>();
		qa.addAll(dev);

		Collections.sort(qa);
		
		return qa.equals(dev);

		
	}
	
	
	public void clickNameDescending() throws InterruptedException {

		elementClick(nameDescendingBtn);
		Thread.sleep(2000);
	}
	
	public boolean verifyHotelNamesinDescendingorder() {
		
       List<String> dev = new ArrayList<>();
		for (WebElement h : nameDescending) {
			
			String hoteltxt = h.getText();
			
			dev.add(hoteltxt);
		}
		
		List<String> qa = new ArrayList<>();
		qa.addAll(dev);
		
		Collections.sort(qa);
		Collections.reverse(qa);
		
		return qa.equals(dev);
		
	}
	
	public void clickFirstHotelContinueBtn() {

		
		elementClick(continuebtn);
		okAlert();
	}
	
public String verifyselectRoomtypes() {
	
	 return elementGetText(roomtypestxt);
		
	}
	
	
public boolean allhotelnamesRoomtype(String roomTypes) {
	
	List<Boolean> r = new ArrayList<>();
	for (WebElement w : nameAscending) {
		
		String text = w.getText();
		boolean endsWith = text.endsWith(roomTypes);
		r.add(endsWith);
		
	}

	 boolean b = r.contains(false);
	 System.out.println(b);
	return b;
	}
	
	
public String lasthotelname() {

	WebElement w = nameAscending.get(nameAscending.size()-1);
	
	 return lastHotelName = w.getText();
	
	
	
}

public String lasthotelprice() {

	WebElement e = priceAscending.get(priceAscending.size()-1);
	
	return lastHotelPrice = e.getText();
	
	
}


public void cancelalert() {

	elementClick(continuebtn);
	
	cancelAlert();
}
	


}
