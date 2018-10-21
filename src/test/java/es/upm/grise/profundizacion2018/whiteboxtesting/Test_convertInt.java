package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_convertInt {

	private Exercises ex;
	private Exercises.ConvertInt ci;
	
	@Before
	public void loadClass() {
		ex = new Exercises();
		ci = ex.new ConvertInt();
	}
	
	@Test(expected = Exception.class)
	public void arrayTooLongException() throws Exception{
		char[] str = {'5','5','5','5','5','5','5','5',}; 
		ci.convert(str);
	}
	
	@Test
	public void firstSymbolIsMinus() throws Exception{
		char[] str = {'-', '0'}; 
		assertEquals(ci.convert(str), -48, 0.01);
	}
	
	@Test
	public void firstSymbolIsNotMinus() throws Exception{
		char[] str = {'0'}; 
		assertEquals(ci.convert(str), 48, 0.01);
	}	
	
	@Test(expected = Exception.class)
	public void hugeNumberException() throws Exception{
		char[] str = {'1', '1', '1', '1'}; 
		ci.convert(str);
	}	
	
	@Test(expected = Exception.class)
	public void hugeNegativeNumberException() throws Exception{
		char[] str = {'-', '1', '1', '1', '1'}; 
		ci.convert(str);
	}

}
