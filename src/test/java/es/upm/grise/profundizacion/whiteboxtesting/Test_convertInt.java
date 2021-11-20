package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_convertInt {

	Exercises exercises;
	
	Exercises.convertInt convertInt;

	@BeforeEach
	public void configure() {
		exercises = new Exercises();
		convertInt = exercises.new convertInt();
	}
	@Test
	public void convert_case1_Test() throws Exception {
		char[] number = { '-', '1', '5', '0' };
		assertEquals(-150, convertInt.convert(number));
	}	
	
	@Test
	public void convert_case2_Test() throws Exception {
		char[] number = { '-', '1', '5', '0', '5', '1', '9' };
		assertThrows(Exception.class, () -> convertInt.convert(number));
	}

	@Test
	public void convert_case3_Test() throws Exception {
		char[] number = { '9', '9', '9', '9', '9'};
		assertThrows(Exception.class, () -> convertInt.convert(number));
	}
	
	@Test
	public void convert_case4_Test() throws Exception {
		char[] number = { '-', '9', '9', '9', '9', '9'};
		assertThrows(Exception.class, () -> convertInt.convert(number));
	}
}
