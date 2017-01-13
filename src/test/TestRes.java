package test;

import static org.junit.Assert.assertEquals;
import main.Res;

import org.junit.Test;

public class TestRes {
	
	
	@Test
	public void testRes2() {
		assertEquals(3, Res.res(5, 2));
	}
	
	@Test(expected=AssertionError.class)
	public void testRes2Fail() {
		assertEquals(4, Res.res(5, 2));
	}
	
	@Test
	public void testRes3() {
		assertEquals(2, Res.res(7, 3, 2));
	}
	
	@Test(expected=AssertionError.class)
	public void testRes3Fail() {
		assertEquals(4, Res.res(7, 3, 2));
	}
	
	@Test
	public void testResNegative() {
		assertEquals(6, Res.res(2, -4));
	}
	
	@Test(expected=AssertionError.class)
	public void testResNegativeFail() {
		assertEquals(-1, Res.res(2, -4));
	}
	
	@Test
	public void testResZero() {
		assertEquals(2, Res.res(2, 0));
	}
	
	@Test(expected=AssertionError.class)
	public void testResZeroFail() {
		assertEquals(3, Res.res(2, 0));
	}

}
