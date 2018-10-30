package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {

	private Exercises exercises;

	@Before
	public void setUp() {
		exercises = new Exercises();
	}

	@Test
	public void test_numbers_array_length_greater_than_5() {
		int result = exercises.max_absolute(new int[]{1,2,3,4,5,6,});
		assertEquals(result, -1);
	}

	@Test
	public void test_numbers_array_length_equal_than_5() {
		int result = exercises.max_absolute(new int[]{2,3,-4,5,-6});
		assertEquals(result, 6);
	}

}
