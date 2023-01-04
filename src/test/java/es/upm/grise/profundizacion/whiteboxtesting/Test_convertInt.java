package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test_convertInt {

	private final Exercises exercises = new Exercises();
	private final Exercises.convertInt convertInt = exercises.new convertInt();

	@BeforeAll
	static public void beforeAll() {
		System.out.println("convertInt tests started");
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("convertInt tests finished");
	}

	@Test
	public void test_lengthGT6() {
		char[] str = {'0', '1', '2', '3', '4', '5', '6'};
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}

	@Test
	public void test_lengthLE6_POS() throws Exception {
		char[] str = {'0', '1', '2', '3', '4'};
		assertEquals(1234, convertInt.convert(str));
	}

	@Test
	public void test_lengthLE6_NEG() throws Exception {
		char[] str = {'-', '1', '2', '3', '4'};
		assertEquals(-1234, convertInt.convert(str));
	}

	@Test
	public void test_lengthLE6_numberGT32767() {
		char[] str = {'3', '2', '7', '6', '8'};
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}

	@Test
	public void test_lengthLE6_numberLTNEG32767() {
		char[] str = {'-', '3', '2', '7', '6', '9'};
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}

}
