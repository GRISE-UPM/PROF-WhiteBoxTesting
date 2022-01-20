package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class Test_foo2 {

	private Exercises exercises = new Exercises();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Empiezan tests de foo2");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Comienza test");
	}
	
	@Test
	@DisplayName("a > b, condicion de if")
	public void foo2_testcase1() {
		assertEquals(2, exercises.foo2(12, 5), 0.0);
	}
	
	@Test
	@DisplayName(" a < b, condicion de else")
	public void foo2_testcase2() {
		assertEquals(2, exercises.foo2(3, 14), 0.0);
	}

	@Test
	@DisplayName("a < b, no se cumple la segunda condicion")
	public void foo2_testcase3() {
		assertEquals(1.5, exercises.foo2(2, 1), 0.0);
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test terminado");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Terminan tests de foo2");
	}

}
