package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Test_foo1 {

	private Exercises exercises = new Exercises();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Foo1 - Empiezan tests");
	}

	@BeforeEach
	public void beforeEach() {
		System.out.println("Empieza test");
	}
	
	@AfterEach
	public void afterEach() {
		System.out.println("Test terminado");
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("Foo1 - Terminan tests");
	}
	
	@Test
	public void testXBiggerThan5() {
		assertEquals(1, exercises.foo1(7, 17), 0.0);	
	}
	
	@Test
	public void testXEquals5() {
		assertEquals(3, exercises.foo1(5, 15), 0.0);
	}
	
	@Test
	public void testXLowerThan5() {
		assertEquals(0.5, exercises.foo1(4, 2), 0.0);
	}
	
	@Test
	public void testXEquals0() {
		assertEquals(Double.POSITIVE_INFINITY, exercises.foo1(0, 3), 0.0);
	}

}
