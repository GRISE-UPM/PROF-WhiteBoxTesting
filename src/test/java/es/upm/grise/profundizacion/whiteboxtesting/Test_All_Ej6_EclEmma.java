package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import org.junit.Test;

public class Test_All_Ej6_EclEmma {

	private static Exercises ex = new Exercises();
	private static Exercises.convertInt ci = ex.new convertInt();
	
	/* 
	 * FOO1(x, y)
	 * 
	 * PATHS:
	 * foo1_1: 1 -> 2 -> 3 -> 4 -> 5
	 * foo1_2: 1 -> 2 -> 4 -> 5
	 * 
	 * CONDITIONS:
	 * Node: 2
	 * Cp1: x > 5
	 * Cp2: x <= 5
	 * 
	 * COMPLEXITY:
	 * Regions: 2
	 * Edges: 5
	 * Nodes: 5
	 * Edges - Nodes + 2 = 2
	 * Predicates Nodes: 1
	 * Predicate Nodes + 1 = 2
	 */
	
	@Test
	public void foo1_1() {
		assertEquals(1.0, ex.foo1(10, 20), 0.0);
	}

	@Test
	public void foo1_2() {
		assertEquals(1.0, ex.foo1(4, 4), 0.0);
	}
	
	/* 
	 * FOO2(a, b)
	 * 
	 * PATHS:
	 * foo2_1: 1 -> 2 -> 7 -> 9
	 * foo2_2: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 9
	 * foo2_3: 1 -> 2 -> 7 -> 8 -> 9
	 * foo2_4: 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9 
	 * 
	 * CONDITIONS:
	 * Node: 2
	 * Cp1: a > b
	 * Cp2: a <= b
	 * Node: 7
	 * Math.cos(a) < 0 || Math.cos(b) > 0 
	 * Cp1: TRUE || TRUE -> TRUE
	 * Cp2: FALSE || TRUE -> TRUE
	 * Cp3: TRUE || FALSE -> TRUE
	 * Cp4: FALSE || FALSE -> FALSE
	 * 
	 * COMPLEXITY:
	 * Regions: 3 
	 * Edges: 10
	 * Nodes: 9
	 * Edges - Nodes + 2 = 3
	 * Predicates Nodes: 2
	 * Predicate Nodes + 1 = 3 
	 */
	
	@Test
	public void foo2_1() {
		assertEquals(90, ex.foo2(0, 180), 0);
	}

	@Test
	public void foo2_2() {
		assertEquals(90, ex.foo2(180, 0), 0);
	}

	@Test
	public void foo2_3() {
		assertEquals(2, ex.foo2(180, 360), 0);
	}

	@Test
	public void foo2_4() {
		assertEquals(2, ex.foo2(1, 0), 0);
	}
	
	/*
	 * MAXABSOLUT(numbers)
	 * 
	 * PATHS:
	 * maxAbsolut_1: 1 -> 2 -> 3
	 * maxAbsolut_2: 1 -> 2 -> 4 -> 5 -> 6 -> 7 (u 8) -> 5 -> 9
	 *	 * 
	 * // 5, 6, 7 (u  8), 5 es un bucle for que se repite numbers.length - 1 veces
	 * // Se metera en 7 o en 8 en una misma prueba 
	 * 
	 * CONDITIONS:
	 * Node: 2
	 * Cp1: numbers.length > 5
	 * Cp2: numbers.length <= 5
	 * Node: 5 // For
	 * Cp1: i < numbers.length
	 * Cp2: i >= numbers.length
	 * Node: 6
	 * Cp1: numbers[i] < 0
	 * Cp2: numbers[i] >= 0
	 * 
	 * COMPLEXITY:
	 * Regions: 3
	 * Edges: 10
	 * Nodes: 9
	 * Edges - Nodes + 2 = 3
	 * Predicates Nodes: 3
	 * Predicate Nodes + 1 = 4 
	 */
	
	@Test
	public void maxAbsolut_1() {
		int[] numbers = {1,2,3,4,5,6};
		assertEquals(-1, ex.maxAbsolute(numbers));
	}

	@Test
	public void maxAbsolut_2() {
		int[] numbers = {1,-2,3,-4,-5};
		assertEquals(5, ex.maxAbsolute(numbers));
	}
	
	/*
	 * CONVERTINT(str)
	 * 
	 * PATHS:
	 * convertInt_1: 1 -> 2 -> 3
	 * convertInt_2: 1 -> 2 -> 4 -> 5 -> 7 -> 8 <-> 7 -> 9 -> 11 -> 12
	 * convertInt_2: 1 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8 <-> 7 -> 9 -> 10 -> 11 -> 12
	 * convertInt_3: 1 -> 2 -> 4 -> 5 -> 7 -> 8 <-> 7 -> 9 -> 11 -> 13
	 * convertInt_4: 1 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8 <-> 7 -> 9 -> 10 -> 11 -> 13
	 * 
	 * CONDITIONS:
	 * Node: 2
	 * Cp1: str.length > 6
	 * Cp2: str.length <= 6
	 * Node: 5
	 * Cp1: str[0] == "-"
	 * Cp2: str[0] != "-"
	 * Node: 7 // For
	 * Cp1: i < str.length
	 * Cp2: i > str.length
	 * Node: 9
	 * Cp1: str[0] == "-"
	 * Cp2: str[0] != "-"
	 * Node: 11
	 * number > 32767 || number < -32768
	 * Cp1: TRUE || TRUE -> TRUE
	 * Cp2: TRUE || FALSE -> TRUE
	 * Cp3: FALSE || TRUE -> TRUE
	 * Cp4: FALSE || FALSE -> FALSE
	 *  
	 * COMPLEXITY:
	 * Regions: 4
	 * Edges: 15
	 * Nodes: 13
	 * Edges - Nodes + 2 = 4
	 * Predicates Nodes: 5
	 * Predicate Nodes + 1 = 6 
	 */
	
	@Test
	public void convertInt_1() {
		char[] str = {'1','2','3','4','5','6','7'};
		assertThrows(Exception.class, () -> ci.convert(str));
	}
	
	@Test
	public void convertInt_2() {
		char[] str = {'1','2','3','4','5'};
		char[] str2 = {'-','1','2','3','4','5'};
		try {
			assertEquals(12345, ci.convert(str));
			assertEquals(-12345, ci.convert(str2));
		} 
		catch(Exception e) {
			fail("Exception");
		}
	}

	@Test
	public void convertInt_3() {
		char[] str = {'1','2','3','4','5','6'};
		assertThrows(Exception.class, () -> ci.convert(str));
	}

	@Test
	public void convertInt_4() {
		char[] str = {'-','4','2','3','4','5'};
		assertThrows(Exception.class, () -> ci.convert(str));
	}
	
}
