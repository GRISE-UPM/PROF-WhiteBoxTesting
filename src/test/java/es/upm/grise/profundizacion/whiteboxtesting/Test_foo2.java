package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Test_foo2 {

	Exercises ex = new Exercises();

	@Test
	public void a_higher_than_b() {
		assertEquals(2, ex.foo2(2,1));
	}
	
	@Test
	public void a_lower_than_b() {
		assertEquals(2, ex.foo2(1,5));
	}

	@Test
	public void a_b_zero() {
		assertEquals(2, ex.foo2(0,0));
	}
	
	@Test
	public void a_non_zero_b_zero() {
		assertEquals(3, ex.foo2(6,0));
	}
}
