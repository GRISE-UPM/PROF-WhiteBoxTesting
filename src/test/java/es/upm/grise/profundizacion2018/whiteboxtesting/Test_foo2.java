package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	@Test
	public void test() {
		Exercises e = new Exercises();
		assertTrue(e.foo2(10, 5) == 7.5);
	}
	
	@Test
	public void test2() {
		Exercises e = new Exercises();
		assertTrue(e.foo2(110, 200) == 2);
	}
	
	@Test
	public void test3() {
		Exercises e = new Exercises();
		assertTrue(e.foo2(30, 45) == 2);
	}

}
