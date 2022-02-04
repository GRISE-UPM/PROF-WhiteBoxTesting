package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

public class Test_foo2 {

	Exercises ej1;
	private static float DELTA = 0.0f; // https://stackoverflow.com/questions/7554281/junit-assertions-make-the-assertion-between-floats

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Inicio tests foo2");
	}

	@BeforeEach
	public void beforeEach() {
		ej1 = new Exercises();
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("Final tests foo2");
	}


	// if (a > b)  (x=180, y=20)
	@Test
	public void test_amayb() {
		float a = 180;
		float b = 20;
		assertEquals(100.0, ej1.foo2(a,b), DELTA);
	}

	// if (a <= b)  (x=4, y=5)
	@Test
	public void test_amenb() {
		float a = 4;
		float b = 5;
		assertEquals(2.0, ej1.foo2(a,b), DELTA);
	}

	// if (Math.cos(a) < 0 || Math.cos(b) > 0)  (x=7, y=0)
	@Test
	public void test_ifcosaorcosb() {
		float a = 7;
		float b = 0;
		assertEquals(2, ej1.foo2(a,b), DELTA);
	}

	// else // (Math.cos(a) >= 0 && Math.cos(b) =< 0)  (x=0, y=90)
	@Test
	public void test_elsecosaorcosb() {
		float a = 0;
		float b = 90;
		assertEquals(45.0, ej1.foo2(a,b), DELTA);
	}

}
