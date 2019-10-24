package es.upm.grise.profundizacion.whiteboxtesting;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir
// una cobertura del 100% con menos tests.

public class Test_convertInt {

	Exercises exercise;
	Exercises.convertInt convInt;

	@Before
	public void setup() {
		exercise = new Exercises();
		convInt  = exercise.new convertInt();
	}

	@Test (expected = Exception.class)
	public void length_positive_number_longer_than_6_digits() throws Exception {
		char[] number = { '9', '9', '9', '9', '9', '9', '9' };
		convInt.convert(number);
	}

	@Test (expected = Exception.class)
	public void length_negative_number_longer_than_6_digits() throws Exception {
		char[] number = { '-', '9', '9', '9', '9', '9', '9', '9' };
		convInt.convert(number);
	}

	@Test (expected = Exception.class)
	public void number_bigger_than_positive_32767() throws Exception {
		char[] number = { '9', '9', '9', '9', '9' };
		convInt.convert(number);
	}

	@Test (expected = Exception.class)
	public void number_smaller_than_negative_32768() throws Exception {
		char[] number = { '-', '9', '9', '9', '9', '9' };
		convInt.convert(number);
	}

	@Test
	public void number_positive_OK() throws Exception {
		char[] number = { '9', '9', '9' };
		assertEquals(999, convInt.convert(number));
	}

	@Test
	public void number_negative_OK() throws Exception {
		char[] number = { '-', '9', '9', '9' };
		assertEquals(-999, convInt.convert(number));
	}

}
