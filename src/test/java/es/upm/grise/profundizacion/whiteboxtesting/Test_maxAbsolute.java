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
	public void test_int_4() throws InvalidNumberException{
		Exercises c = new Exercises();
		//char pl[] = {'p','a', 'l', 'a', 'b', 'r', 'a'};
		int num[] = {1,2,3,4};
		assertEquals(4, c.maxAbsolute(num));
	}

	@Test
	public void test_int_neg() throws InvalidNumberException{
		Exercises c = new Exercises();
		int num[] = {-1,-2,-3};
		assertEquals(3, c.maxAbsolute(num));
	}

	@Test
	public void test_int_cero() throws InvalidNumberException{
		Exercises c = new Exercises();
		int num[] = {0,-2,-3};
		assertEquals(3, c.maxAbsolute(num));
	}

}
