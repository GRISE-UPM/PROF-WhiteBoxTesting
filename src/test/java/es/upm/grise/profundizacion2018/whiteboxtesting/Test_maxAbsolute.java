package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Complejidad Ciclomática de 4:
 * para los caminos bastarían con 4 tests, 
 * para evaluar todas las condiciones hacen falta 4 tests
 */
public class Test_maxAbsolute {

	private Exercises exercises = new Exercises();
	
	@Test
	public void max_absolute_LengthEquals0() {
		assertEquals((int)exercises.max_absolute(new int[0]), 0);
	}
	
	@Test
	public void max_absolute_LengthGreaterThan5() {
		assertEquals((int)exercises.max_absolute(new int[6]), -1);
	}
	
	@Test
	public void max_absolute_LengthLessOrEqualsThan5AndSecondElementIsMax() {
		assertEquals((int)exercises.max_absolute(new int[] {1, 4, 3, 2}), 4);
	}
	
	@Test
	public void max_absolute_LengthLessOrEqualsThan5AndNegativeElementIsMax() {
		assertEquals((int)exercises.max_absolute(new int[] {-5, 4, 3, 2}), 5);
	}

}
