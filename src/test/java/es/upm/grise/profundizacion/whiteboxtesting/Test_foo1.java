package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

// OSCAR: Sobrarían, en teoría, dos casos de prueba, ya que la complejidad ciclomatica = 2
// Sin embargo, ni siquiera logras una coberta del 100% con estos casos de prueba. Te falta
// ensayar el caso x > 5

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
