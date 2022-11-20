package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_maxAbsolute {

	private Exercises e = new Exercises();
	private int [] arr;
	
	@Test
	public void maxAbsoluteArrayMayor5Test() {
		arr = new int[10];
		assertEquals(-1, e.maxAbsolute(arr));
	}
	
	@Test
	public void maxAbsoluteEmptyArrayTest() {
		arr = new int[0];
		assertEquals(0, e.maxAbsolute(arr));
	}
	
	@Test
	public void maxAbsoluteReturnAbsoluteTest() {
		arr = new int [] {1,5,3};
		assertEquals(5, e.maxAbsolute(arr));
	}
	
	@Test
	public void maxAbsoluteReturnAbsoluteNegativeTest() {
		arr = new int [] {-1,-5,-3};
		assertEquals(5, e.maxAbsolute(arr));
	}
	
	@Test
	public void maxAbsoluteReturnAbsolutePostitiveNegativeTest() {
		arr = new int [] {1,-5,3,-4};
		assertEquals(5, e.maxAbsolute(arr));
	}

}
