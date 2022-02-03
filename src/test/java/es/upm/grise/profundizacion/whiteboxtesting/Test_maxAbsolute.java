package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Test_maxAbsolute {

	@Test
	public void test1_maxAbsolute_maxlength () {
		Exercises ex =  new Exercises();
		assertEquals(-1, ex.maxAbsolute(new int[8]));
	}
	
	@Test
	public void test2_maxAbsolute_pos() {
		Exercises ex =  new Exercises();
		assertEquals(4, ex.maxAbsolute(new int[]{1,2,3,4}));
	}

	@Test
	public void test3_maxAbsolute_neg() {
		Exercises ex =  new Exercises();
		assertEquals(4, ex.maxAbsolute(new int[]{-1,-2,-3,-4}));
	}
	
}

