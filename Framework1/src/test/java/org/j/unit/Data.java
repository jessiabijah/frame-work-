package org.j.unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class Data {
	@BeforeClass
	public static void befcls() {
		System.out.println("Started");
	}
	@AfterClass
	public static void aftcls() {
	System.out.println("ended");
	}
	@Test
	public void tc2() {
		System.out.println("Test case tc2");
	}
	@Ignore
	@Test
	public void tc3() {
		System.out.println("Test case tc3");

	}
	@Test
	public void tc1() {
	System.out.println("Test case tc1");

	}
	@After
	public void aft1() {
	System.out.println("Tc Ends");	

	}
	@Before
	public void bef1() {
		System.out.println("Tc Starts");

	}
		
}
