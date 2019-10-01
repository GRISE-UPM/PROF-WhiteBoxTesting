package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	
	Exercises ejercicios = new Exercises();

	@Test
	public void test1() {
		assertEquals(2.0, ejercicios.foo2(1, 0), 0);
	}
	
	@Test
	public void test2() {
		assertEquals(2.0, ejercicios.foo2(1, -10), 0);
	}
	
	@Test
	public void test3() {
		assertEquals(-4.0, ejercicios.foo2(-5, -3), 0);
	}

}
