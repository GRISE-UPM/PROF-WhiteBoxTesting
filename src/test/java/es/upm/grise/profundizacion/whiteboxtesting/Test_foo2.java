package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo2 {

	private Exercises test;
	
	@Before
	public void before() {
		test = new Exercises();
	}
	
	@Test
	public void test1_foo2() {
		float a = 50; float b = 90;
		float exp = 70;
		assertEquals(exp, test.foo2(a, b), 0);
	}
	
	@Test
	public void test2_foo2() {
		float a = -45; float b = 0;
		float exp = 2;
		assertEquals(exp, test.foo2(a, b), 0);
	}
	
	@Test
	public void test3_foo2() {
		float a = 0; float b = -45;
		float exp = 2;
		assertEquals(exp, test.foo2(a, b), 0);
	}
	
	@Test
	public void test4_foo2() {
		float a = -45; float b = -90;
		float exp = 2;
		assertEquals(exp, test.foo2(a, b), 0);
	}

}
