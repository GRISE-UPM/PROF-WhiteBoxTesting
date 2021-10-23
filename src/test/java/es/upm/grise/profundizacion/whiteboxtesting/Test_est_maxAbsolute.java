package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class Test_est_maxAbsolute {

	@BeforeAll
	public static void setUp() {
		System.out.println("Setting up foo2 test...");
	}

	/*
	 * 1 - numbers.length > 5
	 * 2 - numbers.length <= 5
	 * 3 - numbers[i] < 0
	 * 4 - numbers[i] >= 0
	 *        __|__
	 *       /     \
	 *      2      1
	 *           /   \
	 *          3     4
	 */

	@Test
	@DisplayName("Test in which the length of the array is less than 5")
	public void numbers_len_less_eq_5() {
		int[] list = { 1, 2, 3, 4 };
		assertEquals(4, (new Exercises()).maxAbsolute(list), 0);
	}

	@Test
	@DisplayName("Test in which the array has a negative value")
	public void number_len_greater_5_num_less_eq_0() {
		int[] list = { -1, 4, 5, 6 };
		assertEquals(6, (new Exercises()).maxAbsolute(list), 0.01);
	}

	@Test
	@DisplayName("Test in which the array only has positive values")
	public void number_len_greater_5() {
		int[] list = { 1, 2, 3, 4, 5, 6 };
		assertEquals(-1, (new Exercises()).maxAbsolute(list), 0);
	}

	@AfterAll
	public static void tearDown() {
		System.out.println("foo2 tests done.");
	}
}
