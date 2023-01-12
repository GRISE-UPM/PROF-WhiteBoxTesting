package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

	Exercises e = new Exercises();
	convertInt c = e.new convertInt();
	
	// Hay 5 casos
	// 1 - 2 - 3
	// 1 - 2 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14 - 15 
	// 1 - 2 - 4 - 5 - 6 - 7 - 8 - 9 - 10 - 11 - 12 - 13 - 14 - 16
	// 1 - 2 - 4 - 5 - 6 - 7 - 9 - 10 - 11 - 12 - 14 - 15
	// 1 - 2 - 4 - 5 - 6 - 7 - 9 - 10 - 11 - 12 - 14 - 16

	
	// primer caso - número muy largo
	@Test
	public void longStringTest() {
		char [] str = {'1','2','3','4','5','6','7'};
		assertThrows(Exception.class, () -> c.convert(str));
	}
	
	// segundo caso - número negativo que se pasa de los límites de -32768
	@Test
	public void minIntStringTest() {
		char [] str = {'-','3','2','7','6','9'};
		assertThrows(Exception.class, () -> c.convert(str));
	}
	
	// tercer caso - número negativo que no se pasa de los límites de -32768
	@Test
	public void negativeStringTest() throws Exception {
		char [] str = {'-','1','2','3','4'};
		assertEquals(-1234, c.convert(str));
	}
	
	// cuarto caso - número positivo que se pasa de los límites de 32767
	@Test
	public void maxIntStringTest() {
		char [] str = {'3','2','7','6','8'};
		assertThrows(Exception.class, () -> c.convert(str));
	}
	
	// quinto caso - número positivo que no se pasa de los límites de 32767
	@Test
	public void IntStringTest() throws Exception {
		char [] str = {'1','2','3','4'};
		assertEquals(1234, c.convert(str));
	}
	
	
}
