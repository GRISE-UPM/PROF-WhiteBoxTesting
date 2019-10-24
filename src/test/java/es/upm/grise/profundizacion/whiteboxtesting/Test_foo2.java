package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

// OSCAR: Es preferible que cada aserción vaya en un @Test separado.
// El testeo está correcto, aunque es preferible aumentar las ramas una a una, 
// para poder detectar más fácilmente dónde se ha producido el error, y depurar 
// más fácilmente. En este caso, CC = 4, por lo que lo ideal sería tener 4 casos de prueba


public class Test_foo2 {

	Exercises testFoo2 = new Exercises();
	
  // Test para cuando a > b
	@Test
	public void test_foo2_greater_b() {
		
		assertEquals(2, testFoo2.foo2(5, 1), 0.0f);
		
		//a > b y no se cumple Math.cos(a) < 0 || Math.cos(b) > 0
		
		assertEquals(140, testFoo2.foo2(180, 100), 0.0f);
		
	}
	
	//Test para a < b
	@Test
	public void test_foo2_less_b() {
		assertEquals(2, testFoo2.foo2(180, 200), 0.0f);
	}

}
