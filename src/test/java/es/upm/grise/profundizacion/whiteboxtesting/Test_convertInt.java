package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class Test_convertInt {
	Exercises.convertInt c;

	@BeforeAll
	static public void beforeAll(){
		System.out.println("Starting Tests for the convertInt class");
	}

	@BeforeEach
	public void init(TestInfo testInfo) {
		c = new Exercises().new convertInt();
		System.out.println("Start..." + testInfo.getDisplayName());
	}

	@DisplayName("Test 1 -> Input array that is too long and throws exception")
	@Test
	public void convertIntInputTooLong() {
		char[] JavaCharArray = {'1', '2', '3', '4', '5', '6', '7', '8'};
		assertThrows(Exception.class, ()-> c.convert(JavaCharArray));
	}

	@DisplayName("Test 2 -> Positive input array")
	@Test
	public void convertIntPositiveInput() throws Exception {
		char[] JavaCharArray = {'1', '2'};
		c = new Exercises().new convertInt();
		assertEquals(12, c.convert(JavaCharArray));
	}

	@DisplayName("Test 3 -> Negative input array")
	@Test
	public void convertIntNegativeInput() throws Exception {
		char[] JavaCharArray = {'-', '1', '2'};
		c = new Exercises().new convertInt();
		assertEquals(-12, c.convert(JavaCharArray));
	}

	@DisplayName("Test 4 -> Input array is over max val of 32767 and throws exception")
	@Test
	public void convertIntMaxValueExceeded() throws Exception {
		char[] JavaCharArray = {'5', '0', '0', '0', '0'};
		c = new Exercises().new convertInt();
		assertThrows(Exception.class,() -> c.convert(JavaCharArray));
	}

	@DisplayName("Test 5 -> Input array is over min val of -32768 and throws exception")
	@Test
	public void convertIntMinValueExceeded() throws Exception {
		char[] JavaCharArray = {'-','3', '2', '7', '6', '9'};
		c = new Exercises().new convertInt();
		assertThrows(Exception.class,() -> c.convert(JavaCharArray));
	}

	@DisplayName("Test 6 -> Input array is letters instead of numbers")
	@Test
	public void convertIntLetters() throws Exception {
		char[] JavaCharArray = {'a','b', 'c', 'd', 'e', 'f'};
		c = new Exercises().new convertInt();
		assertThrows(Exception.class,() -> c.convert(JavaCharArray));
	}

	@AfterEach
	public void tearDown(TestInfo testInfo) {
		System.out.println("Finished..." + testInfo.getDisplayName());
	}

	@AfterAll
	static public void closeConvertInt(){
		System.out.println("Finished convertInt tests");
	}


}
