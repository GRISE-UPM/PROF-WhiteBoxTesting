package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {
	
	private Exercises exercises;
	
	@Before
	public void beforeTest() {
		this.exercises = new Exercises();
	}
	
	@Test
	public void test1() {
		int[] numbers = {1,2,3,4,5,6};
		assertEquals(-1, this.exercises.max_absolute(numbers));
	}
	@Test
	public void test2() {
		int[] numbers = {1,-1,3};
		assertEquals(3, this.exercises.max_absolute(numbers));
	}

}
