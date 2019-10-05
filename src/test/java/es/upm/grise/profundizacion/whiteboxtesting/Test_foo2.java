package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	Exercises ex = new Exercises();
	@Test
	public void test1() {
		assertEquals(2, ex.foo2(3, 3), 0);
	}
	@Test
	public void test2() {
		assertEquals(2, ex.foo2(1, 1), 0);
	}
	@Test
	public void test3() {
		assertEquals(7.5, ex.foo2(5, 10), 0);
	}
	@Test
	public void test4() {
		assertEquals(7.5, ex.foo2(10, 5), 0);
	}
}
