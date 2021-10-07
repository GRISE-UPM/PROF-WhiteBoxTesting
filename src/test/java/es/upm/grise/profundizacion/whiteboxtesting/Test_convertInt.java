package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

	private static convertInt convInt;

	@BeforeAll
	void setUp() {
		System.out.println("Setting up foo2 test...");
		convInt = (new Exercises()).new convertInt();
	}

	@Test
	@DisplayName("")
	void shouldThrowExceptionBecauseStringTooLong() {
		char[] str = {'1','2','3','4','5','6'};

		assertThrows(Exception.class, () -> {
				convInt.convert(str);
		});
	}

	@Test
	@DisplayName("")
	void shouldThrowExceptionBecauseNumberIsTooLong() {
		char[] str = {'9','9','9','9','9'};

		assertThrows(Exception.class, () -> {
				convInt.convert(str);
		});
	}

	@Test
	@DisplayName("")
	void shouldReturnCorrectPosNumber() {
		char[] str = {'1','2','3','4'};
		try {
			assertEquals(1234, convInt.convert(str), 0);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	@DisplayName("")
	void shouldReturnCorrectNegNumber() {
		char[] str = {'-','1','2','3','4'};
		try {
			assertEquals(-1234, convInt.convert(str), 0);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterAll
	void tearDown() {
		System.out.println("foo2 tests done.");
	}


}
