package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_foo1 {

	private final Exercises exercises = new Exercises();
	private static final float EPSILON = 0.001f;

	@Test
	public void testXisGreaterThanFive() {
		assertEquals(0.5, exercises.foo1(10,10), EPSILON);
	}

	@Test
	public void testXisEqualToFive() {
		assertEquals(2, exercises.foo1(5,10), EPSILON);
	}

	@Test
	public void testXisLessThanFive() {
		assertEquals(2, exercises.foo1(3,6), EPSILON);
	}

	@Test
	public void testDivideZero() {
		assertEquals(0, exercises.foo1(10, 0), EPSILON);
	}

	@Test
	public void testPositiveDivisionByZero() {
		assertEquals(Float.POSITIVE_INFINITY, exercises.foo1(0, 10), EPSILON);
	}

	@Test
	public void testNegativeDivisionByZero() {
		assertEquals(Float.NEGATIVE_INFINITY, exercises.foo1(0, -10), EPSILON);
	}

	@Test
	public void testZeroDivisionByZero() {
		assertEquals(Float.NaN, exercises.foo1(0, 0), EPSILON);
	}

}
