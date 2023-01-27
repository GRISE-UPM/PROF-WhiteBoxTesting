package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	private Exercises e = new Exercises();

	@Test
	public void NoNumDef_0() {

		int[] numbers  = {};
		assertEquals(0,e.maxAbsolute(numbers));

	}
	@Test
	public void Numero_Mayor5() {

		int[] numbers  = {2,3,4,5,6,7};
		assertEquals(7,e.maxAbsolute(numbers));

	}
	public void Numero_menor5() {
		int[] num= {1,-1};
		assertEquals(1,e.maxAbsolute(num),1);
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
	
	@Test
	public void Value_noNum() {
		int [] num= {'a','z'};
		assertEquals(122,e.maxAbsolute(num));	
		}


}
