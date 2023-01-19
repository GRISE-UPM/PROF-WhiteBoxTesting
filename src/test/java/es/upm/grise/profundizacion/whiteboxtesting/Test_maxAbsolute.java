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

	// Structural test cases - 3 areas
	// 1. numbers.length > 5
	@Test
	public void biggerArrayTest2() {
		int [] numbers = {1,2,3,4,5,6,7,8,9};
		int res =  myExercises.maxAbsolute(numbers);
		// Expect the first stop condition
		assertEquals(-1, res);
	}

	// 2. numbers.length <= 5 and numbers > 0
	@Test
	public void positiveNumbersTest() {
		int [] numbers = {1,2,3,4,5};
		int res =  myExercises.maxAbsolute(numbers);
		assertEquals(5, res);
	}

	// 3. numbers.length <= 5 and numbers < 0
	@Test
	public void negativeNumbersTest() {
		int [] numbers = {-1,-2,-3,-4,-5};
		int res =  myExercises.maxAbsolute(numbers);
		assertEquals(-1, res);
	}

}
