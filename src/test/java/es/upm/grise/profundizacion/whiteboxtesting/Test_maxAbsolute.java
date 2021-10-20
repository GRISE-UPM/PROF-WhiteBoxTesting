package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	@Test
	public void test() {
		Exercises exercise = new Exercises();
		int [] numbers = {2,3,8,5};
		assertEquals(8, exercise.maxAbsolute(numbers), 0);
	}

}
