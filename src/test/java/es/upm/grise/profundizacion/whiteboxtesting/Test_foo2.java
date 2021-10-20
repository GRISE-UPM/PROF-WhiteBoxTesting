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
		int x = 5;
		int y = 10;
		double expectedResult = 7.5;

		assertEquals(expectedResult, exercises.foo2(x,y), 0.0001);
	}
}
