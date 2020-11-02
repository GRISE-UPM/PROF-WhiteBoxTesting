package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;


public class Test_convertInt {
	
	convertInt c1;
	
	@Before
	public void conf() {
		Exercises e1 = new Exercises();
		c1= e1.new convertInt();
	}
	
	@Test
	public void testTooLargeArray() throws Exception{
		char[] chars = {'1','2','5','3','2','1','6'};
		assertThrows(Exception.class, ()->c1.convert(chars));
	}
	
	@Test
	public void testCorrectArray() throws Exception{
		char[] chars = {'1','2','1','2'};
		assertEquals(1212, c1.convert(chars));
	}
	
	@Test
	public void testNumberTooBig() throws Exception{
		char[] chars = {'4','4','4','4','4'};
		assertThrows(Exception.class, ()->c1.convert(chars));
	}
	
	@Test
	public void testNumberTooSmall() throws Exception{
		char[] chars = {'-','4','4','4','4','4'};
		assertThrows(Exception.class, ()->c1.convert(chars));
	}
}
