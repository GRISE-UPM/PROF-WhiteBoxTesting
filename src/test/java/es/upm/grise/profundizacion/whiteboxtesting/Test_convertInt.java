package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

	Exercises e = new Exercises();
	convertInt c = e.new convertInt();
	
	@Test
	public void longStringTest() {
		char [] str = {'1','2','3','4','5','6','7'};
		assertThrows(Exception.class, () -> c.convert(str));
	}
	
	@Test
	public void positiveStringTest() throws Exception {
		char [] str = {'1','2','3','4'};
		assertEquals(1234, c.convert(str));
	}
	
	@Test
	public void negativeStringTest() throws Exception {
		char [] str = {'-','1','2','3','4'};
		assertEquals(-1234, c.convert(str));
	}
	
	@Test
	public void maxIntStringTest() {
		char [] str = {'3','2','7','6','8'};
		assertThrows(Exception.class, () -> c.convert(str));
	}
	
	@Test
	public void minIntStringTest() {
		char [] str = {'-','3','2','7','6','9'};
		assertThrows(Exception.class, () -> c.convert(str));
	}
	
}
