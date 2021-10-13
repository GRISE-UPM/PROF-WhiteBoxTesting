package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;
import org.junit.jupiter.api.Test;

public class Test_convertInt {

	private final convertInt convert = (new Exercises()).new convertInt();

	@Test
	public void testInputTooLong() {
		assertThrows(Exception.class, () ->
			convert.convert(new char[]{'1','1','1','1','1','1','1'})
		);
	}

	@Test
	public void testPositiveInput() {
		try {
			assertEquals(12345, convert.convert(new char[]{'1','2','3','4','5'}));
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}

	@Test
	public void testNegativeInput() {
		try {
			assertEquals(-12345, convert.convert(new char[]{'-', '1','2','3','4','5'}));
		} catch (Exception e) {
			fail("Exception thrown");
		}
	}

	@Test
	public void testTooBigPositiveInput() {
		assertThrows(Exception.class, () ->
			convert.convert(new char[]{'3','2','7','6','8'})
		);
	}

	@Test
	public void testTooBigNegativeInput() {
		assertThrows(Exception.class, () ->
			convert.convert(new char[]{'-', '3','2','7','6','9'})
		);
	}

	@Test
	public void testMaxPositiveInput() {
		assertDoesNotThrow(() ->
			convert.convert(new char[]{'3','2','7','6','7'})
		);
	}

	@Test
	public void testMaxNegativeInput() {
		assertDoesNotThrow(() ->
			convert.convert(new char[]{'-', '3','2','7','6','8'})
		);
	}

}
