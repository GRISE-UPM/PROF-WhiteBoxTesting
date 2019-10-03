package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {

	Exercises exercise;

	@Before
	public void setup() {
		exercise = new Exercises();
	}

	@Test
	public void length_numbers_longer_than_5_digits() {
		int [] numbers = { 9, -9, 9, -9, 9, -9 };

		assertEquals(-1, exercise.maxAbsolute(numbers));
	}

	@Test
	public void max_number_OK() {
		int [] numbers = { 1, -2, 3, -4, 5 };

		assertEquals(5, exercise.maxAbsolute(numbers));
	}

}
