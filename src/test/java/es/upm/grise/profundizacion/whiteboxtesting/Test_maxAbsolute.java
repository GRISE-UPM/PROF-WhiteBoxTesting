package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Test_maxAbsolute {

	private Exercises exercises = new Exercises();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("MaxAbsolute - Empiezan tests");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Empieza test");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test terminado");
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("MaxAbsolute - Terminan tests");
	}
	
	@Test
	public void testListWithMoreThan5Elements() {
		int [] list = new int[] {1,2,3,4,5,6};
		assertEquals(-1, exercises.maxAbsolute(list), 0.0);
	}
	
	@Test
	public void testListWithOnlyNegativeElements() {
		int [] list = new int[] {-1,-2,-3,-4,-5};
		assertEquals(5, exercises.maxAbsolute(list), 0.0);
	}
	
	@Test
	public void testListWithOnlyPositiveElements() {
		int [] list = new int[] {1,2,3,4,5};
		assertEquals(5, exercises.maxAbsolute(list), 0.0);
	}
	
	@Test
	public void testListWithPositiveAndNegativeElements_MaxIsNegative() {
		int [] list = new int[] {1,2,-3,-4,-5};
		assertEquals(5, exercises.maxAbsolute(list), 0.0);
	}
	
	@Test
	public void testListWithPositiveAndNegativeElements_MaxIsPositive() {
		int [] list = new int[] {1,2,-3,-4,5};
		assertEquals(5, exercises.maxAbsolute(list), 0.0);
	}
	
	@Test
	public void testEmptyList() {
		int [] list = new int[] {};
		assertEquals(0, exercises.maxAbsolute(list), 0.0);
	}

}
