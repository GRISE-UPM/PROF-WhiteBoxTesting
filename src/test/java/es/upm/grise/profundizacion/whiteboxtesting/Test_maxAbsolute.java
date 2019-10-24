package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
// número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
// es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
// producido el error, y depurar más fácilmente.

public class Test_maxAbsolute {

	Exercises exercise;

	@Before
	public void setup() {
		exercise = new Exercises();
	}

	@Test
	public void length_numbers_longer_than_5_digits() {
		int [] numbers = { 9, -9, 9, -9, 9, -9 };

		assertEquals(-1, exercise.maxAbsolute(numbers));
	}

	@Test
	public void max_number_OK() {
		int [] numbers = { 1, -2, 3, -4, 5 };

		assertEquals(5, exercise.maxAbsolute(numbers));
	}

}
