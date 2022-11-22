package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	private Exercises exercises = new Exercises();
	
	@Test
	public void testLengthGreaterThanFive() {
		int[] numbers = {1,2,3,4,5,6};
		
		assertEquals(-1, exercises.maxAbsolute(numbers));
	}
	
	@Test
	public void testLengthLessThanFive() {
		int[] numbers = {1,2};

		assertEquals(2, exercises.maxAbsolute(numbers));
	}

	@Test
	public void testValueLessThanCero() {
		int[] numbers = {1,-2,-3};

		assertEquals(3, exercises.maxAbsolute(numbers));	
	}	
}
