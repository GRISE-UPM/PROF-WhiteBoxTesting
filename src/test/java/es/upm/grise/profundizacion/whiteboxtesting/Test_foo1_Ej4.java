package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.Test;

public class Test_foo1_Ej4 {

	@Test
	public void test() {
		Exercises ex = new Exercises();
		assertEquals(1.0, ex.foo1(10, 20), 0.0);
	}

	@Test
	public void test2() {
		Exercises ex = new Exercises();
		assertEquals(1.0, ex.foo1(4, 4), 0.0);
	}
}
