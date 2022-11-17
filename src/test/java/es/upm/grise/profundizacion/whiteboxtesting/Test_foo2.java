package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_foo2 {

	private final Exercises exercises = new Exercises();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Tests of foo2 has started.");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Tests of foo2 has finished.");
	}
	
	@Test
	public void testALEB() {
		float a = 1;
		float b = 2;
		assertEquals(1.5, exercises.foo2(a, b));
	}
	
	@Test
	public void testAGTB() {
		float a = 2;
		float b = 1;
		assertEquals(1.5, exercises.foo2(a, b));
	}
	
	@Test
	public void testCosALT0() {
		float a = 90;
		float b = 180;
		assertEquals(2, exercises.foo2(a, b));
	}
	
	@Test
	public void testCosBGT0() {
		float a = 0;
		float b = 0;
		assertEquals(2, exercises.foo2(a, b));
	}
	
	@Test
	public void testCosABTBLT0() {
		float a = 180;
		float b = 0;
		assertEquals(90, exercises.foo2(a, b));
	}
	

}
