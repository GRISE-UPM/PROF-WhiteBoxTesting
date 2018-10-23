package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	Exercises testerFoo2_1 = new Exercises();
	Exercises testerFoo2_2 = new Exercises();
	Exercises testerFoo2_3 = new Exercises();
	Exercises testerFoo2_4 = new Exercises();


	// Test Battery 1
	// Cover all possible cases
	// a > b && b > a
	// cos(a) < 0
	// cos(b) > 0
	// cos(a) > 0
	// cos(b) < 0
	
	@Test
	public void test1() {
		assertEquals(2.0f, testerFoo2_1.foo2(90f, 2.5f),0.1f);
	}
	
	@Test
	public void test2() {
		assertEquals(2.0f, testerFoo2_2.foo2(2f, 5f),0.1f);
	}
	
	@Test
	public void test3() {
		assertEquals(2.0f, testerFoo2_3.foo2(1f, 5f),0.1f);
	}
	
	// Cover last branch with b > a
	@Test
	public void test4() {
		assertEquals(2.5f, testerFoo2_4.foo2(1f, 4f),0.1f);
	}
	
	

}
