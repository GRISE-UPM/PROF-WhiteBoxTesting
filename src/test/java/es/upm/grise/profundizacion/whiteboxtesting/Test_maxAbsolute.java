package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Test_maxAbsolute {

Exercises ex;
	
	@BeforeEach
	public void init() {
		ex = new Exercises();
	}

	@DisplayName("Test 1 -> numbers.length > 5")
	@Test
	public void testmaxAbsoluteNumbersBiggerThan5() {
		int [] numbers = {1,1,1,1,1,1};
		assertEquals(-1, ex.maxAbsolute(numbers),1);
	}
	
	@DisplayName("Test 1 -> numbers.length < 5")
	@Test
	public void testmaxAbsoluteNumbersLessThan5() {
		int [] numbers = {1,1};
		assertEquals(1, ex.maxAbsolute(numbers),1);
	}

	@DisplayName("Test 1 -> numbers.length < 5 and if")
	@Test
	public void testmaxAbsoluteNumbersLessThan5If() {
		int [] numbers = {1,-1};
		assertEquals(1, ex.maxAbsolute(numbers),1);
	}

	
}
