package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReportClass extends BaseClass {
public static void main(String[] args) {
	OpenChromeBrowser();
	launchUrl("https://en-gb.facebook.com/");
	maxwindow();
	WebElement txtemail =driver.findElement(By.id("email"));
	txtemail.sendKeys("jessi@gmail.com");
	WebElement txtpass =driver.findElement(By.id("pass"));
	txtpass.sendKeys("123445");
	driver.navigate().refresh();
	txtemail.sendKeys("abijah");
}
}

