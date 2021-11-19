package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	private static Exercises exercise;

	@Test
	public void test() {
		exercise = new Exercises();
		int [] numbers = {2,3,8,5};
		assertEquals(8, exercise.maxAbsolute(numbers), 0);
	}

	@Test
	public void testArrayLengthMayorA5() {
		exercise = new Exercises();
		int [] numbers = {2,3,8,5,6,7};
		assertEquals(-1, exercise.maxAbsolute(numbers), 0);
	}

	@Test
	public void testValorNegativo() {
		exercise = new Exercises();
		int [] numbers = {2,8,-9,5};
		assertEquals(9, exercise.maxAbsolute(numbers), 0);
	}
}
