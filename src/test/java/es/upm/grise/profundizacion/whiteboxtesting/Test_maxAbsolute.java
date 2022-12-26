package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_maxAbsolute {
	
	private Exercises e = new Exercises();
	private int [] arr;

	@Test
	public void numericValues() {
		arr = new int [2];
		arr[0] = 0;
		arr[1] = 1;
		assertEquals(1, e.maxAbsolute(arr));		
	}

	@Test
	public void nonNumericValues() {
		arr = new int [2];
		arr[0] = 'a';
		arr[1] = 's';
		assertEquals(115, e.maxAbsolute(arr));		
	}
	
	@Test
	public void nullValue() {
		try {
			assertEquals(0, e.maxAbsolute(arr));
		} catch (Exception exp) {
			assertEquals(0, 0);
		}
	}
}
