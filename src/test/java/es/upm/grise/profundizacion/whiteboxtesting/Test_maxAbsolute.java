package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import java.sql.Array;

public class Test_maxAbsolute {

	@Test
	public void test() {
		Exercises exercise = new Exercises();
		int[] numbers = {2,1,3,4,-5,2};
		// int[] numbersT = {2,1,3,-5,2};

		assertEquals(-1, exercise.maxAbsolute(numbers));
		// assertEquals(5, exercise.maxAbsolute(numbersT));
	}

}
