package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

public class Test_maxAbsolute {

	Exercises ej1;

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Inicio tests maxAbsolute");
	}

	@BeforeEach
	public void beforeEach() {
		ej1 = new Exercises();
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("Final tests maxAbsolute");
	}


	// if(numbers.length > 5)  numbers={1, 2, 3, 4, 5, 6}
	@Test
	public void test_logmay5() {
		int[] numbers = {1, 2, 3, 4, 5, 6};
		assertEquals(-1, ej1.maxAbsolute(numbers));
	}

	// else (numbers.length <= 5)  numbers={}
	@Test
	public void test_arrayvacio() {
		int[] numbers = {};
		assertEquals(0, ej1.maxAbsolute(numbers));
	}

	// 1 elemento en numbers
	@Test
	public void test_array1() {
		int[] numbers = {1};
		assertEquals(1, ej1.maxAbsolute(numbers));
	}

	// 5 elementos en numbers
	@Test
	public void test_array5() {
		int[] numbers = {0, 5, 10, 15, 20};
		assertEquals(20, ej1.maxAbsolute(numbers));
	}

}
