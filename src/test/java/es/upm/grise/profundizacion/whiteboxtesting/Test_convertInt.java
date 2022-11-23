package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

	@Test
	public void test_convert_1() throws Exception {
		Exercises ex = new Exercises();
		char[] str1 = {'1','2','3','4','5'};
		Exercises.convertInt conv = ex. new convertInt();
		assertEquals(12345, conv.convert(str1));
		
	}
	
	@Test
	public void test_convert_2() throws Exception {
		Exercises ex = new Exercises();
		char[] str1 = {'1','2','3','4','5', '6', '7'};
		Exercises.convertInt conv = ex. new convertInt();
		Assertions.assertThrows(Exception.class, () -> conv.convert(str1));
	}
	
	@Test
	public void test_convert_3() throws Exception {
		Exercises ex = new Exercises();
		char[] str1 = {'-', '1','2','3','4','5'};
		Exercises.convertInt conv = ex. new convertInt();
		assertEquals(-12345, conv.convert(str1));
	}
	
	@Test
	public void test_convert_4() throws Exception {
		Exercises ex = new Exercises();
		char[] str1 = {'7','2','3','4','5'};
		Exercises.convertInt conv = ex. new convertInt();
		Assertions.assertThrows(Exception.class, () -> conv.convert(str1));
		
	}
	
	@Test
	public void test_convert_5() throws Exception {
		Exercises ex = new Exercises();
		char[] str1 = {'-','7','2','3','4','5'};
		Exercises.convertInt conv = ex. new convertInt();
		Assertions.assertThrows(Exception.class, () -> conv.convert(str1));
		
	}
}
