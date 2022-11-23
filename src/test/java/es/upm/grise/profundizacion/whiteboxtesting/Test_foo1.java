package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_foo1 {
	
	Exercises ex = new Exercises();

	@Test
	public void higher_than_five() {
		assertEquals(1, ex.foo1(6,16));
	}
	
	@Test
	public void lower_than_five() {
		assertEquals(2, ex.foo1(12,24));
	}
	
	@Test
	public void equals_zero() {
		assertEquals(0, ex.foo1(0,0));
	}

}
