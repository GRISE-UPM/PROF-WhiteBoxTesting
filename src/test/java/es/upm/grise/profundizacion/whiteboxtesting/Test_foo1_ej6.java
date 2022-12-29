package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1_ej6 {

	private Exercises exercises = new Exercises();
		
	/*
	 * Test the path 1 -> 2 -> 4 -> 5
	 * Condition x > 5
	 */
	@Test
	public void test1() {
		float x = 6;
		float y = 1;
		
		float res = y/(10+x);
				
		assertEquals(res, exercises.foo1(x, y), 0.0);	
	}
		
	
	/*
	 * Test the path 1 -> 2 -> 3 -> 4 -> 5
	 * Condition x <= 5
	 */
	@Test
	public void test2() {
		float x1 = 4;
		float x2 = 5;
		float y = 1;
		
		float res1 = y/x1;
		float res2 = y/x2;
				
		assertEquals(res1, exercises.foo1(x1, y), 0.0);	
		assertEquals(res2, exercises.foo1(x2, y), 0.0);	
	}
	
}
