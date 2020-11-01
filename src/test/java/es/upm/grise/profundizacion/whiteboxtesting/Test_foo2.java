package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_foo2 {
	
	private static Exercises exercises;
	
	@BeforeAll
	static void init() {
		exercises = new Exercises();
	}

	@Test
	public void aLessThanbCosALessThanZeroAndCosBGreaterThanZero() {
		
		float a = 3.14F;
		float b = 2*3.14F;
		
		float expectedValue = 2;
		float value = exercises.foo2(a, b);
		
		assertEquals(expectedValue, value);
		
	}
	
	@Test
	public void aLessThanbCosCosAGreaterThanZeroBLessThanZero() {
		
		float a = 0;
		float b = 3.14F;
		
		float expectedValue = (a+b)/2;
		float value = exercises.foo2(a, b);
		
		assertEquals(expectedValue, value);
		
	}
	
	@Test
	public void aGreaterThanBCosALessThanZeroAndCosBLessThanZero() {
		
		float a = 3*3.14F;
		float b = 3.14F;
		
		float expectedValue = 2;
		float value = exercises.foo2(a, b);
		
		assertEquals(expectedValue, value);
		
	}
	
	@Test
	public void aGreaterThanBCosAGreaterThanZeroAndCosBGreaterThanZero() {
		
		float a = 2*3.14F;
		float b = 0F;
		
		float expectedValue = 2;
		float value = exercises.foo2(a, b);
		
		assertEquals(expectedValue, value);
		
	}

}
