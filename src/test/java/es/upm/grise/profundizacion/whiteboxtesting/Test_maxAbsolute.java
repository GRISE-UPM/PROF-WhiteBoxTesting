package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises e = new Exercises();

	@Test
	public void longArraytest() {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		assertEquals(-1, e.maxAbsolute(arr));
	}
	
	@Test
	public void positiveMaxArraytest() {
		int [] arr= {1,100,2,3,4};
		assertEquals(100, e.maxAbsolute(arr));
	}
	
	@Test
	public void negativeMaxArraytest() {
		int [] arr= {1,-100,2,3,4};
		assertEquals(100, e.maxAbsolute(arr));
	}
	
	@Test
	public void emptyArraytest() {
		int [] arr= {};
		assertEquals(0, e.maxAbsolute(arr));
	}
	
}
