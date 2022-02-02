package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_foo2 {
	
	static Exercises exercises;

	@BeforeEach
	void setup() {
		exercises = new Exercises();
	}
	
	@Test
	public void testASmallerThanB() {
		Exercises exercises = new Exercises();
		assertEquals(exercises.foo2(1/2, 1), 2, 0.001);
	}
	
	@Test
	public void testAGreaterThanB() {
		Exercises exercises = new Exercises();
		assertEquals(exercises.foo2(1, 1/2), 2, 0.001);
	}
	
	@Test
	public void testNotEnteringCosenus() {
		Exercises exercises = new Exercises();
		double b = Math.cos(1);
		assertEquals(exercises.foo2(1, 90), 45.5, 0.001);
	}

}
