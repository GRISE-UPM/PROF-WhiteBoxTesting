package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

public class Test_convertInt {

	@BeforeAll
	public static void setUp() {
		System.out.println("Setting up foo2 test...");
	}

	@Test
	@DisplayName("Test that passes an array that's too long and expects an Exception")
	public void shouldThrowExceptionBecauseStringTooLong() {
		char[] str = { '1', '2', '3', '4', '5', '6' , '7'};

		assertThrows(Exception.class, () -> {
			(new Exercises()).new convertInt().convert(str);
		});
	}

	@Test
	@DisplayName("Tests that passes an array that represents a integer that's too big and expects an Exception")
	public void shouldThrowExceptionBecauseNumberIsTooLong() {
		char[] str = { '9', '9', '9', '9', '9' };

		assertThrows(Exception.class, () -> {
			(new Exercises()).new convertInt().convert(str);
		});
	}

	@Test
	@DisplayName("Test that passes a correct array and expects its integer representation as 1234")
	public void shouldReturnCorrectPosNumber() {
		char[] str = { '1', '2', '3', '4' };
		try {
			assertEquals(1234, (new Exercises()).new convertInt().convert(str), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("Test that passes a correct array and expects its integer representation as -1234")
	public void shouldReturnCorrectNegNumber() {
		char[] str = { '-', '1', '2', '3', '4' };
		try {
			assertEquals(-1234, (new Exercises()).new convertInt().convert(str), 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterAll
	public static void tearDown() {
		System.out.println("foo2 tests done.");
	}
}
