package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute2_ej6 {

	private Exercises exercises = new Exercises();
	
	/*
	 * Test the path 1 -> 2 -> 3
	 * 
	 * Conditions:
	 *  numbers.length > 5
	 */
	@Test
	public void test1() {
		int[] numbers = {1,2,3,4,5,6};
		
		assertEquals(-1, exercises.maxAbsolute(numbers));
	}
	
	/*
	 * Test the path 1 -> 2 -> 4 -> 5 -> 9
	 * 
	 * Conditions:
	 *  numbers.length <= 5
	 */
	@Test
	public void test2() {
		int[] numbers = {};
		
		assertEquals(0, exercises.maxAbsolute(numbers));
	}
	
	/*
	 * Test the path 1 -> 2 -> 4 -> 5 -> 6 -> 7 -> 5 -> 6 -> 7 -> 5 -> 9
	 * 
	 * Conditions:
	 *  numbers.length <= 5
	 *  number.values > 0
	 */
	@Test
	public void test3() {
		int[] numbers = {1,2};
		
		assertEquals(2, exercises.maxAbsolute(numbers));
	}
	
	/*
	 * Test the path 1 -> 2 -> 4 -> 5 -> 6 -> 8 -> 5 -> 6 -> 8 -> 5 -> 9
	 * 
	 * Conditions:
	 *  numbers.length <= 5
	 *  number.values < 0
	 */
	@Test
	public void test4() {
		int[] numbers = {-1, -2};
		
		assertEquals(2, exercises.maxAbsolute(numbers));
	}
		
}
