package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {
	
	Exercises ejercicios = new Exercises();

	@Test
	public void test1() {
		assertEquals(1.0, ejercicios.foo1(1, 1), 0);
	}
	
	@Test
	public void test2() {
		assertEquals(0.0625, ejercicios.foo1(6, 1), 0);
	}

}
