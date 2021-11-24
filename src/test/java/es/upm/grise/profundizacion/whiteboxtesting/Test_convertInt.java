package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class Test_convertInt {

	private Exercises exercises;
	private Exercises.convertInt convertInt;


	@BeforeEach
	public void beforeEach() {
		this.exercises = new Exercises();
		this.convertInt = this.exercises.new convertInt();
	}

	@DisplayName("The value of 40000 throws exception")
	@Test()
	public void value_minus_40000_throws_exception(){
		String string = "40000";

		Exception exception = assertThrows(Exception.class, () -> {
			convertInt.convert(string.toCharArray());
		});

		assertNotNull(exception);
	}

	@DisplayName("The value of -12 is -12")
	@Test()
	public void value_minus_12_returns_minus_12() throws Exception {
		String string = "-12";

		assertEquals(-12, this.convertInt.convert(string.toCharArray()));
	}


	@DisplayName("The length of string is greater than 6")
	@Test()
	public void length_greater_than_6() throws Exception {
		String string = "1234567";

		Exception exception = assertThrows(Exception.class, () -> {
			convertInt.convert(string.toCharArray());
		});

		assertNotNull(exception);
	}
}
