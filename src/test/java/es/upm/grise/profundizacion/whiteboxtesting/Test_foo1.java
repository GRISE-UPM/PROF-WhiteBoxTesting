package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_foo1 {

	Exercises ex;
	@BeforeEach
	public void init() {
		ex = new Exercises();
	}

	@DisplayName("Test 1 -> x = 10 and y = 20")
	@Test
	public void testfoo1ResultOne() {
		assertEquals(1, ex.foo1(10, 20),1);
	}

	
	@DisplayName("Test 2 -> x = 2 and y = 4")
	@Test
	public void testfoo1ResultTwo() {
		assertEquals(2, ex.foo1(2, 4),1);
	}

}
