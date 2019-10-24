package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
//número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
//producido el error, y depurar más fácilmente.

public class Test_maxAbsolute {

	private Exercises exercise = new Exercises();

	/**
	 * Primera condicion verdadera.
	 */
	@Test
	public void test1() {
		assertEquals(-1, exercise.maxAbsolute(new int[] { 5, -1, 2, -6, -10, -8 }), 0);
	}

	/**
	 * Primera condicion verdadera.
	 * 
	 * Segunda condicion entrada bucle verdadera. (eventualmente falsa).
	 * 
	 * Tercera condicion verdadera.
	 */
	@Test
	public void test2() {
		assertEquals(6, exercise.maxAbsolute(new int[] { -4, 2, -6 }), 0);
	}

	/**
	 * Primera condicion verdadera.
	 * 
	 * Segunda condicion entrada bucle verdadera. (eventualmente falsa).
	 * 
	 * Tercera condicion falsa.
	 */
	@Test
	public void test3() {
		assertEquals(12, exercise.maxAbsolute(new int[] { 12, -4, 0, -10 }), 0);
	}

}
