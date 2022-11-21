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
		int[] n1 = {1, 3, 7, 0, -23};
		int[] n2 = {1, 3, 7, 14};
		int[] n3 = {14, 78, 345, 0, -23};
		assertEquals(23, e.maxAbsolute(n1));
		assertEquals(14, e.maxAbsolute(n2));
		assertEquals(345, e.maxAbsolute(n3));
	}

}
