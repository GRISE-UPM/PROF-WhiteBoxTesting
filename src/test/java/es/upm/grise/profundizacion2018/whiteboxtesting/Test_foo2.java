package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	private Exercises ejercicio = new Exercises();
	
	
	@Test
	public void prueba1() {
		float a = 8; // cos (8) = 0.9902
		float b = 10; //cos (10) = 0.9848
		assertEquals("El resultado debe de ser " + 2 + ",pero es " + ejercicio.foo2(a, b), 2, ejercicio.foo2(a, b), 0.01);
	}

}
