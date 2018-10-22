package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;

public class Test_convertInt {

	
	@Test
	public void test() throws Exception {
		char[] str = {'1','2','3'};
		Exercises e = new Exercises();
		ConvertInt c = e.new ConvertInt();
		assertTrue(c.convert(str) == 5451);		
	}
	
	@Test
	public void test2() throws Exception {
		char[] str = {'-','1','2','3'};
		Exercises e = new Exercises();
		ConvertInt c = e.new ConvertInt();
		assertTrue(c.convert(str) == -5451);		
	}
	
	@Test(expected = Exception.class)
	public void test3() throws Exception {
		char[] str = {'-','0','0','0','0','0','0'};
		Exercises e = new Exercises();
		ConvertInt c = e.new ConvertInt();
		c.convert(str);		
	}
	
	@Test(expected = Exception.class)
	public void test4() throws Exception {
		char[] str = {'0','0','0','0','0','0'};
		Exercises e = new Exercises();
		ConvertInt c = e.new ConvertInt();
		c.convert(str);		
	}

}
