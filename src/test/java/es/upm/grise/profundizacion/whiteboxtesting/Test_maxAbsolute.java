package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	private Exercises e = new Exercises();

	//El flow chart nos da tres casos de prueba. Dos para el nodo 2 y dos para el nodo 6 (Una branch del nodo 2 es excluyente). 
	
	//Primera rama return. FOO.
	@Test
	public void Length_Mayor_5_FOO() {

		int[] numbers  = {1,1,1,1,1,1};
		assertEquals(-1,e.maxAbsolute(numbers));

	}
	//Segunda rama menor que 5. Primera rama numbers[i] menor que 0.
	@Test
	public void Length_Menor_5_AND_NumbersI_Menor_0() {

		int[] numbers  = {-1};
		assertEquals(1,e.maxAbsolute(numbers));

	}
	//FOO. Segunda rama numbers[i] mayor o igual que 0.
	@Test
	public void FOO_AND_NumbersI_MAYOR_0() {

		int[] numbers  = {1};
		assertEquals(1,e.maxAbsolute(numbers));

	}

}
