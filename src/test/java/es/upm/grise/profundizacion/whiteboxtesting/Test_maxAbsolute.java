package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class Test_maxAbsolute {

	@Test
	public void test() {
		Exercises maxAbTest = new Exercises();
		int[] integer = {1,-2,3,4,5};
		int[] integer2 = {1,2,3,4,5,6};
		int result = maxAbTest.maxAbsolute(integer);
		TestCase.assertEquals(5, result);
		int result2 = maxAbTest.maxAbsolute(integer2);
		TestCase.assertEquals(-1, result2);
	}

}
