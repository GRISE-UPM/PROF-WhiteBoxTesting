package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	@Test
	public void null_array_test() {
		Exercises e = new Exercises();
		assertThrows(NullPointerException.class,()->e.maxAbsolute(null));
	}
	
	@Test
	public void empty_array_test() {
		Exercises e = new Exercises();
		int [] nums = {};
		assertEquals(0,e.maxAbsolute(nums));
	}
	
	@Test
	public void positive_numbers_test() {
		Exercises e = new Exercises();
		int [] nums = {1,4,2,1};
		assertEquals(4,e.maxAbsolute(nums));
	}
	
	@Test
	public void long_array_test() {
		Exercises e = new Exercises();
		int [] nums = {1,4,2,1,5,2,1,3,8,2};
		assertEquals(-1,e.maxAbsolute(nums));
	}
	
	@Test
	public void psoitive_and_negative_numbers_test() {
		Exercises e = new Exercises();
		int [] nums = {1,-4,2,-1};
		assertEquals(4,e.maxAbsolute(nums));
	}

}
