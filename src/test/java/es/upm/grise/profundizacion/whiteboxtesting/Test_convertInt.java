package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {

	@Test
	public void test() {
		Exercises ex = new Exercises();
		Exercises.convertInt ci = ex.new convertInt();
		char[] str = {'1','2','3','4','5'};
		char[] str2 = {'-','1','2','3','4','5'};
		try {
			assertEquals(12345, ci.convert(str));
			assertEquals(-12345, ci.convert(str2));
		} 
		catch(Exception e) {
			fail("Exception");
		}
	}

	@Test
	public void test2() {
		Exercises ex = new Exercises();
		Exercises.convertInt ci = ex.new convertInt();
		char[] str = {'1','2','3','4','5','6'};
		try {
			ci.convert(str);
			fail("Exception");
		} 
		catch(Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void test3() {
		Exercises ex = new Exercises();
		Exercises.convertInt ci = ex.new convertInt();
		char[] str = {'-','4','2','3','4','5'};
		try {
			ci.convert(str);
			fail("Exception");
		} 
		catch(Exception e) {
			assertTrue(true);
		}
	}

	@Test
	public void test4() {
		Exercises ex = new Exercises();
		Exercises.convertInt ci = ex.new convertInt();
		char[] str = {'1','2','3','4','5','6','7'};
		try {
			ci.convert(str);
			fail("Exception");
		} 
		catch(Exception e) {
			assertTrue(true);
		}
	}
}
