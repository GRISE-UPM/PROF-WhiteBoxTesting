package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_convertInt {
	
	Exercises.convertInt convertInt;
	
	// CC = 7
	
	@Before
	public void setUp() {	
		Exercises exercises = new Exercises();
		convertInt = exercises.new convertInt();
	}
	
	@Test (expected = Exception.class)
	public void testStrLengthGrT6() throws Exception {
		convertInt.convert(new char[] {'1','1','1','1','1','1','1'});
	}
	
	@Test
	public void testStrPossitiveSymbol() throws Exception {
		assertEquals(539, convertInt.convert(new char[] {'1','1'}));
	}
	
		
	@Test
	public void testStrNegativeSymbol() throws Exception {
		assertEquals(-539, convertInt.convert(new char[] {'-','1','1'}));
	}
	
	@Test (expected = Exception.class)
	public void testNumberGraterThanPossitive() throws Exception {
		convertInt.convert(new char[] {'0','1','1','1'}); // 60947
	}
	
	@Test (expected = Exception.class)
	public void testNumberLessThanNegative() throws Exception {
		convertInt.convert(new char[] {'-','1','1','1','1'}); // - 60947
	}
	

}
