package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test_foo2 {

	Exercises ex;
	
	@BeforeEach
	public void init() {
		ex = new Exercises();
	}

	@DisplayName("Test 1 -> a < b and cos(b) > 0")
	@Test
	public void testfoo2aSmallerThanb() {
		assertEquals(2, ex.foo2(10, 20),2);
	}

	
	@DisplayName("Test 2 -> a > b and cos(a) < 0")
	@Test
	public void testfoo2aBiggerthanb() {
		assertEquals(110, ex.foo2(120, 100),110);
	}
	
	@DisplayName("Test 3 -> cos(a) > 0 and cos(b) < 0")
	@Test
	public void testfoo2bothConditionsFalse() {
		assertEquals(70, ex.foo2(20, 120),70);
	}
	
	@DisplayName("Test 4 -> cos(a) < 0 and cos(b) > 0")
	@Test
	public void testfoo2bothConditionsTrue() {
		assertEquals(70, ex.foo2(120, 20),70);
	}


}
