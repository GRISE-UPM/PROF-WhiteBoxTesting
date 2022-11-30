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
	public void noNumbers() {
		
		// Inicializacion
		nums = new int[]{};
		
		// Asercion
		assertEquals(exs.maxAbsolute(nums), 0);
	}

	@Test
	public void moreThan5Numbers() {
		
		// Inicializacion
		nums = new int[]{1, 2, 3, 4, 5, 6};
		
		// Asercion
		assertEquals(exs.maxAbsolute(nums), -1);
	}
	
	@Test
	public void maxValuePositive() {
		
		// Inicializacion
		nums = new int[]{1, 2, 3, 4, 5};
		
		// Asercion
		assertEquals(exs.maxAbsolute(nums), 5);
	}
	
	@Test
	public void maxValueNegative() {
		
		// Inicializacion
		nums = new int[]{1, 2, 3, 4, -5};
		
		// Asercion
		assertEquals(exs.maxAbsolute(nums), 5);
	}
}
