package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	
	Exercises ejercicios = new Exercises();

	@Test
	public void test_a_greatherThan_b_and_cosB_greaterThan_0() {
		assertEquals(2.0, ejercicios.foo2(1, 0), 0);
	}
	
	@Test
	public void test_a_greatherThan_b_and_cosB_lessThan_0() {
		assertEquals(2.0, ejercicios.foo2(1, -10), 0);
	}
	
	@Test
	public void test_b_greaterThan_a() {
		assertEquals(-4.0, ejercicios.foo2(-5, -3), 0);
	}
	
	@Test
	public void test_b_greaterThan_a_and_cosAandB_lessThan_0() {
		assertEquals(2.0, ejercicios.foo2(-4, -3), 0);
	}

}
