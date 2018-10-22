package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;

public class Test_convertInt {

	private Exercises ex = new Exercises();
	private ConvertInt ci = (ex).new ConvertInt();
	
	@Test(expected = Exception.class)
	public void more_than_5_elements() throws Exception {
		char[] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		ci.convert(str);
	}
	
	@Test
	public void starting_with_hyphen() throws Exception {
		char[] str = {'-', '\5', '\1', '\0', '\0'};
		int actual = ci.convert(str);
		int expected = -5100;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual);
	}
	
	@Test
	public void starting_without_hyphen() throws Exception {
		char[] str = {'\5', '\1', '\0', '\0'};
		int actual = ci.convert(str);
		int expected = 5100;
		assertEquals("Result should be " + expected + ", but is " + actual, expected, actual);
	}
	
	@Test(expected = Exception.class)
	public void bigger_than_32767() throws Exception {
		char[] str = {'\5', '\1', '\0', '\0', '\1'};
		ci.convert(str);
	}
	
	@Test(expected = Exception.class)
	public void smaller_than_minus32767() throws Exception {
		char[] str = {'-', '\5', '\1', '\0', '\0', '\1'};
		ci.convert(str);
	}

}
