package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_foo1 {
	
	Exercises e = new Exercises();	
	
	// Hay dos caminos posibles
	// 	1 - 2 - 3 - 4 - 5 (si x > 5)
	//  1 - 2 - 4 - 5

	@Test	
	public void xSmallerThan5test() {
		float x = 5;
		float y = 5;
		assertEquals(1, e.foo1(x, y));
	}
	
	@Test
	public void xGreaterThan5test() {
		float x = 10;
		float y = 200;
		assertEquals(10, e.foo1(x, y));
	}

}
