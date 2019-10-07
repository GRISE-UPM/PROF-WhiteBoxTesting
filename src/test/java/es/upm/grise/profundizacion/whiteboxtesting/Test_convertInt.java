package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {

	Exercises prueba = new Exercises();
	Exercises.convertInt convertir = prueba.new convertInt();
	
	@Test(expected = Exception.class)
	public void exception_length() throws Exception {
		char [] chars = {'1','2','3','4','5','6','7','8','9'};
		convertir.convert(chars); 
	}

	@Test(expected = Exception.class)
	public void negative_exception() throws Exception {
		char [] chars = {'-','1','2','3','4','5'};
		convertir.convert(chars); 
	}

	@Test(expected = Exception.class)
	public void positive_exception() throws Exception {
		char [] chars = {'1','2','3','4','5','6'};
		convertir.convert(chars); 
	}
	
	@Test
	public void no_exception() throws Exception {
		char [] chars = {'1','2'};
		convertir.convert(chars);
		assertEquals(convertir.convert(chars),540,0);
	}
}
