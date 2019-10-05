package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {
	Exercises ex = new Exercises();
	@Test
	public void test1() {
		
		assertEquals(2, ex.foo1(2, 4),0);
	}
	@Test
	public void test2() {
		
		assertEquals(1, ex.foo1(6, 16),0);
	}

}
