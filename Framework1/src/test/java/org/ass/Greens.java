package org.ass;

import org.junit.Assert;
import org.junit.Test;

public class Greens {
	@Test
	public void tc2() {
		Assert.assertTrue("check tc2", true);
		System.out.println("test tc2");
	}

	@Test
	public void tc3() {
		Assert.assertTrue(true);
		System.out.println("test tc3");
	}

	@Test
	public void tc1() {
		System.out.println("tc1");
		Assert.assertTrue("check tc1", false);
		System.out.println("test tc1");
	}

}
