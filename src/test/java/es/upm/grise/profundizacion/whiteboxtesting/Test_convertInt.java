package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

import es.upm.grise.profundizacion.whiteboxtesting.Exercises.convertInt;


public class Test_convertInt {
	
	private Exercises e = new Exercises();
	private convertInt obj = e.new convertInt();

	@Test
	public void MasDe6Elementos_ThrowException() {
		
		char[] arr = {'1','1','1','1','1','1','1'};
		assertThrows(Exception.class, ()->obj.convert(arr));
		
	}
	
	//Suponiendo que es un requisito. Focus on behavior
	@Test
	public void noChars_PorDefecto_Exception() throws Exception {
		
		char[] arr = {};
		assertThrows(Exception.class, ()->obj.convert(arr));
		
	}
	
	@Test
	public void noMasDe4Elementos_ThrowException() {
		
		char[] arr = {'1','1','1','1','1','1','1','1'};
		assertThrows(Exception.class, ()->obj.convert(arr));
		
	}
	
	@Test
	public void fueraDeRangoPositivo_ThrowException() {
		
		char[] arr = {'3','2','7','6','8'};
		assertThrows(Exception.class, ()->obj.convert(arr));
		
	}

	@Test
	public void fueraDeRangoNegativo_ThrowException() {
		
		char[] arr = {'-','3','2','7','6','9'};
		assertThrows(Exception.class, ()->obj.convert(arr));
		
	}
	
	@Test
	public void conviertePositivo() throws Exception {
		
		char[] arr = {'1','2'};
		assertEquals(12, obj.convert(arr));
		
	}
	
	@Test
	public void convierteNegativo() throws Exception {
		
		char[] arr = {'-','1','2'};
		assertEquals(-12, obj.convert(arr));
		
	}
	
}
