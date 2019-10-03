package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

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
