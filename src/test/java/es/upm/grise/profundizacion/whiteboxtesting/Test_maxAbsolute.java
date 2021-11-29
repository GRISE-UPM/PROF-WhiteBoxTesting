package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import java.sql.Array;

public class Test_maxAbsolute {

	Exercises exercise = new Exercises();

	@Test
	public void test1() {

		int[] numbers = {2,1,3,4,-5,2};

		assertEquals(-1, exercise.maxAbsolute(numbers));
	}

	@Test
	public void test2() {

		int[] numbers = {2,1,3,4,2};

		assertEquals(4, exercise.maxAbsolute(numbers));
	}

	@Test
	public void test3() {

		int[] numbers = {-2,1,-3,4,2};

		assertEquals(4, exercise.maxAbsolute(numbers));
	}

}
