package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class Test_convertInt2_ej6 {
	
	private Exercises exercises = new Exercises();
	private Exercises.convertInt convertInt = exercises.new convertInt();

	/*
	 * Test the path 1 -> 2 -> 3
	 * 
	 * Conditions:
	 *  str.length > 6
	 */
	@Test
	public void test1() {
		char[] str = {'1','2','3','4','5','6','7'};
		
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}
	
	
	/*
	 * Test the path 1 -> 2 -> 4 -> 5 -> 6 -> 7 -> 9 -> 10 -> 14
	 * 
	 * Conditions:
	 *  str.length = 1
	 *  str[0] = '-'
	 */
	@Test
	public void test2() throws Exception {
		char[] str = {'-'};
		int number = 0;
		
		assertEquals(convertInt.convert(str), number);
	}
	
	
	/*
	 * Test the path 1 -> 2 -> 4 -> 5 -> 6 -> 7 -> 8 -> 7 -> 8 -> 9 -> 10 -> 13
	 * 
	 * Conditions:
	 *  3 <= str.length < 6
	 *  str[0] = '-'
	 */
	@Test
	public void test3() throws Exception {
		char[] str = {'-', '1', '2'};
		int number = -12;
		
		assertEquals(convertInt.convert(str), number);
	}
	
	
	/*
	 * Test the path 1 -> 2 -> 4 -> 5 -> 6 -> 7 > 9 -> 11a -> 12
	 * 
	 * Conditions:
	 *  str.length < 6
	 *  str[0] /= '-'
	 *  num > 36767
	 */
	@Test
	public void test4() {
		char[] str = {'3', '6', '7', '6', '8'};
		
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}
	
	
	/*
	 * Test the path 1 -> 2 -> 4 -> 5 -> 6 -> 7 > 9 -> 11a -> 11b -> 12
	 * 
	 * Conditions:
	 *  str.length < 6
	 *  str[0] = '-'
	 *  num < -32768
	 */
	@Test
	public void test5() {
		char[] str = {'-', '3', '6', '7', '6', '8'};
		
		assertThrows(Exception.class, () -> convertInt.convert(str));
	}
	
	
	/*
	 * Test the path 1 -> 2 -> 4 -> 5 -> 6 -> 7 > 9 -> 11a -> 11b -> 13
	 * 
	 * Conditions:
	 *  1 <= str.length < 6
	 *  -32768 <= num <= 36767
	 */
	@Test
	public void test6() throws Exception {
		char[] str = {'-', '3', '2', '7', '6', '8'};
		int number=-32768;
		
		assertEquals(convertInt.convert(str), number);
	}

}
