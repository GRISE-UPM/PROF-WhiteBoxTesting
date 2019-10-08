package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	private Exercises exercise = new Exercises();

	/**
	 * Primera condicion verdadera.
	 */
	@Test
	public void test1() {
		assertEquals(2, exercise.foo1(6, 32), 0);
	}

	/**
	 * Primera condicion falsa.
	 */
	@Test
	public void test2() {
		assertEquals(2, exercise.foo1(5, 10), 0);
	}
}
