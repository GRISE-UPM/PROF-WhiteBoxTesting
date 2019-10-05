package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {
	Exercises ex = new Exercises();
	@Test
	public void test1() {
		int[] numbers = new int[1];
		numbers[0] = 4;
		assertEquals(4, ex.maxAbsolute(numbers));
	}
	@Test
	public void test2() {
		int[] numbers = new int[1];
		numbers[0] = -1;
		assertEquals(1, ex.maxAbsolute(numbers));
	}
	@Test
	public void test3() {
		int numbers [] = new int[6];
		assertEquals(-1, ex.maxAbsolute(numbers));
	}
}
