package org.locator;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Report1 extends BaseClass {
	public static void main(String[] args) {
		OpenChromeBrowser();
		launchUrl("https://en-gb.facebook.com/");
		maxwindow();
		FbLoginPojo l=new FbLoginPojo();
		WebElement txtemail =l.getTxtEmail();
		toFillTextBox(txtemail, "jessi@gmail.com");
		WebElement txtpass =l.getTxtpass();
		toFillTextBox(txtpass, "123567");
		driver.navigate().refresh();
		toFillTextBox(txtemail, "abijah");
	}
	}



