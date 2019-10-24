package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

// OSCAR: La complejidad ciclomática es 4. Sobran dos casos de prueba

public class Test_foo2 {

	private Exercises exercises;

	@Before
	public void setUp() {

		exercises = new Exercises();
	}

	@Test
	public void testPath1() {
		// P: 1-3-4-6
		float a = 1.5f, b = 2.0f, expected = (1.5f + 2.0f)/2;
		executeTest(a, b, expected);
	}

	@Test
	public void testPath2() {
		// P: 1-3-4-5-6
		float a = 1.0f, b = 1.0f, expected = (1 + 3)/2;
		executeTest(a, b, expected);
	}
	

	@Ignore
	@Test
	public void testPath3() {
		// P: 1-3-5-6
		float a = 2.0f, b = 3.0f, expected = (1 + 3)/2;
		executeTest(a, b, expected);
	}

	@Test
	public void testPath4() {
		// P: 1-2-3-4-6
		float a = 2.0f, b = 1.0f, expected = (a + b)/2;
		executeTest(a, b, expected);
	}

	@Ignore
	@Test
	public void testPath5() {
		// P: 1-2-3-4-5-6
		float a = 1.5f, b = 1.0f, expected = (1 + 3)/2;
		executeTest(a, b, expected);
	}

	@Test
	public void testPath6() {
		// P: 1-2-3-5-7
		float a = 3.0f, b = 2.0f, expected = (1 + 3)/2;
		executeTest(a, b, expected);
	}

	private void executeTest(float a, float b, float expected) {

		float result = exercises.foo2(a, b);
		assertEquals(expected, result,0.0f);
	}
}
