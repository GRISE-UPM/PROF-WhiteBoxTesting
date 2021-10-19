package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

	static convertInt convertInt;

	@BeforeEach
	void setup() {
		convertInt = new Exercises().new convertInt();
	}
	
	@Test
	public void test() {
		try {
			assertEquals(49,convertInt.convert(new char[] {'a'}));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
