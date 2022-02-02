package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	static Exercises exercises;

	@BeforeEach
	void setup() {
		exercises = new Exercises();
	}
	
	@Test
	public void testNumberElementsGreaterThanFive() {
		assertEquals(-1, exercises.maxAbsolute(new int[]{1,2,3,4,5,6}));
	}
	
	@Test
	public void testMaxValuesIs10() {
		assertEquals(10, exercises.maxAbsolute(new int[]{10,2,3,4}));
	}

	@Test
	public void testNumberIsNegative() {
		assertEquals(10, exercises.maxAbsolute(new int[]{-10,2,3,4}));
	}
	
}
