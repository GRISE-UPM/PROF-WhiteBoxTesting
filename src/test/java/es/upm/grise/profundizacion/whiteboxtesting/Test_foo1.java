package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	Exercises exercises = new Exercises();
	@Test
	public void foo1PositiveNumberTest() {
		assertEquals(0.5, exercises.foo1(8.0F, 9.0F), 0.0);
	}

	@Test
	public void foo1PositiveNumberTest2() {
		assertEquals(3.0, exercises.foo1(3.0F, 9.0F), 0.0);
	}

	@Test
	public void foo1NegativeNumberTest() {
		assertEquals(-0.5, exercises.foo1(8.0F, -9.0F), 0.0);
	}

	@Test
	public void foo1NegativeNumberTest2() {
		assertEquals(-3.0, exercises.foo1(-3.0F, 9.0F), 0.0);
	}

}
