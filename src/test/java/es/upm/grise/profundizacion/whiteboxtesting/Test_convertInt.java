package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_convertInt {
	
	private final Exercises exercises = new Exercises();;
	private final Exercises.convertInt convertInt = exercises.new convertInt();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Tests of convertInt has started.");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Tests of convertInt has finished.");
	}
	
	@Test
	public void testLengthLE6() throws Exception {
		char[] str = {'0', '1', '2', '3', '4', '5'};
		assertEquals(12345, convertInt.convert(str));
	}
	
	@Test
	public void testLengthLE6Negative() throws Exception {
		char[] str = {'-', '1', '2', '3', '4', '0'};
		assertEquals(-12340, convertInt.convert(str));
	}
	
	@Test
	public void testLengthGT6() throws Exception {
		char[] str = {'0', '1', '2', '3', '4', '5', '6'};
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}

}