package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.*;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {
	Exercises ex;
	convertInt cv;
	
	@BeforeEach
	public void init() {
		ex = new Exercises();
		cv = ex.new convertInt();
	}

	@DisplayName("Test 1 -> str.length > 6")
	@Test
	public void testconvertStrBiggerThan6()  throws Exception {
		char [] str = {'1','2','3','4','5','6','7'};
		assertThrows(Exception.class, ()->cv.convert(str));
	}
	
	@DisplayName("Test 2 -> str.length < 6")
	@Test
	public void testconvertStrLessThan6() throws Exception {
		char [] str = {'1','2'};
		assertEquals(12,cv.convert(str),1);
	}

	
	@DisplayName("Test 3 -> str[0] == -")
	@Test
	public void testconvertStrEqualsHyphen() throws Exception {
		char [] str = {'-','2'};
		assertEquals(-2,cv.convert(str),1);
	}
	
	
	@DisplayName("Test 4 -> number > 3267")
	@Test
	public void testconvertNumberHigherThan3267() throws Exception {
		char [] str = {'a','2','4','4'};
		assertThrows(Exception.class, ()->cv.convert(str));
	}
	
	@DisplayName("Test 5 -> number < -3267")
	@Test
	public void testconvertNumberSmallerThanMinus3267() throws Exception {
		char [] str = {'-','a','4','4','4','4'};
		assertThrows(Exception.class, ()->cv.convert(str));
	}


}
