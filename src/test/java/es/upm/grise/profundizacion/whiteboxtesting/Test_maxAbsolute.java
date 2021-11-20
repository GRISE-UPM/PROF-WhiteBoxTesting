package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	Exercises exercises;

	@BeforeEach
	public void configure() {
		exercises = new Exercises();
	}
	
	@Test
	public void maxAbsolute_case1_Test() {
		int[] numbers = { 3, 6, 9 };
		assertEquals(9, exercises.maxAbsolute(numbers));
	}

	@Test
	public void maxAbsolute_case2_test() {
		int[] numbers = { 3, 6, 9, 8, 6, 2 };
		assertEquals(-1, exercises.maxAbsolute(numbers));
	}
	
	@Test
	public void maxAbsolute_case3_test() {
		int[] numbers = { -3 };
		assertEquals(3, exercises.maxAbsolute(numbers));
	}
}
