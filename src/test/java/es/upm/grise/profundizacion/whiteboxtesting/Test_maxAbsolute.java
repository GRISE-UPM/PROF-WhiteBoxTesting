package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_maxAbsolute {
	private final Exercises myExercises = new Exercises();

	@Test
	public void biggerArrayTest() {
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		int res =  myExercises.maxAbsolute(numbers);
		// Expect the first stop condition
		assertEquals(-1, res);
	}

	@Test
	public void emptyArrayTest() {
		int [] numbers = {};
		int res =  myExercises.maxAbsolute(numbers);
		assertEquals(0, res);
	}

	@Test
	public void positiveNegativeNumbersTest() {
		int [] number = {1,-10,9,11};
		int res =  myExercises.maxAbsolute(number);
		assertEquals(11, res);
	}

}
