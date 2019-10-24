package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
//número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
//producido el error, y depurar más fácilmente.

public class Test_maxAbsolute {

	@Test
	public void test() {
		Exercises maxAbTest = new Exercises();
		int[] integer = {1,-2,3,4,5};
		int[] integer2 = {1,2,3,4,5,6};
		int result = maxAbTest.maxAbsolute(integer);
		TestCase.assertEquals(5, result);
		int result2 = maxAbTest.maxAbsolute(integer2);
		TestCase.assertEquals(-1, result2);
	}

}
