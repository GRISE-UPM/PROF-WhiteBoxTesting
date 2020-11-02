package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	@Test
	public void lengthge5() {
		Exercises ex = new Exercises();
		int [] list = {1, 2, 3, 4, 5, 6};
		
		assertEquals(-1, ex.maxAbsolute(list));
	}
	
	@Test
	public void positivos() {
		Exercises ex = new Exercises();
		int [] list = {1, 2, 3, 4};
		assertEquals(4, ex.maxAbsolute(list));
		
	}
	
	@Test
	public void negativos() {
		Exercises ex = new Exercises();
		int [] list = {-1, -2, -3, -4};
		assertEquals(4, ex.maxAbsolute(list));
		
	}
	
	@Test
	public void posyneg() {
		Exercises ex = new Exercises();
		int [] list = {-1, 3, -5, 7};
		assertEquals(7, ex.maxAbsolute(list));
		
	}

}
