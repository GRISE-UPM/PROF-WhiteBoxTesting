package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_maxAbsolute {

	private final Exercises exercises = new Exercises();

	@BeforeAll
	static public void beforeAll() {
		System.out.println("maxAbsolute tests started");
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("maxAbsolute tests finished");
	}

	@Test
	public void test_emptyList() {
		int [] numbers = new int[] {};
		assertEquals(0, exercises.maxAbsolute(numbers));
	}

	@Test
	public void test_lengthGT5() {
		int [] numbers = new int[] {0,1,2,3,4,5};
		assertEquals(-1, exercises.maxAbsolute(numbers));
	}

	@Test
	public void test_lengthLE5_maxValuePOS() {
		int [] numbers = new int[] {0,1,2};
		assertEquals(2, exercises.maxAbsolute(numbers));
	}

	@Test
	public void test_lengthLE5_maxValueNEG() {
		int [] numbers = new int[] {0,1,-2};
		assertEquals(2, exercises.maxAbsolute(numbers));
	}

}
