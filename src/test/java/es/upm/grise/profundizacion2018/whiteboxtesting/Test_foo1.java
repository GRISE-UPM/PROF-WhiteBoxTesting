package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	Exercises testerFoo1_1 = new Exercises();
	Exercises testerFoo1_2 = new Exercises();

	// Test 1: x < 5
	// Test 2: x > 5
	
	@Test
	public void testfoo1lessthan5() {
		assertEquals(1.6f, testerFoo1_1.foo1(1.5f, 2.5f),0.1f);
	}
	
	@Test
	public void testfoo1morethan5() {
		assertEquals(0.13f, testerFoo1_2.foo1(8f, 2.5f),0.1f);
	}
	

}
