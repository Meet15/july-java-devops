package com.flexon.project;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {
	@Test
	public void testSum() {
		System.out.println("sum");
		Integer x=15;
		Integer y=15;
		Integer expResult=30;
		Integer result= Testapp.Sum(x,y);
		assertEquals(expResult,result);
	}
	@Test
	public void testSub() {
		System.out.println("sub");
		Integer x=15;
		Integer y=15;
		Integer expResult=30;
		Integer result= Testapp.Sub(x,y);
		assertEquals(expResult,result);
	}
	@Test
	public void testMul() {
		System.out.println("mul");
		Integer x=15;
		Integer y=15;
		Integer expResult=30;
		Integer result= Testapp.Mul(x,y);
		assertEquals(expResult,result);
	}
	@Test
	public void testDiv() {
		System.out.println("div");
		Integer x=15;
		Integer y=15;
		Integer expResult=30;
		Integer result= Testapp.Div(x,y);
		assertEquals(expResult,result);
	}
	
}
