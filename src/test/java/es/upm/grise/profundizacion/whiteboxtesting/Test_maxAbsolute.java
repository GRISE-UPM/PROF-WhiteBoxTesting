package es.upm.grise.profundizacion.whiteboxtesting;


import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class Test_maxAbsolute {
	Exercises c;

	@BeforeAll
	static public void beforeAll(){
		System.out.println("Starting Tests for the Exercises.maxAbsolute method");
	}

	@BeforeEach
	public void init(TestInfo testInfo) {
		c = new Exercises();
		System.out.println("Start..." + testInfo.getDisplayName());
	}

	@DisplayName("Test 1 -> Array is too big")
	@Test
	public void maxAbsoluteArrayTooBig() {
		int[] numArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		assertEquals(-1, c.maxAbsolute(numArray));
	}

	@DisplayName("Test 2 -> Max value is positive")
	@Test
	public void maxAbsolutePositiveValue() {
		int[] numArray = new int[]{10, 20, 10};
		assertEquals(20, c.maxAbsolute(numArray));
	}

	@DisplayName("Test 3 -> Max value is negative")
	@Test
	public void maxAbsoluteNegativeValue() {
		int[] numArray = new int[]{10, -20, 12};
		assertEquals(20, c.maxAbsolute(numArray));
	}

	@DisplayName("Test 4 -> Array elements are all negative")
	@Test
	public void maxAbsoluteNegativeArray() {
		int[] numArray = new int[]{-10, -20, -12};
		assertEquals(20, c.maxAbsolute(numArray));
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
