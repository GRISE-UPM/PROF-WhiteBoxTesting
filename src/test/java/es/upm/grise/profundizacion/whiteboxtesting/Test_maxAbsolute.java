package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class Test_maxAbsolute {

	Exercises e = new Exercises();
	
	// Hay 4 casos posibles
	// 1 - 2 - 3
	// 1 - 2 - 4 - 5 - ( 6 - 7 ) - 5 - 9   *Los pasos 6 y 7 se repiten (todos los nº son negativos)
	// 1 - 2 - 4 - 5 - ( 6 - 8 ) - 5 - 9   *Los pasos 6 y 8 se repiten (todos los nº son positivos)
	// 1 - 2 - 4 - 5 - ( 6 - 7 - 8 ) - 5 - 9  *En este caso hay tanto nº positivos como negativos
	
	// primer caso
	@Test
	public void longArraytest() {
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		assertEquals(-1, e.maxAbsolute(arr));
	}
	
	// segundo caso
	@Test
	public void smallArraytest() {
		int [] arr= {-1, -2, -3};
		assertEquals(3, e.maxAbsolute(arr));
	}
	
	// tercer caso
	@Test
	public void positiveMaxArraytest() {
		int [] arr= {1,100,2,3,4};
		assertEquals(100, e.maxAbsolute(arr));
	}
	
	// cuarto caso
	@Test
	public void negativeMaxArraytest() {
		int [] arr= {1,-100,2,-3,4};
		assertEquals(100, e.maxAbsolute(arr));
	}
	
}
