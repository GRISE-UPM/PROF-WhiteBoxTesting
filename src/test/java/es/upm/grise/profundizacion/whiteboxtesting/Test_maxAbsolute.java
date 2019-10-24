package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_maxAbsolute {
	
	//OSCAR: En este caso, la CC = 4. Ahora bien, la existencia del for permite simplificar el 
	//número de caminos mediante multiples pasadas por el bucle. El testeo está correcto, aunque 
	//es preferible aumentar las ramas una a una, para poder detectar más fácilmente dónde se ha
	//producido el error, y depurar más fácilmente.

	Exercises exercise=new Exercises();
	
	//Caso 1 number.length >5
	@Test
	public void test_caso1_maxAbsolute() {
		int [] number= {1,2,3,4,5,6};
		int result=-1;
		assertEquals(result, exercise.maxAbsolute(number));
	}
	
	//Caso 2 number.length <5 {1}
		@Test
		public void test_caso2_maxAbosulte() {
			int [] number= {1};
			int result=1;
			assertEquals(result, exercise.maxAbsolute(number));
		}
		
		//Caso 3 number.length <5 {1,-2}
		@Test
		public void test_caso3_maxAbosulte() {
			int [] number= {1,-2};
			int result=2;
			assertEquals(result, exercise.maxAbsolute(number));
		}

}
