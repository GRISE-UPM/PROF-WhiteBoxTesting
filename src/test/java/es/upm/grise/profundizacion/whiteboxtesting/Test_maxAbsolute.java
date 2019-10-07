package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises prueba = new Exercises();

	@Test
	public void menos_uno() {
		int [] numbers = {1,2,3,4,5,6,7,8,9,10};
		assertEquals(prueba.maxAbsolute(numbers),-1,0);
	}

	@Test
	public void sin_negativo() {
		int [] numbers = {1,2,3};
		assertEquals(prueba.maxAbsolute(numbers),3,0);
	}
	
	@Test
	public void con_negativo() {
		int [] numbers = {-1,2,3};
		assertEquals(prueba.maxAbsolute(numbers),3,0);
	}
}
