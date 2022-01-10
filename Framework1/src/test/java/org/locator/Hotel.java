package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel extends BaseClass {
public Hotel() {
	PageFactory.initElements(driver, this);
	//2.private Elements
	@FindBy(id="location") 
	WebElement loc;
	@FindBy(id="hotels")
	WebElement hotels;
	
}
}
