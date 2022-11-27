package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class Test_maxAbsolute {
	
   /*
	* Caso 1: numbers.length > 5
	*Caso 2: numbers.length <= 5 y todos positivos
	*Caso 3: numbers.length <= 5 y un número negativo con el mayor valor absoluto
	*/
	
	@Test
	public void array_with_length_greater_than_5_test() {
		Exercises e = new Exercises();
		int [] numeros = {1,2,3,4,5,6,7,8,9};
		assertEquals(-1,e.maxAbsolute(numeros));
	}
	
	@Test
	public void array_with_all_positives() {
		Exercises e = new Exercises();
		int [] numeros = {3,7,2,0};
		assertEquals(7,e.maxAbsolute(numeros));
	}
	
	@Test
	public void array_with_negatives() {
		Exercises e = new Exercises();
		int [] numeros = {-3,7,-12,0};
		assertEquals(12,e.maxAbsolute(numeros));
	}

}
