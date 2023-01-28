package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_foo1 {

	private final Exercises exercises = new Exercises();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Tests of foo1 has started.");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Tests of foo1 has finished.");
	}
	
	// ****** PREDICATES NODES AND THEIR CONDITIONS ******
	// 6: x > 5
	// ****** CYCLOMATIC COMPLEXITY ******
	// V(G) = Number of regions = 2
	// V(G) = Edges - Nodes + 2 = 6 - 6 + 2 = 2
	// V(G) = Number of predicate nodes + 1 = 1 + 1 = 2
	
	@Test
	public void testXEQ5() {
		float x = 0;
		float y = 5;
		assertEquals(Float.POSITIVE_INFINITY, exercises.foo1(x, y));
	}

	@Test
	public void testXGT5() {
		float x = 6;
		float y = 16;
		assertEquals(1, exercises.foo1(x, y));
	}
	
	@Test
	public void testXLE5() {
		float x = 5;
		float y = 5;
		assertEquals(1, exercises.foo1(x, y));
	}

}
