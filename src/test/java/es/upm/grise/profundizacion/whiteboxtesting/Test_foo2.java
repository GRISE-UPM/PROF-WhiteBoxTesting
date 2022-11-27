package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;


public class Test_foo2 {
	
	/*
	 *Caso 1: a > b y Math.cos(a) < 0 o Math.cos(b) > 0
	 *Caso 2: a > b y Math.cos(a) >= 0 y Math.cos(b) <= 0
	 */

	@Test
	public void foo2_enters_second_cond_test() {
		Exercises e = new Exercises();
		float a = (float) 3.0;
		float b = (float) 2.0;
		assertEquals((float)2.0,e.foo2(a, b));
		
	}
	
	@Test
	public void foo2_does_not_enter_second_cond_test() {
		Exercises e = new Exercises();
		float a = (float) 0.0;
		float b = (float) 2.0;
		assertEquals((float)1.0,e.foo2(a, b));
	}
}
