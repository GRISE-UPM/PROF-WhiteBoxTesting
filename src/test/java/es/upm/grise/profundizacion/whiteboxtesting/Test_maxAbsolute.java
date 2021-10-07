package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class Test_maxAbsolute {

	private static Exercises exercises;

	@BeforeAll
	void setUp() {
		System.out.println("Setting up foo2 test...");
		exercises = new Exercises();
	}

	@Test
	@DisplayName("Test with an array of more that 5 elements that should return -1")
	void arrayOfLessThanFiveElements() {
		assertEquals(-1, exercises.maxAbsolute(new int[6]), 0);
	}

	@Test
	@DisplayName("Test with an array of zeroes that should return 0")
	void maxOfArrayWithAllZeroes() {
		int[] numbers = {0, 0, 0, 0};
		assertEquals(0, exercises.maxAbsolute(numbers), 0);
	}

	@Test
	@DisplayName("Test with an array of negative numbers that should return 3")
	void maxOfArrayWithAllNegativeIntegers() {
		int[] numbers = {-2, -1, -3};
		assertEquals(3, exercises.maxAbsolute(numbers), 0);
	}

	@Test
	@DisplayName("Test with an array of positive and negative numbers that should return 4")
	void maxOfArrayWithNegAndPosNumbers() {
		int[] numbers = {-3, -1, 4};
		assertEquals(3, exercises.maxAbsolute(numbers), 0);
	}

	@AfterAll
	void tearDown() {
		System.out.println("foo2 tests done.");
	}

}
