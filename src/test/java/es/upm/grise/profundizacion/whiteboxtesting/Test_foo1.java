package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	Exercises prueba = new Exercises();

	@Test
	public void x_less_than_5() {
		float x = 2f;
		float y = 1f;
		assertEquals(prueba.foo1(x, y),0.5,0);
	}

	@Test
	public void x_greater_than_5() {
		float x = 6f;
		float y = 1f;
		assertEquals(prueba.foo1(x, y),0.0625,0);
	}

}
