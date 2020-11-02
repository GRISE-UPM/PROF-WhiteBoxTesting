package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test foo1")
public class Test_foo1 {

	Exercises ex = new Exercises();
		
	@Test
	@DisplayName("Test 1 - foo1")
	public void test1() {
		float res = ex.foo1(10, 20);
		assertEquals(res,1,0);
	}
	
	@Test
	@DisplayName("Test 2 - foo1")
	public void test2() {
		float res = ex.foo1(5, 5);
		assertEquals(res, 1, 0);
	}

}
