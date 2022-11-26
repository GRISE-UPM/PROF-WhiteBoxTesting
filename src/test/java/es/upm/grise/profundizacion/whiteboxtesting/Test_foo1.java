package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_foo1 {
	
	Exercises e = new Exercises();	

	@Test
	public void xEquals5test() {
		float x = 5;
		float y = 10;
		assertEquals(2, e.foo1(x, y));
	}
	
	// test si x == 0
	@Test	
	public void xSmallerThan5test() {
		float x = 0;
		float y = 5;
		assertEquals(Float.POSITIVE_INFINITY, e.foo1(x, y));
	}
	
	@Test
	public void xGreaterThan5test() {
		float x = 10;
		float y = 200;
		assertEquals(10, e.foo1(x, y));
	}

}
