package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {

private Exercises exercises;
	
	@Before
	public void beforeTest() {
		exercises = new Exercises();
	}

	@Test
	public void test1() {
		int[] i = {1,2,3,4,5,6};
		assertEquals(-1,this.exercises.max_absolute(i),0);
	}
	
	@Test
	public void test2() {
		int[] i = {1,7,-3,2};
		assertEquals(7,this.exercises.max_absolute(i),0);
	}
}
