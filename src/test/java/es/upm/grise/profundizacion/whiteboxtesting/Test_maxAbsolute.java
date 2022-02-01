package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class Test_maxAbsolute {

	@BeforeAll
	static public void beforeAll() {System.out.println("Executed before any test has been run");}

	@AfterAll
	static public void afterAll() {
		System.out.println("Executed after all tests have been run");
	}

	@Test
	public void test_acceso_buble_if() throws InvalidNumberException{
		Exercises c = new Exercises();
		int num[] = {1,2,3,4,5,6};
		assertEquals(-1, c.maxAbsolute(num));
	}

	@Test
	public void test_sin_acceso_primer_bucle_if() throws InvalidNumberException{
		Exercises c = new Exercises();
		int num[] = {1,2,3,4};
		assertEquals(4, c.maxAbsolute(num));
	}

	@Test
	public void test_sin_entrar_bucle_if_de_for() throws InvalidNumberException{
		Exercises c = new Exercises();
		int num[] = {1,2,3};
		assertEquals(3, c.maxAbsolute(num));
	}

	@Test
	public void test_entra_bucle_if_de_for() throws InvalidNumberException{
		Exercises c = new Exercises();
		int num[] = {-1,-2,-3};
		assertEquals(3, c.maxAbsolute(num));
	}

	@Test
	public void test_entra_bucle_if_for_una_vez() throws InvalidNumberException{
		Exercises c = new Exercises();
		int num[] = {-1,2,3};
		assertEquals(3, c.maxAbsolute(num));
	}

}
