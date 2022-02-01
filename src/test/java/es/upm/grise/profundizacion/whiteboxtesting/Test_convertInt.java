package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import java.util.concurrent.ExecutionException;

public class Test_convertInt {
	Exercises e = new Exercises();

	@BeforeAll
	static public void beforeAll() {System.out.println("Executed before any test has been run");}

	@AfterAll
	static public void afterAll() {
		System.out.println("Executed after all tests have been run");
	}

	@Test
	public void test_entra_primer_if() throws Exception {
		Exercises c = new Exercises();
		Exercises.convertInt e = c.new convertInt();
		Exception ex = null;
		char pl[] = {'1','2', '3', '4', '5', '6', '7'};
		try {
			e.convert(pl);
		} catch (Exception ez) {
			ex = ez;
		}
	}

	@Test
	public void test_entra_solo_for() throws Exception {
		Exercises c = new Exercises();
		Exercises.convertInt e = c.new convertInt();
		Exception ex = null;
		char pl[] = {'1', '2'};
		assertEquals(12, e.convert(pl));
	}

	@Test
	public void test_char_32768() throws Exception {
		Exercises c = new Exercises();
		Exercises.convertInt e = c.new convertInt();
		Exception ex = null;
		char pl[] = {'3', '2', '7', '6','8'};
		try {
			e.convert(pl);
		} catch (Exception ez) {
			ex = ez;
		}
	}

	@Test
	public void test_char_neg32768() throws Exception {
		Exercises c = new Exercises();
		Exercises.convertInt e = c.new convertInt();
		Exception ex = null;
		char pl[] = {'-', '3', '2', '7', '6','8'};
		try {
			e.convert(pl);
		} catch (Exception ez) {
			ex = ez;
		}
	}

	@Test
	public void test_entra_if_0() throws Exception {
		Exercises c = new Exercises();
		Exercises.convertInt e = c.new convertInt();
		Exception ex = null;
		char pl[] = {'-', '1', '2'};
		assertEquals(-12, e.convert(pl));
	}

}
