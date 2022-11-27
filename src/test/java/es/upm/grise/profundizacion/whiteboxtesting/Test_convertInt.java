package es.upm.grise.profundizacion.whiteboxtesting;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

	/*
	 *Caso 1: str.length > 6
	 *Caso 2: str.length <= 6 y suma > 32767
	 *Caso 3: str.length <= 6 y suma < -32768
	 *Caso 4: str.length <= 6 y -32768<=suma<=32767 Con str[0]!='-'
	 *Caso 5: str.length <= 6 y -32768<=suma<=32767 Con str[0]=='-'
	 */
	private convertInt c;
	
	@Test
	public void array_longer_than_6_test() throws Exception {
		Exercises e = new Exercises();
		this.c = e.new convertInt();
		char [] longArray = {'a','b','c','d','e','f','g','h','i'};
		assertThrows(Exception.class,()->this.c.convert(longArray));
	}
	
	@Test
	public void array_adds_more_than_max_test() {
		Exercises e = new Exercises();
		this.c = e.new convertInt();
		char [] array = {'P','L','A','Y','A'};
		assertThrows(Exception.class,()->this.c.convert(array));
	}
	
	@Test
	public void array_adds_less_than_the_min_test() {
		Exercises e = new Exercises();
		this.c = e.new convertInt();
		char [] array = {'-','P','L','A','Y','A'};
		assertThrows(Exception.class,()->this.c.convert(array));
	}
	
	@Test
	public void array_is_in_bounds_test() throws Exception {
		Exercises e = new Exercises();
		this.c = e.new convertInt();
		char [] array = {'H','O','L','A'};
		assertEquals(27397,this.c.convert(array));
	}
	
	@Test
	public void array_is_in_bounds_negative_test() throws Exception {
		Exercises e = new Exercises();
		this.c = e.new convertInt();
		char [] array = {'-','H','O','L','A'};
		assertEquals(-27397,this.c.convert(array));
	}
	

}
