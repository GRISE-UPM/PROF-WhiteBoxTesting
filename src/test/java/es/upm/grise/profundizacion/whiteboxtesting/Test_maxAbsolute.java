package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {

private Exercises ex;
	
	@Before
	public void createExercice(){
		ex = new Exercises();
	}
	@Test
	public void testMoreThan5Numbers() {
		int[] numbers = {1,2,3,4,5,6,7};
		int res = ex.maxAbsolute(numbers);
		assertEquals(res, -1);
	}
	@Test
	public void testLessThan5Numbers() {
		int[] numbers = {1,2,-1};
		int res = ex.maxAbsolute(numbers);
		assertEquals(res, 2);
	}

}
