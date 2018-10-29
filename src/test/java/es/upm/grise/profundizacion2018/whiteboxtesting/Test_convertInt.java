package es.upm.grise.profundizacion2018.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

public class Test_convertInt {

	private Exercises exe = new Exercises();
	private Exercises.ConvertInt c = exe.new ConvertInt();
	
	@Test 
	public void numeroPositivoSinExcepcion() throws Exception {
		char[] cadena = {0,0,5,5,5};
		assertEquals(c.convert(cadena), 555);
	}

	@Test
	public void numeroNegativoSinExcepcion() throws Exception {
		char[] cadena = {'-',0,5,5,5};
		assertEquals(c.convert(cadena), -555);
	}
	
	@Test (expected = Exception.class)
	public void excepcionCadenaDemasiadoGrandeLanzaExcepcion() throws Exception {
		char[] cadena = {5,5,5,5,5,5,5};
		c.convert(cadena);
	}
	
	@Test (expected = Exception.class)
	public void numeroDemasiadoGrandeLanzaExcepcion() throws Exception {
		char[] cadena = {5,5,5,5,5};
		c.convert(cadena);
	}
	
	@Test (expected = Exception.class)
	public void numeroDemasiadoPequenoLanzaExcepcion() throws Exception {
		char[] cadena = {'-',5,5,5,5,5};
		c.convert(cadena);
	}
}
