package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Test_convertInt {

	private Exercises exercises = new Exercises();
	private Exercises.convertInt convertInt = exercises.new convertInt();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("ConvertInt - Empiezan tests");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Empieza test");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test terminado");
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("ConvertInt - Terminan tests");
	}
	
	@Test
	public void testArrayLongerThan6Chars() {
		char[] array = {'1','2','3','4','5','6','7'};
		assertThrows(Exception.class, ()->convertInt.convert(array));
	}
	
	@Test
	public void testConvertPositiveNumber() throws Exception {
		char[] array = {'1','2','3'};
		assertEquals(123, convertInt.convert(array));
	}
	
	@Test
	public void testConvertNegativeNumber() throws Exception {
		char[] array = {'-','1','2','3'};
		assertEquals(-123, convertInt.convert(array));
	}
	
	@Test
	public void testConvertTooBigNegativeNumber() throws Exception {
		char[] array = {'-','5','5','1','2','3'};
		assertThrows(Exception.class, ()->convertInt.convert(array));
	}
	
	@Test
	public void testConvertTooBigPositiveNumber() throws Exception {
		char[] array = {'5','5','1','2','3'};
		assertThrows(Exception.class, ()->convertInt.convert(array));
	}

}
