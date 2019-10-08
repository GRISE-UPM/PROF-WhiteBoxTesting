package test.java.es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.es.upm.grise.profundizacion.whiteboxtesting.Exercises;

public class Test_foo2 {

	@Test
	public void test1() {
		Exercises o = new Exercises();
		assertEquals(2, o.foo2(271, 270), 0);
	}

	@Test
	public void test2() {
		Exercises o = new Exercises();
		assertEquals(45, o.foo2(0, 90), 0);
	}
	
	@Test
	public void test3() {
		Exercises o = new Exercises();
		assertEquals(2, o.foo2(90, 270), 0);
	}
}
