package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.Test;


public class Test_foo2_Ej4 {

	@Test
	public void test() {
		Exercises ex = new Exercises();
		float a = 3;
		float b = 1;
		assertEquals(2, ex.foo2(a, b), 0);
	}

	@Test
	public void test2() {
		Exercises ex = new Exercises();
		float a = 1;
		float b = 3;
		assertEquals(2, ex.foo2(a, b), 0);
	}

	@Test
	public void test3() {
		Exercises ex = new Exercises();
		float a = 0;
		float b = 180;
		assertEquals(90, ex.foo2(a, b), 0);
	}

	@Test
	public void test4() {
		Exercises ex = new Exercises();
		float a = 180;
		float b = 0;
		assertEquals(90, ex.foo2(a, b), 0);
	}
}
