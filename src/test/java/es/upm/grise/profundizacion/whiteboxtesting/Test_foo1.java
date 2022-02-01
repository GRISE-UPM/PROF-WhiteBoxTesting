package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Test_foo1 {

	@BeforeAll
	static public void beforeAll() {System.out.println("Executed before any test has been run");}

	@AfterAll
	static public void afterAll() {
		System.out.println("Executed after all tests have been run");
	}


	@Test
	public void test_acceso_bucle_if() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(0.0625, c.foo1(6,1), 0.01);
	}

	@Test
	public void test_sin_acceso_bucle() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(1, c.foo1(1,1), 0.01);
	}

	@Test
	public void test_y_mayor_x() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo1(1,2), 0.01);
	}

	@Test
	public void test_cero() throws InvalidNumberException{
		Exercises c = new Exercises();
		Exception ex = null;
		try {
			c.foo1(0,0);
		} catch (Exception a) {
			ex = a;
		}
	}

	@Test
	public void test_sin_acceso_bucle_5() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(0.2, c.foo1(5,1), 0.01);
	}
}
