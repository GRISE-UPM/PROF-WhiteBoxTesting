package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_maxAbsolute {

	private Exercises exercises;

	@BeforeEach
	public void beforeEach() {
		this.exercises = new Exercises();
	}


	@DisplayName("The max value is 10")
	@Test()
	public void max_value_is_10() {
		int[] x = new int[]{ 1,10,3,4,10 };
		int expectedResult = 10;

		assertEquals(expectedResult, exercises.maxAbsolute(x));
	}

	@DisplayName("More than 5 values")
	@Test()
	public void more_than_5_values() {
		int[] x = new int[]{ 1,10,3,4,10,6 };
		int expectedResult = -1;

		assertEquals(expectedResult, exercises.maxAbsolute(x));
	}

	@DisplayName("One negative value")
	@Test()
	public void one_negative_value() {
		int[] x = new int[]{ 1,-10,3,4,9 };
		int expectedResult = 10;

		assertEquals(expectedResult, exercises.maxAbsolute(x));
	}
}
