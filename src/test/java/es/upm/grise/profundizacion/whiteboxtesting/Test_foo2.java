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
	public void test_acceso_todos_bucles() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(1,0), 0.01);
	}

	@Test
	public void test_sin_acceso_primer_if() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(1,1), 0.01);
	}

	@Test
	public void test_ini_variables() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(3,1), 0.01);
	}

	@Test
	public void test_b_mayor_a() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(1,3), 0.01);
	}

	@Test
	public void test_b_neg() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(1,-1), 0.01);
	}

	@Test
	public void test_a_neg() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(-1,1), 0.01);
	}

	@Test
	public void test_num_neg() throws InvalidNumberException{
		Exercises c = new Exercises();
		assertEquals(2, c.foo2(-1,-1), 0.01);
	}

}
