package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Test_maxAbsolute {

	// OSCAR: La complejidad ciclomática es 4. Sobra un caso de prueba
	
	private Exercises exercises;

	@Before
	public void setUp() {

		exercises = new Exercises();
	}

	@Test
	public void testPath1() {		

		int[] numbers = { 1, 2, 3, 4, 5, 6};
		executeTest(numbers, -1);
	}

	@Test
	public void testPath2() {		

		int[] numbers = { 1, -20, 3, 4, 5};
		executeTest(numbers, 20);
	}

	@Test
	public void testPath3() {		

		int[] numbers = { 1, 2, 3, 4, 5};
		executeTest(numbers, 5);
	}

	@Ignore
	@Test
	public void testPath4() {		

		executeTest(new int[0], 0);
	}

	@Test(expected = NullPointerException.class)
	public void testPath5() {		

		exercises.maxAbsolute(null);
	}

	private void executeTest(int[] numbers, int expected) {

		int result = exercises.maxAbsolute(numbers);
		assertEquals(expected, result);
	}
}
