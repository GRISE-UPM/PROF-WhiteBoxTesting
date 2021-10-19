package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class Test_foo2 {

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Comienzan tests de foo2");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Comienza test");
	}
	
	@Test
	@DisplayName("a > b, se cumple la segunda condicion")
	public void foo2_BiggerTest() {
		Exercises exercises = new Exercises();
		int a = 20;
		int b = 9;
		assertEquals(2, exercises.foo2(a, b));
	}
	
	@Test
	@DisplayName(" a < b, se cumple la segunda condicion")
	public void foo2_SmallerCosTest() {
		Exercises exercises = new Exercises();
		int a = 2;
		int b = 8;
		assertEquals(2, exercises.foo2(a, b));
	}

	@Test
	@DisplayName("a < b, no se cumple la segunda condicion")
	public void foo2_SmallerTest() {
		Exercises exercises = new Exercises();
		int a = 20;
		int b = 22;
		assertEquals(21, exercises.foo2(a, b));
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test terminado");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("foo2 test terminados");
	}

}
