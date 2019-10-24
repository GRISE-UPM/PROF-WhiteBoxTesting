package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
//número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
//producido el error, y depurar más fácilmente.

public class Test_maxAbsolute {
	
	Exercises ejercicios = new Exercises();

	@Test
	public void test_moreThanFive() {
		int[] argumentos = new int[]{ 1,2,3,4,5,6 }; 
		assertEquals(-1.0, ejercicios.maxAbsolute(argumentos),0);
	}
	
	@Test
	public void test_withANegative() {
		int[] argumentos = new int[]{ -1,2,3 }; 
		assertEquals(3.0, ejercicios.maxAbsolute(argumentos),0);
	}

}
