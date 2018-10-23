package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo1 {

	Exercises ex = new Exercises();

	@Test
	public void test_xMenorQue5() {
		assertEquals(ex.foo1(1, 1), 1, 0.01);
	}
	
	@Test
	public void test_xMayorQue5() {
		assertEquals(ex.foo1(10, 1), (float)(0.05), 0.01);
	}

}
