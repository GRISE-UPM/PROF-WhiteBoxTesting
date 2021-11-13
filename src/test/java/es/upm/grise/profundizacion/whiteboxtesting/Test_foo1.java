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

}
