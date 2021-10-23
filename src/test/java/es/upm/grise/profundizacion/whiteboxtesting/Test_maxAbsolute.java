package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class Test_maxAbsolute {

	@BeforeAll
	public static void setUp() {
		System.out.println("Setting up foo2 test...");
	}

	@Test
	@DisplayName("Test with an array of more that 5 elements that should return -1")
	public void shouldReturnNegOneBecauseArrayIsTooLong() {
		assertEquals(-1, (new Exercises()).maxAbsolute(new int[6]), 0);
	}

	@Test
	@DisplayName("Test with an array of zeroes that should return 0")
	public void shouldReturnZeroBecauseArrayOfZeroes() {
		int[] numbers = {0, 0, 0, 0};
		assertEquals(0, (new Exercises()).maxAbsolute(numbers), 0);
	}

	@Test
	@DisplayName("Test with an array of negative numbers that should return 3")
	public void shouldReturnCorrectValueForArrayOfNegNumbers() {
		int[] numbers = {-2, -1, -3};
		assertEquals(3, (new Exercises()).maxAbsolute(numbers), 0);
	}

	@Test
	@DisplayName("Test with an array of positive and negative numbers that should return 4")
	public void shouldReturnCorrectValueForArrayOfPosAndNegNumbers() {
		int[] numbers = {-3, -1, 4};
		assertEquals(4, (new Exercises()).maxAbsolute(numbers), 0);
	}

	@AfterAll
	public static void tearDown() {
		System.out.println("foo2 tests done.");
	}
}
