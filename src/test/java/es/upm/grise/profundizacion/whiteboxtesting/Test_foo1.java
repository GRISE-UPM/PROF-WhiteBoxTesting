package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_foo1 {

	Exercises exercises;

	@Before
	public void beforeEach() {
		this.exercises = new Exercises();
	}


	@DisplayName("The result of 5 and 15 is 2")
	@Test()
	public void result_5_15_is_2() {
		int x = 5;
		int y = 10;
		int expectedResult = 2;

		assertEquals(expectedResult, exercises.foo1(x,y), 0.0001);
	}

}
