package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_maxAbsolute {

	private Exercises exer = new Exercises();
	
	@Test
	public void moreThanFiveNumbers() {
		int[] enteros = {10,20,30,40,50,60,71,80,90,91};
		assertEquals(exer.max_absolute(enteros), -1);
	}
	
	@Test
	public void prueba1(){
		int[] enteros = {-1,-2,-3,-4};
		assertEquals(exer.max_absolute(enteros), 4);
	}
	
	@Test
	public void prueba3(){
		int[] enteros = {-4, 5};
		assertEquals(exer.max_absolute(enteros), 5);
	}
	
	/*@Test
	public void prueba2(){
		int[] enteros = {0, 0, 0};
		assertEquals(exer.max_absolute(enteros), 0);
	}*/

}
