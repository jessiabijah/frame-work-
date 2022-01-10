package org.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Driver;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.compress.archivers.dump.DumpArchiveEntry.TYPE;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static Actions a;
	public static Robot r;

	public static void OpenChromeBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	public static void OpenFireFox() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();

	}

	public static void maxwindow() {
		driver.manage().window().maximize();

	}

	public static void toFetchTitle() {
		String titleName = driver.getTitle();
		System.out.println(titleName);

	}

	public static void toFetchUrl() {
		String Url = driver.getCurrentUrl();
		System.out.println(Url);
	}

	public static void closeBrowser() {
		driver.quit();

	}

	public static void toFillTextBox(WebElement element, String data) {
		element.sendKeys(data);

	}

	public static void holdProgram(int time) throws InterruptedException {
		Thread.sleep(time);

	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void toClickButton(WebElement ref) {
		ref.click();

	}

	public static void applyImplicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void toDoubleClick(WebElement element) {
		a = new Actions(driver);
		a.doubleClick(element).perform();

	}

	public static void toRightClick(WebElement ref) {
		a = new Actions(driver);
		a.contextClick(ref).perform();
	}

	public static void copy(File scr, File desc) throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);

	}

	public static void paste() throws AWTException {
		r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

	}

	public void toGetDateAndTime() {
		Date d = new Date();
		System.out.println(d);
	}

	public void takeSnap() {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File scr = tk.getScreenshotAs(OutputType.FILE);
	}
}
