package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Test_foo1 {

	Exercises exercises;

	@BeforeEach
	public void configure() {
		exercises = new Exercises();
	}

	@Test
	public void foo1Test() {
		assertEquals(2, exercises.foo1(10, 40));
	}

}
