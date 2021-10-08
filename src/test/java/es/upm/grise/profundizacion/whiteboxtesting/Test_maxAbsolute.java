package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	@Test
	public void maxAbsoluteTest() {
		int[] numbers = { 3, 6, 9 };
		Exercises exercises = new Exercises();

		int result = exercises.maxAbsolute(numbers);

		assertEquals(9, result);
	}

}
