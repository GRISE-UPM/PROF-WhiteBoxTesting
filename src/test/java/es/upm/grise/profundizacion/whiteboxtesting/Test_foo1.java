package test.java.es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.es.upm.grise.profundizacion.whiteboxtesting.Exercises;

public class Test_foo1 {

	@Test
	public void test1() {
		Exercises o = new Exercises();
		assertEquals(1, o.foo1(6, 16), 0);
	}

	@Test
	public void test2() {
		Exercises o = new Exercises();
		assertEquals(1, o.foo1(5, 5), 0);
	}
}
