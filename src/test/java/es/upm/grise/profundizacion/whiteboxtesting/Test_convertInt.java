package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.*;

public class Test_convertInt {

	Exercises.convertInt coInt;

	@BeforeAll
	static public void beforeAll() {
		System.out.println("Inicio tests convertInt");
	}

	@BeforeEach
	public void beforeEach() {
		coInt = new Exercises.convertInt();
	}

	@AfterAll
	static public void afterAll() {
		System.out.println("Final tests convertInt");
	}

	// if (str.length > 6)  str={1, 2, 3, 4, 5, 6}
	@Test
	public void test_lengthmay6() throws Exception {
		char[] str = {1, 2, 3, 4, 5, 6};
		assertThrows(Exception.class, () -> coInt.convert(str));
	}

	// if (str[0]=='-')  str = {'-', 1, 0}
	@Test
	public void test_numnegativ() throws Exception {
		char[] str = {'-', 1, 0};
		assertEquals(518, coInt.convert(str));
	}

	// no entra en for(; i<str.length; i++){  str = {'-'}
	@Test
	public void test_solonegativ() throws Exception {
		char[] str = {'-'};
		assertEquals(0, coInt.convert(str));
	}

	// if (number > 32767 || number < -32768)  str = {3, 2, 7, 6, 8}
	@Test
	public void test_may32767() throws Exception {
		char[] str = {3, 2, 7, 6, 8};
		assertThrows(Exception.class, () -> coInt.convert(str));
	}

	// if (number > 32767 || number < -32768)  str = {'-', 3, 2, 7, 6, 9}
	@Test
	public void test_men32768() throws Exception {
		char[] str = {'-', 3, 2, 7, 6, 9};
		assertThrows(Exception.class, () -> coInt.convert(str));
	}

	// else // if (number > 32767 || number < -32768)  str = {3, 2, 1}
	@Test
	public void test_dentrango() throws Exception {
		char[] str = {3, 2, 1};
		assertEquals(-5007, coInt.convert(str));
	}

}
