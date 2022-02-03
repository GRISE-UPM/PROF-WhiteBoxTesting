package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_foo2 {

	@Test
	public void test1_foo2_maxA() {
		Exercises ex =  new Exercises();
		assertEquals(2, ex.foo2(1, 0), 0.01);
	}

	@Test
	public void test2_foo2_maxB() {
		Exercises ex= new Exercises();
		assertEquals(2, ex.foo2(0, 1), 0.01);
	}

	@Test
	public void test3_foo2_noIf() {
		Exercises ex= new Exercises();
		assertEquals(2.0, ex.foo2(1, (float)1.57), 0.01);
	}

}
