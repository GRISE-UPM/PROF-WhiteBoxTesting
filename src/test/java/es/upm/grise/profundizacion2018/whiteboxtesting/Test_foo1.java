package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	Exercises ex = new Exercises();

	@Test
	public void test_xMenorQue5() {
		assertTrue(ex.foo1(1, 1) == 1);
	}
	
	@Test
	public void test_xMayorQue5() {
		assertTrue(ex.foo1(10, 1) == (float)(0.05));
	}

}
