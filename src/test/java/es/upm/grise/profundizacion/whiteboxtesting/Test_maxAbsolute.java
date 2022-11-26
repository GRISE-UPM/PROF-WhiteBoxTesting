package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_maxAbsolute {

	@Test
	public void tooBigInputTest() {
		Exercises o = new Exercises();
		int[] input = new int[8];
		Assertions.assertEquals(-1,o.maxAbsolute(input));
	}

	@Test
	public void maxNumberTest() {
		Exercises o = new Exercises();
		int[] input = new int[4];
		input[0] = 1;
		input[1] = 4;
		input[2] = 2;
		input[3] = 5;
		Assertions.assertEquals(5,o.maxAbsolute(input));
	}

	@Test
	public void maxNegativeNumberTest() {
		Exercises o = new Exercises();
		int[] input = new int[4];
		input[0] = 1;
		input[1] = 4;
		input[2] = 2;
		input[3] = -5;
		Assertions.assertEquals(5,o.maxAbsolute(input));
	}

	@Test
	public void emptyListTest() {
		Exercises o = new Exercises();
		int[] input = new int[0];
		Assertions.assertEquals(0,o.maxAbsolute(input));
	}

}
