package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	Exercises ex = new Exercises();
	
	// Careful, a & b swaps in this test
	@Test
	public void aIsGreaterThanB_cosAisLessThan0_cosBisMoreThan0() {
		float a = 5; // cos = 0.28
		float b = 2; // cos = -0.41
		float actual = ex.foo2(a, b);
		float expected = 2;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual, 0.01);
	}
	
	@Test 
	public void aIsLowerThanB_cosAIsMoreThan0_cosBisMoreThan0() {
		float a, b;
		a = b = 5; // cos = 0.28
		float actual = ex.foo2(a, b);
		float expected = 2;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual, 0.01);
	}
	
	@Test
	public void aIsLowerThanB_cosAIsMoreThan0_cosBisLessThan0() {
		float a = 5; // cos = 0.28
		float b = 9; // cos = -0.91
		float actual = ex.foo2(a, b);
		float expected = 7;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual, 0.01);
	}
	
}
