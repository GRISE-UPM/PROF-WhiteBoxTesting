package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	//resultado: -1 porque numbers.length >5
	@Test
	public void longitud_mayor__que_5() {
		Exercises ejercicio = new Exercises();
		int [] numbers = {1,2,3,4,5,6};
		assertEquals(-1, ejercicio.maxAbsolute(numbers), 0.001);
		
	}
	
	
	//resultado: 9
	@Test
	public void test() {
		Exercises ejercicio = new Exercises();
		int [] numbers = {1,-5,7,9};
		assertEquals(9, ejercicio.maxAbsolute(numbers), 0.001);
		
	}
	
	//resultado: 15
	@Test
	public void test_2() {
		Exercises ejercicio = new Exercises();
		int [] numbers = {1,-15,7,9};
		assertEquals(15, ejercicio.maxAbsolute(numbers), 0.001);
		
	}
	
	//resultado: 0
	@Test
	public void test_3() {
		Exercises ejercicio = new Exercises();
		int [] numbers = {};
		assertEquals(0, ejercicio.maxAbsolute(numbers), 0.001);
		
	}

}
