package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Test_foo2 {

	@BeforeAll
	static public void beforeAll() {System.out.println("Executed before any test has been run");}

	@AfterAll
	static public void afterAll() {
		System.out.println("Executed after all tests have been run");
	}

	@Test
	public void test_a_b_0() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(0,0), 0.01);
	}

	@Test
	public void test_a_3_b_2() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(3,2), 0.01);
	}

	@Test
	public void test_a_neg1() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(-1, c.foo1(-1,1), 0.01);
	}

	@Test
	public void test_a_b_neg1() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(-1,-1), 0.01);
	}

	@Test
	public void test_b_neg1_a_0() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(0,-1), 0.01);
	}

}
