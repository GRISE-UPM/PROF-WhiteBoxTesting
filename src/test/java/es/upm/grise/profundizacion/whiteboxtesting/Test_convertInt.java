package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {
	
	private static Exercises exercises;
	private static convertInt converter;
	private final char[] STRING = {'p','r','o','f','u','n','d', 'i','z','a','c','i','o','n'};
	private final char[] STRING2 = {'-','1','0'};
	private final char[] STRING3 = {'1','1','0'};
	private final char[] STRING4 = {'3','2','7','6','8'};
	private final char[] STRING5 = {'-','3','2','7','6', '9'};

		
		@BeforeAll
		static void init() {
			
			exercises = new Exercises();
			converter = exercises.new convertInt();
			
		}

		@Test
		public void lenghtGreaterThan6() {
			
			assertThrows(Exception.class, () ->
            converter.convert(STRING));
			
		}
		
		@Test
		public void lenghtLessThan6Negative() throws Exception {
			
			int expectedValue = -10;
			
			int value = converter.convert(STRING2);
			assertEquals(expectedValue, value);
			
		}

		@Test
		public void lenghtLessThan6Positive() throws Exception {
			
			int expectedValue = 110;
			
			int value = converter.convert(STRING3);
			assertEquals(expectedValue, value);
			
		}
		
		@Test
		public void lenghtLessThan6PositiveOutOfRange() {
			
			assertThrows(Exception.class, () ->
            converter.convert(STRING4));
			
		}
		
		@Test
		public void lenghtLessThan6NegativeOutOfRange() {
			
			assertThrows(Exception.class, () ->
            converter.convert(STRING5));
			
		}
}
