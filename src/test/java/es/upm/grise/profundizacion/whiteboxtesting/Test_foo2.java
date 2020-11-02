package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test foo2")
public class Test_foo2 {

	Exercises ex = new Exercises();
	
	@DisplayName("Test 1 - foo2")
	@Test
	public void test1() {
		float res = ex.foo2(45, 180);
		assertEquals(res, 112.5, 0);
	}
	
	@DisplayName("Test 2 - foo2")
	@Test
	public void test2() {
		float res = ex.foo2(180, 90);
		assertEquals(res, 2, 0);
	}
	
	@DisplayName("Test 3 - foo2")
	@Test
	public void test3() {
		float res = ex.foo2(45, 45);
		assertEquals(res, 2, 0);
	}
}
