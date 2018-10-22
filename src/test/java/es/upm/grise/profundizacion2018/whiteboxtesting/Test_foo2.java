package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	Exercises ex = new Exercises();

	@Test
	public void test_IntercambioYFalsoCos() {
		assertTrue(ex.foo2(4, 2) == 2);
	}
	
	@Test
	public void test_VerdaderoCos() {		
		assertTrue(ex.foo2(1, 2) == (float)1.5);
	}
}
