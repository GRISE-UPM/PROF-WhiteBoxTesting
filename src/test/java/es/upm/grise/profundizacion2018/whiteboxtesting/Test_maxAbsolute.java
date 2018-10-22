package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	private Exercises ex = new Exercises();
	
	@Test
	public void more_than_5_elements() {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int actual = ex.max_absolute(numbers);
		int expected = -1;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual, 0.01);
	}
	
	@Test
	public void less_than_5_elements_both_positive_and_negative() {
		int[] numbers = {1, -2, 3, 4, -6};
		int actual = ex.max_absolute(numbers);
		int expected = 6;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual, 0.01);
	}

}
