package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	private final Exercises exercises = new Exercises();
	
	@BeforeAll
	static public void beforeAll() {
		System.out.println("Tests of foo2 has started.");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Tests of foo2 has finished.");
	}
	
	// ****** PREDICATES NODES AND THEIR CONDITIONS ******
	// 27: numbers.length > 5
	// 30b: i<numbers.length
	// 31: numbers[i] < 0
	// ****** CYCLOMATIC COMPLEXITY ******
	// V(G) = Number of regions = 4
	// V(G) = Edges - Nodes + 2 = 14 - 12 + 2 = 4
	// V(G) = Number of predicate nodes + 1 = 3 + 1 = 4
	
	@Test
	public void testEmpty() {
		int [] numbers = new int[] {};
		assertEquals(0, exercises.maxAbsolute(numbers));
	}
	
	@Test
	public void testLengthGT5() {
		int [] numbers = new int[] {0,1,2,3,4,5};
		assertEquals(-1, exercises.maxAbsolute(numbers));
	}
	
	@Test
	public void testLengthLE5() {
		int [] numbers = new int[] {0,1,2,3,4};
		assertEquals(4, exercises.maxAbsolute(numbers));
	}
	
	@Test
	public void testLengthLE5NegAndPos() {
		int [] numbers = new int[] {-2,-1,0,1};
		assertEquals(2, exercises.maxAbsolute(numbers));
	}

}
