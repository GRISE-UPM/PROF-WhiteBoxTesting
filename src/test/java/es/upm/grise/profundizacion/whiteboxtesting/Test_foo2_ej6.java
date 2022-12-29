package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2_ej6 {

	private Exercises exercises = new Exercises();
	
	
	/*
	 * Test the path 1 -> 2 -> 3 -> 4a -> 4b -> 6
	 * 
	 * Conditions: 
	 *   a > b
	 *   cos(a) <= 0
	 *   cos(b) >= 0
	 */
	@Test
	public void test1() {
		float a = (float) 3;
		float b = (float) 0.5;
		
		float res = (a+b)/2;
		
		assertEquals(res, exercises.foo2(a, b), 0.0);
	}
	
	/*
	 * Test the path 1 -> 2 -> 3 -> 4a -> 4b -> 5 -> 6
	 * 
	 * Conditions: 
	 *   a > b
	 *   cos(a) > 0
	 *   cos(b) >= 0
	 */
	@Test
	public void test2() {
		float a = (float) 0.6;
		float b = (float) 0.5;
		
		float res = (1+3)/2;
		
		assertEquals(res, exercises.foo2(a, b), 0.0);
	}
	
	/*
	 * Test the path 1 -> 2 -> 4a -> 5 -> 6
	 * 
	 * Conditions: 
	 *   a <= b
	 *   cos(a) < 0
	 */
	@Test
	public void test3() {
		float a = (float) 2;
		float b = (float) 2;
		
		float res = (1+3)/2;
		
		assertEquals(res, exercises.foo2(a, b), 0.0);	
	}
	
	
	/*
	 * Test the path 1 -> 2 -> 4a -> 4b -> 5 -> 6
	 * 
	 * Conditions: 
	 *   a <= b
	 *   cos(a) >= 0
	 *   cos(b) > 0
	 */
	@Test
	public void test4() {
		float a = (float) 0.4;
		float b = (float) 0.5;
		
		float res = (1+3)/2;
		
		assertEquals(res, exercises.foo2(a, b), 0.0);
	}
	
}
