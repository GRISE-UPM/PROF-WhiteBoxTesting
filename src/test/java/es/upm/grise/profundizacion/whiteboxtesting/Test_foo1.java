package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

// OSCAR: CC=2, por lo que 2 tests son suficientes

public class Test_foo1 {

	@Ignore
	@Test
	public void test_lt5() {
		Exercises ex= new Exercises();
		assertEquals((float) 1, ex.foo1(4,4),0);
	}
	
	@Test
	public void test_eq5() {
		Exercises ex= new Exercises();
		assertEquals((float) 1, ex.foo1(5,5),0);
	}
	
	@Test
	public void test_gt5() {
		Exercises ex= new Exercises();
		assertEquals((float) 1, ex.foo1(6,16),0);
	}
	
	
	@Ignore
	@Test
	public void test_zero() {
		Exercises ex= new Exercises();
		Float fl= new Float(ex.foo1(0,16));
		assertTrue(fl.isInfinite());
	}


}
