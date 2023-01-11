package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	// Variables usadas para el testing
	private static Exercises exs;
	private int[] nums;
	
	@BeforeAll
	public static void setUp() {
		exs = new Exercises();
	}
	
	@Test
	public void noNumbers() { // Camino 1 - 3 - 8
		
		// Inicializacion
		nums = new int[]{};
		
		// Asercion
		assertEquals(exs.maxAbsolute(nums), 0);
	}

	@Test
	public void moreThan5Numbers() { // Camino 1 - 2
		
		// Inicializacion
		nums = new int[]{1, 2, 3, 4, 5, 6};
		
		// Asercion
		assertEquals(exs.maxAbsolute(nums), -1);
	}
	
	@Test
	public void maxValuePositive() { // Camino 1 - 3 - 4 - 6 - 7 (...) - 8
		
		// Inicializacion
		nums = new int[]{1, 2, 3, 4, 5};
		
		// Asercion
		assertEquals(exs.maxAbsolute(nums), 5);
	}
	
	@Test
	public void maxValueNegative() { // Camino 1 - 3 - 4 - 5 - 6 (...) - 8
		
		// Inicializacion
		nums = new int[]{1, 2, 3, 4, -5};
		
		// Asercion
		assertEquals(exs.maxAbsolute(nums), 5);
	}
}
