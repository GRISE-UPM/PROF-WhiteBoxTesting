package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_foo1 {
	
	// Variables usadas para el testing
	private static Exercises exs;
	private float x, y;
	
	@BeforeAll
	static public void setUp() {
		exs = new Exercises();
	}
	
	@Test
	public void xGreaterThan5() { // Camino 1 - 2 - 3
		
		// Inicializacion
		x = 6;
		y = 10;
		
		// Asercion
		assertEquals(exs.foo1(x, y), (float) 10/16);
	}

	@Test
	public void xLessOrEqual5() { // Camino 1 - 3
		
		// Inicializacion
		x = 5;
		y = 10;
		
		// Asercion
		assertEquals(exs.foo1(x, y), 2);
	}
}
