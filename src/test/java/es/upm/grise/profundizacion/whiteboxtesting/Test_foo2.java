package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	private Exercises exercise = new Exercises();

	/**
	 * Primera condicion verdadera.
	 * 
	 * Segunda condicon verdadera.
	 */
	@Test
	public void test1() {
		assertEquals(2, exercise.foo2(3, 2), 0);
	}

	/**
	 * Primera condicion verdadera.
	 * 
	 * Segunda condicon falsa.
	 * 
	 * Tercera condicion verdadera.
	 */
	@Test
	public void test2() {
		assertEquals(2, exercise.foo2(5, 1), 0);
	}

	/**
	 * Primera condicion verdadera.
	 * 
	 * Segunda condicon falsa.
	 * 
	 * Tercera condicion falsa.
	 */
	@Test
	public void test3() {
		assertEquals((float) 3 / 2, exercise.foo2(2, 1), 0);
	}

	/**
	 * Primera condicion falsa.
	 * 
	 * Segunda condicon falsa.
	 * 
	 * Tercera condicion falsa.
	 */
	@Test
	public void test4() {
		assertEquals((float) 3 / 2, exercise.foo2(1, 2), 0);
	}

}
