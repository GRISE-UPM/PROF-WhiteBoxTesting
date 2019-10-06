package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {

	Exercises exercises;
	public static final float DELTA =  0.001F;
	
	@Before
	public void setUp() {
		exercises = new Exercises();
	}
	
	@Test
	public void testLengthGreaterThan5() {
		assertEquals(-1, exercises.maxAbsolute(new int []{1,5,7,1,5,7}));
	}
	
	@Test
	public void testLength0() {
		assertEquals(0, exercises.maxAbsolute(new int[]{}));
	}
	
	@Test
	public void testLength1() {
		assertEquals(1, exercises.maxAbsolute(new int[]{-1}));
	}
	
	@Test
	public void testNoNegatives() {
		assertEquals(5, exercises.maxAbsolute(new int []{1,5}));
	}
	
	@Test
	public void testAllNegatives() {
		assertEquals(5, exercises.maxAbsolute(new int []{-1,-5}));
	}
	
	@Test
	public void testSignedAlterned() {
		assertEquals(8, exercises.maxAbsolute(new int []{-1,5,-3,8,-4}));
	}
}
