package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_convertInt {

	@Test
	public void convertTest() throws Exception {
		Exercises exercises = new Exercises();
		Exercises.convertInt convertInt = exercises.new convertInt();
		char[] number = { '-', '1', '5', '0' };

		int result = convertInt.convert(number);

		assertEquals(-150, result);
	}

}
