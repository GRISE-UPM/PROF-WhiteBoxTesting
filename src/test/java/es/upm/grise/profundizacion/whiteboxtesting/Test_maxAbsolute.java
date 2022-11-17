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
