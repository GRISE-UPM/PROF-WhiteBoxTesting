package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class Test_foo1 {

	private static Exercises exercises;

	@BeforeAll
	void setUp() {
		System.out.println("Setting up foo1 test...");
		exercises = new Exercises();
	}

	@Test
	@DisplayName("Test that passes two 0's ans expects a NaN")
	void shouldReturnNaNBecauseBothNumbersAreZero() {
		assertEquals(Float.NaN, exercises.foo1(0f, 0f), 0.01);
	}

	@Test
	@DisplayName("Test that passes 1 and 0 and expects a 0")
	void shouldReturnZeroBecauseFirstNumberIsZero() {
		assertEquals(0f, exercises.foo1(1f, 0f), 0.01);
	}

	@Test
	@DisplayName("Test that passes two 5's and expects a 1")
	void shouldReturnOneBecauseBothNumbersBelowFiveAndEqual() {
		assertEquals(1f, exercises.foo1(5f, 5f), 0.01);
	}

	@Test
	@DisplayName("Test that passes 10 and 20 and expects a 10")
	void shouldReturnTen() {
		assertEquals(10f, exercises.foo1(10f, 20f), 0.01);
	}

	@Test
	@DisplayName("Test that passes 990 and 10 and expects a 100")
	void shouldReturnOneHundred() {
		assertEquals(100f, exercises.foo1(990f, 10f), 0.01);
	}

	@AfterAll
	void tearDown() {
		System.out.println("foo1 tests done.");
	}
}
