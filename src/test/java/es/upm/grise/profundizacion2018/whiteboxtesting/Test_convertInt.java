package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {


	/** Testing class within a class in java:
	 *  https://stackoverflow.com/questions/8261035/correct-way-to-unit-test-class-with-inner-class/8261096
	 *  
	 *  Example with code: https://www.geeksforgeeks.org/static-class-in-java/
	 *  
	 */

	// Case 1: length > 6
	Exercises testerConvertInt_1 = new Exercises();
	char[] test1array = {'h','e','l','l','o',' ','w','o','r','l','d'};
	@Test(expected = Exception.class)
	public void test1() throws Exception {
		assertEquals(0,testerConvertInt_1.new ConvertInt().convert(test1array));
	}

	// Testing second case, exceptions and str[0] = '-'
	
	/**
	 * Exceptions are not covered in eclemma with junit4 dude to the JaCoCo code coverage library used by eclemma: https://www.eclemma.org/faq.html
	 */

	// -32768 ------------- 0 ------------- 32768
	
	// Test cases:
	// Test 1: Number < -32768
	// Test 2: Number > 32768
	// Test 3: NUmber Between -32768 and 32768

	// Case 2: length < 6 With Exception -> number 115288

	Exercises testerConvertInt_2 = new Exercises();
	char[] test2array = {'h','e','l','l'};
	@Test(expected = Exception.class)
	public void test2() throws Exception {
		assertEquals(0,testerConvertInt_2.new ConvertInt().convert(test2array));
	}

	// Case 3: str[0] = '-' -> number -115288

	Exercises testerConvertInt_3 = new Exercises();
	char[] test3array = {'-','h','e','l','l'};
	@Test(expected = Exception.class)
	public void test3() throws Exception {
		assertEquals(0,testerConvertInt_3.new ConvertInt().convert(test3array));
	}

	// Case 4: str[0] = '-' -> number -1141

	Exercises testerConvertInt_4 = new Exercises();
	char[] test4array = {'-','h','e'};
	@Test
	public void test4() throws Exception {
		assertEquals(-1141,testerConvertInt_4.new ConvertInt().convert(test4array));
	}



}
