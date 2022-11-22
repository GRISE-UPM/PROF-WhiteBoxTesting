package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Test_convertInt {
	
	private Exercises exercises = new Exercises();
	private Exercises.convertInt convertInt = exercises.new convertInt();

	@Test
	public void testLenghtException() {		
		char[] str = {'1','2','3','4','5','6','7'};
		
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}
	
	@Test
	public void testConvertPositive() throws Exception {		
		char[] positive = {'1','2','3','4'};
		int numberPositive = 1234;
		
		assertEquals(convertInt.convert(positive), numberPositive);
	}	
	
	
	@Test
	public void testConvertNegative() throws Exception {		
		char[] negative = {'-','5','6','7','8'};
		int numberNegative = -5678;
		
		assertEquals(convertInt.convert(negative), numberNegative);
	}	
	
	@Test
	public void testOutOfRangeException() {
		char[] positive = {'3','2','7','6','8'};
		char[] negative = {'-','3','2','7','6','9'};
		
		assertThrows(Exception.class, () -> convertInt.convert(positive));
		assertThrows(Exception.class, () -> convertInt.convert(negative));
	}

}
