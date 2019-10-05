package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test_foo1 {
	Exercises testFoo1 = new Exercises();
	
	/* 1º camino posible de foo1 x > 5 */
	@Test
	public void Test_foo1_xgreater_than_5() {
		assertEquals(32/16,testFoo1.foo1(6, 32),0.0f);
	}
	
	/*2º camino posible de foo1 para x == 5  y x < 5 */
	
	@Test
	public void Test_foo1_xless_than_6() {
		assertEquals(1, testFoo1.foo1(1, 1), 0.0f);
		assertEquals(-1/5f, testFoo1.foo1(5, -1), 0.01f);
		
		
		
	}
	


}
