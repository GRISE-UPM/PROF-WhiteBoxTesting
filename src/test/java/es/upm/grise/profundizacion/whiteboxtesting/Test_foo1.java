package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_foo1 {

	private final Exercises exercises = new Exercises();

	@BeforeAll
	static public void beforeAll() {
		System.out.println("foo1 tests started");
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("foo1 tests finished");
	}

	@Test
	public void test_xGT5() {
		float x = 6;
		float y = 16;
		assertEquals(1, exercises.foo1(x,y));
	}

	@Test
	public void test_xLE5() {
		float x = 5;
		float y = 5;
		assertEquals(1, exercises.foo1(x, y));
	}

}
