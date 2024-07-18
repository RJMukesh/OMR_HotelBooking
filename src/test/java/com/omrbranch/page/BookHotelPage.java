package com.omrbranch.page;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//h2[@class='px-3 py-2']")
	private WebElement bookhoteltxt;

	@FindBy(id = "own")
	private WebElement myselfradiobtn;

	@FindBy(xpath = "//select[@class='form-control']")
	private WebElement mrdropdown;

	@FindBy(name = "first_name")
	private WebElement txtFirstName;

	@FindBy(name = "last_name")
	private WebElement txtLastName;

	@FindBy(name = "phone")
	private WebElement txtMobileNo;

	@FindBy(name = "email")
	private WebElement txtEmail;

	@FindBy(id = "gst")
	private WebElement gstradiobtn;

	@FindBy(name = "registration")
	private WebElement txtregistrationNo;

	@FindBy(name = "company_name")
	private WebElement txtcompanyName;

	@FindBy(name = "company_address")
	private WebElement txtcompanyAddress;

	@FindBy(id = "step1next")
	private WebElement nextbtn;

	@FindBy(id = "late")
	private WebElement latecheckoutRadiobtn;

	@FindBy(name = "other_request")
	private WebElement txtotherRequest;

	@FindBy(id = "step2next")
	private WebElement nextbtn1;

	@FindBy(xpath = "//div[@class='credit-card pm']")
	private WebElement card;

	@FindBy(name = "payment_type")
	private WebElement paymenttypedropdown;

	@FindBy(id = "card_type")
	private WebElement cardtypedropdown;

	@FindBy(id = "card_no")
	private WebElement txtcardNo;

	@FindBy(id = "card_name")
	private WebElement txtcardName;

	@FindBy(id = "card_month")
	private WebElement cardmonthdropdown;

	@FindBy(id = "card_year")
	private WebElement cardyeardropdown;

	@FindBy(name = "cvv")
	private WebElement txtcvv;

	@FindBy(xpath = "//button[@class='btn filter_btn']")
	private WebElement submitbtn;
	
	@FindBy(id="invalid-payment_type")
	private WebElement txtPaymentTypeErrormsg;
	
	@FindBy(id="invalid-card_type")
	private WebElement txtCardTypeErrormsg;
	
	@FindBy(id="invalid-card_no")
	private WebElement txtCardNoErrormsg;
	
	@FindBy(id="invalid-card_name")
	private WebElement txtCardNameErrormsg;
	
	@FindBy(id="invalid-card_month")
	private WebElement txtCardMonthErrormsg;
	
	@FindBy(id="invalid-cvv")
	private WebElement txtCardCvvErrormsg;
	
	@FindBy(xpath = "//div[@class='upi pm']")
	private WebElement upibtn;
	
	@FindBy(id = "upi_id")
	private WebElement upitxt;
	
	@FindBy(id = "invalid-upi")
	private WebElement upierrortxt;
	

	
	public WebElement getUpierrortxt() {
		return upierrortxt;
	}

	public WebElement getUpibtn() {
		return upibtn;
	}

	public WebElement getUpitxt() {
		return upitxt;
	}

	public WebElement getTxtPaymentTypeErrormsg() {
		return txtPaymentTypeErrormsg;
	}

	public WebElement getTxtCardTypeErrormsg() {
		return txtCardTypeErrormsg;
	}

	public WebElement getTxtCardNoErrormsg() {
		return txtCardNoErrormsg;
	}

	public WebElement getTxtCardNameErrormsg() {
		return txtCardNameErrormsg;
	}

	public WebElement getTxtCardMonthErrormsg() {
		return txtCardMonthErrormsg;
	}

	public WebElement getTxtCardCvvErrormsg() {
		return txtCardCvvErrormsg;
	}

	public WebElement getBookhoteltxt() {
		return bookhoteltxt;
	}

	public WebElement getMyselfradiobtn() {
		return myselfradiobtn;
	}

	public WebElement getMrdropdown() {
		return mrdropdown;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtMobileNo() {
		return txtMobileNo;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getGstradiobtn() {
		return gstradiobtn;
	}

	public WebElement getTxtregistrationNo() {
		return txtregistrationNo;
	}

	public WebElement getTxtcompanyName() {
		return txtcompanyName;
	}

	public WebElement getTxtcompanyAddress() {
		return txtcompanyAddress;
	}

	public WebElement getNextbtn() {
		return nextbtn;
	}

	public WebElement getLatecheckoutRadiobtn() {
		return latecheckoutRadiobtn;
	}

	public WebElement getTxtotherRequest() {
		return txtotherRequest;
	}

	public WebElement getNextbtn1() {
		return nextbtn1;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getPaymenttypedropdown() {
		return paymenttypedropdown;
	}

	public WebElement getCardtypedropdown() {
		return cardtypedropdown;
	}

	public WebElement getTxtcardNo() {
		return txtcardNo;
	}

	public WebElement getTxtcardName() {
		return txtcardName;
	}

	public WebElement getCardmonthdropdown() {
		return cardmonthdropdown;
	}

	public WebElement getCardyeardropdown() {
		return cardyeardropdown;
	}

	public WebElement getTxtcvv() {
		return txtcvv;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public String verifySuccessBookHotelMsg() {

		return elementGetText(bookhoteltxt);

	}

	public void addGuestDetails(String selectSalutation, String firstName, String lateName, String mobileNo,
			String email) throws InterruptedException {

		try {
			elementClick(myselfradiobtn);

		} catch (Exception e) {

			if (myselfradiobtn.isSelected()) {
				elementClick(myselfradiobtn);

			} else {
				elementClick(myselfradiobtn);

			}
		}

		selectOptionByText(mrdropdown, selectSalutation);
		elementSendKeys(txtFirstName, firstName);
		elementSendKeys(txtLastName, lateName);
		elementSendKeys(txtMobileNo, mobileNo);
		elementSendKeys(txtEmail, email);

	}

	public void addGstDetails(String registrationNo, String companyName, String companyAddress)
			throws InterruptedException {

		elementClick(gstradiobtn);

		elementSendKeys(txtregistrationNo, registrationNo);
		elementSendKeys(txtcompanyName, companyName);
		elementSendKeys(txtcompanyAddress, companyAddress);
		elementClick(nextbtn);
	}

	public void addSpecialRequest(String specialrequest) throws InterruptedException {
		Thread.sleep(2000);

		elementClick(latecheckoutRadiobtn);

		elementSendKeys(txtotherRequest, specialrequest);

		elementClick(nextbtn1);

	}

	public void addPaymentDetails(String paymentType, io.cucumber.datatable.DataTable dataTable)
			throws InterruptedException {
		Thread.sleep(2000);

		List<Map<String, String>> cd = dataTable.asMaps();
		Map<String, String> map = cd.get(0);
		String selectcard = map.get("Select Card");
		String cardno = map.get("Card No");
		String cardname = map.get("Card Name");
		String expmonth = map.get("Month");
		String expyear = map.get("Year");
		String cvv = map.get("CVV");

		elementClick(card);

		selectOptionByText(paymenttypedropdown, paymentType);
		selectOptionByText(cardtypedropdown, selectcard);
		elementSendKeys(txtcardNo, cardno);
		elementSendKeys(txtcardName, cardname);
		selectOptionByText(cardmonthdropdown, expmonth);
		selectOptionByText(cardyeardropdown, expyear);
		elementSendKeys(txtcvv, cvv);

		elementClick(submitbtn);

	}

	public void clickrequestNextbtn() {

		elementClick(nextbtn1);

	}

	public void clickGSTNextntn() {

		elementClick(nextbtn);
	}

	public void clickCard() {

		elementClick(card);
		
	}
	
	public void clickSubmitbtn() {

		elementClick(submitbtn);
		
	}
	public String paymenttypeErrormsg() {

		return elementGetText(txtPaymentTypeErrormsg);
	}
	
	public String cardtypeErrormsg() {

		return elementGetText(txtCardTypeErrormsg);
	}
	
	public String cardnoErrormsg() {

		return elementGetText(txtCardNoErrormsg);
	}
	
	public String cardnameErrormsg() {

		return elementGetText(txtCardNameErrormsg);
	}
	
	
	public String cardexpirydateErrormsg() {

		return elementGetText(txtCardMonthErrormsg);
	}
	
	
	public String cardcvvErrormsg() {

		return elementGetText(txtCardCvvErrormsg);
	}
	
	public void enterupiID(String upiID) {
		
		elementClick(upibtn);
		elementSendKeys(upitxt, upiID);
		elementClick(submitbtn);

		
	}
	
	public void clickUPI() {

		elementClick(upibtn);
		
	}
	
	public String upiErrortext() {

		return elementGetText(upierrortxt);
	}
	
	
	
	
}
