package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/*
 * Basis path testing with execution diagram (basis path) located in ex6.jpg
 */
public class Test_maxAbsolute {

  private Exercises ex = new Exercises();

  int[] vector0 = {};
  int[] vector1 = {2,3,-14,-7};
  int[] vector2 = {2,-3,2,9};
  int[] vector5 = {2,-3,14,7,1};
  int[] vectorNegative5 = {2,-3,5,-7,1};
  int[] vector6 = {1,2,3,4,5,6};

  //base test: numbers.length < 5 && i >= numbers.length
  @Test
	public void testEmptyVector() {
		assertEquals(0, ex.maxAbsolute(vector0));
	}

  //branch test: numbers.length > 5
	@Test
	public void testMoreThan5Numbers() {
		assertEquals(-1, ex.maxAbsolute(vector6));
	}

  //branch test: numbers.length < 5 && i < numbers.length && numbers[i] < 0
  @Test
	public void testAtLeastOneNegativeValueInVector() {
		assertEquals(14, ex.maxAbsolute(vector1));
	}

  @Test
	public void testAtLeastOnePositiveValueInVector() {
		assertEquals(9, ex.maxAbsolute(vector2));
	}
}
