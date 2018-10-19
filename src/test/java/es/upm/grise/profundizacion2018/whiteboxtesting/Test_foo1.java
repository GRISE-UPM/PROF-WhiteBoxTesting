package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	private Exercises ex = new Exercises();;
		
	@Test
	public void x4doesnotadd10() {
		float x = 4;
		float y = 8;
		float actual = ex.foo1(x, y);
		float expected = 2;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual, 0.01);
	}
	
	@Test
	public void x6doesadd10() {
		float x = 6;
		float y = 16;
		float actual = ex.foo1(x, y);
		float expected = 1;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual, 0.01);
	}

}
