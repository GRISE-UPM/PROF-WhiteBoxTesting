package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Test_foo1 {
	
	private static Exercises exercises;
	
	@BeforeAll
	static void init() {
		exercises = new Exercises();
	}

	@Test
	public void xLessThanFive() {
		
		float x = 2;
		float y = 4;
		
		float expectedValue = 2;
		float value = exercises.foo1(x, y);
		
		assertEquals(expectedValue, value);
		
	}
	
	@Test
	public void xGraterThanFive() {
		
		float x = 6;
		float y = 16;
		
		float expectedValue = 1;
		float value = exercises.foo1(x, y);
		
		assertEquals(expectedValue, value);
		
	}

}
