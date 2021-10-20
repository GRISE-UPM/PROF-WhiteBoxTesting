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
}
