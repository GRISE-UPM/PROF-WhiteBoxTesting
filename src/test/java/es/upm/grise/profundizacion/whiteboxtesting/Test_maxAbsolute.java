package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises ex = new Exercises();
	
	@Test
	public void length_short() {
		int arr[]= {1,2,3};
		assertEquals(3, ex.maxAbsolute(arr));
	}
	
	@Test
	public void length_long() {
		int arr[]= {1,2,3,4,5};
		assertEquals(-1, ex.maxAbsolute(arr));
	}
	
	@Test
	public void neg_and_pos() {
		int arr[]= {-1,-3,0,1};
		assertEquals(3, ex.maxAbsolute(arr));
	}
	
	@Test
	public void neg_and_pos_shorter() {
		int arr[]= {5,-6};
		assertEquals(6, ex.maxAbsolute(arr));
	}
	
	@Test
	public void a_b_zero() {
		int arr[]= new int[10];
		assertEquals(-1, ex.maxAbsolute(arr));
	}
}
