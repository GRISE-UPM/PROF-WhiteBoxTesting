package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

private static Exercises exercises;
private final int[] NUMBERS = {1,-2,3};
private final int[] NUMBERS2 = {1,-2,3,4,5,6};

	
	@BeforeAll
	static void init() {
		
		exercises = new Exercises();
		
	}

	@Test
	public void lenghtLessThan5() {
		
		float expectedValue = 3;
		float value = exercises.maxAbsolute(NUMBERS);
		
		assertEquals(expectedValue, value);
		
	}
	
	@Test
	public void lenghtGreaterThan5() {
		
		float expectedValue = -1;
		float value = exercises.maxAbsolute(NUMBERS2);
		
		assertEquals(expectedValue, value);
		
	}
	
}
