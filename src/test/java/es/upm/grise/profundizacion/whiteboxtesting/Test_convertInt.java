package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {

	private final Exercises ex = new Exercises();
	private final Exercises.convertInt cInt = ex.new convertInt();
	
	@Test
	public void max_length() {
		char[] str = {'1', '2', '3', '4', '5', '6', '7'};
		assertThrows(Exception.class, () -> cInt.convert(str));
	}
	
	@Test
	public void ok_length_with_hyphen() throws Exception {
		char[] str = {'-', '1', '2', '3', '4', '5'};
		assertEquals(-12345, cInt.convert(str));
	}
	
	@Test
	public void ok_length_without_hyphen() throws Exception {
		char[] str = {'1', '2', '3', '4', '5','6'};
		assertEquals(23456, cInt.convert(str));
	}
	
	@Test
	public void max_overpassed() {
		char[] str = {'9', '8', '7', '6', '5'};
		assertThrows(Exception.class, () -> cInt.convert(str));
	}		
	

}
