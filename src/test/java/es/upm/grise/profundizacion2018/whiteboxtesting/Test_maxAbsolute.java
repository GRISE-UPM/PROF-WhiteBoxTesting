package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {
	
	private Exercises ex;
	
	@Before
	public void loadClass() {
		ex = new Exercises();
	}
	
	@Test
	public void arrayTooLong() {
		int[] nums = {1, 1, 1, 1, 1, 1, 1, 1, 1};
		assertEquals(ex.max_absolute(nums), -1, 0.001);
	}
	
	@Test
	public void normalMax() {
		int[] nums = {1, 2, 3, 2};
		assertEquals(ex.max_absolute(nums), 3, 0.001);
	}
	
	@Test
	public void negativeAbsoluteMax() {
		int[] nums = {1, 2, -3, 2};
		assertEquals(ex.max_absolute(nums), 3, 0.001);
	}

}
