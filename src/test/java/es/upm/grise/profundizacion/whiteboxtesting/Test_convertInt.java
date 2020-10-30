package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;


import org.junit.Test;

public class Test_convertInt {

	Exercises claseExercises = new Exercises();
	Exercises.convertInt claseConvertInt = claseExercises.new convertInt();
	
	@Test
	public void testTodoOK() throws Exception {
	//1-3-5-6-8-9-11
		char [] cadena =  {'1','2'};
		assertEquals(12,claseConvertInt.convert(cadena));
	}
	
	@Test
	public void testMenosDelante() throws Exception {
	//1-3-4-5-6-7-8-9-11

		char [] cadena =  {'-','1','2'};
		assertEquals(-12,claseConvertInt.convert(cadena));
	}
	
	@Test(expected = Exception.class)
	public void testLongitudMayorSeis() throws Exception {
	//1-2
		char [] cadena =  {'c','a','d','e','n','a','s'};
		claseConvertInt.convert(cadena);
	}
		
	@Test(expected = Exception.class)
	public void testMayorInt() throws Exception {
	//number > 32768. 1-3-5-6-8-9-10
		char [] cadena =  {'}','}','}','}'};
		claseConvertInt.convert(cadena);
	}
	
	@Test(expected = Exception.class)
	public void testMenorInt() throws Exception {
	//number < -32768.  1-3-5-6-8-9-10
		char [] cadena =  {'-','}','}','}','}'};
		claseConvertInt.convert(cadena);
	}

	@Test(expected = Exception.class)
	public void testCadenaVacia() throws Exception {
		char [] cadena = {};
		claseConvertInt.convert(cadena);
	}
	
}
