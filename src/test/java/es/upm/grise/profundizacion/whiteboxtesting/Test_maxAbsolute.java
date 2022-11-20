package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	@Test
	public void test() {
		Exercises ex = new Exercises();
		int[] numbers = {1,2,3,4,5};
		assertEquals(5, ex.maxAbsolute(numbers));
	}

	@Test
	public void test2() {
		Exercises ex = new Exercises();
		int[] numbers = {1,2,3,4,5,6};
		assertEquals(-1, ex.maxAbsolute(numbers));
	}
}
