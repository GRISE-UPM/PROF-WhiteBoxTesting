package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class Test_foo1 {

	private static Exercises exercise;

	@Test
	public void xEsMayorQue5() {
		exercise = new Exercises();
		assertEquals(2.0, exercise.foo1(10.0f, 40.0f), 0.01f);
	}

	@Test
	public void xEsMenorOIgualA5() {
		exercise = new Exercises();
		assertEquals(10.0, exercise.foo1(4.0f, 40.0f), 0.01f);
	}
}
