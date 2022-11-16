package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class Test_foo2 {

	private Exercises exercises = new Exercises();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Foo2 - Empiezan tests");
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
		System.out.println("Foo2 - Terminan tests");
	}
	
	@Test
	public void testABiggerThanB_cosALowerThan0_cosBLowerThan0() {
		assertEquals(2, exercises.foo2(8, 4), 0.0);	
	}
	
	@Test
	public void testABiggerThanB_cosABiggerThan0_cosBLowerThan0() {
		assertEquals(1.5, exercises.foo2(2, 1), 0.0);	
	}
	
	@Test
	public void testAEqualsB_cosABiggerThan0_cosBBiggerThan0() {
		assertEquals(2, exercises.foo2(1, 1), 0.0);
	}

	@Test
	public void testALowerThanB_cosABiggerThan0_cosBBiggThan0() {
		assertEquals(2, exercises.foo2(0, 1), 0.0);
	}
	
	@Test
	public void testALowerThanB_cosABiggerThan0_cosBLowerThan0() {
		assertEquals(6.5, exercises.foo2(5, 8), 0.0);
	}

}
