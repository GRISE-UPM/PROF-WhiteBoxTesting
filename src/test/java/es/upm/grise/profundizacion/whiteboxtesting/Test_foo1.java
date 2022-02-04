package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

public class Test_foo1 {

	Exercises ej1;
	private static float DELTA = 0.0f; // https://stackoverflow.com/questions/7554281/junit-assertions-make-the-assertion-between-floats

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Inicio tests foo1");
	}

	@BeforeEach
	public void beforeEach() {
		ej1 = new Exercises();
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("Final tests foo1");
	}


	// if (x > 5)  (x=10, y=10)
	@Test
	public void test_xmay5() {
		float x = 10;
		float y = 10;
		assertEquals(0.5, ej1.foo1(x,y), DELTA);
	}

	// else // (x <= 5)  (x=4, y=2)
	@Test
	public void test_xmen5() {
		float x = 4;
		float y = 2;
		assertEquals(0.5, ej1.foo1(x,y), DELTA);
	}

	// y = y / x;  (x=0, y=0)
	@Test
	public void test_div0() {
		float x = 0;
		float y = 0;
		assertEquals(Float.NaN, ej1.foo1(x,y), DELTA);
	}

}
