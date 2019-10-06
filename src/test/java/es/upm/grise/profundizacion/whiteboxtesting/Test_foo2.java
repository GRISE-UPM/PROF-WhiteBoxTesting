package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {
	Exercises prueba =new Exercises();	
	
	@Test
	public void test() {
		assertEquals(2.0f, prueba.foo2(4.0f, 8.0f),0.001);
	}

	@Test
	public void test1() {
		assertEquals(2.0f, prueba.foo2(8.0f, 4.0f),0.001);
	}
	
	@Test
	public void test3() {
			assertEquals(2.0f, prueba.foo2(0.0f, 4.0f),0.001);
	}
	
	@Test
	public void test4() {
			assertEquals(2.0f, prueba.foo2(0.0f, 0.2f),0.001);
	}
	
	
}
