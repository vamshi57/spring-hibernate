package com.vamshi.jtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.vamshi.test.GradleTest;

public class GradleJTest {
	@Test
	public void testPositive() {
		int expected=300;
		int actual=new GradleTest().add(100,200);
		assertEquals("test positive", expected, actual);
	}

}
