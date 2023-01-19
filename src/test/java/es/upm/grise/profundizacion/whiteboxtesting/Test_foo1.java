package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {
	private final Exercises myExercises = new Exercises();
	@Test
	public void xLess5Test() {
		float x = 0;
		float y = 10;
		float res =  myExercises.foo1(x,y);
		assertEquals(Float.POSITIVE_INFINITY, res, 0.00001);
	}

	@Test
	public void xBigger5Test() {
		float x = 10;
		float y = 40;
		float res =  myExercises.foo1(x,y);
		assertEquals(2, res, 0.00001);
	}

	// Structural test cases - 2 areas
	@Test
	public void xLess5yLess0Test() {
		float x = 0;
		float y = -10;
		float res =  myExercises.foo1(x,y);
		assertEquals(Float.NEGATIVE_INFINITY, res, 0.00001);
	}
	@Test
	public void xBigger5yLess0Test() {
		float x = 10;
		float y = -40;
		float res =  myExercises.foo1(x,y);
		assertEquals(-2, res, 0.00001);
	}

}
