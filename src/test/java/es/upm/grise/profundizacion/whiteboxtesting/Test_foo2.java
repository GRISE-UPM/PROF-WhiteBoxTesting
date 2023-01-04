package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	@Test
	public void test_foo2_1() {
		Exercises ex = new Exercises();
			assertEquals(2, ex.foo2(6, 4), 0.0);
	}

	@Test
	public void test_foo2_2() {
		Exercises ex = new Exercises();
			assertEquals(194, ex.foo2(198, 190), 0.0);
	}
	
	@Test
	public void test_foo2_3() {
		Exercises ex = new Exercises();
			assertEquals(2, ex.foo2(186, 3), 0.0);
	}
	
	@Test
	public void test_foo2_4() {
		Exercises ex = new Exercises();
			assertEquals(194, ex.foo2(190, 198), 0.0);
	}
}