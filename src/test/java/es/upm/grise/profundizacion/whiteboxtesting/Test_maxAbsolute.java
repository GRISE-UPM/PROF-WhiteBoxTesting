package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

  private Exercises ex = new Exercises();

  int[] vector5 = {2,-3,14,7,1};
  int[] vectorNegative5 = {2,-3,5,-7,1};
  int[] vector6 = {1,2,3,4,5,6};

	@Test
	public void testMoreThan5Numbers() {
		assertEquals(-1, ex.maxAbsolute(vector6));
	}

  @Test
	public void testPositiveMax() {
		assertEquals(14, ex.maxAbsolute(vector5));
	}

  @Test
	public void testNegtiveMax() {
		assertEquals(7, ex.maxAbsolute(vectorNegative5));
	}

}
