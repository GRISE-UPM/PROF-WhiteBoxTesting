package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
//número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
//producido el error, y depurar más fácilmente.

public class Test_maxAbsolute {
	Exercises ex = new Exercises();
	@Test
	public void test1() {
		int[] numbers = new int[1];
		numbers[0] = 4;
		assertEquals(4, ex.maxAbsolute(numbers));
	}
	@Test
	public void test2() {
		int[] numbers = new int[1];
		numbers[0] = -1;
		assertEquals(1, ex.maxAbsolute(numbers));
	}
	@Test
	public void test3() {
		int numbers [] = new int[6];
		assertEquals(-1, ex.maxAbsolute(numbers));
	}
}
