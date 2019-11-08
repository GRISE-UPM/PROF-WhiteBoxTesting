package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_foo2 {

	@Test // C1: 1-2-3-4-6
	public void test1() {
		Exercises o = new Exercises();
		assertEquals(2, o.foo2(360, 180), 0);
	}
	
	@Test // C2: 1-3-4-6
	public void test2() {
		Exercises o = new Exercises();
		assertEquals(2, o.foo2(0, 270), 0);
	}
	
	@Test // C3: 1-2-3-5-6
	public void test3() {
		Exercises o = new Exercises();
		assertEquals(45, o.foo2(90, 0), 0);
	}
	
	@Test // C4: 1-2-3-5-4-6
	public void test4() {
		Exercises o = new Exercises();
		assertEquals(2, o.foo2(45, 0), 0);
	}

}
