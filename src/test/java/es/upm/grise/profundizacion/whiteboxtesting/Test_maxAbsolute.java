package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Test_maxAbsolute {

	Exercises testClass = new Exercises();
	@Test
	public void test() {
		int[] testValue = new int[]{2, 3, 4, 5, 6, 7};
		Assertions.assertEquals(-1,testClass.maxAbsolute(testValue));
	}

	@Test
	public void testPositive() {
		int[] testValue = new int[]{2, 3, 6, 7};
		Assertions.assertEquals(7,testClass.maxAbsolute(testValue));
	}

	@Test
	public void testNegative() {
		int[] testValue = new int[]{-4, -5, 6, 7};
		Assertions.assertEquals(7,testClass.maxAbsolute(testValue));
	}

}
