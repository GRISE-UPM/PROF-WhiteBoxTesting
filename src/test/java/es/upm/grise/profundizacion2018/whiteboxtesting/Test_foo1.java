package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.assertEquals;

/**
 * Complejidad Ciclomática de 2: 
 * para los caminos bastarían con 2 tests,
 * para evaluar todas las condiciones hacen falta 2 test
 * (Añadido 1 test extra para la comprobación de dividir por 0)
 */
import org.junit.Test;

public class Test_foo1 {

	private Exercises exercises = new Exercises();
	
	@Test
	public void foo1_XGreaterThan5() {
		assertEquals(exercises.foo1(10, 20), 1, 0);
	}
	
	@Test
	public void foo1_XLowerOrEqualsThan5() {
		assertEquals(exercises.foo1(5, 5), 1, 0);
	}
	
	@Test
	public void foo1_XEquals0() {
		assertEquals(exercises.foo1(0, 10), Float.POSITIVE_INFINITY, 0);
	}
}
