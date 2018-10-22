package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class Test_foo1 {

	@Test
	public void test() {
		Exercises e = new Exercises();
		assertTrue(e.foo1(5, 10) == 2);
	}
	
	@Test
	public void test2() {
		Exercises e = new Exercises();
		assertTrue(e.foo1(10, 10) == 0.5);
	}

}
