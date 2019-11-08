package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	@Test // C1: 1-2-3
	public void test1() {
		Exercises o = new Exercises();
		assertEquals(1, o.foo1(6, 16), 0);
	}
	
	@Test // C2: 1-3
	public void test2() {
		Exercises o = new Exercises();
		assertEquals(1, o.foo1(5, 5), 0);
	}
}
