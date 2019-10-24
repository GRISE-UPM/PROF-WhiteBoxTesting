package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;


//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
//número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
//producido el error, y depurar más fácilmente.

import org.junit.Test;

public class Test_maxAbsolute {
	public Exercises testMaxAbsolute = new Exercises ();
	public int [] arrayTest ;
	
	//Test para numbers.length > 5
	@Test
	public void test_maxAbsolute_length_bigger() {
		assertEquals(-1,testMaxAbsolute.maxAbsolute(arrayTest = new int [] {1,2,3,4,5,6}));
		
	}
	
	//Test para funcionalidad normal del programa tanto números positivos como negativos
	@Test
	public void test_maxAbsolute() {
		assertEquals(61,testMaxAbsolute.maxAbsolute(arrayTest = new int [] {-1,2,-3,50,61}));
		
	}

}
