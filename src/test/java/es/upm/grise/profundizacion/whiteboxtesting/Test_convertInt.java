package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir
//una cobertura del 100% con menos tests al incluir más de una rama en cada camino indepen-
//diente

public class Test_convertInt {

	private Exercises test;
	private Exercises.convertInt convertInt;
	
	@Before
	public void before() {
		test = new Exercises();
		convertInt = test.new convertInt();
	}
	
	@Test(expected = Exception.class)
	public void test1_convertInt() throws Exception {
		char[] str = {'0','1','2','3','4','5','6','7'};
		convertInt.convert(str);
	}
	
	@Test
	public void test2_convertInt() throws Exception {
		char[] str = {'-','1','2','3'};
		int exp = -5451;
		assertEquals(exp, convertInt.convert(str));
	}
	
	@Test
	public void test3_convertInt() throws Exception {
		char[] str = {'1','2'};
		int exp = 540;
		assertEquals(exp, convertInt.convert(str));
	}
	
	@Test(expected = Exception.class)
	public void test4_convertInt() throws Exception {
		char[] str = {'a','b','c','d'};
		convertInt.convert(str);
	}
	
	@Test(expected = Exception.class)
	public void test5_convertInt() throws Exception {
		char[] str = {'-','a','b','c','d'};
		convertInt.convert(str);	
	}

}
