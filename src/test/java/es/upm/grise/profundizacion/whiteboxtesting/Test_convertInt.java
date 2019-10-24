package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir
//una cobertura del 100% con menos tests al incluir más de una rama en cada camino indepen-
//diente

public class Test_convertInt {

	Exercises.convertInt excercises = new Exercises(). new convertInt();
	
	//Provoca primera excepcion (str.length>6)
	@Test (expected = Exception.class)
	public void test_Exception1() throws Exception {
		char[] chars = {'a','a','a','a','a','a','a'};
		excercises.convert(chars);
	}
	
	//Provoca la segunda excepcion (number>32767) 
	// Number = 4901702 
	@Test (expected = Exception.class)
	public void test_Exception2() throws Exception {
		char[] chars = {',','-','/','*','.','*'};
		excercises.convert(chars);
	}
	
	//Provoca la segunda excepcion (number<32768) 
	// Number = -496695 
	@Test (expected = Exception.class)
	public void test_Exception3() throws Exception {
		char[] chars = {'-','-','*','*','-','-'};
		excercises.convert(chars);
	}
	
	//Devuelve valor 1068
	@Test  
	public void test_num1() throws Exception {
		char[] chars= {'a','b'};
		assertEquals(1068,excercises.convert(chars));
	}
	
	//Devuelve valor 10248
	@Test  
	public void test_num2() throws Exception {
		char[] chars= {'a','-','b'};
		assertEquals(10248,excercises.convert(chars));
	}
}
