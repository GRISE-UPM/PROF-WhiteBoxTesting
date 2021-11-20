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
	public void foo1_case1_Test() {
		assertEquals(2, exercises.foo1(10, 40));
	}
	
	@Test
	public void foo1_case2_Test() {
		assertEquals(1, exercises.foo1(2, 2));
	}
}
