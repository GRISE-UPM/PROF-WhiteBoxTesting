package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class Test_maxAbsolute {

	private static Exercises exer;
	
	public Test_maxAbsolute() {
		exer = new Exercises();
	}
	
	@Test
	@DisplayName("Test maxAbsolute: lenght > 5")
	public void testLenghtBigger5() {
		int[] aux = new int[6];
		assertEquals(-1, exer.maxAbsolute(aux));
	}
	
	@Test
	@DisplayName("Test maxAbsolute: lenght <= 0")
	public void testLenghtEqual0() {
		int[] aux = new int[0];
		assertEquals(0, exer.maxAbsolute(aux));
	}
	
	@Test
	@DisplayName("Test maxAbsolute: 5 > lenght > 0 with value < 0")
	public void testLenght() {
		int[] aux = {-1};
		assertEquals(1, exer.maxAbsolute(aux));
	}
	
	@Test
	@DisplayName("Test maxAbsolute: 5 > lenght > 0 with diverse values")
	public void test() {
		int[] aux = {-1, 0, 1, 2, 3};
		assertEquals(3, exer.maxAbsolute(aux));
	}
}
