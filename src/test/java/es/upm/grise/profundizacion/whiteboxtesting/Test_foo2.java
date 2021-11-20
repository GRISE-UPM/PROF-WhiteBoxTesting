package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test_foo2 {

	Exercises exercises;

	@BeforeEach
	public void configure() {
		exercises = new Exercises();
	}
	
	@Test
	public void foo2_case1_Test() {
		assertEquals(2, exercises.foo2(20, 10));
	}

	@Test
	public void foo2_case2_Test() {
		assertEquals(2, exercises.foo2(10, -10));
	}
	
	@Test
	public void foo2_case3_Test() {
		assertEquals(45, exercises.foo2(0, 90));
	}
	
	@Test
	public void foo2_case4_Test() {
		assertEquals(2, exercises.foo2(0, 0));
	}
}
