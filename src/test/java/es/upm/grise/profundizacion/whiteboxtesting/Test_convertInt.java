package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

	private static convertInt converter;
	
	@BeforeAll
	public static void before() {
		converter = new Exercises().new convertInt();
	}
	
	@Test
	public void test_throws_exception_size6() {
		Assertions.assertThrows(Exception.class, () -> {
			converter.convert(new char[] {'a','b','c','d','e','f'});
		});
	}
	
	@Test
	public void test_0() throws Exception {
		assertEquals(0, converter.convert(new char[] {'0','0','0','0','0','0'}));
	}
	
	@Test
	public void test_negative() throws Exception {
		assertEquals(-10, converter.convert(new char[] {'-','1','0'}));
	}
	
	@Test
	public void test_positive() throws Exception {
		assertEquals(10, converter.convert(new char[] {'1','0'}));
	}
	
	@Test
	public void test_big_positive() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			converter.convert(new char[] {'3','2','7','6','8'});
		});
	}
	
	@Test
	public void test_small_negative() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			converter.convert(new char[] {'-','3','2','7','6','9'});
		});
	}

}
