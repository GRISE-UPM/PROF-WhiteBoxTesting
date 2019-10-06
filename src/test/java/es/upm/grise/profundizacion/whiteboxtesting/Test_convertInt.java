package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Test_convertInt {
	
	Exercises.convertInt convertInt;
	
	@Before
	public void setUp() {	
		Exercises exercises = new Exercises();
		convertInt = exercises.new convertInt();
	}
	
	@Test (expected = Exception.class)
	public void testStrLengthGrT6() throws Exception {
		convertInt.convert(new char[] {'a','a','a','a','a','a','a'});
	}
	
	@Test
	public void testStrNoMinusSymbol() throws Exception {
		assertEquals(16247, convertInt.convert(new char[] {'\t','A','A','a'}));
	}
		
	@Test
	public void testStrMinusSymbol() throws Exception {
		assertEquals(-16247, convertInt.convert(new char[] {'-','\t','A','A','a'}));
	}
	
	@Test (expected = Exception.class)
	public void testNumberOutOfBoundsPossitive() throws Exception {
		convertInt.convert(new char[] {'0','z','A','a'}); // 60947
	}
	
	@Test (expected = Exception.class)
	public void testNumberOutOfBoundsNegative() throws Exception {
		convertInt.convert(new char[] {'-','0','z','A','a'}); // - 60947
	}
	

}
