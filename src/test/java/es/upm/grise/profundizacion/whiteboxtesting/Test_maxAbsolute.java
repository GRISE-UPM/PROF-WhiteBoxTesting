package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
//import org.junit.Test;

public class Test_maxAbsolute {

	int expected;
	int actual;
	int delta = 0;
	Exercises ej = new Exercises();

	@Test
	public void arrayTooLong() {

		int [] numbers = {1, 2, 3, 4, 5, 6};

		expected = -1;
		actual = ej.maxAbsolute(numbers);

		assertEquals(expected,actual,delta);
	}

	@Test
	public void getMaxValue(){

		int [] numbers = {1, 2, 3, 4, 5};

		expected = 5;
		actual = ej.maxAbsolute(numbers);

		assertEquals(expected,actual,delta);

	}

}
