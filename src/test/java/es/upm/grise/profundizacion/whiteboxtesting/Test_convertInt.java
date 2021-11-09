package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.*;

public class Test_convertInt {

private static Exercises exer;
private static Exercises.convertInt convInt;
	
	public Test_convertInt() {
		exer = new Exercises();
		convInt = exer.new convertInt();
	}
	
	@Test
	@DisplayName("Test convertInt: input too long")
	public void testInputTooLong() {
		char[] aux = new char[7];
		
		assertThrows(Exception.class, () -> convInt.convert(aux));
	}
	
	@Test
	@DisplayName("Test convertInt: first character is '-'")
	public void testFirstCharacter() {
		char[] aux = {'-','1','2','3','4','5'};
		
		try {
			assertEquals(-12345, convInt.convert(aux));
		} catch (Exception e) {
			fail();
		}
	}
	
	@Test
	@DisplayName("Test convertInt: number bigger than 32767")
	public void testNumberIs32767() {
		char[] aux = {'3','2','7','6','8'};
		
		
		assertThrows(Exception.class, () -> convInt.convert(aux));
	}
	
	@Test
	@DisplayName("Test convertInt: number is smaller than -32768")
	public void testNumberIsNegative32768() {
		char[] aux = {'-','3','2','7','6','9'};
		
		
		assertThrows(Exception.class, () -> convInt.convert(aux));
	}
}
