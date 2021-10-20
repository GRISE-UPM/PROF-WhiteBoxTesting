package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_convertInt {

	@Test
	@DisplayName("str lenght > 6 returns exception")
	public void strLengthException() throws Exception {
		Exercises exercises = new Exercises();
		Exercises.convertInt convertInt = exercises.new convertInt();

		String str = "BuenosDias";

		assertThrows(Exception.class, () -> convertInt.convert(str.toCharArray()));
	}

	@Test
	@DisplayName("str is biggen than 32767 or lower than -32768 returns exception")
	public void strBigger32767() throws Exception {
		Exercises exercises = new Exercises();
		Exercises.convertInt convertInt = exercises.new convertInt();

		String str = "38000";

		assertThrows(Exception.class, () -> convertInt.convert(str.toCharArray()));
	}


	@Test
	@DisplayName("str becomes a number returns 10")
	public void strNumber() throws Exception {
		Exercises exercises = new Exercises();
		Exercises.convertInt convertInt = exercises.new convertInt();

		String str = "10";

		assertEquals(10, convertInt.convert(str.toCharArray()));
	}



}
