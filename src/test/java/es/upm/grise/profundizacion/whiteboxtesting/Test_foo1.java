package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo1 {

	private Exercises test;
	
	@Before
	public void before() {
		test = new Exercises();
	}
	
	@Test
	public void test1_foo1() {
		float x = 4; float y = 24;
		float exp = 6;
		assertEquals(exp, test.foo1(x, y), 0);
	}
	
	@Test
	public void test2_foo1() {
		float x = 6; float y = 48;
		float exp = 3;
		assertEquals(exp, test.foo1(x, y), 0);
	}

}
