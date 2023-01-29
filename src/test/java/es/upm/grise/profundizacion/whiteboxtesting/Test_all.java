package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


public class Test_all {


	/*
	 * TEST FOO1
	 */
	//x = 6; y = 4; el resultado debe ser 0.25
	@Test
	public void test_mayor_que_5_test() {
		Exercises ejercicio = new Exercises();
		double res_esperado = 0.25;
		float resultado = ejercicio.foo1(6,4);
		assertEquals(res_esperado,resultado , 0.001);
	}
	
	//x = 8; y = 9; el resultado debe ser 2
	@Test
	public void test_mayor_que_5_2_test() {
		Exercises ejercicio = new Exercises();
		double res_esperado = 0.5;
		float resultado = ejercicio.foo1(8, 9);
		assertEquals(res_esperado, resultado, 0.001);
	}

	//x = 4; y = 4; el resultado debe ser 1
	@Test
	public void test_menor_que_5_test() {
		Exercises ejercicio = new Exercises();
		float resultado = ejercicio.foo1(4,4);
		float res_esperado = 1;
		assertEquals(res_esperado, resultado, 0.001);
	}
	
	
	//x = 2; y = 4; el resultado debe ser 0.5
	@Test
	public void test_menor_que_5_2_test() {
		Exercises ejercicio = new Exercises();
		float res_esperado = 2;
		float resultado = ejercicio.foo1(2,4);
		assertEquals(res_esperado, resultado, 0.001);
	}
	
	
	/*
	 * TEST FOO2
	 */
	
	//a = 5, b = 7.
	@Test
	public void test_foo2_test() {
		Exercises ejercicio = new Exercises();
		float a = 5;
		float b = 7;
		float resultado = ejercicio.foo2(a, b);
		float res_esperado = 2;
		assertEquals(res_esperado,resultado, 0.001);
			
	}
	
	//a = 7, b = 6.
	@Test
	public void test_foo2_2_test() {
		Exercises ejercicio = new Exercises();
		float a = 5;
		float b = 7;
		float res_esperado = 2;
		float resultado=ejercicio.foo2(a, b);
		assertEquals(res_esperado, resultado, 0.001);
			
	}
	
	//a = 12, b = 6.
	@Test
	public void test_foo2_3_test_test() {
		Exercises ejercicio = new Exercises();
		float a = 5;
		float b = 7;
		float res_esperado = 2;
		float resultado = ejercicio.foo2(a, b);
		assertEquals(res_esperado, resultado, 0.001);
			
	}
	
	/*
	 * TEST MAXABSOLUTE
	 */

	//resultado: -1 porque numbers.length >5
	@Test
	public void longitud_mayor__que_5_Test() {
		Exercises ejercicio = new Exercises();
		int [] numbers = {1,2,3,4,5,6};
		int res_esperado=-1;
		int resultado = ejercicio.maxAbsolute(numbers);
		assertEquals(res_esperado, resultado);
		
	}
	
	
	//resultado: 9
	@Test
	public void test_test() {
		Exercises ejercicio = new Exercises();
		int [] numbers = {1,-5,7,9};
		int res_esperado=9;
		int resultado = ejercicio.maxAbsolute(numbers);
		assertEquals(res_esperado, resultado);
		
	}
	
	//resultado: 15
	@Test
	public void test_2_test() {
		Exercises ejercicio = new Exercises();
		int [] numbers = {1,-15,7,9};
		int res_esperado=15;
		int resultado =ejercicio.maxAbsolute(numbers);
		assertEquals(res_esperado, resultado);
		
	}
	
	//resultado: 0
	@Test
	public void test_3_test() {
		Exercises ejercicio = new Exercises();
		int [] numbers = {};
		int res_esperado=0;
		int resultado=ejercicio.maxAbsolute(numbers);
		assertEquals(res_esperado, resultado );
		
	}

}
