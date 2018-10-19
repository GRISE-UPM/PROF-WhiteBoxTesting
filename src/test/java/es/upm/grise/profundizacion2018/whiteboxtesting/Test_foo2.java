package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	Exercises ex = new Exercises();
	
	@Test
	public void aIsGreaterThanBAndCosAisLessThan0() {
		float a = 5; // cos = 0.28
		float b = 2; // cos = -0.41
		float actual = ex.foo2(a, b);
		float expected = 2;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual, 0.01);
	}

}
