package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_foo2 {

	@Test
	public void foo2Test() {
		Exercises exercises = new Exercises();
		assertEquals(2, exercises.foo2(20, 10));
	}

}
