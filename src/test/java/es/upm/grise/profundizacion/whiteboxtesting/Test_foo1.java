package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_foo1 {

	private Exercises exercises;

	@BeforeEach
	public void beforeEach() {
		this.exercises = new Exercises();
	}


	@DisplayName("The result of 5 and 10 is 2")
	@Test()
	public void result_5_15_is_2() {
		int x = 5;
		int y = 10;
		int expectedResult = 2;

		assertEquals(expectedResult, exercises.foo1(x,y), 0.0001);
	}


	@DisplayName("The result of 10 and 20 is 2")
	@Test()
	public void result_6_15_is_2() {
		int x = 10;
		int y = 20;
		int expectedResult = 1;

		assertEquals(expectedResult, exercises.foo1(x,y), 0.0001);
	}

}
