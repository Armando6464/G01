package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Sum;

public class TestSum {

	
	@Test
	public void testSum2Modificadoo1() {
		assertEquals(6, Sum.sum(3, 3));
	}
	
	@Test(expected=AssertionError.class)
	public void testSum2Fail() {
		assertEquals(5, Sum.sum(3, 3));
	}
	
	@Test
	public void testSum3() {
		assertEquals(3, Sum.sum(1, 1, 1));
	}
	
	@Test(expected=AssertionError.class)
	public void testSum3Fail() {
		assertEquals(3, Sum.sum(1, 1, 2));
	}
	
	@Test
	public void testSumNegative() {
		assertEquals(-6, Sum.sum(-2, -4));
	}
	
	@Test(expected=AssertionError.class)
	public void testSumNegativeFail() {
		assertEquals(6, Sum.sum(-2, -4));
	}
	
	@Test
	public void testSumZero() {
		assertEquals(2, Sum.sum(2, 0));
	}
	
	@Test(expected=AssertionError.class)
	public void testSumZeroFail() {
		assertEquals(3, Sum.sum(2, 0));
	}
}