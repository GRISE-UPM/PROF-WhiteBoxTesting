package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {
	private Exercises ejercicio = new Exercises();

	
	
	
	//Se comprueba que si x<5 no se añade
	@Test
	public void prueba1() {
		float x = 3;
		float y = 9;
		assertEquals("El resultado debe de ser " + 3 + ",pero es " + ejercicio.foo1(x, y), 3, ejercicio.foo1(x, y), 0.01);
	}
	
	@Test
	public void prueba2() {
		float x = 9;
		float y = 19;
		assertEquals("El resultado debe de ser " + 1 + ",pero es " + ejercicio.foo1(x, y), 1, ejercicio.foo1(x, y), 0.01);
	}

}
