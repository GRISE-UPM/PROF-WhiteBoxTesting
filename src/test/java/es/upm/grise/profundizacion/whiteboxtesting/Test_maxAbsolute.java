package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test maxAbsolute")
public class Test_maxAbsolute {

	Exercises ex = new Exercises();
	
	@DisplayName("Test 1 - maxAbsolute")
	@Test
	public void test1() {
		int [] numbers = {1,2,3,4,5,6};
		int res = ex.maxAbsolute(numbers);
		assertEquals(res, -1);
	}
	
	@DisplayName("Test 2 - maxAbsolute")
	@Test
	public void test2() {
		int [] numbers = {1,2,3};
		int res = ex.maxAbsolute(numbers);
		assertEquals(res, 3);
	}
	
	@DisplayName("Test 3 - maxAbsolute")
	@Test
	public void test3() {
		int [] numbers = {1,-5,3};
		int res = ex.maxAbsolute(numbers);
		assertEquals(res, 5);
	}

}
