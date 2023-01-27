package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class Test_convertInt {
	private final Exercises myExercises = new Exercises();
	private final Exercises.convertInt convertInt = myExercises.new convertInt();

	@Test
	public void strBigger6Test() {
		char[] str = {'1', '2', '3', '4', '5', '6', '7'};
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}

	@Test
	public void strLess6Test() throws Exception {
		char[] str = {'1', '2', '3'};
		assertEquals(123, convertInt.convert(str));
		
	}

	@Test
	public void strWithHyphenTest() throws Exception {
		char[] str = {'-', '1', '2', '3', '4'};
		assertEquals(-1234, convertInt.convert(str), 0.00001);
	}

	// Structural test case - 6 areas but overlapping
	// 1. str.length > 6
	@Test
	public void strBigger6Test2() {
		char[] str = {'1', '2', '3', '4', '5', '6', '7'};
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}
	// 2. str.length < 6 && str[0] != '-' && number > 32767
	@Test
	public void strLess6WithHyphenBigger32767Test() {
		char[] str = {'4', '2', '7', '6', '8'};
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}
	// 3. str.length < 6 && str[0] == '-' && number < -32767
	@Test
	public void strLess6WithHyphenLess32767Test() throws Exception {
		char[] str = {'-', '4', '2', '7', '6', '8'};
		assertEquals(-32766, convertInt.convert(str));
	}

	


}
