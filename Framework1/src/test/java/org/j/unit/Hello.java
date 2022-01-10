package org.j.unit;

import org.junit.Assert;
import org.junit.Test;

public class Hello {
	@Test
	public void tc11() {
		System.out.println("test 11");

	}

	@Test
	public void tc3() {
		Assert.assertTrue(100 < 50);
		System.out.println("test 3");
	}

	@Test
	public void tc22() {
		System.out.println("tc22");

	}
}
