package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Test_convertInt {
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Executed before any test has been run");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Executed after all tests have been run");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Executed before each test");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Executed after each test");
	}


	@Test
	public void Exception_length() {
		char [] c = {'a','b','c','d','e','f','g'};
		
		assertThrows(Exception.class, () ->  Exercises.convertInt.convert(c));
		
	}
	@Test
	public void return_conversion() throws Exception {
		char [] c = {'a','b','c'};
		
		assertEquals(5451,Exercises.convertInt.convert(c));
		
	}

	

}
