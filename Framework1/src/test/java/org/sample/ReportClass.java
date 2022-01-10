package org.sample;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class ReportClass extends BaseClass {
public static void main(String[] args) throws InterruptedException {
	OpenChromeBrowser();
	OpenFireFox();
	launchUrl("https://www.facebook.com/");
	maxwindow();
	WebElement txtEmail =driver.findElement(By.id("email"));
	toFillTextBox(txtEmail, "jessiabijah@gmail.com");
	WebElement txtpass =driver.findElement(By.id("pass"));
	toFillTextBox(txtpass,"1234567");
	WebElement btnlogin=driver.findElement(By.name("login"));
	toClickButton(btnlogin);
	holdProgram(6000);
	toFetchUrl();
	
}
}

