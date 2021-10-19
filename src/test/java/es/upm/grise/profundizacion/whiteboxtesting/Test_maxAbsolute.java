package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class Test_maxAbsolute {

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Comienzan tests de maxAbsolute");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Comienza test");
	}
	
	
	@Test
	@DisplayName("String de longitud mayor que 5")
	public void maxAbsolute_LengthTest() {
		Exercises exercises = new Exercises();
		int [] a = new int[6];
		assertEquals(-1, exercises.maxAbsolute(a));		
	}
	
	@Test
	@DisplayName("Max es positivo")
	public void maxAbsolute_PositiveTest () {
		Exercises exercises = new Exercises();
		int [] a = {23, -21, 24, -20, 28};
		assertEquals(28, exercises.maxAbsolute(a));		
	}
	
	@Test
	@DisplayName("Max es negativo")
	public void maxAbsolute_NegativeTest () {
		Exercises exercises = new Exercises();
		int [] a = {23, -21, 24, -30, 28};
		assertEquals(30, exercises.maxAbsolute(a));		
	}
	
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test terminado");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("maxAbsolute test terminados");
	}

}
