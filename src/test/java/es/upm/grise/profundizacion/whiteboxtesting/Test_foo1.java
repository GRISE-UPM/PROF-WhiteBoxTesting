package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test_foo1 {

	Exercises exercise;

	@Before
	public void setup() {
		exercise = new Exercises();
	}

	@Test
	public void number_x_positive_y_positive_OK() {
		assertEquals(2.0, exercise.foo1(1, 2), 0.01);
	}

	@Test
	public void number_x_negative_y_positive_OK() {
		assertEquals(-2.0, exercise.foo1(-1, 2), 0.01);
	}

	@Test
	public void number_x_positive_y_negative_OK() {
		assertEquals(-2.0, exercise.foo1(1, -2), 0.01);
	}

	@Test
	public void number_x_negative_y_negative_OK() {
		assertEquals(2.0, exercise.foo1(-1, -2), 0.01);
	}

}
