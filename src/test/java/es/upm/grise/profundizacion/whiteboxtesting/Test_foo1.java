package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_foo1 {

	private Exercises exercises = new Exercises();
	
	@Test
	public void testXLessOrEqualThanFive() {
		float x1 = 4;
		float x2 = 0;
		float x3 = 5;
		float y = 1;
		
		float res1 = y/x1;
		float res2 = Float.POSITIVE_INFINITY;
		float res3 = y/x3;
				
		assertEquals(res1, exercises.foo1(x1, y), 0.0);
		assertEquals(res2, exercises.foo1(x2, y), 0.0);
		assertEquals(res3, exercises.foo1(x3, y), 0.0);
	}

	
	@Test
	public void testXGreaterThanFive() {
		float X = 6;
		float Y = 1;
		
		float res = Y/(10+X);
				
		assertEquals(res, exercises.foo1(X, Y), 0.0);	
	}
	
	@Test
	public void testYEqualToCero() {
		float x1 = 6;
		float x2 = 4;
		float y = 0;
		
		assertEquals(0, exercises.foo1(x1, y), 0.0);
		assertEquals(0, exercises.foo1(x2, y), 0.0);
	}


}
