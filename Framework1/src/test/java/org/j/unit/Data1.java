package org.j.unit;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data1 {
	static WebDriver driver;

	@BeforeClass
	public static void befCls() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
	}

	@After
	public  void aft() {
		Date d = new Date();
		System.out.println(d);
	}

	@Before
	public  void bef() {
		Date d = new Date();
		System.out.println(d);
	}

	@Test
	public void tc2() {
		String s = driver.getCurrentUrl();
		System.out.println(s);
	}

	@Test
	public void tc3() {
		String s1 = driver.getTitle();
		System.out.println(s1);
	}

	@Test
	public void tc1() {
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("jessiabijah@gmail.com");
		WebElement txtpass = driver.findElement(By.id("pass"));
		txtpass.sendKeys("1234567");
		WebElement btnLogin = driver.findElement(By.name("login"));
		btnLogin.click();

	}
	@AfterClass
	public static void aftCls() {
		driver.quit();

	}
}
