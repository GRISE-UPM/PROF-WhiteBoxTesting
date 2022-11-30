package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Assert;
import org.junit.Test;

public class Test_maxAbsolute {

	Exercises exercises = new Exercises();

	@Test
	public void testMaxValueEmpty() {
		Assert.assertEquals(0, exercises.maxAbsolute(new int[]{}));

	}


	@Test
	public void testMaxValueZero() {
		Assert.assertEquals(0, exercises.maxAbsolute(new int[]{0,0,0,0}));

	}

	@Test
	public void testMaxValueTooLarge() {
		Assert.assertEquals(-1, exercises.maxAbsolute(new int[]{1,1,1,1,1,1,1,1,1}));

	}

	@Test
	public void testMaxValueNegatives() {
		Assert.assertEquals(234, exercises.maxAbsolute(new int[]{-234,-1, 1, 233}));

	}

	@Test
	public void testMaxValueNoNegatives() {
		Assert.assertEquals(234, exercises.maxAbsolute(new int[]{234,1, 1, 233}));

	}

	// Null isn't checked as parameter is annotated @NonNull


}
