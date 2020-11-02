package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Test_maxAbsolute {
	
	Exercises e1;
	@Before
	public void conf() {
		e1 = new Exercises();
	}

	@Test
	public void testNormalArray() {
		e1 = new Exercises();
		int[] nums = {1,2,3,4,5,6};
		assertEquals(-1,e1.maxAbsolute(nums));
	}
	@Test
	public void testArrayWithNegativeNumber() {
		e1 = new Exercises();
		int[] nums = {1,-2,3,4};
		assertEquals(4,e1.maxAbsolute(nums));
	}

}
