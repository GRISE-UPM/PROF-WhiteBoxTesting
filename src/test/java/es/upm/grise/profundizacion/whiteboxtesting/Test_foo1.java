package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;




public class Test_foo1 {

		//x = 6; y = 4; el resultado debe ser 0.25
	@Test
	public void test_mayor_que_5() {
		Exercises ejercicio = new Exercises();
		assertEquals(0.25, ejercicio.foo1(6,4), 0.001);
	}
	
	//x = 8; y = 9; el resultado debe ser 2
	@Test
	public void test_mayor_que_5_2() {
		Exercises ejercicio = new Exercises();
		assertEquals(0.5, ejercicio.foo1(8, 9), 0.001);
	}

	//x = 4; y = 4; el resultado debe ser 1
	@Test
	public void test_menor_que_5() {
		Exercises ejercicio = new Exercises();
		assertEquals(1.0, ejercicio.foo1(4,4), 0.001);
	}
	
	
	//x = 2; y = 4; el resultado debe ser 0.5
	@Test
	public void test_menor_que_5_2() {
		Exercises ejercicio = new Exercises();
		assertEquals(2, ejercicio.foo1(2,4), 0.001);
	}

}
