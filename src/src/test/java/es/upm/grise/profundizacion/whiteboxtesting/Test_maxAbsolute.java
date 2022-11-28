package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	private Exercises e = new Exercises();

	@Test
	public void NoNumDefecto_0() {

		int[] numbers  = {};
		assertEquals(0,e.maxAbsolute(numbers));

	}
	@Test
	public void Numero_Mayor5() {

		int[] numbers  = {2,3,4,5,6,7};
		assertEquals(-1,e.maxAbsolute(numbers));

	}

	@Test
	public void Maximo_Positivo() {

		int[] numbers  = {15,2,100};
		assertEquals(100,e.maxAbsolute(numbers));

	}

	@Test
	public void Maximo_Negativo() {

		int[] numbers  = {15,2,-100};
		assertEquals(100,e.maxAbsolute(numbers));

	}


}
