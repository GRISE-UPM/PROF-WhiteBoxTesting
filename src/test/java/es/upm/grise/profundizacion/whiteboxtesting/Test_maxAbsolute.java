package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises ex = new Exercises();
	
	@Test
	public void testMaxAbsolute_all_positive_numbers() {
		int[] numbers = {1, 2, 3, 4, 5};
		int expected = 5;
		int result = ex.maxAbsolute(numbers);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxAbsolute_mixed_numbers() {
		int[] numbers = {1, -2, 3, -4, 5};
		int expected = 5;
		int result = ex.maxAbsolute(numbers);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxAbsolute_all_negative_numbers() {
		int[] numbers = {-1, -2, -3, -4, -5};
		int expected = 5;
		int result = ex.maxAbsolute(numbers);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxAbsolute_length_greater_than_five() {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int expected = -1;
		int result = ex.maxAbsolute(numbers);
		assertEquals(expected, result);
	}
	
	@Test
	public void testMaxAbsolute_a_b_zero() {
		int arr[]= new int[10];
		int expected = -1;
		int result = ex.maxAbsolute(arr);
		assertEquals(expected, result);
	}
	
}
