package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {

	Exercises exercises = new Exercises();

	@Test
	public void longer_6_throws_exception() throws Exception {
		assertThrows(Exception.class, () -> exercises.new convertInt().convert("1234567".toCharArray()));
	}
	@Test
	public void bigger_32767_throws_exception() throws Exception {
		assertThrows(Exception.class, () -> exercises.new convertInt().convert("32768".toCharArray()));
	}
	@Test
	public void lower_minus32768_throws_exception() throws Exception {
		assertThrows(Exception.class, () -> exercises.new convertInt().convert("-32769".toCharArray()));
	}

	@Test
	public void convertIntPostiveTest() throws Exception {
		assertEquals(27, exercises.new convertInt().convert("27".toCharArray()));
	}

	@Test
	public void convertIntNegativeTest() throws Exception {
		assertEquals(-27, exercises.new convertInt().convert("-27".toCharArray()));
	}

}
