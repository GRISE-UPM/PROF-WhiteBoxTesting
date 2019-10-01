package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {
	
	Exercises ejercicios = new Exercises();
	Exercises.convertInt conv = ejercicios.new convertInt();

	@Test(expected = Exception.class)
	public void test1() throws Exception {
		char[] argumentos = new char[]{ '\6','\2','\3','\4','\5' }; 
		conv.convert(argumentos);
	}
	
	@Test(expected = Exception.class)
	public void test2() throws Exception {
		char[] argumentos = new char[]{ '\1','\2','\3','\4','\5','\6','\7' }; 
		conv.convert(argumentos);
	}
	
	@Test(expected = Exception.class)
	public void test3() throws Exception {
		char[] argumentos = new char[]{ '-','\6','\2','\3','\4','\5' }; 
		conv.convert(argumentos);	
	}
	
	@Test
	public void test4() throws Exception {
		char[] argumentos = new char[]{ '-','\2','\3' }; 
		assertEquals(-23.0, conv.convert(argumentos),0);	
	}
	
	

}
