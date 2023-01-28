package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_foo2 {

	@Test
	public void not_number_test() {
		Exercises e = new Exercises();
		char a = 'x';
		char b = 'y';
		assertEquals(120.5, e.foo2(a, b));
	}

	@Test
	public void first_and_second_if_test() {
		Exercises e = new Exercises();
		float a = (float)5.0;
		float b = (float)2.0;
		assertEquals(2.0, e.foo2(a, b));
	}
	
	@Test
	public void first_but_not_second_if_test() {
		Exercises e = new Exercises();
		float a = (float) 8.0;
		float b = (float) 1.0;
		assertEquals(4.5, e.foo2(a, b));
	}
	
	@Test
	public void not_first_but_second_if_test() {
		Exercises e = new Exercises();
		float a = (float) (-1.0*Math.PI);
		float b = (float) 0.0;
		assertEquals(2.0, e.foo2(a, b));
	}
	
	@Test
	public void not_first_nor_second_if_test() {
		Exercises e = new Exercises();
		float a = (float) 0.0;
		float b = (float) 2.0;
		assertEquals(1.0, e.foo2(a, b));
	}
}
