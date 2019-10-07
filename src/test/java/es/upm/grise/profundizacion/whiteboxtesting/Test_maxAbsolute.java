package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	@Test
	public void test_length() {
		Exercises ex= new Exercises();
		assertEquals(-1, ex.maxAbsolute(new int[]{1,2,3,4,5,6}));
		}

	@Test
	public void test_noFor() {
		Exercises ex= new Exercises();
		assertEquals(0, ex.maxAbsolute(new int[]{}));
		}
	
	@Test
	public void test_forIf() {
		Exercises ex= new Exercises();
		assertEquals(3, ex.maxAbsolute(new int[]{-3,-2}));
		}
	
	@Test
	public void test_forElse() {
		Exercises ex= new Exercises();
		assertEquals(3, ex.maxAbsolute(new int[]{3, 2}));
		}
	
	@Test
	public void test_forIfElse() {
		Exercises ex= new Exercises();
		assertEquals(3, ex.maxAbsolute(new int[]{-3, 2}));
		}
}
