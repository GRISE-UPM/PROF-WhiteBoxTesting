package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	private Exercises exercises = new Exercises();
	

	@Test
	public void testAGreaterThanB() {
		float a = (float) 0.5;
		float b = (float) 0.4;
		
		float res = (1+3)/2;
		
		assertEquals(res, exercises.foo2(a, b), 0.0);
	}
	

	@Test
	public void testBGreaterThanA() {
		float a = (float) 0.4;
		float b = (float) 0.5;
		
		float res = (1+3)/2;
		
		assertEquals(res, exercises.foo2(a, b), 0.0);
	}
	
	/**
	 * Test fulfilled condition (cos(a) < 0 || cos(b) > 0)
	 */
	@Test
	public void testConditionCosAB() {
		float a = (float) 2;
		float b = (float) 2;
		
		float res = (1+3)/2;
		
		assertEquals(res, exercises.foo2(a, b), 0.0);
	}
	
	/**
	 * Test no fulfilled condition (cos(a) < 0 || cos(b) > 0)
	 */
	@Test
	public void testNoConditionCosAB() {
		float a = (float) 0.5;
		float b = (float) 2;
		
		float res = (a+b)/2;
		
		assertEquals(res, exercises.foo2(a, b), 0.0);
	}
}
