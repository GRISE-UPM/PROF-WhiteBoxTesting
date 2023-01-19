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
	// Structural test cases - 5 areas
	// 1. a > b && cos(a) < 0 && cos(b) > 0
	@Test
	public void aBiggerBCosATest() {
		float a = 1;
		float b = 0;
		float res =  myExercises.foo2(a,b);
		assertEquals(2, res, 0.00001);
	}
	// 2. a > b && cos(a) < 0 && cos(b) < 0
	@Test
	public void aBiggerBCosBTest() {
		float a = 1;
		float b = 0;
		float res =  myExercises.foo2(a,b);
		assertEquals(2, res, 0.00001);
	}
	// 3. a > b && cos(a) > 0 && cos(b) > 0
	@Test
	public void aBiggerBCosATest2() {
		float a = 1;
		float b = 0;
		float res =  myExercises.foo2(a,b);
		assertEquals(2, res, 0.00001);
	}

	// 4. a < b && cos(a) < 0 && cos(b) > 0
	@Test
	public void bBiggerBCosATest() {
		float a = 0;
		float b = 1;
		float res =  myExercises.foo2(a,b);
		assertEquals(2, res, 0.00001);
	}




}
