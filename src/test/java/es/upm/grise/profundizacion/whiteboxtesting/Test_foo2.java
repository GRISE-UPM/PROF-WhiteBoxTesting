package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_foo2 {


	private Exercises exercises;

	@BeforeEach
	public void beforeEach() {
		this.exercises = new Exercises();
	}


	@DisplayName("The result of 5 and 15 is 7.5")
	@Test()
	public void result_5_15_is_7dot5() {
		int a = 5;
		int b = 10;
		double expectedResult = 7.5;

		assertEquals(expectedResult, exercises.foo2(a, b), 0.0001);
	}

	@DisplayName("The result of 10 and 6 is 8")
	@Test()
	public void result_10_6_is_8() {
		int a = 10;
		int b = 6;
		double expectedResult = 8;

		assertEquals(expectedResult, exercises.foo2(a, b), 0.0001);
	}

	@DisplayName("The result of 4 and 5 is 2")
	@Test()
	public void result_4_5_is_8() {
		int a = 4;
		int b = 5;
		double expectedResult = 2;

		assertEquals(expectedResult, exercises.foo2(a, b), 0.0001);
	}
}
