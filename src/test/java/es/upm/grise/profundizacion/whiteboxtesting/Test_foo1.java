package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class Test_foo1 {

	@BeforeAll
	public void setUp() {
		System.out.println("Setting up foo1 test...");
	}

	@Test
	@DisplayName("Test that passes two 0's ans expects a NaN")
	public void shouldReturnNaNBecauseBothNumbersAreZero() {
		assertEquals(Float.NaN, (new Exercises()).foo1(0f, 0f), 0.01);
	}

	@Test
	@DisplayName("Test that passes 1 and 0 and expects a 0")
	public void shouldReturnZeroBecauseFirstNumberIsZero() {
		assertEquals(0f, (new Exercises()).foo1(1f, 0f), 0.01);
	}

	@Test
	@DisplayName("Test that passes two 5's and expects a 1")
	public void shouldReturnOneBecauseBothNumbersBelowFiveAndEqual() {
		assertEquals(1f, (new Exercises()).foo1(5f, 5f), 0.01);
	}

	@Test
	@DisplayName("Test that passes 30 and 50 and expects a 1.25")
	public void shouldReturnZeroPointFive() {
		assertEquals(0.5f, (new Exercises()).foo1(90f, 50f), 0.01);
	}

	@Test
	@DisplayName("Test that passes 990 and 10 and expects a 100")
	public void shouldReturnOneThird() {
		assertEquals(0.333f, (new Exercises()).foo1(140f, 50f), 0.001);
	}

	@AfterAll
	public void tearDown() {
		System.out.println("foo1 tests done.");
	}
}
