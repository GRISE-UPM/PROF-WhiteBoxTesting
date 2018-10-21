package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises ex = new Exercises();
	
	@Test
	public void less_equals_5_all_positive_return_max() {
		int [] numbers = {1,3,5,2};
		
		assertEquals(5, ex.max_absolute(numbers) );
	}
	
	@Test
	public void less_equals_5_some_negative_return_max() {
		int [] numbers = {1,3,-5,2};
		
		assertEquals(5, ex.max_absolute(numbers) );
	}
	@Test
	public void more_5_some_return_minus_1() {
		int [] numbers = {1,3,5,2,4,8};
		
		assertEquals(-1, ex.max_absolute(numbers) );
	}


}
