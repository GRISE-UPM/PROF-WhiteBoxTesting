package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	@Test
	public void testCasoMayorCinco() {
		Exercises ejemplo = new Exercises();
		assertEquals(1.0, ejemplo.foo1(6, 16),0);
	}
	@Test
	public void testCasoMenorCinco() {
		Exercises ejemplo = new Exercises();
		assertEquals(10.0, ejemplo.foo1(1, 10),0);
	}

}
