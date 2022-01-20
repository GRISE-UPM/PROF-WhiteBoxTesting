package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class Test_maxAbsolute {

	private Exercises exercises = new Exercises();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Comienzan tests de maxAbsolute");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Comienza test");
	}
	
	
	@Test
	@DisplayName("Mas de 5 valores")
	public void maxAbsolute_LengthTest() {
		int [] a = new int[] {1,2,3,4,5,6,7,8};
		assertEquals(-1, exercises.maxAbsolute(a), 0.0);		
	}
	
	@Test
	@DisplayName("Max es positivo")
	public void maxAbsolute_PositiveTest () {
		int [] a = {23, -21, 24, -20, 28};
		assertEquals(28, exercises.maxAbsolute(a), 0.0);		
	}
	
	@Test
	@DisplayName("Max es negativo")
	public void maxAbsolute_NegativeTest () {
		int [] a = {23, -21, 24, -30, 28};
		assertEquals(30, exercises.maxAbsolute(a), 0.0);		
	}
	
	@Test
	@DisplayName("Valores max iguales")
	public void maxAbsolute_IgualesMaximosTest () {
		int [] a = {3, -2, 5, 5};
		assertEquals(5, exercises.maxAbsolute(a), 0.0);		
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
