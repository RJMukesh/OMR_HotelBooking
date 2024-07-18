package com.omrbranch.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.baseclass.BaseClass;

public class LoginPage extends BaseClass {
	
	public LoginPage() {

		PageFactory.initElements(driver, this);
	
	}

	@FindBy(id="email")
	private WebElement txtEmail;
	
	@FindBy(id="pass")
	private WebElement txtPassword;
	
	@FindBy(xpath = "//button[@value='login']")
	private WebElement loginbtn;
	
	@FindBy(xpath = "//b[contains(text(),'Invalid Login')]")
	private WebElement erroeMsgtxt;
	
	public WebElement getErroeMsgtxt() {
		return erroeMsgtxt;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

	public void login(String emailId,String password) {

		elementSendKeys(txtEmail, emailId);
		elementSendKeys(txtPassword, password);
		elementClick(loginbtn);
	}
	
	public String expectedErrorMessage() {

		String errortxt = elementGetText(erroeMsgtxt);
		return errortxt;
		
	}
	
}
