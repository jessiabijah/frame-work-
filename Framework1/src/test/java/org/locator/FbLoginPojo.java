package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends BaseClass {
	public FbLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	//2.private Elements
	@FindBy(id="email")
	private WebElement txtEmail;
	@FindBy(id="pass")
	 private WebElement txtpass;
	@FindBy(name="login")
	private WebElement btnLogin;
	
	public WebElement getTxtEmail() {
		return txtEmail;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
