package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_convertInt {

	@Test
	public void testException() {
		char[] testArray = new char[]{1, 2, 3, 4, 5, 6, 8, 9, 10};
		Assertions.assertThrows(Exception.class, () -> Exercises.convertInt.convert(testArray));
	}

	@Test
	public void testException2() throws Exception {
		char[] testArray = new char[]{'a', 'b', 'c', 'd'};
		Assertions.assertThrows(Exception.class, () -> Exercises.convertInt.convert(testArray));
	}

	@Test
	public void testException3() throws Exception {
		char[] testArray = new char[]{'-', 'b'};
		Assertions.assertEquals(-50, Exercises.convertInt.convert(testArray));
	}

}
