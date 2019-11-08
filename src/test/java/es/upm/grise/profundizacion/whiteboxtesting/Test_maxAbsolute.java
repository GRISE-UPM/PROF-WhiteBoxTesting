package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	@Test // C1: 1-3-4-8-9
	public void test1() {
		Exercises o = new Exercises();
		int [] array = {};
		assertEquals(0, o.maxAbsolute(array), 0);
	}
	
	@Test // C1: 1-2-9
	public void test2() {
		Exercises o = new Exercises();
		int [] array = {1, 1, 1, 1, 1, 1};
		assertEquals(-1, o.maxAbsolute(array), 0);
	}
	
	@Test // C1: 1-3-4-5-6-4-8-9
	public void test3() {
		Exercises o = new Exercises();
		int [] array = {-1};
		assertEquals(1, o.maxAbsolute(array), 0);
	}
	
	@Test // C1: 1-3-4-5-7-4-8-9
	public void test4() {
		Exercises o = new Exercises();
		int [] array = {1};
		assertEquals(1, o.maxAbsolute(array), 0);
	}

}
