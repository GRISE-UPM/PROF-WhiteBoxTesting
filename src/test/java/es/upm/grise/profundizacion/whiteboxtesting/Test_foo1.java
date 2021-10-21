package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class Test_foo1 {
	Exercises c;
	private static float DELTA = 0.0f; // https://stackoverflow.com/questions/7554281/junit-assertions-make-the-assertion-between-floats

	@BeforeAll
	static public void beforeAll(){
		System.out.println("Starting Tests for the Exercises.foo1 method");
	}

	@BeforeEach
	public void init(TestInfo testInfo) {
		c = new Exercises();
		System.out.println("Start..." + testInfo.getDisplayName());
	}

	@DisplayName("Test 1 -> x is equal to 5")
	@Test
	public void foo1XisEqualToFive() {
		float x = 5;
		float y = 10;
		assertEquals(2, c.foo1(x, y),DELTA);
	}

	@DisplayName("Test 2 -> x is greater than 5")
	@Test
	public void foo1XisGreaterThanFive() {
		float x = 10;
		float y = 10;
		assertEquals(0.5, c.foo1(x, y),DELTA);
	}

	@DisplayName("Test 3 -> x is less than 5")
	@Test
	public void foo1XisLessThanFive() {
		float x = 2;
		float y = 10;
		assertEquals(5.0, c.foo1(x, y),DELTA);
	}

	@DisplayName("Test 4 -> Zero division")
	@Test
	public void foo1ZeroDivision() {
		float x = 2;
		float y = 0;
		assertEquals(0, c.foo1(x, y),DELTA);
	}

	@DisplayName("Test 5 -> Division by zero, undefined result")
	@Test
	public void foo1divisionUndefined() {
		float x = 0;
		float y = 10;
		assertEquals(Float.POSITIVE_INFINITY, c.foo1(x, y),DELTA);
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
