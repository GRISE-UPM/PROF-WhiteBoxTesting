package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.Assert;
import org.junit.Test;

public class Test_foo1 {
	Exercises exercises = new Exercises();

	@Test
	public void testDivisionBy0() {
		Assert.assertTrue(Float.isInfinite(exercises.foo1(0, 1)));

	}
	@Test
	public void testDivisionBy5() {
		Assert.assertEquals(10f/5, exercises.foo1(5, 10), 0.1f);

	}
	@Test
	public void testDivisionBy6() {
		Assert.assertEquals(10f/16, exercises.foo1(6, 10), 0.1f);

	}

	@Test
	public void testDivisionBy4() {
		Assert.assertEquals(10f/4, exercises.foo1(4, 10), 0.1f);

	}


}
