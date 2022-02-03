package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;

public class Test_convertInt {

	@Test(expected = Exception.class)
	public void longitudmayorque6() throws Exception {
		Exercises ex = new Exercises();
		char str[] = new char[7];
		ex.new convertInt().convert(str);
	}
	
	@Test(expected = Exception.class)
	public void numeromayorque32767() throws Exception {
		Exercises ex = new Exercises();
		char str[] = {'3','2','7','6','8'};
		ex.new convertInt().convert(str);	
	}
	
	@Test(expected = Exception.class)
	public void numeromenorquemenos32768() throws Exception {
		Exercises ex = new Exercises();
		char str[] = {'-','3','2','7','6','9'};
		ex.new convertInt().convert(str);	
	}
	
	@Test
	public void numeronegativo() throws Exception {
		Exercises ex = new Exercises();
		char str[] = {'-','3','2'};
		int ci = ex.new convertInt().convert(str);
		assertEquals(-32.0f,ci,0.0f);
	}
	
	@Test
	public void numeropositivo() throws Exception {
		Exercises ex = new Exercises();
		char str[] = {'3','2'};
		int ci = ex.new convertInt().convert(str);
		assertEquals(32.0f,ci,0.0f);
	}
	
	
}
