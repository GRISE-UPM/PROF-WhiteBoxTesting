package es.upm.grise.profundizacion.whiteboxtesting;

import static org.junit.Assert.*;

import org.junit.Test;

//OSCAR: La CC = 7, por lo que harían falta 7 tests. Bien es cierto que se puede conseguir
//una cobertura del 100% con menos tests al incluir más de una rama en cada camino indepen-
//diente

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
