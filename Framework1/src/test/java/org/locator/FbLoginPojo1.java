package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo1 extends BaseClass {
	public FbLoginPojo1() {
		PageFactory.initElements(driver, this);
	}

	// 2.private Elements
	@CacheLookup
	// work like And Operator
	@FindBys({ @FindBy(xpath = "//input[@id='email']"),

			@FindBy(xpath = "//input[@name='email']")

	})

	@FindAll({ @FindBy(xpath = "//input[@id='pass']"),

			@FindBy(xpath = "//input[@name='password']") })
	private WebElement txtpass;
	@FindBy(name = "login")
	private WebElement btnLogin;

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
