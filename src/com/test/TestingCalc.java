package com.test;

import com.chanti.Calc;

import junit.framework.TestCase;

public class TestingCalc extends TestCase
{
	public void testSum()
	{
		assertEquals(25, Calc.sum(10, 15));
	}
	public void testSub()
	{
		assertEquals(55, Calc.sub(10, 5));
	}
}
