package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_foo1 {

	@Test
	public void test1_foo1() {
		Exercises ex =  new Exercises();
		assertEquals(5.0, ex.foo1(2, 10), 0.01);
	}
	
	@Test
	public void test2_foo1() {
		Exercises ex =  new Exercises();
		assertEquals(1.0, ex.foo1(6, 16), 0.01);
	}

}
