package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test_foo2 {

	Exercises exercise;

	@Before
	public void setup() {
		exercise = new Exercises();
	}

	@Test
	public void x_smaller_than_y_and_cos_x_bigger_than_0_and_cos_y_smaller_than_0() {
		float x = (float)30.0;
		float y = (float)60.0;

		assertEquals((x+y)/2, exercise.foo2(x, y), 0.01);
	}

	@Test
	public void x_bigger_than_y_and_cos_x_smaller_than_0() {
		float x = (float)90.0;
		float y = (float)60.0;

		assertEquals(2.0, exercise.foo2(x, y), 0.01);
	}

	@Test
	public void x_bigger_than_y_and_cos_y_bigger_than_0() {
		float x = (float)120.0;
		float y = (float)100.0;

		assertEquals(2.0, exercise.foo2(x, y), 0.01);
	}

	@Test
	public void x_smaller_than_y_and_cos_x_smaller_than_0() {
		float x = (float)60.0;
		float y = (float)90.0;

		assertEquals(2.0, exercise.foo2(x, y), 0.01);
	}

}
