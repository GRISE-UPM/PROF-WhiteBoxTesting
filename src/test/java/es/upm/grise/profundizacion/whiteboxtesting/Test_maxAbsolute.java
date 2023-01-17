package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {
	
	Exercises e = new Exercises();

	@Test
	public void more_than_5_numbers() {
		int[] n = {1, 3, 7, 14, 78, 345, 0, -23};
		assertEquals(-1, e.maxAbsolute(n));
	}
	
	@Test
	public void less_than_5_numbers() {
		int[] n1 = {1, 3, 7, 2};
		assertEquals(7, e.maxAbsolute(n1));
	}
	
	@Test
	public void numbers_5() {
		int[] n1 = {1, 3, -7, 0, 350};
		assertEquals(350, e.maxAbsolute(n1));
	}
	
	@Test
	public void negative_numbers_only() {
		int[] n1 = {-1, -3, -7, -360};
		assertEquals(360, e.maxAbsolute(n1));
	}
	
	@Test
	public void positive_negative_numbers_only() {
		int[] n1 = {1, -3, 7, -360};
		assertEquals(360, e.maxAbsolute(n1));
	}

}
