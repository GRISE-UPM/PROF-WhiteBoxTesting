package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_foo1 {

	Exercises exercises;
	public static final float DELTA =  0.001F;

	@Before
	public void setUp() {
		exercises = new Exercises();
	}

	@Test
	public void testXLowerThan5() {
		assertEquals(24 / 4, exercises.foo1(4, 24),DELTA);
	}
	
	@Test
	public void testXGreaterThan5() {
		assertEquals(24F / (6+10), exercises.foo1(6, 24),DELTA);
	}
}
