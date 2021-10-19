package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class Test_foo1 {

	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Comienzan tests de foo1");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Comienza test");
	}
	
	@Test
	@DisplayName (" x > 5")
	public void foo1_BiggerTest() {
		Exercises exercises = new Exercises();
		int x = 12;
		int y = 66; 
		assertEquals(3, exercises.foo1(x, y));		
	}
	
	@Test
	@DisplayName (" x < 5")
	public void foo1_SmallerTest() {
		Exercises exercises = new Exercises();
		int x = 4;
		int y = 16; 
		assertEquals(4, exercises.foo1(x, y));		
	}
	
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test terminado");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("foo1 test terminados");
	}

}
