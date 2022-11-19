package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {
	
	private Exercises e = new Exercises();
	
	
	//Suponiendo que es un requisito. Focus on behavior
	@Test
	public void NoNumbers_PorDefecto_0() {

		int[] numbers  = {};
		assertEquals(0,e.maxAbsolute(numbers));

	}

	@Test
	public void Numbers_MayorQue5() {

		int[] numbers  = {1,1,1,1,1,1};
		assertEquals(-1,e.maxAbsolute(numbers));

	}
	
	@Test
	public void Maximo_Es_Positivo() {

		int[] numbers  = {1,1,100};
		assertEquals(100,e.maxAbsolute(numbers));

	}
	
	@Test
	public void Maximo_Es_Negativo() {

		int[] numbers  = {1,1,-100};
		assertEquals(100,e.maxAbsolute(numbers));

	}


}
