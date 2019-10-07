package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	Exercises prueba = new Exercises();

	@Test
	public void false_false() { // Esta el swap de variables
		float a = 2f;
		float b = 1f;
		assertEquals(prueba.foo2(a, b),1.5,0);
	}
	
	@Test
	public void true_true() {
		float a = 3f;
		float b = 7f;
		assertEquals(prueba.foo2(a, b),2.0,0);
	}

	@Test
	public void true_false() {
		float a = 3f;
		float b = 3f;
		assertEquals(prueba.foo2(a, b),2.0,0);
	}
	
	@Test
	public void false_true() {
		float a = 0f;
		float b = 0f;
		assertEquals(prueba.foo2(a, b),2.0,0);
	}

}
