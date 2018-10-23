package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises ex = new Exercises();

	@Test
	public void test_LongitudMayor5() {
		int[] values = {1,2,3,4,5,6};
		assertEquals(ex.max_absolute(values), -1);		
	}
	
	@Test
	public void test_ValorMaxConValorNegativo() {
		int[] values2 = {1,2,-3,4};
		assertEquals(ex.max_absolute(values2), 4);
		
	}

}
