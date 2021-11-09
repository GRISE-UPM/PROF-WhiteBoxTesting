package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_foo2 {

private static Exercises exer;
	
	public Test_foo2() {
		exer = new Exercises();
	}
	
	@Test
	@DisplayName("Test foo2: a > b")
	public void testAbiggerB() {
		assertEquals(2, exer.foo2(1, 0));
	}
	
	@Test
	@DisplayName("Test foo2: a < b")
	public void testAsmallerB() {
		assertEquals(1.5, exer.foo2(1, 2));
	}
	
	@Test
	@DisplayName("Test foo2: cos(a) < 0 & cos(b) > 0")
	public void testCosAsmaller0ANDCosBbigger0() {
		assertEquals(2, exer.foo2(-2, 1));
	}
	
	@Test
	@DisplayName("Test foo2: cos(a) > 0 & cos(b) > 0")
	public void testCosAbigger0ANDCosBbigger0() {
		assertEquals(2, exer.foo2(-1, 1));
	}
	
	@Test
	@DisplayName("Test foo2: cos(a) > 0 & cos(b) < 0")
	public void testCosAbigger0ANDCosBsmaller0() {
		assertEquals(0.5, exer.foo2(-1, 2));
	}

}
