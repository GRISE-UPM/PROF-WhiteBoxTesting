package es.upm.grise.profundizacion.whiteboxtesting;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_foo1 {
	
	static Exercises exercises;

	@BeforeEach
	void setup() {
		exercises = new Exercises();
	}
	
	@Test
	void testXGreaterThan5() {
		assertEquals(0.75, exercises.foo1(6, 12), 0.01);
	}
	
	@Test
	void testXNotGreaterThan5() {
		assertEquals(12, exercises.foo1(2, 24), 0.01);
	}

}
