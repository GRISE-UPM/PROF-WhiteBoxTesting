package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;



public class Test_foo2 {

	
	//a = 5, b = 7.
	@Test
	public void test_foo2() {
		Exercises ejercicio = new Exercises();
		float a = 5;
		float b = 7;
		assertEquals(2.0, ejercicio.foo2(a, b), 0.001);
			
	}
	
	//a = 7, b = 6.
	@Test
	public void test_foo2_2() {
		Exercises ejercicio = new Exercises();
		float a = 5;
		float b = 7;
		assertEquals(2.0, ejercicio.foo2(a, b), 0.001);
			
	}
	
	//a = 12, b = 6.
	@Test
	public void test_foo2_3() {
		Exercises ejercicio = new Exercises();
		float a = 5;
		float b = 7;
		assertEquals(2.0, ejercicio.foo2(a, b), 0.001);
			
	}
}
