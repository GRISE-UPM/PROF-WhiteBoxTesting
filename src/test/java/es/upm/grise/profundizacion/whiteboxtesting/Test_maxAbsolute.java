package es.upm.grise.profundizacion.whiteboxtesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Test_maxAbsolute {

	private Exercises e = new Exercises();
	
	// Note:
	// if (numbers[i] < 0 ) max_value = Math.max(max_value,Math.abs(numbers[i]));
	// else                 max_value = Math.max(max_value, numbers[i]);
	// can be simplified as max_value = Math.max(max_value, Math.abs(numbers[i]));
	// removing an if-else. But it's probably written 'as is' intentionally, so
	// I'll leave it 'as is' too :D
	
	@Test
	public void onNumbersLengthGreaterThan5() {
		assertEquals(-1, e.maxAbsolute(new int[]{ 1,2,3,4,5,6,7,8 }),0.01);
	}
	
	@Test
	public void onNoNumbers() {
		/* doesn't enter for loop */
		assertEquals(0, e.maxAbsolute(new int[]{ }),0.01);
	}
	
	@Test
	public void onNumbersWithMaxNonNegativeValue() {
		assertEquals(34, e.maxAbsolute(new int[]{ 1,2,34,-25,5 }),0.01);
	}
	
	@Test
	public void onNumbersWithMaxNegativeValue() {
		assertEquals(30, e.maxAbsolute(new int[]{ 1,2,-30,4,5 }),0.01);
	}

}
  
