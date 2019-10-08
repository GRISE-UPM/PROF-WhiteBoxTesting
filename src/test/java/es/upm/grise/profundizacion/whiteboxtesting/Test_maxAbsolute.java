package test.java.es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.es.upm.grise.profundizacion.whiteboxtesting.Exercises;

public class Test_maxAbsolute {

	@Test
	public void test1() {
		Exercises o = new Exercises();
		int [] array = {1,2,3,4,5,6};
		assertEquals(-1, o.maxAbsolute(array), 0);
	}
	
	@Test
	public void test2() {
		Exercises o = new Exercises();
		int [] array = {1,2,3,4,5};
		assertEquals(5, o.maxAbsolute(array), 0);
	}
	
	@Test
	public void test3() {
		Exercises o = new Exercises();
		int [] array = {1,2,-3,4,5};
		assertEquals(5, o.maxAbsolute(array), 0);
	}

}
