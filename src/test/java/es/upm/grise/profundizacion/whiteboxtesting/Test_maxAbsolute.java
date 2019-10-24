package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {

	Exercises exercises;
		
		// CC = 4
		
		@Before
		public void setUp() {
			exercises = new Exercises();
		}
		
		@Test
		public void testLengthGreaterThan5() {
			assertEquals(-1, exercises.maxAbsolute(new int []{1,5,7,1,5,7}));
		}
		
		@Test
		public void testNoNegatives() {
			assertEquals(5, exercises.maxAbsolute(new int []{1,5}));
		}
		
		@Test
		public void testNegatives() {
			assertEquals(5, exercises.maxAbsolute(new int []{-1,-5}));
		}

	}