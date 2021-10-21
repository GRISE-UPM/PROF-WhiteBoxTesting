package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class Test_foo2 {
	Exercises c;
	private static float DELTA = 0.0f; // https://stackoverflow.com/questions/7554281/junit-assertions-make-the-assertion-between-floats

	@BeforeAll
	static public void beforeAll(){
		System.out.println("Starting Tests for the Exercises.foo2 method");
	}

	@BeforeEach
	public void init(TestInfo testInfo) {
		c = new Exercises();
		System.out.println("Start..." + testInfo.getDisplayName());
	}

	@DisplayName("Test 1 -> A equals B")
	@Test
	public void foo2AEqualsB() {
		float a = 10;
		float b = 10;
		assertEquals(2, c.foo2(a, b), DELTA);
	}

	@DisplayName("Test 2 -> A is greater than B")
	@Test
	public void foo2AGreaterThanB() {
		float a = 10;
		float b = 5;
		assertEquals(7.5, c.foo2(a, b), DELTA);
	}

	@DisplayName("Test 3 -> A is less than B")
	@Test
	public void foo2ALessThanB() {
		float a = 5;
		float b = 10;
		assertEquals(7.5, c.foo2(a, b), DELTA);
	}

	@AfterEach
	public void tearDown(TestInfo testInfo) {
		System.out.println("Finished..." + testInfo.getDisplayName());
	}

	@AfterAll
	static public void closeConvertInt(){
		System.out.println("Finished convertInt tests");
	}

}
