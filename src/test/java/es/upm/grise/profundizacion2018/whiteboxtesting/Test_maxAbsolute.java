package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	@Test
	public void test() {
		Exercises e = new Exercises();
		int[] numbers = {1, 2, 3, 4, 5, 6};
		assertTrue(e.max_absolute(numbers) == -1);
	}
	
	@Test
	public void test2() {
		Exercises e = new Exercises();
		int[] numbers = {1, 2, 3, 4, -5};
		assertTrue(e.max_absolute(numbers) == 5);
	}
	
	// with the previous one we already checked the part thats corresponds to those 
	//positive numbers
	
	/*@Test
	public void test3() {
		Exercises e = new Exercises();
		int[] numbers = {1, 2, 3, 4, 5};
		assertTrue(e.max_absolute(numbers) == 5);
	}*/

}
