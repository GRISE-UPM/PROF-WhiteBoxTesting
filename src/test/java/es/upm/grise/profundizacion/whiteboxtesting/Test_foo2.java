package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	private final Exercises myExercises = new Exercises();
	@Test
	public void aBiggerBTest() {
		float a = 1;
		float b = 0;
		float res =  myExercises.foo2(a,b);
		assertEquals(2, res, 0.00001);
	}

	@Test
	public void bBiggerATest() {
		float a = 0;
		float b = 1;
		float res =  myExercises.foo2(a,b);
		assertEquals(2, res, 0.00001);
	}

}
