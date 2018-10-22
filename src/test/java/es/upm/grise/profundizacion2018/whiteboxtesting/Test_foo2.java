package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Complejidad Ciclomática de 3:
 * para los caminos bastarían con 3 tests, 
 * para evaluar todas las condiciones hacen falta 4
 */
public class Test_foo2 {

	private Exercises exercises = new Exercises();
	
	@Test
	public void foo2_AGreaterThanBAndCosOfBLessThan0() {
		assertEquals(exercises.foo2((float)Math.toRadians(540), (float)Math.toRadians(180)), 2, 0);
	}
	
	@Test
	public void foo2_AGreaterThanBAndCosOfBGreaterThan0AndCosOfAGreaterThan0() {
		assertEquals(exercises.foo2((float)Math.toRadians(360), (float)Math.toRadians(0)), 2, 0);
	}
	
	@Test
	public void foo2_ALessOrEqualsThanBAndCosOfALessThan0() {
		assertEquals(exercises.foo2((float)Math.toRadians(180), (float)Math.toRadians(540)), 2, 0);
	}
	
	@Test
	public void foo2_ALessOrEqualsThanBAndCosOfAGreaterThan0AndCosOfBLessThan0() {
		assertEquals(exercises.foo2((float)Math.toRadians(0), (float)Math.toRadians(180)), ((float)Math.toRadians(0)+(float)Math.toRadians(180))/2, 0);
	}
}
