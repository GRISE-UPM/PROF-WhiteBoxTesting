package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
//número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
//producido el error, y depurar más fácilmente.

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
