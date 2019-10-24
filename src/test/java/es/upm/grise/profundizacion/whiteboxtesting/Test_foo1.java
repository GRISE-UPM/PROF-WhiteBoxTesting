package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test_foo1 {

	private Exercises exercises;

	@Before
	public void setUp() {

		exercises = new Exercises();
	}

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

	// OSCAR: No es habitual delegar la ejecución del test. En este caso es desde luego
	// innecesario, aunque no niego que incluir helpers puede ayudar en otras circunstancias
	private void executeTest(float x, float y, float expected) {

		float result = exercises.foo1(x, y);
		assertEquals(expected, result, 0.0f);
	}
}
