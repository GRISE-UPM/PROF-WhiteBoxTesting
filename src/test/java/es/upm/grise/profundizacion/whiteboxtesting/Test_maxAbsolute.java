package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	@Test
	public void test_max_1() {
		Exercises ex = new Exercises();
		int[] a1 = {1,2,3,4,5,6};
		assertEquals(-1, ex.maxAbsolute(a1));
	}
	
	@Test
	public void test_max_2() {
		Exercises ex = new Exercises();
		int[] a1 = {123,4,6,7};
		assertEquals(123, ex.maxAbsolute(a1));
	}

	@Test
	public void test_max_3() {
		Exercises ex = new Exercises();
		int[] a1 = {-123,4,6,7};
		assertEquals(123, ex.maxAbsolute(a1));
	}

}
