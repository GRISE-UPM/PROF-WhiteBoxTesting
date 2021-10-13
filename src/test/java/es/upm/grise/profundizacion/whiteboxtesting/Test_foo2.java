package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_foo2 {

	private final Exercises exercises = new Exercises();
	private static final float EPSILON = 0.001f;

	@Test
	public void testAisGreaterThanB() {
		assertEquals(2, exercises.foo2(5, 4), EPSILON);
	}

	@Test
	public void testAisEqualToB() {
		assertEquals(2, exercises.foo2(5, 5), EPSILON);
	}

	@Test
	public void testAisLessThanB() {
		assertEquals(2, exercises.foo2(4, 5), EPSILON);
	}

	@Test
	public void testNotSwapValuesNotIntoCosIf() {
		assertEquals(1.5, exercises.foo2(1,2), EPSILON);
	}

	@Test
	public void testSwapValuesNotIntoCosIf() {
		assertEquals(1.5, exercises.foo2(2,1), EPSILON);
	}
}
