package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Test_maxAbsolute {

	////////////////////////////////////////////////// RANDOMIZATION ///////////////////////////////////////////////////

	private static final Random random = new SecureRandom();

	///////////////////////////////////////////////////// TESTING //////////////////////////////////////////////////////

	private Exercises exercises = new Exercises();
	
	@Test
	public void test_exception() {
		try {
			exercises.maxAbsolute(null);
		} catch (Exception e ) {
			assertTrue(e instanceof NullPointerException);
		}
	}
	
	@Test
	public void test_empty() {
		int result = exercises.maxAbsolute(new int[0]);
		assertEquals(0, result);
	}

	@Test
	public void test_limit() {
		int[] numbers = new int[6 + random.nextInt(0xFF - 5)];
		int result = exercises.maxAbsolute(numbers);
		assertEquals(-1, result);
	}

	@Test
	public void test() {
		int[][] numberss = new int[][] {
				new int[]{ 3, 3, 3, 3, -2 },
				new int[]{ 1, 1, 1, 1, -2 }
		};
		for (int[] numbers : numberss) {
			int result = exercises.maxAbsolute(numbers);
			int expected = Arrays.stream(numbers).map(Math::abs).max().orElse(-1);
			assertEquals(expected, result);
		}
	}

}
