package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.Random;

public class Test_foo1 {

	////////////////////////////////////////////////// RANDOMIZATION ///////////////////////////////////////////////////

	private static final Random random = new SecureRandom();

	private static double inRangeClosed(double min, double max) {
		return min + (max - min) * random.nextDouble();
	}

	private static float inRangeClosed(float min, float max) {
		return (float) inRangeClosed((double) min, (double) max);
	}

	///////////////////////////////////////////////////// TESTING //////////////////////////////////////////////////////

	private Exercises exercises = new Exercises();

	@Test
	public void test_exception_minus_10() {
		float x = -10.0F;
		float y = random.nextFloat();
		try {
			exercises.foo1(x, y);
		} catch (Exception e) {
			assertTrue(e instanceof ArithmeticException);
		}
	}
	
	@Test
	@SuppressWarnings("StatementWithEmptyBody")
	public void test_less_than_or_equal_to_5_but_not_minus_ten() {
		float x;
		while ((x = inRangeClosed(Float.MIN_VALUE, 5.0F)) == -10.0F);
		float y = random.nextFloat();
		float result = exercises.foo1(x, y);
		assertEquals(y / x, result, 0.0F);
	}

	@Test
	public void test_bigger_than_5() {
		float x = inRangeClosed(5 + Float.MIN_NORMAL, Float.MAX_VALUE);
		float y = random.nextFloat();
		float result = exercises.foo1(x, y);
		assertEquals(y / (x + 10.0F), result, 0.0F);
	}

}
