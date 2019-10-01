package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_foo1 {
	
	@Test
	public void testPath1() {		
		// P: 1-3
		float x = 1.0f, y = 1.0f, expected = y/x;
		executeTest(x, y, expected);
	}

	@Test
	public void testPath2() {		
		// P: 1-2-3
		float x = 5.1f, y = 1.0f, expected = y/(x+10);
		executeTest(x, y, expected);
	}
	
	private void executeTest(float x, float y, float expected) {
		
		Exercises exercises = new Exercises();
		float result = exercises.foo1(x, y);
		assertEquals(result, expected, 0.0f);
	}
}
