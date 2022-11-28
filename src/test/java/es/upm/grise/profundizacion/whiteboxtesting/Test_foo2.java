package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	Exercises exercises = new Exercises();

	@Test
	public void foo2NegativeCosNumberTest() {
		assertEquals(2.0, exercises.foo2((float) Math.PI, 9.0F), 0.0);
	}

	@Test
	public void foo2PositiveCosNumberTest() {
		assertEquals(-0.5, exercises.foo1(1F, (float) -0.5), 0.0);
	}

	@Test
	public void foo2AMayorBCosNumberTest() {
		assertEquals(1.5, exercises.foo2(2, 1), 0.0);
	}

}
