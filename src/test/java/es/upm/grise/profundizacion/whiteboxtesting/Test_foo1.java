package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {


	@Test
	public void test_foo1_1() {
		Exercises ex = new Exercises();
			assertEquals(0.5, ex.foo1(8, 9), 0.0);
	}
	
	@Test
	public void test_foo1_2() {
		Exercises ex = new Exercises();
			assertEquals(0.5, ex.foo1(4, 2), 0.0);
	}

}
