package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {
	Exercises ej1 = new Exercises();
	@Test
	public void test1() { // Longitud > 5
		int [] array = {1, 2, 3, 4, 5, 6};
		assertEquals(ej1.maxAbsolute(array), -1, 0);
	}
	@Test
	public void test2() { // Longitud < 5 sin numeros negativos
		int [] array = {1, 2, 3};
		assertEquals(ej1.maxAbsolute(array), 3, 0);
	}
	@Test
	public void test3() { // Longitud < 5 con numeros negativos
		int [] array = {4, 2, -7};
		assertEquals(ej1.maxAbsolute(array), 7, 0);
	}

}
