package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	private final Exercises exercises = new Exercises(); 

	@Test
	public void testArrayTooBig() {
		assertEquals(-1, exercises.maxAbsolute(new int[]{1,2,3,4,5,6}));
	}

	@Test
	public void testEqualNumbers() {
		assertEquals(4, exercises.maxAbsolute(new int[]{2,4,4,2}));
	}

	@Test
	public void testEqualNegative() {
		assertEquals(4, exercises.maxAbsolute(new int[]{2,-4,4,2}));
	}

	@Test
	public void testMaxIsNegative() {
		assertEquals(7, exercises.maxAbsolute(new int[]{2,-7,4,2}));
	}

	@Test
	public void testOnlyNegatives() {
		assertEquals(7, exercises.maxAbsolute(new int[]{-2,-7,-4,-3}));
	}

}
