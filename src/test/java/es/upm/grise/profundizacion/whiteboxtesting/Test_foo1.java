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
	public void test_y_0() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(0, c.foo1(1,0), 0.01);
	}

	@Test
	public void test_x_1() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(1, c.foo1(1,1), 0.01);
	}

	@Test
	public void test_y_5() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(5, c.foo1(1,5), 0.01);
	}

	@Test
	public void test_y_10() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(1, c.foo1(6,16), 0.01);
	}
}
