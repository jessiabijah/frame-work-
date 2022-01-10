package org.j.unit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class Greens {
	@Test
	public void tc2() {
		Assert.assertTrue("check tc2", false);
		System.out.println("test t2");
	}

	@Ignore
	public void tc1() {
		Assert.assertTrue("check tc1", true);
		System.out.println("test t1");
	}

	@Test
	public void tc3() {
		Assert.assertTrue("check tc3", true);
		System.out.println("test 3");
	}
}
