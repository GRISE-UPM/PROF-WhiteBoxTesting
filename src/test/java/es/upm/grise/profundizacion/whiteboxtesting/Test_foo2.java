package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test_foo2 {

	private final Exercises exercises = new Exercises();

	@BeforeAll
	static public void beforeAll() {
		System.out.println("foo2 tests started");
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("foo2 tests finished");
	}

	@Test
	public void test_AGTB_cosALT0() {
		float a = 180;	// cos 180 = -1
		float b = 90;
		assertEquals(2.0, exercises.foo2(a, b));
	}

	@Test
	public void test_AGTB_cosAGE0_cosBGT0() {
		float a = 360;	// cos 360 = 1
		float b = 0;	// cos 0 = 1
		assertEquals(180.0, exercises.foo2(a, b));
	}

	@Test
	public void test_AGTB_cosAGE0_cosBLE0() {
		float a = 360;	// cos 360 = 1
		float b = 180;	// cos 180 = -1
		assertEquals(2.0, exercises.foo2(a, b));
	}

	@Test
	public void test_ALEB_cosALT0() {
		float a = 180;	// cos 180 = -1
		float b = 360;
		assertEquals(2.0, exercises.foo2(a, b));
	}

	@Test
	public void test_ALEB_cosAGE0_cosBGT0() {
		float a = 0;	// cos 0 = 1
		float b = 360;	// cos 360 = 1
		assertEquals(180.0, exercises.foo2(a, b));
	}

	@Test
	public void test_ALEB_cosAGE0_cosBLE0() {
		float a = 0;	// cos 0 = 1
		float b = 180;	// cos 180 = -1
		assertEquals(90.0, exercises.foo2(a, b));
	}

}
