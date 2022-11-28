package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises exercises = new Exercises();

	@Test
	public void maxAbsoluteTestLengthGreater5() {
		assertEquals(-1, exercises.maxAbsolute(new int[]{1, 2, 3, 4, 5, 6}));
	}


	@Test
	public void maxAbsoluteTest() {
		assertEquals(5, exercises.maxAbsolute(new int[]{1, 2, -3, 4, 5}));
	}

}
