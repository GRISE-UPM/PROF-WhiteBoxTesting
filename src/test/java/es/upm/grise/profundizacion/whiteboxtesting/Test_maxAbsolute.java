package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class Test_maxAbsolute {
	
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
	public void maxAbsolute_returnMinusOne() {
		int [] lista =  {1,2,3,4,5,10}; 
		assertEquals(-1,Exercises.maxAbsolute(lista));
		
	}
	@Test
	public void maxAbsolute_return3() {
		int [] lista =  {1,2,3}; 
		assertEquals(3,Exercises.maxAbsolute(lista));
		
	}
	@Test
	public void maxAbsolute_return4() {
		int [] lista =  {1,2,3,-4}; 
		assertEquals(4,Exercises.maxAbsolute(lista));
		
	}

}
