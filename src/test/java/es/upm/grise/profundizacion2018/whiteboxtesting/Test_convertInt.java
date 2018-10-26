package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_convertInt {
	
	private Exercises exercises;
	private Exercises.ConvertInt convertint;
	
	@Before
	public void beforeTest() {
		exercises = new Exercises();
		convertint = exercises.new ConvertInt();
	}

	@Test(expected = Exception.class)
	public void test1() throws Exception {
		char[] string = {'1','2','3','4','5','6','7'};
		assertEquals(Exception.class,this.convertint.convert(string));
	}
	
	@Test
	public void test2() throws Exception {
		char[] string = {'2','3','1'};
		assertEquals(231,this.convertint.convert(string));
	}
	
	@Test
	public void test3() throws Exception {
		char[] string = {'-','3'};
		assertEquals(-3,this.convertint.convert(string));
	}
	
	@Test(expected = Exception.class)
	public void test4() throws Exception {
		char[] string = {'-','9','9','9','9','9'};
		assertEquals(Exception.class,this.convertint.convert(string));
	}
	
	@Test(expected = Exception.class)
	public void test5() throws Exception {
		char[] string = {'9','9','9','9','9'};
		assertEquals(Exception.class,this.convertint.convert(string));
	}

}
