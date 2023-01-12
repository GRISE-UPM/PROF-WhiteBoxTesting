package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

public class Test_foo2 {

	Exercises e = new Exercises();
	
	// Hay 4 caminos posibles
	// 1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10
	// 1 - 2 - 3 - 4 - 5 - 6 - 7 - 10
	// 1 - 2 - 7 - 8 - 9 - 10
	// 1 - 2 - 7 - 10
	
	// entra al primer if pero no al segundo
	@Test
	public void aGraterThanbTest() {
		float a = 9;
		float b = 5;
		// En este caso para la segunda condición:  cos(a) = 0.28 && cos(b) = -0.91
		assertEquals(7, e.foo2(a, b));
	}
	
	// entra al primer if y al segundo
	@Test
	public void aGraterThanbTest2() {
		float a = 5;
		float b = 4;
		// En este caso para la segunda condición:  cos(a) = 0.75 && cos(b) = -0.91
		assertEquals(2, e.foo2(a, b));
	}
	
	// no entra al primer if pero sí al segundo
	@Test
	public void aEqualsbTest() {
		float a = 0;
		float b = 0;
		// En este caso para la segunda condición:  cos(a) = 1 && cos(b) = 1
		assertEquals(2, e.foo2(a, b));
	}
	
	// no entra al primer if ni al segundo
	@Test
	public void aSmallerThanbTest() {
		float a = 0;
		float b = 8;
		// En este caso para la segunda condición:  cos(a) = 0.54 && cos(b) = -0.14
		assertEquals(4, e.foo2(a, b));
	}

}
