package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;

public class Test_foo1 {

	
	private Exercises exercises = new Exercises();

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Empiezan tests de foo1");
	}
	
	@BeforeEach
	public void beforeEach() {
		System.out.println("Empieza test");
	}
	
	
	@Test
	@DisplayName ("if: x > 5")
	public void foo1_testcase1() {
		assertEquals(3, exercises.foo1(12, 66), 0.0);		
	}
	
	@Test
	@DisplayName ("else: x <= 5")
	public void foo1_testcase2() {
		assertEquals(4, exercises.foo1(5, 20), 0.0);		
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test terminado");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Terminan tests de foo1");
	}

}
