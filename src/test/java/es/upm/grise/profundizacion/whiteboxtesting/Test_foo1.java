package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class Test_foo1 {
	
	/*
	 * TEST 1: x <= 5 y x!=0
	 * TEST 2: x > 5
	 */

	@Test
	public void foo1_with_x_less_than_5_and_not_zero_test() {
		Exercises e = new Exercises();		
		float x = (float) 1.0;
		float y = (float) 2.0;
		assertEquals((float)2.0, e.foo1(x,y));
	}
	
	@Test
	public void foo1_with_x_greater_than_5_test() {
		Exercises e = new Exercises();
		float x = (float) 8.0;
		float y = (float) 36.0;
		assertEquals((float)2.0, e.foo1(x, y));
	}
}
