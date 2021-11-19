package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	private static Exercises exercise;
	@Test
	public void aMenorQueB() {
		exercise = new Exercises();
		assertEquals(2.0, exercise.foo2(10.0f, 40.0f), 0.01f);
	}

	@Test
	public void aMayorQueB() {
		exercise = new Exercises();
		assertEquals(2.0, exercise.foo2(40.0f, 10.0f), 0.01f);
	}

}
