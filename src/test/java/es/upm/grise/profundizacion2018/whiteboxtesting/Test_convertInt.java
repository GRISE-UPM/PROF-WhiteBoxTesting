package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_convertInt {
	
	private Exercises exercises;
	
	@Before
	public void beforeTest() {
		this.exercises = new Exercises();
	}
	@Test(expected = Exception.class)
	// More than six characters.
	public void test1()throws Exception {
		char[] str = {'1','2','3','4','5','6','7','8','9'};
		assertEquals(Exception.class, this.exercises.new ConvertInt().convert(str));
	}
	@Test
	// Positive number less than six characters and smaller than 32767.
	public void test2()throws Exception {
		char[] str = {'a',};
		assertEquals(97, this.exercises.new ConvertInt().convert(str));
	}
	@Test
	// Negative number less than six characters and greater than -32768.
	public void test3()throws Exception {
		char[] str = {'-','1','0','7',};
		assertEquals(-5435, this.exercises.new ConvertInt().convert(str));
	}
	@Test(expected = Exception.class)
	// Positive number less than six characters and greater than 32767.
	public void test4()throws Exception {
		char[] str = {'3','9','0','0','0'};
		assertEquals(Exception.class, this.exercises.new ConvertInt().convert(str));
	}
	@Test(expected = Exception.class)
	// Negative number less than six characters and smaller than -32767.
	public void test5()throws Exception {
		char[] str = {'-','3','9','0','0','0'};
		assertEquals(Exception.class, this.exercises.new ConvertInt().convert(str));
	}
}
