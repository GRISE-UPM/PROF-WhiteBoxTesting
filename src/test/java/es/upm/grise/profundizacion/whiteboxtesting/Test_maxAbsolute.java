package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test_maxAbsolute {

	@Test
	public void test() {

		Exercises exercises = new Exercises();
		int [] numbers = new int[4];
		numbers[0] = -1;
		numbers[1] = 2;
		numbers[2] = -3;
		numbers[3] = 0;
		assertEquals(exercises.maxAbsolute(numbers),3);
	}

}
