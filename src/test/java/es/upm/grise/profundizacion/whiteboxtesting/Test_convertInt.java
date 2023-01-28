package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_convertInt {
	
	private final Exercises exercises = new Exercises();

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Tests of convertInt has started.");
	}
	
	@AfterAll
	static public void afterAll() {
		System.out.println("Tests of convertInt has finished.");
	}
	
	// ****** PREDICATES NODES AND THEIR CONDITIONS ******
	// 40: str.length > 6
	// 43: str[0]=='-'
	// 45b: i<str.length
	// 49: str[0]=='-'
	// 51a: number > 32767
	// 51b: number < -32768
	// ****** CYCLOMATIC COMPLEXITY ******
	// V(G) = Number of regions = 7
	// V(G) = Edges - Nodes + 2 = 24 - 19 + 2 = 7
	// V(G) = Number of predicate nodes + 1 = 6 + 1 = 7
	
	@Test
	public void testLengthLE6() throws Exception {
		char[] str = {'0', '1', '2', '3', '4', '5'};
		assertEquals(12345, exercises.convert(str));
	}
	
	@Test
	public void testLengthLE6Negative() throws Exception {
		char[] str = {'-', '1', '2', '3', '4', '0'};
		assertEquals(-12340, exercises.convert(str));
	}
	
	@Test
	public void testLengthGT6() throws Exception {
		char[] str = {'0', '1', '2', '3', '4', '5', '6'};
		assertThrows(Exception.class, () -> exercises.convert(str));
	}
	
	@Test
	public void test51b() throws Exception {
		char[] str = {'-','3', '2', '7', '6', '9'};
		assertThrows(Exception.class, () -> exercises.convert(str));
	}
	
	@Test
	public void test51a() throws Exception {
		char[] str = {'0', '3', '2', '7', '6', '9'};
		assertThrows(Exception.class, () -> exercises.convert(str));
	}
	
	@Test
	public void testNot51aNot51b() throws Exception {
		char[] str = {'0', '2', '2', '7', '6', '9'};
		assertEquals(22769, exercises.convert(str));
	}

}
