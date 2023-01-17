package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {
	Exercises e = new Exercises();
	convertInt ci = e.new convertInt();
	
	@Test
	public void more_than_5_characters() throws Exception{
		char[] c = {'4', '6', '7', '2', '1', '9', '2'};
		assertThrows(Exception.class, () -> ci.convert(c));
	}
	
	@Test
	public void out_of_bound_positive_number() throws Exception{
		char[] c1 = {'3', '2', '7', '6', '8'};
		assertThrows(Exception.class, () -> ci.convert(c1));
	}
	
	@Test
	public void out_of_bound_negative_number() throws Exception{
		char[] c1 = {'-', '3', '2', '7', '6', '9'};
		assertThrows(Exception.class, () -> ci.convert(c1));
	}
	
	@Test
	public void positive_number() throws Exception{
		char[] c = {'3', '2', '7', '0', '0'};
		assertEquals(32700, ci.convert(c));
	}
	
	@Test
	public void negative_number() throws Exception{
		char[] c = {'-', '3', '2', '7', '0', '0'};
		assertEquals(-32700, ci.convert(c));
	}

}
