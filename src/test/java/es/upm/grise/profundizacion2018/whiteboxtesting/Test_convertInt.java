package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion2018.whiteboxtesting.Exercises.ConvertInt;

public class Test_convertInt {
	
	private Exercises exer = new Exercises();
	
	@Test (expected = Exception.class)
	public void ArrayLargo() throws Exception {
		char [] array = {'1','2','3','4','5','6','7'};
		
		ConvertInt conInt = exer.new ConvertInt();
		conInt.convert(array) ;
	}
	@Test (expected = Exception.class)
	public void numeroMayorQue() throws Exception {
		char [] array = {'3','9','9','9','9'};
		ConvertInt conInt = exer.new ConvertInt();
		conInt.convert(array) ;
	}
	@Test (expected = Exception.class)
	public void numeroMenorQue() throws Exception {
		char [] array = {'-','3','9','9','9','9'};	
		ConvertInt conInt = exer.new ConvertInt();
		conInt.convert(array) ;
	}
	@Test
	public void sinGuion() throws Exception {
		char[] array = {'1','2','3'};	
		ConvertInt conInt = exer.new ConvertInt();
		assertTrue(conInt.convert(array) == 5451);
	}
	@Test
	public void NegPequeño() throws Exception {
		char[] array = {'-','1','2','3'};
		ConvertInt conInt = exer.new ConvertInt();
		conInt.convert(array) ;
	}
	
	
	
}