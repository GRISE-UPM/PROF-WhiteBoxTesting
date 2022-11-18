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

}
