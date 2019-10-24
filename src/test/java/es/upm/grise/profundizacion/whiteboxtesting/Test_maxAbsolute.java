package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
//número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
//producido el error, y depurar más fácilmente.

public class Test_maxAbsolute {

		private Exercises test;
		
		@Before
		public void before() {
			test = new Exercises();
		}
		
	@Test
	public void test1_maxAbsolute() {
		int[] numbers = {0,1,2,3,4,5};
		int exp = -1;
		assertEquals(exp, test.maxAbsolute(numbers));
	}
	
	@Test
	public void test2_maxAbsolute() {
		int[] numbers = {0,1,2,3,4};
		int exp = 4;
		assertEquals(exp, test.maxAbsolute(numbers));
	}
	
	@Test
	public void test3_maxAbsolute() {
		int[] numbers = {-2,-3,-1, 0, 2};
		int exp = 3;
		assertEquals(exp, test.maxAbsolute(numbers));
	}
	
}
